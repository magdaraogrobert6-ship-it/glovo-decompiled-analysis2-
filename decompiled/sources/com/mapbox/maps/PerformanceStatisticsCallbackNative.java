package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class PerformanceStatisticsCallbackNative implements PerformanceStatisticsCallback {
    private long peer;

    public static class PerformanceStatisticsCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PerformanceStatisticsCallbackNative.cleanNativePeer(this.peer);
        }

        public PerformanceStatisticsCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.PerformanceStatisticsCallback
    public native void run(PerformanceStatistics performanceStatistics);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private PerformanceStatisticsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PerformanceStatisticsCallbackPeerCleaner(j));
    }
}
