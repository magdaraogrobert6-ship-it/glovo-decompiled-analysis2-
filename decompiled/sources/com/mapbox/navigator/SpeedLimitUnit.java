package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum SpeedLimitUnit {
    KILOMETRES_PER_HOUR("KilometresPerHour"),
    MILES_PER_HOUR("MilesPerHour");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SpeedLimitUnit(String str) {
        this.str = str;
    }
}
