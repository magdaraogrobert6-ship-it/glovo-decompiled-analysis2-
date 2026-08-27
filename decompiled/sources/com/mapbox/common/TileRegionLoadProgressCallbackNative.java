package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionLoadProgressCallbackNative implements TileRegionLoadProgressCallback {
    private long peer;

    public static class TileRegionLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionLoadProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionLoadProgressCallback
    public native void run(TileRegionLoadProgress tileRegionLoadProgress);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionLoadProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionLoadProgressCallbackPeerCleaner(j));
    }
}
