package com.mapbox.maps;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraState implements Serializable {
    private final double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final double pitch;
    private final double zoom;

    public double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getZoom() {
        return this.zoom;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch));
    }

    public CameraState(Point point, EdgeInsets edgeInsets, double d, double d2, double d3) {
        this.center = point;
        this.padding = edgeInsets;
        this.zoom = d;
        this.bearing = d2;
        this.pitch = d3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[center: ");
        c8$$ExternalSyntheticOutline0.m(this.center, sb, ", padding: ");
        sb.append(RecordUtils.fieldToString(this.padding));
        sb.append(", zoom: ");
        m1$$ExternalSyntheticOutline0.m(this.zoom, ", bearing: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.bearing, ", pitch: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.pitch, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraState.class != obj.getClass()) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return Objects.equals(this.center, cameraState.center) && Objects.equals(this.padding, cameraState.padding) && PartialEq.compare(this.zoom, cameraState.zoom) && PartialEq.compare(this.bearing, cameraState.bearing) && PartialEq.compare(this.pitch, cameraState.pitch);
    }
}
