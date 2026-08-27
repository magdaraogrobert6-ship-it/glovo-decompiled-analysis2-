package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class CameraBoundsOptions implements Serializable {
    private final CoordinateBounds bounds;
    private final Double maxPitch;
    private final Double maxZoom;
    private final Double minPitch;
    private final Double minZoom;

    public static final class Builder {
        private CoordinateBounds bounds;
        private Double maxPitch;
        private Double maxZoom;
        private Double minPitch;
        private Double minZoom;

        public Builder bounds(CoordinateBounds coordinateBounds) {
            this.bounds = coordinateBounds;
            return this;
        }

        public Builder maxPitch(Double d) {
            this.maxPitch = d;
            return this;
        }

        public Builder maxZoom(Double d) {
            this.maxZoom = d;
            return this;
        }

        public Builder minPitch(Double d) {
            this.minPitch = d;
            return this;
        }

        public Builder minZoom(Double d) {
            this.minZoom = d;
            return this;
        }

        public CameraBoundsOptions build() {
            return new CameraBoundsOptions(this.bounds, this.maxZoom, this.minZoom, this.maxPitch, this.minPitch);
        }
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public Double getMaxPitch() {
        return this.maxPitch;
    }

    public Double getMaxZoom() {
        return this.maxZoom;
    }

    public Double getMinPitch() {
        return this.minPitch;
    }

    public Double getMinZoom() {
        return this.minZoom;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.bounds, this.maxZoom, this.minZoom, this.maxPitch, this.minPitch);
    }

    public Builder toBuilder() {
        return new Builder().bounds(this.bounds).maxZoom(this.maxZoom).minZoom(this.minZoom).maxPitch(this.maxPitch).minPitch(this.minPitch);
    }

    private CameraBoundsOptions(CoordinateBounds coordinateBounds, Double d, Double d2, Double d3, Double d4) {
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
        af$$ExternalSyntheticOutline1.m(this.maxZoom, sb, ", minZoom: ");
        af$$ExternalSyntheticOutline1.m(this.minZoom, sb, ", maxPitch: ");
        af$$ExternalSyntheticOutline1.m(this.maxPitch, sb, ", minPitch: ");
        sb.append(RecordUtils.fieldToString(this.minPitch));
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
        CameraBoundsOptions cameraBoundsOptions = (CameraBoundsOptions) obj;
        return Objects.equals(this.bounds, cameraBoundsOptions.bounds) && Objects.equals(this.maxZoom, cameraBoundsOptions.maxZoom) && Objects.equals(this.minZoom, cameraBoundsOptions.minZoom) && Objects.equals(this.maxPitch, cameraBoundsOptions.maxPitch) && Objects.equals(this.minPitch, cameraBoundsOptions.minPitch);
    }
}
