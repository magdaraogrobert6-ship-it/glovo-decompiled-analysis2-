package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionBooleanCallbackNative implements TileRegionBooleanCallback {
    private long peer;

    public static class TileRegionBooleanCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionBooleanCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionBooleanCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionBooleanCallback
    public native void run(Expected<TileRegionError, Boolean> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionBooleanCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionBooleanCallbackPeerCleaner(j));
    }
}
