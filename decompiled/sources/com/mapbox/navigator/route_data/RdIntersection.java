package com.mapbox.navigator.route_data;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface RdIntersection {
    List<Integer> bearings();

    List<RdRoadClass> classes();

    List<Boolean> entry();

    Integer geometryIndex();

    Byte inIndex();

    List<RdLane> lanes();

    Point location();

    Byte outIndex();

    boolean railwayCrossing();
}
