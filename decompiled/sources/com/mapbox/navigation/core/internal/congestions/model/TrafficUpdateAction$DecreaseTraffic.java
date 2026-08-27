package com.mapbox.navigation.core.internal.congestions.model;

import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import o.getCieXyz;
import o.ignoreRemeasureRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TrafficUpdateAction$DecreaseTraffic extends ignoreRemeasureRequests {
    public final float currentSpeed;
    public final RouteLegProgress legProgress;
    public final NavigationRoute navigationRoute;

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.currentSpeed);
        return this.navigationRoute.hashCode() + ((this.legProgress.hashCode() + (iHashCode * 31)) * 31);
    }

    public TrafficUpdateAction$DecreaseTraffic(float f, RouteLegProgress routeLegProgress, NavigationRoute navigationRoute) {
        this.currentSpeed = f;
        this.legProgress = routeLegProgress;
        this.navigationRoute = navigationRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficUpdateAction$DecreaseTraffic)) {
            return false;
        }
        TrafficUpdateAction$DecreaseTraffic trafficUpdateAction$DecreaseTraffic = (TrafficUpdateAction$DecreaseTraffic) obj;
        if (!MetersPerSecond.m4783equalsimpl0(this.currentSpeed, trafficUpdateAction$DecreaseTraffic.currentSpeed) || !this.legProgress.equals(trafficUpdateAction$DecreaseTraffic.legProgress)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.navigationRoute, trafficUpdateAction$DecreaseTraffic.navigationRoute}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "DecreaseTraffic(currentSpeed=" + ((Object) MetersPerSecond.m4784toStringimpl(this.currentSpeed)) + ", legProgress=" + this.legProgress + ", navigationRoute=" + this.navigationRoute + ')';
    }
}
