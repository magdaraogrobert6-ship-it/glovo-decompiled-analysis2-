package com.mapbox.navigation.base.trip.model.roadobject.location;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.geojson.Geometry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SubgraphEdge {
    public final long id;
    public final List innerEdgeIds;
    public final double length;
    public final List outerEdgeIds;
    public final Geometry shape;

    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.outerEdgeIds, c8$$ExternalSyntheticOutline0.m(this.innerEdgeIds, Long.hashCode(this.id) * 31, 31), 31);
        return Double.hashCode(this.length) + ((this.shape.hashCode() + iM) * 31);
    }

    public SubgraphEdge(long j, List list, List list2, Geometry geometry, double d) {
        this.id = j;
        this.innerEdgeIds = list;
        this.outerEdgeIds = list2;
        this.shape = geometry;
        this.length = d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubgraphEdge(id=");
        sb.append(this.id);
        sb.append(", innerEdgeIds=");
        sb.append(this.innerEdgeIds);
        sb.append(", outerEdgeIds=");
        sb.append(this.outerEdgeIds);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", length=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.length, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SubgraphEdge.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SubgraphEdge subgraphEdge = (SubgraphEdge) obj;
        return this.id == subgraphEdge.id && this.innerEdgeIds.equals(subgraphEdge.innerEdgeIds) && this.outerEdgeIds.equals(subgraphEdge.outerEdgeIds) && this.shape.equals(subgraphEdge.shape) && this.length == subgraphEdge.length;
    }
}
