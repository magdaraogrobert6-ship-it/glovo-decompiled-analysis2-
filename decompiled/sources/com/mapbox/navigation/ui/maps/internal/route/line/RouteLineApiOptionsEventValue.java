package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineApiOptionsEventValue extends RouteLineApiEventValue {
    private final MapboxRouteLineApiOptions options;

    public final MapboxRouteLineApiOptions getOptions() {
        return this.options;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiOptionsEventValue(MapboxRouteLineApiOptions mapboxRouteLineApiOptions) {
        super("options");
        mapboxRouteLineApiOptions.getClass();
        this.options = mapboxRouteLineApiOptions;
    }
}
