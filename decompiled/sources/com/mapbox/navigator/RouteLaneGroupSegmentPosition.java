package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class RouteLaneGroupSegmentPosition implements Serializable {
    private final double edgePercentAlong;
    private final long segmentOnRoute;

    public double getEdgePercentAlong() {
        return this.edgePercentAlong;
    }

    public long getSegmentOnRoute() {
        return this.segmentOnRoute;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLaneGroupSegmentPosition(double d, long j) {
        this.edgePercentAlong = d;
        this.segmentOnRoute = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[edgePercentAlong: ");
        m1$$ExternalSyntheticOutline0.m(this.edgePercentAlong, ", segmentOnRoute: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.segmentOnRoute, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.edgePercentAlong), Long.valueOf(this.segmentOnRoute));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneGroupSegmentPosition routeLaneGroupSegmentPosition = (RouteLaneGroupSegmentPosition) obj;
        return PartialEq.compare(this.edgePercentAlong, routeLaneGroupSegmentPosition.edgePercentAlong) && this.segmentOnRoute == routeLaneGroupSegmentPosition.segmentOnRoute;
    }
}
