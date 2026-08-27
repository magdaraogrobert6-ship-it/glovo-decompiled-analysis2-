package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPosition;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class OpenLRPointLocation extends RoadObjectLocation {
    public final int openLROrientation;
    public final int openLRSideOfRoad;
    public final EHorizonGraphPosition position;

    public OpenLRPointLocation(EHorizonGraphPosition eHorizonGraphPosition, Point point, int i, int i2) {
        super(2, point);
        this.position = eHorizonGraphPosition;
        this.openLRSideOfRoad = i;
        this.openLROrientation = i2;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final String toString() {
        return "OpenLRPointLocation(position=" + this.position + ", openLRSideOfRoad=" + this.openLRSideOfRoad + ", openLROrientation=" + this.openLROrientation + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OpenLRPointLocation.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        OpenLRPointLocation openLRPointLocation = (OpenLRPointLocation) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.position, openLRPointLocation.position}, getCieXyz.write())).booleanValue() && this.openLRSideOfRoad == openLRPointLocation.openLRSideOfRoad && this.openLROrientation == openLRPointLocation.openLROrientation;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int iHashCode2 = this.position.hashCode();
        return ((((iHashCode2 + (iHashCode * 31)) * 31) + this.openLRSideOfRoad) * 31) + this.openLROrientation;
    }
}
