package com.mapbox.navigation.tripdata.progress.model;

/* JADX INFO: loaded from: classes2.dex */
public final class TripProgressUpdateValue {
    public final double currentLegTimeRemaining;
    public final double distanceRemaining;
    public final TripProgressUpdateFormatter formatter;

    public final double getCurrentLegTimeRemaining() {
        return this.currentLegTimeRemaining;
    }

    public final double getDistanceRemaining() {
        return this.distanceRemaining;
    }

    public final TripProgressUpdateFormatter getFormatter() {
        return this.formatter;
    }

    public TripProgressUpdateValue(double d, double d2, TripProgressUpdateFormatter tripProgressUpdateFormatter) {
        this.distanceRemaining = d;
        this.currentLegTimeRemaining = d2;
        this.formatter = tripProgressUpdateFormatter;
    }
}
