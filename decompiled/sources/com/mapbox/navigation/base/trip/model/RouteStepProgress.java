package com.mapbox.navigation.base.trip.model;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.LegStep;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteStepProgress {
    public final float distanceRemaining;
    public final float distanceTraveled;
    public final double durationRemaining;
    public final float fractionTraveled;
    public final Integer instructionIndex;
    public final int intersectionIndex;
    public final LegStep step;
    public final int stepIndex;
    public final List stepPoints;

    public RouteStepProgress(int i, int i2, Integer num, LegStep legStep, List list, float f, float f2, float f3, double d) {
        this.stepIndex = i;
        this.intersectionIndex = i2;
        this.instructionIndex = num;
        this.step = legStep;
        this.stepPoints = list;
        this.distanceRemaining = f;
        this.distanceTraveled = f2;
        this.fractionTraveled = f3;
        this.durationRemaining = d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteStepProgress(stepIndex=");
        sb.append(this.stepIndex);
        sb.append(", intersectionIndex=");
        sb.append(this.intersectionIndex);
        sb.append(", instructionIndex=");
        sb.append(this.instructionIndex);
        sb.append(", step=");
        sb.append(this.step);
        sb.append(", stepPoints=");
        sb.append(this.stepPoints);
        sb.append(", distanceRemaining=");
        sb.append(this.distanceRemaining);
        sb.append(", distanceTraveled=");
        sb.append(this.distanceTraveled);
        sb.append(", fractionTraveled=");
        sb.append(this.fractionTraveled);
        sb.append(", durationRemaining=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.durationRemaining, ')');
    }

    public final int hashCode() {
        int i = this.stepIndex;
        int i2 = this.intersectionIndex;
        Integer num = this.instructionIndex;
        int iHashCode = num != null ? num.hashCode() : 0;
        LegStep legStep = this.step;
        int iHashCode2 = legStep != null ? legStep.hashCode() : 0;
        List list = this.stepPoints;
        return Double.hashCode(this.durationRemaining) + af$$ExternalSyntheticOutline1.m(this.fractionTraveled, af$$ExternalSyntheticOutline1.m(this.distanceTraveled, af$$ExternalSyntheticOutline1.m(this.distanceRemaining, ((((((((i * 31) + i2) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteStepProgress.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteStepProgress routeStepProgress = (RouteStepProgress) obj;
        if (this.stepIndex != routeStepProgress.stepIndex || this.intersectionIndex != routeStepProgress.intersectionIndex) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.instructionIndex, routeStepProgress.instructionIndex}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.step, routeStepProgress.step}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stepPoints, routeStepProgress.stepPoints}, getCieXyz.write())).booleanValue() && this.distanceRemaining == routeStepProgress.distanceRemaining && this.distanceTraveled == routeStepProgress.distanceTraveled && this.fractionTraveled == routeStepProgress.fractionTraveled && this.durationRemaining == routeStepProgress.durationRemaining;
    }
}
