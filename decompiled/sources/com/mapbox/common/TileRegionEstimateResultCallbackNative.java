package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionEstimateResultCallbackNative implements TileRegionEstimateResultCallback {
    private long peer;

    public static class TileRegionEstimateResultCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateResultCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionEstimateResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionEstimateResultCallback
    public native void run(Expected<TileRegionError, TileRegionEstimateResult> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionEstimateResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionEstimateResultCallbackPeerCleaner(j));
    }
}
