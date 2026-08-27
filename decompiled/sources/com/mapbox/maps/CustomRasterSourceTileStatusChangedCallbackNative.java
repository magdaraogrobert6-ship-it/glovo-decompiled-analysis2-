package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class CustomRasterSourceTileStatusChangedCallbackNative implements CustomRasterSourceTileStatusChangedCallback {
    private long peer;

    public static class CustomRasterSourceTileStatusChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileStatusChangedCallbackNative.cleanNativePeer(this.peer);
        }

        public CustomRasterSourceTileStatusChangedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.CustomRasterSourceTileStatusChangedCallback
    public native void run(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private CustomRasterSourceTileStatusChangedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomRasterSourceTileStatusChangedCallbackPeerCleaner(j));
    }
}
