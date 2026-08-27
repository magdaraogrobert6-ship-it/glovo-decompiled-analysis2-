package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes5.dex */
public enum EnergySourceCategory {
    UNKNOWN,
    NUCLEAR,
    GENERAL_FOSSIL,
    COAL,
    GAS,
    GENERAL_GREEN,
    SOLAR,
    WIND,
    WATER;

    private int getValue() {
        return ordinal();
    }
}
