package com.sentiance.sdk.publicapi.location;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Coordinates {
    private final double mLatitude;
    private final double mLongitude;

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public Coordinates(double d, double d2) {
        this.mLatitude = d;
        this.mLongitude = d2;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return Double.compare(this.mLatitude, coordinates.mLatitude) == 0 && Double.compare(this.mLongitude, coordinates.mLongitude) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinates{mLatitude=");
        sb.append(this.mLatitude);
        sb.append(", mLongitude=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.mLongitude, '}');
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mLatitude), Double.valueOf(this.mLongitude));
    }
}
