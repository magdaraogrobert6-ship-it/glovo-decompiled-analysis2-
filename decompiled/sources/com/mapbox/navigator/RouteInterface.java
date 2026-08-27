package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.directions.route.DirectionsRouteContext;
import com.mapbox.geojson.Point;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface RouteInterface {
    DirectionsRouteContext getDirectionsRouteContext();

    Long getExpirationTimeMs();

    Date getLastRefreshTimestamp();

    MapboxAPI getMapboxAPI();

    String getRequestUri();

    DataRef getResponseJsonRef();

    String getResponseUuid();

    List<Point> getRouteGeometry();

    String getRouteId();

    int getRouteIndex();

    RouteInfo getRouteInfo();

    RouterOrigin getRouterOrigin();

    List<Waypoint> getWaypoints();
}
