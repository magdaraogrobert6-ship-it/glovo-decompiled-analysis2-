package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteFeatureData {
    public final int coordinatesCount;
    public final FeatureCollection reversedFeatureCollection;
    public final NavigationRoute route;

    public final int hashCode() {
        int iHashCode = this.route.hashCode();
        return Integer.hashCode(this.coordinatesCount) + ((this.reversedFeatureCollection.hashCode() + (iHashCode * 31)) * 31);
    }

    public RouteFeatureData(NavigationRoute navigationRoute, FeatureCollection featureCollection, int i) {
        navigationRoute.getClass();
        this.route = navigationRoute;
        this.reversedFeatureCollection = featureCollection;
        this.coordinatesCount = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteFeatureData)) {
            return false;
        }
        RouteFeatureData routeFeatureData = (RouteFeatureData) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, routeFeatureData.route}, getCieXyz.write())).booleanValue() && this.reversedFeatureCollection.equals(routeFeatureData.reversedFeatureCollection) && this.coordinatesCount == routeFeatureData.coordinatesCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteFeatureData(route=");
        sb.append(this.route);
        sb.append(", reversedFeatureCollection=");
        sb.append(this.reversedFeatureCollection);
        sb.append(", coordinatesCount=");
        return af$$ExternalSyntheticOutline0.m(sb, this.coordinatesCount, ')');
    }
}
