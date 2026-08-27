package com.mapbox.navigation.ui.maps.internal.route.line;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineExpressionData;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$getRouteLineExpression$1$2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $colorToUse;
    public final /* synthetic */ RouteLineExpressionData $item;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$getRouteLineExpression$1$2(RouteLineExpressionData routeLineExpressionData, int i, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.$item = routeLineExpressionData;
        this.$colorToUse = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.$colorToUse;
        RouteLineExpressionData routeLineExpressionData = this.$item;
        if (i == 0) {
            Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
            expressionBuilder.getClass();
            expressionBuilder.literal(routeLineExpressionData.offset);
            expressionBuilder.color(i2);
            return createfromparcel;
        }
        if (i != 1) {
            Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj;
            expressionBuilder2.getClass();
            expressionBuilder2.literal(routeLineExpressionData.offset);
            expressionBuilder2.color(i2);
            return createfromparcel;
        }
        Expression.ExpressionBuilder expressionBuilder3 = (Expression.ExpressionBuilder) obj;
        expressionBuilder3.getClass();
        expressionBuilder3.literal(routeLineExpressionData.offset);
        expressionBuilder3.color(i2);
        return createfromparcel;
    }
}
