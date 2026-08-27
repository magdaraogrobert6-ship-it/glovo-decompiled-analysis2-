package com.mapbox.navigation.base.trip.model.roadobject.distanceinfo;

import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoadObjectDistanceInfo {
    public final int distanceInfoType;
    public final String roadObjectId;
    public final int roadObjectType;

    public abstract Double getDistanceToStart();

    public int hashCode() {
        int iHashCode = this.roadObjectId.hashCode();
        int i = this.roadObjectType;
        int i2 = this.distanceInfoType;
        Double distanceToStart = getDistanceToStart();
        return (((((iHashCode * 31) + i) * 31) + i2) * 31) + (distanceToStart != null ? distanceToStart.hashCode() : 0);
    }

    public RoadObjectDistanceInfo(String str, int i, int i2) {
        this.roadObjectId = str;
        this.roadObjectType = i;
        this.distanceInfoType = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadObjectDistanceInfo roadObjectDistanceInfo = (RoadObjectDistanceInfo) obj;
        return this.roadObjectId.equals(roadObjectDistanceInfo.roadObjectId) && this.roadObjectType == roadObjectDistanceInfo.roadObjectType && this.distanceInfoType == roadObjectDistanceInfo.distanceInfoType && removeNodeAtDepth.read(getDistanceToStart(), roadObjectDistanceInfo.getDistanceToStart());
    }

    public String toString() {
        return "RoadObjectDistanceInfo(roadObjectId='" + this.roadObjectId + "', roadObjectType=" + this.roadObjectType + ", distanceInfoType=" + this.distanceInfoType + ", distanceToStart=" + getDistanceToStart() + ')';
    }
}
