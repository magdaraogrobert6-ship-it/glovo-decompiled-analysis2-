package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class MetricsSourceNative implements MetricsSource {
    protected long peer;

    public static class MetricsSourcePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MetricsSourceNative.cleanNativePeer(this.peer);
        }

        public MetricsSourcePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MetricsSource
    public native List<Metrics> getMetrics();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MetricsSourceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MetricsSourcePeerCleaner(j));
    }
}
