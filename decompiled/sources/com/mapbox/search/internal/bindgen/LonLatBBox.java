package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class LonLatBBox implements Serializable {
    private final Point max;
    private final Point min;

    public Point getMax() {
        return this.max;
    }

    public Point getMin() {
        return this.min;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.min, this.max);
    }

    public LonLatBBox(Point point, Point point2) {
        this.min = point;
        this.max = point2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[min: ");
        c8$$ExternalSyntheticOutline0.m(this.min, sb, ", max: ");
        sb.append(RecordUtils.fieldToString(this.max));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LonLatBBox lonLatBBox = (LonLatBBox) obj;
        return Objects.equals(this.min, lonLatBBox.min) && Objects.equals(this.max, lonLatBBox.max);
    }
}
