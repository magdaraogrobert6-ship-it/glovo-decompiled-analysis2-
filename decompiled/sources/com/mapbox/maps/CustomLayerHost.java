package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public interface CustomLayerHost {
    void contextLost();

    void deinitialize();

    void initialize();

    void render(CustomLayerRenderParameters customLayerRenderParameters);

    default void renderToTile(CanonicalTileID canonicalTileID) {
    }

    default CustomLayerRenderConfiguration prerender(CustomLayerRenderParameters customLayerRenderParameters) {
        return new CustomLayerRenderConfiguration.Builder().build();
    }
}
