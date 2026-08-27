package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewRenderRouteDrawDataValue extends RouteLineViewWithStyleIdValue {
    private final RouteLineViewExpectedInput input;

    public final RouteLineViewExpectedInput getInput() {
        return this.input;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteDrawDataValue(String str, RouteLineViewExpectedInput routeLineViewExpectedInput) {
        super("render_route_draw_data", str);
        routeLineViewExpectedInput.getClass();
        this.input = routeLineViewExpectedInput;
    }
}
