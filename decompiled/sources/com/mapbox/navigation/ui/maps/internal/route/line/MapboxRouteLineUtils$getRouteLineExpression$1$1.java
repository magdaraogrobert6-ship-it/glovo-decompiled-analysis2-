package com.mapbox.navigation.ui.maps.internal.route.line;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$getRouteLineExpression$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $colorToUse;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$getRouteLineExpression$1$1(int i, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.$colorToUse = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.$colorToUse;
        if (i == 0) {
            Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
            expressionBuilder.getClass();
            expressionBuilder.literal(0.0d);
            expressionBuilder.color(i2);
            return createfromparcel;
        }
        if (i == 1) {
            return Boolean.valueOf(i2 >= 0 && ((Number) obj).intValue() != i2);
        }
        if (i == 2) {
            return Boolean.valueOf(((Number) obj).intValue() > i2);
        }
        if (i != 3) {
            Expression.ExpressionBuilder expressionBuilder2 = (Expression.ExpressionBuilder) obj;
            expressionBuilder2.getClass();
            expressionBuilder2.literal(0.0d);
            expressionBuilder2.color(i2);
            return createfromparcel;
        }
        Expression.ExpressionBuilder expressionBuilder3 = (Expression.ExpressionBuilder) obj;
        expressionBuilder3.getClass();
        expressionBuilder3.literal(0.0d);
        expressionBuilder3.color(i2);
        return createfromparcel;
    }
}
