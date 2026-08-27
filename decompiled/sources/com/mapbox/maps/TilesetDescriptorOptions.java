package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public final class TilesetDescriptorOptions implements Serializable {
    private final Value extraOptions;
    private final byte maxZoom;
    private final byte minZoom;
    private final float pixelRatio;
    private final StylePackLoadOptions stylePackOptions;
    private final String styleURI;
    private final List<String> tilesets;

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePackLoadOptions getStylePackOptions() {
        return this.stylePackOptions;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public List<String> getTilesets() {
        return this.tilesets;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.styleURI;
        byte b = this.minZoom;
        byte b2 = this.maxZoom;
        float f = this.pixelRatio;
        return Objects.hash(str, Byte.valueOf(b), Byte.valueOf(b2), Float.valueOf(f), this.tilesets, this.stylePackOptions, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().styleURI(this.styleURI).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).tilesets(this.tilesets).stylePackOptions(this.stylePackOptions).extraOptions(this.extraOptions);
    }

    private TilesetDescriptorOptions(String str, byte b, byte b2, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b;
        this.maxZoom = b2;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
        this.pixelRatio = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[styleURI: ");
        IconCompatParcelizer.read(sb, this.styleURI, ", minZoom: ");
        MediaSessionCompatQueueItem.serializer(this.minZoom, sb, ", maxZoom: ");
        MediaSessionCompatQueueItem.serializer(this.maxZoom, sb, ", pixelRatio: ");
        getBitmapFromCache.write(this.pixelRatio, ", tilesets: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.tilesets, ", stylePackOptions: ");
        sb.append(RecordUtils.fieldToString(this.stylePackOptions));
        sb.append(", extraOptions: ");
        sb.append(RecordUtils.fieldToString(this.extraOptions));
        sb.append("]");
        return sb.toString();
    }

    public static final class Builder {
        private Value extraOptions;
        private byte maxZoom;
        private byte minZoom;
        private float pixelRatio = 1.0f;
        private StylePackLoadOptions stylePackOptions;
        private String styleURI;
        private List<String> tilesets;

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder maxZoom(byte b) {
            this.maxZoom = b;
            return this;
        }

        public Builder minZoom(byte b) {
            this.minZoom = b;
            return this;
        }

        public Builder pixelRatio(float f) {
            this.pixelRatio = f;
            return this;
        }

        public Builder stylePackOptions(StylePackLoadOptions stylePackLoadOptions) {
            this.stylePackOptions = stylePackLoadOptions;
            return this;
        }

        public Builder styleURI(String str) {
            this.styleURI = str;
            return this;
        }

        public Builder tilesets(List<String> list) {
            this.tilesets = list;
            return this;
        }

        public TilesetDescriptorOptions build() {
            String str = this.styleURI;
            if (str != null) {
                return new TilesetDescriptorOptions(str, this.minZoom, this.maxZoom, this.pixelRatio, this.tilesets, this.stylePackOptions, this.extraOptions);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("styleURI shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TilesetDescriptorOptions.class != obj.getClass()) {
            return false;
        }
        TilesetDescriptorOptions tilesetDescriptorOptions = (TilesetDescriptorOptions) obj;
        return Objects.equals(this.styleURI, tilesetDescriptorOptions.styleURI) && this.minZoom == tilesetDescriptorOptions.minZoom && this.maxZoom == tilesetDescriptorOptions.maxZoom && PartialEq.compare(this.pixelRatio, tilesetDescriptorOptions.pixelRatio) && Objects.equals(this.tilesets, tilesetDescriptorOptions.tilesets) && Objects.equals(this.stylePackOptions, tilesetDescriptorOptions.stylePackOptions) && Objects.equals(this.extraOptions, tilesetDescriptorOptions.extraOptions);
    }

    private TilesetDescriptorOptions(String str, byte b, byte b2, float f, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b;
        this.maxZoom = b2;
        this.pixelRatio = f;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
    }
}
