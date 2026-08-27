package com.mapbox.navigation.ui.maps.route.callout.api;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.ui.maps.route.callout.model.RouteCallout;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteCalloutUiState {
    public final String layerId;
    public final RouteCallout routeCallout;

    public final int hashCode() {
        return this.layerId.hashCode() + (this.routeCallout.hashCode() * 31);
    }

    public RouteCalloutUiState(RouteCallout routeCallout, String str) {
        this.routeCallout = routeCallout;
        this.layerId = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteCalloutUiState(routeCallout=");
        sb.append(this.routeCallout);
        sb.append(", layerId='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.layerId, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteCalloutUiState.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteCalloutUiState routeCalloutUiState = (RouteCalloutUiState) obj;
        return this.routeCallout.equals(routeCalloutUiState.routeCallout) && this.layerId.equals(routeCalloutUiState.layerId);
    }
}
