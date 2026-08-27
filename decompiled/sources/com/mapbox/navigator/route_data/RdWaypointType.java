package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public enum RdWaypointType {
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

    RdWaypointType(String str) {
        this.str = str;
    }
}
