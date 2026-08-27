package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum RoadMarkingType {
    UNKNOWN("Unknown"),
    SPEED_LIMIT_NUMBER("SpeedLimitNumber"),
    ARROW_STRAIGHT("ArrowStraight"),
    ARROW_LEFT("ArrowLeft"),
    ARROW_RIGHT("ArrowRight"),
    ARROW_LEFT_RIGHT("ArrowLeftRight"),
    ARROW_STRAIGHT_LEFT("ArrowStraightLeft"),
    ARROW_STRAIGHT_RIGHT("ArrowStraightRight"),
    ARROW_UTURN("ArrowUTurn"),
    STOP_LINE("StopLine"),
    YIELD_LINE("YieldLine"),
    CROSSWALK("Crosswalk"),
    SPEED_BUMP("SpeedBump"),
    BUS_LANE_SYMBOL("BusLaneSymbol"),
    TAXI_LANE_SYMBOL("TaxiLaneSymbol"),
    BIKE_LANE_SYMBOL("BikeLaneSymbol"),
    PARKING_SYMBOL("ParkingSymbol"),
    TEXT_STOP("TextStop"),
    TEXT_SLOW("TextSlow"),
    TEXT_BUS("TextBus"),
    TEXT_TAXI("TextTaxi"),
    TEXT_ONLY("TextOnly"),
    TEXT_SCHOOL("TextSchool");

    private final String str;

    public final String getStr() {
        return this.str;
    }

    public final int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RoadMarkingType(String str) {
        this.str = str;
    }
}
