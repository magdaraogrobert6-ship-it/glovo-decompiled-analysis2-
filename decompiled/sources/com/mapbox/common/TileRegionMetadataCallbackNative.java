package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionMetadataCallbackNative implements TileRegionMetadataCallback {
    private long peer;

    public static class TileRegionMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionMetadataCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionMetadataCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionMetadataCallback
    public native void run(Expected<TileRegionError, Value> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionMetadataCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionMetadataCallbackPeerCleaner(j));
    }
}
