package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum MapboxAPI {
    DIRECTIONS("Directions"),
    MAP_MATCHING("MapMatching");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    MapboxAPI(String str) {
        this.str = str;
    }
}
