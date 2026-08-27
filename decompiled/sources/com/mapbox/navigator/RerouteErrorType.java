package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum RerouteErrorType {
    UNKNOWN,
    ROUTER_ERROR,
    CANCELLED,
    NO_ROUTES_OR_CONTROLLER,
    BUILD_URI_ERROR,
    REROUTE_IN_PROGRESS;

    private int getValue() {
        return ordinal();
    }
}
