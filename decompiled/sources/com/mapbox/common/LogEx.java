package com.mapbox.common;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class LogEx {
    public static final LogEx INSTANCE = new LogEx();

    private LogEx() {
    }

    public final void logD(LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.DEBUG, str) && logThrottler.onLog()) {
            Log.debug((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final void logE(LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.ERROR, str) && logThrottler.onLog()) {
            Log.error((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final void logI(LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.INFO, str) && logThrottler.onLog()) {
            Log.info((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final void logW(LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.WARNING, str) && logThrottler.onLog()) {
            Log.warning((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logD$default(LogEx logEx, LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.DEBUG, str) && logThrottler.onLog()) {
            Log.debug((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logE$default(LogEx logEx, LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.ERROR, str) && logThrottler.onLog()) {
            Log.error((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logI$default(LogEx logEx, LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.INFO, str) && logThrottler.onLog()) {
            Log.info((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logW$default(LogEx logEx, LogThrottler logThrottler, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        logThrottler.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.WARNING, str) && logThrottler.onLog()) {
            Log.warning((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final boolean logLevelAccepts(LoggingLevel loggingLevel, String str) {
        LoggingLevel loggingLevel2;
        loggingLevel.getClass();
        if (str == null || (loggingLevel2 = LogConfiguration.getLoggingLevel(str)) == null) {
            loggingLevel2 = LogConfiguration.getLoggingLevel();
        }
        return loggingLevel2 != null && loggingLevel2.compareTo(loggingLevel) <= 0;
    }

    public final void logD(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.DEBUG, str)) {
            Log.debug((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final void logE(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.ERROR, str)) {
            Log.error((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final void logI(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.INFO, str)) {
            Log.info((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public final void logW(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logLevelAccepts(LoggingLevel.WARNING, str)) {
            Log.warning((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logD$default(LogEx logEx, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.DEBUG, str)) {
            Log.debug((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logE$default(LogEx logEx, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.ERROR, str)) {
            Log.error((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logI$default(LogEx logEx, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.INFO, str)) {
            Log.info((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }

    public static /* synthetic */ void logW$default(LogEx logEx, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (logEx.logLevelAccepts(LoggingLevel.WARNING, str)) {
            Log.warning((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), str);
        }
    }
}
