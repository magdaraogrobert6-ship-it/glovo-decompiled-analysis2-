package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileStore;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationTilesConfig implements Serializable {
    private final TilesEndpointConfig endpointConfig;
    private final TilesEndpointConfig hdEndpointConfig;
    private final TileStore tileStore;

    public TilesEndpointConfig getEndpointConfig() {
        return this.endpointConfig;
    }

    public TilesEndpointConfig getHdEndpointConfig() {
        return this.hdEndpointConfig;
    }

    public TileStore getTileStore() {
        return this.tileStore;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.tileStore, this.endpointConfig, this.hdEndpointConfig);
    }

    public NavigationTilesConfig(TileStore tileStore, TilesEndpointConfig tilesEndpointConfig, TilesEndpointConfig tilesEndpointConfig2) {
        this.tileStore = tileStore;
        this.endpointConfig = tilesEndpointConfig;
        this.hdEndpointConfig = tilesEndpointConfig2;
    }

    public String toString() {
        return "[tileStore: " + RecordUtils.fieldToString(this.tileStore) + ", endpointConfig: " + RecordUtils.fieldToString(this.endpointConfig) + ", hdEndpointConfig: " + RecordUtils.fieldToString(this.hdEndpointConfig) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigationTilesConfig navigationTilesConfig = (NavigationTilesConfig) obj;
        return Objects.equals(this.tileStore, navigationTilesConfig.tileStore) && Objects.equals(this.endpointConfig, navigationTilesConfig.endpointConfig) && Objects.equals(this.hdEndpointConfig, navigationTilesConfig.hdEndpointConfig);
    }
}
