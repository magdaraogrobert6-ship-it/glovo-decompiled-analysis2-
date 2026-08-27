package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum OffRoadStateProvider {
    UNKNOWN("Unknown"),
    DEAD_RECKONING("DeadReckoning"),
    FALLBACK("Fallback"),
    HMM("HMM"),
    PARALLEL_MOVEMENT("ParallelMovement"),
    PARKING_AISLE("ParkingAisle"),
    SIMPLE("Simple"),
    SYNTHETIC_LOCATION("SyntheticLocation"),
    TUNNEL("Tunnel"),
    BAD_SIGNAL("BadSignal"),
    PARKING_GARAGE("ParkingGarage"),
    ORSE("ORSE");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    OffRoadStateProvider(String str) {
        this.str = str;
    }
}
