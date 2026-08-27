package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxCommonLogger {
    public static final MapboxCommonLogger INSTANCE = new MapboxCommonLogger();
    private static final String SDK_IDENTIFIER = "common";

    private MapboxCommonLogger() {
    }

    public final void logD$common_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        Log.debug(str2, "common\\".concat(str));
    }

    public final void logE$common_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        Log.error(str2, "common\\".concat(str));
    }

    public final void logI$common_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        Log.info(str2, "common\\".concat(str));
    }

    public final void logW$common_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        Log.warning(str2, "common\\".concat(str));
    }
}
