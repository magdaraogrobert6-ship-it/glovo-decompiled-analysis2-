package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RoutingMode {
    DRIVING("Driving"),
    WALKING("Walking"),
    CYCLING("Cycling"),
    DRIVING_TRAFFIC("DrivingTraffic");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RoutingMode(String str) {
        this.str = str;
    }
}
