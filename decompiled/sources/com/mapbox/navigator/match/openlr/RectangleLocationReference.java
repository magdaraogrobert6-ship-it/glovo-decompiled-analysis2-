package com.mapbox.navigator.match.openlr;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class RectangleLocationReference implements Serializable {
    private final Point lowerLeft;
    private final Point upperRight;

    public Point getLowerLeft() {
        return this.lowerLeft;
    }

    public Point getUpperRight() {
        return this.upperRight;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.lowerLeft, this.upperRight);
    }

    public RectangleLocationReference(Point point, Point point2) {
        this.lowerLeft = point;
        this.upperRight = point2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[lowerLeft: ");
        c8$$ExternalSyntheticOutline0.m(this.lowerLeft, sb, ", upperRight: ");
        sb.append(RecordUtils.fieldToString(this.upperRight));
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
        RectangleLocationReference rectangleLocationReference = (RectangleLocationReference) obj;
        return Objects.equals(this.lowerLeft, rectangleLocationReference.lowerLeft) && Objects.equals(this.upperRight, rectangleLocationReference.upperRight);
    }
}
