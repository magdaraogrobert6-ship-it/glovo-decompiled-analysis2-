package com.mapbox.navigation.core.routerefresh;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesRefresherResult {
    public final ArrayList alternativesRouteRefresherResults;
    public final RouteRefresherResult primaryRouteRefresherResult;

    public final boolean anySuccess() {
        if (this.primaryRouteRefresherResult.status instanceof RouteRefresherStatus$Success) {
            return true;
        }
        ArrayList arrayList = this.alternativesRouteRefresherResults;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((RouteRefresherResult) it.next()).status instanceof RouteRefresherStatus$Success) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.alternativesRouteRefresherResults.hashCode() + (this.primaryRouteRefresherResult.hashCode() * 31);
    }

    public RoutesRefresherResult(RouteRefresherResult routeRefresherResult, ArrayList arrayList) {
        this.primaryRouteRefresherResult = routeRefresherResult;
        this.alternativesRouteRefresherResults = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesRefresherResult)) {
            return false;
        }
        RoutesRefresherResult routesRefresherResult = (RoutesRefresherResult) obj;
        return this.primaryRouteRefresherResult.equals(routesRefresherResult.primaryRouteRefresherResult) && this.alternativesRouteRefresherResults.equals(routesRefresherResult.alternativesRouteRefresherResults);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutesRefresherResult(primaryRouteRefresherResult=");
        sb.append(this.primaryRouteRefresherResult);
        sb.append(", alternativesRouteRefresherResults=");
        return af$$ExternalSyntheticOutline1.m(sb, this.alternativesRouteRefresherResults, ')');
    }
}
