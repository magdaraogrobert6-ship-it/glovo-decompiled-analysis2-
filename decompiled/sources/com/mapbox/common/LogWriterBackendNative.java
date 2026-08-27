package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class LogWriterBackendNative implements LogWriterBackend {
    protected long peer;

    public static class LogWriterBackendPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LogWriterBackendNative.cleanNativePeer(this.peer);
        }

        public LogWriterBackendPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.LogWriterBackend
    public native void writeLog(LoggingLevel loggingLevel, String str);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LogWriterBackendNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LogWriterBackendPeerCleaner(j));
    }
}
