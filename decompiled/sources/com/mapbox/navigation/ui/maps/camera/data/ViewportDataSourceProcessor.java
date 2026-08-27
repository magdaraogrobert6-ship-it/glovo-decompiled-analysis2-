package com.mapbox.navigation.ui.maps.camera.data;

import com.mapbox.geojson.Point;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewportDataSourceProcessor {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverviewMode.values().length];
            try {
                iArr[OverviewMode.ACTIVE_LEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverviewMode.POINTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OverviewMode.ENTIRE_ROUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static List slicePointsAtAngle(List list) {
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList(instance_delegatelambda0.write);
        double dBearing = TuplesKt.bearing((Point) list.get(0), (Point) list.get(1));
        arrayList.add(list.get(0));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                double dBearing2 = TuplesKt.bearing((Point) list.get(i - 1), (Point) list.get(i));
                Point point = Math.abs((Double.isNaN(dBearing2) || Double.isNaN(dBearing)) ? 0.0d : (((((dBearing2 - dBearing) + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d) < 100.0d ? (Point) list.get(i) : null;
                if (point == null) {
                    break;
                }
                arrayList.add(point);
            }
        }
        return arrayList;
    }
}
