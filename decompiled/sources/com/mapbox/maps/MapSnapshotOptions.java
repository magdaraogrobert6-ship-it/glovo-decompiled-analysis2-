package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class MapSnapshotOptions implements Serializable {
    private final GlyphsRasterizationOptions glyphsRasterizationOptions;
    private final float pixelRatio;
    private final float scaleFactor;
    private final Size size;

    public GlyphsRasterizationOptions getGlyphsRasterizationOptions() {
        return this.glyphsRasterizationOptions;
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

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        Size size = this.size;
        float f = this.pixelRatio;
        return Objects.hash(size, Float.valueOf(f), this.glyphsRasterizationOptions, Float.valueOf(this.scaleFactor));
    }

    public Builder toBuilder() {
        return new Builder().size(this.size).pixelRatio(this.pixelRatio).glyphsRasterizationOptions(this.glyphsRasterizationOptions).scaleFactor(this.scaleFactor);
    }

    private MapSnapshotOptions(Size size, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.size = size;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.pixelRatio = 1.0f;
        this.scaleFactor = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[size: ");
        sb.append(RecordUtils.fieldToString(this.size));
        sb.append(", pixelRatio: ");
        getBitmapFromCache.write(this.pixelRatio, ", glyphsRasterizationOptions: ", sb);
        sb.append(RecordUtils.fieldToString(this.glyphsRasterizationOptions));
        sb.append(", scaleFactor: ");
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.scaleFactor)));
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private GlyphsRasterizationOptions glyphsRasterizationOptions;
        private float pixelRatio = 1.0f;
        private float scaleFactor = 1.0f;
        private Size size;

        public Builder glyphsRasterizationOptions(GlyphsRasterizationOptions glyphsRasterizationOptions) {
            this.glyphsRasterizationOptions = glyphsRasterizationOptions;
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

        public MapSnapshotOptions build() {
            Size size = this.size;
            if (size != null) {
                return new MapSnapshotOptions(size, this.pixelRatio, this.glyphsRasterizationOptions, this.scaleFactor);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("size shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapSnapshotOptions.class != obj.getClass()) {
            return false;
        }
        MapSnapshotOptions mapSnapshotOptions = (MapSnapshotOptions) obj;
        return Objects.equals(this.size, mapSnapshotOptions.size) && PartialEq.compare(this.pixelRatio, mapSnapshotOptions.pixelRatio) && Objects.equals(this.glyphsRasterizationOptions, mapSnapshotOptions.glyphsRasterizationOptions) && PartialEq.compare(this.scaleFactor, mapSnapshotOptions.scaleFactor);
    }

    private MapSnapshotOptions(Size size, float f, GlyphsRasterizationOptions glyphsRasterizationOptions, float f2) {
        this.size = size;
        this.pixelRatio = f;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.scaleFactor = f2;
    }
}
