package com.mapbox.navigation.base.internal.trip.model;

import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteIndices {
    public final int intersectionIndex;
    public final boolean isForkPointPassed;
    public final int legGeometryIndex;
    public final int legIndex;
    public final int routeGeometryIndex;
    public final int stepIndex;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.legIndex);
        int i = this.stepIndex;
        int i2 = this.routeGeometryIndex;
        int i3 = this.legGeometryIndex;
        return Boolean.hashCode(this.isForkPointPassed) + (((((((((iHashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + this.intersectionIndex) * 31);
    }

    public RouteIndices(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.legIndex = i;
        this.stepIndex = i2;
        this.routeGeometryIndex = i3;
        this.legGeometryIndex = i4;
        this.intersectionIndex = i5;
        this.isForkPointPassed = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteIndices(legIndex=");
        sb.append(this.legIndex);
        sb.append(", stepIndex=");
        sb.append(this.stepIndex);
        sb.append(", routeGeometryIndex=");
        sb.append(this.routeGeometryIndex);
        sb.append(", legGeometryIndex=");
        sb.append(this.legGeometryIndex);
        sb.append(", intersectionIndex=");
        sb.append(this.intersectionIndex);
        sb.append(", isForkPointPassed=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isForkPointPassed, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteIndices.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteIndices routeIndices = (RouteIndices) obj;
        return this.legIndex == routeIndices.legIndex && this.stepIndex == routeIndices.stepIndex && this.routeGeometryIndex == routeIndices.routeGeometryIndex && this.legGeometryIndex == routeIndices.legGeometryIndex && this.intersectionIndex == routeIndices.intersectionIndex && this.isForkPointPassed == routeIndices.isForkPointPassed;
    }
}
