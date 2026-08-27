package com.mapbox.navigation.ui.maps.route.line.model;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.internal.utils.DoubleKt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineDistancesIndex {
    public final double distanceRemaining;
    public final Point point;

    public final int hashCode() {
        return Double.hashCode(this.distanceRemaining) + (this.point.hashCode() * 31);
    }

    public RouteLineDistancesIndex(Point point, double d) {
        point.getClass();
        this.point = point;
        this.distanceRemaining = d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteLineDistancesIndex(point=");
        sb.append(this.point);
        sb.append(", distanceRemaining=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.distanceRemaining, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineDistancesIndex.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLineDistancesIndex routeLineDistancesIndex = (RouteLineDistancesIndex) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.point, routeLineDistancesIndex.point}, getCieXyz.write())).booleanValue()) {
            return DoubleKt.safeCompareTo(Double.valueOf(this.distanceRemaining), Double.valueOf(routeLineDistancesIndex.distanceRemaining));
        }
        return false;
    }
}
