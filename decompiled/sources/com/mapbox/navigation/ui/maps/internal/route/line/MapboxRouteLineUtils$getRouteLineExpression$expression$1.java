package com.mapbox.navigation.ui.maps.internal.route.line;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$getRouteLineExpression$expression$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ double $offset;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$getRouteLineExpression$expression$1(double d, int i) {
        super(1);
        this.$r8$classId = i;
        this.$offset = d;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        double d = this.$offset;
        if (i == 0) {
            Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
            expressionBuilder.getClass();
            expressionBuilder.literal(1.0d - d);
            expressionBuilder.color(0);
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
            routeLineViewOptionsData.getClass();
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            return MapboxRouteLineUtils.getRouteLineExpression$ui_maps_release(d, routeLineViewOptionsData.getRouteLineColorResources().getAlternativeRouteDefaultColor());
        }
        if (i == 2) {
            RouteLineViewOptionsData routeLineViewOptionsData2 = (RouteLineViewOptionsData) obj;
            routeLineViewOptionsData2.getClass();
            MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
            return MapboxRouteLineUtils.getRouteLineExpression$ui_maps_release(d, routeLineViewOptionsData2.getRouteLineColorResources().getAlternativeRouteCasingColor());
        }
        if (i != 3) {
            RouteLineViewOptionsData routeLineViewOptionsData3 = (RouteLineViewOptionsData) obj;
            routeLineViewOptionsData3.getClass();
            MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
            return MapboxRouteLineUtils.getRouteLineExpression$ui_maps_release(d, routeLineViewOptionsData3.getRouteLineColorResources().getAlternativeRouteCasingColor());
        }
        RouteLineViewOptionsData routeLineViewOptionsData4 = (RouteLineViewOptionsData) obj;
        routeLineViewOptionsData4.getClass();
        MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
        return MapboxRouteLineUtils.getRouteLineExpression$ui_maps_release(d, routeLineViewOptionsData4.getRouteLineColorResources().getAlternativeRouteDefaultColor());
    }
}
