package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
final class TileStoreImportProgressCallbackNative implements TileStoreImportProgressCallback {
    private long peer;

    public static class TileStoreImportProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreImportProgressCallbackNative.cleanNativePeer(this.peer);
        }

        public TileStoreImportProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileStoreImportProgressCallback
    public native void run(TileStoreImportProgress tileStoreImportProgress);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileStoreImportProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreImportProgressCallbackPeerCleaner(j));
    }
}
