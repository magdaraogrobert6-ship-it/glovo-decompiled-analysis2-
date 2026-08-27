package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum DetectedObjectCategory {
    VEHICLE("Vehicle"),
    TWO_WHEELER("TwoWheeler"),
    PEDESTRIAN("Pedestrian"),
    STATIC("Static");

    private final String str;

    public final String getStr() {
        return this.str;
    }

    public final int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    DetectedObjectCategory(String str) {
        this.str = str;
    }
}
