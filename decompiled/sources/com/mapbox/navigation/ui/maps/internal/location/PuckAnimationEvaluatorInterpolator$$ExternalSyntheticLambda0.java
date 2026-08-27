package com.mapbox.navigation.ui.maps.internal.location;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PuckAnimationEvaluatorInterpolator$$ExternalSyntheticLambda0 implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Point point = (Point) obj;
        Point point2 = (Point) obj2;
        double d = f;
        return Point.fromLngLat(((point2.longitude() - point.longitude()) * d) + point.longitude(), ((point2.latitude() - point.latitude()) * d) + point.latitude());
    }
}
