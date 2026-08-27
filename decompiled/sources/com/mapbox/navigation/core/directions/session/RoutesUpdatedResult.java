package com.mapbox.navigation.core.directions.session;

import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesUpdatedResult {
    public final List ignoredRoutes;
    public final List navigationRoutes;
    public final String reason;

    public final List getNavigationRoutes() {
        return this.navigationRoutes;
    }

    public final int hashCode() {
        return this.reason.hashCode() + (this.navigationRoutes.hashCode() * 31);
    }

    public RoutesUpdatedResult(String str, List list, List list2) {
        this.navigationRoutes = list;
        this.ignoredRoutes = list2;
        this.reason = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutesUpdatedResult(reason='");
        sb.append(this.reason);
        sb.append("', navigationRoutes=");
        sb.append(this.navigationRoutes);
        sb.append(", ignoredRoutes=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.ignoredRoutes, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutesUpdatedResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoutesUpdatedResult routesUpdatedResult = (RoutesUpdatedResult) obj;
        return this.navigationRoutes.equals(routesUpdatedResult.navigationRoutes) && this.reason.equals(routesUpdatedResult.reason);
    }
}
