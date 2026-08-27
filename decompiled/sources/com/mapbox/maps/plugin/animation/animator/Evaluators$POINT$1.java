package com.mapbox.maps.plugin.animation.animator;

import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import java.io.Serializable;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class Evaluators$POINT$1 implements CameraTypeEvaluator {
    public final /* synthetic */ int $r8$classId;
    public static final Evaluators$POINT$1 INSTANCE$1 = new Evaluators$POINT$1(1);
    public static final Evaluators$POINT$1 INSTANCE$2 = new Evaluators$POINT$1(2);
    public static final Evaluators$POINT$1 INSTANCE = new Evaluators$POINT$1(0);
    public static final Evaluators$POINT$1 INSTANCE$3 = new Evaluators$POINT$1(3);

    public /* synthetic */ Evaluators$POINT$1(int i) {
        this.$r8$classId = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int i = this.$r8$classId;
        if (i == 0) {
            Point point = (Point) obj;
            Point point2 = (Point) obj2;
            if (f == 1.0f) {
                return point2;
            }
            if (f == 0.0f) {
                return point;
            }
            double dLongitude = point2.longitude() - point.longitude();
            double dLatitude = point2.latitude() - point.latitude();
            if (dLongitude == 0.0d && dLatitude == 0.0d) {
                return point;
            }
            double d = f;
            return Point.fromLngLat((dLongitude * d) + point.longitude(), (d * dLatitude) + point.latitude());
        }
        if (i == 1) {
            Double d2 = (Double) obj;
            Double d3 = (Double) obj2;
            if (f == 1.0f) {
                return d3;
            }
            if (f == 0.0f) {
                return d2;
            }
            double dDoubleValue = d3.doubleValue();
            d2.getClass();
            double dDoubleValue2 = dDoubleValue - d2.doubleValue();
            if (dDoubleValue2 == 0.0d) {
                return d2;
            }
            return Double.valueOf((((double) f) * dDoubleValue2) + d2.doubleValue());
        }
        if (i != 2) {
            ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
            ScreenCoordinate screenCoordinate2 = (ScreenCoordinate) obj2;
            if (f == 1.0f) {
                return screenCoordinate2;
            }
            if (f == 0.0f) {
                return screenCoordinate;
            }
            double x = screenCoordinate2.getX() - screenCoordinate.getX();
            double y = screenCoordinate2.getY() - screenCoordinate.getY();
            if (x == 0.0d && y == 0.0d) {
                return screenCoordinate;
            }
            double d4 = f;
            return new ScreenCoordinate((x * d4) + screenCoordinate.getX(), (d4 * y) + screenCoordinate.getY());
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        EdgeInsets edgeInsets2 = (EdgeInsets) obj2;
        if (edgeInsets2 == null) {
            MapboxLogger.logW("Mbgl-CameraManager", "End edge insets are null (fraction: " + f + ')');
            edgeInsets2 = Evaluators.zeroEdgeInsets;
        }
        if (f == 1.0f) {
            return edgeInsets2;
        }
        if (edgeInsets == null) {
            MapboxLogger.logW("Mbgl-CameraManager", "Start edge insets are null (fraction: " + f + ')');
            edgeInsets = Evaluators.zeroEdgeInsets;
        }
        if (f != 0.0f) {
            double top = edgeInsets2.getTop() - edgeInsets.getTop();
            double left = edgeInsets2.getLeft() - edgeInsets.getLeft();
            double bottom = edgeInsets2.getBottom() - edgeInsets.getBottom();
            double right = edgeInsets2.getRight() - edgeInsets.getRight();
            if (top != 0.0d || left != 0.0d || bottom != 0.0d || right != 0.0d) {
                double d5 = f;
                return new EdgeInsets((top * d5) + edgeInsets.getTop(), (left * d5) + edgeInsets.getLeft(), (bottom * d5) + edgeInsets.getBottom(), (d5 * right) + edgeInsets.getRight());
            }
        }
        return edgeInsets;
    }

    @Override // com.mapbox.maps.plugin.animation.animator.CameraTypeEvaluator
    public final boolean canSkip(Serializable serializable, Object obj, Object[] objArr) {
        int i = this.$r8$classId;
        if (i == 0) {
            return Options.Companion.canSkip(serializable, obj, objArr);
        }
        if (i != 1) {
            return i != 2 ? Options.Companion.canSkip(serializable, obj, objArr) : Options.Companion.canSkip(serializable, obj, objArr);
        }
        return Options.Companion.canSkip(serializable, obj, objArr);
    }
}
