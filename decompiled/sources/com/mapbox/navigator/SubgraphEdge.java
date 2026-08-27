package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class SubgraphEdge implements Serializable {
    private final long id;
    private final List<Long> innerEdgeIds;
    private final double length;
    private final List<Long> outerEdgeIds;
    private final Geometry shape;

    public long getId() {
        return this.id;
    }

    public List<Long> getInnerEdgeIds() {
        return this.innerEdgeIds;
    }

    public double getLength() {
        return this.length;
    }

    public List<Long> getOuterEdgeIds() {
        return this.outerEdgeIds;
    }

    public Geometry getShape() {
        return this.shape;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SubgraphEdge(long j, List<Long> list, List<Long> list2, Geometry geometry, double d) {
        this.id = j;
        this.innerEdgeIds = list;
        this.outerEdgeIds = list2;
        this.shape = geometry;
        this.length = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        af$$ExternalSyntheticOutline1.m(this.id, ", innerEdgeIds: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.innerEdgeIds, ", outerEdgeIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.outerEdgeIds, ", shape: ");
        sb.append(RecordUtils.fieldToString(this.shape));
        sb.append(", length: ");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.length, "]", sb);
    }

    public int hashCode() {
        long j = this.id;
        return Objects.hash(Long.valueOf(j), this.innerEdgeIds, this.outerEdgeIds, this.shape, Double.valueOf(this.length));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubgraphEdge subgraphEdge = (SubgraphEdge) obj;
        return this.id == subgraphEdge.id && Objects.equals(this.innerEdgeIds, subgraphEdge.innerEdgeIds) && Objects.equals(this.outerEdgeIds, subgraphEdge.outerEdgeIds) && Objects.equals(this.shape, subgraphEdge.shape) && PartialEq.compare(this.length, subgraphEdge.length);
    }
}
