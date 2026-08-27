package com.mapbox.navigation.base.route;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteAlternativesOptions {
    public final long intervalMillis;

    public final int hashCode() {
        return (Long.hashCode(this.intervalMillis) * 31) + 8;
    }

    public RouteAlternativesOptions(long j) {
        this.intervalMillis = j;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(this.intervalMillis, ", avoidManeuverSeconds=8)", new StringBuilder("RouteRefreshOptions(intervalMillis="));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteAlternativesOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.intervalMillis == ((RouteAlternativesOptions) obj).intervalMillis;
    }
}
