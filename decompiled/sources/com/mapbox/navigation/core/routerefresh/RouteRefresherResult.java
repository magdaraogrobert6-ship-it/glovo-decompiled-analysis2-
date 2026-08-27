package com.mapbox.navigation.core.routerefresh;

import com.mapbox.navigation.base.route.NavigationRoute;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.getPageLeft;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefresherResult {
    public final NavigationRoute route;
    public final Object routeProgressData;
    public final getPageLeft status;
    public final boolean wasRouteUpdated;

    public static RouteRefresherResult copy$default(RouteRefresherResult routeRefresherResult, NavigationRoute navigationRoute) {
        Object obj = routeRefresherResult.routeProgressData;
        getPageLeft getpageleft = routeRefresherResult.status;
        getpageleft.getClass();
        return new RouteRefresherResult(navigationRoute, obj, getpageleft, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final int hashCode() {
        int iHashCode = this.route.hashCode();
        Object obj = this.routeProgressData;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        int iHashCode3 = this.status.hashCode();
        boolean z = this.wasRouteUpdated;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return ((iHashCode3 + (((iHashCode * 31) + iHashCode2) * 31)) * 31) + r3;
    }

    public RouteRefresherResult(NavigationRoute navigationRoute, Object obj, getPageLeft getpageleft, boolean z) {
        navigationRoute.getClass();
        getpageleft.getClass();
        this.route = navigationRoute;
        this.routeProgressData = obj;
        this.status = getpageleft;
        this.wasRouteUpdated = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteRefresherResult)) {
            return false;
        }
        RouteRefresherResult routeRefresherResult = (RouteRefresherResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, routeRefresherResult.route}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeProgressData, routeRefresherResult.routeProgressData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, routeRefresherResult.status}, getCieXyz.write())).booleanValue() && this.wasRouteUpdated == routeRefresherResult.wasRouteUpdated;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteRefresherResult(route=");
        sb.append(this.route);
        sb.append(", routeProgressData=");
        sb.append(this.routeProgressData);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", wasRouteUpdated=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.wasRouteUpdated, ')');
    }

    public /* synthetic */ RouteRefresherResult(NavigationRoute navigationRoute, Object obj, getPageLeft getpageleft) {
        this(navigationRoute, obj, getpageleft, getpageleft instanceof RouteRefresherStatus$Success);
    }
}
