package com.huawei.riemann.common.api.location;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.huawei.location.Vw$Vw;
import com.huawei.riemann.location.SdmLocationAlgoWrapper;
import com.huawei.riemann.location.bean.DeviceInfo;
import com.huawei.riemann.location.bean.eph.Ephemeris;
import com.huawei.riemann.location.bean.obs.GnssClock;
import com.huawei.riemann.location.bean.obs.GnssRawObservation;
import com.huawei.riemann.location.bean.obs.Pvt;
import com.huawei.riemann.location.bean.obs.SatelliteMeasurement;
import o.ViewTreeHostDefaultProvider;
import o.getOnViewCreatedCallback;
import o.getViewRoot;

/* JADX INFO: loaded from: classes4.dex */
public class SdmLocationClient {
    public static final String TAG = "SdmLocationClient";
    public Context mContext;
    public getViewRoot mSdmLocManager;

    public Pvt process(Pvt pvt, GnssRawObservation[] gnssRawObservationArr) {
        String str;
        getViewRoot getviewroot = this.mSdmLocManager;
        if (getviewroot == null) {
            Log.e(TAG, "proc n");
            return pvt;
        }
        SdmLocationAlgoWrapper sdmLocationAlgoWrapper = getviewroot.MediaDescriptionCompat;
        if (pvt == null) {
            str = "pvt null";
        } else {
            if (gnssRawObservationArr != null) {
                if (sdmLocationAlgoWrapper == null || !sdmLocationAlgoWrapper.serializer) {
                    Log.e("SdmLocationManager", "wp is null");
                    return pvt;
                }
                GnssClock[] gnssClockArr = new GnssClock[gnssRawObservationArr.length];
                SatelliteMeasurement[] satelliteMeasurementArr = new SatelliteMeasurement[gnssRawObservationArr.length];
                for (int i = 0; i < gnssRawObservationArr.length; i++) {
                    gnssClockArr[i] = gnssRawObservationArr[i].getGnssClock();
                    satelliteMeasurementArr[i] = gnssRawObservationArr[i].getSatelliteMeasurement();
                }
                Pvt pvtSdmProcess = sdmLocationAlgoWrapper.sdmProcess(pvt, gnssClockArr, satelliteMeasurementArr);
                if (getviewroot.MediaSessionCompatQueueItem == null) {
                    Log.e("SdmLocationManager", "p ops null");
                }
                return pvtSdmProcess;
            }
            str = "obs null";
        }
        Log.e("SdmLocationManager", str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int startLocation(DeviceInfo deviceInfo, CityTileCallback cityTileCallback) {
        String str;
        getViewRoot getviewroot = this.mSdmLocManager;
        if (getviewroot == null) {
            Log.e(TAG, "start n");
            return -1;
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!getviewroot.read) {
            getviewroot.IconCompatParcelizer(null);
            getOnViewCreatedCallback getonviewcreatedcallback = getviewroot.MediaSessionCompatQueueItem;
            if (getonviewcreatedcallback != null) {
                getviewroot.RatingCompat = cityTileCallback;
                getviewroot.MediaMetadataCompat = new Vw$Vw(getonviewcreatedcallback, cityTileCallback, z, objArr3 == true ? 1 : 0);
            } else {
                getviewroot.MediaMetadataCompat = new Vw$Vw(new Handler(Looper.getMainLooper()), cityTileCallback, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            SdmLocationAlgoWrapper sdmLocationAlgoWrapper = getviewroot.MediaDescriptionCompat;
            if (sdmLocationAlgoWrapper == null || !sdmLocationAlgoWrapper.serializer) {
                str = "wp is null";
            } else {
                sdmLocationAlgoWrapper.sdmStart(deviceInfo, getviewroot.MediaMetadataCompat, "");
            }
            getviewroot.read = true;
            return 0;
        }
        str = "already started";
        Log.e("SdmLocationManager", str);
        getviewroot.read = true;
        return 0;
    }

    public void stopLocation() {
        getViewRoot getviewroot = this.mSdmLocManager;
        if (getviewroot == null) {
            Log.e(TAG, "stop n");
            return;
        }
        if (getviewroot.read) {
            SdmLocationAlgoWrapper sdmLocationAlgoWrapper = getviewroot.MediaDescriptionCompat;
            if (sdmLocationAlgoWrapper == null || !sdmLocationAlgoWrapper.serializer) {
                Log.e("SdmLocationManager", "wp is null");
            } else {
                sdmLocationAlgoWrapper.sdmStop();
            }
            getviewroot.RatingCompat = null;
            getviewroot.MediaMetadataCompat = null;
            if (getviewroot.IconCompatParcelizer) {
                getOnViewCreatedCallback getonviewcreatedcallback = getviewroot.serializer;
                if (getonviewcreatedcallback != null) {
                    getonviewcreatedcallback.removeCallbacksAndMessages(null);
                }
                getOnViewCreatedCallback getonviewcreatedcallback2 = getviewroot.MediaSessionCompatQueueItem;
                if (getonviewcreatedcallback2 != null) {
                    getonviewcreatedcallback2.removeCallbacksAndMessages(null);
                }
                ViewTreeHostDefaultProvider viewTreeHostDefaultProvider = getviewroot.RemoteActionCompatParcelizer;
                if (viewTreeHostDefaultProvider != null) {
                    viewTreeHostDefaultProvider.quitSafely();
                }
                getviewroot.serializer = null;
                getviewroot.MediaSessionCompatQueueItem = null;
                getviewroot.RemoteActionCompatParcelizer = null;
            }
            getviewroot.IconCompatParcelizer = false;
        } else {
            Log.e("SdmLocationManager", "already stopped");
        }
        getviewroot.read = false;
    }

    public void updateEphemeris(Ephemeris ephemeris) {
        getViewRoot getviewroot = this.mSdmLocManager;
        if (getviewroot == null) {
            Log.e(TAG, "eph n");
            return;
        }
        SdmLocationAlgoWrapper sdmLocationAlgoWrapper = getviewroot.MediaDescriptionCompat;
        if (sdmLocationAlgoWrapper == null || !sdmLocationAlgoWrapper.serializer) {
            Log.e("SdmLocationManager", "wp is null");
            return;
        }
        if (getviewroot.MediaSessionCompatQueueItem == null) {
            Log.e("SdmLocationManager", "e ops null");
        }
        sdmLocationAlgoWrapper.sdmUpdateEphemeris(ephemeris);
    }

    public SdmLocationClient(Context context, Intent intent, String str) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context can not be null");
            }
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            this.mSdmLocManager = new getViewRoot(applicationContext, null, str);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, e.getMessage() != null ? e.getMessage() : "IllegalArgumentException2");
        }
    }

    public SdmLocationClient(Context context, Looper looper, String str) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context can not be null");
            }
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            this.mSdmLocManager = new getViewRoot(applicationContext, looper, str);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, e.getMessage() != null ? e.getMessage() : "IllegalArgumentException3");
        }
    }

    public SdmLocationClient(Context context, String str) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context can not be null");
            }
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            this.mSdmLocManager = new getViewRoot(applicationContext, null, str);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, e.getMessage() != null ? e.getMessage() : "IllegalArgumentException1");
        }
    }
}
