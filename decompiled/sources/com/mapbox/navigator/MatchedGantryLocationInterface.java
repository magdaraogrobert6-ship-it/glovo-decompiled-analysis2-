package com.mapbox.navigator;

import com.mapbox.geojson.Geometry;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface MatchedGantryLocationInterface {
    List<Position> getPositions();

    Geometry getShape();
}
