package com.huawei.location.vdr;

import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import com.huawei.location.vdr.data.ephemeris.net.EphemerisResponse;
import com.huawei.location.vdr.listener.IVdrLocationListener;
import com.huawei.riemann.gnsslocation.api.vdr.VdrLocationClient;
import com.huawei.riemann.gnsslocation.core.bean.DeviceInfo;
import com.huawei.riemann.gnsslocation.core.bean.eph.Ephemeris;
import com.huawei.riemann.gnsslocation.core.bean.obs.Pvt;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ComposeScrollCaptureCallback;
import o.VectorResources_androidKt;
import o.WindowRecomposerPolicycreateAndInstallWindowRecomposer1;
import o.WrappedCompositionsetContent1211;
import o.accessgetNodep;
import o.accessonScrollCaptureImageRequest;
import o.drawDebugBackground;
import o.getClipEntry;
import o.isAutomaticGeofenceRequestsEnabled;
import o.loadVectorResourceInnerdefault;
import o.onCreateActionMode;
import o.onScrollCaptureEnd;
import o.onScrollCaptureImageRequest;
import o.onScrollCaptureStart;
import o.onSessionEnded;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
public class VdrManager {
    private static final String EPH_THREAD_NAME = "Loc-Vdr-EphUpdate";
    private static final long EPH_UPDATE_TIME = 30;
    private static final long SYNC_LOCATION_UPDATE_TIME = 200;
    private static final String TAG = "VdrManager";
    private static final byte[] VDR_SYNC_LOCK = new byte[0];
    private static volatile VdrManager instance;
    private Ephemeris currentEphemeris;
    private long ephExpiredTime = 0;
    private onScrollCaptureImageRequest ephProvider;
    private final AtomicBoolean isVdrStart;
    private volatile long lastSyncTime;
    private final AtomicBoolean updateEphemeris;
    private VectorResources_androidKt vdrDataManager;
    private VdrLocationClient vdrLocationClient;

    private void processVdrData(loadVectorResourceInnerdefault loadvectorresourceinnerdefault) {
        synchronized (this) {
            if (accessonScrollCaptureImageRequest.write().read()) {
                WrappedCompositionsetContent1211.read(TAG, "vdr listener is null");
                return;
            }
            if (this.vdrLocationClient == null) {
                WrappedCompositionsetContent1211.read(TAG, "vdrLocationClient init failed");
                handlerNativeLocationToVdr();
                return;
            }
            if (loadvectorresourceinnerdefault == null) {
                WrappedCompositionsetContent1211.read(TAG, "vdr data is null");
                handlerNativeLocationToVdr();
                return;
            }
            if (!checkAndUpdateEphemeris()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "checkAndUpdateEphemeris failed,stop algo");
                if (this.isVdrStart.get()) {
                    this.vdrLocationClient.stopLocation();
                }
                this.isVdrStart.set(false);
                handlerNativeLocationToVdr();
                return;
            }
            if (!this.isVdrStart.get()) {
                if (!checkFirstRequestDataIsValid(loadvectorresourceinnerdefault)) {
                    WrappedCompositionsetContent1211.read();
                    handlerNativeLocationToVdr();
                    return;
                }
                VdrLocationClient vdrLocationClient = this.vdrLocationClient;
                DeviceInfo.Builder builderADeviceInfo = DeviceInfo.Builder.aDeviceInfo();
                String str = (String) onSessionEnded.IconCompatParcelizer.get(SystemPropertiesUtil.get("ro.board.platform", ""));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                DeviceInfo.Builder builderWithSdkLevel = builderADeviceInfo.withChipName(str).withManufacturer(Build.MANUFACTURER).withSdkLevel(Build.VERSION.SDK_INT);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrAlgoUtil", "DeviceInfo:" + new Gson().toJson(builderWithSdkLevel));
                int iStartLocation = vdrLocationClient.startLocation(builderWithSdkLevel.build());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "processGnssLocation startLocation status:" + iStartLocation);
                AtomicBoolean atomicBoolean = this.isVdrStart;
                if (iStartLocation != 0) {
                    atomicBoolean.set(false);
                    handlerNativeLocationToVdr();
                    return;
                }
                atomicBoolean.set(true);
            }
            handlerVdrLocation(loadvectorresourceinnerdefault);
        }
    }

    public boolean isVdrIntervalStart() {
        return this.vdrDataManager != null;
    }

    public void onVdrDataReceived(loadVectorResourceInnerdefault loadvectorresourceinnerdefault) {
        synchronized (this) {
            processVdrData(loadvectorresourceinnerdefault);
        }
    }

    public void registerVdrLocationLis(IVdrLocationListener iVdrLocationListener) {
        synchronized (this) {
            accessonScrollCaptureImageRequest.write().write(iVdrLocationListener);
            if (!isVdrIntervalStart()) {
                loadVdrFile();
            }
        }
    }

    public void syncLocation(Location location) {
        synchronized (this) {
            location.getElapsedRealtimeNanos();
            WrappedCompositionsetContent1211.read();
            if (location.getElapsedRealtimeNanos() - this.lastSyncTime < SYNC_LOCATION_UPDATE_TIME) {
                return;
            }
            VectorResources_androidKt vectorResources_androidKt = this.vdrDataManager;
            if (vectorResources_androidKt != null) {
                vectorResources_androidKt.write = location;
                this.lastSyncTime = location.getElapsedRealtimeNanos();
            }
        }
    }

    public void unRegisterVdrLocationLis(String str) {
        synchronized (this) {
            accessonScrollCaptureImageRequest.write().RemoteActionCompatParcelizer(str);
            if (accessonScrollCaptureImageRequest.write().read()) {
                clearVdr();
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "stop vdr manager");
            }
        }
    }

    private boolean checkAndUpdateEphemeris() {
        long j = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 1).RemoteActionCompatParcelizer;
        updateEphemeris(j);
        if (this.updateEphemeris.get() && this.currentEphemeris != null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "updateEphemeris GpsEphemeris:" + new Gson().toJson(this.currentEphemeris.getGpsEphemeris()));
            this.vdrLocationClient.updateEphemeris(this.currentEphemeris);
            this.updateEphemeris.set(false);
        }
        return j < this.ephExpiredTime;
    }

    private void initVdrDataManager() {
        VectorResources_androidKt vectorResources_androidKt = new VectorResources_androidKt();
        this.vdrDataManager = vectorResources_androidKt;
        synchronized (vectorResources_androidKt) {
            Handler handler = vectorResources_androidKt.MediaDescriptionCompat;
            if (handler == null) {
                WrappedCompositionsetContent1211.read("VdrDataManager", "handler is null, setVdrDataListener failed.");
            } else {
                vectorResources_androidKt.RemoteActionCompatParcelizer = this;
                handler.removeCallbacksAndMessages(null);
                Handler handler2 = vectorResources_androidKt.MediaDescriptionCompat;
                handler2.sendMessage(handler2.obtainMessage(10));
            }
        }
        onScrollCaptureImageRequest onscrollcaptureimagerequest = new onScrollCaptureImageRequest();
        onscrollcaptureimagerequest.RemoteActionCompatParcelizer = new accessgetNodep();
        this.ephProvider = onscrollcaptureimagerequest;
    }

    private void loadVdrFile() {
        drawDebugBackground drawdebugbackground = new drawDebugBackground();
        drawdebugbackground.RemoteActionCompatParcelizer = this;
        onCreateActionMode.write.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(4, drawdebugbackground));
    }

    private void startVdrAlgo() {
        Ephemeris ephemerisSerializer;
        String string;
        String str;
        VdrLocationClient vdrLocationClient = new VdrLocationClient(placeAtf8xVGno.read(), onScrollCaptureStart.RemoteActionCompatParcelizer);
        this.vdrLocationClient = vdrLocationClient;
        DeviceInfo.Builder builderADeviceInfo = DeviceInfo.Builder.aDeviceInfo();
        String str2 = "";
        String str3 = (String) onSessionEnded.IconCompatParcelizer.get(SystemPropertiesUtil.get("ro.board.platform", ""));
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        DeviceInfo.Builder builderWithSdkLevel = builderADeviceInfo.withChipName(str3).withManufacturer(Build.MANUFACTURER).withSdkLevel(Build.VERSION.SDK_INT);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrAlgoUtil", "DeviceInfo:" + new Gson().toJson(builderWithSdkLevel));
        int iStartLocation = vdrLocationClient.startLocation(builderWithSdkLevel.build());
        this.isVdrStart.set(iStartLocation == 0);
        onScrollCaptureImageRequest onscrollcaptureimagerequest = this.ephProvider;
        onscrollcaptureimagerequest.getClass();
        WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer1 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 1);
        StringBuilder sb = new StringBuilder("gpsTime = ");
        long j = windowRecomposerPolicycreateAndInstallWindowRecomposer1.RemoteActionCompatParcelizer;
        sb.append(j);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", sb.toString());
        if (j <= onScrollCaptureImageRequest.RemoteActionCompatParcelizer()) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "try to get local Ephemeris here");
            ephemerisSerializer = null;
            try {
                FileInputStream fileInputStreamOpenFileInput = placeAtf8xVGno.read().openFileInput("ephData");
                try {
                    if (fileInputStreamOpenFileInput.available() < 0 || fileInputStreamOpenFileInput.available() > 20971520) {
                        WrappedCompositionsetContent1211.read("FileUtil", "FileInputStream length is illegal");
                        string = null;
                    } else {
                        byte[] bArr = new byte[Fields.RotationZ];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i = fileInputStreamOpenFileInput.read(bArr);
                            if (i <= 0) {
                                break;
                            } else {
                                sb2.append(new String(bArr, 0, i, StandardCharsets.UTF_8));
                            }
                        }
                        string = sb2.toString();
                    }
                    fileInputStreamOpenFileInput.close();
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
                WrappedCompositionsetContent1211.read("FileUtil", "read from file failed");
                string = null;
            }
            if (string == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "read Ephemeris From Json is null");
            } else {
                String[] strArrSplit = string.split("\n");
                StringBuffer stringBuffer = new StringBuffer();
                if (strArrSplit.length == 1) {
                    if (TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(string)) {
                        WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                    } else {
                        try {
                            str2 = AesGcmKS.read("LOCATION_LITE_SDK", string);
                        } catch (Exception unused2) {
                            WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS decrypt failed");
                        }
                    }
                    stringBuffer.append(str2);
                } else {
                    for (String str4 : strArrSplit) {
                        if (TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(str4)) {
                            WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                        } else {
                            try {
                                str = AesGcmKS.read("LOCATION_LITE_SDK", str4);
                            } catch (Exception unused3) {
                                WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS decrypt failed");
                                str = "";
                            }
                            stringBuffer.append(str);
                        }
                        str = "";
                        stringBuffer.append(str);
                    }
                }
                try {
                    ephemerisSerializer = onscrollcaptureimagerequest.MediaBrowserCompatMediaItem((EphemerisResponse) new Gson().fromJson(stringBuffer.toString().trim(), EphemerisResponse.class));
                } catch (JsonSyntaxException unused4) {
                    WrappedCompositionsetContent1211.read("EphProvider", "json syntax error");
                }
            }
        } else {
            ephemerisSerializer = onscrollcaptureimagerequest.serializer();
        }
        if (ephemerisSerializer != null) {
            this.ephProvider.getClass();
            this.ephExpiredTime = onScrollCaptureImageRequest.RemoteActionCompatParcelizer();
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "updateEphemeris GpsEphemeris:" + new Gson().toJson(ephemerisSerializer.getGpsEphemeris()));
            this.vdrLocationClient.updateEphemeris(ephemerisSerializer);
        }
    }

    public void handleLoadResult(boolean z) {
        synchronized (this) {
            if (z) {
                initVdrDataManager();
                startVdrAlgo();
            }
        }
    }

    private boolean checkFirstRequestDataIsValid(loadVectorResourceInnerdefault loadvectorresourceinnerdefault) {
        return (loadvectorresourceinnerdefault.write == null || loadvectorresourceinnerdefault.RemoteActionCompatParcelizer == null || loadvectorresourceinnerdefault.read == null) ? false : true;
    }

    public static VdrManager getInstance() {
        if (instance == null) {
            synchronized (VDR_SYNC_LOCK) {
                if (instance == null) {
                    instance = new VdrManager();
                }
            }
        }
        return instance;
    }

    private void handlerNativeLocationToVdr() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "vdr process fail, return native location here");
        VectorResources_androidKt vectorResources_androidKt = this.vdrDataManager;
        if (vectorResources_androidKt == null || vectorResources_androidKt.write == null) {
            return;
        }
        accessonScrollCaptureImageRequest.write().RemoteActionCompatParcelizer(this.vdrDataManager.write);
    }

    private void updateEphemeris(long j) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "currentGpsTime is : ", ", ephExpiredTime is : ");
        sbM.append(this.ephExpiredTime);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, sbM.toString());
        if (j + EPH_UPDATE_TIME < this.ephExpiredTime) {
            return;
        }
        onCreateActionMode.write.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(3, this));
    }

    private VdrManager() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "VdrManager init");
        this.isVdrStart = new AtomicBoolean(false);
        this.updateEphemeris = new AtomicBoolean(false);
    }

    private void clearVdr() {
        VectorResources_androidKt vectorResources_androidKt = this.vdrDataManager;
        if (vectorResources_androidKt != null) {
            synchronized (vectorResources_androidKt) {
                onScrollCaptureEnd onscrollcaptureend = vectorResources_androidKt.serializer;
                if (onscrollcaptureend == null || vectorResources_androidKt.read == null) {
                    WrappedCompositionsetContent1211.read("VdrDataManager", "init fail, try to call start method");
                } else {
                    LocationManager locationManager = onscrollcaptureend.IconCompatParcelizer;
                    if (locationManager != null) {
                        locationManager.unregisterGnssMeasurementsCallback(onscrollcaptureend.serializer);
                    }
                    onscrollcaptureend.RemoteActionCompatParcelizer = null;
                    HandlerThread handlerThread = onscrollcaptureend.MediaSessionCompatQueueItem;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    onscrollcaptureend.write = null;
                    ComposeScrollCaptureCallback composeScrollCaptureCallback = vectorResources_androidKt.read;
                    SensorManager sensorManager = composeScrollCaptureCallback.write;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(composeScrollCaptureCallback.MediaBrowserCompatMediaItem);
                    }
                    HandlerThread handlerThread2 = composeScrollCaptureCallback.MediaSessionCompatQueueItem;
                    if (handlerThread2 != null) {
                        handlerThread2.quitSafely();
                    }
                    composeScrollCaptureCallback.read = null;
                    vectorResources_androidKt.MediaDescriptionCompat.removeCallbacksAndMessages(null);
                    vectorResources_androidKt.MediaDescriptionCompat.getLooper().quitSafely();
                    vectorResources_androidKt.MediaDescriptionCompat = null;
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrDataManager", "stop vdr data");
                }
            }
            this.vdrDataManager = null;
        }
        VdrLocationClient vdrLocationClient = this.vdrLocationClient;
        if (vdrLocationClient != null) {
            vdrLocationClient.stopLocation();
            this.vdrLocationClient = null;
        }
    }

    private void handlerVdrLocation(loadVectorResourceInnerdefault loadvectorresourceinnerdefault) {
        Location location = loadvectorresourceinnerdefault.write;
        Pvt pvtBuild = location != null ? Pvt.Builder.aPvt().withAccuracy(location.getAccuracy()).withAltitude(location.getAltitude()).withLatitude(location.getLatitude()).withLongitude(location.getLongitude()).withBearing(location.getBearing()).withSpeed(location.getSpeed()).withTime(location.getTime()).build() : null;
        WrappedCompositionsetContent1211.read();
        Pvt pvtProcess = this.vdrLocationClient.process(pvtBuild, loadvectorresourceinnerdefault.RemoteActionCompatParcelizer, loadvectorresourceinnerdefault.read, null);
        if (pvtProcess == null || pvtProcess.getLatitude() == 0.0d || pvtProcess.getLongitude() == 0.0d) {
            handlerNativeLocationToVdr();
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "process vdr end, errorCode is: " + pvtProcess.getErrCode());
        accessonScrollCaptureImageRequest accessonscrollcaptureimagerequestWrite = accessonScrollCaptureImageRequest.write();
        if (location == null) {
            location = new Location("GPS");
        }
        location.setTime(System.currentTimeMillis());
        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        location.setLongitude(pvtProcess.getLongitude());
        location.setLatitude(pvtProcess.getLatitude());
        location.setAltitude(pvtProcess.getAltitude());
        location.setAccuracy(pvtProcess.getAccuracy());
        location.setBearing(pvtProcess.getBearing());
        location.setSpeed(pvtProcess.getSpeed());
        Bundle extras = location.getExtras();
        getClipEntry getclipentry = new getClipEntry(extras, 1);
        if (pvtProcess.getErrCode() == 1) {
            if (getclipentry.IconCompatParcelizer("LocationSource")) {
                getclipentry.write(extras.getInt("LocationSource") | 2);
            } else {
                getclipentry.write(2);
            }
        }
        location.setExtras(getclipentry.serializer);
        accessonscrollcaptureimagerequestWrite.RemoteActionCompatParcelizer(location);
    }
}
