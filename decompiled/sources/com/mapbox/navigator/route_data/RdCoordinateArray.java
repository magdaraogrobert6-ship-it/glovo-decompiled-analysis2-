package com.mapbox.navigator.route_data;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface RdCoordinateArray {
    Point get(long j);

    List<Point> rawArray();

    long size();
}
