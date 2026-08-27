package com.mapbox.navigation.base.trip.model.roadobject.distanceinfo;

/* JADX INFO: loaded from: classes2.dex */
public final class PointDistanceInfo extends RoadObjectDistanceInfo {
    public final double distanceToStart;

    public PointDistanceInfo(String str, int i, double d) {
        super(str, i, 2);
        this.distanceToStart = d;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final String toString() {
        return "PointDistanceInfo(distanceToStart=" + this.distanceToStart + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PointDistanceInfo.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return this.distanceToStart == ((PointDistanceInfo) obj).distanceToStart;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final Double getDistanceToStart() {
        return Double.valueOf(this.distanceToStart);
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final int hashCode() {
        return Double.hashCode(this.distanceToStart) + (super.hashCode() * 31);
    }
}
