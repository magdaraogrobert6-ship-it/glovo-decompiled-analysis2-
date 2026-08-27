package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class QueriedRasterValues implements Serializable {
    private final HashMap<String, List<Float>> layers;

    public HashMap<String, List<Float>> getLayers() {
        return this.layers;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.layers);
    }

    public QueriedRasterValues(HashMap<String, List<Float>> map) {
        this.layers = map;
    }

    public String toString() {
        return "[layers: " + RecordUtils.fieldToString(this.layers) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && QueriedRasterValues.class == obj.getClass() && Objects.equals(this.layers, ((QueriedRasterValues) obj).layers);
    }
}
