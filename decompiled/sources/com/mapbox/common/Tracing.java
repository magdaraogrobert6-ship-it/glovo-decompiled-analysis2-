package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes4.dex */
final class Tracing {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TracingPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Tracing.cleanNativePeer(this.peer);
        }

        public TracingPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native TracingBackendType getTracingBackendType();

    private static native void nativeSelfRegister();

    public static native void setTracingBackendType(TracingBackendType tracingBackendType);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Tracing(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TracingPeerCleaner(j));
    }
}
