package com.sentiance.sdk.eventtimeline.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class TripLocation {
    private final Float accuracy;
    private final Double altitude;
    private final Float bearing;
    private final Float bearingAccuracy;
    private final double latitude;
    private final double longitude;
    private final Float speed;
    private final Float speedAccuracy;
    private final long timestamp;
    private final TransportMode transportMode;
    private final Float verticalAccuracy;

    public Float getAccuracy() {
        return this.accuracy;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Float getBearing() {
        return this.bearing;
    }

    public Float getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public Float getSpeed() {
        return this.speed;
    }

    public Float getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public TransportMode getTransportMode() {
        return this.transportMode;
    }

    public Float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    @DontObfuscate
    public static class Builder {
        private Float accuracy;
        private Double altitude;
        private Float bearing;
        private Float bearingAccuracy;
        private double latitude;
        private double longitude;
        private Float speed;
        private Float speedAccuracy;
        private long timestamp;
        private TransportMode transportMode;
        private Float verticalAccuracy;

        public Builder latitude(double d) {
            this.latitude = d;
            return this;
        }

        public Builder longitude(double d) {
            this.longitude = d;
            return this;
        }

        public Builder timestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public Builder transportMode(TransportMode transportMode) {
            this.transportMode = transportMode;
            return this;
        }

        public Builder(double d, double d2, long j, TransportMode transportMode) {
            latitude(d).longitude(d2).timestamp(j).transportMode(transportMode);
        }

        public Builder accuracy(float f) {
            this.accuracy = Float.valueOf(f);
            return this;
        }

        public Builder altitude(double d) {
            this.altitude = Double.valueOf(d);
            return this;
        }

        public Builder bearing(float f) {
            this.bearing = Float.valueOf(f);
            return this;
        }

        public Builder bearingAccuracy(float f) {
            this.bearingAccuracy = Float.valueOf(f);
            return this;
        }

        public Builder speed(float f) {
            this.speed = Float.valueOf(f);
            return this;
        }

        public Builder speedAccuracy(float f) {
            this.speedAccuracy = Float.valueOf(f);
            return this;
        }

        public Builder verticalAccuracy(float f) {
            this.verticalAccuracy = Float.valueOf(f);
            return this;
        }

        public TripLocation build() {
            return new TripLocation(this.latitude, this.longitude, this.timestamp, this.accuracy, this.altitude, this.speed, this.bearing, this.bearingAccuracy, this.speedAccuracy, this.verticalAccuracy, this.transportMode);
        }
    }

    private TripLocation(double d, double d2, long j, Float f, Double d3, Float f2, Float f3, Float f4, Float f5, Float f6, TransportMode transportMode) {
        this.latitude = d;
        this.longitude = d2;
        this.timestamp = j;
        this.accuracy = f;
        this.altitude = d3;
        this.speed = f2;
        this.bearing = f3;
        this.bearingAccuracy = f4;
        this.speedAccuracy = f5;
        this.verticalAccuracy = f6;
        this.transportMode = transportMode;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TripLocation tripLocation = (TripLocation) obj;
        return Double.compare(this.latitude, tripLocation.latitude) == 0 && Double.compare(this.longitude, tripLocation.longitude) == 0 && this.timestamp == tripLocation.timestamp && Objects.equals(this.accuracy, tripLocation.accuracy) && Objects.equals(this.altitude, tripLocation.altitude) && Objects.equals(this.speed, tripLocation.speed) && Objects.equals(this.bearing, tripLocation.bearing) && Objects.equals(this.bearingAccuracy, tripLocation.bearingAccuracy) && Objects.equals(this.speedAccuracy, tripLocation.speedAccuracy) && Objects.equals(this.verticalAccuracy, tripLocation.verticalAccuracy) && this.transportMode == tripLocation.transportMode;
    }

    public String toString() {
        return "TripLocation{latitude=" + this.latitude + ", longitude=" + this.longitude + ", timestamp=" + this.timestamp + ", transportMode=" + this.transportMode + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", speed=" + this.speed + ", bearing=" + this.bearing + ", bearingAccuracy=" + this.bearingAccuracy + ", speedAccuracy=" + this.speedAccuracy + ", verticalAccuracy=" + this.verticalAccuracy + '}';
    }

    public int hashCode() {
        double d = this.latitude;
        double d2 = this.longitude;
        long j = this.timestamp;
        return Objects.hash(Double.valueOf(d), Double.valueOf(d2), Long.valueOf(j), this.accuracy, this.altitude, this.speed, this.bearing, this.bearingAccuracy, this.speedAccuracy, this.verticalAccuracy, this.transportMode);
    }
}
