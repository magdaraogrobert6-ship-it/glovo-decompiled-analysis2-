package com.mapbox.navigation.ui.maps.internal.location;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class PuckAnimationEvaluatorInterpolator implements TimeInterpolator, TypeEvaluator {
    public static final PuckAnimationEvaluatorInterpolator$$ExternalSyntheticLambda0 POINT = new PuckAnimationEvaluatorInterpolator$$ExternalSyntheticLambda0();
    public ConstantVelocityInterpolator interpolator;
    public final Point[] keyPoints;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Point point = (Point) obj;
        Point point2 = (Point) obj2;
        point.getClass();
        point2.getClass();
        if (this.interpolator == null) {
            this.interpolator = new ConstantVelocityInterpolator(point, this.keyPoints);
        }
        Object objEvaluate = POINT.evaluate(f, point, point2);
        objEvaluate.getClass();
        return (Point) objEvaluate;
    }

    public PuckAnimationEvaluatorInterpolator(Point[] pointArr) {
        this.keyPoints = pointArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        ConstantVelocityInterpolator constantVelocityInterpolator = this.interpolator;
        return constantVelocityInterpolator != null ? constantVelocityInterpolator.innerInterpolator.getInterpolation(f) : f;
    }
}
