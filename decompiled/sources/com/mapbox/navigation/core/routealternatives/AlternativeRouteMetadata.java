package com.mapbox.navigation.core.routealternatives;

import com.mapbox.navigation.base.route.NavigationRoute;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AlternativeRouteMetadata {
    public final AlternativeRouteIntersection forkIntersectionOfAlternativeRoute;
    public final AlternativeRouteIntersection forkIntersectionOfPrimaryRoute;
    public final AlternativeRouteInfo infoFromFork;
    public final AlternativeRouteInfo infoFromStartOfPrimary;
    public final NavigationRoute navigationRoute;

    public final int hashCode() {
        int iHashCode = this.navigationRoute.id.hashCode();
        int iHashCode2 = this.forkIntersectionOfAlternativeRoute.hashCode();
        int iHashCode3 = this.forkIntersectionOfPrimaryRoute.hashCode();
        return this.infoFromStartOfPrimary.hashCode() + ((this.infoFromFork.hashCode() + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31);
    }

    public AlternativeRouteMetadata(NavigationRoute navigationRoute, AlternativeRouteIntersection alternativeRouteIntersection, AlternativeRouteIntersection alternativeRouteIntersection2, AlternativeRouteInfo alternativeRouteInfo, AlternativeRouteInfo alternativeRouteInfo2) {
        navigationRoute.getClass();
        this.navigationRoute = navigationRoute;
        this.forkIntersectionOfAlternativeRoute = alternativeRouteIntersection;
        this.forkIntersectionOfPrimaryRoute = alternativeRouteIntersection2;
        this.infoFromFork = alternativeRouteInfo;
        this.infoFromStartOfPrimary = alternativeRouteInfo2;
    }

    public final String toString() {
        return "AlternativeRouteMetadata(navigationRouteId=" + this.navigationRoute.id + ", forkIntersectionOfAlternativeRoute=" + this.forkIntersectionOfAlternativeRoute + ", forkIntersectionOfPrimaryRoute=" + this.forkIntersectionOfPrimaryRoute + ", infoFromFork=" + this.infoFromFork + ", infoFromStartOfPrimary=" + this.infoFromStartOfPrimary + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AlternativeRouteMetadata.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AlternativeRouteMetadata alternativeRouteMetadata = (AlternativeRouteMetadata) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.navigationRoute.id, alternativeRouteMetadata.navigationRoute.id}, getCieXyz.write())).booleanValue() && this.forkIntersectionOfAlternativeRoute.equals(alternativeRouteMetadata.forkIntersectionOfAlternativeRoute) && this.forkIntersectionOfPrimaryRoute.equals(alternativeRouteMetadata.forkIntersectionOfPrimaryRoute) && this.infoFromFork.equals(alternativeRouteMetadata.infoFromFork) && this.infoFromStartOfPrimary.equals(alternativeRouteMetadata.infoFromStartOfPrimary);
    }
}
