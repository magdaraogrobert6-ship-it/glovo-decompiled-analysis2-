package com.mapbox.navigation.base.trip.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.navigation.base.route.NavigationRoute;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteProgress {
    public final LinkedHashMap alternativeRoutesIndices;
    public final BannerInstructions bannerInstructions;
    public final RouteLegProgress currentLegProgress;
    public final int currentRouteGeometryIndex;
    public final RouteProgressState currentState;
    public final float distanceRemaining;
    public final float distanceTraveled;
    public final double durationRemaining;
    public final float fractionTraveled;
    public final boolean inParkingAisle;
    public final boolean inTunnel;
    public final NavigationRoute navigationRoute;
    public final int remainingWaypoints;
    public final String routeAlternativeId;
    public final boolean stale;
    public final ArrayList upcomingRoadObjects;
    public final List upcomingStepPoints;
    public final VoiceInstructions voiceInstructions;

    public final int hashCode() {
        int iHashCode = this.navigationRoute.hashCode();
        BannerInstructions bannerInstructions = this.bannerInstructions;
        int iHashCode2 = bannerInstructions != null ? bannerInstructions.hashCode() : 0;
        VoiceInstructions voiceInstructions = this.voiceInstructions;
        int iHashCode3 = voiceInstructions != null ? voiceInstructions.hashCode() : 0;
        int iHashCode4 = this.currentState.hashCode();
        int iHashCode5 = this.currentLegProgress.hashCode();
        List list = this.upcomingStepPoints;
        int iM = d$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.upcomingRoadObjects, (af$$ExternalSyntheticOutline1.m(this.fractionTraveled, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.durationRemaining, af$$ExternalSyntheticOutline1.m(this.distanceTraveled, af$$ExternalSyntheticOutline1.m(this.distanceRemaining, d$$ExternalSyntheticOutline0.m((((iHashCode5 + ((iHashCode4 + (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31)) * 31)) * 31) + (list != null ? list.hashCode() : 0)) * 31, 31, this.inTunnel), 31), 31), 31), 31) + this.remainingWaypoints) * 31, 31), 31, this.stale);
        String str = this.routeAlternativeId;
        return this.alternativeRoutesIndices.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.currentRouteGeometryIndex, (iM + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.inParkingAisle);
    }

    public RouteProgress(NavigationRoute navigationRoute, BannerInstructions bannerInstructions, VoiceInstructions voiceInstructions, RouteProgressState routeProgressState, RouteLegProgress routeLegProgress, List list, boolean z, float f, float f2, double d, float f3, int i, ArrayList arrayList, boolean z2, String str, int i2, boolean z3, LinkedHashMap linkedHashMap) {
        navigationRoute.getClass();
        this.navigationRoute = navigationRoute;
        this.bannerInstructions = bannerInstructions;
        this.voiceInstructions = voiceInstructions;
        this.currentState = routeProgressState;
        this.currentLegProgress = routeLegProgress;
        this.upcomingStepPoints = list;
        this.inTunnel = z;
        this.distanceRemaining = f;
        this.distanceTraveled = f2;
        this.durationRemaining = d;
        this.fractionTraveled = f3;
        this.remainingWaypoints = i;
        this.upcomingRoadObjects = arrayList;
        this.stale = z2;
        this.routeAlternativeId = str;
        this.currentRouteGeometryIndex = i2;
        this.inParkingAisle = z3;
        this.alternativeRoutesIndices = linkedHashMap;
    }

    public final String toString() {
        return "RouteProgress(navigationRoute=" + this.navigationRoute + ", currentState=" + this.currentState + ", inTunnel=" + this.inTunnel + ", distanceRemaining=" + this.distanceRemaining + ", distanceTraveled=" + this.distanceTraveled + ", durationRemaining=" + this.durationRemaining + ", fractionTraveled=" + this.fractionTraveled + ", stale=" + this.stale + ", routeAlternativeId=" + this.routeAlternativeId + ", currentRouteGeometryIndex=" + this.currentRouteGeometryIndex + ", currentLegProgress=" + this.currentLegProgress + ", bannerInstructions=" + this.bannerInstructions + ", voiceInstructions=" + this.voiceInstructions + ", upcomingStepPoints=" + this.upcomingStepPoints + ", remainingWaypoints=" + this.remainingWaypoints + ", upcomingRoadObjects=" + this.upcomingRoadObjects + "isParkingAisle=" + this.inParkingAisle + "alternativeRoutesIndices=" + this.alternativeRoutesIndices + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteProgress.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteProgress routeProgress = (RouteProgress) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.navigationRoute, routeProgress.navigationRoute}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bannerInstructions, routeProgress.bannerInstructions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.voiceInstructions, routeProgress.voiceInstructions}, getCieXyz.write())).booleanValue() || this.currentState != routeProgress.currentState || !this.currentLegProgress.equals(routeProgress.currentLegProgress)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.upcomingStepPoints, routeProgress.upcomingStepPoints}, getCieXyz.write())).booleanValue() || this.inTunnel != routeProgress.inTunnel || this.distanceRemaining != routeProgress.distanceRemaining || this.distanceTraveled != routeProgress.distanceTraveled || this.durationRemaining != routeProgress.durationRemaining || this.fractionTraveled != routeProgress.fractionTraveled || this.remainingWaypoints != routeProgress.remainingWaypoints || !this.upcomingRoadObjects.equals(routeProgress.upcomingRoadObjects) || this.stale != routeProgress.stale) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeAlternativeId, routeProgress.routeAlternativeId}, getCieXyz.write())).booleanValue() && this.currentRouteGeometryIndex == routeProgress.currentRouteGeometryIndex && this.inParkingAisle == routeProgress.inParkingAisle && this.alternativeRoutesIndices.equals(routeProgress.alternativeRoutesIndices);
    }
}
