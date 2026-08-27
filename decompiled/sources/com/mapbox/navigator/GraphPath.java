package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class GraphPath implements Serializable {
    private final List<Long> edges;
    private final double length;
    private final double percentAlongBegin;
    private final double percentAlongEnd;

    public List<Long> getEdges() {
        return this.edges;
    }

    public double getLength() {
        return this.length;
    }

    public double getPercentAlongBegin() {
        return this.percentAlongBegin;
    }

    public double getPercentAlongEnd() {
        return this.percentAlongEnd;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.edges, Double.valueOf(this.percentAlongBegin), Double.valueOf(this.percentAlongEnd), Double.valueOf(this.length));
    }

    public GraphPath(List<Long> list, double d, double d2, double d3) {
        this.edges = list;
        this.percentAlongBegin = d;
        this.percentAlongEnd = d2;
        this.length = d3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[edges: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.edges, ", percentAlongBegin: ");
        m1$$ExternalSyntheticOutline0.m(this.percentAlongBegin, ", percentAlongEnd: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.percentAlongEnd, ", length: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.length, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphPath graphPath = (GraphPath) obj;
        return Objects.equals(this.edges, graphPath.edges) && PartialEq.compare(this.percentAlongBegin, graphPath.percentAlongBegin) && PartialEq.compare(this.percentAlongEnd, graphPath.percentAlongEnd) && PartialEq.compare(this.length, graphPath.length);
    }
}
