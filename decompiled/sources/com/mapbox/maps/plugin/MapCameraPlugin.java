package com.mapbox.maps.plugin;

import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;

/* JADX INFO: loaded from: classes2.dex */
public interface MapCameraPlugin extends MapPlugin {
    void onCameraMove(Point point, EdgeInsets edgeInsets, double d, double d2, double d3);
}
