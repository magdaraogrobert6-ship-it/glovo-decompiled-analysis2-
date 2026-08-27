package com.mapbox.search.internal.bindgen;

import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes3.dex */
public interface LocationProvider {
    Point getLocation();

    LonLatBBox getViewport();
}
