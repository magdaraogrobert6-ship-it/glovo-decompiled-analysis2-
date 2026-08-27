package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class UpcomingRouteAlert implements Serializable {
    private final double distanceToStart;
    private final RoadObject roadObject;

    public double getDistanceToStart() {
        return this.distanceToStart;
    }

    public RoadObject getRoadObject() {
        return this.roadObject;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.roadObject, Double.valueOf(this.distanceToStart));
    }

    public UpcomingRouteAlert(RoadObject roadObject, double d) {
        this.roadObject = roadObject;
        this.distanceToStart = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[roadObject: ");
        sb.append(RecordUtils.fieldToString(this.roadObject));
        sb.append(", distanceToStart: ");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.distanceToStart, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpcomingRouteAlert upcomingRouteAlert = (UpcomingRouteAlert) obj;
        return Objects.equals(this.roadObject, upcomingRouteAlert.roadObject) && PartialEq.compare(this.distanceToStart, upcomingRouteAlert.distanceToStart);
    }
}
