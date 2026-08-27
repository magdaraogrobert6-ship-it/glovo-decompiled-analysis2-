package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum RouteRefreshErrorType {
    UNKNOWN,
    ROUTER_ERROR,
    ROUTE_INVALIDATED;

    private int getValue() {
        return ordinal();
    }
}
