package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Geometry;
import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GantryLocation extends RoadObjectLocation {
    public final ArrayList positions;

    public GantryLocation(ArrayList arrayList, Geometry geometry) {
        super(0, geometry);
        this.positions = arrayList;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final String toString() {
        return "GantryLocation(positions=" + this.positions + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!GantryLocation.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.positions, ((GantryLocation) obj).positions}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final int hashCode() {
        return this.positions.hashCode() + (super.hashCode() * 31);
    }
}
