package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneSeparatorType {
    SOLID("Solid"),
    DASHED("Dashed"),
    DOUBLE("Double"),
    DASHED_SOLID("DashedSolid"),
    SOLID_DASHED("SolidDashed"),
    EMPTY("Empty"),
    FENCE("Fence"),
    HATCHED_LINE("HatchedLine"),
    SHORT_DASH("ShortDash"),
    CROSSED_LINE("CrossedLine"),
    DASHED_POINT("DashedPoint"),
    DOUBLE_DASHED_POINT("DoubleDashedPoint"),
    UNKNOWN("Unknown");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    LaneSeparatorType(String str) {
        this.str = str;
    }
}
