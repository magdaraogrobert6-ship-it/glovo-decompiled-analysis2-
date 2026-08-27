package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface CoordinateShifter {
    double[] shift(double d, double d2);

    double[] shift(double d, double d2, double d3);

    List<Double> shiftLonLat(double d, double d2);

    List<Double> shiftLonLatAlt(double d, double d2, double d3);

    List<Double> unshiftPoint(Point point);

    List<Double> unshiftPoint(List<Double> list);

    double[] unshiftPointArray(double[] dArr);
}
