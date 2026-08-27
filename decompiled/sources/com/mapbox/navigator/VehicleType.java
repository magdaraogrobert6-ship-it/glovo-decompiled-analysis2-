package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum VehicleType {
    CAR("Car"),
    TRUCK("Truck"),
    BUS("Bus"),
    TRAILER("Trailer"),
    MOTORCYCLE("Motorcycle");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    VehicleType(String str) {
        this.str = str;
    }
}
