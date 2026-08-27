package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RouterOrigin {
    ONLINE("Online"),
    ONBOARD("Onboard"),
    CUSTOM("Custom"),
    CUSTOM_EXTERNAL("CustomExternal");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RouterOrigin(String str) {
        this.str = str;
    }
}
