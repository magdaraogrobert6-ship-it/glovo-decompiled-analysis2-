package com.mapbox.navigation.ui.maps.route.line.model;

import com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder;

/* JADX INFO: loaded from: classes2.dex */
public final class VanishingRouteLineExpressions {
    public final RouteLineValueCommandHolder restrictedRoadExpressionCommandHolder;
    public final RouteLineValueCommandHolder routeLineCasingExpressionCommandHolder;
    public final RouteLineValueCommandHolder routeLineValueCommandHolder;
    public final RouteLineValueCommandHolder trafficLineExpressionCommandHolder;

    public final int hashCode() {
        int iHashCode = this.trafficLineExpressionCommandHolder.hashCode();
        int iHashCode2 = this.routeLineValueCommandHolder.hashCode();
        return (this.restrictedRoadExpressionCommandHolder.hashCode() + ((this.routeLineCasingExpressionCommandHolder.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 961;
    }

    public VanishingRouteLineExpressions(RouteLineValueCommandHolder routeLineValueCommandHolder, RouteLineValueCommandHolder routeLineValueCommandHolder2, RouteLineValueCommandHolder routeLineValueCommandHolder3, RouteLineValueCommandHolder routeLineValueCommandHolder4) {
        this.trafficLineExpressionCommandHolder = routeLineValueCommandHolder;
        this.routeLineValueCommandHolder = routeLineValueCommandHolder2;
        this.routeLineCasingExpressionCommandHolder = routeLineValueCommandHolder3;
        this.restrictedRoadExpressionCommandHolder = routeLineValueCommandHolder4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VanishingRouteLineExpressions)) {
            return false;
        }
        VanishingRouteLineExpressions vanishingRouteLineExpressions = (VanishingRouteLineExpressions) obj;
        return this.trafficLineExpressionCommandHolder == vanishingRouteLineExpressions.trafficLineExpressionCommandHolder && this.routeLineValueCommandHolder == vanishingRouteLineExpressions.routeLineValueCommandHolder && this.routeLineCasingExpressionCommandHolder == vanishingRouteLineExpressions.routeLineCasingExpressionCommandHolder && this.restrictedRoadExpressionCommandHolder == vanishingRouteLineExpressions.restrictedRoadExpressionCommandHolder;
    }

    public final String toString() {
        return "VanishingRouteLineExpressions(trafficLineExpressionCommandHolder=" + this.trafficLineExpressionCommandHolder + ", routeLineValueCommandHolder=" + this.routeLineValueCommandHolder + ", routeLineCasingExpressionCommandHolder=" + this.routeLineCasingExpressionCommandHolder + ", restrictedRoadExpressionCommandHolder=" + this.restrictedRoadExpressionCommandHolder + ", trailExpressionCommandHolder=null, trailCasingExpressionCommandHolder=null)";
    }
}
