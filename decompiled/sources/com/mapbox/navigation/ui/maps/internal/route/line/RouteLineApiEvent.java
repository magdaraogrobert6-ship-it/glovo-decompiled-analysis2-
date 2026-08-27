package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineApiEvent extends RouteLineEvent {
    private final RouteLineApiEventValue value;

    public final RouteLineApiEventValue getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiEvent(String str, RouteLineApiEventValue routeLineApiEventValue) {
        super("api", str);
        str.getClass();
        routeLineApiEventValue.getClass();
        this.value = routeLineApiEventValue;
    }
}
