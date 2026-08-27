package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraOptions implements Serializable {
    private final ScreenCoordinate anchor;
    private final Double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final Double pitch;
    private final Double verticalFov;
    private final Double zoom;

    public static final class Builder {
        private ScreenCoordinate anchor;
        private Double bearing;
        private Point center;
        private EdgeInsets padding;
        private Double pitch;
        private Double verticalFov = null;
        private Double zoom;

        public Builder anchor(ScreenCoordinate screenCoordinate) {
            this.anchor = screenCoordinate;
            return this;
        }

        public Builder bearing(Double d) {
            this.bearing = d;
            return this;
        }

        public Builder center(Point point) {
            this.center = point;
            return this;
        }

        public Builder padding(EdgeInsets edgeInsets) {
            this.padding = edgeInsets;
            return this;
        }

        public Builder pitch(Double d) {
            this.pitch = d;
            return this;
        }

        @com.mapbox.annotation.MapboxExperimental
        public Builder verticalFov(Double d) {
            this.verticalFov = d;
            return this;
        }

        public Builder zoom(Double d) {
            this.zoom = d;
            return this;
        }

        public CameraOptions build() {
            return new CameraOptions(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch, this.verticalFov);
        }
    }

    public ScreenCoordinate getAnchor() {
        return this.anchor;
    }

    public Double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public Double getPitch() {
        return this.pitch;
    }

    @com.mapbox.annotation.MapboxExperimental
    public Double getVerticalFov() {
        return this.verticalFov;
    }

    public Double getZoom() {
        return this.zoom;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch, this.verticalFov);
    }

    public Builder toBuilder() {
        return new Builder().center(this.center).padding(this.padding).anchor(this.anchor).zoom(this.zoom).bearing(this.bearing).pitch(this.pitch).verticalFov(this.verticalFov);
    }

    private CameraOptions(Point point, EdgeInsets edgeInsets, ScreenCoordinate screenCoordinate, Double d, Double d2, Double d3) {
        this.center = point;
        this.padding = edgeInsets;
        this.anchor = screenCoordinate;
        this.zoom = d;
        this.bearing = d2;
        this.pitch = d3;
        this.verticalFov = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[center: ");
        c8$$ExternalSyntheticOutline0.m(this.center, sb, ", padding: ");
        sb.append(RecordUtils.fieldToString(this.padding));
        sb.append(", anchor: ");
        sb.append(RecordUtils.fieldToString(this.anchor));
        sb.append(", zoom: ");
        af$$ExternalSyntheticOutline1.m(this.zoom, sb, ", bearing: ");
        af$$ExternalSyntheticOutline1.m(this.bearing, sb, ", pitch: ");
        af$$ExternalSyntheticOutline1.m(this.pitch, sb, ", verticalFov: ");
        sb.append(RecordUtils.fieldToString(this.verticalFov));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraOptions.class != obj.getClass()) {
            return false;
        }
        CameraOptions cameraOptions = (CameraOptions) obj;
        return Objects.equals(this.center, cameraOptions.center) && Objects.equals(this.padding, cameraOptions.padding) && Objects.equals(this.anchor, cameraOptions.anchor) && Objects.equals(this.zoom, cameraOptions.zoom) && Objects.equals(this.bearing, cameraOptions.bearing) && Objects.equals(this.pitch, cameraOptions.pitch) && Objects.equals(this.verticalFov, cameraOptions.verticalFov);
    }

    private CameraOptions(Point point, EdgeInsets edgeInsets, ScreenCoordinate screenCoordinate, Double d, Double d2, Double d3, Double d4) {
        this.center = point;
        this.padding = edgeInsets;
        this.anchor = screenCoordinate;
        this.zoom = d;
        this.bearing = d2;
        this.pitch = d3;
        this.verticalFov = d4;
    }
}
