package com.mapbox.navigation.core.routealternatives;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class AlternativeRouteIntersection {
    public final int geometryIndexInLeg;
    public final int geometryIndexInRoute;
    public final int legIndex;
    public final Point location;

    public final int hashCode() {
        int iHashCode = this.location.hashCode();
        int i = this.geometryIndexInRoute;
        return (((((iHashCode * 31) + i) * 31) + this.geometryIndexInLeg) * 31) + this.legIndex;
    }

    public AlternativeRouteIntersection(Point point, int i, int i2, int i3) {
        this.location = point;
        this.geometryIndexInRoute = i;
        this.geometryIndexInLeg = i2;
        this.legIndex = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlternativeRouteIntersection(location=");
        sb.append(this.location);
        sb.append(", geometryIndexInRoute=");
        sb.append(this.geometryIndexInRoute);
        sb.append(", geometryIndexInLeg=");
        sb.append(this.geometryIndexInLeg);
        sb.append(", legIndex=");
        return af$$ExternalSyntheticOutline0.m(sb, this.legIndex, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AlternativeRouteIntersection.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AlternativeRouteIntersection alternativeRouteIntersection = (AlternativeRouteIntersection) obj;
        return this.location.equals(alternativeRouteIntersection.location) && this.geometryIndexInRoute == alternativeRouteIntersection.geometryIndexInRoute && this.geometryIndexInLeg == alternativeRouteIntersection.geometryIndexInLeg && this.legIndex == alternativeRouteIntersection.legIndex;
    }
}
