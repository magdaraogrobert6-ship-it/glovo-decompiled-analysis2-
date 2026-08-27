package com.mapbox.navigation.core.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.common.location.Location;
import com.mapbox.navigation.base.road.model.Road;
import com.mapbox.navigation.base.route.LegWaypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.speed.model.SpeedLimitInfo;
import com.mapbox.navigation.base.speed.model.SpeedLimitSign;
import com.mapbox.navigation.base.speed.model.SpeedUnit;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteProgressState;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.core.trip.session.location.CorrectedLocationData;
import com.mapbox.navigation.core.trip.session.location.DRSensorFusionState$WhenMappings;
import com.mapbox.navigation.core.trip.session.location.DRSensorFusionStatus;
import com.mapbox.navigation.navigator.internal.TripStatus;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.ActiveGuidanceInfo;
import com.mapbox.navigator.BannerInstruction;
import com.mapbox.navigator.DRSensorFusionState;
import com.mapbox.navigator.FixLocation;
import com.mapbox.navigator.GraphPosition;
import com.mapbox.navigator.MapMatch;
import com.mapbox.navigator.NavigationStatus;
import com.mapbox.navigator.RouteIdentifier;
import com.mapbox.navigator.RouteIndices;
import com.mapbox.navigator.RouteState;
import com.mapbox.navigator.SpeedLimitUnit;
import com.mapbox.navigator.VoiceInstruction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.SemanticRegionImpl;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigatorMapper {
    public static final LocationMatcherResult getLocationMatcherResult(TripStatus tripStatus, Location location, ArrayList arrayList, Road road) {
        SpeedUnit speedUnit;
        SpeedLimitSign speedLimitSign;
        CorrectedLocationData correctedLocationData;
        String str;
        GraphPosition position;
        NavigationStatus navigationStatus = tripStatus.navigationStatus;
        List<MapMatch> matches = navigationStatus.getMapMatcherOutput().getMatches();
        matches.getClass();
        MapMatch mapMatch = (MapMatch) onContentCardDismissed.MediaMetadataCompat((List) matches);
        boolean z = ((double) navigationStatus.getOffRoadProba()) > 0.5d;
        float offRoadProba = navigationStatus.getOffRoadProba();
        boolean isTeleport = navigationStatus.getMapMatcherOutput().getIsTeleport();
        int i = WhenMappings.$EnumSwitchMapping$1[navigationStatus.getSpeedLimit().getLocaleUnit().ordinal()];
        DRSensorFusionStatus dRSensorFusionStatus = null;
        if (i == 1) {
            speedUnit = SpeedUnit.KILOMETERS_PER_HOUR;
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            speedUnit = SpeedUnit.MILES_PER_HOUR;
        }
        com.mapbox.navigator.SpeedLimitSign localeSign = navigationStatus.getSpeedLimit().getLocaleSign();
        localeSign.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$2[localeSign.ordinal()];
        if (i2 == 1) {
            speedLimitSign = SpeedLimitSign.MUTCD;
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            speedLimitSign = SpeedLimitSign.VIENNA;
        }
        Integer speed = navigationStatus.getSpeedLimit().getSpeed();
        speedUnit.getClass();
        speedLimitSign.getClass();
        SpeedLimitInfo speedLimitInfo = new SpeedLimitInfo(speed, speedUnit, speedLimitSign);
        float proba = mapMatch != null ? mapMatch.getProba() : 0.0f;
        Long lValueOf = (mapMatch == null || (position = mapMatch.getPosition()) == null) ? null : Long.valueOf(position.getEdgeId());
        Integer layer = navigationStatus.getLayer();
        boolean isFallback = navigationStatus.getIsFallback();
        boolean inTunnel = navigationStatus.getInTunnel();
        com.mapbox.navigator.CorrectedLocationData correctedLocationData2 = navigationStatus.getCorrectedLocationData();
        if (correctedLocationData2 == null) {
            correctedLocationData = null;
        } else {
            FixLocation location2 = correctedLocationData2.getLocation();
            location2.getClass();
            Location location3 = LocationEx.toLocation(location2);
            boolean isStill = correctedLocationData2.getIsStill();
            com.mapbox.navigator.DRSensorFusionStatus drSensorFusionStatus = correctedLocationData2.getDrSensorFusionStatus();
            if (drSensorFusionStatus != null) {
                DRSensorFusionState state = drSensorFusionStatus.getState();
                state.getClass();
                int i3 = DRSensorFusionState$WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i3 == 1) {
                    str = "DISABLED";
                } else if (i3 == 2) {
                    str = "COLD_START";
                } else if (i3 == 3) {
                    str = "INITIALIZATION";
                } else if (i3 == 4) {
                    str = "NORMAL_OPERATION";
                } else {
                    if (i3 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    str = "FAILURE";
                }
                dRSensorFusionStatus = new DRSensorFusionStatus(str, drSensorFusionStatus.getProgressInitDistance(), drSensorFusionStatus.getProgressCorrectionBuckets());
            }
            correctedLocationData = new CorrectedLocationData(location3, isStill, dRSensorFusionStatus);
        }
        return new LocationMatcherResult(location, arrayList, z, offRoadProba, isTeleport, speedLimitInfo, proba, lValueOf, layer, road, isFallback, inTunnel, correctedLocationData, navigationStatus.getIsAdasDataAvailable());
    }

    /* JADX INFO: loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[RouteState.values().length];
            try {
                iArr[RouteState.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteState.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteState.TRACKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RouteState.OFF_ROUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RouteState.UNCERTAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SpeedLimitUnit.values().length];
            try {
                iArr2[SpeedLimitUnit.KILOMETRES_PER_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SpeedLimitUnit.MILES_PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.mapbox.navigator.SpeedLimitSign.values().length];
            try {
                iArr3[com.mapbox.navigator.SpeedLimitSign.MUTCD.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.mapbox.navigator.SpeedLimitSign.VIENNA.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final RouteProgress getRouteProgressFrom(NavigationRoute navigationRoute, NavigationStatus navigationStatus, int i, BannerInstructions bannerInstructions, Integer num, VoiceInstructions voiceInstructions, ArrayList arrayList, LegWaypoint legWaypoint) {
        RouteIndices primaryRouteIndices;
        RouteProgressState routeProgressState;
        List list;
        LegStep legStep;
        List list2;
        float f;
        float f2;
        float f3;
        double d;
        float f4;
        float distanceTraveled;
        RouteLeg routeLeg;
        float f5;
        float f6;
        double d2;
        float f7;
        LegStep legStep2;
        double d3;
        float f8;
        VoiceInstructions voiceInstructionsBuild;
        float remainingDistance;
        RouteLeg routeLeg2;
        float fractionTraveled;
        float remainingDistance2;
        double remainingDuration;
        double remainingDuration2;
        float fractionTraveled2;
        float f9;
        float f10;
        LegStep legStep3;
        float f11;
        List list3;
        float remainingDistance3;
        LegStep legStep4;
        double remainingDuration3;
        List list4;
        LegStep legStep5;
        float fractionTraveled3;
        float distanceTraveled2;
        LegStep legStep6;
        RouteProgressState routeProgressState2;
        navigationRoute.getClass();
        if (navigationStatus.getRouteState() == RouteState.INVALID || (primaryRouteIndices = navigationStatus.getPrimaryRouteIndices()) == null) {
            return null;
        }
        int stepIndex = primaryRouteIndices.getStepIndex() + 1;
        RouteProgressState routeProgressState3 = RouteProgressState.INITIALIZED;
        DirectionsRoute directionsRoute = navigationRoute.directionsRoute;
        List<RouteLeg> listLegs = directionsRoute.legs();
        ActiveGuidanceInfo activeGuidanceInfo = navigationStatus.getActiveGuidanceInfo();
        if (listLegs == null || activeGuidanceInfo == null) {
            routeProgressState = routeProgressState3;
            list = null;
            legStep = null;
            list2 = null;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            d = 0.0d;
            f4 = 0.0f;
            distanceTraveled = 0.0f;
            routeLeg = null;
            f5 = 0.0f;
            f6 = 0.0f;
            d2 = 0.0d;
            f7 = 0.0f;
            legStep2 = null;
            d3 = 0.0d;
            f8 = 0.0f;
        } else {
            if (primaryRouteIndices.getLegIndex() < listLegs.size()) {
                routeLeg2 = listLegs.get(primaryRouteIndices.getLegIndex());
                float distanceTraveled3 = (float) activeGuidanceInfo.getLegProgress().getDistanceTraveled();
                fractionTraveled = (float) activeGuidanceInfo.getLegProgress().getFractionTraveled();
                f9 = distanceTraveled3;
                remainingDistance2 = (float) activeGuidanceInfo.getLegProgress().getRemainingDistance();
                remainingDuration = activeGuidanceInfo.getLegProgress().getRemainingDuration() / 1000.0d;
                distanceTraveled = (float) activeGuidanceInfo.getRouteProgress().getDistanceTraveled();
                remainingDistance = (float) activeGuidanceInfo.getRouteProgress().getRemainingDistance();
                remainingDuration2 = activeGuidanceInfo.getRouteProgress().getRemainingDuration() / 1000.0d;
                fractionTraveled2 = (float) activeGuidanceInfo.getRouteProgress().getFractionTraveled();
            } else {
                distanceTraveled = 0.0f;
                remainingDistance = 0.0f;
                routeLeg2 = null;
                fractionTraveled = 0.0f;
                remainingDistance2 = 0.0f;
                remainingDuration = 0.0d;
                remainingDuration2 = 0.0d;
                fractionTraveled2 = 0.0f;
                f9 = 0.0f;
            }
            RouteLeg routeLeg3 = routeLeg2;
            List<LegStep> listSteps = routeLeg3 != null ? routeLeg3.steps() : null;
            if (listSteps != null) {
                if (primaryRouteIndices.getStepIndex() < listSteps.size()) {
                    LegStep legStep7 = listSteps.get(primaryRouteIndices.getStepIndex());
                    LegStep legStep8 = legStep7;
                    List listStepGeometryToPoints = legStep8.geometry() != null ? DecodeUtils.stepGeometryToPoints(directionsRoute, legStep8) : null;
                    RouteState routeState = navigationStatus.getRouteState();
                    routeState.getClass();
                    switch (WhenMappings.$EnumSwitchMapping$0[routeState.ordinal()]) {
                        case 1:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid route progress state not supported");
                            return null;
                        case 2:
                            routeProgressState2 = routeProgressState3;
                            break;
                        case 3:
                            routeProgressState2 = RouteProgressState.TRACKING;
                            break;
                        case 4:
                            routeProgressState2 = RouteProgressState.COMPLETE;
                            break;
                        case 5:
                            routeProgressState2 = RouteProgressState.OFF_ROUTE;
                            break;
                        case 6:
                            routeProgressState2 = RouteProgressState.UNCERTAIN;
                            break;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                    }
                    legStep5 = legStep7;
                    list4 = listStepGeometryToPoints;
                    distanceTraveled2 = (float) activeGuidanceInfo.getStepProgress().getDistanceTraveled();
                    routeProgressState = routeProgressState2;
                    fractionTraveled3 = (float) activeGuidanceInfo.getStepProgress().getFractionTraveled();
                } else {
                    legStep5 = null;
                    list4 = null;
                    routeProgressState = routeProgressState3;
                    fractionTraveled3 = 0.0f;
                    distanceTraveled2 = 0.0f;
                }
                if (stepIndex < listSteps.size()) {
                    legStep6 = listSteps.get(stepIndex);
                    List listStepGeometryToPoints2 = legStep6.geometry() != null ? DecodeUtils.stepGeometryToPoints(directionsRoute, legStep6) : null;
                    LegStep legStep9 = legStep6;
                    list3 = listStepGeometryToPoints2;
                    float f12 = fractionTraveled3;
                    remainingDistance3 = (float) activeGuidanceInfo.getStepProgress().getRemainingDistance();
                    f11 = distanceTraveled2;
                    remainingDuration3 = activeGuidanceInfo.getStepProgress().getRemainingDuration() / 1000.0d;
                    f10 = f12;
                    legStep3 = legStep9;
                    legStep4 = legStep5;
                } else {
                    legStep6 = null;
                }
                LegStep legStep10 = legStep6;
                list3 = listStepGeometryToPoints2;
                float f13 = fractionTraveled3;
                remainingDistance3 = (float) activeGuidanceInfo.getStepProgress().getRemainingDistance();
                f11 = distanceTraveled2;
                remainingDuration3 = activeGuidanceInfo.getStepProgress().getRemainingDuration() / 1000.0d;
                f10 = f13;
                legStep3 = legStep10;
                legStep4 = legStep5;
            } else {
                routeProgressState = routeProgressState3;
                f10 = 0.0f;
                legStep3 = null;
                f11 = 0.0f;
                list3 = null;
                remainingDistance3 = 0.0f;
                legStep4 = null;
                remainingDuration3 = 0.0d;
                list4 = null;
            }
            legStep2 = legStep3;
            f7 = fractionTraveled;
            d3 = remainingDuration2;
            f8 = fractionTraveled2;
            f = remainingDistance3;
            f5 = f9;
            legStep = legStep4;
            f4 = remainingDistance;
            f3 = f10;
            f2 = f11;
            routeLeg = routeLeg2;
            d2 = remainingDuration;
            list = list3;
            d = remainingDuration3;
            list2 = list4;
            f6 = remainingDistance2;
        }
        RouteLegProgress routeLegProgress = new RouteLegProgress(primaryRouteIndices.getLegIndex(), routeLeg, f5, f6, d2, f7, new RouteStepProgress(primaryRouteIndices.getStepIndex(), primaryRouteIndices.getIntersectionIndex(), num, legStep, list2, f, f2, f3, d), legStep2, primaryRouteIndices.getLegShapeIndex(), legWaypoint);
        List<RouteIndices> alternativeRouteIndices = navigationStatus.getAlternativeRouteIndices();
        alternativeRouteIndices.getClass();
        List<RouteIndices> list5 = alternativeRouteIndices;
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list5, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (RouteIndices routeIndices : list5) {
            RouteIdentifier routeId = routeIndices.getRouteId();
            routeId.getClass();
            String routeIdString = routeId.toRouteIdString();
            routeIdString.getClass();
            linkedHashMap.put(routeIdString, new com.mapbox.navigation.base.internal.trip.model.RouteIndices(routeIndices.getLegIndex(), routeIndices.getStepIndex(), routeIndices.getGeometryIndex(), routeIndices.getLegShapeIndex(), routeIndices.getIntersectionIndex(), routeIndices.getIsForkPointPassed()));
        }
        VoiceInstruction voiceInstruction = navigationStatus.getVoiceInstruction();
        VoiceInstructions voiceInstructions2 = (voiceInstruction == null || (voiceInstructionsBuild = VoiceInstructions.builder().announcement(voiceInstruction.getAnnouncement()).distanceAlongGeometry(Double.valueOf((double) voiceInstruction.getRemainingStepDistance())).ssmlAnnouncement(voiceInstruction.getSsmlAnnouncement()).build()) == null) ? voiceInstructions : voiceInstructionsBuild;
        boolean inTunnel = navigationStatus.getInTunnel();
        boolean stale = navigationStatus.getStale();
        String locatedAlternativeRouteId = navigationStatus.getLocatedAlternativeRouteId();
        int geometryIndex = primaryRouteIndices.getGeometryIndex();
        boolean inParkingAisle = navigationStatus.getInParkingAisle();
        routeProgressState.getClass();
        return new RouteProgress(navigationRoute, bannerInstructions, voiceInstructions2, routeProgressState, routeLegProgress, list, inTunnel, f4, distanceTraveled, d3, f8, i, arrayList, stale, locatedAlternativeRouteId, geometryIndex, inParkingAisle, linkedHashMap);
    }

    public static final BannerInstructions getCurrentBannerInstructions(NavigationRoute navigationRoute, NavigationStatus navigationStatus) {
        List<RouteLeg> listLegs;
        BannerInstruction bannerInstruction = navigationStatus.getBannerInstruction();
        RouteIndices primaryRouteIndices = navigationStatus.getPrimaryRouteIndices();
        if (navigationRoute != null && bannerInstruction != null && primaryRouteIndices != null && (listLegs = navigationRoute.directionsRoute.legs()) != null) {
            int legIndex = primaryRouteIndices.getLegIndex();
            int stepIndex = primaryRouteIndices.getStepIndex();
            if (listLegs.isEmpty()) {
                LoggerProviderKt.logW("Legs cannot be null or empty", "NavigatorMapper");
                return null;
            }
            if (legIndex < 0 || legIndex >= listLegs.size()) {
                LoggerProviderKt.logW("Leg index should be in [0; " + listLegs.size() + ')', "NavigatorMapper");
            } else {
                List<LegStep> listSteps = listLegs.get(primaryRouteIndices.getLegIndex()).steps();
                if (listSteps != null) {
                    if (listSteps.isEmpty()) {
                        LoggerProviderKt.logW("Steps cannot be null or empty", "NavigatorMapper");
                        return null;
                    }
                    if (stepIndex < 0 || stepIndex >= listSteps.size()) {
                        LoggerProviderKt.logW("Step index should be in [0; " + listSteps.size() + ')', "NavigatorMapper");
                        return null;
                    }
                    List<BannerInstructions> listBannerInstructions = listSteps.get(primaryRouteIndices.getStepIndex()).bannerInstructions();
                    if (listBannerInstructions != null) {
                        int index = bannerInstruction.getIndex();
                        if (listBannerInstructions.isEmpty() || index < 0 || index >= listBannerInstructions.size()) {
                            LoggerProviderKt.logW("Banners cannot be null, empty or out of bounds, and index should be less than " + listBannerInstructions.size() + " got " + index + " for route " + navigationRoute.id, "NavigatorMapper");
                        }
                        BannerInstructions bannerInstructions = listBannerInstructions.get(index);
                        bannerInstructions.getClass();
                        BannerInstructions bannerInstructions2 = bannerInstructions;
                        return bannerInstructions2 instanceof SemanticRegionImpl ? BannerInstructions.builder().distanceAlongGeometry(bannerInstruction.getRemainingStepDistance()).sub(bannerInstructions2.sub()).primary(bannerInstructions2.primary()).secondary(bannerInstructions2.secondary()).view(bannerInstructions2.view()).build() : bannerInstructions2.toBuilder().distanceAlongGeometry(bannerInstruction.getRemainingStepDistance()).build();
                    }
                }
            }
        }
        return null;
    }
}
