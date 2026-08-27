package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum PrimaryRouteChangeReason {
    SET_ROUTE,
    REROUTE,
    REFRESH,
    RESET;

    private int getValue() {
        return ordinal();
    }
}
