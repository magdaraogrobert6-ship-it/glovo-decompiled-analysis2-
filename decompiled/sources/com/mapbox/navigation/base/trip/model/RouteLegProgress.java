package com.mapbox.navigation.base.trip.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.route.LegWaypoint;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLegProgress {
    public final RouteStepProgress currentStepProgress;
    public final float distanceRemaining;
    public final float distanceTraveled;
    public final double durationRemaining;
    public final float fractionTraveled;
    public final int geometryIndex;
    public final LegWaypoint legDestination;
    public final int legIndex;
    public final RouteLeg routeLeg;
    public final LegStep upcomingStep;

    public RouteLegProgress(int i, RouteLeg routeLeg, float f, float f2, double d, float f3, RouteStepProgress routeStepProgress, LegStep legStep, int i2, LegWaypoint legWaypoint) {
        this.legIndex = i;
        this.routeLeg = routeLeg;
        this.distanceTraveled = f;
        this.distanceRemaining = f2;
        this.durationRemaining = d;
        this.fractionTraveled = f3;
        this.currentStepProgress = routeStepProgress;
        this.upcomingStep = legStep;
        this.geometryIndex = i2;
        this.legDestination = legWaypoint;
    }

    public final String toString() {
        return "RouteLegProgress(legIndex=" + this.legIndex + ", routeLeg=" + this.routeLeg + ", distanceTraveled=" + this.distanceTraveled + ", distanceRemaining=" + this.distanceRemaining + ", durationRemaining=" + this.durationRemaining + ", fractionTraveled=" + this.fractionTraveled + ", currentStepProgress=" + this.currentStepProgress + ", upcomingStep=" + this.upcomingStep + ", geometryIndex=" + this.geometryIndex + ", legDestination=" + this.legDestination + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLegProgress.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLegProgress routeLegProgress = (RouteLegProgress) obj;
        if (this.legIndex != routeLegProgress.legIndex) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLeg, routeLegProgress.routeLeg}, getCieXyz.write())).booleanValue() || this.distanceTraveled != routeLegProgress.distanceTraveled || this.distanceRemaining != routeLegProgress.distanceRemaining || this.durationRemaining != routeLegProgress.durationRemaining || this.fractionTraveled != routeLegProgress.fractionTraveled || !this.currentStepProgress.equals(routeLegProgress.currentStepProgress)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.upcomingStep, routeLegProgress.upcomingStep}, getCieXyz.write())).booleanValue() || this.geometryIndex != routeLegProgress.geometryIndex) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.legDestination, routeLegProgress.legDestination}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        int i = this.legIndex;
        RouteLeg routeLeg = this.routeLeg;
        int iM = af$$ExternalSyntheticOutline1.m(this.fractionTraveled, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.durationRemaining, af$$ExternalSyntheticOutline1.m(this.distanceRemaining, af$$ExternalSyntheticOutline1.m(this.distanceTraveled, ((i * 31) + (routeLeg != null ? routeLeg.hashCode() : 0)) * 31, 31), 31), 31), 31);
        int iHashCode = this.currentStepProgress.hashCode();
        LegStep legStep = this.upcomingStep;
        int iM2 = af$$ExternalSyntheticOutline0.m(this.geometryIndex, (((iHashCode + iM) * 31) + (legStep != null ? legStep.hashCode() : 0)) * 31, 31);
        LegWaypoint legWaypoint = this.legDestination;
        return iM2 + (legWaypoint != null ? legWaypoint.hashCode() : 0);
    }
}
