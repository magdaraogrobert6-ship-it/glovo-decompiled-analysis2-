package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class GeoCoordinateLocationReference implements Serializable {
    private final Point coordinate;

    public Point getCoordinate() {
        return this.coordinate;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.coordinate);
    }

    public GeoCoordinateLocationReference(Point point) {
        this.coordinate = point;
    }

    public String toString() {
        return "[coordinate: " + RecordUtils.fieldToString(this.coordinate) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.coordinate, ((GeoCoordinateLocationReference) obj).coordinate);
    }
}
