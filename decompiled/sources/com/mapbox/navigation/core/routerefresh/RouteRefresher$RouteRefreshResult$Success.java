package com.mapbox.navigation.core.routerefresh;

import com.mapbox.bindgen.DataRef;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.getCieXyz;
import o.getPageUp;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefresher$RouteRefreshResult$Success extends getPageUp {
    public final DataRef refreshResponse;
    public final NavigationRoute route;

    public final int hashCode() {
        return this.refreshResponse.hashCode() + (this.route.hashCode() * 31);
    }

    public RouteRefresher$RouteRefreshResult$Success(NavigationRoute navigationRoute, DataRef dataRef) {
        navigationRoute.getClass();
        dataRef.getClass();
        this.route = navigationRoute;
        this.refreshResponse = dataRef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteRefresher$RouteRefreshResult$Success)) {
            return false;
        }
        RouteRefresher$RouteRefreshResult$Success routeRefresher$RouteRefreshResult$Success = (RouteRefresher$RouteRefreshResult$Success) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, routeRefresher$RouteRefreshResult$Success.route}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshResponse, routeRefresher$RouteRefreshResult$Success.refreshResponse}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Success(route=" + this.route + ", refreshResponse=" + this.refreshResponse + ')';
    }
}
