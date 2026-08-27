package com.mapbox.navigation.base.trip.model.roadobject.reststop;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RestStop extends RoadObject {
    public final ArrayList amenities;
    public final String guideMapUri;
    public final String name;
    public final int restStopType;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        return "RestStop(restStopType=" + this.restStopType + ", amenities=" + this.amenities + ", name=" + this.name + ", guideMapUri=" + this.guideMapUri + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RestStop.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        RestStop restStop = (RestStop) obj;
        if (this.restStopType != restStop.restStopType) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, restStop.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amenities, restStop.amenities}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.guideMapUri, restStop.guideMapUri}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int i = this.restStopType;
        String str = this.name;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        ArrayList arrayList = this.amenities;
        int iHashCode3 = arrayList != null ? arrayList.hashCode() : 0;
        String str2 = this.guideMapUri;
        return (((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public RestStop(String str, int i, String str2, ArrayList arrayList, String str3, Double d, String str4, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 3, d, str4, bool, roadObject);
        this.restStopType = i;
        this.name = str2;
        this.amenities = arrayList;
        this.guideMapUri = str3;
    }
}
