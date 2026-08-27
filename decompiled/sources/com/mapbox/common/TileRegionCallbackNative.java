package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionCallbackNative implements TileRegionCallback {
    private long peer;

    public static class TileRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionCallback
    public native void run(Expected<TileRegionError, TileRegion> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionCallbackPeerCleaner(j));
    }
}
