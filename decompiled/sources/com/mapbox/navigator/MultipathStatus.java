package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum MultipathStatus {
    UNKNOWN(0, "Unknown"),
    NOT_DETECTED(1, "NotDetected"),
    DETECTED(2, "Detected");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    MultipathStatus(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
