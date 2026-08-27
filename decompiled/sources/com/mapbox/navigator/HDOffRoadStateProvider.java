package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum HDOffRoadStateProvider {
    UNKNOWN("Unknown"),
    TRANSITIONING("Transitioning"),
    HMM("HMM"),
    TUNNEL("Tunnel"),
    BAD_SIGNAL("BadSignal"),
    PARKING_GARAGE("ParkingGarage"),
    TRANSITION_POINT_HOLDING("TransitionPointHolding");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    HDOffRoadStateProvider(String str) {
        this.str = str;
    }
}
