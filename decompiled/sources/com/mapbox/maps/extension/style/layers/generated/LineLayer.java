package com.mapbox.maps.extension.style.layers.generated;

import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.utils.ColorUtils$colorIntToRgbaExpression$1;
import java.util.List;
import java.util.Locale;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class LineLayer extends Layer {
    public final String layerId;

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getType$extension_style_release() {
        return "line";
    }

    public final void lineOpacity(Expression expression) {
        SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-opacity", expression, this);
    }

    public LineLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.internalSourceId = str2;
    }

    public final void lineCap() {
        setProperty$extension_style_release(new PropertyValue("line-cap", LineCap.ROUND));
    }

    public final void lineJoin() {
        setProperty$extension_style_release(new PropertyValue("line-join", LineJoin.ROUND));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Visibility getVisibility() {
        String str = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
        if (str == null) {
            return null;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        String strReplace = upperCase.replace('-', '_');
        strReplace.getClass();
        return zzjc.valueOf(strReplace);
    }

    public final void lineDasharray(List list) {
        list.getClass();
        setProperty$extension_style_release(new PropertyValue("line-dasharray", list));
    }

    public final void lineBlur(double d) {
        setProperty$extension_style_release(new PropertyValue("line-blur", Double.valueOf(d)));
    }

    public final void lineWidth(double d) {
        setProperty$extension_style_release(new PropertyValue("line-width", Double.valueOf(d)));
    }

    public final void slot$1(String str) {
        str.getClass();
        setProperty$extension_style_release(new PropertyValue("slot", str));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Layer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
        return this;
    }

    public final void lineEmissiveStrength() {
        setProperty$extension_style_release(new PropertyValue("line-emissive-strength", Double.valueOf(1.0d)));
    }

    public final void lineColor(int i) {
        ColorUtils$colorIntToRgbaExpression$1 colorUtils$colorIntToRgbaExpression$1 = new ColorUtils$colorIntToRgbaExpression$1(((double) ((i >> 24) & 255)) / 255.0d, i);
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("rgba");
        colorUtils$colorIntToRgbaExpression$1.invoke(expressionBuilder);
        setProperty$extension_style_release(new PropertyValue("line-color", expressionBuilder.build()));
    }

    public final void lineWidth(Expression expression) {
        expression.getClass();
        setProperty$extension_style_release(new PropertyValue("line-width", expression));
    }

    public final void lineColor(Expression expression) {
        SweepGradientShader9KIMszodefault.IconCompatParcelizer("line-color", expression, this);
    }
}
