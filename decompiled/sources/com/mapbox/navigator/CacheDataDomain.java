package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum CacheDataDomain {
    MAPS("Maps"),
    NAVIGATION("Navigation"),
    SEARCH("Search"),
    ADAS("Adas"),
    NAVIGATION_HD("NavigationHD");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    CacheDataDomain(String str) {
        this.str = str;
    }
}
