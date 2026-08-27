package com.mapbox.navigator.match.openlr;

/* JADX INFO: loaded from: classes3.dex */
public enum SideOfRoad {
    ON_ROAD_OR_UNKNOWN(0, "OnRoadOrUnknown"),
    RIGHT(1, "Right"),
    LEFT(2, "Left"),
    BOTH(3, "Both");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SideOfRoad(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
