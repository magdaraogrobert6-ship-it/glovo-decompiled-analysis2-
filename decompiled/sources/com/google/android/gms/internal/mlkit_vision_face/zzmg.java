package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.routealternatives.AlternativeRouteIntersection;
import com.mapbox.navigation.core.routealternatives.AlternativeRouteMetadata;
import com.mapbox.navigator.AlternativeRouteInfo;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouteIntersection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmg {
    public static final AlternativeRouteMetadata mapToMetadata(RouteAlternative routeAlternative, NavigationRoute navigationRoute) {
        navigationRoute.getClass();
        RouteIntersection alternativeRouteFork = routeAlternative.getAlternativeRouteFork();
        alternativeRouteFork.getClass();
        Point location = alternativeRouteFork.getLocation();
        location.getClass();
        AlternativeRouteIntersection alternativeRouteIntersection = new AlternativeRouteIntersection(location, alternativeRouteFork.getGeometryIndex(), alternativeRouteFork.getSegmentIndex(), alternativeRouteFork.getLegIndex());
        RouteIntersection mainRouteFork = routeAlternative.getMainRouteFork();
        mainRouteFork.getClass();
        Point location2 = mainRouteFork.getLocation();
        location2.getClass();
        AlternativeRouteIntersection alternativeRouteIntersection2 = new AlternativeRouteIntersection(location2, mainRouteFork.getGeometryIndex(), mainRouteFork.getSegmentIndex(), mainRouteFork.getLegIndex());
        AlternativeRouteInfo infoFromFork = routeAlternative.getInfoFromFork();
        infoFromFork.getClass();
        com.mapbox.navigation.core.routealternatives.AlternativeRouteInfo alternativeRouteInfo = new com.mapbox.navigation.core.routealternatives.AlternativeRouteInfo(infoFromFork.getDistance(), infoFromFork.getDuration());
        AlternativeRouteInfo infoFromStart = routeAlternative.getInfoFromStart();
        infoFromStart.getClass();
        return new AlternativeRouteMetadata(navigationRoute, alternativeRouteIntersection, alternativeRouteIntersection2, alternativeRouteInfo, new com.mapbox.navigation.core.routealternatives.AlternativeRouteInfo(infoFromStart.getDistance(), infoFromStart.getDuration()));
    }
}
