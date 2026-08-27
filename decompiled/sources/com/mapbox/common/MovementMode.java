package com.mapbox.common;

/* JADX INFO: loaded from: classes4.dex */
public enum MovementMode {
    IN_VEHICLE("InVehicle"),
    CYCLING("Cycling"),
    RUNNING("Running"),
    WALKING("Walking"),
    ON_FOOT("OnFoot"),
    STATIONARY("Stationary"),
    UNKNOWN("Unknown");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    MovementMode(String str) {
        this.str = str;
    }
}
