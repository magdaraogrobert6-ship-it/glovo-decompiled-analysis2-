package com.mapbox.navigation.ui.maps.internal.camera;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteIndices {
    public final int legGeometryIndex;
    public final int legIndex;
    public final int stepIndex;

    public final int hashCode() {
        return Integer.hashCode(this.legGeometryIndex) + af$$ExternalSyntheticOutline0.m(this.stepIndex, Integer.hashCode(this.legIndex) * 31, 31);
    }

    public RouteIndices(int i, int i2, int i3) {
        this.legIndex = i;
        this.stepIndex = i2;
        this.legGeometryIndex = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteIndices)) {
            return false;
        }
        RouteIndices routeIndices = (RouteIndices) obj;
        return this.legIndex == routeIndices.legIndex && this.stepIndex == routeIndices.stepIndex && this.legGeometryIndex == routeIndices.legGeometryIndex;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteIndices(legIndex=");
        sb.append(this.legIndex);
        sb.append(", stepIndex=");
        sb.append(this.stepIndex);
        sb.append(", legGeometryIndex=");
        return af$$ExternalSyntheticOutline0.m(sb, this.legGeometryIndex, ')');
    }
}
