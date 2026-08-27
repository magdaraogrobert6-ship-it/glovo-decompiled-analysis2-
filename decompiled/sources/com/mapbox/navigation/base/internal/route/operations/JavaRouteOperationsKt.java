package com.mapbox.navigation.base.internal.route.operations;

import androidx.sqlite.SQLite;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JavaRouteOperationsKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.base.internal.route.operations.JavaRouteOperationsKt$fakeDirectionsRoute$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                StepIntersection.Builder builder = StepIntersection.builder();
                Double dValueOf = Double.valueOf(0.0d);
                StepIntersection stepIntersectionBuild = builder.rawLocation(new double[]{0.0d, 0.0d}).build();
                stepIntersectionBuild.getClass();
                LegStep.Builder builderGeometry = LegStep.builder().distance(0.0d).duration(0.0d).mode("driving").maneuver(StepManeuver.builder().rawLocation(new double[]{0.0d, 0.0d}).type("arrive").build()).weight(0.0d).geometry(LineString.fromLngLats((List<Point>) SQLite.read(Point.fromLngLat(0.0d, 0.0d), Point.fromLngLat(0.0d, 0.0d))).toPolyline(6));
                int iSerializer = getQueryParameterslambda2.serializer();
                int iSerializer2 = getQueryParameterslambda2.serializer();
                Object[] objArr = {builderGeometry.intersections((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{stepIntersectionBuild}, getQueryParameterslambda2.serializer(), -516583649, iSerializer)).build()};
                int iSerializer3 = getQueryParameterslambda2.serializer();
                Object[] objArr2 = {RouteLeg.builder().steps((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer3)).build()};
                int iSerializer4 = getQueryParameterslambda2.serializer();
                DirectionsRoute directionsRouteBuild = DirectionsRoute.builder().distance(dValueOf).duration(dValueOf).legs((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer4)).build();
                directionsRouteBuild.getClass();
                return directionsRouteBuild;
            }
        });
    }

    public static final List access$buildNewWaypoints(ArrayList arrayList, List list) {
        if (list == null || arrayList == null) {
            return list;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            if (i >= 0) {
                DirectionsWaypoint directionsWaypoint = (DirectionsWaypoint) obj;
                DirectionsWaypoint directionsWaypoint2 = (DirectionsWaypoint) onContentCardDismissed.read(i, arrayList);
                if (directionsWaypoint2 != null) {
                    directionsWaypoint = directionsWaypoint2;
                }
                arrayList2.add(directionsWaypoint);
                i++;
            } else {
                SQLite.serializer();
                throw null;
            }
        }
        return arrayList2;
    }
}
