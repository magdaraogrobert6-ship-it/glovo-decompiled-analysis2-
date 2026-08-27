package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class AlternativeRouteInfo implements Serializable {
    private final double distance;
    private final double duration;

    public double getDistance() {
        return this.distance;
    }

    public double getDuration() {
        return this.duration;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AlternativeRouteInfo(double d, double d2) {
        this.distance = d;
        this.duration = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distance: ");
        m1$$ExternalSyntheticOutline0.m(this.distance, ", duration: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.duration, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distance), Double.valueOf(this.duration));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlternativeRouteInfo alternativeRouteInfo = (AlternativeRouteInfo) obj;
        return PartialEq.compare(this.distance, alternativeRouteInfo.distance) && PartialEq.compare(this.duration, alternativeRouteInfo.duration);
    }
}
