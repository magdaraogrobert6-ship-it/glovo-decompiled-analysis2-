package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum ElectronicHorizonResultType {
    INITIAL("Initial"),
    UPDATE("Update"),
    NOT_AVAILABLE("NotAvailable");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ElectronicHorizonResultType(String str) {
        this.str = str;
    }
}
