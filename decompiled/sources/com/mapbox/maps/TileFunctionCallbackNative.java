package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class TileFunctionCallbackNative implements TileFunctionCallback {
    private long peer;

    public static class TileFunctionCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileFunctionCallbackNative.cleanNativePeer(this.peer);
        }

        public TileFunctionCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.TileFunctionCallback
    public native void run(CanonicalTileID canonicalTileID);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileFunctionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileFunctionCallbackPeerCleaner(j));
    }
}
