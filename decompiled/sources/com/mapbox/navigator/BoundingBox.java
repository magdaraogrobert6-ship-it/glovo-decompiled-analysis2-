package com.mapbox.navigator;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class BoundingBox implements Serializable {
    private final Point max;
    private final Point min;

    public Point getMax() {
        return this.max;
    }

    public Point getMin() {
        return this.min;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.min, this.max);
    }

    public BoundingBox(Point point, Point point2) {
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
        BoundingBox boundingBox = (BoundingBox) obj;
        return Objects.equals(this.min, boundingBox.min) && Objects.equals(this.max, boundingBox.max);
    }
}
