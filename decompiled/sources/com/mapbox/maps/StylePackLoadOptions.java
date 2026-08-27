package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class StylePackLoadOptions implements Serializable {
    private final boolean acceptExpired;
    private final Value extraOptions;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final Value metadata;

    public static final class Builder {
        private boolean acceptExpired = false;
        private Value extraOptions;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private Value metadata;

        public Builder acceptExpired(boolean z) {
            this.acceptExpired = z;
            return this;
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder glyphsRasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.glyphsRasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public Builder metadata(Value value) {
            this.metadata = value;
            return this;
        }

        public StylePackLoadOptions build() {
            return new StylePackLoadOptions(this.glyphsRasterizationMode, this.metadata, this.acceptExpired, this.extraOptions);
        }
    }

    public boolean getAcceptExpired() {
        return this.acceptExpired;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public Value getMetadata() {
        return this.metadata;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        GlyphsRasterizationMode glyphsRasterizationMode = this.glyphsRasterizationMode;
        Value value = this.metadata;
        boolean z = this.acceptExpired;
        return Objects.hash(glyphsRasterizationMode, value, Boolean.valueOf(z), this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().glyphsRasterizationMode(this.glyphsRasterizationMode).metadata(this.metadata).acceptExpired(this.acceptExpired).extraOptions(this.extraOptions);
    }

    private StylePackLoadOptions(GlyphsRasterizationMode glyphsRasterizationMode, Value value, Value value2) {
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.metadata = value;
        this.extraOptions = value2;
        this.acceptExpired = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[glyphsRasterizationMode: ");
        sb.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb.append(", metadata: ");
        sb.append(RecordUtils.fieldToString(this.metadata));
        sb.append(", acceptExpired: ");
        MediaSessionCompatQueueItem.write(sb, this.acceptExpired, ", extraOptions: ");
        sb.append(RecordUtils.fieldToString(this.extraOptions));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePackLoadOptions.class != obj.getClass()) {
            return false;
        }
        StylePackLoadOptions stylePackLoadOptions = (StylePackLoadOptions) obj;
        return Objects.equals(this.glyphsRasterizationMode, stylePackLoadOptions.glyphsRasterizationMode) && Objects.equals(this.metadata, stylePackLoadOptions.metadata) && this.acceptExpired == stylePackLoadOptions.acceptExpired && Objects.equals(this.extraOptions, stylePackLoadOptions.extraOptions);
    }

    private StylePackLoadOptions(GlyphsRasterizationMode glyphsRasterizationMode, Value value, boolean z, Value value2) {
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.metadata = value;
        this.acceptExpired = z;
        this.extraOptions = value2;
    }
}
