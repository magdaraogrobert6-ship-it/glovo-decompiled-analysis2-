package com.huawei.riemann.gnsslocation.api.vdr;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.huawei.location.ut;
import com.huawei.riemann.gnsslocation.core.VdrLocationAlgoWrapper;
import com.huawei.riemann.gnsslocation.core.bean.DeviceInfo;
import com.huawei.riemann.gnsslocation.core.bean.eph.Ephemeris;
import com.huawei.riemann.gnsslocation.core.bean.obs.GnssClock;
import com.huawei.riemann.gnsslocation.core.bean.obs.GnssRawObservation;
import com.huawei.riemann.gnsslocation.core.bean.obs.Pvt;
import com.huawei.riemann.gnsslocation.core.bean.obs.SatelliteMeasurement;
import com.huawei.riemann.gnsslocation.core.bean.sensor.MotionSensors;
import o.ViewRootForTestCompanion;
import o.ViewTreeHostDefaultProvider;

/* JADX INFO: loaded from: classes2.dex */
public class VdrLocationClient {
    public static final String TAG = "com.huawei.riemann.gnsslocation.api.vdr.VdrLocationClient";
    public ViewRootForTestCompanion mVdrLocManager;

    public Pvt process(Pvt pvt, GnssRawObservation[] gnssRawObservationArr, MotionSensors motionSensors, Pvt pvt2) {
        String str;
        String str2;
        ViewRootForTestCompanion viewRootForTestCompanion = this.mVdrLocManager;
        if (viewRootForTestCompanion == null) {
            str = TAG;
            str2 = "proc manager null";
        } else {
            if (pvt == null) {
                Log.w("VdrLocationManager", "pvt null in proc");
            }
            if (gnssRawObservationArr == null) {
                Log.w("VdrLocationManager", "obs null in proc");
            }
            if (motionSensors == null) {
                Log.e("VdrLocationManager", "sensors null in proc");
                return null;
            }
            if (ViewRootForTestCompanion.read == null || !VdrLocationAlgoWrapper.serializer) {
                Log.e("VdrLocationManager", "wp is null in proc");
                return pvt;
            }
            GnssClock[] gnssClockArr = new GnssClock[0];
            SatelliteMeasurement[] satelliteMeasurementArr = new SatelliteMeasurement[0];
            if (gnssRawObservationArr != null) {
                gnssClockArr = new GnssClock[gnssRawObservationArr.length];
                satelliteMeasurementArr = new SatelliteMeasurement[gnssRawObservationArr.length];
                for (int i = 0; i < gnssRawObservationArr.length; i++) {
                    GnssRawObservation gnssRawObservation = gnssRawObservationArr[i];
                    if (gnssRawObservation == null) {
                        Log.w("VdrLocationManager", "rawMeasurements[" + i + "] is null");
                    } else {
                        gnssClockArr[i] = gnssRawObservation.getGnssClock();
                        satelliteMeasurementArr[i] = gnssRawObservationArr[i].getSatelliteMeasurement();
                    }
                }
            }
            pvt = ViewRootForTestCompanion.read.vdrProcess(pvt, gnssClockArr, satelliteMeasurementArr, motionSensors, pvt2);
            if (viewRootForTestCompanion.serializer == null) {
                return pvt;
            }
            str = "LogPersistenceManager";
            str2 = "log p helper null when proc";
        }
        Log.e(str, str2);
        return pvt;
    }

    public int startLocation(DeviceInfo deviceInfo) {
        String str;
        ViewRootForTestCompanion viewRootForTestCompanion = this.mVdrLocManager;
        if (viewRootForTestCompanion == null) {
            Log.e(TAG, "start n");
            return -1;
        }
        if (viewRootForTestCompanion.RemoteActionCompatParcelizer) {
            str = "already started";
        } else {
            viewRootForTestCompanion.RemoteActionCompatParcelizer = true;
            ut utVar = viewRootForTestCompanion.serializer;
            if (utVar != null) {
                utVar.ParcelableVolumeInfo();
            }
            VdrLocationAlgoWrapper vdrLocationAlgoWrapper = ViewRootForTestCompanion.read;
            if (vdrLocationAlgoWrapper != null && VdrLocationAlgoWrapper.serializer) {
                vdrLocationAlgoWrapper.vdrStart(deviceInfo, "");
                "start vdr location finished, transPath: ".concat("");
                return 0;
            }
            str = "start: wp is null";
        }
        Log.e("VdrLocationManager", str);
        return 0;
    }

    public void stopLocation() {
        ViewRootForTestCompanion viewRootForTestCompanion = this.mVdrLocManager;
        if (viewRootForTestCompanion == null) {
            Log.e(TAG, "stop n");
            return;
        }
        if (!viewRootForTestCompanion.RemoteActionCompatParcelizer) {
            Log.e("VdrLocationManager", "already stopped");
            return;
        }
        viewRootForTestCompanion.RemoteActionCompatParcelizer = false;
        VdrLocationAlgoWrapper vdrLocationAlgoWrapper = ViewRootForTestCompanion.read;
        if (vdrLocationAlgoWrapper == null || !VdrLocationAlgoWrapper.serializer) {
            Log.e("VdrLocationManager", "stop: wp is null");
            return;
        }
        vdrLocationAlgoWrapper.vdrStop();
        ut utVar = viewRootForTestCompanion.serializer;
        if (utVar != null && utVar.write) {
            utVar.write = false;
            Handler handler = (Handler) utVar.MediaBrowserCompatMediaItem;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ViewTreeHostDefaultProvider viewTreeHostDefaultProvider = (ViewTreeHostDefaultProvider) utVar.RatingCompat;
            if (viewTreeHostDefaultProvider != null) {
                viewTreeHostDefaultProvider.quitSafely();
            }
            utVar.MediaBrowserCompatMediaItem = null;
            utVar.RatingCompat = null;
        }
    }

    public void updateEphemeris(Ephemeris ephemeris) {
        ViewRootForTestCompanion viewRootForTestCompanion = this.mVdrLocManager;
        if (viewRootForTestCompanion == null) {
            Log.e(TAG, "no ephemeris data");
            return;
        }
        viewRootForTestCompanion.getClass();
        VdrLocationAlgoWrapper vdrLocationAlgoWrapper = ViewRootForTestCompanion.read;
        if (vdrLocationAlgoWrapper == null || !VdrLocationAlgoWrapper.serializer) {
            Log.e("VdrLocationManager", "update: wp is null");
            return;
        }
        vdrLocationAlgoWrapper.vdrUpdateEphemeris(ephemeris);
        if (viewRootForTestCompanion.serializer == null) {
            Log.e("VdrLocationManager", "lpm is null");
        } else {
            Log.e("LogPersistenceManager", "log p helper null when eph");
        }
    }

    public VdrLocationClient(Context context, String str) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context can not be null");
            }
            this.mVdrLocManager = new ViewRootForTestCompanion(context.getApplicationContext(), str);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "vdr client error: " + e.getMessage());
        }
    }
}
