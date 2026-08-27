package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum IncidentCongestionDescription {
    UNKNOWN,
    NONE,
    VERY_LIGHT,
    LIGHT,
    MODERATE,
    HEAVY,
    SEVERE,
    STOPPED;

    private int getValue() {
        return ordinal();
    }
}
