package com.mapbox.maps.plugin.locationcomponent;

import com.braze.models.inappmessage.InAppMessageBase;
import com.mapbox.bindgen.Value;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationIndicatorLayerWrapper extends LocationLayerWrapper {
    public static Value buildTransition() {
        HashMap map = new HashMap();
        map.put("delay", new Value(0L));
        map.put(InAppMessageBase.DURATION, new Value(0L));
        return new Value((HashMap<String, Value>) map);
    }

    public LocationIndicatorLayerWrapper(String str) {
        super(str);
    }
}
