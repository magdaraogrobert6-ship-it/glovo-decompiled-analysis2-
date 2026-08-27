package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum SmoothedGeometryErrorType {
    CANCELLED("Cancelled");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SmoothedGeometryErrorType(String str) {
        this.str = str;
    }
}
