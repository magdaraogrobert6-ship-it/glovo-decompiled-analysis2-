package com.mapbox.navigation.base.options;

/* JADX INFO: loaded from: classes2.dex */
public final class RerouteOptions {
    public final int hashCode() {
        return ((RerouteDisabled.INSTANCE.hashCode() + 248) * 31) - 1;
    }

    public final String toString() {
        return "RerouteOptions(avoidManeuverSeconds=8,rerouteStrategyForMapMatchedRoutes=" + RerouteDisabled.INSTANCE + ",repeatRerouteAfterOffRouteDelaySeconds=-1)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RerouteOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return true;
    }
}
