package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineProviderBasedExpressionEventData extends RouteLineExpressionEventData {
    private final Expression expression;
    private final String property;
    private final StylePropertyValue value;

    @onItemDismisslambda0
    public static /* synthetic */ void getExpression$annotations() {
    }

    public final String component1() {
        return this.property;
    }

    public final Expression component2() {
        return this.expression;
    }

    public final StylePropertyValue component3() {
        return this.value;
    }

    public final Expression getExpression() {
        return this.expression;
    }

    public final String getProperty() {
        return this.property;
    }

    public final StylePropertyValue getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.property.hashCode();
        Expression expression = this.expression;
        int iHashCode2 = expression == null ? 0 : expression.hashCode();
        StylePropertyValue stylePropertyValue = this.value;
        return (((iHashCode * 31) + iHashCode2) * 31) + (stylePropertyValue != null ? stylePropertyValue.hashCode() : 0);
    }

    public static /* synthetic */ RouteLineProviderBasedExpressionEventData copy$default(RouteLineProviderBasedExpressionEventData routeLineProviderBasedExpressionEventData, String str, Expression expression, StylePropertyValue stylePropertyValue, int i, Object obj) {
        if ((i & 1) != 0) {
            str = routeLineProviderBasedExpressionEventData.property;
        }
        if ((i & 2) != 0) {
            expression = routeLineProviderBasedExpressionEventData.expression;
        }
        if ((i & 4) != 0) {
            stylePropertyValue = routeLineProviderBasedExpressionEventData.value;
        }
        return routeLineProviderBasedExpressionEventData.copy(str, expression, stylePropertyValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineProviderBasedExpressionEventData)) {
            return false;
        }
        RouteLineProviderBasedExpressionEventData routeLineProviderBasedExpressionEventData = (RouteLineProviderBasedExpressionEventData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.property, routeLineProviderBasedExpressionEventData.property}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expression, routeLineProviderBasedExpressionEventData.expression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, routeLineProviderBasedExpressionEventData.value}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RouteLineProviderBasedExpressionEventData(property=" + this.property + ", expression=" + this.expression + ", value=" + this.value + ')';
    }

    public final RouteLineProviderBasedExpressionEventData copy(String str, Expression expression, StylePropertyValue stylePropertyValue) {
        str.getClass();
        return new RouteLineProviderBasedExpressionEventData(str, expression, stylePropertyValue);
    }

    public /* synthetic */ RouteLineProviderBasedExpressionEventData(String str, Expression expression, StylePropertyValue stylePropertyValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : expression, (i & 4) != 0 ? null : stylePropertyValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineProviderBasedExpressionEventData(String str, Expression expression, StylePropertyValue stylePropertyValue) {
        super("provider_based");
        str.getClass();
        this.property = str;
        this.expression = expression;
        this.value = stylePropertyValue;
    }
}
