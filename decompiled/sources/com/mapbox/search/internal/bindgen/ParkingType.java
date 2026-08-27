package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ParkingType {
    UNKNOWN,
    ALONG_MOTORWAY,
    PARKING_GARAGE,
    PARKING_LOT,
    ON_DRIVEWAY,
    ON_STREET,
    UNDERGROUND_GARAGE,
    OFF_STREET;

    private int getValue() {
        return ordinal();
    }
}
