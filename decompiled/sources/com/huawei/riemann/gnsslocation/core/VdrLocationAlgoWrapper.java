package com.huawei.riemann.gnsslocation.core;

import android.content.Context;
import android.util.Log;
import com.huawei.riemann.gnsslocation.core.bean.DeviceInfo;
import com.huawei.riemann.gnsslocation.core.bean.eph.Ephemeris;
import com.huawei.riemann.gnsslocation.core.bean.obs.GnssClock;
import com.huawei.riemann.gnsslocation.core.bean.obs.Pvt;
import com.huawei.riemann.gnsslocation.core.bean.obs.SatelliteMeasurement;
import com.huawei.riemann.gnsslocation.core.bean.sensor.MotionSensors;
import java.io.File;
import java.io.IOException;
import o.WindowRecomposer_androidKt;

/* JADX INFO: loaded from: classes2.dex */
public class VdrLocationAlgoWrapper {
    public static volatile VdrLocationAlgoWrapper IconCompatParcelizer = null;
    public static final Object read = new Object();
    public static boolean serializer = false;

    public native Pvt vdrProcess(Pvt pvt, GnssClock[] gnssClockArr, SatelliteMeasurement[] satelliteMeasurementArr, MotionSensors motionSensors, Pvt pvt2);

    public native int vdrStart(DeviceInfo deviceInfo, String str);

    public native int vdrStop();

    public native void vdrUpdateEphemeris(Ephemeris ephemeris);

    public VdrLocationAlgoWrapper(Context context, String str) {
        StringBuilder sb;
        File file = new File(str);
        boolean z = false;
        try {
            String str2 = context.getDir("libs", 0).getCanonicalPath() + File.separator + "libVdr.so";
            File file2 = new File(str2);
            file.getCanonicalPath();
            if (WindowRecomposer_androidKt.IconCompatParcelizer(file.getCanonicalPath(), file2.getCanonicalPath())) {
                System.load(str2);
                z = true;
            }
        } catch (IOException e) {
            e = e;
            sb = new StringBuilder("load file dir error: ");
            sb.append(e.getMessage());
            Log.e("LibraryUtils", sb.toString());
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            sb = new StringBuilder("invalid file: ");
            sb.append(e.getMessage());
            Log.e("LibraryUtils", sb.toString());
        }
        serializer = z;
    }
}
