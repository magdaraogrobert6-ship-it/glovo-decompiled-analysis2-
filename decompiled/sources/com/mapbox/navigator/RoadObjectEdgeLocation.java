package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public class RoadObjectEdgeLocation implements Serializable {
    private final double percentAlongBegin;
    private final double percentAlongEnd;

    public double getPercentAlongBegin() {
        return this.percentAlongBegin;
    }

    public double getPercentAlongEnd() {
        return this.percentAlongEnd;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObjectEdgeLocation(double d, double d2) {
        this.percentAlongBegin = d;
        this.percentAlongEnd = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[percentAlongBegin: ");
        m1$$ExternalSyntheticOutline0.m(this.percentAlongBegin, ", percentAlongEnd: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.percentAlongEnd, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.percentAlongBegin), Double.valueOf(this.percentAlongEnd));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectEdgeLocation roadObjectEdgeLocation = (RoadObjectEdgeLocation) obj;
        return PartialEq.compare(this.percentAlongBegin, roadObjectEdgeLocation.percentAlongBegin) && PartialEq.compare(this.percentAlongEnd, roadObjectEdgeLocation.percentAlongEnd);
    }
}
