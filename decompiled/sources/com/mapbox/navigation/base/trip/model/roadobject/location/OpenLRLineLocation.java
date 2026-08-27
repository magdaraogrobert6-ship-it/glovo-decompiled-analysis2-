package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Geometry;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPath;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class OpenLRLineLocation extends RoadObjectLocation {
    public final EHorizonGraphPath graphPath;

    public OpenLRLineLocation(EHorizonGraphPath eHorizonGraphPath, Geometry geometry) {
        super(1, geometry);
        this.graphPath = eHorizonGraphPath;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final String toString() {
        return "OpenLRLineLocation(graphPath=" + this.graphPath + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OpenLRLineLocation.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.graphPath, ((OpenLRLineLocation) obj).graphPath}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final int hashCode() {
        return this.graphPath.hashCode() + (super.hashCode() * 31);
    }
}
