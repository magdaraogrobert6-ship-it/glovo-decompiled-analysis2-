package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum TrafficSignType {
    UNKNOWN("Unknown"),
    SPEED_LIMIT("SpeedLimit"),
    ARROW_LEFT("ArrowLeft"),
    ARROW_RIGHT("ArrowRight"),
    ARROW_LEFT_AHEAD("ArrowLeftAhead"),
    ARROW_RIGHT_AHEAD("ArrowRightAhead"),
    ARROW_LEFT_OR_STRAIGHT("ArrowLeftOrStraight"),
    ARROW_RIGHT_OR_STRAIGHT("ArrowRightOrStraight"),
    ARROW_LEFT_OR_RIGHT("ArrowLeftOrRight"),
    ARROW_STRAIGHT("ArrowStraight"),
    ARROW_ALL_DIRECTIONS_PERMITTED("ArrowAllDirectionsPermitted"),
    ARROW_ROUNDABOUT("ArrowRoundabout"),
    ARROW_UTURN("ArrowUTurn"),
    ARROW_KEEP_LEFT("ArrowKeepLeft"),
    ARROW_KEEP_RIGHT("ArrowKeepRight"),
    ONEWAY_ARROW_LEFT("OnewayArrowLeft"),
    ONEWAY_ARROW_RIGHT("OnewayArrowRight"),
    ONEWAY_ARROW_STRAIGHT("OnewayArrowStraight"),
    NO_LEFT_TURN("NoLeftTurn"),
    NO_RIGHT_TURN("NoRightTurn"),
    NO_UTURN("NoUTurn"),
    NO_STRAIGHT_THROUGH("NoStraightThrough"),
    NO_LEFT_OR_UTURN("NoLeftOrUTurn"),
    NO_STRAIGHT_THROUGH_OR_TURN_RIGHT("NoStraightThroughOrTurnRight"),
    NO_ENTRANCE("NoEntrance"),
    NO_VEHICLES("NoVehicles"),
    NO_OVERTAKING("NoOvertaking"),
    NO_MOTOR_VEHICLES("NoMotorVehicles"),
    NO_HEAVY_GOODS_VEHICLES("NoHeavyGoodsVehicles"),
    NO_MOTORCYCLES_OR_MOPEDS("NoMotorcyclesOrMopeds"),
    NO_BICYCLES("NoBicycles"),
    NO_PEDESTRIANS("NoPedestrians"),
    NO_PARKING("NoParking"),
    NO_STOPPING("NoStopping"),
    MOTOR_VEHICLES_ONLY("MotorVehiclesOnly"),
    END_PROHIBITION("EndProhibition"),
    WARNING_PASS_LEFT_OR_RIGHT("WarningPassLeftOrRight"),
    WARNING_PEDESTRIANS_CROSSING("WarningPedestriansCrossing"),
    WARNING_SPEED_BUMP("WarningSpeedBump"),
    WARNING_SPEED_HUMP("WarningSpeedHump"),
    WARNING_ROUNDABOUT("WarningRoundabout"),
    WARNING_PRIORITY("WarningPriority"),
    WARNING_SIDE_ROAD_LEFT("WarningSideRoadLeft"),
    WARNING_SIDE_ROAD_RIGHT("WarningSideRoadRight"),
    WARNING_CROSSROADS("WarningCrossroads"),
    YIELD_ALERT("YieldAlert"),
    STOP_SIGN("StopSign"),
    GIVE_WAY_TO_ONCOMING_TRAFFIC("GiveWayToOncomingTraffic"),
    PRIORITY_OVER_ONCOMING_TRAFFIC("PriorityOverOncomingTraffic"),
    PRIORITY_ROAD("PriorityRoad"),
    END_OF_PRIORITY_ROAD("EndOfPriorityRoad"),
    DEAD_END("DeadEnd"),
    PEDESTRIANS_CROSSING("PedestriansCrossing"),
    HOSPITAL("Hospital"),
    PARKING("Parking");

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

    TrafficSignType(String str) {
        this.str = str;
    }
}
