package com.mapbox.turf;

import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TurfMisc {
    public static LineString lineSliceAlong(LineString lineString, double d, double d2, String str) {
        double[] flattenLngLatArray = lineString.flattenCoordinates().getFlattenLngLatArray();
        int size = lineString.flattenCoordinates().size();
        if (size < 2) {
            throw new TurfException(d$$ExternalSyntheticOutline0.m(size, "Turf lineSlice requires a LineString Geometry made up of at least 2 coordinates. The LineString passed in only contains ", "."));
        }
        if (d == d2) {
            throw new TurfException("Start and stop distance in Turf lineSliceAlong cannot equal each other.");
        }
        ArrayList arrayList = new ArrayList();
        double d3 = 0.0d;
        int i = 0;
        double dDistance = 0.0d;
        while (i < size) {
            int i2 = i * 2;
            Point pointFromLngLat = Point.fromLngLat(flattenLngLatArray[i2], flattenLngLatArray[i2 + 1]);
            if (d >= dDistance && i == size - 1) {
                break;
            }
            if (dDistance > d && arrayList.size() == 0) {
                double d4 = d - dDistance;
                if (d4 == d3) {
                    arrayList.add(pointFromLngLat);
                    return LineString.fromLngLats(arrayList);
                }
                int i3 = (i - 1) * 2;
                arrayList.add(TuplesKt.destination(pointFromLngLat, d4, TuplesKt.bearing(pointFromLngLat, Point.fromLngLat(flattenLngLatArray[i3], flattenLngLatArray[i3 + 1])) - 180.0d, str));
            }
            if (dDistance >= d2) {
                double d5 = d2 - dDistance;
                if (d5 == 0.0d) {
                    arrayList.add(pointFromLngLat);
                    return LineString.fromLngLats(arrayList);
                }
                int i4 = (i - 1) * 2;
                arrayList.add(TuplesKt.destination(pointFromLngLat, d5, TuplesKt.bearing(pointFromLngLat, Point.fromLngLat(flattenLngLatArray[i4], flattenLngLatArray[i4 + 1])) - 180.0d, str));
                return LineString.fromLngLats(arrayList);
            }
            d3 = 0.0d;
            if (dDistance >= d) {
                arrayList.add(pointFromLngLat);
            }
            if (i == size - 1) {
                return LineString.fromLngLats(arrayList);
            }
            i++;
            int i5 = i * 2;
            dDistance += TuplesKt.distance(pointFromLngLat, Point.fromLngLat(flattenLngLatArray[i5], flattenLngLatArray[i5 + 1]), str);
        }
        if (dDistance >= d) {
            return LineString.fromLngLats(arrayList);
        }
        throw new TurfException("Start position is beyond line");
    }
}
