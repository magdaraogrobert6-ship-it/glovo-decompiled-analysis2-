package com.mapbox.navigator;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigProfilelongTrafficEventIds implements Serializable {
    private final int teAccidentBreakdownCarId;
    private final int teAccidentGeneralTrafficAccidentId;
    private final int teAccidentSeriousTrafficAccidentId;
    private final int teActivitiesCtrlCulturalEventsId;
    private final int teActivitiesCtrlFairId;
    private final int teActivitiesCtrlHolidaysId;
    private final int teActivitiesCtrlLargeMeetingsId;
    private final int teActivitiesCtrlNationalEventsId;
    private final int teActivitiesCtrlRallyId;
    private final int teActivitiesCtrlSportsEventsId;
    private final int teActivityExpoId;
    private final int teActivityGatheringId;
    private final int teActivityHolidaysId;
    private final int teActivityLargeMeetingId;
    private final int teActivityLiteraryActivitiesId;
    private final int teActivityMajorNationalEventsId;
    private final int teActivitySportsActivitiesId;
    private final int teConstructionCtrlRoadWorksId;
    private final int teConstructionNotRecommendedId;
    private final int teConstructionRoadWorkId;
    private final int teControlExitRampClosedId;
    private final int teControlOnrampClosedId;
    private final int teControlRoadClosedId;
    private final int teControlTrafficControlId;
    private final int teDisasterCollapseId;
    private final int teDisasterCtrlFloodingId;
    private final int teDisasterCtrlMudslidesId;
    private final int teDisasterEarthquakeId;
    private final int teDisasterFloodId;
    private final int teDisasterMudslideId;
    private final int teDisasterRockslideId;
    private final int teFlowAmbleId;
    private final int teFlowCloggedId;
    private final int teFlowCongestionId;
    private final int teFlowNoTrafficFlowId;
    private final int teFlowSmoothId;
    private final int teFlowUnknownId;
    private final int teIncidentCtrlGeneralTrafficAccidentsId;
    private final int teIncidentCtrlSeriousTrafficAccidentId;
    private final int teOtherAnnouncementId;
    private final int teOtherCompleteRemodelId;
    private final int teOtherCustomizedBroadcastId;
    private final int teOtherEmergencyId;
    private final int teOtherOpenToTrafficId;
    private final int teOtherRealRoadConditionsId;
    private final int teOtherSubwayIncidentId;
    private final int tePavementCtrlObstaclesOnRoadId;
    private final int tePavementCtrlRoadSubsidenceId;
    private final int tePavementCtrlSevereFiresId;
    private final int tePavementCtrlSnowyRoadsId;
    private final int tePavementCtrlThinIceOnRoadId;
    private final int tePavementCtrlWaterAccumulationId;
    private final int tePavementObstaclesOnRoadId;
    private final int tePavementOilOnRoadId;
    private final int tePavementRoadFireId;
    private final int tePavementRoadSubsidenceId;
    private final int tePavementSlipperyRoadId;
    private final int tePavementSnowOnRoadId;
    private final int tePavementThinIceOnRoadId;
    private final int tePavementWaterAccumulationOnRoadId;
    private final int tePoliceCatchViolationsId;
    private final int tePoliceDrunkDrivingCheckId;
    private final int tePolicePoliceEnforcementId;
    private final int teUnknownId;
    private final int teWeatherCtrlHailId;
    private final int teWeatherCtrlHeavyFogId;
    private final int teWeatherCtrlHeavyRainId;
    private final int teWeatherCtrlHeavySnowId;

    public int getTeAccidentBreakdownCarId() {
        return this.teAccidentBreakdownCarId;
    }

    public int getTeAccidentGeneralTrafficAccidentId() {
        return this.teAccidentGeneralTrafficAccidentId;
    }

    public int getTeAccidentSeriousTrafficAccidentId() {
        return this.teAccidentSeriousTrafficAccidentId;
    }

    public int getTeActivitiesCtrlCulturalEventsId() {
        return this.teActivitiesCtrlCulturalEventsId;
    }

    public int getTeActivitiesCtrlFairId() {
        return this.teActivitiesCtrlFairId;
    }

    public int getTeActivitiesCtrlHolidaysId() {
        return this.teActivitiesCtrlHolidaysId;
    }

    public int getTeActivitiesCtrlLargeMeetingsId() {
        return this.teActivitiesCtrlLargeMeetingsId;
    }

    public int getTeActivitiesCtrlNationalEventsId() {
        return this.teActivitiesCtrlNationalEventsId;
    }

    public int getTeActivitiesCtrlRallyId() {
        return this.teActivitiesCtrlRallyId;
    }

    public int getTeActivitiesCtrlSportsEventsId() {
        return this.teActivitiesCtrlSportsEventsId;
    }

    public int getTeActivityExpoId() {
        return this.teActivityExpoId;
    }

    public int getTeActivityGatheringId() {
        return this.teActivityGatheringId;
    }

    public int getTeActivityHolidaysId() {
        return this.teActivityHolidaysId;
    }

    public int getTeActivityLargeMeetingId() {
        return this.teActivityLargeMeetingId;
    }

    public int getTeActivityLiteraryActivitiesId() {
        return this.teActivityLiteraryActivitiesId;
    }

    public int getTeActivityMajorNationalEventsId() {
        return this.teActivityMajorNationalEventsId;
    }

    public int getTeActivitySportsActivitiesId() {
        return this.teActivitySportsActivitiesId;
    }

    public int getTeConstructionCtrlRoadWorksId() {
        return this.teConstructionCtrlRoadWorksId;
    }

    public int getTeConstructionNotRecommendedId() {
        return this.teConstructionNotRecommendedId;
    }

    public int getTeConstructionRoadWorkId() {
        return this.teConstructionRoadWorkId;
    }

    public int getTeControlExitRampClosedId() {
        return this.teControlExitRampClosedId;
    }

    public int getTeControlOnrampClosedId() {
        return this.teControlOnrampClosedId;
    }

    public int getTeControlRoadClosedId() {
        return this.teControlRoadClosedId;
    }

    public int getTeControlTrafficControlId() {
        return this.teControlTrafficControlId;
    }

    public int getTeDisasterCollapseId() {
        return this.teDisasterCollapseId;
    }

    public int getTeDisasterCtrlFloodingId() {
        return this.teDisasterCtrlFloodingId;
    }

    public int getTeDisasterCtrlMudslidesId() {
        return this.teDisasterCtrlMudslidesId;
    }

    public int getTeDisasterEarthquakeId() {
        return this.teDisasterEarthquakeId;
    }

    public int getTeDisasterFloodId() {
        return this.teDisasterFloodId;
    }

    public int getTeDisasterMudslideId() {
        return this.teDisasterMudslideId;
    }

    public int getTeDisasterRockslideId() {
        return this.teDisasterRockslideId;
    }

    public int getTeFlowAmbleId() {
        return this.teFlowAmbleId;
    }

    public int getTeFlowCloggedId() {
        return this.teFlowCloggedId;
    }

    public int getTeFlowCongestionId() {
        return this.teFlowCongestionId;
    }

    public int getTeFlowNoTrafficFlowId() {
        return this.teFlowNoTrafficFlowId;
    }

    public int getTeFlowSmoothId() {
        return this.teFlowSmoothId;
    }

    public int getTeFlowUnknownId() {
        return this.teFlowUnknownId;
    }

    public int getTeIncidentCtrlGeneralTrafficAccidentsId() {
        return this.teIncidentCtrlGeneralTrafficAccidentsId;
    }

    public int getTeIncidentCtrlSeriousTrafficAccidentId() {
        return this.teIncidentCtrlSeriousTrafficAccidentId;
    }

    public int getTeOtherAnnouncementId() {
        return this.teOtherAnnouncementId;
    }

    public int getTeOtherCompleteRemodelId() {
        return this.teOtherCompleteRemodelId;
    }

    public int getTeOtherCustomizedBroadcastId() {
        return this.teOtherCustomizedBroadcastId;
    }

    public int getTeOtherEmergencyId() {
        return this.teOtherEmergencyId;
    }

    public int getTeOtherOpenToTrafficId() {
        return this.teOtherOpenToTrafficId;
    }

    public int getTeOtherRealRoadConditionsId() {
        return this.teOtherRealRoadConditionsId;
    }

    public int getTeOtherSubwayIncidentId() {
        return this.teOtherSubwayIncidentId;
    }

    public int getTePavementCtrlObstaclesOnRoadId() {
        return this.tePavementCtrlObstaclesOnRoadId;
    }

    public int getTePavementCtrlRoadSubsidenceId() {
        return this.tePavementCtrlRoadSubsidenceId;
    }

    public int getTePavementCtrlSevereFiresId() {
        return this.tePavementCtrlSevereFiresId;
    }

    public int getTePavementCtrlSnowyRoadsId() {
        return this.tePavementCtrlSnowyRoadsId;
    }

    public int getTePavementCtrlThinIceOnRoadId() {
        return this.tePavementCtrlThinIceOnRoadId;
    }

    public int getTePavementCtrlWaterAccumulationId() {
        return this.tePavementCtrlWaterAccumulationId;
    }

    public int getTePavementObstaclesOnRoadId() {
        return this.tePavementObstaclesOnRoadId;
    }

    public int getTePavementOilOnRoadId() {
        return this.tePavementOilOnRoadId;
    }

    public int getTePavementRoadFireId() {
        return this.tePavementRoadFireId;
    }

    public int getTePavementRoadSubsidenceId() {
        return this.tePavementRoadSubsidenceId;
    }

    public int getTePavementSlipperyRoadId() {
        return this.tePavementSlipperyRoadId;
    }

    public int getTePavementSnowOnRoadId() {
        return this.tePavementSnowOnRoadId;
    }

    public int getTePavementThinIceOnRoadId() {
        return this.tePavementThinIceOnRoadId;
    }

    public int getTePavementWaterAccumulationOnRoadId() {
        return this.tePavementWaterAccumulationOnRoadId;
    }

    public int getTePoliceCatchViolationsId() {
        return this.tePoliceCatchViolationsId;
    }

    public int getTePoliceDrunkDrivingCheckId() {
        return this.tePoliceDrunkDrivingCheckId;
    }

    public int getTePolicePoliceEnforcementId() {
        return this.tePolicePoliceEnforcementId;
    }

    public int getTeUnknownId() {
        return this.teUnknownId;
    }

    public int getTeWeatherCtrlHailId() {
        return this.teWeatherCtrlHailId;
    }

    public int getTeWeatherCtrlHeavyFogId() {
        return this.teWeatherCtrlHeavyFogId;
    }

    public int getTeWeatherCtrlHeavyRainId() {
        return this.teWeatherCtrlHeavyRainId;
    }

    public int getTeWeatherCtrlHeavySnowId() {
        return this.teWeatherCtrlHeavySnowId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.teUnknownId), Integer.valueOf(this.teFlowUnknownId), Integer.valueOf(this.teFlowSmoothId), Integer.valueOf(this.teFlowAmbleId), Integer.valueOf(this.teFlowCongestionId), Integer.valueOf(this.teFlowCloggedId), Integer.valueOf(this.teFlowNoTrafficFlowId), Integer.valueOf(this.teAccidentGeneralTrafficAccidentId), Integer.valueOf(this.teAccidentSeriousTrafficAccidentId), Integer.valueOf(this.teAccidentBreakdownCarId), Integer.valueOf(this.teConstructionRoadWorkId), Integer.valueOf(this.teConstructionNotRecommendedId), Integer.valueOf(this.teControlTrafficControlId), Integer.valueOf(this.teControlRoadClosedId), Integer.valueOf(this.teControlExitRampClosedId), Integer.valueOf(this.teControlOnrampClosedId), Integer.valueOf(this.tePavementWaterAccumulationOnRoadId), Integer.valueOf(this.tePavementSnowOnRoadId), Integer.valueOf(this.tePavementThinIceOnRoadId), Integer.valueOf(this.tePavementRoadSubsidenceId), Integer.valueOf(this.tePavementObstaclesOnRoadId), Integer.valueOf(this.tePavementRoadFireId), Integer.valueOf(this.tePavementSlipperyRoadId), Integer.valueOf(this.tePavementOilOnRoadId), Integer.valueOf(this.teActivityExpoId), Integer.valueOf(this.teActivityMajorNationalEventsId), Integer.valueOf(this.teActivityGatheringId), Integer.valueOf(this.teActivityLargeMeetingId), Integer.valueOf(this.teActivitySportsActivitiesId), Integer.valueOf(this.teActivityLiteraryActivitiesId), Integer.valueOf(this.teActivityHolidaysId), Integer.valueOf(this.teDisasterFloodId), Integer.valueOf(this.teDisasterEarthquakeId), Integer.valueOf(this.teDisasterRockslideId), Integer.valueOf(this.teDisasterCollapseId), Integer.valueOf(this.teDisasterMudslideId), Integer.valueOf(this.tePoliceCatchViolationsId), Integer.valueOf(this.tePoliceDrunkDrivingCheckId), Integer.valueOf(this.tePolicePoliceEnforcementId), Integer.valueOf(this.teOtherAnnouncementId), Integer.valueOf(this.teOtherOpenToTrafficId), Integer.valueOf(this.teOtherCompleteRemodelId), Integer.valueOf(this.teOtherRealRoadConditionsId), Integer.valueOf(this.teOtherEmergencyId), Integer.valueOf(this.teOtherSubwayIncidentId), Integer.valueOf(this.teOtherCustomizedBroadcastId), Integer.valueOf(this.teIncidentCtrlGeneralTrafficAccidentsId), Integer.valueOf(this.teIncidentCtrlSeriousTrafficAccidentId), Integer.valueOf(this.teConstructionCtrlRoadWorksId), Integer.valueOf(this.teWeatherCtrlHeavyFogId), Integer.valueOf(this.teWeatherCtrlHeavyRainId), Integer.valueOf(this.teWeatherCtrlHeavySnowId), Integer.valueOf(this.teWeatherCtrlHailId), Integer.valueOf(this.tePavementCtrlWaterAccumulationId), Integer.valueOf(this.tePavementCtrlSnowyRoadsId), Integer.valueOf(this.tePavementCtrlThinIceOnRoadId), Integer.valueOf(this.tePavementCtrlRoadSubsidenceId), Integer.valueOf(this.tePavementCtrlObstaclesOnRoadId), Integer.valueOf(this.tePavementCtrlSevereFiresId), Integer.valueOf(this.teActivitiesCtrlFairId), Integer.valueOf(this.teActivitiesCtrlNationalEventsId), Integer.valueOf(this.teActivitiesCtrlRallyId), Integer.valueOf(this.teActivitiesCtrlLargeMeetingsId), Integer.valueOf(this.teActivitiesCtrlSportsEventsId), Integer.valueOf(this.teActivitiesCtrlCulturalEventsId), Integer.valueOf(this.teActivitiesCtrlHolidaysId), Integer.valueOf(this.teDisasterCtrlFloodingId), Integer.valueOf(this.teDisasterCtrlMudslidesId));
    }

    public AdasisConfigProfilelongTrafficEventIds() {
        this.teUnknownId = 0;
        this.teFlowUnknownId = 1;
        this.teFlowSmoothId = 2;
        this.teFlowAmbleId = 3;
        this.teFlowCongestionId = 4;
        this.teFlowCloggedId = 5;
        this.teFlowNoTrafficFlowId = 6;
        this.teAccidentGeneralTrafficAccidentId = 7;
        this.teAccidentSeriousTrafficAccidentId = 8;
        this.teAccidentBreakdownCarId = 9;
        this.teConstructionRoadWorkId = 11;
        this.teConstructionNotRecommendedId = 13;
        this.teControlTrafficControlId = 14;
        this.teControlRoadClosedId = 15;
        this.teControlExitRampClosedId = 16;
        this.teControlOnrampClosedId = 17;
        this.tePavementWaterAccumulationOnRoadId = 56;
        this.tePavementSnowOnRoadId = 57;
        this.tePavementThinIceOnRoadId = 58;
        this.tePavementRoadSubsidenceId = 59;
        this.tePavementObstaclesOnRoadId = 60;
        this.tePavementRoadFireId = 61;
        this.tePavementSlipperyRoadId = 62;
        this.tePavementOilOnRoadId = 63;
        this.teActivityExpoId = 68;
        this.teActivityMajorNationalEventsId = 69;
        this.teActivityGatheringId = 70;
        this.teActivityLargeMeetingId = 71;
        this.teActivitySportsActivitiesId = 72;
        this.teActivityLiteraryActivitiesId = 73;
        this.teActivityHolidaysId = 74;
        this.teDisasterFloodId = 75;
        this.teDisasterEarthquakeId = 76;
        this.teDisasterRockslideId = 77;
        this.teDisasterCollapseId = 78;
        this.teDisasterMudslideId = 79;
        this.tePoliceCatchViolationsId = 80;
        this.tePoliceDrunkDrivingCheckId = 81;
        this.tePolicePoliceEnforcementId = 82;
        this.teOtherAnnouncementId = 83;
        this.teOtherOpenToTrafficId = 84;
        this.teOtherCompleteRemodelId = 85;
        this.teOtherRealRoadConditionsId = 86;
        this.teOtherEmergencyId = 87;
        this.teOtherSubwayIncidentId = 88;
        this.teOtherCustomizedBroadcastId = 89;
        this.teIncidentCtrlGeneralTrafficAccidentsId = 90;
        this.teIncidentCtrlSeriousTrafficAccidentId = 91;
        this.teConstructionCtrlRoadWorksId = 92;
        this.teWeatherCtrlHeavyFogId = 93;
        this.teWeatherCtrlHeavyRainId = 94;
        this.teWeatherCtrlHeavySnowId = 95;
        this.teWeatherCtrlHailId = 96;
        this.tePavementCtrlWaterAccumulationId = 97;
        this.tePavementCtrlSnowyRoadsId = 98;
        this.tePavementCtrlThinIceOnRoadId = 99;
        this.tePavementCtrlRoadSubsidenceId = 100;
        this.tePavementCtrlObstaclesOnRoadId = 101;
        this.tePavementCtrlSevereFiresId = 102;
        this.teActivitiesCtrlFairId = 103;
        this.teActivitiesCtrlNationalEventsId = 104;
        this.teActivitiesCtrlRallyId = 105;
        this.teActivitiesCtrlLargeMeetingsId = GwiErrorCode.ALG_LIBRARY_NOT_EXIST;
        this.teActivitiesCtrlSportsEventsId = 107;
        this.teActivitiesCtrlCulturalEventsId = ActivityIdentificationData.RUNNING;
        this.teActivitiesCtrlHolidaysId = 109;
        this.teDisasterCtrlFloodingId = 110;
        this.teDisasterCtrlMudslidesId = 114;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[teUnknownId: ");
        IconCompatParcelizer.write(this.teUnknownId, ", teFlowUnknownId: ", sb);
        IconCompatParcelizer.write(this.teFlowUnknownId, ", teFlowSmoothId: ", sb);
        IconCompatParcelizer.write(this.teFlowSmoothId, ", teFlowAmbleId: ", sb);
        IconCompatParcelizer.write(this.teFlowAmbleId, ", teFlowCongestionId: ", sb);
        IconCompatParcelizer.write(this.teFlowCongestionId, ", teFlowCloggedId: ", sb);
        IconCompatParcelizer.write(this.teFlowCloggedId, ", teFlowNoTrafficFlowId: ", sb);
        IconCompatParcelizer.write(this.teFlowNoTrafficFlowId, ", teAccidentGeneralTrafficAccidentId: ", sb);
        IconCompatParcelizer.write(this.teAccidentGeneralTrafficAccidentId, ", teAccidentSeriousTrafficAccidentId: ", sb);
        IconCompatParcelizer.write(this.teAccidentSeriousTrafficAccidentId, ", teAccidentBreakdownCarId: ", sb);
        IconCompatParcelizer.write(this.teAccidentBreakdownCarId, ", teConstructionRoadWorkId: ", sb);
        IconCompatParcelizer.write(this.teConstructionRoadWorkId, ", teConstructionNotRecommendedId: ", sb);
        IconCompatParcelizer.write(this.teConstructionNotRecommendedId, ", teControlTrafficControlId: ", sb);
        IconCompatParcelizer.write(this.teControlTrafficControlId, ", teControlRoadClosedId: ", sb);
        IconCompatParcelizer.write(this.teControlRoadClosedId, ", teControlExitRampClosedId: ", sb);
        IconCompatParcelizer.write(this.teControlExitRampClosedId, ", teControlOnrampClosedId: ", sb);
        IconCompatParcelizer.write(this.teControlOnrampClosedId, ", tePavementWaterAccumulationOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementWaterAccumulationOnRoadId, ", tePavementSnowOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementSnowOnRoadId, ", tePavementThinIceOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementThinIceOnRoadId, ", tePavementRoadSubsidenceId: ", sb);
        IconCompatParcelizer.write(this.tePavementRoadSubsidenceId, ", tePavementObstaclesOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementObstaclesOnRoadId, ", tePavementRoadFireId: ", sb);
        IconCompatParcelizer.write(this.tePavementRoadFireId, ", tePavementSlipperyRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementSlipperyRoadId, ", tePavementOilOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementOilOnRoadId, ", teActivityExpoId: ", sb);
        IconCompatParcelizer.write(this.teActivityExpoId, ", teActivityMajorNationalEventsId: ", sb);
        IconCompatParcelizer.write(this.teActivityMajorNationalEventsId, ", teActivityGatheringId: ", sb);
        IconCompatParcelizer.write(this.teActivityGatheringId, ", teActivityLargeMeetingId: ", sb);
        IconCompatParcelizer.write(this.teActivityLargeMeetingId, ", teActivitySportsActivitiesId: ", sb);
        IconCompatParcelizer.write(this.teActivitySportsActivitiesId, ", teActivityLiteraryActivitiesId: ", sb);
        IconCompatParcelizer.write(this.teActivityLiteraryActivitiesId, ", teActivityHolidaysId: ", sb);
        IconCompatParcelizer.write(this.teActivityHolidaysId, ", teDisasterFloodId: ", sb);
        IconCompatParcelizer.write(this.teDisasterFloodId, ", teDisasterEarthquakeId: ", sb);
        IconCompatParcelizer.write(this.teDisasterEarthquakeId, ", teDisasterRockslideId: ", sb);
        IconCompatParcelizer.write(this.teDisasterRockslideId, ", teDisasterCollapseId: ", sb);
        IconCompatParcelizer.write(this.teDisasterCollapseId, ", teDisasterMudslideId: ", sb);
        IconCompatParcelizer.write(this.teDisasterMudslideId, ", tePoliceCatchViolationsId: ", sb);
        IconCompatParcelizer.write(this.tePoliceCatchViolationsId, ", tePoliceDrunkDrivingCheckId: ", sb);
        IconCompatParcelizer.write(this.tePoliceDrunkDrivingCheckId, ", tePolicePoliceEnforcementId: ", sb);
        IconCompatParcelizer.write(this.tePolicePoliceEnforcementId, ", teOtherAnnouncementId: ", sb);
        IconCompatParcelizer.write(this.teOtherAnnouncementId, ", teOtherOpenToTrafficId: ", sb);
        IconCompatParcelizer.write(this.teOtherOpenToTrafficId, ", teOtherCompleteRemodelId: ", sb);
        IconCompatParcelizer.write(this.teOtherCompleteRemodelId, ", teOtherRealRoadConditionsId: ", sb);
        IconCompatParcelizer.write(this.teOtherRealRoadConditionsId, ", teOtherEmergencyId: ", sb);
        IconCompatParcelizer.write(this.teOtherEmergencyId, ", teOtherSubwayIncidentId: ", sb);
        IconCompatParcelizer.write(this.teOtherSubwayIncidentId, ", teOtherCustomizedBroadcastId: ", sb);
        IconCompatParcelizer.write(this.teOtherCustomizedBroadcastId, ", teIncidentCtrlGeneralTrafficAccidentsId: ", sb);
        IconCompatParcelizer.write(this.teIncidentCtrlGeneralTrafficAccidentsId, ", teIncidentCtrlSeriousTrafficAccidentId: ", sb);
        IconCompatParcelizer.write(this.teIncidentCtrlSeriousTrafficAccidentId, ", teConstructionCtrlRoadWorksId: ", sb);
        IconCompatParcelizer.write(this.teConstructionCtrlRoadWorksId, ", teWeatherCtrlHeavyFogId: ", sb);
        IconCompatParcelizer.write(this.teWeatherCtrlHeavyFogId, ", teWeatherCtrlHeavyRainId: ", sb);
        IconCompatParcelizer.write(this.teWeatherCtrlHeavyRainId, ", teWeatherCtrlHeavySnowId: ", sb);
        IconCompatParcelizer.write(this.teWeatherCtrlHeavySnowId, ", teWeatherCtrlHailId: ", sb);
        IconCompatParcelizer.write(this.teWeatherCtrlHailId, ", tePavementCtrlWaterAccumulationId: ", sb);
        IconCompatParcelizer.write(this.tePavementCtrlWaterAccumulationId, ", tePavementCtrlSnowyRoadsId: ", sb);
        IconCompatParcelizer.write(this.tePavementCtrlSnowyRoadsId, ", tePavementCtrlThinIceOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementCtrlThinIceOnRoadId, ", tePavementCtrlRoadSubsidenceId: ", sb);
        IconCompatParcelizer.write(this.tePavementCtrlRoadSubsidenceId, ", tePavementCtrlObstaclesOnRoadId: ", sb);
        IconCompatParcelizer.write(this.tePavementCtrlObstaclesOnRoadId, ", tePavementCtrlSevereFiresId: ", sb);
        IconCompatParcelizer.write(this.tePavementCtrlSevereFiresId, ", teActivitiesCtrlFairId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlFairId, ", teActivitiesCtrlNationalEventsId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlNationalEventsId, ", teActivitiesCtrlRallyId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlRallyId, ", teActivitiesCtrlLargeMeetingsId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlLargeMeetingsId, ", teActivitiesCtrlSportsEventsId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlSportsEventsId, ", teActivitiesCtrlCulturalEventsId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlCulturalEventsId, ", teActivitiesCtrlHolidaysId: ", sb);
        IconCompatParcelizer.write(this.teActivitiesCtrlHolidaysId, ", teDisasterCtrlFloodingId: ", sb);
        IconCompatParcelizer.write(this.teDisasterCtrlFloodingId, ", teDisasterCtrlMudslidesId: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.teDisasterCtrlMudslidesId, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTrafficEventIds adasisConfigProfilelongTrafficEventIds = (AdasisConfigProfilelongTrafficEventIds) obj;
        return this.teUnknownId == adasisConfigProfilelongTrafficEventIds.teUnknownId && this.teFlowUnknownId == adasisConfigProfilelongTrafficEventIds.teFlowUnknownId && this.teFlowSmoothId == adasisConfigProfilelongTrafficEventIds.teFlowSmoothId && this.teFlowAmbleId == adasisConfigProfilelongTrafficEventIds.teFlowAmbleId && this.teFlowCongestionId == adasisConfigProfilelongTrafficEventIds.teFlowCongestionId && this.teFlowCloggedId == adasisConfigProfilelongTrafficEventIds.teFlowCloggedId && this.teFlowNoTrafficFlowId == adasisConfigProfilelongTrafficEventIds.teFlowNoTrafficFlowId && this.teAccidentGeneralTrafficAccidentId == adasisConfigProfilelongTrafficEventIds.teAccidentGeneralTrafficAccidentId && this.teAccidentSeriousTrafficAccidentId == adasisConfigProfilelongTrafficEventIds.teAccidentSeriousTrafficAccidentId && this.teAccidentBreakdownCarId == adasisConfigProfilelongTrafficEventIds.teAccidentBreakdownCarId && this.teConstructionRoadWorkId == adasisConfigProfilelongTrafficEventIds.teConstructionRoadWorkId && this.teConstructionNotRecommendedId == adasisConfigProfilelongTrafficEventIds.teConstructionNotRecommendedId && this.teControlTrafficControlId == adasisConfigProfilelongTrafficEventIds.teControlTrafficControlId && this.teControlRoadClosedId == adasisConfigProfilelongTrafficEventIds.teControlRoadClosedId && this.teControlExitRampClosedId == adasisConfigProfilelongTrafficEventIds.teControlExitRampClosedId && this.teControlOnrampClosedId == adasisConfigProfilelongTrafficEventIds.teControlOnrampClosedId && this.tePavementWaterAccumulationOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementWaterAccumulationOnRoadId && this.tePavementSnowOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementSnowOnRoadId && this.tePavementThinIceOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementThinIceOnRoadId && this.tePavementRoadSubsidenceId == adasisConfigProfilelongTrafficEventIds.tePavementRoadSubsidenceId && this.tePavementObstaclesOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementObstaclesOnRoadId && this.tePavementRoadFireId == adasisConfigProfilelongTrafficEventIds.tePavementRoadFireId && this.tePavementSlipperyRoadId == adasisConfigProfilelongTrafficEventIds.tePavementSlipperyRoadId && this.tePavementOilOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementOilOnRoadId && this.teActivityExpoId == adasisConfigProfilelongTrafficEventIds.teActivityExpoId && this.teActivityMajorNationalEventsId == adasisConfigProfilelongTrafficEventIds.teActivityMajorNationalEventsId && this.teActivityGatheringId == adasisConfigProfilelongTrafficEventIds.teActivityGatheringId && this.teActivityLargeMeetingId == adasisConfigProfilelongTrafficEventIds.teActivityLargeMeetingId && this.teActivitySportsActivitiesId == adasisConfigProfilelongTrafficEventIds.teActivitySportsActivitiesId && this.teActivityLiteraryActivitiesId == adasisConfigProfilelongTrafficEventIds.teActivityLiteraryActivitiesId && this.teActivityHolidaysId == adasisConfigProfilelongTrafficEventIds.teActivityHolidaysId && this.teDisasterFloodId == adasisConfigProfilelongTrafficEventIds.teDisasterFloodId && this.teDisasterEarthquakeId == adasisConfigProfilelongTrafficEventIds.teDisasterEarthquakeId && this.teDisasterRockslideId == adasisConfigProfilelongTrafficEventIds.teDisasterRockslideId && this.teDisasterCollapseId == adasisConfigProfilelongTrafficEventIds.teDisasterCollapseId && this.teDisasterMudslideId == adasisConfigProfilelongTrafficEventIds.teDisasterMudslideId && this.tePoliceCatchViolationsId == adasisConfigProfilelongTrafficEventIds.tePoliceCatchViolationsId && this.tePoliceDrunkDrivingCheckId == adasisConfigProfilelongTrafficEventIds.tePoliceDrunkDrivingCheckId && this.tePolicePoliceEnforcementId == adasisConfigProfilelongTrafficEventIds.tePolicePoliceEnforcementId && this.teOtherAnnouncementId == adasisConfigProfilelongTrafficEventIds.teOtherAnnouncementId && this.teOtherOpenToTrafficId == adasisConfigProfilelongTrafficEventIds.teOtherOpenToTrafficId && this.teOtherCompleteRemodelId == adasisConfigProfilelongTrafficEventIds.teOtherCompleteRemodelId && this.teOtherRealRoadConditionsId == adasisConfigProfilelongTrafficEventIds.teOtherRealRoadConditionsId && this.teOtherEmergencyId == adasisConfigProfilelongTrafficEventIds.teOtherEmergencyId && this.teOtherSubwayIncidentId == adasisConfigProfilelongTrafficEventIds.teOtherSubwayIncidentId && this.teOtherCustomizedBroadcastId == adasisConfigProfilelongTrafficEventIds.teOtherCustomizedBroadcastId && this.teIncidentCtrlGeneralTrafficAccidentsId == adasisConfigProfilelongTrafficEventIds.teIncidentCtrlGeneralTrafficAccidentsId && this.teIncidentCtrlSeriousTrafficAccidentId == adasisConfigProfilelongTrafficEventIds.teIncidentCtrlSeriousTrafficAccidentId && this.teConstructionCtrlRoadWorksId == adasisConfigProfilelongTrafficEventIds.teConstructionCtrlRoadWorksId && this.teWeatherCtrlHeavyFogId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHeavyFogId && this.teWeatherCtrlHeavyRainId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHeavyRainId && this.teWeatherCtrlHeavySnowId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHeavySnowId && this.teWeatherCtrlHailId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHailId && this.tePavementCtrlWaterAccumulationId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlWaterAccumulationId && this.tePavementCtrlSnowyRoadsId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlSnowyRoadsId && this.tePavementCtrlThinIceOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlThinIceOnRoadId && this.tePavementCtrlRoadSubsidenceId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlRoadSubsidenceId && this.tePavementCtrlObstaclesOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlObstaclesOnRoadId && this.tePavementCtrlSevereFiresId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlSevereFiresId && this.teActivitiesCtrlFairId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlFairId && this.teActivitiesCtrlNationalEventsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlNationalEventsId && this.teActivitiesCtrlRallyId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlRallyId && this.teActivitiesCtrlLargeMeetingsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlLargeMeetingsId && this.teActivitiesCtrlSportsEventsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlSportsEventsId && this.teActivitiesCtrlCulturalEventsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlCulturalEventsId && this.teActivitiesCtrlHolidaysId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlHolidaysId && this.teDisasterCtrlFloodingId == adasisConfigProfilelongTrafficEventIds.teDisasterCtrlFloodingId && this.teDisasterCtrlMudslidesId == adasisConfigProfilelongTrafficEventIds.teDisasterCtrlMudslidesId;
    }

    public AdasisConfigProfilelongTrafficEventIds(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68) {
        this.teUnknownId = i;
        this.teFlowUnknownId = i2;
        this.teFlowSmoothId = i3;
        this.teFlowAmbleId = i4;
        this.teFlowCongestionId = i5;
        this.teFlowCloggedId = i6;
        this.teFlowNoTrafficFlowId = i7;
        this.teAccidentGeneralTrafficAccidentId = i8;
        this.teAccidentSeriousTrafficAccidentId = i9;
        this.teAccidentBreakdownCarId = i10;
        this.teConstructionRoadWorkId = i11;
        this.teConstructionNotRecommendedId = i12;
        this.teControlTrafficControlId = i13;
        this.teControlRoadClosedId = i14;
        this.teControlExitRampClosedId = i15;
        this.teControlOnrampClosedId = i16;
        this.tePavementWaterAccumulationOnRoadId = i17;
        this.tePavementSnowOnRoadId = i18;
        this.tePavementThinIceOnRoadId = i19;
        this.tePavementRoadSubsidenceId = i20;
        this.tePavementObstaclesOnRoadId = i21;
        this.tePavementRoadFireId = i22;
        this.tePavementSlipperyRoadId = i23;
        this.tePavementOilOnRoadId = i24;
        this.teActivityExpoId = i25;
        this.teActivityMajorNationalEventsId = i26;
        this.teActivityGatheringId = i27;
        this.teActivityLargeMeetingId = i28;
        this.teActivitySportsActivitiesId = i29;
        this.teActivityLiteraryActivitiesId = i30;
        this.teActivityHolidaysId = i31;
        this.teDisasterFloodId = i32;
        this.teDisasterEarthquakeId = i33;
        this.teDisasterRockslideId = i34;
        this.teDisasterCollapseId = i35;
        this.teDisasterMudslideId = i36;
        this.tePoliceCatchViolationsId = i37;
        this.tePoliceDrunkDrivingCheckId = i38;
        this.tePolicePoliceEnforcementId = i39;
        this.teOtherAnnouncementId = i40;
        this.teOtherOpenToTrafficId = i41;
        this.teOtherCompleteRemodelId = i42;
        this.teOtherRealRoadConditionsId = i43;
        this.teOtherEmergencyId = i44;
        this.teOtherSubwayIncidentId = i45;
        this.teOtherCustomizedBroadcastId = i46;
        this.teIncidentCtrlGeneralTrafficAccidentsId = i47;
        this.teIncidentCtrlSeriousTrafficAccidentId = i48;
        this.teConstructionCtrlRoadWorksId = i49;
        this.teWeatherCtrlHeavyFogId = i50;
        this.teWeatherCtrlHeavyRainId = i51;
        this.teWeatherCtrlHeavySnowId = i52;
        this.teWeatherCtrlHailId = i53;
        this.tePavementCtrlWaterAccumulationId = i54;
        this.tePavementCtrlSnowyRoadsId = i55;
        this.tePavementCtrlThinIceOnRoadId = i56;
        this.tePavementCtrlRoadSubsidenceId = i57;
        this.tePavementCtrlObstaclesOnRoadId = i58;
        this.tePavementCtrlSevereFiresId = i59;
        this.teActivitiesCtrlFairId = i60;
        this.teActivitiesCtrlNationalEventsId = i61;
        this.teActivitiesCtrlRallyId = i62;
        this.teActivitiesCtrlLargeMeetingsId = i63;
        this.teActivitiesCtrlSportsEventsId = i64;
        this.teActivitiesCtrlCulturalEventsId = i65;
        this.teActivitiesCtrlHolidaysId = i66;
        this.teDisasterCtrlFloodingId = i67;
        this.teDisasterCtrlMudslidesId = i68;
    }
}
