package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class HdMatchingResult implements Serializable {
    private final CorrectedLocationData correctedLocationData;
    private final boolean inTunnel;
    private final boolean isOnRoad;
    private final boolean isTeleport;
    private final LaneGroupMatching laneGroupMatching;
    private final LaneMatching laneMatching;
    private final float offRoadProbability;
    private final HDOffRoadStateProvider offRoadStateProvider;
    private final RoutesLaneGuidance routesLaneGuidance;
    private final int totalCandidatesCount;

    public CorrectedLocationData getCorrectedLocationData() {
        return this.correctedLocationData;
    }

    public boolean getInTunnel() {
        return this.inTunnel;
    }

    public boolean getIsOnRoad() {
        return this.isOnRoad;
    }

    public boolean getIsTeleport() {
        return this.isTeleport;
    }

    public LaneGroupMatching getLaneGroupMatching() {
        return this.laneGroupMatching;
    }

    public LaneMatching getLaneMatching() {
        return this.laneMatching;
    }

    public float getOffRoadProbability() {
        return this.offRoadProbability;
    }

    public HDOffRoadStateProvider getOffRoadStateProvider() {
        return this.offRoadStateProvider;
    }

    public RoutesLaneGuidance getRoutesLaneGuidance() {
        return this.routesLaneGuidance;
    }

    public int getTotalCandidatesCount() {
        return this.totalCandidatesCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        LaneGroupMatching laneGroupMatching = this.laneGroupMatching;
        LaneMatching laneMatching = this.laneMatching;
        boolean z = this.isTeleport;
        boolean z2 = this.isOnRoad;
        float f = this.offRoadProbability;
        HDOffRoadStateProvider hDOffRoadStateProvider = this.offRoadStateProvider;
        RoutesLaneGuidance routesLaneGuidance = this.routesLaneGuidance;
        boolean z3 = this.inTunnel;
        return Objects.hash(laneGroupMatching, laneMatching, Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f), hDOffRoadStateProvider, routesLaneGuidance, Boolean.valueOf(z3), this.correctedLocationData, Integer.valueOf(this.totalCandidatesCount));
    }

    public HdMatchingResult(LaneGroupMatching laneGroupMatching, LaneMatching laneMatching, boolean z, boolean z2, float f, HDOffRoadStateProvider hDOffRoadStateProvider, RoutesLaneGuidance routesLaneGuidance, boolean z3, CorrectedLocationData correctedLocationData, int i) {
        this.laneGroupMatching = laneGroupMatching;
        this.laneMatching = laneMatching;
        this.isTeleport = z;
        this.isOnRoad = z2;
        this.offRoadProbability = f;
        this.offRoadStateProvider = hDOffRoadStateProvider;
        this.routesLaneGuidance = routesLaneGuidance;
        this.inTunnel = z3;
        this.correctedLocationData = correctedLocationData;
        this.totalCandidatesCount = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneGroupMatching: ");
        sb.append(RecordUtils.fieldToString(this.laneGroupMatching));
        sb.append(", laneMatching: ");
        sb.append(RecordUtils.fieldToString(this.laneMatching));
        sb.append(", isTeleport: ");
        MediaSessionCompatQueueItem.write(sb, this.isTeleport, ", isOnRoad: ");
        MediaSessionCompatQueueItem.write(sb, this.isOnRoad, ", offRoadProbability: ");
        getBitmapFromCache.write(this.offRoadProbability, ", offRoadStateProvider: ", sb);
        sb.append(RecordUtils.fieldToString(this.offRoadStateProvider));
        sb.append(", routesLaneGuidance: ");
        sb.append(RecordUtils.fieldToString(this.routesLaneGuidance));
        sb.append(", inTunnel: ");
        MediaSessionCompatQueueItem.write(sb, this.inTunnel, ", correctedLocationData: ");
        sb.append(RecordUtils.fieldToString(this.correctedLocationData));
        sb.append(", totalCandidatesCount: ");
        return SweepGradientShader9KIMszodefault.serializer(this.totalCandidatesCount, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HdMatchingResult hdMatchingResult = (HdMatchingResult) obj;
        return Objects.equals(this.laneGroupMatching, hdMatchingResult.laneGroupMatching) && Objects.equals(this.laneMatching, hdMatchingResult.laneMatching) && this.isTeleport == hdMatchingResult.isTeleport && this.isOnRoad == hdMatchingResult.isOnRoad && PartialEq.compare(this.offRoadProbability, hdMatchingResult.offRoadProbability) && Objects.equals(this.offRoadStateProvider, hdMatchingResult.offRoadStateProvider) && Objects.equals(this.routesLaneGuidance, hdMatchingResult.routesLaneGuidance) && this.inTunnel == hdMatchingResult.inTunnel && Objects.equals(this.correctedLocationData, hdMatchingResult.correctedLocationData) && this.totalCandidatesCount == hdMatchingResult.totalCandidatesCount;
    }
}
