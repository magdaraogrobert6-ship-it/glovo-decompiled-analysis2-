package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ParkingTrend {
    UNKNOWN,
    NO_CHANGE,
    DECREASING,
    INCREASING;

    private int getValue() {
        return ordinal();
    }
}
