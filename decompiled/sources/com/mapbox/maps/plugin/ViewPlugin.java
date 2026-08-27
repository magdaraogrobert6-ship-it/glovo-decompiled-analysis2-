package com.mapbox.maps.plugin;

import android.util.AttributeSet;
import android.view.View;
import com.mapbox.maps.MapView;

/* JADX INFO: loaded from: classes2.dex */
public interface ViewPlugin extends MapPlugin {
    View bind(MapView mapView, AttributeSet attributeSet, float f);

    void onPluginView(View view);
}
