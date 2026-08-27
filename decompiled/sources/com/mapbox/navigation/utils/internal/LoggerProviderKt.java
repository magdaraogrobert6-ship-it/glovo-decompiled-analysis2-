package com.mapbox.navigation.utils.internal;

import com.mapbox.common.LoggingLevel;
import com.mapbox.common.NativeLoggerWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoggerProviderKt {
    /* JADX WARN: Failed to inline method: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Not passed register '(r2v0 'str2' java.lang.String)' in method call: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    public static final void logD(String str, String str2) {
        str.getClass();
        NativeLoggerWrapper.INSTANCE.debug(LoggerFrontendKt.access$createMessage(str, str2), "nav-sdk");
    }

    /* JADX WARN: Failed to inline method: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Not passed register '(r2v0 'str2' java.lang.String)' in method call: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    public static final void logI(String str, String str2) {
        str.getClass();
        NativeLoggerWrapper.INSTANCE.info(LoggerFrontendKt.access$createMessage(str, str2), "nav-sdk");
    }

    /* JADX WARN: Failed to inline method: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Not passed register '(r2v0 'str2' java.lang.String)' in method call: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    public static final void logE(String str, String str2) {
        NativeLoggerWrapper.INSTANCE.error(LoggerFrontendKt.access$createMessage(str, str2), "nav-sdk");
    }

    public static final LoggingLevel logLevel() {
        return NativeLoggerWrapper.INSTANCE.getLogLevel("nav-sdk");
    }

    /* JADX WARN: Failed to inline method: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    /* JADX WARN: Not passed register '(r2v0 'str2' java.lang.String)' in method call: com.mapbox.navigation.utils.internal.LoggerFrontendKt.access$createMessage(java.lang.String, java.lang.String):java.lang.String */
    public static final void logW(String str, String str2) {
        NativeLoggerWrapper.INSTANCE.warning(LoggerFrontendKt.access$createMessage(str, str2), "nav-sdk");
    }
}
