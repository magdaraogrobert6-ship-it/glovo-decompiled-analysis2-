package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ParkingPriceType {
    DURATION,
    DURATION_ADDITIONAL,
    CUSTOM;

    private int getValue() {
        return ordinal();
    }
}
