package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Geometry;
import java.util.ArrayList;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class PolygonLocation extends RoadObjectLocation {
    public final ArrayList entries;
    public final ArrayList exits;

    public PolygonLocation(ArrayList arrayList, ArrayList arrayList2, Geometry geometry) {
        super(4, geometry);
        this.entries = arrayList;
        this.exits = arrayList2;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final String toString() {
        return "PolygonLocation(entries=" + this.entries + ", exits=" + this.exits + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PolygonLocation.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        PolygonLocation polygonLocation = (PolygonLocation) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entries, polygonLocation.entries}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.exits, polygonLocation.exits}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final int hashCode() {
        return this.exits.hashCode() + r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.entries, super.hashCode() * 31, 31);
    }
}
