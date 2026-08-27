package com.mapbox.navigation.core.internal.congestions.model;

import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.getCieXyz;
import o.ignoreRemeasureRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TrafficUpdateAction$RestoreTraffic extends ignoreRemeasureRequests {
    public final CongestionNumericOverride congestionNumericOverride;
    public final NavigationRoute route;

    public final int hashCode() {
        return this.congestionNumericOverride.hashCode() + (this.route.hashCode() * 31);
    }

    public TrafficUpdateAction$RestoreTraffic(NavigationRoute navigationRoute, CongestionNumericOverride congestionNumericOverride) {
        navigationRoute.getClass();
        this.route = navigationRoute;
        this.congestionNumericOverride = congestionNumericOverride;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficUpdateAction$RestoreTraffic)) {
            return false;
        }
        TrafficUpdateAction$RestoreTraffic trafficUpdateAction$RestoreTraffic = (TrafficUpdateAction$RestoreTraffic) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, trafficUpdateAction$RestoreTraffic.route}, getCieXyz.write())).booleanValue() && this.congestionNumericOverride.equals(trafficUpdateAction$RestoreTraffic.congestionNumericOverride);
    }

    public final String toString() {
        return "RestoreTraffic(route=" + this.route + ", congestionNumericOverride=" + this.congestionNumericOverride + ')';
    }
}
