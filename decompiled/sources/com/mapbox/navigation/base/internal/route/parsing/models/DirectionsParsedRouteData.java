package com.mapbox.navigation.base.internal.route.parsing.models;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteOptions;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectionsParsedRouteData {
    public final String requestUUID;
    public final String responseOriginAPI;
    public final DirectionsRoute route;
    public final int routeIndex;
    public final RouteOptions routeOptions;
    public final String routerOrigin;
    public final List routesWaypoint;

    public static DirectionsParsedRouteData copy$default(DirectionsParsedRouteData directionsParsedRouteData, DirectionsRoute directionsRoute, List list) {
        String str = directionsParsedRouteData.requestUUID;
        RouteOptions routeOptions = directionsParsedRouteData.routeOptions;
        int i = directionsParsedRouteData.routeIndex;
        String str2 = directionsParsedRouteData.routerOrigin;
        String str3 = directionsParsedRouteData.responseOriginAPI;
        directionsRoute.getClass();
        return new DirectionsParsedRouteData(directionsRoute, list, str, routeOptions, i, str2, str3);
    }

    public final int hashCode() {
        int iHashCode = this.route.hashCode();
        List list = this.routesWaypoint;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.requestUUID;
        return this.responseOriginAPI.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.routeIndex, (this.routeOptions.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31), 31, this.routerOrigin);
    }

    public DirectionsParsedRouteData(DirectionsRoute directionsRoute, List list, String str, RouteOptions routeOptions, int i, String str2, String str3) {
        this.route = directionsRoute;
        this.routesWaypoint = list;
        this.requestUUID = str;
        this.routeOptions = routeOptions;
        this.routeIndex = i;
        this.routerOrigin = str2;
        this.responseOriginAPI = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsParsedRouteData)) {
            return false;
        }
        DirectionsParsedRouteData directionsParsedRouteData = (DirectionsParsedRouteData) obj;
        if (!this.route.equals(directionsParsedRouteData.route)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routesWaypoint, directionsParsedRouteData.routesWaypoint}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestUUID, directionsParsedRouteData.requestUUID}, getCieXyz.write())).booleanValue() && this.routeOptions.equals(directionsParsedRouteData.routeOptions) && this.routeIndex == directionsParsedRouteData.routeIndex && this.routerOrigin.equals(directionsParsedRouteData.routerOrigin) && this.responseOriginAPI.equals(directionsParsedRouteData.responseOriginAPI);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionsParsedRouteData(route=");
        sb.append(this.route);
        sb.append(", routesWaypoint=");
        sb.append(this.routesWaypoint);
        sb.append(", requestUUID=");
        sb.append(this.requestUUID);
        sb.append(", routeOptions=");
        sb.append(this.routeOptions);
        sb.append(", routeIndex=");
        sb.append(this.routeIndex);
        sb.append(", routerOrigin=");
        sb.append(this.routerOrigin);
        sb.append(", responseOriginAPI=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.responseOriginAPI, ')');
    }
}
