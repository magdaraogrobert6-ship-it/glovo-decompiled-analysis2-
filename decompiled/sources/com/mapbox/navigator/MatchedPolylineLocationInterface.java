package com.mapbox.navigator;

import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes3.dex */
public interface MatchedPolylineLocationInterface {
    MatchedPolylinePart getMatchedPart();

    GraphPath getPath();

    Geometry getShape();
}
