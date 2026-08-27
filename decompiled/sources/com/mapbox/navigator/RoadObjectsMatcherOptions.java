package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileDataDomain;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class RoadObjectsMatcherOptions implements Serializable {
    private final TileDataDomain matchingGraphType;
    private final Double openlrMaxDistanceToNode;

    public TileDataDomain getMatchingGraphType() {
        return this.matchingGraphType;
    }

    public Double getOpenlrMaxDistanceToNode() {
        return this.openlrMaxDistanceToNode;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.openlrMaxDistanceToNode, this.matchingGraphType);
    }

    public RoadObjectsMatcherOptions(Double d, TileDataDomain tileDataDomain) {
        this.openlrMaxDistanceToNode = d;
        this.matchingGraphType = tileDataDomain;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[openlrMaxDistanceToNode: ");
        af$$ExternalSyntheticOutline1.m(this.openlrMaxDistanceToNode, sb, ", matchingGraphType: ");
        sb.append(RecordUtils.fieldToString(this.matchingGraphType));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectsMatcherOptions roadObjectsMatcherOptions = (RoadObjectsMatcherOptions) obj;
        return Objects.equals(this.openlrMaxDistanceToNode, roadObjectsMatcherOptions.openlrMaxDistanceToNode) && Objects.equals(this.matchingGraphType, roadObjectsMatcherOptions.matchingGraphType);
    }
}
