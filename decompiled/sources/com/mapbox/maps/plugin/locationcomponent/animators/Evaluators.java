package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Evaluators {
    public static final Evaluators$$ExternalSyntheticLambda0 DOUBLE;
    public static final Evaluators$$ExternalSyntheticLambda0 POINT;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.maps.plugin.locationcomponent.animators.Evaluators$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.maps.plugin.locationcomponent.animators.Evaluators$$ExternalSyntheticLambda0] */
    static {
        final int i = 0;
        POINT = new TypeEvaluator() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.Evaluators$$ExternalSyntheticLambda0
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                if (i != 0) {
                    Double d = (Double) obj;
                    return Double.valueOf(((((Double) obj2).doubleValue() - d.doubleValue()) * ((double) f)) + d.doubleValue());
                }
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                double d2 = f;
                double dLongitude = ((point2.longitude() - point.longitude()) * d2) + point.longitude();
                double dLatitude = ((point2.latitude() - point.latitude()) * d2) + point.latitude();
                if (!point.hasAltitude() || !point2.hasAltitude()) {
                    return Point.fromLngLat(dLongitude, dLatitude);
                }
                return Point.fromLngLat(dLongitude, dLatitude, ((point2.altitude() - point.altitude()) * d2) + point.altitude());
            }
        };
        final int i2 = 1;
        DOUBLE = new TypeEvaluator() { // from class: com.mapbox.maps.plugin.locationcomponent.animators.Evaluators$$ExternalSyntheticLambda0
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                if (i2 != 0) {
                    Double d = (Double) obj;
                    return Double.valueOf(((((Double) obj2).doubleValue() - d.doubleValue()) * ((double) f)) + d.doubleValue());
                }
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                double d2 = f;
                double dLongitude = ((point2.longitude() - point.longitude()) * d2) + point.longitude();
                double dLatitude = ((point2.latitude() - point.latitude()) * d2) + point.latitude();
                if (!point.hasAltitude() || !point2.hasAltitude()) {
                    return Point.fromLngLat(dLongitude, dLatitude);
                }
                return Point.fromLngLat(dLongitude, dLatitude, ((point2.altitude() - point.altitude()) * d2) + point.altitude());
            }
        };
    }
}
