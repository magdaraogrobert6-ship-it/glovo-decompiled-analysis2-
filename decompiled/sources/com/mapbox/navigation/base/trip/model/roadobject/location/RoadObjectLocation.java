package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoadObjectLocation {
    public final int locationType;
    public final Geometry shape;

    public RoadObjectLocation(int i, Geometry geometry) {
        this.locationType = i;
        this.shape = geometry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadObjectLocation roadObjectLocation = (RoadObjectLocation) obj;
        return this.locationType == roadObjectLocation.locationType && this.shape.equals(roadObjectLocation.shape);
    }

    public int hashCode() {
        return this.shape.hashCode() + (this.locationType * 31);
    }

    public String toString() {
        return "RoadObjectLocation(locationType=" + this.locationType + ", shape=" + this.shape + ')';
    }
}
