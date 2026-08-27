package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomRasterSourceOptions implements Serializable {
    private final CustomRasterSourceClient clientCallback;
    private final byte maxZoom;
    private final byte minZoom;
    private final short tileSize;

    public CustomRasterSourceClient getClientCallback() {
        return this.clientCallback;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.clientCallback, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), Short.valueOf(this.tileSize));
    }

    public Builder toBuilder() {
        return new Builder().clientCallback(this.clientCallback).minZoom(this.minZoom).maxZoom(this.maxZoom).tileSize(this.tileSize);
    }

    private CustomRasterSourceOptions(CustomRasterSourceClient customRasterSourceClient) {
        this.clientCallback = customRasterSourceClient;
        this.minZoom = (byte) 0;
        this.maxZoom = (byte) 18;
        this.tileSize = (short) 512;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[clientCallback: ");
        sb.append(RecordUtils.fieldToString(this.clientCallback));
        sb.append(", minZoom: ");
        MediaSessionCompatQueueItem.serializer(this.minZoom, sb, ", maxZoom: ");
        MediaSessionCompatQueueItem.serializer(this.maxZoom, sb, ", tileSize: ");
        sb.append(RecordUtils.fieldToString(Short.valueOf(this.tileSize)));
        sb.append("]");
        return sb.toString();
    }

    public static final class Builder {
        private CustomRasterSourceClient clientCallback;
        private byte minZoom = 0;
        private byte maxZoom = 18;
        private short tileSize = 512;

        public Builder clientCallback(CustomRasterSourceClient customRasterSourceClient) {
            this.clientCallback = customRasterSourceClient;
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

        public Builder tileSize(short s) {
            this.tileSize = s;
            return this;
        }

        public CustomRasterSourceOptions build() {
            CustomRasterSourceClient customRasterSourceClient = this.clientCallback;
            if (customRasterSourceClient != null) {
                return new CustomRasterSourceOptions(customRasterSourceClient, this.minZoom, this.maxZoom, this.tileSize);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("clientCallback shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomRasterSourceOptions.class != obj.getClass()) {
            return false;
        }
        CustomRasterSourceOptions customRasterSourceOptions = (CustomRasterSourceOptions) obj;
        return Objects.equals(this.clientCallback, customRasterSourceOptions.clientCallback) && this.minZoom == customRasterSourceOptions.minZoom && this.maxZoom == customRasterSourceOptions.maxZoom && this.tileSize == customRasterSourceOptions.tileSize;
    }

    private CustomRasterSourceOptions(CustomRasterSourceClient customRasterSourceClient, byte b, byte b2, short s) {
        this.clientCallback = customRasterSourceClient;
        this.minZoom = b;
        this.maxZoom = b2;
        this.tileSize = s;
    }
}
