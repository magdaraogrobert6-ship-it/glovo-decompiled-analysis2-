package com.mapbox.maps;

import com.mapbox.common.TileStore;

/* JADX INFO: loaded from: classes5.dex */
public final class MapboxMapsOptions {
    public static final MapboxMapsOptions INSTANCE = new MapboxMapsOptions();

    private MapboxMapsOptions() {
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static /* synthetic */ void getDataPath$annotations() {
    }

    public static final TileStore getTileStore() {
        return MapsResourceOptions.getTileStore();
    }

    public static /* synthetic */ void getTileStore$annotations() {
    }

    public static /* synthetic */ void getTileStoreUsageMode$annotations() {
    }

    public static final void setTileStore(TileStore tileStore) {
        MapsResourceOptions.setTileStore(tileStore);
    }

    public static final void setBaseUrl(String str) {
        str.getClass();
        MapsResourceOptions.setBaseURL(str);
    }

    public static final void setDataPath(String str) {
        str.getClass();
        MapsResourceOptions.setDataPath(str);
    }

    public static final void setTileStoreUsageMode(TileStoreUsageMode tileStoreUsageMode) {
        tileStoreUsageMode.getClass();
        MapsResourceOptions.setTileStoreUsageMode(tileStoreUsageMode);
    }

    public static final String getBaseUrl() {
        String baseURL = MapsResourceOptions.getBaseURL();
        baseURL.getClass();
        return baseURL;
    }

    public static final String getDataPath() {
        String dataPath = MapsResourceOptions.getDataPath();
        dataPath.getClass();
        return dataPath;
    }

    public static final TileStoreUsageMode getTileStoreUsageMode() {
        TileStoreUsageMode tileStoreUsageMode = MapsResourceOptions.getTileStoreUsageMode();
        tileStoreUsageMode.getClass();
        return tileStoreUsageMode;
    }
}
