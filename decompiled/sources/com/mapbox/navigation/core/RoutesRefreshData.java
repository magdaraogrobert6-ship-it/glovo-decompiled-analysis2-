package com.mapbox.navigation.core;

import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.internal.RouteProgressData;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesRefreshData {
    public final ArrayList allRoutesRefreshData;
    public final ArrayList alternativeRoutesProgressData;
    public final NavigationRoute primaryRoute;
    public final RouteProgressData primaryRouteProgressData;

    public final int hashCode() {
        int iHashCode = this.primaryRoute.hashCode();
        return this.alternativeRoutesProgressData.hashCode() + ((this.primaryRouteProgressData.hashCode() + (iHashCode * 31)) * 31);
    }

    public RoutesRefreshData(NavigationRoute navigationRoute, RouteProgressData routeProgressData, ArrayList arrayList) {
        navigationRoute.getClass();
        this.primaryRoute = navigationRoute;
        this.primaryRouteProgressData = routeProgressData;
        this.alternativeRoutesProgressData = arrayList;
        Object[] objArr = {new onViewAttachedToWindowlambda0(navigationRoute, routeProgressData)};
        int iSerializer = getQueryParameterslambda2.serializer();
        this.allRoutesRefreshData = onContentCardDismissed.IconCompatParcelizer(arrayList, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesRefreshData)) {
            return false;
        }
        RoutesRefreshData routesRefreshData = (RoutesRefreshData) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primaryRoute, routesRefreshData.primaryRoute}, getCieXyz.write())).booleanValue() && this.primaryRouteProgressData.equals(routesRefreshData.primaryRouteProgressData) && this.alternativeRoutesProgressData.equals(routesRefreshData.alternativeRoutesProgressData);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutesRefreshData(primaryRoute=");
        sb.append(this.primaryRoute);
        sb.append(", primaryRouteProgressData=");
        sb.append(this.primaryRouteProgressData);
        sb.append(", alternativeRoutesProgressData=");
        return af$$ExternalSyntheticOutline1.m(sb, this.alternativeRoutesProgressData, ')');
    }
}
