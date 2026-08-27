package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public enum NavigationStatusOrigin {
    LOCATION_UPDATE("LocationUpdate"),
    LEG_CHANGE("LegChange"),
    SET_ROUTE("SetRoute"),
    UNCONDITIONAL("Unconditional"),
    ROUTE_REFRESH("RouteRefresh");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    NavigationStatusOrigin(String str) {
        this.str = str;
    }
}
