package com.mapbox.navigation.ui.maps.route.line.api;

import java.util.Set;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesRenderedResult {
    public final Set clearingCancelledRouteIds;
    public final Set renderingCancelledRouteIds;
    public final Set successfullyClearedRouteIds;
    public final Set successfullyRenderedRouteIds;

    public final int hashCode() {
        int iHashCode = this.successfullyRenderedRouteIds.hashCode();
        int iHashCode2 = this.renderingCancelledRouteIds.hashCode();
        return this.clearingCancelledRouteIds.hashCode() + ((this.successfullyClearedRouteIds.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public RoutesRenderedResult(Set set, Set set2, Set set3, Set set4) {
        set2.getClass();
        set4.getClass();
        this.successfullyRenderedRouteIds = set;
        this.renderingCancelledRouteIds = set2;
        this.successfullyClearedRouteIds = set3;
        this.clearingCancelledRouteIds = set4;
    }

    public final String toString() {
        return "RoutesRenderedResult(successfullyRouteIds=" + this.successfullyRenderedRouteIds + ", renderingCancelledRouteIds=" + this.renderingCancelledRouteIds + ", successfullyClearedRouteIds=" + this.successfullyClearedRouteIds + ", clearingCancelledRouteIds=" + this.clearingCancelledRouteIds + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutesRenderedResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoutesRenderedResult routesRenderedResult = (RoutesRenderedResult) obj;
        if (!this.successfullyRenderedRouteIds.equals(routesRenderedResult.successfullyRenderedRouteIds)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.renderingCancelledRouteIds, routesRenderedResult.renderingCancelledRouteIds}, getCieXyz.write())).booleanValue() || !this.successfullyClearedRouteIds.equals(routesRenderedResult.successfullyClearedRouteIds)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clearingCancelledRouteIds, routesRenderedResult.clearingCancelledRouteIds}, getCieXyz.write())).booleanValue();
    }
}
