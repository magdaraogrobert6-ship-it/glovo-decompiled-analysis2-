package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RoadSurface {
    PAVED_SMOOTH("PavedSmooth"),
    PAVED("Paved"),
    PAVED_ROUGH("PavedRough"),
    COMPACTED("Compacted"),
    DIRT("Dirt"),
    GRAVEL("Gravel"),
    PATH("Path"),
    IMPASSABLE("Impassable");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RoadSurface(String str) {
        this.str = str;
    }
}
