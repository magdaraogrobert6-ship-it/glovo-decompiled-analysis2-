package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class DistanceInfo implements Serializable {
    private final double distance;
    private final double length;

    public double getDistance() {
        return this.distance;
    }

    public double getLength() {
        return this.length;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public DistanceInfo(double d, double d2) {
        this.distance = d;
        this.length = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distance: ");
        m1$$ExternalSyntheticOutline0.m(this.distance, ", length: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.length, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distance), Double.valueOf(this.length));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistanceInfo distanceInfo = (DistanceInfo) obj;
        return PartialEq.compare(this.distance, distanceInfo.distance) && PartialEq.compare(this.length, distanceInfo.length);
    }
}
