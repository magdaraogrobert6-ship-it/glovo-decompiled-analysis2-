package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileStore;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TilesConfig implements Serializable {
    private final TileEndpointConfiguration endpointConfig;
    private final TileEndpointConfiguration hdEndpointConfig;
    private final Integer inMemoryTileCache;
    private final Long onDiskTileCache;
    private final TileStore tileStore;
    private final String tilesPath;

    public TileEndpointConfiguration getEndpointConfig() {
        return this.endpointConfig;
    }

    public TileEndpointConfiguration getHdEndpointConfig() {
        return this.hdEndpointConfig;
    }

    public Integer getInMemoryTileCache() {
        return this.inMemoryTileCache;
    }

    public Long getOnDiskTileCache() {
        return this.onDiskTileCache;
    }

    public TileStore getTileStore() {
        return this.tileStore;
    }

    public String getTilesPath() {
        return this.tilesPath;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.tilesPath, this.tileStore, this.inMemoryTileCache, this.onDiskTileCache, this.endpointConfig, this.hdEndpointConfig);
    }

    public TilesConfig(String str, TileStore tileStore, Integer num, Long l, TileEndpointConfiguration tileEndpointConfiguration, TileEndpointConfiguration tileEndpointConfiguration2) {
        this.tilesPath = str;
        this.tileStore = tileStore;
        this.inMemoryTileCache = num;
        this.onDiskTileCache = l;
        this.endpointConfig = tileEndpointConfiguration;
        this.hdEndpointConfig = tileEndpointConfiguration2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[tilesPath: ");
        IconCompatParcelizer.read(sb, this.tilesPath, ", tileStore: ");
        sb.append(RecordUtils.fieldToString(this.tileStore));
        sb.append(", inMemoryTileCache: ");
        SweepGradientShader9KIMszodefault.read(this.inMemoryTileCache, ", onDiskTileCache: ", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.onDiskTileCache, sb, ", endpointConfig: ");
        sb.append(RecordUtils.fieldToString(this.endpointConfig));
        sb.append(", hdEndpointConfig: ");
        sb.append(RecordUtils.fieldToString(this.hdEndpointConfig));
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
        TilesConfig tilesConfig = (TilesConfig) obj;
        return Objects.equals(this.tilesPath, tilesConfig.tilesPath) && Objects.equals(this.tileStore, tilesConfig.tileStore) && Objects.equals(this.inMemoryTileCache, tilesConfig.inMemoryTileCache) && Objects.equals(this.onDiskTileCache, tilesConfig.onDiskTileCache) && Objects.equals(this.endpointConfig, tilesConfig.endpointConfig) && Objects.equals(this.hdEndpointConfig, tilesConfig.hdEndpointConfig);
    }
}
