package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeLoggerWrapper {
    public static final NativeLoggerWrapper INSTANCE = new NativeLoggerWrapper();

    private NativeLoggerWrapper() {
    }

    public final void debug(String str, String str2) {
        str.getClass();
        Log.debug(str, str2);
    }

    public final void error(String str, String str2) {
        str.getClass();
        Log.error(str, str2);
    }

    public final LoggingLevel getLogLevel(String str) {
        str.getClass();
        return LogConfiguration.getLoggingLevel(str);
    }

    public final void info(String str, String str2) {
        str.getClass();
        Log.info(str, str2);
    }

    public final void warning(String str, String str2) {
        str.getClass();
        Log.warning(str, str2);
    }
}
