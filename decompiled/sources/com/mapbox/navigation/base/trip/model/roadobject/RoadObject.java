package com.mapbox.navigation.base.trip.model.roadobject;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.trip.model.roadobject.location.RoadObjectLocation;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoadObject {
    public final String id;
    public final Boolean isUrban;
    public final Double length;
    public final isAdapterPositionOnScreen location$delegate;
    public final com.mapbox.navigator.RoadObject nativeRoadObject;
    public final int objectType;
    public final String provider;

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int i = this.objectType;
        Double d = this.length;
        int iM = af$$ExternalSyntheticOutline0.m((((RoadObjectLocation) this.location$delegate.MediaSessionCompatResultReceiverWrapper()).hashCode() + (((((iHashCode * 31) + i) * 31) + (d != null ? d.hashCode() : 0)) * 31)) * 31, 31, this.provider);
        int iHashCode2 = this.nativeRoadObject.hashCode();
        Boolean bool = this.isUrban;
        return ((iHashCode2 + iM) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public RoadObject(String str, int i, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        str.getClass();
        str2.getClass();
        roadObject.getClass();
        this.id = str;
        this.objectType = i;
        this.length = d;
        this.provider = str2;
        this.isUrban = bool;
        this.nativeRoadObject = roadObject;
        this.location$delegate = new isAdapterPositionOnScreen(new SearchOptionsKt$validateLimit$1(7, this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadObject roadObject = (RoadObject) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, roadObject.id}, getCieXyz.write())).booleanValue() || this.objectType != roadObject.objectType || !removeNodeAtDepth.read(this.length, roadObject.length)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(RoadObjectLocation) this.location$delegate.MediaSessionCompatResultReceiverWrapper(), (RoadObjectLocation) roadObject.location$delegate.MediaSessionCompatResultReceiverWrapper()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.provider, roadObject.provider}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nativeRoadObject, roadObject.nativeRoadObject}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isUrban, roadObject.isUrban}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RoadObject(id='" + this.id + "', objectType=" + this.objectType + ", length=" + this.length + ", location=" + ((RoadObjectLocation) this.location$delegate.MediaSessionCompatResultReceiverWrapper()) + ", provider=" + this.provider + ", isUrban=" + this.isUrban + ')';
    }
}
