package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class RouteLaneDivergency implements Serializable {
    private final double length;
    private final long numberOfLanes;

    public double getLength() {
        return this.length;
    }

    public long getNumberOfLanes() {
        return this.numberOfLanes;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLaneDivergency(long j, double d) {
        this.numberOfLanes = j;
        this.length = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[numberOfLanes: ");
        af$$ExternalSyntheticOutline1.m(this.numberOfLanes, ", length: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.length, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.numberOfLanes), Double.valueOf(this.length));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneDivergency routeLaneDivergency = (RouteLaneDivergency) obj;
        return this.numberOfLanes == routeLaneDivergency.numberOfLanes && PartialEq.compare(this.length, routeLaneDivergency.length);
    }
}
