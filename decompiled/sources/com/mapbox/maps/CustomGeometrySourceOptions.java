package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomGeometrySourceOptions implements Serializable {
    private final TileFunctionCallback cancelTileFunction;
    private final TileFunctionCallback fetchTileFunction;
    private final byte maxZoom;
    private final byte minZoom;
    private final TileOptions tileOptions;

    public TileFunctionCallback getCancelTileFunction() {
        return this.cancelTileFunction;
    }

    public TileFunctionCallback getFetchTileFunction() {
        return this.fetchTileFunction;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public TileOptions getTileOptions() {
        return this.tileOptions;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        TileFunctionCallback tileFunctionCallback = this.fetchTileFunction;
        TileFunctionCallback tileFunctionCallback2 = this.cancelTileFunction;
        byte b = this.minZoom;
        byte b2 = this.maxZoom;
        return Objects.hash(tileFunctionCallback, tileFunctionCallback2, Byte.valueOf(b), Byte.valueOf(b2), this.tileOptions);
    }

    public Builder toBuilder() {
        return new Builder().fetchTileFunction(this.fetchTileFunction).cancelTileFunction(this.cancelTileFunction).minZoom(this.minZoom).maxZoom(this.maxZoom).tileOptions(this.tileOptions);
    }

    public static final class Builder {
        private TileFunctionCallback cancelTileFunction;
        private TileFunctionCallback fetchTileFunction;
        private TileOptions tileOptions;
        private byte minZoom = 0;
        private byte maxZoom = 18;

        public Builder cancelTileFunction(TileFunctionCallback tileFunctionCallback) {
            this.cancelTileFunction = tileFunctionCallback;
            return this;
        }

        public Builder fetchTileFunction(TileFunctionCallback tileFunctionCallback) {
            this.fetchTileFunction = tileFunctionCallback;
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

        public Builder tileOptions(TileOptions tileOptions) {
            this.tileOptions = tileOptions;
            return this;
        }

        public CustomGeometrySourceOptions build() {
            TileFunctionCallback tileFunctionCallback = this.fetchTileFunction;
            if (tileFunctionCallback == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("fetchTileFunction shouldn't be null");
                return null;
            }
            TileFunctionCallback tileFunctionCallback2 = this.cancelTileFunction;
            if (tileFunctionCallback2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("cancelTileFunction shouldn't be null");
                return null;
            }
            TileOptions tileOptions = this.tileOptions;
            if (tileOptions != null) {
                return new CustomGeometrySourceOptions(tileFunctionCallback, tileFunctionCallback2, this.minZoom, this.maxZoom, tileOptions);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("tileOptions shouldn't be null");
            return null;
        }
    }

    private CustomGeometrySourceOptions(TileFunctionCallback tileFunctionCallback, TileFunctionCallback tileFunctionCallback2, TileOptions tileOptions) {
        this.fetchTileFunction = tileFunctionCallback;
        this.cancelTileFunction = tileFunctionCallback2;
        this.tileOptions = tileOptions;
        this.minZoom = (byte) 0;
        this.maxZoom = (byte) 18;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[fetchTileFunction: ");
        sb.append(RecordUtils.fieldToString(this.fetchTileFunction));
        sb.append(", cancelTileFunction: ");
        sb.append(RecordUtils.fieldToString(this.cancelTileFunction));
        sb.append(", minZoom: ");
        MediaSessionCompatQueueItem.serializer(this.minZoom, sb, ", maxZoom: ");
        MediaSessionCompatQueueItem.serializer(this.maxZoom, sb, ", tileOptions: ");
        sb.append(RecordUtils.fieldToString(this.tileOptions));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomGeometrySourceOptions.class != obj.getClass()) {
            return false;
        }
        CustomGeometrySourceOptions customGeometrySourceOptions = (CustomGeometrySourceOptions) obj;
        return Objects.equals(this.fetchTileFunction, customGeometrySourceOptions.fetchTileFunction) && Objects.equals(this.cancelTileFunction, customGeometrySourceOptions.cancelTileFunction) && this.minZoom == customGeometrySourceOptions.minZoom && this.maxZoom == customGeometrySourceOptions.maxZoom && Objects.equals(this.tileOptions, customGeometrySourceOptions.tileOptions);
    }

    private CustomGeometrySourceOptions(TileFunctionCallback tileFunctionCallback, TileFunctionCallback tileFunctionCallback2, byte b, byte b2, TileOptions tileOptions) {
        this.fetchTileFunction = tileFunctionCallback;
        this.cancelTileFunction = tileFunctionCallback2;
        this.minZoom = b;
        this.maxZoom = b2;
        this.tileOptions = tileOptions;
    }
}
