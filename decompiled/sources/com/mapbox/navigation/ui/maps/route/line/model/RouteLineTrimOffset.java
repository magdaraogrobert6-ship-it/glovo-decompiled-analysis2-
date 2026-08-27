package com.mapbox.navigation.ui.maps.route.line.model;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineTrimOffset {
    public final double offset;

    public final int hashCode() {
        return Double.hashCode(this.offset);
    }

    public final String toString() {
        return "RouteLineTrimOffset(offset=" + this.offset + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RouteLineTrimOffset) {
            return Double.compare(this.offset, ((RouteLineTrimOffset) obj).offset) == 0;
        }
        return false;
    }
}
