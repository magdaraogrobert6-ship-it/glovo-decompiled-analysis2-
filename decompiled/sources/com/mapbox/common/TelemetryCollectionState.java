package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum TelemetryCollectionState {
    ENABLED("Enabled"),
    TURNSTILE_EVENTS_ONLY("TurnstileEventsOnly"),
    UNKNOWN("Unknown"),
    BACKGROUND_LOCATIONS_DISABLED("BackgroundLocationsDisabled");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TelemetryCollectionState(String str) {
        this.str = str;
    }
}
