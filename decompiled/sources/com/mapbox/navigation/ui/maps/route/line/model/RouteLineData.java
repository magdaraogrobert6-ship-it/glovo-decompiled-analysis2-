package com.mapbox.navigation.ui.maps.route.line.model;

import com.mapbox.geojson.FeatureCollection;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineData {
    public final RouteLineDynamicData dynamicData;
    public final FeatureCollection featureCollection;

    public final int hashCode() {
        int iHashCode = this.featureCollection.hashCode();
        RouteLineDynamicData routeLineDynamicData = this.dynamicData;
        return (iHashCode * 31) + (routeLineDynamicData == null ? 0 : routeLineDynamicData.hashCode());
    }

    public RouteLineData(FeatureCollection featureCollection, RouteLineDynamicData routeLineDynamicData) {
        featureCollection.getClass();
        this.featureCollection = featureCollection;
        this.dynamicData = routeLineDynamicData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineData)) {
            return false;
        }
        RouteLineData routeLineData = (RouteLineData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureCollection, routeLineData.featureCollection}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dynamicData, routeLineData.dynamicData}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RouteLineData(featureCollection=" + this.featureCollection + ", dynamicData=" + this.dynamicData + ')';
    }
}
