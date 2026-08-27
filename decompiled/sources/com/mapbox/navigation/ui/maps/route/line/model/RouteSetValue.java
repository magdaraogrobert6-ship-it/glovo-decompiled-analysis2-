package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.navigation.ui.maps.internal.route.callout.model.RouteCalloutData;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteSetValue {
    public final List alternativeRouteLinesData;
    public final RouteCalloutData callouts;
    public final RouteLineData primaryRouteLineData;
    public final RouteLineDynamicData routeLineMaskingLayerDynamicData;
    public final FeatureCollection waypointsSource;

    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.callouts.callouts, (this.waypointsSource.hashCode() + c8$$ExternalSyntheticOutline0.m(this.alternativeRouteLinesData, this.primaryRouteLineData.hashCode() * 31, 31)) * 31, 31);
        RouteLineDynamicData routeLineDynamicData = this.routeLineMaskingLayerDynamicData;
        return iM + (routeLineDynamicData != null ? routeLineDynamicData.hashCode() : 0);
    }

    public RouteSetValue(RouteLineData routeLineData, List list, FeatureCollection featureCollection, RouteCalloutData routeCalloutData, RouteLineDynamicData routeLineDynamicData) {
        featureCollection.getClass();
        routeCalloutData.getClass();
        this.primaryRouteLineData = routeLineData;
        this.alternativeRouteLinesData = list;
        this.waypointsSource = featureCollection;
        this.callouts = routeCalloutData;
        this.routeLineMaskingLayerDynamicData = routeLineDynamicData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteSetValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteSetValue routeSetValue = (RouteSetValue) obj;
        if (!this.primaryRouteLineData.equals(routeSetValue.primaryRouteLineData) || !this.alternativeRouteLinesData.equals(routeSetValue.alternativeRouteLinesData)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointsSource, routeSetValue.waypointsSource}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callouts, routeSetValue.callouts}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineMaskingLayerDynamicData, routeSetValue.routeLineMaskingLayerDynamicData}, getCieXyz.write())).booleanValue();
    }
}
