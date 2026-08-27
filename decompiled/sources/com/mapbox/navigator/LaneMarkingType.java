package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum LaneMarkingType {
    UNKNOWN("Unknown"),
    SOLID("Solid"),
    DASHED("Dashed"),
    SOLID_SOLID("SolidSolid"),
    SOLID_DASHED("SolidDashed"),
    DASHED_SOLID("DashedSolid");

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

    LaneMarkingType(String str) {
        this.str = str;
    }
}
