package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RouterType {
    HYBRID("Hybrid"),
    ONLINE("Online"),
    ONBOARD("Onboard");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RouterType(String str) {
        this.str = str;
    }
}
