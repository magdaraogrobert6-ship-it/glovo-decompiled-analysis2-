package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum RoadItemLocation {
    RIGHT("Right"),
    LEFT("Left"),
    ABOVE("Above"),
    ON_SURFACE("OnSurface"),
    ABOVE_LANE("AboveLane");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RoadItemLocation(String str) {
        this.str = str;
    }
}
