package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewEvent extends RouteLineEvent {
    private final RouteLineViewEventValue value;

    public final RouteLineViewEventValue getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewEvent(String str, RouteLineViewEventValue routeLineViewEventValue) {
        super("view", str);
        str.getClass();
        routeLineViewEventValue.getClass();
        this.value = routeLineViewEventValue;
    }
}
