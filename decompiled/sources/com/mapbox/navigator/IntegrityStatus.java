package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum IntegrityStatus {
    UNKNOWN(0, "Unknown"),
    SAFE(1, "Safe"),
    WARNING(2, "Warning"),
    UNSAFE(3, "Unsafe");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    IntegrityStatus(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
