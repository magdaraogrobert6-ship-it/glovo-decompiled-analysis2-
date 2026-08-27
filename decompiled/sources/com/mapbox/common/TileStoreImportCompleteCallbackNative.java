package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
final class TileStoreImportCompleteCallbackNative implements TileStoreImportCompleteCallback {
    private long peer;

    public static class TileStoreImportCompleteCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreImportCompleteCallbackNative.cleanNativePeer(this.peer);
        }

        public TileStoreImportCompleteCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileStoreImportCompleteCallback
    public native void run(Expected<TileStoreImportError, None> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileStoreImportCompleteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreImportCompleteCallbackPeerCleaner(j));
    }
}
