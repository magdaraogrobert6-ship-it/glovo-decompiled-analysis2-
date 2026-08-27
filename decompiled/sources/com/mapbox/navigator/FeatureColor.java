package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum FeatureColor {
    UNKNOWN("Unknown"),
    WHITE("White"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red");

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

    FeatureColor(String str) {
        this.str = str;
    }
}
