package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationStatus implements Serializable {
    private final ActiveGuidanceInfo activeGuidanceInfo;
    private final List<AlternativeRouteInfo> altRoutesRemainingInfo;
    private final List<RouteIndices> alternativeRouteIndices;
    private final BannerInstruction bannerInstruction;
    private final CorrectedLocationData correctedLocationData;
    private final FallbackReason fallbackReason;
    private final HdMatchingResult hdMatchingResult;
    private final boolean inParkingAisle;
    private final boolean inRoundabout;
    private final boolean inTunnel;
    private final Boolean isAdasDataAvailable;
    private final boolean isFallback;
    private final boolean isSyntheticLocation;
    private final List<FixLocation> keyPoints;
    private final Integer layer;
    private final String locatedAlternativeRouteId;
    private final FixLocation location;
    private final Date mapMatchedSystemTime;
    private final MapMatcherOutput mapMatcherOutput;
    private final int nextWaypointIndex;
    private final float offRoadProba;
    private final OffRoadStateProvider offRoadStateProvider;
    private final long predicted;
    private final RouteIndices primaryRouteIndices;
    private final List<RoadName> roads;
    private final RouteState routeState;
    private final SpeedLimit speedLimit;
    private final boolean stale;
    private final List<TurnLane> turnLanes;
    private final List<UpcomingRouteAlertUpdate> upcomingRouteAlertUpdates;
    private final VoiceInstruction voiceInstruction;

    public ActiveGuidanceInfo getActiveGuidanceInfo() {
        return this.activeGuidanceInfo;
    }

    public List<AlternativeRouteInfo> getAltRoutesRemainingInfo() {
        return this.altRoutesRemainingInfo;
    }

    public List<RouteIndices> getAlternativeRouteIndices() {
        return this.alternativeRouteIndices;
    }

    public BannerInstruction getBannerInstruction() {
        return this.bannerInstruction;
    }

    public CorrectedLocationData getCorrectedLocationData() {
        return this.correctedLocationData;
    }

    public FallbackReason getFallbackReason() {
        return this.fallbackReason;
    }

    public HdMatchingResult getHdMatchingResult() {
        return this.hdMatchingResult;
    }

    public boolean getInParkingAisle() {
        return this.inParkingAisle;
    }

    public boolean getInRoundabout() {
        return this.inRoundabout;
    }

    public boolean getInTunnel() {
        return this.inTunnel;
    }

    public Boolean getIsAdasDataAvailable() {
        return this.isAdasDataAvailable;
    }

    public boolean getIsFallback() {
        return this.isFallback;
    }

    public boolean getIsSyntheticLocation() {
        return this.isSyntheticLocation;
    }

    public List<FixLocation> getKeyPoints() {
        return this.keyPoints;
    }

    public Integer getLayer() {
        return this.layer;
    }

    public String getLocatedAlternativeRouteId() {
        return this.locatedAlternativeRouteId;
    }

    public FixLocation getLocation() {
        return this.location;
    }

    public Date getMapMatchedSystemTime() {
        return this.mapMatchedSystemTime;
    }

    public MapMatcherOutput getMapMatcherOutput() {
        return this.mapMatcherOutput;
    }

    public int getNextWaypointIndex() {
        return this.nextWaypointIndex;
    }

    public float getOffRoadProba() {
        return this.offRoadProba;
    }

    public OffRoadStateProvider getOffRoadStateProvider() {
        return this.offRoadStateProvider;
    }

    public long getPredicted() {
        return this.predicted;
    }

    public RouteIndices getPrimaryRouteIndices() {
        return this.primaryRouteIndices;
    }

    public List<RoadName> getRoads() {
        return this.roads;
    }

    public RouteState getRouteState() {
        return this.routeState;
    }

    public SpeedLimit getSpeedLimit() {
        return this.speedLimit;
    }

    public boolean getStale() {
        return this.stale;
    }

    public List<TurnLane> getTurnLanes() {
        return this.turnLanes;
    }

    public List<UpcomingRouteAlertUpdate> getUpcomingRouteAlertUpdates() {
        return this.upcomingRouteAlertUpdates;
    }

    public VoiceInstruction getVoiceInstruction() {
        return this.voiceInstruction;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        RouteState routeState = this.routeState;
        boolean z = this.stale;
        FixLocation fixLocation = this.location;
        boolean z2 = this.isFallback;
        FallbackReason fallbackReason = this.fallbackReason;
        boolean z3 = this.inTunnel;
        boolean z4 = this.inParkingAisle;
        boolean z5 = this.inRoundabout;
        long j = this.predicted;
        List<TurnLane> list = this.turnLanes;
        List<RoadName> list2 = this.roads;
        RouteIndices routeIndices = this.primaryRouteIndices;
        List<RouteIndices> list3 = this.alternativeRouteIndices;
        List<AlternativeRouteInfo> list4 = this.altRoutesRemainingInfo;
        String str = this.locatedAlternativeRouteId;
        VoiceInstruction voiceInstruction = this.voiceInstruction;
        BannerInstruction bannerInstruction = this.bannerInstruction;
        SpeedLimit speedLimit = this.speedLimit;
        List<FixLocation> list5 = this.keyPoints;
        MapMatcherOutput mapMatcherOutput = this.mapMatcherOutput;
        float f = this.offRoadProba;
        OffRoadStateProvider offRoadStateProvider = this.offRoadStateProvider;
        ActiveGuidanceInfo activeGuidanceInfo = this.activeGuidanceInfo;
        List<UpcomingRouteAlertUpdate> list6 = this.upcomingRouteAlertUpdates;
        int i = this.nextWaypointIndex;
        Integer num = this.layer;
        boolean z6 = this.isSyntheticLocation;
        return Objects.hash(routeState, Boolean.valueOf(z), fixLocation, Boolean.valueOf(z2), fallbackReason, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Long.valueOf(j), list, list2, routeIndices, list3, list4, str, voiceInstruction, bannerInstruction, speedLimit, list5, mapMatcherOutput, Float.valueOf(f), offRoadStateProvider, activeGuidanceInfo, list6, Integer.valueOf(i), num, Boolean.valueOf(z6), this.correctedLocationData, this.hdMatchingResult, this.mapMatchedSystemTime, this.isAdasDataAvailable);
    }

    public NavigationStatus(RouteState routeState, boolean z, FixLocation fixLocation, boolean z2, FallbackReason fallbackReason, boolean z3, boolean z4, boolean z5, long j, List<TurnLane> list, List<RoadName> list2, RouteIndices routeIndices, List<RouteIndices> list3, List<AlternativeRouteInfo> list4, String str, VoiceInstruction voiceInstruction, BannerInstruction bannerInstruction, SpeedLimit speedLimit, List<FixLocation> list5, MapMatcherOutput mapMatcherOutput, float f, OffRoadStateProvider offRoadStateProvider, ActiveGuidanceInfo activeGuidanceInfo, List<UpcomingRouteAlertUpdate> list6, int i, Integer num, boolean z6, CorrectedLocationData correctedLocationData, HdMatchingResult hdMatchingResult, Date date, Boolean bool) {
        this.routeState = routeState;
        this.stale = z;
        this.location = fixLocation;
        this.isFallback = z2;
        this.fallbackReason = fallbackReason;
        this.inTunnel = z3;
        this.inParkingAisle = z4;
        this.inRoundabout = z5;
        this.predicted = j;
        this.turnLanes = list;
        this.roads = list2;
        this.primaryRouteIndices = routeIndices;
        this.alternativeRouteIndices = list3;
        this.altRoutesRemainingInfo = list4;
        this.locatedAlternativeRouteId = str;
        this.voiceInstruction = voiceInstruction;
        this.bannerInstruction = bannerInstruction;
        this.speedLimit = speedLimit;
        this.keyPoints = list5;
        this.mapMatcherOutput = mapMatcherOutput;
        this.offRoadProba = f;
        this.offRoadStateProvider = offRoadStateProvider;
        this.activeGuidanceInfo = activeGuidanceInfo;
        this.upcomingRouteAlertUpdates = list6;
        this.nextWaypointIndex = i;
        this.layer = num;
        this.isSyntheticLocation = z6;
        this.correctedLocationData = correctedLocationData;
        this.hdMatchingResult = hdMatchingResult;
        this.mapMatchedSystemTime = date;
        this.isAdasDataAvailable = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[routeState: ");
        sb.append(RecordUtils.fieldToString(this.routeState));
        sb.append(", stale: ");
        MediaSessionCompatQueueItem.write(sb, this.stale, ", location: ");
        sb.append(RecordUtils.fieldToString(this.location));
        sb.append(", isFallback: ");
        MediaSessionCompatQueueItem.write(sb, this.isFallback, ", fallbackReason: ");
        sb.append(RecordUtils.fieldToString(this.fallbackReason));
        sb.append(", inTunnel: ");
        MediaSessionCompatQueueItem.write(sb, this.inTunnel, ", inParkingAisle: ");
        MediaSessionCompatQueueItem.write(sb, this.inParkingAisle, ", inRoundabout: ");
        MediaSessionCompatQueueItem.write(sb, this.inRoundabout, ", predicted: ");
        af$$ExternalSyntheticOutline1.m(this.predicted, ", turnLanes: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.turnLanes, ", roads: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.roads, ", primaryRouteIndices: ");
        sb.append(RecordUtils.fieldToString(this.primaryRouteIndices));
        sb.append(", alternativeRouteIndices: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.alternativeRouteIndices, ", altRoutesRemainingInfo: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.altRoutesRemainingInfo, ", locatedAlternativeRouteId: ");
        IconCompatParcelizer.read(sb, this.locatedAlternativeRouteId, ", voiceInstruction: ");
        sb.append(RecordUtils.fieldToString(this.voiceInstruction));
        sb.append(", bannerInstruction: ");
        sb.append(RecordUtils.fieldToString(this.bannerInstruction));
        sb.append(", speedLimit: ");
        sb.append(RecordUtils.fieldToString(this.speedLimit));
        sb.append(", keyPoints: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.keyPoints, ", mapMatcherOutput: ");
        sb.append(RecordUtils.fieldToString(this.mapMatcherOutput));
        sb.append(", offRoadProba: ");
        getBitmapFromCache.write(this.offRoadProba, ", offRoadStateProvider: ", sb);
        sb.append(RecordUtils.fieldToString(this.offRoadStateProvider));
        sb.append(", activeGuidanceInfo: ");
        sb.append(RecordUtils.fieldToString(this.activeGuidanceInfo));
        sb.append(", upcomingRouteAlertUpdates: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.upcomingRouteAlertUpdates, ", nextWaypointIndex: ");
        IconCompatParcelizer.write(this.nextWaypointIndex, ", layer: ", sb);
        SweepGradientShader9KIMszodefault.read(this.layer, ", isSyntheticLocation: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.isSyntheticLocation, ", correctedLocationData: ");
        sb.append(RecordUtils.fieldToString(this.correctedLocationData));
        sb.append(", hdMatchingResult: ");
        sb.append(RecordUtils.fieldToString(this.hdMatchingResult));
        sb.append(", mapMatchedSystemTime: ");
        sb.append(RecordUtils.fieldToString(this.mapMatchedSystemTime));
        sb.append(", isAdasDataAvailable: ");
        sb.append(RecordUtils.fieldToString(this.isAdasDataAvailable));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigationStatus navigationStatus = (NavigationStatus) obj;
        return Objects.equals(this.routeState, navigationStatus.routeState) && this.stale == navigationStatus.stale && Objects.equals(this.location, navigationStatus.location) && this.isFallback == navigationStatus.isFallback && Objects.equals(this.fallbackReason, navigationStatus.fallbackReason) && this.inTunnel == navigationStatus.inTunnel && this.inParkingAisle == navigationStatus.inParkingAisle && this.inRoundabout == navigationStatus.inRoundabout && this.predicted == navigationStatus.predicted && Objects.equals(this.turnLanes, navigationStatus.turnLanes) && Objects.equals(this.roads, navigationStatus.roads) && Objects.equals(this.primaryRouteIndices, navigationStatus.primaryRouteIndices) && Objects.equals(this.alternativeRouteIndices, navigationStatus.alternativeRouteIndices) && Objects.equals(this.altRoutesRemainingInfo, navigationStatus.altRoutesRemainingInfo) && Objects.equals(this.locatedAlternativeRouteId, navigationStatus.locatedAlternativeRouteId) && Objects.equals(this.voiceInstruction, navigationStatus.voiceInstruction) && Objects.equals(this.bannerInstruction, navigationStatus.bannerInstruction) && Objects.equals(this.speedLimit, navigationStatus.speedLimit) && Objects.equals(this.keyPoints, navigationStatus.keyPoints) && Objects.equals(this.mapMatcherOutput, navigationStatus.mapMatcherOutput) && PartialEq.compare(this.offRoadProba, navigationStatus.offRoadProba) && Objects.equals(this.offRoadStateProvider, navigationStatus.offRoadStateProvider) && Objects.equals(this.activeGuidanceInfo, navigationStatus.activeGuidanceInfo) && Objects.equals(this.upcomingRouteAlertUpdates, navigationStatus.upcomingRouteAlertUpdates) && this.nextWaypointIndex == navigationStatus.nextWaypointIndex && Objects.equals(this.layer, navigationStatus.layer) && this.isSyntheticLocation == navigationStatus.isSyntheticLocation && Objects.equals(this.correctedLocationData, navigationStatus.correctedLocationData) && Objects.equals(this.hdMatchingResult, navigationStatus.hdMatchingResult) && Objects.equals(this.mapMatchedSystemTime, navigationStatus.mapMatchedSystemTime) && Objects.equals(this.isAdasDataAvailable, navigationStatus.isAdasDataAvailable);
    }
}
