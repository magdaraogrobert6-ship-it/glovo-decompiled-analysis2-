package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum TileStoreAmbientCacheType {
    TILES("Tiles"),
    RESOURCES("Resources");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TileStoreAmbientCacheType(String str) {
        this.str = str;
    }
}
