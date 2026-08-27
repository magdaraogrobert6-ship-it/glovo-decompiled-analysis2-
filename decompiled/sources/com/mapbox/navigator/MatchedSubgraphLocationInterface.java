package com.mapbox.navigator;

import com.mapbox.geojson.Geometry;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface MatchedSubgraphLocationInterface {
    HashMap<Long, SubgraphEdge> getEdges();

    List<Position> getEnters();

    List<Position> getExits();

    Geometry getShape();
}
