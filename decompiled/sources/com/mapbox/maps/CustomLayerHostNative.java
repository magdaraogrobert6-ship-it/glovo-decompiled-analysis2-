package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class CustomLayerHostNative implements CustomLayerHost {
    protected long peer;

    public static class CustomLayerHostPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerHostNative.cleanNativePeer(this.peer);
        }

        public CustomLayerHostPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void contextLost();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void initialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native CustomLayerRenderConfiguration prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void render(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void renderToTile(CanonicalTileID canonicalTileID);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CustomLayerHostNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomLayerHostPeerCleaner(j));
    }
}
