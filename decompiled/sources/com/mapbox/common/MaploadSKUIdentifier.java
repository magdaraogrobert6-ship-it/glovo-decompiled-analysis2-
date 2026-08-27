package com.mapbox.common;

/* JADX INFO: loaded from: classes4.dex */
public enum MaploadSKUIdentifier {
    PREMIUM_SDK("PremiumSDK");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    MaploadSKUIdentifier(String str) {
        this.str = str;
    }
}
