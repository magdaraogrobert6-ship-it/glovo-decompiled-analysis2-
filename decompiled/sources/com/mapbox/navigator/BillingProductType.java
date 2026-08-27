package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum BillingProductType {
    CF("CF"),
    UXF("UXF");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    BillingProductType(String str) {
        this.str = str;
    }
}
