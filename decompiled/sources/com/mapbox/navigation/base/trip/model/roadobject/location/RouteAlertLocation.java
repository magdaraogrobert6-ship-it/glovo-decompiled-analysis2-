package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteAlertLocation extends RoadObjectLocation {
    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return RouteAlertLocation.class.equals(obj != null ? obj.getClass() : null) && super.equals(obj);
    }

    public RouteAlertLocation(int i, Geometry geometry) {
        super(i, geometry);
    }
}
