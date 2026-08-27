package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public enum RdRoadClass {
    TOLL,
    FERRY,
    RESTRICTED,
    MOTORWAY,
    TUNNEL;

    private int getValue() {
        return ordinal();
    }
}
