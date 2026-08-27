package com.mapbox.maps.plugin.locationcomponent;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LocationLayerWrapper {
    public final String layerId;
    public final HashMap layerProperties = new HashMap();
    public MapboxStyleManager style;

    public final void updateProperty(String str, Value value) {
        String error;
        this.layerProperties.put(str, value);
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleLayerProperty(this.layerId, str, value).getError()) == null) {
            return;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Set layer property \"", str, "\" failed:\nError: ", error, "\nValue set: ");
        sbM.append(value);
        MapboxLogger.logE("MapboxLocationLayerWrapper", sbM.toString());
    }

    public LocationLayerWrapper(String str) {
        this.layerId = str;
    }

    public final void bindTo(MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        this.style = mapboxStyleManager;
        String error = mapboxStyleManager.addPersistentStyleLayer(new Value((HashMap<String, Value>) this.layerProperties), layerPosition).getError();
        if (error != null) {
            throw new MapboxLocationComponentException("Add layer failed: ".concat(error));
        }
    }
}
