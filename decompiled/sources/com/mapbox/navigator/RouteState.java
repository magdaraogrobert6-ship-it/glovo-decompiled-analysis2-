package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum RouteState {
    INVALID("Invalid"),
    INITIALIZED("Initialized"),
    TRACKING("Tracking"),
    COMPLETE("Complete"),
    OFF_ROUTE("OffRoute"),
    UNCERTAIN("Uncertain");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RouteState(String str) {
        this.str = str;
    }
}
