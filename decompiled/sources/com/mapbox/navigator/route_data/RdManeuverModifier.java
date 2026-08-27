package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public enum RdManeuverModifier {
    UTURN,
    SHARP_RIGHT,
    RIGHT,
    SLIGHT_RIGHT,
    STRAIGHT,
    SLIGHT_LEFT,
    LEFT,
    SHARP_LEFT;

    private int getValue() {
        return ordinal();
    }
}
