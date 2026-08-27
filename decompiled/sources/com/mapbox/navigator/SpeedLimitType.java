package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum SpeedLimitType {
    IMPLICIT("Implicit"),
    EXPLICIT("Explicit"),
    UNKNOWN("Unknown"),
    PROLONGED("Prolonged");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SpeedLimitType(String str) {
        this.str = str;
    }
}
