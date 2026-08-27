package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum IncidentImpact {
    UNKNOWN,
    CRITICAL,
    MAJOR,
    MINOR,
    LOW;

    private int getValue() {
        return ordinal();
    }
}
