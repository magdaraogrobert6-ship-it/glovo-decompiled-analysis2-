package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum JammingStatus {
    UNKNOWN(0, "Unknown"),
    OK(1, "Ok"),
    WARNING(2, "Warning"),
    CRITICAL(3, "Critical");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    JammingStatus(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
