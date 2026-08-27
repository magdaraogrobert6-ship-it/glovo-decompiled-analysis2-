package com.mapbox.maps.extension.style.layers.generated;

import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.utils.ColorUtils$colorIntToRgbaExpression$1;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class FillLayer extends Layer {
    public final String layerId;

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getType$extension_style_release() {
        return "fill";
    }

    public FillLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.internalSourceId = str2;
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

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Layer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
        return this;
    }

    public final void fillColor(int i) {
        ColorUtils$colorIntToRgbaExpression$1 colorUtils$colorIntToRgbaExpression$1 = new ColorUtils$colorIntToRgbaExpression$1(((double) ((i >> 24) & 255)) / 255.0d, i);
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("rgba");
        colorUtils$colorIntToRgbaExpression$1.invoke(expressionBuilder);
        setProperty$extension_style_release(new PropertyValue("fill-color", expressionBuilder.build()));
    }
}
