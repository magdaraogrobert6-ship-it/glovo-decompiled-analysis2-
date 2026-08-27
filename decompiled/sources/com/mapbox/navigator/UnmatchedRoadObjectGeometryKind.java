package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum UnmatchedRoadObjectGeometryKind {
    OPEN_LR("OpenLR"),
    POLYLINE("Polyline"),
    POLYGON("Polygon"),
    GANTRY("Gantry"),
    POINT("Point");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    UnmatchedRoadObjectGeometryKind(String str) {
        this.str = str;
    }
}
