package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class TileStoreGenericEventCallbackNative implements TileStoreGenericEventCallback {
    private long peer;

    public static class TileStoreGenericEventCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreGenericEventCallbackNative.cleanNativePeer(this.peer);
        }

        public TileStoreGenericEventCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileStoreGenericEventCallback
    public native void run(TileStoreGenericEvent tileStoreGenericEvent);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileStoreGenericEventCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreGenericEventCallbackPeerCleaner(j));
    }
}
