package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum Weather {
    RAIN("Rain"),
    SNOW("Snow"),
    FOG("Fog"),
    WET_ROAD("WetRoad");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    Weather(String str) {
        this.str = str;
    }
}
