package com.mapbox.navigation.base.trip.model.roadobject.tollcollection;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TollCollection extends RoadObject {
    public final String name;
    public final int tollCollectionType;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        return "TollCollection(tollCollectionType=" + this.tollCollectionType + ",name=" + this.name + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TollCollection.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        TollCollection tollCollection = (TollCollection) obj;
        if (this.tollCollectionType != tollCollection.tollCollectionType) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, tollCollection.name}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int i = this.tollCollectionType;
        String str = this.name;
        return (((iHashCode * 31) + i) * 31) + (str != null ? str.hashCode() : 0);
    }

    public TollCollection(String str, int i, String str2, Double d, String str3, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 2, d, str3, bool, roadObject);
        this.tollCollectionType = i;
        this.name = str2;
    }
}
