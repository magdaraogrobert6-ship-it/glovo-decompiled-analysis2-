package com.mapbox.navigation.base.trip.model.roadobject.distanceinfo;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SubGraphDistanceInfo extends RoadObjectDistanceInfo {
    public final Double distanceToStart;
    public final List entrances;
    public final List exits;
    public final boolean inside;

    public SubGraphDistanceInfo(String str, int i, List list, List list2, boolean z) {
        super(str, i, 4);
        this.entrances = list;
        this.exits = list2;
        this.inside = z;
        Gate gate = (Gate) onContentCardDismissed.MediaMetadataCompat(list);
        this.distanceToStart = gate != null ? Double.valueOf(gate.distance) : null;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final Double getDistanceToStart() {
        return this.distanceToStart;
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final String toString() {
        return "SubGraphDistanceInfo(entrances=" + this.entrances + ", exits=" + this.exits + ", inside=" + this.inside + ", distanceToStart=" + this.distanceToStart + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SubGraphDistanceInfo.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        SubGraphDistanceInfo subGraphDistanceInfo = (SubGraphDistanceInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.entrances, subGraphDistanceInfo.entrances}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.exits, subGraphDistanceInfo.exits}, getCieXyz.write())).booleanValue() && this.inside == subGraphDistanceInfo.inside && removeNodeAtDepth.read(this.distanceToStart, subGraphDistanceInfo.distanceToStart);
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo
    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.exits, c8$$ExternalSyntheticOutline0.m(this.entrances, super.hashCode() * 31, 31), 31), 31, this.inside);
        Double d = this.distanceToStart;
        return iM + (d != null ? d.hashCode() : 0);
    }
}
