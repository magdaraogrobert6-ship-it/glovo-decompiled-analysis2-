package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class OfflineRegionTilePyramidDefinition implements Serializable {
    private final CoordinateBounds bounds;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.styleURL;
        CoordinateBounds coordinateBounds = this.bounds;
        double d = this.minZoom;
        double d2 = this.maxZoom;
        float f = this.pixelRatio;
        return Objects.hash(str, coordinateBounds, Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).bounds(this.bounds).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public static final class Builder {
        private CoordinateBounds bounds;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public Builder bounds(CoordinateBounds coordinateBounds) {
            this.bounds = coordinateBounds;
            return this;
        }

        public Builder glyphsRasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.glyphsRasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public Builder maxZoom(double d) {
            this.maxZoom = d;
            return this;
        }

        public Builder minZoom(double d) {
            this.minZoom = d;
            return this;
        }

        public Builder pixelRatio(float f) {
            this.pixelRatio = f;
            return this;
        }

        public Builder styleURL(String str) {
            this.styleURL = str;
            return this;
        }

        public OfflineRegionTilePyramidDefinition build() {
            String str = this.styleURL;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("styleURL shouldn't be null");
                return null;
            }
            CoordinateBounds coordinateBounds = this.bounds;
            if (coordinateBounds == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("bounds shouldn't be null");
                return null;
            }
            GlyphsRasterizationMode glyphsRasterizationMode = this.glyphsRasterizationMode;
            if (glyphsRasterizationMode != null) {
                return new OfflineRegionTilePyramidDefinition(str, coordinateBounds, this.minZoom, this.maxZoom, this.pixelRatio, glyphsRasterizationMode);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("glyphsRasterizationMode shouldn't be null");
            return null;
        }
    }

    private OfflineRegionTilePyramidDefinition(String str, CoordinateBounds coordinateBounds, double d, double d2, float f, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.bounds = coordinateBounds;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[styleURL: ");
        IconCompatParcelizer.read(sb, this.styleURL, ", bounds: ");
        sb.append(RecordUtils.fieldToString(this.bounds));
        sb.append(", minZoom: ");
        m1$$ExternalSyntheticOutline0.m(this.minZoom, ", maxZoom: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.maxZoom, ", pixelRatio: ", sb);
        getBitmapFromCache.write(this.pixelRatio, ", glyphsRasterizationMode: ", sb);
        sb.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionTilePyramidDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition = (OfflineRegionTilePyramidDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionTilePyramidDefinition.styleURL) && Objects.equals(this.bounds, offlineRegionTilePyramidDefinition.bounds) && PartialEq.compare(this.minZoom, offlineRegionTilePyramidDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionTilePyramidDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionTilePyramidDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionTilePyramidDefinition.glyphsRasterizationMode);
    }
}
