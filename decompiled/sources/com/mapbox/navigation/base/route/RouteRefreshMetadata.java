package com.mapbox.navigation.base.route;

import java.util.Map;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefreshMetadata {
    public final Map experimentalProperties;
    public final boolean isUpToDate;

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isUpToDate);
        Map map = this.experimentalProperties;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public RouteRefreshMetadata(Map map, boolean z) {
        this.isUpToDate = z;
        this.experimentalProperties = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteRefreshMetadata(isUpToDate=");
        sb.append(this.isUpToDate);
        sb.append(", experimentalProperties=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.experimentalProperties, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteRefreshMetadata.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteRefreshMetadata routeRefreshMetadata = (RouteRefreshMetadata) obj;
        if (this.isUpToDate != routeRefreshMetadata.isUpToDate) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.experimentalProperties, routeRefreshMetadata.experimentalProperties}, getCieXyz.write())).booleanValue();
    }
}
