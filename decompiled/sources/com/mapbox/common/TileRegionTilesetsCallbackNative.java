package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionTilesetsCallbackNative implements TileRegionTilesetsCallback {
    private long peer;

    public static class TileRegionTilesetsCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionTilesetsCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionTilesetsCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionTilesetsCallback
    public native void run(Expected<TileRegionError, TilesetDescriptor> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionTilesetsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionTilesetsCallbackPeerCleaner(j));
    }
}
