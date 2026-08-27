package com.mapbox.maps;

/* JADX INFO: loaded from: classes4.dex */
public enum SourceDataLoadedType {
    METADATA("Metadata"),
    TILE("Tile");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SourceDataLoadedType(String str) {
        this.str = str;
    }
}
