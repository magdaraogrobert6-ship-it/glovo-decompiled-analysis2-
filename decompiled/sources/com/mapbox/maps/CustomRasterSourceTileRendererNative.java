package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class CustomRasterSourceTileRendererNative implements CustomRasterSourceTileRenderer {
    protected long peer;

    public static class CustomRasterSourceTileRendererPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileRendererNative.cleanNativePeer(this.peer);
        }

        public CustomRasterSourceTileRendererPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void contextLost();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void initialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native boolean isTileRenderable(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void renderToTile(CanonicalTileID canonicalTileID);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CustomRasterSourceTileRendererNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomRasterSourceTileRendererPeerCleaner(j));
    }
}
