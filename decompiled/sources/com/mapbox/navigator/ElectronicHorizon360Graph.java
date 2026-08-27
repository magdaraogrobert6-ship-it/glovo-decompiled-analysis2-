package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class ElectronicHorizon360Graph implements Serializable {
    private final HashMap<Long, ElectronicHorizon360Edge> graph;
    private final long origin;

    public HashMap<Long, ElectronicHorizon360Edge> getGraph() {
        return this.graph;
    }

    public long getOrigin() {
        return this.origin;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizon360Graph(long j, HashMap<Long, ElectronicHorizon360Edge> map) {
        this.origin = j;
        this.graph = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[origin: ");
        af$$ExternalSyntheticOutline1.m(this.origin, ", graph: ", sb);
        sb.append(RecordUtils.fieldToString(this.graph));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.origin;
        return Objects.hash(Long.valueOf(j), this.graph);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizon360Graph electronicHorizon360Graph = (ElectronicHorizon360Graph) obj;
        return this.origin == electronicHorizon360Graph.origin && Objects.equals(this.graph, electronicHorizon360Graph.graph);
    }
}
