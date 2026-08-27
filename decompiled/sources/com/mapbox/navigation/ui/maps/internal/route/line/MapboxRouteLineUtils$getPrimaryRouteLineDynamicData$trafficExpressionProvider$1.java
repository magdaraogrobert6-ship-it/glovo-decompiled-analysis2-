package com.mapbox.navigation.ui.maps.internal.route.line;

import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.navigation.ui.maps.route.line.model.SegmentColorType;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ double $primaryRouteDistance;
    public final /* synthetic */ List $routeLineExpressionData;
    public final /* synthetic */ double $vanishingPointOffset;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
        routeLineViewOptionsData.getClass();
        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
        return new StylePropertyValue(MapboxRouteLineUtils.getTrafficLineExpression$ui_maps_release(routeLineViewOptionsData, this.$vanishingPointOffset, SegmentColorType.PRIMARY_UNKNOWN_CONGESTION, this.$routeLineExpressionData, this.$primaryRouteDistance), StylePropertyValueKind.EXPRESSION);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineUtils$getPrimaryRouteLineDynamicData$trafficExpressionProvider$1(List list, double d, double d2) {
        super(1);
        this.$vanishingPointOffset = d;
        this.$routeLineExpressionData = list;
        this.$primaryRouteDistance = d2;
    }
}
