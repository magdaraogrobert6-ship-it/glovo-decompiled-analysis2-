package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioType {
    BLUETOOTH("Bluetooth"),
    HEADPHONES("Headphones"),
    SPEAKER("Speaker"),
    UNKNOWN("Unknown");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    AudioType(String str) {
        this.str = str;
    }
}
