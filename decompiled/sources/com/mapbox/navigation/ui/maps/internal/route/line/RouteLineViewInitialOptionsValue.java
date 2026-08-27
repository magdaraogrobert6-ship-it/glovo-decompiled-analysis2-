package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewInitialOptionsValue extends RouteLineViewEventValue {
    private final RouteLineViewOptionsData initialOptions;

    public final RouteLineViewOptionsData getInitialOptions() {
        return this.initialOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewInitialOptionsValue(RouteLineViewOptionsData routeLineViewOptionsData) {
        super("initial_options");
        routeLineViewOptionsData.getClass();
        this.initialOptions = routeLineViewOptionsData;
    }
}
