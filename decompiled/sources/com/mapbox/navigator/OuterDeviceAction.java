package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum OuterDeviceAction {
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    OuterDeviceAction(String str) {
        this.str = str;
    }
}
