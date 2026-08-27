package com.huawei.location.gwi;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.huawei.location.gwi.listener.CarVdrListenerManager;
import com.huawei.location.gwi.listener.ICarGwiSoLoadListener;
import com.huawei.location.gwi.listener.ICarVdrInitListener;
import com.huawei.location.gwi.listener.ICarVdrLocationListener;
import com.huawei.location.gwi.util.CarGwiUtil;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.bean.RotationAngle;
import com.huawei.riemann.location.common.bean.VdrInputData;
import com.huawei.riemann.location.common.utils.Constant;
import com.huawei.riemann.location.gwivdr.LocationClient;
import o.WindowInfoImplCompanion;
import o.WrappedCompositionsetContent1211;
import o.getClipEntry;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes4.dex */
public class GwiLocationManager {
    private static final int GWI_LOCATION_TIME = 1000;
    private static final long LOCATION_VALID_TIME_THRESHOLD = 1200;
    private static final int MSG_GET_GWI_RESULT = 1;
    private static final String TAG = "GwiLocationManager";
    private static final byte[] VDR_SYNC_LOCK = new byte[0];
    private static volatile GwiLocationManager instance;
    private volatile boolean accuracyFilterEnable = false;
    private volatile float accuracyThreshold = 0.0f;
    private Handler handler;
    private HandlerThread handlerThread;
    private ICarVdrInitListener iCarVdrInitListener;
    private volatile Location inputLocation;
    private volatile long inputLocationTime;
    private LocationClient locationClient;
    private RotationAngle rotationAngle;

    private Location getGwiLocation() {
        try {
            LocationClient locationClient = this.locationClient;
            if (locationClient == null) {
                return null;
            }
            return getVdrResult(locationClient.getVdrResult());
        } catch (Exception e) {
            WrappedCompositionsetContent1211.read(TAG, "getGwiLocation exception: " + e.getMessage());
            return null;
        }
    }

    private boolean isGwiStart() {
        return this.locationClient != null;
    }

    public void addVdrLocationListener(ICarVdrLocationListener iCarVdrLocationListener) {
        synchronized (this) {
            CarVdrListenerManager.getInstance().addVdrLocationListener(iCarVdrLocationListener);
        }
    }

    public void enableAccuracyFilter(float f) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "enableAccuracyFilter: " + f);
            this.accuracyFilterEnable = true;
            this.accuracyThreshold = f;
        }
    }

    public void removeVdrLocationListener(ICarVdrLocationListener iCarVdrLocationListener) {
        synchronized (this) {
            CarVdrListenerManager.getInstance().removeVdrLocationListener(iCarVdrLocationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealGwiLocation() {
        try {
            Handler handler = this.handler;
            if (handler == null) {
                WrappedCompositionsetContent1211.read(TAG, "handler is null, drop gnss data here.");
                return;
            }
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.handler;
            handler2.sendMessageDelayed(handler2.obtainMessage(1), 1000L);
            Location validLocation = getValidLocation(getGwiLocation());
            if (validLocation != null) {
                CarVdrListenerManager.getInstance().onVdrLocationChanged(validLocation);
            }
        } catch (Exception e) {
            WrappedCompositionsetContent1211.read(TAG, "dealGwiLocation fail, msg is : " + e.getMessage());
        }
    }

    private void loadGwiFile() {
        new CarGwiFileManager().checkGwiSoService(new ICarGwiSoLoadListener() { // from class: com.huawei.location.gwi.GwiLocationManager.2
            @Override // com.huawei.location.gwi.listener.ICarGwiSoLoadListener
            public void handleLoadResult(boolean z) {
                int i;
                GwiLocationManager gwiLocationManager;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(GwiLocationManager.TAG, "handleLoadResult: " + z);
                if (!z) {
                    gwiLocationManager = GwiLocationManager.this;
                    i = 102;
                } else {
                    boolean zIsFileExist = CarGwiFileManager.isFileExist();
                    GwiLocationManager gwiLocationManager2 = GwiLocationManager.this;
                    if (zIsFileExist) {
                        gwiLocationManager2.startGwiRequest();
                        return;
                    } else {
                        i = 106;
                        gwiLocationManager = gwiLocationManager2;
                    }
                }
                gwiLocationManager.dealInitError(i);
            }
        });
    }

    private Location getValidLocation(Location location) {
        if (location != null) {
            return location;
        }
        if (isInputLocationValid()) {
            return this.inputLocation;
        }
        return null;
    }

    private GwiLocationManager() {
    }

    private void dealVdrError(int i, int i2) {
        CarVdrListenerManager.getInstance().onVdrError(i2, CarGwiUtil.getAlgErrorMsg(i, i2));
    }

    public static GwiLocationManager getInstance() {
        if (instance == null) {
            synchronized (VDR_SYNC_LOCK) {
                if (instance == null) {
                    instance = new GwiLocationManager();
                }
            }
        }
        return instance;
    }

    private void initHandler() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "initHandler.");
        if (this.handler != null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "handler has been init, return here.");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Loc-gwi");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper()) { // from class: com.huawei.location.gwi.GwiLocationManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                WindowInfoImplCompanion.serializer(message.what, GwiLocationManager.TAG, new StringBuilder("msg.what="));
                if (message.what != 1) {
                    return;
                }
                GwiLocationManager.this.dealGwiLocation();
            }
        };
    }

    private void releaseHandler() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "releaseHandler.");
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.handler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGwiRequest() {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startGwiRequest.");
            try {
                try {
                    initHandler();
                    LocationClient locationClient = LocationClient.getInstance(placeAtf8xVGno.read(), CarGwiSoFileConstant.SO_PATH, this.rotationAngle);
                    this.locationClient = locationClient;
                    if (locationClient == null) {
                        WrappedCompositionsetContent1211.read(TAG, "LocationClient init failed");
                        dealInitError(103);
                    } else {
                        this.iCarVdrInitListener.onSuccess();
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startGwiRequest success.");
                    }
                } catch (IllegalArgumentException unused) {
                    WrappedCompositionsetContent1211.read(TAG, "locationClient start failed because of IllegalArgumentException.");
                    dealInitError(103);
                }
            } catch (Exception e) {
                WrappedCompositionsetContent1211.read(TAG, "locationClient start failed." + e.getMessage());
                dealInitError(105);
            }
        }
    }

    public void disableAccuracyFilter() {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "disableAccuracyFilter");
            this.accuracyFilterEnable = false;
            this.accuracyThreshold = 0.0f;
        }
    }

    public void init(Context context, RotationAngle rotationAngle, ICarVdrInitListener iCarVdrInitListener) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "init");
            if (iCarVdrInitListener == null) {
                WrappedCompositionsetContent1211.read(TAG, "iCarVdrInitListener is null, return here.");
                return;
            }
            if (context == null) {
                WrappedCompositionsetContent1211.read(TAG, "context is null.");
                dealInitError(107);
                return;
            }
            if (placeAtf8xVGno.RemoteActionCompatParcelizer == null) {
                placeAtf8xVGno.RemoteActionCompatParcelizer = context.getApplicationContext();
            }
            this.iCarVdrInitListener = iCarVdrInitListener;
            if (rotationAngle != null && rotationAngle.isValid()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "rotationAngle info, " + rotationAngle.toString());
                this.rotationAngle = rotationAngle;
                if (isGwiStart()) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "LocationClient is not null, stop Vdr here.");
                    stopVdr();
                }
                loadGwiFile();
                return;
            }
            WrappedCompositionsetContent1211.read(TAG, "rotationAngle is null or invalid.");
            dealInitError(101);
        }
    }

    public void stopVdr() {
        synchronized (this) {
            try {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "stopVdr.");
                CarVdrListenerManager.getInstance().clearVdrLocationListener();
                LocationClient locationClient = this.locationClient;
                if (locationClient != null) {
                    locationClient.stopVdr();
                }
                LocationClient.releaseInstance();
                this.locationClient = null;
                releaseHandler();
            } catch (Exception e) {
                WrappedCompositionsetContent1211.read(TAG, "stopVdr exception: " + e.getMessage());
            }
        }
    }

    private boolean isInputLocationValid() {
        return this.inputLocation != null && SystemClock.elapsedRealtimeNanos() - this.inputLocationTime <= 1200000000;
    }

    public boolean startVdr() {
        synchronized (this) {
            try {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startVdr.");
                LocationClient locationClient = this.locationClient;
                if (locationClient == null) {
                    WrappedCompositionsetContent1211.read(TAG, "rotationAngle is null, return here.");
                    return false;
                }
                if (locationClient.startVdr()) {
                    dealGwiLocation();
                    return true;
                }
                WrappedCompositionsetContent1211.read(TAG, "LocationClient is null, startVdr fail.");
                return false;
            } catch (Exception e) {
                WrappedCompositionsetContent1211.read(TAG, "startVdr exception: " + e.getMessage());
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealInitError(int i) {
        if (this.iCarVdrInitListener == null) {
            return;
        }
        WrappedCompositionsetContent1211.read(TAG, "dealInitError: " + GwiErrorCode.valueOf(i).toString());
        this.iCarVdrInitListener.onFail(i, GwiErrorCode.valueOfKey(i));
    }

    private Location getVdrResult(Location location) {
        CarGwiUtil.getAndResetInputCount();
        if (location == null) {
            return null;
        }
        getClipEntry getclipentry = new getClipEntry(location.getExtras(), 1);
        int iWrite = getclipentry.write(Constant.SDK_RESULT_ERROR_CODE, -9);
        int iWrite2 = getclipentry.write(Constant.ALGO_RESULT_ERROR_CODE, -9);
        if (iWrite2 != 0 && iWrite2 != 20) {
            dealVdrError(iWrite, iWrite2);
            return null;
        }
        int i = iWrite2 == 0 ? 4 : 8;
        WindowInfoImplCompanion.serializer(i, TAG, m1$$ExternalSyntheticOutline0.m(iWrite, iWrite2, "gwiLocation received here,sdkErrorCode is: ", " ,algoErrorCode is: ", "locationSource is: "));
        getclipentry.write(i);
        location.setExtras(getclipentry.serializer);
        if (CarGwiUtil.isLocationValid(location)) {
            return location;
        }
        WrappedCompositionsetContent1211.read(TAG, "location is not valid.");
        return null;
    }

    public boolean setVdrInputData(VdrInputData vdrInputData) {
        synchronized (this) {
            try {
                if (vdrInputData == null) {
                    WrappedCompositionsetContent1211.read(TAG, "vdrInputData is null, setVdrData fail.");
                    return false;
                }
                CarGwiUtil.calInputInfo(vdrInputData);
                if (this.locationClient == null) {
                    CarGwiUtil.logClientNullControl();
                    return false;
                }
                if (vdrInputData.getDataType() == VdrInputData.DataType.LOCATION) {
                    this.inputLocation = vdrInputData.getLocation();
                    this.inputLocationTime = SystemClock.elapsedRealtimeNanos();
                    if (this.accuracyFilterEnable && vdrInputData.getLocation().getAccuracy() > this.accuracyThreshold) {
                        WrappedCompositionsetContent1211.read(TAG, "accuracy filter is Enable, accuracyThreshold is: " + this.accuracyThreshold + ", acc is: " + vdrInputData.getLocation().getAccuracy());
                        return true;
                    }
                    if (CarGwiUtil.isIllegalBearing(vdrInputData.getLocation().getBearing())) {
                        WrappedCompositionsetContent1211.read(TAG, "bearing is illegal, bearing is: " + vdrInputData.getLocation().getBearing());
                        return true;
                    }
                }
                return this.locationClient.setVdrInput(vdrInputData);
            } catch (Exception e) {
                WrappedCompositionsetContent1211.read(TAG, "setVdrInputData exception: " + e.getMessage());
                return false;
            }
        }
    }
}
