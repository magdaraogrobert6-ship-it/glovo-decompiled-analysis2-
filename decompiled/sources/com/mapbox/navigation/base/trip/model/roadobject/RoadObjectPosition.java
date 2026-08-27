package com.mapbox.navigation.base.trip.model.roadobject;

import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPosition;

/* JADX INFO: loaded from: classes2.dex */
public final class RoadObjectPosition {
    public final Point coordinate;
    public final EHorizonGraphPosition eHorizonGraphPosition;

    public final int hashCode() {
        return this.coordinate.hashCode() + (this.eHorizonGraphPosition.hashCode() * 31);
    }

    public RoadObjectPosition(EHorizonGraphPosition eHorizonGraphPosition, Point point) {
        this.eHorizonGraphPosition = eHorizonGraphPosition;
        this.coordinate = point;
    }

    public final String toString() {
        return "RoadObjectPosition(eHorizonGraphPosition=" + this.eHorizonGraphPosition + ", coordinate=" + this.coordinate + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoadObjectPosition.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadObjectPosition roadObjectPosition = (RoadObjectPosition) obj;
        return this.eHorizonGraphPosition.equals(roadObjectPosition.eHorizonGraphPosition) && this.coordinate.equals(roadObjectPosition.coordinate);
    }
}
