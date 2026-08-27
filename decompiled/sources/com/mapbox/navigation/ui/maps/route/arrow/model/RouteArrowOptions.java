package com.mapbox.navigation.ui.maps.route.arrow.model;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.navigation.ui.maps.route.RouteLayerConstants;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteArrowOptions {
    public final String aboveLayerId;
    public final int arrowCasingColor;
    public final int arrowColor;
    public final Expression arrowHeadCasingScaleExpression;
    public final Drawable arrowHeadIcon;
    public final Drawable arrowHeadIconCasing;
    public final int arrowHeadIconCasingDrawable;
    public final int arrowHeadIconDrawable;
    public final Expression arrowHeadScaleExpression;
    public final Expression arrowShaftCasingScaleExpression;
    public final Expression arrowShaftScaleExpression;
    public final String slotName;
    public final double tolerance;

    public final class Builder {
        public String aboveLayerId;
        public final int arrowCasingColor;
        public final int arrowColor;
        public final int arrowHeadIconCasingDrawable;
        public final int arrowHeadIconDrawable;
        public final Context defaultDensityContext;
        public final double tolerance;

        public Builder(Application application) {
            int i = RouteLayerConstants.MANEUVER_ARROW_COLOR;
            int i2 = RouteLayerConstants.MANEUVER_ARROW_CASING_COLOR;
            int i3 = RouteLayerConstants.MANEUVER_ARROWHEAD_ICON_DRAWABLE;
            int i4 = RouteLayerConstants.MANEUVER_ARROWHEAD_ICON_CASING_DRAWABLE;
            this.arrowColor = i;
            this.arrowCasingColor = i2;
            this.arrowHeadIconDrawable = i3;
            this.arrowHeadIconCasingDrawable = i4;
            this.aboveLayerId = null;
            this.tolerance = 0.375d;
            Configuration configuration = new Configuration(application.getResources().getConfiguration());
            configuration.densityDpi = 160;
            this.defaultDensityContext = application.createConfigurationContext(configuration);
        }

        public final RouteArrowOptions build() {
            int i = this.arrowHeadIconDrawable;
            Context context = this.defaultDensityContext;
            Drawable drawableWrite = IntPair.write(context, i);
            Drawable drawableWrite2 = IntPair.write(context, this.arrowHeadIconCasingDrawable);
            String str = this.aboveLayerId;
            if (str == null) {
                str = "mapbox-top-level-route-layer";
            }
            String str2 = str;
            Expression.InterpolatorBuilder interpolatorBuilder = new Expression.InterpolatorBuilder();
            interpolatorBuilder.linear();
            interpolatorBuilder.zoom();
            interpolatorBuilder.literal(10.0d);
            interpolatorBuilder.literal(2.9d);
            interpolatorBuilder.literal(22.0d);
            interpolatorBuilder.literal(14.3d);
            Expression expressionBuild = interpolatorBuilder.build();
            Expression.InterpolatorBuilder interpolatorBuilder2 = new Expression.InterpolatorBuilder();
            interpolatorBuilder2.linear();
            interpolatorBuilder2.zoom();
            interpolatorBuilder2.literal(10.0d);
            interpolatorBuilder2.literal(4.4d);
            interpolatorBuilder2.literal(22.0d);
            interpolatorBuilder2.literal(22.0d);
            Expression expressionBuild2 = interpolatorBuilder2.build();
            Expression.InterpolatorBuilder interpolatorBuilder3 = new Expression.InterpolatorBuilder();
            interpolatorBuilder3.linear();
            interpolatorBuilder3.zoom();
            interpolatorBuilder3.literal(10.0d);
            interpolatorBuilder3.literal(0.225d);
            interpolatorBuilder3.literal(22.0d);
            interpolatorBuilder3.literal(0.885d);
            Expression expressionBuild3 = interpolatorBuilder3.build();
            Expression.InterpolatorBuilder interpolatorBuilder4 = new Expression.InterpolatorBuilder();
            interpolatorBuilder4.linear();
            interpolatorBuilder4.zoom();
            interpolatorBuilder4.literal(10.0d);
            interpolatorBuilder4.literal(0.22d);
            interpolatorBuilder4.literal(22.0d);
            interpolatorBuilder4.literal(0.88d);
            Expression expressionBuild4 = interpolatorBuilder4.build();
            drawableWrite.getClass();
            drawableWrite2.getClass();
            return new RouteArrowOptions(this.arrowColor, this.arrowCasingColor, this.arrowHeadIconDrawable, this.arrowHeadIconCasingDrawable, drawableWrite, drawableWrite2, str2, this.tolerance, expressionBuild, expressionBuild2, expressionBuild3, expressionBuild4, "middle");
        }

        public final void withAboveLayerId(String str) {
            str.getClass();
            this.aboveLayerId = str;
        }
    }

    public RouteArrowOptions(int i, int i2, int i3, int i4, Drawable drawable, Drawable drawable2, String str, double d, Expression expression, Expression expression2, Expression expression3, Expression expression4, String str2) {
        this.arrowColor = i;
        this.arrowCasingColor = i2;
        this.arrowHeadIconDrawable = i3;
        this.arrowHeadIconCasingDrawable = i4;
        this.arrowHeadIcon = drawable;
        this.arrowHeadIconCasing = drawable2;
        this.aboveLayerId = str;
        this.tolerance = d;
        this.arrowShaftScaleExpression = expression;
        this.arrowShaftCasingScaleExpression = expression2;
        this.arrowHeadScaleExpression = expression3;
        this.arrowHeadCasingScaleExpression = expression4;
        this.slotName = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteArrowOptions(arrowColor=");
        sb.append(this.arrowColor);
        sb.append(", arrowCasingColor=");
        sb.append(this.arrowCasingColor);
        sb.append(", arrowHeadIconDrawable=");
        sb.append(this.arrowHeadIconDrawable);
        sb.append(", arrowHeadIconCasingDrawable=");
        sb.append(this.arrowHeadIconCasingDrawable);
        sb.append(", arrowHeadIcon=");
        sb.append(this.arrowHeadIcon);
        sb.append(", arrowHeadIconCasing=");
        sb.append(this.arrowHeadIconCasing);
        sb.append(", aboveLayerId='");
        sb.append(this.aboveLayerId);
        sb.append("', tolerance=");
        sb.append(this.tolerance);
        sb.append(", arrowShaftScaleExpression=");
        sb.append(this.arrowShaftScaleExpression);
        sb.append(", arrowShaftCasingScaleExpression=");
        sb.append(this.arrowShaftCasingScaleExpression);
        sb.append(", arrowHeadScaleExpression=");
        sb.append(this.arrowHeadScaleExpression);
        sb.append(", arrowHeadCasingScaleExpression=");
        sb.append(this.arrowHeadCasingScaleExpression);
        sb.append(", slotName=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.slotName, ", fadingConfig=null)");
    }

    public final int hashCode() {
        int i = this.arrowColor;
        int i2 = this.arrowCasingColor;
        int i3 = this.arrowHeadIconDrawable;
        int i4 = this.arrowHeadIconCasingDrawable;
        int iHashCode = this.arrowHeadIcon.hashCode();
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.tolerance, af$$ExternalSyntheticOutline0.m((this.arrowHeadIconCasing.hashCode() + ((iHashCode + (((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31)) * 31)) * 31, 31, this.aboveLayerId), 31);
        int iHashCode2 = this.arrowShaftScaleExpression.hashCode();
        int iHashCode3 = this.arrowShaftCasingScaleExpression.hashCode();
        int iHashCode4 = this.arrowHeadScaleExpression.hashCode();
        return af$$ExternalSyntheticOutline0.m((this.arrowHeadCasingScaleExpression.hashCode() + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + iRemoteActionCompatParcelizer) * 31)) * 31)) * 31)) * 31, 31, this.slotName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteArrowOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteArrowOptions routeArrowOptions = (RouteArrowOptions) obj;
        return this.arrowColor == routeArrowOptions.arrowColor && this.arrowCasingColor == routeArrowOptions.arrowCasingColor && this.arrowHeadIconDrawable == routeArrowOptions.arrowHeadIconDrawable && this.arrowHeadIconCasingDrawable == routeArrowOptions.arrowHeadIconCasingDrawable && this.arrowHeadIcon.equals(routeArrowOptions.arrowHeadIcon) && this.arrowHeadIconCasing.equals(routeArrowOptions.arrowHeadIconCasing) && this.aboveLayerId.equals(routeArrowOptions.aboveLayerId) && this.tolerance == routeArrowOptions.tolerance && this.arrowShaftScaleExpression.equals(routeArrowOptions.arrowShaftScaleExpression) && this.arrowShaftCasingScaleExpression.equals(routeArrowOptions.arrowShaftCasingScaleExpression) && this.arrowHeadScaleExpression.equals(routeArrowOptions.arrowHeadScaleExpression) && this.arrowHeadCasingScaleExpression.equals(routeArrowOptions.arrowHeadCasingScaleExpression) && this.slotName.equals(routeArrowOptions.slotName);
    }
}
