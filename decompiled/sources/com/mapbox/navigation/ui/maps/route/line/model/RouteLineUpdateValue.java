package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineUpdateValue {
    public final List alternativeRouteLinesDynamicData;
    public final RouteLineDynamicData primaryRouteLineDynamicData;
    public final RouteLineDynamicData routeLineMaskingLayerDynamicData;

    public final int hashCode() {
        RouteLineDynamicData routeLineDynamicData = this.primaryRouteLineDynamicData;
        int iM = c8$$ExternalSyntheticOutline0.m(this.alternativeRouteLinesDynamicData, (routeLineDynamicData != null ? routeLineDynamicData.hashCode() : 0) * 31, 31);
        RouteLineDynamicData routeLineDynamicData2 = this.routeLineMaskingLayerDynamicData;
        return iM + (routeLineDynamicData2 != null ? routeLineDynamicData2.hashCode() : 0);
    }

    public RouteLineUpdateValue(RouteLineDynamicData routeLineDynamicData, List list, RouteLineDynamicData routeLineDynamicData2) {
        this.primaryRouteLineDynamicData = routeLineDynamicData;
        this.alternativeRouteLinesDynamicData = list;
        this.routeLineMaskingLayerDynamicData = routeLineDynamicData2;
    }

    public final String toString() {
        return "RouteLineUpdateValue(primaryRouteLineDynamicData=" + this.primaryRouteLineDynamicData + ", alternativeRouteLinesDynamicData=" + this.alternativeRouteLinesDynamicData + ",routeLineMaskingLayerDynamicData=" + this.routeLineMaskingLayerDynamicData + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineUpdateValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLineUpdateValue routeLineUpdateValue = (RouteLineUpdateValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primaryRouteLineDynamicData, routeLineUpdateValue.primaryRouteLineDynamicData}, getCieXyz.write())).booleanValue() || !this.alternativeRouteLinesDynamicData.equals(routeLineUpdateValue.alternativeRouteLinesDynamicData)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineMaskingLayerDynamicData, routeLineUpdateValue.routeLineMaskingLayerDynamicData}, getCieXyz.write())).booleanValue();
    }
}
