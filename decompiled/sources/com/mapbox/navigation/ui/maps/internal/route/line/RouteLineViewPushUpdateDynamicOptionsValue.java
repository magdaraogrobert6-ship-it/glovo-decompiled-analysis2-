package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class RouteLineViewPushUpdateDynamicOptionsValue extends RouteLineViewWithStyleIdValue {
    private final RouteLineViewOptionsData newOptions;

    public final RouteLineViewOptionsData getNewOptions() {
        return this.newOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewPushUpdateDynamicOptionsValue(String str, RouteLineViewOptionsData routeLineViewOptionsData) {
        super("update_dynamic_options", str);
        routeLineViewOptionsData.getClass();
        this.newOptions = routeLineViewOptionsData;
    }
}
