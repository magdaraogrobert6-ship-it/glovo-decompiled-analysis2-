package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public enum RdLaneIndication {
    NONE,
    STRAIGHT,
    SHARP_LEFT,
    LEFT,
    SLIGHT_LEFT,
    SLIGHT_RIGHT,
    RIGHT,
    SHARP_RIGHT,
    UTURN;

    private int getValue() {
        return ordinal();
    }
}
