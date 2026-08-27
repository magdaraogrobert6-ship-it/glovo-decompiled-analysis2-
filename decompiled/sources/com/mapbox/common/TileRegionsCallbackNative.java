package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionsCallbackNative implements TileRegionsCallback {
    private long peer;

    public static class TileRegionsCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionsCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionsCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionsCallback
    public native void run(Expected<TileRegionError, List<TileRegion>> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionsCallbackPeerCleaner(j));
    }
}
