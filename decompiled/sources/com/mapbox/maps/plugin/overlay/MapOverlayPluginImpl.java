package com.mapbox.maps.plugin.overlay;

import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapSizePlugin;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class MapOverlayPluginImpl implements MapSizePlugin, MapPlugin {
    public final ArrayList mapOverlays = new ArrayList();

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public final void onSizeChanged(int i, int i2) {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        this.mapOverlays.clear();
    }
}
