package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class OfflineRegionGeometryDefinition implements Serializable {
    private final Geometry geometry;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    public Geometry getGeometry() {
        return this.geometry;
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
        Geometry geometry = this.geometry;
        double d = this.minZoom;
        double d2 = this.maxZoom;
        float f = this.pixelRatio;
        return Objects.hash(str, geometry, Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).geometry(this.geometry).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public static final class Builder {
        private Geometry geometry;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public Builder geometry(Geometry geometry) {
            this.geometry = geometry;
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

        public OfflineRegionGeometryDefinition build() {
            String str = this.styleURL;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("styleURL shouldn't be null");
                return null;
            }
            Geometry geometry = this.geometry;
            if (geometry == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("geometry shouldn't be null");
                return null;
            }
            GlyphsRasterizationMode glyphsRasterizationMode = this.glyphsRasterizationMode;
            if (glyphsRasterizationMode != null) {
                return new OfflineRegionGeometryDefinition(str, geometry, this.minZoom, this.maxZoom, this.pixelRatio, glyphsRasterizationMode);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("glyphsRasterizationMode shouldn't be null");
            return null;
        }
    }

    private OfflineRegionGeometryDefinition(String str, Geometry geometry, double d, double d2, float f, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.geometry = geometry;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[styleURL: ");
        IconCompatParcelizer.read(sb, this.styleURL, ", geometry: ");
        sb.append(RecordUtils.fieldToString(this.geometry));
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
        if (obj == null || OfflineRegionGeometryDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionGeometryDefinition offlineRegionGeometryDefinition = (OfflineRegionGeometryDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionGeometryDefinition.styleURL) && Objects.equals(this.geometry, offlineRegionGeometryDefinition.geometry) && PartialEq.compare(this.minZoom, offlineRegionGeometryDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionGeometryDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionGeometryDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionGeometryDefinition.glyphsRasterizationMode);
    }
}
