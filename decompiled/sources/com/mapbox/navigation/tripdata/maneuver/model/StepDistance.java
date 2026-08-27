package com.mapbox.navigation.tripdata.maneuver.model;

import com.mapbox.navigation.base.formatter.DistanceFormatter;

/* JADX INFO: loaded from: classes2.dex */
public final class StepDistance {
    public final DistanceFormatter distanceFormatter;
    public final Double distanceRemaining;
    public final double totalDistance;

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.totalDistance);
        Double d = this.distanceRemaining;
        return (iHashCode * 31) + (d != null ? d.hashCode() : 0);
    }

    public StepDistance(DistanceFormatter distanceFormatter, double d, Double d2) {
        distanceFormatter.getClass();
        this.distanceFormatter = distanceFormatter;
        this.totalDistance = d;
        this.distanceRemaining = d2;
    }

    public static boolean notEqualDelta(Double d, Double d2) {
        Boolean boolValueOf;
        if (d == null || d2 == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(Math.abs((d.doubleValue() / d2.doubleValue()) - 1.0d) > 0.1d);
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StepDistance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        StepDistance stepDistance = (StepDistance) obj;
        return (notEqualDelta(Double.valueOf(this.totalDistance), Double.valueOf(stepDistance.totalDistance)) || notEqualDelta(this.distanceRemaining, stepDistance.distanceRemaining)) ? false : true;
    }
}
