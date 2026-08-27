package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraBounds implements Serializable {
    private final CoordinateBounds bounds;
    private final double maxPitch;
    private final double maxZoom;
    private final double minPitch;
    private final double minZoom;

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public double getMaxPitch() {
        return this.maxPitch;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinPitch() {
        return this.minPitch;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.bounds, Double.valueOf(this.maxZoom), Double.valueOf(this.minZoom), Double.valueOf(this.maxPitch), Double.valueOf(this.minPitch));
    }

    public CameraBounds(CoordinateBounds coordinateBounds, double d, double d2, double d3, double d4) {
        this.bounds = coordinateBounds;
        this.maxZoom = d;
        this.minZoom = d2;
        this.maxPitch = d3;
        this.minPitch = d4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[bounds: ");
        sb.append(RecordUtils.fieldToString(this.bounds));
        sb.append(", maxZoom: ");
        m1$$ExternalSyntheticOutline0.m(this.maxZoom, ", minZoom: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.minZoom, ", maxPitch: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.maxPitch, ", minPitch: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.minPitch, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraBounds.class != obj.getClass()) {
            return false;
        }
        CameraBounds cameraBounds = (CameraBounds) obj;
        return Objects.equals(this.bounds, cameraBounds.bounds) && PartialEq.compare(this.maxZoom, cameraBounds.maxZoom) && PartialEq.compare(this.minZoom, cameraBounds.minZoom) && PartialEq.compare(this.maxPitch, cameraBounds.maxPitch) && PartialEq.compare(this.minPitch, cameraBounds.minPitch);
    }
}
