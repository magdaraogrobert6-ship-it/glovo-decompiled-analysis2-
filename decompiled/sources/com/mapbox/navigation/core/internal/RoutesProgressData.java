package com.mapbox.navigation.core.internal;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesProgressData {
    public final LinkedHashMap alternatives;
    public final RouteProgressData primary;

    public final int hashCode() {
        return this.alternatives.hashCode() + (this.primary.hashCode() * 31);
    }

    public RoutesProgressData(RouteProgressData routeProgressData, LinkedHashMap linkedHashMap) {
        this.primary = routeProgressData;
        this.alternatives = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesProgressData)) {
            return false;
        }
        RoutesProgressData routesProgressData = (RoutesProgressData) obj;
        return this.primary.equals(routesProgressData.primary) && this.alternatives.equals(routesProgressData.alternatives);
    }

    public final String toString() {
        return "RoutesProgressData(primary=" + this.primary + ", alternatives=" + this.alternatives + ')';
    }
}
