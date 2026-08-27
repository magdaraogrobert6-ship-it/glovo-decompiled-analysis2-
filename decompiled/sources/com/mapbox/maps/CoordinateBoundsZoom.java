package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public final class CoordinateBoundsZoom implements Serializable {
    private final CoordinateBounds bounds;
    private final double zoom;

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public double getZoom() {
        return this.zoom;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.bounds, Double.valueOf(this.zoom));
    }

    public CoordinateBoundsZoom(CoordinateBounds coordinateBounds, double d) {
        this.bounds = coordinateBounds;
        this.zoom = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[bounds: ");
        sb.append(RecordUtils.fieldToString(this.bounds));
        sb.append(", zoom: ");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.zoom, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CoordinateBoundsZoom.class != obj.getClass()) {
            return false;
        }
        CoordinateBoundsZoom coordinateBoundsZoom = (CoordinateBoundsZoom) obj;
        return Objects.equals(this.bounds, coordinateBoundsZoom.bounds) && PartialEq.compare(this.zoom, coordinateBoundsZoom.zoom);
    }
}
