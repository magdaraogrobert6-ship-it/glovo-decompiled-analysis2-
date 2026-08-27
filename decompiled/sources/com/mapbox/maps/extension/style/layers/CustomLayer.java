package com.mapbox.maps.extension.style.layers;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomLayer extends Layer {
    public final g0 host;
    public final String layerId;

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getType$extension_style_release() {
        return "custom";
    }

    public CustomLayer(String str, g0 g0Var) {
        str.getClass();
        this.layerId = str;
        this.host = g0Var;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Expected addLayer(MapboxStyleManager mapboxStyleManager, Value value, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        g0 g0Var = this.host;
        String str = this.layerId;
        Expected<String, None> expectedAddStyleCustomLayer = mapboxStyleManager.addStyleCustomLayer(str, g0Var, layerPosition);
        mapboxStyleManager.setStyleLayerProperties(str, value);
        return expectedAddStyleCustomLayer;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Expected addPersistentLayer(MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        g0 g0Var = this.host;
        String str = this.layerId;
        Expected<String, None> expectedAddPersistentStyleCustomLayer = mapboxStyleManager.addPersistentStyleCustomLayer(str, g0Var, layerPosition);
        mapboxStyleManager.setStyleLayerProperties(str, getCachedLayerProperties());
        return expectedAddPersistentStyleCustomLayer;
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
        if (strReplace.equals("VISIBLE")) {
            return Visibility.VISIBLE;
        }
        if (strReplace.equals("NONE")) {
            return Visibility.NONE;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace));
        return null;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Layer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
        return this;
    }
}
