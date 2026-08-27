package com.mapbox.navigation.ui.maps.internal.route.line;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleValue;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$buildScalingExpression$2$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RouteLineScaleValue $routeLineScaleValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$buildScalingExpression$2$1(RouteLineScaleValue routeLineScaleValue, int i) {
        super(1);
        this.$r8$classId = i;
        this.$routeLineScaleValue = routeLineScaleValue;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        RouteLineScaleValue routeLineScaleValue = this.$routeLineScaleValue;
        if (i != 0) {
            Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
            expressionBuilder.getClass();
            expressionBuilder.literal(routeLineScaleValue.scaleMultiplier);
            expressionBuilder.literal(routeLineScaleValue.scale);
            return createfromparcel;
        }
        Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj;
        expressionBuilder2.getClass();
        expressionBuilder2.literal(routeLineScaleValue.scaleStop);
        MapboxRouteLineUtils$buildScalingExpression$2$1 mapboxRouteLineUtils$buildScalingExpression$2$1 = new MapboxRouteLineUtils$buildScalingExpression$2$1(routeLineScaleValue, 1);
        ArrayList arrayList = expressionBuilder2.arguments;
        Expression.ExpressionBuilder expressionBuilder3 = new Expression.ExpressionBuilder("*");
        mapboxRouteLineUtils$buildScalingExpression$2$1.invoke(expressionBuilder3);
        arrayList.add(expressionBuilder3.build());
        return createfromparcel;
    }
}
