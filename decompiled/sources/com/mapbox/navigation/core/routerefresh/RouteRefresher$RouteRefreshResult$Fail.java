package com.mapbox.navigation.core.routerefresh;

import com.mapbox.navigation.core.internal.router.NavigationRouterRefreshError;
import o.getPageUp;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefresher$RouteRefreshResult$Fail extends getPageUp {
    public final NavigationRouterRefreshError error;

    public final int hashCode() {
        return this.error.hashCode();
    }

    public RouteRefresher$RouteRefreshResult$Fail(NavigationRouterRefreshError navigationRouterRefreshError) {
        this.error = navigationRouterRefreshError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteRefresher$RouteRefreshResult$Fail) && this.error.equals(((RouteRefresher$RouteRefreshResult$Fail) obj).error);
    }

    public final String toString() {
        return "Fail(error=" + this.error + ')';
    }
}
