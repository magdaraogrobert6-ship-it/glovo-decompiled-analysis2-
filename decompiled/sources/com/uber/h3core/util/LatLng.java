package com.uber.h3core.util;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class LatLng {
    public final double lat;
    public final double lng;

    public LatLng(double d, double d2) {
        this.lat = d;
        this.lng = d2;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.lat), Double.valueOf(this.lng));
    }

    public final String toString() {
        return String.format("LatLng{lat=%f, lng=%f}", Double.valueOf(this.lat), Double.valueOf(this.lng));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LatLng.class != obj.getClass()) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.compare(latLng.lat, this.lat) == 0 && Double.compare(latLng.lng, this.lng) == 0;
    }
}
