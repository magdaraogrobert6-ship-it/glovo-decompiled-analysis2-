package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionEstimateProgressCallbackNative implements TileRegionEstimateProgressCallback {
    private long peer;

    public static class TileRegionEstimateProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateProgressCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionEstimateProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionEstimateProgressCallback
    public native void run(TileRegionEstimateProgress tileRegionEstimateProgress);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionEstimateProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionEstimateProgressCallbackPeerCleaner(j));
    }
}
