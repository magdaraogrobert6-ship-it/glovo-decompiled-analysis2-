package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$setNewRouteData$2$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$1;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$2;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$3;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$4;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$5;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$6;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$7;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$8;
    public static final MapboxRouteLineApi$setNewRouteData$2$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineApi$setNewRouteData$2$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 1;
        INSTANCE$1 = new MapboxRouteLineApi$setNewRouteData$2$1(i, i);
        INSTANCE$2 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 2);
        INSTANCE$3 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 3);
        INSTANCE$4 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 4);
        INSTANCE$5 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 5);
        INSTANCE$6 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 6);
        INSTANCE$7 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 7);
        INSTANCE$8 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 8);
        INSTANCE = new MapboxRouteLineApi$setNewRouteData$2$1(i, 0);
        INSTANCE$9 = new MapboxRouteLineApi$setNewRouteData$2$1(i, 9);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                NavigationRoute navigationRoute = (NavigationRoute) obj;
                navigationRoute.getClass();
                return navigationRoute.id;
            case 1:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 2:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 3:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 4:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 5:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils5 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 6:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils6 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 7:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils7 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            case 8:
                ((RouteLineViewOptionsData) obj).getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils8 = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.getSingleColorExpression(0);
            default:
                ((RouteLineViewOptionsData) obj).getClass();
                throw new UnsupportedOperationException();
        }
    }
}
