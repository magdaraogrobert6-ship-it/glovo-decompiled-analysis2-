package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum GetRouteReason {
    NEW_ROUTE("NewRoute"),
    ALTERNATIVE("Alternative"),
    REROUTE_BY_DEVIATION("RerouteByDeviation"),
    REROUTE_OTHER("RerouteOther"),
    BACK_TO_ONLINE("BackToOnline"),
    ROUTING_PARAMETERS_CHANGE("RoutingParametersChange"),
    ROUTE_INVALIDATED("RouteInvalidated");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    GetRouteReason(String str) {
        this.str = str;
    }
}
