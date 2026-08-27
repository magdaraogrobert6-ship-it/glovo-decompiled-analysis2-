package com.mapbox.navigation.base.trip.model.roadobject.location;

import com.mapbox.geojson.Geometry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SubgraphLocation extends RoadObjectLocation {
    public final LinkedHashMap edges;
    public final ArrayList entries;
    public final ArrayList exits;

    public SubgraphLocation(ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap, Geometry geometry) {
        super(7, geometry);
        this.entries = arrayList;
        this.exits = arrayList2;
        this.edges = linkedHashMap;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final String toString() {
        return "SubgraphLocation(entries=" + this.entries + ", exits=" + this.exits + ", edges=" + this.edges + ')';
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SubgraphLocation.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        SubgraphLocation subgraphLocation = (SubgraphLocation) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entries, subgraphLocation.entries}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.exits, subgraphLocation.exits}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.edges, subgraphLocation.edges}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation
    public final int hashCode() {
        return this.edges.hashCode() + r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.exits, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.entries, super.hashCode() * 31, 31), 31);
    }
}
