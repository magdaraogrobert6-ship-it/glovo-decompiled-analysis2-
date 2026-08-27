package com.mapbox.navigation.base.trip.model.roadobject.distanceinfo;

import bo.app.d$$ExternalSyntheticOutline0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class LineDistanceInfo extends RoadObjectDistanceInfo {
    public final double distanceToEnd;
    public final double distanceToEntry;
    public final double distanceToExit;
    public final double distanceToStart;
    public final boolean entryFromStart;
    public final double length;

    public LineDistanceInfo(String str, int i, double d, double d2, double d3, boolean z, double d4) {
        super(str, i, 1);
        this.distanceToEntry = d;
        this.distanceToExit = d2;
        this.distanceToEnd = d3;
        this.entryFromStart = z;
        this.length = d4;
        this.distanceToStart = d;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final String toString() {
        return "LineDistanceInfo(distanceToEntry=" + this.distanceToEntry + ", distanceToExit=" + this.distanceToExit + ", distanceToEnd=" + this.distanceToEnd + ", entryFromStart=" + this.entryFromStart + ", length=" + this.length + ", distanceToStart=" + this.distanceToStart + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LineDistanceInfo.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        LineDistanceInfo lineDistanceInfo = (LineDistanceInfo) obj;
        return this.distanceToEntry == lineDistanceInfo.distanceToEntry && this.distanceToExit == lineDistanceInfo.distanceToExit && this.distanceToEnd == lineDistanceInfo.distanceToEnd && this.entryFromStart == lineDistanceInfo.entryFromStart && this.length == lineDistanceInfo.length && this.distanceToStart == lineDistanceInfo.distanceToStart;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final Double getDistanceToStart() {
        return Double.valueOf(this.distanceToStart);
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final int hashCode() {
        return Double.hashCode(this.distanceToStart) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.length, d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distanceToEnd, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distanceToExit, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.distanceToEntry, super.hashCode() * 31, 31), 31), 31), 31, this.entryFromStart), 31);
    }
}
