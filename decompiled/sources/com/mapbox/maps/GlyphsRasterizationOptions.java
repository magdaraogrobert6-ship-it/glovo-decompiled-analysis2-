package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class GlyphsRasterizationOptions implements Serializable {
    private final String fontFamily;
    private final GlyphsRasterizationMode rasterizationMode;

    public String getFontFamily() {
        return this.fontFamily;
    }

    public GlyphsRasterizationMode getRasterizationMode() {
        return this.rasterizationMode;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.rasterizationMode, this.fontFamily);
    }

    public Builder toBuilder() {
        return new Builder().rasterizationMode(this.rasterizationMode).fontFamily(this.fontFamily);
    }

    private GlyphsRasterizationOptions(GlyphsRasterizationMode glyphsRasterizationMode, String str) {
        this.rasterizationMode = glyphsRasterizationMode;
        this.fontFamily = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[rasterizationMode: ");
        sb.append(RecordUtils.fieldToString(this.rasterizationMode));
        sb.append(", fontFamily: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.fontFamily, "]");
    }

    public static final class Builder {
        private String fontFamily;
        private GlyphsRasterizationMode rasterizationMode;

        public Builder fontFamily(String str) {
            this.fontFamily = str;
            return this;
        }

        public Builder rasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.rasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public GlyphsRasterizationOptions build() {
            GlyphsRasterizationMode glyphsRasterizationMode = this.rasterizationMode;
            if (glyphsRasterizationMode != null) {
                return new GlyphsRasterizationOptions(glyphsRasterizationMode, this.fontFamily);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rasterizationMode shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GlyphsRasterizationOptions.class != obj.getClass()) {
            return false;
        }
        GlyphsRasterizationOptions glyphsRasterizationOptions = (GlyphsRasterizationOptions) obj;
        return Objects.equals(this.rasterizationMode, glyphsRasterizationOptions.rasterizationMode) && Objects.equals(this.fontFamily, glyphsRasterizationOptions.fontFamily);
    }
}
