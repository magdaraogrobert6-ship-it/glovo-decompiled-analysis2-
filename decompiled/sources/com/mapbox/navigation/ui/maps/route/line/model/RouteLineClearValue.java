package com.mapbox.navigation.ui.maps.route.line.model;

import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.navigation.ui.maps.internal.route.callout.model.RouteCalloutData;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineClearValue {
    private final List<FeatureCollection> alternativeRoutesSources;
    private final RouteCalloutData callouts;
    private final FeatureCollection primaryRouteSource;
    private final FeatureCollection waypointsSource;

    public final List<FeatureCollection> getAlternativeRoutesSources$ui_maps_release() {
        return this.alternativeRoutesSources;
    }

    public final RouteCalloutData getCallouts$ui_maps_release() {
        return this.callouts;
    }

    public final FeatureCollection getPrimaryRouteSource$ui_maps_release() {
        return this.primaryRouteSource;
    }

    public final FeatureCollection getWaypointsSource$ui_maps_release() {
        return this.waypointsSource;
    }

    public int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.alternativeRoutesSources, this.primaryRouteSource.hashCode() * 31, 31);
        return this.callouts.callouts.hashCode() + ((this.waypointsSource.hashCode() + iM) * 31);
    }

    public RouteLineClearValue(FeatureCollection featureCollection, List<FeatureCollection> list, FeatureCollection featureCollection2, RouteCalloutData routeCalloutData) {
        featureCollection.getClass();
        list.getClass();
        featureCollection2.getClass();
        routeCalloutData.getClass();
        this.primaryRouteSource = featureCollection;
        this.alternativeRoutesSources = list;
        this.waypointsSource = featureCollection2;
        this.callouts = routeCalloutData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineClearValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLineClearValue routeLineClearValue = (RouteLineClearValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primaryRouteSource, routeLineClearValue.primaryRouteSource}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRoutesSources, routeLineClearValue.alternativeRoutesSources}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointsSource, routeLineClearValue.waypointsSource}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callouts, routeLineClearValue.callouts}, getCieXyz.write())).booleanValue();
    }
}
