package com.huawei.riemann.location;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.riemann.common.api.location.CityTileCallback;
import com.huawei.riemann.location.bean.DeviceInfo;
import com.huawei.riemann.location.bean.eph.Ephemeris;
import com.huawei.riemann.location.bean.obs.GnssClock;
import com.huawei.riemann.location.bean.obs.Pvt;
import com.huawei.riemann.location.bean.obs.SatelliteMeasurement;
import java.io.File;
import java.io.IOException;
import o.ViewRootForTest;

/* JADX INFO: loaded from: classes2.dex */
public class SdmLocationAlgoWrapper {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static volatile SdmLocationAlgoWrapper read;
    public final boolean serializer;

    public native Pvt sdmProcess(Pvt pvt, GnssClock[] gnssClockArr, SatelliteMeasurement[] satelliteMeasurementArr);

    public native int sdmStart(DeviceInfo deviceInfo, CityTileCallback cityTileCallback, String str);

    public native int sdmStop();

    public native void sdmUpdateEphemeris(Ephemeris ephemeris);

    public native void sdmUpdateTileById(long j, byte[] bArr);

    public SdmLocationAlgoWrapper(Context context, String str) {
        boolean z = false;
        this.serializer = false;
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getDir("libs", 0).getAbsolutePath());
        String strM = ff$$ExternalSyntheticOutline0.m(sb, File.separator, "libSdm.so");
        try {
            ViewRootForTest.serializer(file.getCanonicalPath(), new File(strM).getCanonicalPath());
            System.load(strM);
            z = true;
        } catch (IOException unused) {
        }
        this.serializer = z;
    }
}
