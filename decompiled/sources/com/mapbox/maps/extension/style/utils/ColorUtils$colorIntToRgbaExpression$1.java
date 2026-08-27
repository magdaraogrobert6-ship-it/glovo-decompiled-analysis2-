package com.mapbox.maps.extension.style.utils;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorUtils$colorIntToRgbaExpression$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ double $alpha;
    public final /* synthetic */ int $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorUtils$colorIntToRgbaExpression$1(double d, int i) {
        super(1);
        this.$color = i;
        this.$alpha = d;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
        expressionBuilder.getClass();
        int i = this.$color;
        ArrayList arrayList = expressionBuilder.arguments;
        arrayList.add(new Expression((i >> 16) & 255));
        arrayList.add(new Expression((i >> 8) & 255));
        arrayList.add(new Expression(i & 255));
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.getClass();
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        decimalFormat.applyPattern("#.########");
        String str = decimalFormat.format(this.$alpha);
        str.getClass();
        expressionBuilder.literal(Double.parseDouble(str));
        return createFromParcel.INSTANCE;
    }
}
