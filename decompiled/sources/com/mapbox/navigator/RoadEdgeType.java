package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum RoadEdgeType {
    UNKNOWN("Unknown"),
    CURB("Curb"),
    SHOULDER("Shoulder"),
    BARRIER("Barrier"),
    GUARDRAIL("Guardrail");

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

    RoadEdgeType(String str) {
        this.str = str;
    }
}
