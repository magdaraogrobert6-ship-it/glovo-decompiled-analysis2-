package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum IncidentType {
    ACCIDENT("Accident"),
    CONGESTION("Congestion"),
    CONSTRUCTION("Construction"),
    DISABLED_VEHICLE("DisabledVehicle"),
    LANE_RESTRICTION("LaneRestriction"),
    MASS_TRANSIT("MassTransit"),
    MISCELLANEOUS("Miscellaneous"),
    OTHER_NEWS("OtherNews"),
    PLANNED_EVENT("PlannedEvent"),
    ROAD_CLOSURE("RoadClosure"),
    ROAD_HAZARD("RoadHazard"),
    WEATHER("Weather");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    IncidentType(String str) {
        this.str = str;
    }
}
