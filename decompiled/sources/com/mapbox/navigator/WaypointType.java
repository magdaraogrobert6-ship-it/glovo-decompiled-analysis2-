package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum WaypointType {
    REGULAR("Regular"),
    SILENT("Silent"),
    EV_CHARGING_SERVER("EvChargingServer"),
    EV_CHARGING_USER("EvChargingUser");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    WaypointType(String str) {
        this.str = str;
    }
}
