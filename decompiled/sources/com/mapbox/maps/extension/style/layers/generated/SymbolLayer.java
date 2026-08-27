package com.mapbox.maps.extension.style.layers.generated;

import com.google.android.gms.internal.mlkit_vision_face.zzjc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import java.util.Locale;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class SymbolLayer extends Layer {
    public final String layerId;

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getLayerId() {
        return this.layerId;
    }

    public final void iconOpacity(Expression expression) {
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-opacity", expression, this);
    }

    public final void iconRotate(Expression expression) {
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-rotate", expression, this);
    }

    public final void iconSize(Expression expression) {
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer("icon-size", expression, this);
    }

    public SymbolLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.internalSourceId = str2;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getType$extension_style_release() {
        return "symbol";
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

    public final void slot$2(String str) {
        str.getClass();
        setProperty$extension_style_release(new PropertyValue("slot", str));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Layer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
        return this;
    }
}
