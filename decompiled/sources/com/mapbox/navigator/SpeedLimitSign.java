package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum SpeedLimitSign {
    MUTCD("Mutcd"),
    VIENNA("Vienna");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SpeedLimitSign(String str) {
        this.str = str;
    }
}
