package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum SetRoutesReason {
    CLEAN_UP("CleanUp"),
    NEW_ROUTE("NewRoute"),
    ALTERNATIVE("Alternative"),
    REROUTE("Reroute"),
    FALLBACK_TO_OFFLINE("FallbackToOffline"),
    RESTORE_TO_ONLINE("RestoreToOnline"),
    SWITCH_TO_ONLINE("SwitchToOnline"),
    FASTEST_ROUTE("FastestRoute"),
    ROUTING_PARAMETERS_CHANGE("RoutingParametersChange");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SetRoutesReason(String str) {
        this.str = str;
    }
}
