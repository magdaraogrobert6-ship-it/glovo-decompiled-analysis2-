package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class GraphPosition implements Serializable {
    private final long edgeId;
    private final double percentAlong;

    public long getEdgeId() {
        return this.edgeId;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GraphPosition(long j, double d) {
        this.edgeId = j;
        this.percentAlong = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[edgeId: ");
        af$$ExternalSyntheticOutline1.m(this.edgeId, ", percentAlong: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.percentAlong, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.edgeId), Double.valueOf(this.percentAlong));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphPosition graphPosition = (GraphPosition) obj;
        return this.edgeId == graphPosition.edgeId && PartialEq.compare(this.percentAlong, graphPosition.percentAlong);
    }
}
