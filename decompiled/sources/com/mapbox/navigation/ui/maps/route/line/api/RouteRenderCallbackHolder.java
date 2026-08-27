package com.mapbox.navigation.ui.maps.route.line.api;

import androidx.compose.material.ripple.RippleHostMap;
import com.mapbox.common.Cancelable;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRenderCallbackHolder {
    public final LinkedHashSet allRouteIds;
    public final RoutesRenderedCallback callback;
    public final Set clearedRouteIdsToNotify;
    public final LinkedHashSet clearingCancelledRouteIds;
    public final RippleHostMap expectedRoutes;
    public final Set renderedRouteIdsToNotify;
    public final LinkedHashSet renderingCancelledRouteIds;
    public final Cancelable subscription;
    public final LinkedHashSet successfulRouteIds;

    public RouteRenderCallbackHolder(RoutesRenderedCallback routesRenderedCallback, Set set, Set set2, RippleHostMap rippleHostMap, Cancelable cancelable) {
        cancelable.getClass();
        this.callback = routesRenderedCallback;
        this.renderedRouteIdsToNotify = set;
        this.clearedRouteIdsToNotify = set2;
        this.expectedRoutes = rippleHostMap;
        this.subscription = cancelable;
        this.allRouteIds = RangesKt.read(rippleHostMap.getAllRenderedRouteIds(), rippleHostMap.getAllClearedRouteIds());
        this.successfulRouteIds = new LinkedHashSet();
        this.renderingCancelledRouteIds = new LinkedHashSet();
        this.clearingCancelledRouteIds = new LinkedHashSet();
    }
}
