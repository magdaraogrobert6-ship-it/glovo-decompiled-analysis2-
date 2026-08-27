package com.huawei.riemann.location.common.bean;

import android.location.Location;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class LocationInfo {
    private static final String TAG = "LocationInfo";
    private double accuracy;
    private double altitude;
    private double bearing;
    private double bootTime;
    private double latitude;
    private double longitude;
    private double speed;
    private double utcMs;

    public double getAccuracy() {
        return this.accuracy;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getBearing() {
        return this.bearing;
    }

    public double getBootTime() {
        return this.bootTime;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getUtcMs() {
        return this.utcMs;
    }

    public static final class Builder {
        private double accuracy;
        private double altitude;
        private double bearing;
        private double bootTime;
        private double latitude;
        private double longitude;
        private double speed;
        private double utcMs;

        private Builder() {
        }

        public Builder withAccuracy(double d) {
            this.accuracy = d;
            return this;
        }

        public Builder withAltitude(double d) {
            this.altitude = d;
            return this;
        }

        public Builder withBearing(double d) {
            this.bearing = d;
            return this;
        }

        public Builder withBootTime(double d) {
            this.bootTime = d;
            return this;
        }

        public Builder withLatitude(double d) {
            this.latitude = d;
            return this;
        }

        public Builder withLongitude(double d) {
            this.longitude = d;
            return this;
        }

        public Builder withSpeed(double d) {
            this.speed = d;
            return this;
        }

        public Builder withUtcMs(double d) {
            this.utcMs = d;
            return this;
        }

        public LocationInfo build() {
            return new LocationInfo(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocationInfo{bootTime=");
        sb.append(this.bootTime);
        sb.append("utcMs=");
        sb.append(this.utcMs);
        sb.append(", bearing=");
        sb.append(this.bearing);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", accuracy=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.accuracy, '}');
    }

    private LocationInfo(Builder builder) {
        this.bootTime = 0.0d;
        this.utcMs = 0.0d;
        this.longitude = 0.0d;
        this.latitude = 0.0d;
        this.bearing = 0.0d;
        this.speed = 0.0d;
        this.accuracy = 0.0d;
        this.altitude = 0.0d;
        this.bootTime = builder.bootTime;
        this.utcMs = builder.utcMs;
        this.longitude = builder.longitude;
        this.latitude = builder.latitude;
        this.bearing = builder.bearing;
        this.speed = builder.speed;
        this.accuracy = builder.accuracy;
        this.altitude = builder.altitude;
    }

    public static Builder newBuilder(Location location) {
        if (location == null) {
            WrappedCompositionsetContent1211.read(TAG, "null location, builder failed!");
            return new Builder();
        }
        return new Builder().withLongitude(location.getLongitude()).withLatitude(location.getLatitude()).withAltitude(location.getAltitude()).withBearing(location.getBearing()).withSpeed(location.getSpeed()).withBootTime(location.getElapsedRealtimeNanos() * 1.0E-9d).withUtcMs(location.getTime()).withAccuracy(location.getAccuracy());
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
