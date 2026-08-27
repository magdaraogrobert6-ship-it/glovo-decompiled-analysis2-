package com.mapbox.navigation.base.trip.model.roadobject.tunnel;

import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Tunnel extends RoadObject {
    public final TunnelInfo info;

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final String toString() {
        return "Tunnel(info=" + this.info + "), " + super.toString();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Tunnel.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.info, ((Tunnel) obj).info}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.base.trip.model.roadobject.RoadObject
    public final int hashCode() {
        return this.info.hashCode() + (super.hashCode() * 31);
    }

    public Tunnel(String str, TunnelInfo tunnelInfo, Double d, String str2, Boolean bool, com.mapbox.navigator.RoadObject roadObject) {
        super(str, 0, d, str2, bool, roadObject);
        this.info = tunnelInfo;
    }
}
