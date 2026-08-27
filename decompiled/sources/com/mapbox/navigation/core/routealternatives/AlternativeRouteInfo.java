package com.mapbox.navigation.core.routealternatives;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class AlternativeRouteInfo {
    public final double distance;
    public final double duration;

    public final int hashCode() {
        return Double.hashCode(this.duration) + (Double.hashCode(this.distance) * 31);
    }

    public AlternativeRouteInfo(double d, double d2) {
        this.distance = d;
        this.duration = d2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlternativeRouteInfo(distance=");
        sb.append(this.distance);
        sb.append(", duration=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.duration, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AlternativeRouteInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AlternativeRouteInfo alternativeRouteInfo = (AlternativeRouteInfo) obj;
        return this.distance == alternativeRouteInfo.distance && this.duration == alternativeRouteInfo.duration;
    }
}
