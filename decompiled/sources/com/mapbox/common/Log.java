package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class Log {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class LogPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Log.cleanNativePeer(this.peer);
        }

        public LogPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native void debug(String str, String str2);

    public static native void debug(String str, String str2, LogThrottler logThrottler);

    public static native void error(String str, String str2);

    public static native void error(String str, String str2, LogThrottler logThrottler);

    public static native void info(String str, String str2);

    public static native void info(String str, String str2, LogThrottler logThrottler);

    private static native void nativeSelfRegister();

    public static native void warning(String str, String str2);

    public static native void warning(String str, String str2, LogThrottler logThrottler);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Log(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogPeerCleaner(j));
    }
}
