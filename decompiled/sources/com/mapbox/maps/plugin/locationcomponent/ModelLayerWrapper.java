package com.mapbox.maps.plugin.locationcomponent;

import com.braze.models.inappmessage.InAppMessageBase;
import com.mapbox.bindgen.Value;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ModelLayerWrapper extends LocationLayerWrapper {
    public static Value buildTransition$1() {
        HashMap map = new HashMap();
        map.put("delay", new Value(0L));
        map.put(InAppMessageBase.DURATION, new Value(0L));
        return new Value((HashMap<String, Value>) map);
    }

    public ModelLayerWrapper(String str) {
        super(str);
    }
}
