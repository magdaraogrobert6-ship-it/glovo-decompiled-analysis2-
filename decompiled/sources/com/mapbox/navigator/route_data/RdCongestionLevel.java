package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public enum RdCongestionLevel {
    UNKNOWN,
    LOW,
    MODERATE,
    HEAVY,
    SEVERE;

    private int getValue() {
        return ordinal();
    }
}
