package com.mapbox.navigation.tripdata.maneuver.model;

import com.mapbox.geojson.Point;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Maneuver {
    public final Lane laneGuidance;
    public final Point maneuverPoint;
    public final PrimaryManeuver primary;
    public final SecondaryManeuver secondary;
    public final StepDistance stepDistance;
    public final SubManeuver sub;

    public final int hashCode() {
        int iHashCode = this.primary.hashCode();
        SecondaryManeuver secondaryManeuver = this.secondary;
        int iHashCode2 = secondaryManeuver != null ? secondaryManeuver.hashCode() : 0;
        SubManeuver subManeuver = this.sub;
        int iHashCode3 = subManeuver != null ? subManeuver.hashCode() : 0;
        Lane lane = this.laneGuidance;
        return this.maneuverPoint.hashCode() + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (lane != null ? lane.allLanes.hashCode() : 0)) * 31);
    }

    public Maneuver(PrimaryManeuver primaryManeuver, StepDistance stepDistance, SecondaryManeuver secondaryManeuver, SubManeuver subManeuver, Lane lane, Point point) {
        this.primary = primaryManeuver;
        this.stepDistance = stepDistance;
        this.secondary = secondaryManeuver;
        this.sub = subManeuver;
        this.laneGuidance = lane;
        this.maneuverPoint = point;
    }

    public final String toString() {
        return "Maneuver(primary=" + this.primary + ", stepDistance=" + this.stepDistance + ", secondary=" + this.secondary + ", sub=" + this.sub + ", laneGuidance=" + this.laneGuidance + ", maneuverPoint=" + this.maneuverPoint + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Maneuver.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Maneuver maneuver = (Maneuver) obj;
        if (!this.primary.equals(maneuver.primary)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.secondary, maneuver.secondary}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sub, maneuver.sub}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.laneGuidance, maneuver.laneGuidance}, getCieXyz.write())).booleanValue() && this.stepDistance.equals(maneuver.stepDistance) && this.maneuverPoint.equals(maneuver.maneuverPoint);
    }
}
