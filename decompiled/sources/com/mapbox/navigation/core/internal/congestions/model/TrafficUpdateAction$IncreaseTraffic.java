package com.mapbox.navigation.core.internal.congestions.model;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import o.getCieXyz;
import o.ignoreRemeasureRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TrafficUpdateAction$IncreaseTraffic extends ignoreRemeasureRequests {
    public final int expectedCongestion;
    public final RouteLegProgress legProgress;
    public final NavigationRoute route;

    public final int hashCode() {
        int iHashCode = this.route.hashCode();
        return Integer.hashCode(this.expectedCongestion) + ((this.legProgress.hashCode() + (iHashCode * 31)) * 31);
    }

    public TrafficUpdateAction$IncreaseTraffic(NavigationRoute navigationRoute, RouteLegProgress routeLegProgress, int i) {
        navigationRoute.getClass();
        this.route = navigationRoute;
        this.legProgress = routeLegProgress;
        this.expectedCongestion = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficUpdateAction$IncreaseTraffic)) {
            return false;
        }
        TrafficUpdateAction$IncreaseTraffic trafficUpdateAction$IncreaseTraffic = (TrafficUpdateAction$IncreaseTraffic) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, trafficUpdateAction$IncreaseTraffic.route}, getCieXyz.write())).booleanValue() && this.legProgress.equals(trafficUpdateAction$IncreaseTraffic.legProgress) && this.expectedCongestion == trafficUpdateAction$IncreaseTraffic.expectedCongestion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncreaseTraffic(route=");
        sb.append(this.route);
        sb.append(", legProgress=");
        sb.append(this.legProgress);
        sb.append(", expectedCongestion=");
        return af$$ExternalSyntheticOutline0.m(sb, this.expectedCongestion, ')');
    }
}
