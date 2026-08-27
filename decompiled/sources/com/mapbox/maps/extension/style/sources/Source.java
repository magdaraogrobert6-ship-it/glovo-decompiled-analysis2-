package com.mapbox.maps.extension.style.sources;

import androidx.datastore.core.SingleProcessDataStore$file$2;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Source {
    public MapboxStyleManager delegate;
    public final String sourceId;
    public final isAdapterPositionOnScreen sourceProperties$delegate;
    public final isAdapterPositionOnScreen volatileSourceProperties$delegate;

    public abstract String getType$extension_style_release();

    public final Value getCachedSourceProperties() {
        HashMap map = new HashMap();
        Collection<PropertyValue> collectionValues = getSourceProperties$extension_style_release().values();
        collectionValues.getClass();
        for (PropertyValue propertyValue : collectionValues) {
            map.put(propertyValue.propertyName, propertyValue.value);
        }
        return new Value((HashMap<String, Value>) map);
    }

    public final HashMap getSourceProperties$extension_style_release() {
        return (HashMap) this.sourceProperties$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final HashMap getVolatileSourceProperties$extension_style_release() {
        return (HashMap) this.volatileSourceProperties$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public Source(String str) {
        str.getClass();
        this.sourceId = str;
        this.sourceProperties$delegate = new isAdapterPositionOnScreen(new SingleProcessDataStore$file$2(8, this));
        this.volatileSourceProperties$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.maps.extension.style.sources.Source$volatileSourceProperties$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return new HashMap();
            }
        });
    }

    public Expected addSource(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        return mapboxStyleManager.addStyleSource(this.sourceId, getCachedSourceProperties());
    }

    public void bindTo(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        this.delegate = mapboxStyleManager;
        String str = (String) addSource(mapboxStyleManager).getError();
        if (str != null) {
            SentryLogcatAdapter.serializer("Mbgl-Source", getCachedSourceProperties().toString());
            throw new MapboxStyleException("Add source failed: ".concat(str));
        }
        Iterator it = getVolatileSourceProperties$extension_style_release().entrySet().iterator();
        while (it.hasNext()) {
            PropertyValue propertyValue = (PropertyValue) ((Map.Entry) it.next()).getValue();
            MapboxStyleManager mapboxStyleManager2 = this.delegate;
            if (mapboxStyleManager2 != null) {
                String str2 = propertyValue.propertyName;
                Value value = propertyValue.value;
                String error = mapboxStyleManager2.setStyleSourceProperty(this.sourceId, str2, value).getError();
                if (error != null) {
                    throw new MapboxStyleException("Set source property \"" + propertyValue.propertyName + "\" failed:\nError: " + error + "\nValue set: " + value);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[sourceId = ");
        sb.append(this.sourceId);
        sb.append(", ");
        Collection collectionValues = getSourceProperties$extension_style_release().values();
        collectionValues.getClass();
        return ff$$ExternalSyntheticOutline0.m(sb, onContentCardDismissed.IconCompatParcelizer(collectionValues, null, null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.maps.extension.style.sources.Source.toString.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                PropertyValue propertyValue = (PropertyValue) obj;
                propertyValue.getClass();
                return propertyValue.propertyName + " = " + propertyValue.value;
            }
        }, 31), "}]");
    }
}
