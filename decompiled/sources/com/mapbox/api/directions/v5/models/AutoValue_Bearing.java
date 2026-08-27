package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Bearing extends Bearing {
    private final double angle;
    private final double degrees;
    private final Map<String, SerializableJsonElement> unrecognized;

    @Override // com.mapbox.api.directions.v5.models.Bearing
    public double angle() {
        return this.angle;
    }

    @Override // com.mapbox.api.directions.v5.models.Bearing
    public double degrees() {
        return this.degrees;
    }

    @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
    public Map<String, SerializableJsonElement> unrecognized() {
        return this.unrecognized;
    }

    public static final class Builder extends Bearing.Builder {
        private Double angle;
        private Double degrees;
        private Map<String, SerializableJsonElement> unrecognized;

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
            return unrecognized((Map<String, SerializableJsonElement>) map);
        }

        @Override // com.mapbox.api.directions.v5.models.Bearing.Builder
        public Bearing.Builder angle(double d) {
            this.angle = Double.valueOf(d);
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.Bearing.Builder
        public Bearing.Builder degrees(double d) {
            this.degrees = Double.valueOf(d);
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public Bearing.Builder unrecognized(Map<String, SerializableJsonElement> map) {
            this.unrecognized = map;
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.Bearing.Builder
        public Bearing build() {
            String strConcat = this.angle == null ? " angle" : "";
            if (this.degrees == null) {
                strConcat = strConcat.concat(" degrees");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_Bearing(this.unrecognized, this.angle.doubleValue(), this.degrees.doubleValue());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    private AutoValue_Bearing(Map<String, SerializableJsonElement> map, double d, double d2) {
        this.unrecognized = map;
        this.angle = d;
        this.degrees = d2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bearing)) {
            return false;
        }
        Bearing bearing = (Bearing) obj;
        Map<String, SerializableJsonElement> map = this.unrecognized;
        if (map == null) {
            if (bearing.unrecognized() != null) {
                return false;
            }
        } else if (!map.equals(bearing.unrecognized())) {
            return false;
        }
        return Double.doubleToLongBits(this.angle) == Double.doubleToLongBits(bearing.angle()) && Double.doubleToLongBits(this.degrees) == Double.doubleToLongBits(bearing.degrees());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Bearing{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", angle=");
        sb.append(this.angle);
        sb.append(", degrees=");
        return ff$$ExternalSyntheticOutline0.m(this.degrees, "}", sb);
    }

    public int hashCode() {
        Map<String, SerializableJsonElement> map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.angle) >>> 32) ^ Double.doubleToLongBits(this.angle)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.degrees) >>> 32) ^ Double.doubleToLongBits(this.degrees)));
    }
}
