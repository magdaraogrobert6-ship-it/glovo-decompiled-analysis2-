package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public final class LayerPosition implements Serializable {
    private final String above;
    private final Integer at;
    private final String below;

    public String getAbove() {
        return this.above;
    }

    public Integer getAt() {
        return this.at;
    }

    public String getBelow() {
        return this.below;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.above, this.below, this.at);
    }

    public LayerPosition(String str, String str2, Integer num) {
        this.above = str;
        this.below = str2;
        this.at = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[above: ");
        IconCompatParcelizer.read(sb, this.above, ", below: ");
        IconCompatParcelizer.read(sb, this.below, ", at: ");
        sb.append(RecordUtils.fieldToString(this.at));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LayerPosition.class != obj.getClass()) {
            return false;
        }
        LayerPosition layerPosition = (LayerPosition) obj;
        return Objects.equals(this.above, layerPosition.above) && Objects.equals(this.below, layerPosition.below) && Objects.equals(this.at, layerPosition.at);
    }
}
