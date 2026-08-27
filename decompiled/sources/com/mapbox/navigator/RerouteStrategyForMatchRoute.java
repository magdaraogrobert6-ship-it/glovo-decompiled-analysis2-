package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RerouteStrategyForMatchRoute {
    REROUTE_DISABLED("RerouteDisabled"),
    NAVIGATE_TO_FINAL_DESTINATION("NavigateToFinalDestination");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RerouteStrategyForMatchRoute(String str) {
        this.str = str;
    }
}
