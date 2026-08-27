package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public enum TileStoreUsageMode {
    DISABLED("Disabled"),
    READ_ONLY("ReadOnly"),
    READ_AND_UPDATE("ReadAndUpdate");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TileStoreUsageMode(String str) {
        this.str = str;
    }
}
