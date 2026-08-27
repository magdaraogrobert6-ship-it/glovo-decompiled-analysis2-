package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public final class MetricsServiceFactory {
    protected long peer;

    public static class MetricsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceFactory.cleanNativePeer(this.peer);
        }

        public MetricsServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native MetricsService getInstance();

    public static native MetricsService getInstanceForLogging();

    private static native void nativeSelfRegister();

    public static native void reset();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MetricsServiceFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServiceFactoryPeerCleaner(j));
    }
}
