package com.mapbox.navigation.base.internal;

import java.util.HashMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefreshRequestData {
    public final HashMap experimentalProperties;
    public final Integer legGeometryIndex;
    public final int legIndex;
    public final int routeGeometryIndex;

    public RouteRefreshRequestData(int i, int i2, Integer num, HashMap map) {
        this.legIndex = i;
        this.routeGeometryIndex = i2;
        this.legGeometryIndex = num;
        this.experimentalProperties = map;
    }

    public final int hashCode() {
        int i = this.legIndex;
        int i2 = this.routeGeometryIndex;
        Integer num = this.legGeometryIndex;
        return this.experimentalProperties.hashCode() + (((((i * 31) + i2) * 31) + (num != null ? num.intValue() : 0)) * 31);
    }

    public final String toString() {
        return "RouteRefreshRequestData(legIndex=" + this.legIndex + ", routeGeometryIndex=" + this.routeGeometryIndex + ", legGeometryIndex=" + this.legGeometryIndex + ", experimentalProperties=" + this.experimentalProperties + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteRefreshRequestData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteRefreshRequestData routeRefreshRequestData = (RouteRefreshRequestData) obj;
        if (this.legIndex != routeRefreshRequestData.legIndex || this.routeGeometryIndex != routeRefreshRequestData.routeGeometryIndex) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.legGeometryIndex, routeRefreshRequestData.legGeometryIndex}, getCieXyz.write())).booleanValue() && this.experimentalProperties.equals(routeRefreshRequestData.experimentalProperties);
    }
}
