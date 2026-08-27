package com.mapbox.navigator.match.openlr;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class PolygonLocationReference implements Serializable {
    private final List<Point> corners;

    public List<Point> getCorners() {
        return this.corners;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.corners);
    }

    public PolygonLocationReference(List<Point> list) {
        this.corners = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.corners, new StringBuilder("[corners: "), "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.corners, ((PolygonLocationReference) obj).corners);
    }
}
