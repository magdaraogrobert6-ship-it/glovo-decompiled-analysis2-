package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
public enum ResponseSourceType {
    NETWORK("Network"),
    CACHE("Cache"),
    TILE_STORE("TileStore"),
    LOCAL_FILE("LocalFile");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ResponseSourceType(String str) {
        this.str = str;
    }
}
