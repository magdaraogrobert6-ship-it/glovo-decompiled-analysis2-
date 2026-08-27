package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.collection.ObjectList$toString$1;
import androidx.sqlite.SQLite;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineGranularDistances;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$initializeLayers$77 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final MapboxRouteLineUtils$initializeLayers$77 INSTANCE;
    public static final MapboxRouteLineUtils$initializeLayers$77 INSTANCE$1;
    public static final MapboxRouteLineUtils$initializeLayers$77 INSTANCE$2;
    public static final MapboxRouteLineUtils$initializeLayers$77 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$initializeLayers$77(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        if (i == 0) {
            Expression.InterpolatorBuilder interpolatorBuilder = (Expression.InterpolatorBuilder) obj;
            interpolatorBuilder.getClass();
            ArrayList arrayList = interpolatorBuilder.arguments;
            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("exponential");
            expressionBuilder.literal(1.5d);
            arrayList.add(expressionBuilder.build());
            interpolatorBuilder.zoom();
            interpolatorBuilder.literal(0.0d);
            interpolatorBuilder.literal(0.6d);
            interpolatorBuilder.literal(10.0d);
            interpolatorBuilder.literal(0.8d);
            interpolatorBuilder.literal(12.0d);
            interpolatorBuilder.literal(1.3d);
            interpolatorBuilder.literal(22.0d);
            interpolatorBuilder.literal(2.8d);
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            RouteLeg routeLeg = (RouteLeg) obj;
            routeLeg.getClass();
            LegAnnotation legAnnotationAnnotation = routeLeg.annotation();
            List<String> listCongestion = legAnnotationAnnotation != null ? legAnnotationAnnotation.congestion() : null;
            return listCongestion == null ? instance_delegatelambda0.write : listCongestion;
        }
        if (i == 2) {
            MapboxRouteLineApiOptions mapboxRouteLineApiOptions = (MapboxRouteLineApiOptions) obj;
            mapboxRouteLineApiOptions.getClass();
            return new ObjectList$toString$1(26, mapboxRouteLineApiOptions);
        }
        NavigationRoute navigationRoute = (NavigationRoute) obj;
        navigationRoute.getClass();
        List listStepsGeometryToPoints = DecodeUtils.stepsGeometryToPoints(navigationRoute.directionsRoute);
        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
        List<List> list = listStepsGeometryToPoints;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (List list2 : list) {
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new RouteLineDistancesIndex[((List) it.next()).size()]);
            }
            Object[] array = arrayList3.toArray(new RouteLineDistancesIndex[0][]);
            array.getClass();
            arrayList2.add((RouteLineDistancesIndex[][]) array);
        }
        Object[] array2 = arrayList2.toArray(new RouteLineDistancesIndex[0][][]);
        array2.getClass();
        RouteLineDistancesIndex[][][] routeLineDistancesIndexArr = (RouteLineDistancesIndex[][][]) array2;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i2 = -1;
        int size = listStepsGeometryToPoints.size() - 1;
        double dCalculateDistance$ui_maps_release = 0.0d;
        while (i2 < size) {
            List list3 = (List) listStepsGeometryToPoints.get(size);
            int iWrite = SQLite.write(list3);
            while (i2 < iWrite) {
                List list4 = (List) list3.get(iWrite);
                if (!list4.isEmpty()) {
                    routeLineDistancesIndexArr[size][iWrite][SQLite.write(list4)] = new RouteLineDistancesIndex((Point) onContentCardDismissed.MediaDescriptionCompat(list4), dCalculateDistance$ui_maps_release);
                }
                for (int iWrite2 = SQLite.write(list4); iWrite2 > 0; iWrite2--) {
                    Point point = (Point) list4.get(iWrite2);
                    int i3 = iWrite2 - 1;
                    Point point2 = (Point) list4.get(i3);
                    dCalculateDistance$ui_maps_release = MapboxRouteLineUtils.calculateDistance$ui_maps_release(point, point2) + dCalculateDistance$ui_maps_release;
                    routeLineDistancesIndexArr[size][iWrite][i3] = new RouteLineDistancesIndex(point2, dCalculateDistance$ui_maps_release);
                }
                iWrite--;
                i2 = -1;
            }
            size--;
            i2 = -1;
        }
        int length = routeLineDistancesIndexArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            RouteLineDistancesIndex[][] routeLineDistancesIndexArr2 = routeLineDistancesIndexArr[i4];
            ArrayList arrayList6 = new ArrayList();
            int length2 = routeLineDistancesIndexArr2.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                RouteLineDistancesIndex[] routeLineDistancesIndexArr3 = routeLineDistancesIndexArr2[i6];
                if (i7 != 0) {
                    routeLineDistancesIndexArr3 = i7 == routeLineDistancesIndexArr2.length - 1 ? new RouteLineDistancesIndex[0] : (RouteLineDistancesIndex[]) onContentCardClicked.write(1, routeLineDistancesIndexArr3.length, routeLineDistancesIndexArr3);
                }
                routeLineDistancesIndexArr3.getClass();
                onContentCardDismissed.serializer(arrayList6, routeLineDistancesIndexArr3);
                i6++;
                i7++;
            }
            Object[] array3 = arrayList6.toArray(new RouteLineDistancesIndex[0]);
            array3.getClass();
            arrayList4.add(i5, array3);
            i4++;
            i5++;
        }
        int i8 = 0;
        for (Object obj2 : arrayList4) {
            if (i8 < 0) {
                SQLite.serializer();
                throw null;
            }
            RouteLineDistancesIndex[] routeLineDistancesIndexArr4 = (RouteLineDistancesIndex[]) obj2;
            if (i8 != 0) {
                routeLineDistancesIndexArr4 = (RouteLineDistancesIndex[]) onContentCardClicked.write(1, routeLineDistancesIndexArr4.length, routeLineDistancesIndexArr4);
            }
            onContentCardDismissed.serializer(arrayList5, routeLineDistancesIndexArr4);
            i8++;
        }
        Object[] array4 = arrayList5.toArray(new RouteLineDistancesIndex[0]);
        array4.getClass();
        Object[] array5 = arrayList4.toArray(new RouteLineDistancesIndex[0][]);
        array5.getClass();
        return new RouteLineGranularDistances(dCalculateDistance$ui_maps_release, (RouteLineDistancesIndex[]) array4, (RouteLineDistancesIndex[][]) array5, routeLineDistancesIndexArr);
    }

    static {
        int i = 1;
        INSTANCE$1 = new MapboxRouteLineUtils$initializeLayers$77(i, i);
        INSTANCE$2 = new MapboxRouteLineUtils$initializeLayers$77(i, 2);
        INSTANCE$3 = new MapboxRouteLineUtils$initializeLayers$77(i, 3);
        INSTANCE = new MapboxRouteLineUtils$initializeLayers$77(i, 0);
    }
}
