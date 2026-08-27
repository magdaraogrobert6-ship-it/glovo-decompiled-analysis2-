package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineApiSetRoutesValue extends RouteLineApiEventValue {
    private final int legIndex;
    private final List<LightRouteLine> routeLines;

    public final int getLegIndex() {
        return this.legIndex;
    }

    public final List<LightRouteLine> getRouteLines() {
        return this.routeLines;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineApiSetRoutesValue(int i, List<LightRouteLine> list) {
        super("set_routes");
        list.getClass();
        this.legIndex = i;
        this.routeLines = list;
    }
}
