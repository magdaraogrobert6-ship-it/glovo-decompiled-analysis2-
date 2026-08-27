package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class FeatureExtensionValue implements Serializable {
    private final List<Feature> featureCollection;
    private final Value value;

    public List<Feature> getFeatureCollection() {
        return this.featureCollection;
    }

    public Value getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.value, this.featureCollection);
    }

    public FeatureExtensionValue(Value value, List<Feature> list) {
        this.value = value;
        this.featureCollection = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[value: ");
        sb.append(RecordUtils.fieldToString(this.value));
        sb.append(", featureCollection: ");
        return MediaSessionCompatQueueItem.read(this.featureCollection, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeatureExtensionValue.class != obj.getClass()) {
            return false;
        }
        FeatureExtensionValue featureExtensionValue = (FeatureExtensionValue) obj;
        return Objects.equals(this.value, featureExtensionValue.value) && Objects.equals(this.featureCollection, featureExtensionValue.featureCollection);
    }
}
