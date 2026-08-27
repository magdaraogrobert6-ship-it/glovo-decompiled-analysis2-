package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineApiUpdateTraveledRouteLineValue extends RouteLineApiEventValue {
    private final Point point;

    public final Point getPoint() {
        return this.point;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiUpdateTraveledRouteLineValue(Point point) {
        super("update_traveled_route_line");
        point.getClass();
        this.point = point;
    }
}
