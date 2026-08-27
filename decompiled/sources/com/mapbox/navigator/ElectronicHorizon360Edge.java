package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class ElectronicHorizon360Edge implements Serializable {
    private final List<Long> branchLinks;
    private final double length;
    private final List<String> roadObjectsOnEdge;

    public List<Long> getBranchLinks() {
        return this.branchLinks;
    }

    public double getLength() {
        return this.length;
    }

    public List<String> getRoadObjectsOnEdge() {
        return this.roadObjectsOnEdge;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        List<Long> list = this.branchLinks;
        double d = this.length;
        return Objects.hash(list, Double.valueOf(d), this.roadObjectsOnEdge);
    }

    public ElectronicHorizon360Edge(List<Long> list, double d, List<String> list2) {
        this.branchLinks = list;
        this.length = d;
        this.roadObjectsOnEdge = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[branchLinks: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.branchLinks, ", length: ");
        m1$$ExternalSyntheticOutline0.m(this.length, ", roadObjectsOnEdge: ", sb);
        return MediaSessionCompatQueueItem.read(this.roadObjectsOnEdge, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizon360Edge electronicHorizon360Edge = (ElectronicHorizon360Edge) obj;
        return Objects.equals(this.branchLinks, electronicHorizon360Edge.branchLinks) && PartialEq.compare(this.length, electronicHorizon360Edge.length) && Objects.equals(this.roadObjectsOnEdge, electronicHorizon360Edge.roadObjectsOnEdge);
    }
}
