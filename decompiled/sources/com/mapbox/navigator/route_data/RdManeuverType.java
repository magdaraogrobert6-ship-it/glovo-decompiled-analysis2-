package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public enum RdManeuverType {
    TURN,
    NEW_NAME,
    DEPART,
    ARRIVE,
    MERGE,
    ON_RAMP,
    OFF_RAMP,
    FORK,
    END_OF_ROAD,
    CONTINUE,
    ROUNDABOUT,
    ROTARY,
    ROUNDABOUT_TURN,
    NOTIFICATION,
    EXIT_ROUNDABOUT,
    EXIT_ROTARY;

    private int getValue() {
        return ordinal();
    }
}
