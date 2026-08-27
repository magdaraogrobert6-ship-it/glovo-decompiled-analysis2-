package com.mapbox.navigation.ui.maps.internal.location;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.view.animation.PathInterpolator;
import com.mapbox.geojson.Point;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstantVelocityInterpolator implements TimeInterpolator {
    public final TimeInterpolator innerInterpolator;

    public ConstantVelocityInterpolator(Point point, Point[] pointArr) {
        TimeInterpolator pathInterpolator;
        point.getClass();
        ArrayList arrayList = new ArrayList();
        int length = pointArr.length;
        double d = 0.0d;
        int i = 0;
        Point point2 = point;
        double d2 = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            Point point3 = pointArr[i2];
            double dHypot = Math.hypot(point3.latitude() - point2.latitude(), point3.longitude() - point2.longitude());
            arrayList.add(Double.valueOf(dHypot));
            d2 += dHypot;
            i2++;
            point2 = point3;
        }
        if (0.0d < d2) {
            Path path = new Path();
            double size = 1.0d / ((double) arrayList.size());
            int size2 = arrayList.size() - 2;
            if (size2 >= 0) {
                while (true) {
                    double dDoubleValue = (((Number) arrayList.get(i)).doubleValue() / d2) + d;
                    d = dDoubleValue > 1.0d ? 1.0d : dDoubleValue;
                    int i3 = i + 1;
                    path.lineTo((float) d, (float) (((double) i3) * size));
                    if (i == size2) {
                        break;
                    } else {
                        i = i3;
                    }
                }
            }
            path.lineTo(1.0f, 1.0f);
            pathInterpolator = new PathInterpolator(path);
        } else {
            pathInterpolator = new TimeInterpolator() { // from class: com.mapbox.navigation.ui.maps.internal.location.ConstantVelocityInterpolator$$ExternalSyntheticLambda0
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return f;
                }
            };
        }
        this.innerInterpolator = pathInterpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.innerInterpolator.getInterpolation(f);
    }
}
