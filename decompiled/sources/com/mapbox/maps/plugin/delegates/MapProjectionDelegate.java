package com.mapbox.maps.plugin.delegates;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;

/* JADX INFO: loaded from: classes2.dex */
public interface MapProjectionDelegate {
    double getMetersPerPixelAtLatitude(double d, double d2);

    MercatorCoordinate project(Point point, double d);

    Point unproject(MercatorCoordinate mercatorCoordinate, double d);
}
