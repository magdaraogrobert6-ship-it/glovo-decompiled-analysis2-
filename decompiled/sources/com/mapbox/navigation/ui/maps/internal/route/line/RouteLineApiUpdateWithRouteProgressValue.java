package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.navigation.base.trip.model.RouteProgressState;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineApiUpdateWithRouteProgressValue extends RouteLineApiEventValue {
    private final Integer legIndex;
    private final int routeGeometryIndex;
    private final String routeId;
    private final RouteProgressState state;

    public final Integer getLegIndex() {
        return this.legIndex;
    }

    public final int getRouteGeometryIndex() {
        return this.routeGeometryIndex;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public final RouteProgressState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiUpdateWithRouteProgressValue(String str, int i, RouteProgressState routeProgressState, Integer num) {
        super("update_with_route_progress");
        str.getClass();
        routeProgressState.getClass();
        this.routeId = str;
        this.routeGeometryIndex = i;
        this.state = routeProgressState;
        this.legIndex = num;
    }
}
