package com.mapbox.api.directions.v5.models;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Bearing extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder angle(double d);

        public abstract Bearing build();

        public abstract Builder degrees(double d);
    }

    public abstract double angle();

    public abstract double degrees();

    public static Builder builder() {
        return new AutoValue_Bearing.Builder().angle(45.0d).degrees(90.0d);
    }
}
