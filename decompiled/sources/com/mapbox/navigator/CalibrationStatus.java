package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum CalibrationStatus {
    NOT_AVAILABLE(0, "NotAvailable"),
    IN_PROGRESS(1, "InProgress"),
    COARSE(2, "Coarse"),
    READY(3, "Ready"),
    ERROR(4, "Error");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    CalibrationStatus(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
