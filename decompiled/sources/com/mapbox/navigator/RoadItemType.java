package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum RoadItemType {
    DANGER_SIGN("DangerSign"),
    PASS_LEFT_OR_RIGHT_SIDE_SIGN("PassLeftOrRightSideSign"),
    PASS_LEFT_SIDE_SIGN("PassLeftSideSign"),
    PASS_RIGHT_SIDE_SIGN("PassRightSideSign"),
    DOMESTIC_ANIMALS_CROSSING_SIGN("DomesticAnimalsCrossingSign"),
    WILD_ANIMALS_CROSSING_SIGN("WildAnimalsCrossingSign"),
    ROAD_WORKS_SIGN("RoadWorksSign"),
    RESIDENTIAL_AREA_SIGN("ResidentialAreaSign"),
    END_OF_RESIDENTIAL_AREA_SIGN("EndOfResidentialAreaSign"),
    RIGHT_BEND_SIGN("RightBendSign"),
    LEFT_BEND_SIGN("LeftBendSign"),
    DOUBLE_BEND_RIGHT_FIRST_SIGN("DoubleBendRightFirstSign"),
    DOUBLE_BEND_LEFT_FIRST_SIGN("DoubleBendLeftFirstSign"),
    CURVY_ROAD_SIGN("CurvyRoadSign"),
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED_SIGN("OvertakingByGoodsVehiclesProhibitedSign"),
    END_OF_PROHIBITION_ON_OVERTAKING_FOR_GOODS_VEHICLES_SIGN("EndOfProhibitionOnOvertakingForGoodsVehiclesSign"),
    DANGEROUS_INTERSECTION_SIGN("DangerousIntersectionSign"),
    TUNNEL_SIGN("TunnelSign"),
    FERRY_TERMINAL_SIGN("FerryTerminalSign"),
    NARROW_BRIDGE_SIGN("NarrowBridgeSign"),
    HUMPBACK_BRIDGE_BRIDGE_SIGN("HumpbackBridgeBridgeSign"),
    RIVER_BANK_SIGN("RiverBankSign"),
    RIVER_BANK_LEFT_SIGN("RiverBankLeftSign"),
    YIELD_SIGN("YieldSign"),
    STOP_SIGN("StopSign"),
    PRIORITY_ROAD_SIGN("PriorityRoadSign"),
    INTERSECTION_SIGN("IntersectionSign"),
    INTERSECTION_WITH_MINOR_ROAD_SIGN("IntersectionWithMinorRoadSign"),
    INTERSECTION_WITH_PRIORITY_TO_THE_RIGHT_SIGN("IntersectionWithPriorityToTheRightSign"),
    DIRECTION_TO_THE_RIGHT_SIGN("DirectionToTheRightSign"),
    DIRECTION_TO_THE_LEFT_SIGN("DirectionToTheLeftSign"),
    CARRIAGEWAY_NARROWS_SIGN("CarriagewayNarrowsSign"),
    CARRIAGEWAY_NARROWS_RIGHT_SIGN("CarriagewayNarrowsRightSign"),
    CARRIAGEWAY_NARROWS_LEFT_SIGN("CarriagewayNarrowsLeftSign"),
    LANE_MERGE_LEFT_SIGN("LaneMergeLeftSign"),
    LANE_MERGE_RIGHT_SIGN("LaneMergeRightSign"),
    LANE_MERGE_CENTER_SIGN("LaneMergeCenterSign"),
    OVERTAKING_PROHIBITED_SIGN("OvertakingProhibitedSign"),
    END_OF_PROHIBITION_ON_OVERTAKING_SIGN("EndOfProhibitionOnOvertakingSign"),
    PROTECTIVE_OVERTAKING_SIGN("ProtectiveOvertakingSign"),
    PEDESTRIANS_SIGN("PedestriansSign"),
    PEDESTRIAN_CROSSING_SIGN("PedestrianCrossingSign"),
    CHILDREN_SIGN("ChildrenSign"),
    SCHOOL_ZONE_SIGN("SchoolZoneSign"),
    CYCLISTS_SIGN("CyclistsSign"),
    TWO_WAY_TRAFFIC_SIGN("TwoWayTrafficSign"),
    RAILWAY_CROSSING_WITH_GATES_SIGN("RailwayCrossingWithGatesSign"),
    RAILWAY_CROSSING_WITHOUT_GATES_SIGN("RailwayCrossingWithoutGatesSign"),
    RAILWAY_CROSSING_SIGN("RailwayCrossingSign"),
    TRAMWAY_SIGN("TramwaySign"),
    FALLING_ROCKS_SIGN("FallingRocksSign"),
    FALLING_ROCKS_LEFT_SIGN("FallingRocksLeftSign"),
    FALLING_ROCKS_RIGHT_SIGN("FallingRocksRightSign"),
    STEEP_DROP_LEFT_SIGN("SteepDropLeftSign"),
    STEEP_DROP_RIGHT_SIGN("SteepDropRightSign"),
    VARIABLE_SIGN_MECHANIC_ELEMENTS_SIGN("VariableSignMechanicElementsSign"),
    SLIPPERY_ROAD_SIGN("SlipperyRoadSign"),
    STEEP_ASCENT_SIGN("SteepAscentSign"),
    STEEP_DESCENT_SIGN("SteepDescentSign"),
    UNEVEN_ROAD_SIGN("UnevenRoadSign"),
    HUMP_SIGN("HumpSign"),
    DIP_SIGN("DipSign"),
    ROAD_FLOODS_SIGN("RoadFloodsSign"),
    ICY_ROAD_SIGN("IcyRoadSign"),
    SIDE_WINDS_SIGN("SideWindsSign"),
    TRAFFIC_CONGESTION_SIGN("TrafficCongestionSign"),
    HIGH_ACCIDENT_AREA_SIGN("HighAccidentAreaSign"),
    VARIABLE_SIGN_LIGHT_ELEMENTS_SIGN("VariableSignLightElementsSign"),
    PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN("PriorityOverOncomingTrafficSign"),
    PRIORITY_FOR_ONCOMING_TRAFFIC_SIGN("PriorityForOncomingTrafficSign"),
    SPEED_LIMIT_SIGN("SpeedLimitSign"),
    TOLL_BOOTH("TollBooth"),
    ROAD_CAM_SPEED_INTERVAL_END("RoadCamSpeedIntervalEnd"),
    ROAD_CAM_SPEED_INTERVAL_START("RoadCamSpeedIntervalStart"),
    ROAD_CAM_SPEED_INTERVAL("RoadCamSpeedInterval"),
    ROAD_CAM_LANE_NON_MOTORIZED("RoadCamLaneNonMotorized"),
    ROAD_CAM_LANE_EMERGENCY("RoadCamLaneEmergency"),
    ROAD_CAM_LANE_BUS("RoadCamLaneBus"),
    ROAD_CAM_VIOLATION("RoadCamViolation"),
    ROAD_CAM_RED_LIGHT("RoadCamRedLight"),
    ROAD_CAM_SURVEILLANCE("RoadCamSurveillance"),
    ROAD_CAM_SPEED_CURRENT_SPEED("RoadCamSpeedCurrentSpeed"),
    RAILROAD_CROSSING("RailroadCrossing"),
    ZEBRA("Zebra"),
    SPEED_BUMP("SpeedBump"),
    TRAFFIC_LIGHT("TrafficLight");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RoadItemType(String str) {
        this.str = str;
    }
}
