package com.mapbox.maps.extension.style.layers;

import androidx.datastore.core.SingleProcessDataStore$file$2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Layer {
    public Value appliedLayerPropertiesValue;
    public MapboxStyleManager delegate;
    public String internalSourceId;
    public final isAdapterPositionOnScreen layerProperties$delegate = new isAdapterPositionOnScreen(new SingleProcessDataStore$file$2(7, this));

    public abstract String getLayerId();

    public abstract String getType$extension_style_release();

    public abstract Visibility getVisibility();

    public abstract Layer visibility(Visibility visibility);

    public final Value getCachedLayerProperties() {
        HashMap map = new HashMap();
        Collection<PropertyValue> collectionValues = ((HashMap) this.layerProperties$delegate.MediaSessionCompatResultReceiverWrapper()).values();
        collectionValues.getClass();
        for (PropertyValue propertyValue : collectionValues) {
            map.put(propertyValue.propertyName, propertyValue.value);
        }
        return new Value((HashMap<String, Value>) map);
    }

    public final void setProperty$extension_style_release(PropertyValue propertyValue) {
        HashMap map = (HashMap) this.layerProperties$delegate.MediaSessionCompatResultReceiverWrapper();
        String str = propertyValue.propertyName;
        map.put(str, propertyValue);
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager != null) {
            String layerId = getLayerId();
            Value value = propertyValue.value;
            String error = mapboxStyleManager.setStyleLayerProperty(layerId, str, value).getError();
            if (error == null) {
                return;
            }
            throw new MapboxStyleException("Set layer property \"" + str + "\" failed:\n" + error + '\n' + value);
        }
    }

    public Expected addLayer(MapboxStyleManager mapboxStyleManager, Value value, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        return mapboxStyleManager.addStyleLayer(value, layerPosition);
    }

    public Expected addPersistentLayer(MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        return mapboxStyleManager.addPersistentStyleLayer(getCachedLayerProperties(), layerPosition);
    }

    public final void bindTo(MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        this.delegate = mapboxStyleManager;
        Value cachedLayerProperties = this.appliedLayerPropertiesValue;
        if (cachedLayerProperties == null) {
            cachedLayerProperties = getCachedLayerProperties();
        }
        String str = (String) addLayer(mapboxStyleManager, cachedLayerProperties, layerPosition).getError();
        if (str != null) {
            throw new MapboxStyleException("Add layer failed: ".concat(str));
        }
        if (this.appliedLayerPropertiesValue != null) {
            Collection collectionValues = ((HashMap) this.layerProperties$delegate.MediaSessionCompatResultReceiverWrapper()).values();
            collectionValues.getClass();
            ArrayList<PropertyValue> arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                String str2 = ((PropertyValue) obj).propertyName;
                if (!str2.equals("id") && !str2.equals("type") && !str2.equals("source")) {
                    arrayList.add(obj);
                }
            }
            for (PropertyValue propertyValue : arrayList) {
                mapboxStyleManager.setStyleLayerProperty(getLayerId(), propertyValue.propertyName, propertyValue.value);
            }
        }
    }

    public static final Object access$getPropertyValueWithType(Layer layer, String str, Class cls) {
        MapboxStyleManager mapboxStyleManager = layer.delegate;
        if (mapboxStyleManager == null) {
            throw new MapboxStyleException(ff$$ExternalSyntheticOutline0.m("Couldn't get ", str, ": layer is not added to style yet."));
        }
        try {
            return TypeUtilsKt.unwrap(mapboxStyleManager.getStyleLayerProperty(layer.getLayerId(), str), cls);
        } catch (RuntimeException e) {
            if (cls.equals(Expression.class)) {
                return null;
            }
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Get layer property=", str, " for layerId=");
            sbM.append(layer.getLayerId());
            sbM.append(" failed: ");
            sbM.append(e.getMessage());
            sbM.append(". Value obtained: ");
            sbM.append(mapboxStyleManager.getStyleLayerProperty(layer.getLayerId(), str));
            SentryLogcatAdapter.serializer("Mbgl-Layer", sbM.toString());
            return null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Collection collectionValues = ((HashMap) this.layerProperties$delegate.MediaSessionCompatResultReceiverWrapper()).values();
        collectionValues.getClass();
        return ff$$ExternalSyntheticOutline0.m(sb, onContentCardDismissed.IconCompatParcelizer(collectionValues, null, null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.maps.extension.style.layers.Layer.toString.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                PropertyValue propertyValue = (PropertyValue) obj;
                propertyValue.getClass();
                return propertyValue.propertyName + " = " + propertyValue.value;
            }
        }, 31), "}]");
    }
}
