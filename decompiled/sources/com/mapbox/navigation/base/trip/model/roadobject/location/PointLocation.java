package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObjectPosition;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class PointLocation extends RoadObjectLocation {
    public final RoadObjectPosition position;

    public PointLocation(RoadObjectPosition roadObjectPosition, Point point) {
        super(3, point);
        this.position = roadObjectPosition;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final String toString() {
        return "PointLocation(position=" + this.position + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PointLocation.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.position, ((PointLocation) obj).position}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final int hashCode() {
        return this.position.hashCode() + (super.hashCode() * 31);
    }
}
