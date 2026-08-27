package com.mapbox.navigation.base.trip.model.roadobject;

import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class UpcomingRoadObject {
    public final Double distanceToStart;
    public final RoadObject roadObject;

    public final int hashCode() {
        int iHashCode = this.roadObject.hashCode();
        Double d = this.distanceToStart;
        return ((iHashCode * 31) + (d != null ? d.hashCode() : 0)) * 31;
    }

    public UpcomingRoadObject(RoadObject roadObject, Double d) {
        this.roadObject = roadObject;
        this.distanceToStart = d;
    }

    public final String toString() {
        return "UpcomingRoadObject(roadObject=" + this.roadObject + ", distanceToStart=" + this.distanceToStart + ", distanceInfo=null)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!UpcomingRoadObject.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        UpcomingRoadObject upcomingRoadObject = (UpcomingRoadObject) obj;
        return this.roadObject.equals(upcomingRoadObject.roadObject) && removeNodeAtDepth.read(this.distanceToStart, upcomingRoadObject.distanceToStart);
    }
}
