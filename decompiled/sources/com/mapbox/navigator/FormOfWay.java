package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum FormOfWay {
    UNKNOWN(0, "Unknown"),
    FREEWAY(1, "Freeway"),
    MULTIPLE_CARRIAGEWAY(2, "MultipleCarriageway"),
    SINGLE_CARRIAGEWAY(3, "SingleCarriageway"),
    ROUNDABOUT_CIRCLE(4, "RoundaboutCircle"),
    TRAFFIC_SQUARE(5, "TrafficSquare"),
    SLIP_ROAD(6, "SlipRoad"),
    PARALLEL_ROAD(8, "ParallelRoad"),
    RAMP_ON_FREEWAY(9, "RampOnFreeway"),
    RAMP(10, "Ramp"),
    SERVICE_ROAD(11, "ServiceRoad"),
    CAR_PARK_ENTRANCE(12, "CarParkEntrance"),
    SERVICE_ENTRANCE(13, "ServiceEntrance"),
    PEDESTRIAN_ZONE(14, "PedestrianZone"),
    NA(15, "NA");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    FormOfWay(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
