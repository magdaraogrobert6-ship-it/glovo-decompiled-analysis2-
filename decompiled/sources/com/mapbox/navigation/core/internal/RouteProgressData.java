package com.mapbox.navigation.core.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteProgressData {
    public final Integer legGeometryIndex;
    public final int legIndex;
    public final int routeGeometryIndex;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.routeGeometryIndex, Integer.hashCode(this.legIndex) * 31, 31);
        Integer num = this.legGeometryIndex;
        return iM + (num == null ? 0 : num.hashCode());
    }

    public RouteProgressData(int i, int i2, Integer num) {
        this.legIndex = i;
        this.routeGeometryIndex = i2;
        this.legGeometryIndex = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteProgressData)) {
            return false;
        }
        RouteProgressData routeProgressData = (RouteProgressData) obj;
        if (this.legIndex != routeProgressData.legIndex || this.routeGeometryIndex != routeProgressData.routeGeometryIndex) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.legGeometryIndex, routeProgressData.legGeometryIndex}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RouteProgressData(legIndex=" + this.legIndex + ", routeGeometryIndex=" + this.routeGeometryIndex + ", legGeometryIndex=" + this.legGeometryIndex + ')';
    }
}
