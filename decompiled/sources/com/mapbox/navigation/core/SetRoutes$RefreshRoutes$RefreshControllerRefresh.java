package com.mapbox.navigation.core;

import com.mapbox.navigation.core.routerefresh.RoutesRefresherResult;
import o.getCieXyz;
import o.getGetScrollViewportLength;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SetRoutes$RefreshRoutes$RefreshControllerRefresh extends getGetScrollViewportLength {
    public final RoutesRefresherResult routeRefreshResult;

    public final int hashCode() {
        return this.routeRefreshResult.hashCode();
    }

    public SetRoutes$RefreshRoutes$RefreshControllerRefresh(RoutesRefresherResult routesRefresherResult) {
        routesRefresherResult.getClass();
        this.routeRefreshResult = routesRefresherResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetRoutes$RefreshRoutes$RefreshControllerRefresh)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeRefreshResult, ((SetRoutes$RefreshRoutes$RefreshControllerRefresh) obj).routeRefreshResult}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RefreshControllerRefresh(routeRefreshResult=" + this.routeRefreshResult + ')';
    }
}
