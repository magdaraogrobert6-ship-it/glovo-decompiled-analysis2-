package com.mapbox.navigation.ui.maps.building;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildingAction$QueryBuilding {
    public final MapboxMap mapboxMap;
    public final Point point;

    public final int hashCode() {
        return this.mapboxMap.hashCode() + (this.point.hashCode() * 31);
    }

    public BuildingAction$QueryBuilding(Point point, MapboxMap mapboxMap) {
        this.point = point;
        this.mapboxMap = mapboxMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuildingAction$QueryBuilding) {
            BuildingAction$QueryBuilding buildingAction$QueryBuilding = (BuildingAction$QueryBuilding) obj;
            return this.point.equals(buildingAction$QueryBuilding.point) && this.mapboxMap == buildingAction$QueryBuilding.mapboxMap;
        }
        return false;
    }

    public final String toString() {
        return "QueryBuilding(point=" + this.point + ", mapboxMap=" + this.mapboxMap + ')';
    }
}
