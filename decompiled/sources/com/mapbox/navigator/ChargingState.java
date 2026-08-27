package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum ChargingState {
    NOT_CHARGING("NotCharging"),
    AWAIT_CHARGING("AwaitCharging"),
    CHARGING("Charging"),
    EXTRA_CHARGING("ExtraCharging");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ChargingState(String str) {
        this.str = str;
    }
}
