package com.mapbox.navigation.core.trip.session;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.common.location.Location;
import com.mapbox.navigation.base.road.model.Road;
import com.mapbox.navigation.base.speed.model.SpeedLimitInfo;
import com.mapbox.navigation.core.trip.session.location.CorrectedLocationData;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationMatcherResult {
    public final CorrectedLocationData correctedLocationData;
    public final Location enhancedLocation;
    public final boolean inTunnel;
    public final Boolean isAdasDataAvailable;
    public final boolean isDegradedMapMatching;
    public final boolean isOffRoad;
    public final boolean isTeleport;
    public final ArrayList keyPoints;
    public final float offRoadProbability;
    public final Road road;
    public final Long roadEdgeId;
    public final float roadEdgeMatchProbability;
    public final SpeedLimitInfo speedLimitInfo;
    public final Integer zLevel;

    public final Location getEnhancedLocation() {
        return this.enhancedLocation;
    }

    public final List getKeyPoints() {
        return this.keyPoints;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.roadEdgeMatchProbability, (this.speedLimitInfo.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline1.m(this.offRoadProbability, d$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.keyPoints, this.enhancedLocation.hashCode() * 31, 31), 31, this.isOffRoad), 31), 31, this.isTeleport)) * 31, 31);
        Long l = this.roadEdgeId;
        int iM2 = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.road.components, (iM + (l != null ? l.hashCode() : 0)) * 31, 31), 31, this.isDegradedMapMatching), 31, this.inTunnel);
        CorrectedLocationData correctedLocationData = this.correctedLocationData;
        int iHashCode = correctedLocationData != null ? correctedLocationData.hashCode() : 0;
        Boolean bool = this.isAdasDataAvailable;
        return ((iM2 + iHashCode) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public LocationMatcherResult(Location location, ArrayList arrayList, boolean z, float f, boolean z2, SpeedLimitInfo speedLimitInfo, float f2, Long l, Integer num, Road road, boolean z3, boolean z4, CorrectedLocationData correctedLocationData, Boolean bool) {
        this.enhancedLocation = location;
        this.keyPoints = arrayList;
        this.isOffRoad = z;
        this.offRoadProbability = f;
        this.isTeleport = z2;
        this.speedLimitInfo = speedLimitInfo;
        this.roadEdgeMatchProbability = f2;
        this.roadEdgeId = l;
        this.zLevel = num;
        this.road = road;
        this.isDegradedMapMatching = z3;
        this.inTunnel = z4;
        this.correctedLocationData = correctedLocationData;
        this.isAdasDataAvailable = bool;
    }

    public final String toString() {
        return "LocationMatcherResult(enhancedLocation=" + this.enhancedLocation + ", keyPoints=" + this.keyPoints + ", isOffRoad=" + this.isOffRoad + ", offRoadProbability=" + this.offRoadProbability + ", isTeleport=" + this.isTeleport + ", speedLimitInfo=" + this.speedLimitInfo + ", roadEdgeMatchProbability=" + this.roadEdgeMatchProbability + ", roadEdgeId=" + this.roadEdgeId + ", road=" + this.road + ", isDegradedMapMatching=" + this.isDegradedMapMatching + ", inTunnel=" + this.inTunnel + ", correctedLocationData=" + this.correctedLocationData + ", isAdasDataAvailable=" + this.isAdasDataAvailable + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationMatcherResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LocationMatcherResult locationMatcherResult = (LocationMatcherResult) obj;
        if (!this.enhancedLocation.equals(locationMatcherResult.enhancedLocation) || !this.keyPoints.equals(locationMatcherResult.keyPoints) || this.isOffRoad != locationMatcherResult.isOffRoad || this.offRoadProbability != locationMatcherResult.offRoadProbability || this.isTeleport != locationMatcherResult.isTeleport || !this.speedLimitInfo.equals(locationMatcherResult.speedLimitInfo) || this.roadEdgeMatchProbability != locationMatcherResult.roadEdgeMatchProbability) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roadEdgeId, locationMatcherResult.roadEdgeId}, getCieXyz.write())).booleanValue() || !this.road.equals(locationMatcherResult.road) || this.isDegradedMapMatching != locationMatcherResult.isDegradedMapMatching || this.inTunnel != locationMatcherResult.inTunnel) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.correctedLocationData, locationMatcherResult.correctedLocationData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isAdasDataAvailable, locationMatcherResult.isAdasDataAvailable}, getCieXyz.write())).booleanValue();
    }
}
