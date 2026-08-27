package com.mapbox.navigation.ui.maps.route.line.model;

import androidx.annotation.Keep;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineScaleExpressions {
    private final Expression alternativeRouteCasingLineScaleExpression;
    private final Expression alternativeRouteLineScaleExpression;
    private final Expression alternativeRouteTrafficLineScaleExpression;
    private final Expression routeBlurScaleExpression;
    private final Expression routeCasingLineScaleExpression;
    private final Expression routeLineScaleExpression;
    private final Expression routeTrafficLineScaleExpression;

    public final Expression getAlternativeRouteCasingLineScaleExpression() {
        return this.alternativeRouteCasingLineScaleExpression;
    }

    public final Expression getAlternativeRouteLineScaleExpression() {
        return this.alternativeRouteLineScaleExpression;
    }

    public final Expression getAlternativeRouteTrafficLineScaleExpression() {
        return this.alternativeRouteTrafficLineScaleExpression;
    }

    public final Expression getRouteBlurScaleExpression() {
        return this.routeBlurScaleExpression;
    }

    public final Expression getRouteCasingLineScaleExpression() {
        return this.routeCasingLineScaleExpression;
    }

    public final Expression getRouteLineScaleExpression() {
        return this.routeLineScaleExpression;
    }

    public final Expression getRouteTrafficLineScaleExpression() {
        return this.routeTrafficLineScaleExpression;
    }

    public int hashCode() {
        int iHashCode = this.routeLineScaleExpression.hashCode();
        int iHashCode2 = this.routeCasingLineScaleExpression.hashCode();
        int iHashCode3 = this.routeTrafficLineScaleExpression.hashCode();
        int iHashCode4 = this.alternativeRouteLineScaleExpression.hashCode();
        int iHashCode5 = this.alternativeRouteCasingLineScaleExpression.hashCode();
        return this.routeBlurScaleExpression.hashCode() + ((this.alternativeRouteTrafficLineScaleExpression.hashCode() + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    private RouteLineScaleExpressions(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7) {
        this.routeLineScaleExpression = expression;
        this.routeCasingLineScaleExpression = expression2;
        this.routeTrafficLineScaleExpression = expression3;
        this.alternativeRouteLineScaleExpression = expression4;
        this.alternativeRouteCasingLineScaleExpression = expression5;
        this.alternativeRouteTrafficLineScaleExpression = expression6;
        this.routeBlurScaleExpression = expression7;
    }

    public String toString() {
        return "RouteLineScaleExpressions(routeLineScaleExpression=" + this.routeLineScaleExpression + ", routeCasingLineScaleExpression=" + this.routeCasingLineScaleExpression + ", routeTrafficLineScaleExpression=" + this.routeTrafficLineScaleExpression + ", alternativeRouteLineScaleExpression=" + this.alternativeRouteLineScaleExpression + ", alternativeRouteCasingLineScaleExpression=" + this.alternativeRouteCasingLineScaleExpression + ", alternativeRouteTrafficLineScaleExpression=" + this.alternativeRouteTrafficLineScaleExpression + ",routeGlowScaleExpression=" + this.routeBlurScaleExpression + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineScaleExpressions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLineScaleExpressions routeLineScaleExpressions = (RouteLineScaleExpressions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineScaleExpression, routeLineScaleExpressions.routeLineScaleExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeCasingLineScaleExpression, routeLineScaleExpressions.routeCasingLineScaleExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeTrafficLineScaleExpression, routeLineScaleExpressions.routeTrafficLineScaleExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRouteLineScaleExpression, routeLineScaleExpressions.alternativeRouteLineScaleExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRouteCasingLineScaleExpression, routeLineScaleExpressions.alternativeRouteCasingLineScaleExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRouteTrafficLineScaleExpression, routeLineScaleExpressions.alternativeRouteTrafficLineScaleExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeBlurScaleExpression, routeLineScaleExpressions.routeBlurScaleExpression}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ RouteLineScaleExpressions(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, DefaultConstructorMarker defaultConstructorMarker) {
        this(expression, expression2, expression3, expression4, expression5, expression6, expression7);
    }
}
