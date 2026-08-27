package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ParkingRestriction {
    UNKNOWN,
    EV_ONLY,
    PLUGGED,
    DISABLED,
    CUSTOMERS,
    MOTOR_CYCLES,
    NO_PARKING,
    MAX_STAY,
    MONTHLY_ONLY,
    NO_SUV,
    NO_LPG,
    VALET_ONLY,
    VISITORS_ONLY,
    EVENTS_ONLY,
    NO_RESTRICTIONS_OUTSIDE_HOURS,
    BOOKING_ONLY,
    PARKING_DISK;

    private int getValue() {
        return ordinal();
    }
}
