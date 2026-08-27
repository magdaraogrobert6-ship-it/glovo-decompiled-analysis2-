package com.mapbox.navigator;

import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigProfilelongTrafficSignIds implements Serializable {
    private final int tsCarriagewayNarrowsId;
    private final int tsCarriagewayNarrowsLeftId;
    private final int tsCarriagewayNarrowsRightId;
    private final int tsChildrenId;
    private final int tsCurvyRoadId;
    private final int tsCyclistsId;
    private final int tsDangerId;
    private final int tsDangerousIntersectionId;
    private final int tsDipId;
    private final int tsDirectionToTheLeftId;
    private final int tsDirectionToTheRightId;
    private final int tsDomesticAnimalsCrossingId;
    private final int tsDoubleBendLeftFirstId;
    private final int tsDoubleBendRightFirstId;
    private final int tsEndOfProhibitionOnOvertakingForGoodsVehiclesId;
    private final int tsEndOfProhibitionOnOvertakingId;
    private final int tsEndOfResidentialAreaId;
    private final int tsFallingRocksId;
    private final int tsFallingRocksLeftId;
    private final int tsFallingRocksRightId;
    private final int tsFerryTerminalId;
    private final int tsHighAccidentAreaId;
    private final int tsHumpId;
    private final int tsHumpbackBridgeBridgeId;
    private final int tsIcyRoadId;
    private final int tsIntersectionId;
    private final int tsIntersectionWithMinorRoadId;
    private final int tsIntersectionWithPriorityToTheRightId;
    private final int tsLaneMergeCenterId;
    private final int tsLaneMergeLeftId;
    private final int tsLaneMergeRightId;
    private final int tsLeftBendId;
    private final int tsNarrowBridgeId;
    private final int tsOvertakingByGoodsVehiclesProhibitedId;
    private final int tsOvertakingProhibitedId;
    private final int tsPassLeftOrRightSideId;
    private final int tsPassLeftSideId;
    private final int tsPassRightSideId;
    private final int tsPedestrianCrossingId;
    private final int tsPedestriansId;
    private final int tsPriorityForOncomingTrafficId;
    private final int tsPriorityOverOncomingTrafficId;
    private final int tsPriorityRoadId;
    private final int tsProtectiveOvertakingId;
    private final int tsRailroadCrossingId;
    private final int tsRailwayCrossingId;
    private final int tsRailwayCrossingWithGatesId;
    private final int tsRailwayCrossingWithoutGatesId;
    private final int tsResidentialAreaId;
    private final int tsRightBendId;
    private final int tsRiverBankId;
    private final int tsRiverBankLeftId;
    private final int tsRoadCamLaneBusId;
    private final int tsRoadCamLaneEmergencyId;
    private final int tsRoadCamLaneNonMotorizedId;
    private final int tsRoadCamRedLightId;
    private final int tsRoadCamSpeedCurrentSpeedId;
    private final int tsRoadCamSpeedIntervalEndId;
    private final int tsRoadCamSpeedIntervalId;
    private final int tsRoadCamSpeedIntervalStartId;
    private final int tsRoadCamSurveillanceId;
    private final int tsRoadCamViolationId;
    private final int tsRoadFloodsId;
    private final int tsRoadWorksId;
    private final int tsSchoolZoneId;
    private final int tsSideWindsId;
    private final int tsSlipperyRoadId;
    private final int tsSpeedBumpId;
    private final int tsSpeedLimitId;
    private final int tsSteepAscentId;
    private final int tsSteepDescentId;
    private final int tsSteepDropLeftId;
    private final int tsSteepDropRightId;
    private final int tsStopId;
    private final int tsTollBoothId;
    private final int tsTrafficCongestionId;
    private final int tsTrafficLightId;
    private final int tsTramwayId;
    private final int tsTunnelId;
    private final int tsTwoWayTrafficId;
    private final int tsUnevenRoadId;
    private final int tsVariableSignLightElementsId;
    private final int tsVariableSignMechanicElementsId;
    private final int tsWildAnimalsCrossingId;
    private final int tsYieldId;
    private final int tsZebraId;

    public int getTsCarriagewayNarrowsId() {
        return this.tsCarriagewayNarrowsId;
    }

    public int getTsCarriagewayNarrowsLeftId() {
        return this.tsCarriagewayNarrowsLeftId;
    }

    public int getTsCarriagewayNarrowsRightId() {
        return this.tsCarriagewayNarrowsRightId;
    }

    public int getTsChildrenId() {
        return this.tsChildrenId;
    }

    public int getTsCurvyRoadId() {
        return this.tsCurvyRoadId;
    }

    public int getTsCyclistsId() {
        return this.tsCyclistsId;
    }

    public int getTsDangerId() {
        return this.tsDangerId;
    }

    public int getTsDangerousIntersectionId() {
        return this.tsDangerousIntersectionId;
    }

    public int getTsDipId() {
        return this.tsDipId;
    }

    public int getTsDirectionToTheLeftId() {
        return this.tsDirectionToTheLeftId;
    }

    public int getTsDirectionToTheRightId() {
        return this.tsDirectionToTheRightId;
    }

    public int getTsDomesticAnimalsCrossingId() {
        return this.tsDomesticAnimalsCrossingId;
    }

    public int getTsDoubleBendLeftFirstId() {
        return this.tsDoubleBendLeftFirstId;
    }

    public int getTsDoubleBendRightFirstId() {
        return this.tsDoubleBendRightFirstId;
    }

    public int getTsEndOfProhibitionOnOvertakingForGoodsVehiclesId() {
        return this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId;
    }

    public int getTsEndOfProhibitionOnOvertakingId() {
        return this.tsEndOfProhibitionOnOvertakingId;
    }

    public int getTsEndOfResidentialAreaId() {
        return this.tsEndOfResidentialAreaId;
    }

    public int getTsFallingRocksId() {
        return this.tsFallingRocksId;
    }

    public int getTsFallingRocksLeftId() {
        return this.tsFallingRocksLeftId;
    }

    public int getTsFallingRocksRightId() {
        return this.tsFallingRocksRightId;
    }

    public int getTsFerryTerminalId() {
        return this.tsFerryTerminalId;
    }

    public int getTsHighAccidentAreaId() {
        return this.tsHighAccidentAreaId;
    }

    public int getTsHumpId() {
        return this.tsHumpId;
    }

    public int getTsHumpbackBridgeBridgeId() {
        return this.tsHumpbackBridgeBridgeId;
    }

    public int getTsIcyRoadId() {
        return this.tsIcyRoadId;
    }

    public int getTsIntersectionId() {
        return this.tsIntersectionId;
    }

    public int getTsIntersectionWithMinorRoadId() {
        return this.tsIntersectionWithMinorRoadId;
    }

    public int getTsIntersectionWithPriorityToTheRightId() {
        return this.tsIntersectionWithPriorityToTheRightId;
    }

    public int getTsLaneMergeCenterId() {
        return this.tsLaneMergeCenterId;
    }

    public int getTsLaneMergeLeftId() {
        return this.tsLaneMergeLeftId;
    }

    public int getTsLaneMergeRightId() {
        return this.tsLaneMergeRightId;
    }

    public int getTsLeftBendId() {
        return this.tsLeftBendId;
    }

    public int getTsNarrowBridgeId() {
        return this.tsNarrowBridgeId;
    }

    public int getTsOvertakingByGoodsVehiclesProhibitedId() {
        return this.tsOvertakingByGoodsVehiclesProhibitedId;
    }

    public int getTsOvertakingProhibitedId() {
        return this.tsOvertakingProhibitedId;
    }

    public int getTsPassLeftOrRightSideId() {
        return this.tsPassLeftOrRightSideId;
    }

    public int getTsPassLeftSideId() {
        return this.tsPassLeftSideId;
    }

    public int getTsPassRightSideId() {
        return this.tsPassRightSideId;
    }

    public int getTsPedestrianCrossingId() {
        return this.tsPedestrianCrossingId;
    }

    public int getTsPedestriansId() {
        return this.tsPedestriansId;
    }

    public int getTsPriorityForOncomingTrafficId() {
        return this.tsPriorityForOncomingTrafficId;
    }

    public int getTsPriorityOverOncomingTrafficId() {
        return this.tsPriorityOverOncomingTrafficId;
    }

    public int getTsPriorityRoadId() {
        return this.tsPriorityRoadId;
    }

    public int getTsProtectiveOvertakingId() {
        return this.tsProtectiveOvertakingId;
    }

    public int getTsRailroadCrossingId() {
        return this.tsRailroadCrossingId;
    }

    public int getTsRailwayCrossingId() {
        return this.tsRailwayCrossingId;
    }

    public int getTsRailwayCrossingWithGatesId() {
        return this.tsRailwayCrossingWithGatesId;
    }

    public int getTsRailwayCrossingWithoutGatesId() {
        return this.tsRailwayCrossingWithoutGatesId;
    }

    public int getTsResidentialAreaId() {
        return this.tsResidentialAreaId;
    }

    public int getTsRightBendId() {
        return this.tsRightBendId;
    }

    public int getTsRiverBankId() {
        return this.tsRiverBankId;
    }

    public int getTsRiverBankLeftId() {
        return this.tsRiverBankLeftId;
    }

    public int getTsRoadCamLaneBusId() {
        return this.tsRoadCamLaneBusId;
    }

    public int getTsRoadCamLaneEmergencyId() {
        return this.tsRoadCamLaneEmergencyId;
    }

    public int getTsRoadCamLaneNonMotorizedId() {
        return this.tsRoadCamLaneNonMotorizedId;
    }

    public int getTsRoadCamRedLightId() {
        return this.tsRoadCamRedLightId;
    }

    public int getTsRoadCamSpeedCurrentSpeedId() {
        return this.tsRoadCamSpeedCurrentSpeedId;
    }

    public int getTsRoadCamSpeedIntervalEndId() {
        return this.tsRoadCamSpeedIntervalEndId;
    }

    public int getTsRoadCamSpeedIntervalId() {
        return this.tsRoadCamSpeedIntervalId;
    }

    public int getTsRoadCamSpeedIntervalStartId() {
        return this.tsRoadCamSpeedIntervalStartId;
    }

    public int getTsRoadCamSurveillanceId() {
        return this.tsRoadCamSurveillanceId;
    }

    public int getTsRoadCamViolationId() {
        return this.tsRoadCamViolationId;
    }

    public int getTsRoadFloodsId() {
        return this.tsRoadFloodsId;
    }

    public int getTsRoadWorksId() {
        return this.tsRoadWorksId;
    }

    public int getTsSchoolZoneId() {
        return this.tsSchoolZoneId;
    }

    public int getTsSideWindsId() {
        return this.tsSideWindsId;
    }

    public int getTsSlipperyRoadId() {
        return this.tsSlipperyRoadId;
    }

    public int getTsSpeedBumpId() {
        return this.tsSpeedBumpId;
    }

    public int getTsSpeedLimitId() {
        return this.tsSpeedLimitId;
    }

    public int getTsSteepAscentId() {
        return this.tsSteepAscentId;
    }

    public int getTsSteepDescentId() {
        return this.tsSteepDescentId;
    }

    public int getTsSteepDropLeftId() {
        return this.tsSteepDropLeftId;
    }

    public int getTsSteepDropRightId() {
        return this.tsSteepDropRightId;
    }

    public int getTsStopId() {
        return this.tsStopId;
    }

    public int getTsTollBoothId() {
        return this.tsTollBoothId;
    }

    public int getTsTrafficCongestionId() {
        return this.tsTrafficCongestionId;
    }

    public int getTsTrafficLightId() {
        return this.tsTrafficLightId;
    }

    public int getTsTramwayId() {
        return this.tsTramwayId;
    }

    public int getTsTunnelId() {
        return this.tsTunnelId;
    }

    public int getTsTwoWayTrafficId() {
        return this.tsTwoWayTrafficId;
    }

    public int getTsUnevenRoadId() {
        return this.tsUnevenRoadId;
    }

    public int getTsVariableSignLightElementsId() {
        return this.tsVariableSignLightElementsId;
    }

    public int getTsVariableSignMechanicElementsId() {
        return this.tsVariableSignMechanicElementsId;
    }

    public int getTsWildAnimalsCrossingId() {
        return this.tsWildAnimalsCrossingId;
    }

    public int getTsYieldId() {
        return this.tsYieldId;
    }

    public int getTsZebraId() {
        return this.tsZebraId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.tsDangerId), Integer.valueOf(this.tsPassLeftOrRightSideId), Integer.valueOf(this.tsPassLeftSideId), Integer.valueOf(this.tsPassRightSideId), Integer.valueOf(this.tsDomesticAnimalsCrossingId), Integer.valueOf(this.tsWildAnimalsCrossingId), Integer.valueOf(this.tsRoadWorksId), Integer.valueOf(this.tsResidentialAreaId), Integer.valueOf(this.tsEndOfResidentialAreaId), Integer.valueOf(this.tsRightBendId), Integer.valueOf(this.tsLeftBendId), Integer.valueOf(this.tsDoubleBendRightFirstId), Integer.valueOf(this.tsDoubleBendLeftFirstId), Integer.valueOf(this.tsCurvyRoadId), Integer.valueOf(this.tsOvertakingByGoodsVehiclesProhibitedId), Integer.valueOf(this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId), Integer.valueOf(this.tsDangerousIntersectionId), Integer.valueOf(this.tsTunnelId), Integer.valueOf(this.tsFerryTerminalId), Integer.valueOf(this.tsNarrowBridgeId), Integer.valueOf(this.tsHumpbackBridgeBridgeId), Integer.valueOf(this.tsRiverBankId), Integer.valueOf(this.tsRiverBankLeftId), Integer.valueOf(this.tsYieldId), Integer.valueOf(this.tsStopId), Integer.valueOf(this.tsPriorityRoadId), Integer.valueOf(this.tsIntersectionId), Integer.valueOf(this.tsIntersectionWithMinorRoadId), Integer.valueOf(this.tsIntersectionWithPriorityToTheRightId), Integer.valueOf(this.tsDirectionToTheRightId), Integer.valueOf(this.tsDirectionToTheLeftId), Integer.valueOf(this.tsCarriagewayNarrowsId), Integer.valueOf(this.tsCarriagewayNarrowsRightId), Integer.valueOf(this.tsCarriagewayNarrowsLeftId), Integer.valueOf(this.tsLaneMergeLeftId), Integer.valueOf(this.tsLaneMergeRightId), Integer.valueOf(this.tsLaneMergeCenterId), Integer.valueOf(this.tsOvertakingProhibitedId), Integer.valueOf(this.tsEndOfProhibitionOnOvertakingId), Integer.valueOf(this.tsProtectiveOvertakingId), Integer.valueOf(this.tsPedestriansId), Integer.valueOf(this.tsPedestrianCrossingId), Integer.valueOf(this.tsChildrenId), Integer.valueOf(this.tsSchoolZoneId), Integer.valueOf(this.tsCyclistsId), Integer.valueOf(this.tsTwoWayTrafficId), Integer.valueOf(this.tsRailwayCrossingWithGatesId), Integer.valueOf(this.tsRailwayCrossingWithoutGatesId), Integer.valueOf(this.tsRailwayCrossingId), Integer.valueOf(this.tsTramwayId), Integer.valueOf(this.tsFallingRocksId), Integer.valueOf(this.tsFallingRocksLeftId), Integer.valueOf(this.tsFallingRocksRightId), Integer.valueOf(this.tsSteepDropLeftId), Integer.valueOf(this.tsSteepDropRightId), Integer.valueOf(this.tsVariableSignMechanicElementsId), Integer.valueOf(this.tsSlipperyRoadId), Integer.valueOf(this.tsSteepAscentId), Integer.valueOf(this.tsSteepDescentId), Integer.valueOf(this.tsUnevenRoadId), Integer.valueOf(this.tsHumpId), Integer.valueOf(this.tsDipId), Integer.valueOf(this.tsRoadFloodsId), Integer.valueOf(this.tsIcyRoadId), Integer.valueOf(this.tsSideWindsId), Integer.valueOf(this.tsTrafficCongestionId), Integer.valueOf(this.tsHighAccidentAreaId), Integer.valueOf(this.tsVariableSignLightElementsId), Integer.valueOf(this.tsPriorityOverOncomingTrafficId), Integer.valueOf(this.tsPriorityForOncomingTrafficId), Integer.valueOf(this.tsSpeedLimitId), Integer.valueOf(this.tsTollBoothId), Integer.valueOf(this.tsRoadCamSpeedIntervalEndId), Integer.valueOf(this.tsRoadCamSpeedIntervalStartId), Integer.valueOf(this.tsRoadCamSpeedIntervalId), Integer.valueOf(this.tsRoadCamLaneNonMotorizedId), Integer.valueOf(this.tsRoadCamLaneEmergencyId), Integer.valueOf(this.tsRoadCamLaneBusId), Integer.valueOf(this.tsRoadCamViolationId), Integer.valueOf(this.tsRoadCamRedLightId), Integer.valueOf(this.tsRoadCamSurveillanceId), Integer.valueOf(this.tsRoadCamSpeedCurrentSpeedId), Integer.valueOf(this.tsRailroadCrossingId), Integer.valueOf(this.tsZebraId), Integer.valueOf(this.tsSpeedBumpId), Integer.valueOf(this.tsTrafficLightId));
    }

    public AdasisConfigProfilelongTrafficSignIds() {
        this.tsDangerId = 0;
        this.tsPassLeftOrRightSideId = 1;
        this.tsPassLeftSideId = 2;
        this.tsPassRightSideId = 3;
        this.tsDomesticAnimalsCrossingId = 4;
        this.tsWildAnimalsCrossingId = 5;
        this.tsRoadWorksId = 6;
        this.tsResidentialAreaId = 7;
        this.tsEndOfResidentialAreaId = 8;
        this.tsRightBendId = 9;
        this.tsLeftBendId = 10;
        this.tsDoubleBendRightFirstId = 13;
        this.tsDoubleBendLeftFirstId = 14;
        this.tsCurvyRoadId = 17;
        this.tsOvertakingByGoodsVehiclesProhibitedId = 20;
        this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId = 21;
        this.tsDangerousIntersectionId = 22;
        this.tsTunnelId = 24;
        this.tsFerryTerminalId = 25;
        this.tsNarrowBridgeId = 26;
        this.tsHumpbackBridgeBridgeId = 28;
        this.tsRiverBankId = 29;
        this.tsRiverBankLeftId = 30;
        this.tsYieldId = 32;
        this.tsStopId = 33;
        this.tsPriorityRoadId = 34;
        this.tsIntersectionId = 35;
        this.tsIntersectionWithMinorRoadId = 36;
        this.tsIntersectionWithPriorityToTheRightId = 37;
        this.tsDirectionToTheRightId = 38;
        this.tsDirectionToTheLeftId = 39;
        this.tsCarriagewayNarrowsId = 40;
        this.tsCarriagewayNarrowsRightId = 41;
        this.tsCarriagewayNarrowsLeftId = 42;
        this.tsLaneMergeLeftId = 43;
        this.tsLaneMergeRightId = 44;
        this.tsLaneMergeCenterId = 45;
        this.tsOvertakingProhibitedId = 46;
        this.tsEndOfProhibitionOnOvertakingId = 47;
        this.tsProtectiveOvertakingId = 49;
        this.tsPedestriansId = 50;
        this.tsPedestrianCrossingId = 51;
        this.tsChildrenId = 52;
        this.tsSchoolZoneId = 53;
        this.tsCyclistsId = 54;
        this.tsTwoWayTrafficId = 55;
        this.tsRailwayCrossingWithGatesId = 56;
        this.tsRailwayCrossingWithoutGatesId = 57;
        this.tsRailwayCrossingId = 58;
        this.tsTramwayId = 59;
        this.tsFallingRocksId = 60;
        this.tsFallingRocksLeftId = 61;
        this.tsFallingRocksRightId = 62;
        this.tsSteepDropLeftId = 63;
        this.tsSteepDropRightId = 64;
        this.tsVariableSignMechanicElementsId = 65;
        this.tsSlipperyRoadId = 66;
        this.tsSteepAscentId = 67;
        this.tsSteepDescentId = 68;
        this.tsUnevenRoadId = 69;
        this.tsHumpId = 70;
        this.tsDipId = 71;
        this.tsRoadFloodsId = 72;
        this.tsIcyRoadId = 73;
        this.tsSideWindsId = 74;
        this.tsTrafficCongestionId = 75;
        this.tsHighAccidentAreaId = 76;
        this.tsVariableSignLightElementsId = 80;
        this.tsPriorityOverOncomingTrafficId = 81;
        this.tsPriorityForOncomingTrafficId = 82;
        this.tsSpeedLimitId = 87;
        this.tsTollBoothId = 90;
        this.tsRoadCamSpeedIntervalEndId = 237;
        this.tsRoadCamSpeedIntervalStartId = 238;
        this.tsRoadCamSpeedIntervalId = 239;
        this.tsRoadCamLaneNonMotorizedId = 240;
        this.tsRoadCamLaneEmergencyId = 241;
        this.tsRoadCamLaneBusId = 242;
        this.tsRoadCamViolationId = 243;
        this.tsRoadCamRedLightId = Constant.ERROR_GNSS_STATUS_INVALID;
        this.tsRoadCamSurveillanceId = 249;
        this.tsRoadCamSpeedCurrentSpeedId = 250;
        this.tsRailroadCrossingId = 251;
        this.tsZebraId = 252;
        this.tsSpeedBumpId = 253;
        this.tsTrafficLightId = Constant.ERROR_ROAD_AREA_INVALID;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[tsDangerId: ");
        IconCompatParcelizer.write(this.tsDangerId, ", tsPassLeftOrRightSideId: ", sb);
        IconCompatParcelizer.write(this.tsPassLeftOrRightSideId, ", tsPassLeftSideId: ", sb);
        IconCompatParcelizer.write(this.tsPassLeftSideId, ", tsPassRightSideId: ", sb);
        IconCompatParcelizer.write(this.tsPassRightSideId, ", tsDomesticAnimalsCrossingId: ", sb);
        IconCompatParcelizer.write(this.tsDomesticAnimalsCrossingId, ", tsWildAnimalsCrossingId: ", sb);
        IconCompatParcelizer.write(this.tsWildAnimalsCrossingId, ", tsRoadWorksId: ", sb);
        IconCompatParcelizer.write(this.tsRoadWorksId, ", tsResidentialAreaId: ", sb);
        IconCompatParcelizer.write(this.tsResidentialAreaId, ", tsEndOfResidentialAreaId: ", sb);
        IconCompatParcelizer.write(this.tsEndOfResidentialAreaId, ", tsRightBendId: ", sb);
        IconCompatParcelizer.write(this.tsRightBendId, ", tsLeftBendId: ", sb);
        IconCompatParcelizer.write(this.tsLeftBendId, ", tsDoubleBendRightFirstId: ", sb);
        IconCompatParcelizer.write(this.tsDoubleBendRightFirstId, ", tsDoubleBendLeftFirstId: ", sb);
        IconCompatParcelizer.write(this.tsDoubleBendLeftFirstId, ", tsCurvyRoadId: ", sb);
        IconCompatParcelizer.write(this.tsCurvyRoadId, ", tsOvertakingByGoodsVehiclesProhibitedId: ", sb);
        IconCompatParcelizer.write(this.tsOvertakingByGoodsVehiclesProhibitedId, ", tsEndOfProhibitionOnOvertakingForGoodsVehiclesId: ", sb);
        IconCompatParcelizer.write(this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId, ", tsDangerousIntersectionId: ", sb);
        IconCompatParcelizer.write(this.tsDangerousIntersectionId, ", tsTunnelId: ", sb);
        IconCompatParcelizer.write(this.tsTunnelId, ", tsFerryTerminalId: ", sb);
        IconCompatParcelizer.write(this.tsFerryTerminalId, ", tsNarrowBridgeId: ", sb);
        IconCompatParcelizer.write(this.tsNarrowBridgeId, ", tsHumpbackBridgeBridgeId: ", sb);
        IconCompatParcelizer.write(this.tsHumpbackBridgeBridgeId, ", tsRiverBankId: ", sb);
        IconCompatParcelizer.write(this.tsRiverBankId, ", tsRiverBankLeftId: ", sb);
        IconCompatParcelizer.write(this.tsRiverBankLeftId, ", tsYieldId: ", sb);
        IconCompatParcelizer.write(this.tsYieldId, ", tsStopId: ", sb);
        IconCompatParcelizer.write(this.tsStopId, ", tsPriorityRoadId: ", sb);
        IconCompatParcelizer.write(this.tsPriorityRoadId, ", tsIntersectionId: ", sb);
        IconCompatParcelizer.write(this.tsIntersectionId, ", tsIntersectionWithMinorRoadId: ", sb);
        IconCompatParcelizer.write(this.tsIntersectionWithMinorRoadId, ", tsIntersectionWithPriorityToTheRightId: ", sb);
        IconCompatParcelizer.write(this.tsIntersectionWithPriorityToTheRightId, ", tsDirectionToTheRightId: ", sb);
        IconCompatParcelizer.write(this.tsDirectionToTheRightId, ", tsDirectionToTheLeftId: ", sb);
        IconCompatParcelizer.write(this.tsDirectionToTheLeftId, ", tsCarriagewayNarrowsId: ", sb);
        IconCompatParcelizer.write(this.tsCarriagewayNarrowsId, ", tsCarriagewayNarrowsRightId: ", sb);
        IconCompatParcelizer.write(this.tsCarriagewayNarrowsRightId, ", tsCarriagewayNarrowsLeftId: ", sb);
        IconCompatParcelizer.write(this.tsCarriagewayNarrowsLeftId, ", tsLaneMergeLeftId: ", sb);
        IconCompatParcelizer.write(this.tsLaneMergeLeftId, ", tsLaneMergeRightId: ", sb);
        IconCompatParcelizer.write(this.tsLaneMergeRightId, ", tsLaneMergeCenterId: ", sb);
        IconCompatParcelizer.write(this.tsLaneMergeCenterId, ", tsOvertakingProhibitedId: ", sb);
        IconCompatParcelizer.write(this.tsOvertakingProhibitedId, ", tsEndOfProhibitionOnOvertakingId: ", sb);
        IconCompatParcelizer.write(this.tsEndOfProhibitionOnOvertakingId, ", tsProtectiveOvertakingId: ", sb);
        IconCompatParcelizer.write(this.tsProtectiveOvertakingId, ", tsPedestriansId: ", sb);
        IconCompatParcelizer.write(this.tsPedestriansId, ", tsPedestrianCrossingId: ", sb);
        IconCompatParcelizer.write(this.tsPedestrianCrossingId, ", tsChildrenId: ", sb);
        IconCompatParcelizer.write(this.tsChildrenId, ", tsSchoolZoneId: ", sb);
        IconCompatParcelizer.write(this.tsSchoolZoneId, ", tsCyclistsId: ", sb);
        IconCompatParcelizer.write(this.tsCyclistsId, ", tsTwoWayTrafficId: ", sb);
        IconCompatParcelizer.write(this.tsTwoWayTrafficId, ", tsRailwayCrossingWithGatesId: ", sb);
        IconCompatParcelizer.write(this.tsRailwayCrossingWithGatesId, ", tsRailwayCrossingWithoutGatesId: ", sb);
        IconCompatParcelizer.write(this.tsRailwayCrossingWithoutGatesId, ", tsRailwayCrossingId: ", sb);
        IconCompatParcelizer.write(this.tsRailwayCrossingId, ", tsTramwayId: ", sb);
        IconCompatParcelizer.write(this.tsTramwayId, ", tsFallingRocksId: ", sb);
        IconCompatParcelizer.write(this.tsFallingRocksId, ", tsFallingRocksLeftId: ", sb);
        IconCompatParcelizer.write(this.tsFallingRocksLeftId, ", tsFallingRocksRightId: ", sb);
        IconCompatParcelizer.write(this.tsFallingRocksRightId, ", tsSteepDropLeftId: ", sb);
        IconCompatParcelizer.write(this.tsSteepDropLeftId, ", tsSteepDropRightId: ", sb);
        IconCompatParcelizer.write(this.tsSteepDropRightId, ", tsVariableSignMechanicElementsId: ", sb);
        IconCompatParcelizer.write(this.tsVariableSignMechanicElementsId, ", tsSlipperyRoadId: ", sb);
        IconCompatParcelizer.write(this.tsSlipperyRoadId, ", tsSteepAscentId: ", sb);
        IconCompatParcelizer.write(this.tsSteepAscentId, ", tsSteepDescentId: ", sb);
        IconCompatParcelizer.write(this.tsSteepDescentId, ", tsUnevenRoadId: ", sb);
        IconCompatParcelizer.write(this.tsUnevenRoadId, ", tsHumpId: ", sb);
        IconCompatParcelizer.write(this.tsHumpId, ", tsDipId: ", sb);
        IconCompatParcelizer.write(this.tsDipId, ", tsRoadFloodsId: ", sb);
        IconCompatParcelizer.write(this.tsRoadFloodsId, ", tsIcyRoadId: ", sb);
        IconCompatParcelizer.write(this.tsIcyRoadId, ", tsSideWindsId: ", sb);
        IconCompatParcelizer.write(this.tsSideWindsId, ", tsTrafficCongestionId: ", sb);
        IconCompatParcelizer.write(this.tsTrafficCongestionId, ", tsHighAccidentAreaId: ", sb);
        IconCompatParcelizer.write(this.tsHighAccidentAreaId, ", tsVariableSignLightElementsId: ", sb);
        IconCompatParcelizer.write(this.tsVariableSignLightElementsId, ", tsPriorityOverOncomingTrafficId: ", sb);
        IconCompatParcelizer.write(this.tsPriorityOverOncomingTrafficId, ", tsPriorityForOncomingTrafficId: ", sb);
        IconCompatParcelizer.write(this.tsPriorityForOncomingTrafficId, ", tsSpeedLimitId: ", sb);
        IconCompatParcelizer.write(this.tsSpeedLimitId, ", tsTollBoothId: ", sb);
        IconCompatParcelizer.write(this.tsTollBoothId, ", tsRoadCamSpeedIntervalEndId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamSpeedIntervalEndId, ", tsRoadCamSpeedIntervalStartId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamSpeedIntervalStartId, ", tsRoadCamSpeedIntervalId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamSpeedIntervalId, ", tsRoadCamLaneNonMotorizedId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamLaneNonMotorizedId, ", tsRoadCamLaneEmergencyId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamLaneEmergencyId, ", tsRoadCamLaneBusId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamLaneBusId, ", tsRoadCamViolationId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamViolationId, ", tsRoadCamRedLightId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamRedLightId, ", tsRoadCamSurveillanceId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamSurveillanceId, ", tsRoadCamSpeedCurrentSpeedId: ", sb);
        IconCompatParcelizer.write(this.tsRoadCamSpeedCurrentSpeedId, ", tsRailroadCrossingId: ", sb);
        IconCompatParcelizer.write(this.tsRailroadCrossingId, ", tsZebraId: ", sb);
        IconCompatParcelizer.write(this.tsZebraId, ", tsSpeedBumpId: ", sb);
        IconCompatParcelizer.write(this.tsSpeedBumpId, ", tsTrafficLightId: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.tsTrafficLightId, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTrafficSignIds adasisConfigProfilelongTrafficSignIds = (AdasisConfigProfilelongTrafficSignIds) obj;
        return this.tsDangerId == adasisConfigProfilelongTrafficSignIds.tsDangerId && this.tsPassLeftOrRightSideId == adasisConfigProfilelongTrafficSignIds.tsPassLeftOrRightSideId && this.tsPassLeftSideId == adasisConfigProfilelongTrafficSignIds.tsPassLeftSideId && this.tsPassRightSideId == adasisConfigProfilelongTrafficSignIds.tsPassRightSideId && this.tsDomesticAnimalsCrossingId == adasisConfigProfilelongTrafficSignIds.tsDomesticAnimalsCrossingId && this.tsWildAnimalsCrossingId == adasisConfigProfilelongTrafficSignIds.tsWildAnimalsCrossingId && this.tsRoadWorksId == adasisConfigProfilelongTrafficSignIds.tsRoadWorksId && this.tsResidentialAreaId == adasisConfigProfilelongTrafficSignIds.tsResidentialAreaId && this.tsEndOfResidentialAreaId == adasisConfigProfilelongTrafficSignIds.tsEndOfResidentialAreaId && this.tsRightBendId == adasisConfigProfilelongTrafficSignIds.tsRightBendId && this.tsLeftBendId == adasisConfigProfilelongTrafficSignIds.tsLeftBendId && this.tsDoubleBendRightFirstId == adasisConfigProfilelongTrafficSignIds.tsDoubleBendRightFirstId && this.tsDoubleBendLeftFirstId == adasisConfigProfilelongTrafficSignIds.tsDoubleBendLeftFirstId && this.tsCurvyRoadId == adasisConfigProfilelongTrafficSignIds.tsCurvyRoadId && this.tsOvertakingByGoodsVehiclesProhibitedId == adasisConfigProfilelongTrafficSignIds.tsOvertakingByGoodsVehiclesProhibitedId && this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId == adasisConfigProfilelongTrafficSignIds.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId && this.tsDangerousIntersectionId == adasisConfigProfilelongTrafficSignIds.tsDangerousIntersectionId && this.tsTunnelId == adasisConfigProfilelongTrafficSignIds.tsTunnelId && this.tsFerryTerminalId == adasisConfigProfilelongTrafficSignIds.tsFerryTerminalId && this.tsNarrowBridgeId == adasisConfigProfilelongTrafficSignIds.tsNarrowBridgeId && this.tsHumpbackBridgeBridgeId == adasisConfigProfilelongTrafficSignIds.tsHumpbackBridgeBridgeId && this.tsRiverBankId == adasisConfigProfilelongTrafficSignIds.tsRiverBankId && this.tsRiverBankLeftId == adasisConfigProfilelongTrafficSignIds.tsRiverBankLeftId && this.tsYieldId == adasisConfigProfilelongTrafficSignIds.tsYieldId && this.tsStopId == adasisConfigProfilelongTrafficSignIds.tsStopId && this.tsPriorityRoadId == adasisConfigProfilelongTrafficSignIds.tsPriorityRoadId && this.tsIntersectionId == adasisConfigProfilelongTrafficSignIds.tsIntersectionId && this.tsIntersectionWithMinorRoadId == adasisConfigProfilelongTrafficSignIds.tsIntersectionWithMinorRoadId && this.tsIntersectionWithPriorityToTheRightId == adasisConfigProfilelongTrafficSignIds.tsIntersectionWithPriorityToTheRightId && this.tsDirectionToTheRightId == adasisConfigProfilelongTrafficSignIds.tsDirectionToTheRightId && this.tsDirectionToTheLeftId == adasisConfigProfilelongTrafficSignIds.tsDirectionToTheLeftId && this.tsCarriagewayNarrowsId == adasisConfigProfilelongTrafficSignIds.tsCarriagewayNarrowsId && this.tsCarriagewayNarrowsRightId == adasisConfigProfilelongTrafficSignIds.tsCarriagewayNarrowsRightId && this.tsCarriagewayNarrowsLeftId == adasisConfigProfilelongTrafficSignIds.tsCarriagewayNarrowsLeftId && this.tsLaneMergeLeftId == adasisConfigProfilelongTrafficSignIds.tsLaneMergeLeftId && this.tsLaneMergeRightId == adasisConfigProfilelongTrafficSignIds.tsLaneMergeRightId && this.tsLaneMergeCenterId == adasisConfigProfilelongTrafficSignIds.tsLaneMergeCenterId && this.tsOvertakingProhibitedId == adasisConfigProfilelongTrafficSignIds.tsOvertakingProhibitedId && this.tsEndOfProhibitionOnOvertakingId == adasisConfigProfilelongTrafficSignIds.tsEndOfProhibitionOnOvertakingId && this.tsProtectiveOvertakingId == adasisConfigProfilelongTrafficSignIds.tsProtectiveOvertakingId && this.tsPedestriansId == adasisConfigProfilelongTrafficSignIds.tsPedestriansId && this.tsPedestrianCrossingId == adasisConfigProfilelongTrafficSignIds.tsPedestrianCrossingId && this.tsChildrenId == adasisConfigProfilelongTrafficSignIds.tsChildrenId && this.tsSchoolZoneId == adasisConfigProfilelongTrafficSignIds.tsSchoolZoneId && this.tsCyclistsId == adasisConfigProfilelongTrafficSignIds.tsCyclistsId && this.tsTwoWayTrafficId == adasisConfigProfilelongTrafficSignIds.tsTwoWayTrafficId && this.tsRailwayCrossingWithGatesId == adasisConfigProfilelongTrafficSignIds.tsRailwayCrossingWithGatesId && this.tsRailwayCrossingWithoutGatesId == adasisConfigProfilelongTrafficSignIds.tsRailwayCrossingWithoutGatesId && this.tsRailwayCrossingId == adasisConfigProfilelongTrafficSignIds.tsRailwayCrossingId && this.tsTramwayId == adasisConfigProfilelongTrafficSignIds.tsTramwayId && this.tsFallingRocksId == adasisConfigProfilelongTrafficSignIds.tsFallingRocksId && this.tsFallingRocksLeftId == adasisConfigProfilelongTrafficSignIds.tsFallingRocksLeftId && this.tsFallingRocksRightId == adasisConfigProfilelongTrafficSignIds.tsFallingRocksRightId && this.tsSteepDropLeftId == adasisConfigProfilelongTrafficSignIds.tsSteepDropLeftId && this.tsSteepDropRightId == adasisConfigProfilelongTrafficSignIds.tsSteepDropRightId && this.tsVariableSignMechanicElementsId == adasisConfigProfilelongTrafficSignIds.tsVariableSignMechanicElementsId && this.tsSlipperyRoadId == adasisConfigProfilelongTrafficSignIds.tsSlipperyRoadId && this.tsSteepAscentId == adasisConfigProfilelongTrafficSignIds.tsSteepAscentId && this.tsSteepDescentId == adasisConfigProfilelongTrafficSignIds.tsSteepDescentId && this.tsUnevenRoadId == adasisConfigProfilelongTrafficSignIds.tsUnevenRoadId && this.tsHumpId == adasisConfigProfilelongTrafficSignIds.tsHumpId && this.tsDipId == adasisConfigProfilelongTrafficSignIds.tsDipId && this.tsRoadFloodsId == adasisConfigProfilelongTrafficSignIds.tsRoadFloodsId && this.tsIcyRoadId == adasisConfigProfilelongTrafficSignIds.tsIcyRoadId && this.tsSideWindsId == adasisConfigProfilelongTrafficSignIds.tsSideWindsId && this.tsTrafficCongestionId == adasisConfigProfilelongTrafficSignIds.tsTrafficCongestionId && this.tsHighAccidentAreaId == adasisConfigProfilelongTrafficSignIds.tsHighAccidentAreaId && this.tsVariableSignLightElementsId == adasisConfigProfilelongTrafficSignIds.tsVariableSignLightElementsId && this.tsPriorityOverOncomingTrafficId == adasisConfigProfilelongTrafficSignIds.tsPriorityOverOncomingTrafficId && this.tsPriorityForOncomingTrafficId == adasisConfigProfilelongTrafficSignIds.tsPriorityForOncomingTrafficId && this.tsSpeedLimitId == adasisConfigProfilelongTrafficSignIds.tsSpeedLimitId && this.tsTollBoothId == adasisConfigProfilelongTrafficSignIds.tsTollBoothId && this.tsRoadCamSpeedIntervalEndId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedIntervalEndId && this.tsRoadCamSpeedIntervalStartId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedIntervalStartId && this.tsRoadCamSpeedIntervalId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedIntervalId && this.tsRoadCamLaneNonMotorizedId == adasisConfigProfilelongTrafficSignIds.tsRoadCamLaneNonMotorizedId && this.tsRoadCamLaneEmergencyId == adasisConfigProfilelongTrafficSignIds.tsRoadCamLaneEmergencyId && this.tsRoadCamLaneBusId == adasisConfigProfilelongTrafficSignIds.tsRoadCamLaneBusId && this.tsRoadCamViolationId == adasisConfigProfilelongTrafficSignIds.tsRoadCamViolationId && this.tsRoadCamRedLightId == adasisConfigProfilelongTrafficSignIds.tsRoadCamRedLightId && this.tsRoadCamSurveillanceId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSurveillanceId && this.tsRoadCamSpeedCurrentSpeedId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedCurrentSpeedId && this.tsRailroadCrossingId == adasisConfigProfilelongTrafficSignIds.tsRailroadCrossingId && this.tsZebraId == adasisConfigProfilelongTrafficSignIds.tsZebraId && this.tsSpeedBumpId == adasisConfigProfilelongTrafficSignIds.tsSpeedBumpId && this.tsTrafficLightId == adasisConfigProfilelongTrafficSignIds.tsTrafficLightId;
    }

    public AdasisConfigProfilelongTrafficSignIds(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86) {
        this.tsDangerId = i;
        this.tsPassLeftOrRightSideId = i2;
        this.tsPassLeftSideId = i3;
        this.tsPassRightSideId = i4;
        this.tsDomesticAnimalsCrossingId = i5;
        this.tsWildAnimalsCrossingId = i6;
        this.tsRoadWorksId = i7;
        this.tsResidentialAreaId = i8;
        this.tsEndOfResidentialAreaId = i9;
        this.tsRightBendId = i10;
        this.tsLeftBendId = i11;
        this.tsDoubleBendRightFirstId = i12;
        this.tsDoubleBendLeftFirstId = i13;
        this.tsCurvyRoadId = i14;
        this.tsOvertakingByGoodsVehiclesProhibitedId = i15;
        this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId = i16;
        this.tsDangerousIntersectionId = i17;
        this.tsTunnelId = i18;
        this.tsFerryTerminalId = i19;
        this.tsNarrowBridgeId = i20;
        this.tsHumpbackBridgeBridgeId = i21;
        this.tsRiverBankId = i22;
        this.tsRiverBankLeftId = i23;
        this.tsYieldId = i24;
        this.tsStopId = i25;
        this.tsPriorityRoadId = i26;
        this.tsIntersectionId = i27;
        this.tsIntersectionWithMinorRoadId = i28;
        this.tsIntersectionWithPriorityToTheRightId = i29;
        this.tsDirectionToTheRightId = i30;
        this.tsDirectionToTheLeftId = i31;
        this.tsCarriagewayNarrowsId = i32;
        this.tsCarriagewayNarrowsRightId = i33;
        this.tsCarriagewayNarrowsLeftId = i34;
        this.tsLaneMergeLeftId = i35;
        this.tsLaneMergeRightId = i36;
        this.tsLaneMergeCenterId = i37;
        this.tsOvertakingProhibitedId = i38;
        this.tsEndOfProhibitionOnOvertakingId = i39;
        this.tsProtectiveOvertakingId = i40;
        this.tsPedestriansId = i41;
        this.tsPedestrianCrossingId = i42;
        this.tsChildrenId = i43;
        this.tsSchoolZoneId = i44;
        this.tsCyclistsId = i45;
        this.tsTwoWayTrafficId = i46;
        this.tsRailwayCrossingWithGatesId = i47;
        this.tsRailwayCrossingWithoutGatesId = i48;
        this.tsRailwayCrossingId = i49;
        this.tsTramwayId = i50;
        this.tsFallingRocksId = i51;
        this.tsFallingRocksLeftId = i52;
        this.tsFallingRocksRightId = i53;
        this.tsSteepDropLeftId = i54;
        this.tsSteepDropRightId = i55;
        this.tsVariableSignMechanicElementsId = i56;
        this.tsSlipperyRoadId = i57;
        this.tsSteepAscentId = i58;
        this.tsSteepDescentId = i59;
        this.tsUnevenRoadId = i60;
        this.tsHumpId = i61;
        this.tsDipId = i62;
        this.tsRoadFloodsId = i63;
        this.tsIcyRoadId = i64;
        this.tsSideWindsId = i65;
        this.tsTrafficCongestionId = i66;
        this.tsHighAccidentAreaId = i67;
        this.tsVariableSignLightElementsId = i68;
        this.tsPriorityOverOncomingTrafficId = i69;
        this.tsPriorityForOncomingTrafficId = i70;
        this.tsSpeedLimitId = i71;
        this.tsTollBoothId = i72;
        this.tsRoadCamSpeedIntervalEndId = i73;
        this.tsRoadCamSpeedIntervalStartId = i74;
        this.tsRoadCamSpeedIntervalId = i75;
        this.tsRoadCamLaneNonMotorizedId = i76;
        this.tsRoadCamLaneEmergencyId = i77;
        this.tsRoadCamLaneBusId = i78;
        this.tsRoadCamViolationId = i79;
        this.tsRoadCamRedLightId = i80;
        this.tsRoadCamSurveillanceId = i81;
        this.tsRoadCamSpeedCurrentSpeedId = i82;
        this.tsRailroadCrossingId = i83;
        this.tsZebraId = i84;
        this.tsSpeedBumpId = i85;
        this.tsTrafficLightId = i86;
    }
}
