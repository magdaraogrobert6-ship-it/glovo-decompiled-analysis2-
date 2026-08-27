package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes2.dex */
public final class MapOptions implements Serializable {
    private final ConstrainMode constrainMode;
    private final ContextMode contextMode;
    private final Boolean crossSourceCollisions;
    private final GlyphsRasterizationOptions glyphsRasterizationOptions;
    private final NorthOrientation orientation;
    private final float pixelRatio;
    private final float scaleFactor;
    private final Size size;
    private final ViewportMode viewportMode;

    public static final class Builder {
        private ConstrainMode constrainMode;
        private ContextMode contextMode;
        private Boolean crossSourceCollisions;
        private GlyphsRasterizationOptions glyphsRasterizationOptions;
        private NorthOrientation orientation;
        private float pixelRatio = 1.0f;
        private float scaleFactor = 1.0f;
        private Size size;
        private ViewportMode viewportMode;

        public Builder constrainMode(ConstrainMode constrainMode) {
            this.constrainMode = constrainMode;
            return this;
        }

        public Builder contextMode(ContextMode contextMode) {
            this.contextMode = contextMode;
            return this;
        }

        public Builder crossSourceCollisions(Boolean bool) {
            this.crossSourceCollisions = bool;
            return this;
        }

        public Builder glyphsRasterizationOptions(GlyphsRasterizationOptions glyphsRasterizationOptions) {
            this.glyphsRasterizationOptions = glyphsRasterizationOptions;
            return this;
        }

        public Builder orientation(NorthOrientation northOrientation) {
            this.orientation = northOrientation;
            return this;
        }

        public Builder pixelRatio(float f) {
            this.pixelRatio = f;
            return this;
        }

        @com.mapbox.annotation.MapboxExperimental
        public Builder scaleFactor(float f) {
            this.scaleFactor = f;
            return this;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder viewportMode(ViewportMode viewportMode) {
            this.viewportMode = viewportMode;
            return this;
        }

        public MapOptions build() {
            return new MapOptions(this.contextMode, this.constrainMode, this.viewportMode, this.orientation, this.crossSourceCollisions, this.size, this.pixelRatio, this.glyphsRasterizationOptions, this.scaleFactor);
        }
    }

    public ConstrainMode getConstrainMode() {
        return this.constrainMode;
    }

    public ContextMode getContextMode() {
        return this.contextMode;
    }

    public Boolean getCrossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    public GlyphsRasterizationOptions getGlyphsRasterizationOptions() {
        return this.glyphsRasterizationOptions;
    }

    public NorthOrientation getOrientation() {
        return this.orientation;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    @com.mapbox.annotation.MapboxExperimental
    public float getScaleFactor() {
        return this.scaleFactor;
    }

    public Size getSize() {
        return this.size;
    }

    public ViewportMode getViewportMode() {
        return this.viewportMode;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        ContextMode contextMode = this.contextMode;
        ConstrainMode constrainMode = this.constrainMode;
        ViewportMode viewportMode = this.viewportMode;
        NorthOrientation northOrientation = this.orientation;
        Boolean bool = this.crossSourceCollisions;
        Size size = this.size;
        float f = this.pixelRatio;
        return Objects.hash(contextMode, constrainMode, viewportMode, northOrientation, bool, size, Float.valueOf(f), this.glyphsRasterizationOptions, Float.valueOf(this.scaleFactor));
    }

    public Builder toBuilder() {
        return new Builder().contextMode(this.contextMode).constrainMode(this.constrainMode).viewportMode(this.viewportMode).orientation(this.orientation).crossSourceCollisions(this.crossSourceCollisions).size(this.size).pixelRatio(this.pixelRatio).glyphsRasterizationOptions(this.glyphsRasterizationOptions).scaleFactor(this.scaleFactor);
    }

    private MapOptions(ContextMode contextMode, ConstrainMode constrainMode, ViewportMode viewportMode, NorthOrientation northOrientation, Boolean bool, Size size, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.contextMode = contextMode;
        this.constrainMode = constrainMode;
        this.viewportMode = viewportMode;
        this.orientation = northOrientation;
        this.crossSourceCollisions = bool;
        this.size = size;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.pixelRatio = 1.0f;
        this.scaleFactor = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[contextMode: ");
        sb.append(RecordUtils.fieldToString(this.contextMode));
        sb.append(", constrainMode: ");
        sb.append(RecordUtils.fieldToString(this.constrainMode));
        sb.append(", viewportMode: ");
        sb.append(RecordUtils.fieldToString(this.viewportMode));
        sb.append(", orientation: ");
        sb.append(RecordUtils.fieldToString(this.orientation));
        sb.append(", crossSourceCollisions: ");
        getBitmapFromCache.write(sb, ", size: ", this.crossSourceCollisions);
        sb.append(RecordUtils.fieldToString(this.size));
        sb.append(", pixelRatio: ");
        getBitmapFromCache.write(this.pixelRatio, ", glyphsRasterizationOptions: ", sb);
        sb.append(RecordUtils.fieldToString(this.glyphsRasterizationOptions));
        sb.append(", scaleFactor: ");
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.scaleFactor)));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapOptions.class != obj.getClass()) {
            return false;
        }
        MapOptions mapOptions = (MapOptions) obj;
        return Objects.equals(this.contextMode, mapOptions.contextMode) && Objects.equals(this.constrainMode, mapOptions.constrainMode) && Objects.equals(this.viewportMode, mapOptions.viewportMode) && Objects.equals(this.orientation, mapOptions.orientation) && Objects.equals(this.crossSourceCollisions, mapOptions.crossSourceCollisions) && Objects.equals(this.size, mapOptions.size) && PartialEq.compare(this.pixelRatio, mapOptions.pixelRatio) && Objects.equals(this.glyphsRasterizationOptions, mapOptions.glyphsRasterizationOptions) && PartialEq.compare(this.scaleFactor, mapOptions.scaleFactor);
    }

    private MapOptions(ContextMode contextMode, ConstrainMode constrainMode, ViewportMode viewportMode, NorthOrientation northOrientation, Boolean bool, Size size, float f, GlyphsRasterizationOptions glyphsRasterizationOptions, float f2) {
        this.contextMode = contextMode;
        this.constrainMode = constrainMode;
        this.viewportMode = viewportMode;
        this.orientation = northOrientation;
        this.crossSourceCollisions = bool;
        this.size = size;
        this.pixelRatio = f;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.scaleFactor = f2;
    }
}
