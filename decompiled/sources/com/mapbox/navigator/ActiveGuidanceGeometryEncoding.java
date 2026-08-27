package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum ActiveGuidanceGeometryEncoding {
    GEO_JSON("GeoJSON"),
    POLYLINE5("Polyline5"),
    POLYLINE6("Polyline6");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ActiveGuidanceGeometryEncoding(String str) {
        this.str = str;
    }
}
