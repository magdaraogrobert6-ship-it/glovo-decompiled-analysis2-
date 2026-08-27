package com.mapbox.api.directions.v5.models;

import com.mapbox.directions.route.DirectionsRouteContext;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsRouteFBWrapper extends DirectionsRoute {
    public abstract DirectionsRouteContext getContext();

    public abstract List<Point> getGeometryNumeric$base_release();

    public abstract Integer getRefreshTtl$base_release();

    @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
    public abstract List<RouteLeg> legs();
}
