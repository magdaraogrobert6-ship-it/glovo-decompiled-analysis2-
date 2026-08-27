package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum DRSensorFusionState {
    DISABLED("Disabled"),
    COLD_START("ColdStart"),
    INITIALIZATION("Initialization"),
    NORMAL_OPERATION("NormalOperation"),
    FAILURE("Failure");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    DRSensorFusionState(String str) {
        this.str = str;
    }
}
