package com.mapbox.navigation.core.directions.session;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IgnoredRoute {
    public final NavigationRoute navigationRoute;
    public final String reason;

    public final int hashCode() {
        return this.reason.hashCode() + (this.navigationRoute.hashCode() * 31);
    }

    public IgnoredRoute(NavigationRoute navigationRoute, String str) {
        navigationRoute.getClass();
        this.navigationRoute = navigationRoute;
        this.reason = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IgnoredRoute(navigationRoute=");
        sb.append(this.navigationRoute);
        sb.append(", reason='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.reason, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IgnoredRoute.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        IgnoredRoute ignoredRoute = (IgnoredRoute) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.navigationRoute, ignoredRoute.navigationRoute}, getCieXyz.write())).booleanValue() && this.reason.equals(ignoredRoute.reason);
    }
}
