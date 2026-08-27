package com.mapbox.navigator;

import com.mapbox.geojson.Point;
import com.mapbox.navigator.match.openlr.Orientation;
import com.mapbox.navigator.match.openlr.SideOfRoad;

/* JADX INFO: loaded from: classes3.dex */
public interface OpenLRPointAlongLineLocationInterface {
    Point getCoordinate();

    Orientation getOrientation();

    GraphPosition getPosition();

    SideOfRoad getSideOfRoad();
}
