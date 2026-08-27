package com.mapbox.maps;

import com.mapbox.common.LogThrottler;
import com.mapbox.common.MapboxMapsAndroidLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxLogger {
    public static final boolean isLoggableD() {
        return MapboxMapsAndroidLogger.INSTANCE.internalIsLoggableD$sdk_base_release();
    }

    public static final void logD(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (isLoggableD()) {
            logD(str, (String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        }
    }

    public static final void logE(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogE$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }

    public static final void logI(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogI$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }

    public static final void logW(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogW$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }

    public static final void logE(String str, String str2, LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogE$sdk_base_release(str, str2, logThrottler);
    }

    public static final void logI(String str, String str2, LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogI$sdk_base_release(str, str2, logThrottler);
    }

    public static final void logW(String str, String str2, LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogW$sdk_base_release(str, str2, logThrottler);
    }

    public static final void logD(String str, String str2, LogThrottler logThrottler) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.INSTANCE.internalLogD$sdk_base_release(str, str2, logThrottler);
    }

    public static final void logD(String str, String str2) {
        str.getClass();
        str2.getClass();
        MapboxMapsAndroidLogger.internalLogD$sdk_base_release$default(MapboxMapsAndroidLogger.INSTANCE, str, str2, null, 4, null);
    }
}
