package com.mapbox.navigation.base.trip.model.roadobject.railwaycrossing;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RailwayCrossing extends RoadObject {
    public final RailwayCrossingInfo info;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        StringBuilder sb = new StringBuilder("RailwayCrossing(info=");
        sb.append(this.info);
        sb.append("), ");
        return ff$$ExternalSyntheticOutline0.m(sb, super.toString(), ')');
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RailwayCrossing.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.info, ((RailwayCrossing) obj).info}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        int iHashCode = super.hashCode();
        this.info.getClass();
        return RailwayCrossingInfo.class.hashCode() + (iHashCode * 31);
    }

    public RailwayCrossing(String str, RailwayCrossingInfo railwayCrossingInfo, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 8, d, str2, bool, roadObject);
        this.info = railwayCrossingInfo;
    }
}
