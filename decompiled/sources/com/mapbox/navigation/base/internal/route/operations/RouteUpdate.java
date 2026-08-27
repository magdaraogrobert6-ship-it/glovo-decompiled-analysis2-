package com.mapbox.navigation.base.internal.route.operations;

import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.mapbox.navigation.base.route.RouteRefreshMetadata;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteUpdate {
    public final OptionallyRefreshedData newExpirationTimeElapsedSeconds;
    public final OptionallyRefreshedData overriddenTraffic;
    public final DirectionsRouteModelParsingResult routeModelsParsingResult;
    public final RouteRefreshMetadata routeRefreshMetadata;

    public final int hashCode() {
        int iHashCode = this.routeModelsParsingResult.hashCode();
        RouteRefreshMetadata routeRefreshMetadata = this.routeRefreshMetadata;
        return this.overriddenTraffic.hashCode() + ((this.newExpirationTimeElapsedSeconds.hashCode() + (((iHashCode * 31) + (routeRefreshMetadata == null ? 0 : routeRefreshMetadata.hashCode())) * 31)) * 31);
    }

    public RouteUpdate(DirectionsRouteModelParsingResult directionsRouteModelParsingResult, RouteRefreshMetadata routeRefreshMetadata, OptionallyRefreshedData optionallyRefreshedData, OptionallyRefreshedData optionallyRefreshedData2) {
        this.routeModelsParsingResult = directionsRouteModelParsingResult;
        this.routeRefreshMetadata = routeRefreshMetadata;
        this.newExpirationTimeElapsedSeconds = optionallyRefreshedData;
        this.overriddenTraffic = optionallyRefreshedData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteUpdate)) {
            return false;
        }
        RouteUpdate routeUpdate = (RouteUpdate) obj;
        if (!this.routeModelsParsingResult.equals(routeUpdate.routeModelsParsingResult)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeRefreshMetadata, routeUpdate.routeRefreshMetadata}, getCieXyz.write())).booleanValue() && this.newExpirationTimeElapsedSeconds.equals(routeUpdate.newExpirationTimeElapsedSeconds) && this.overriddenTraffic.equals(routeUpdate.overriddenTraffic);
    }

    public final String toString() {
        return "RouteUpdate(routeModelsParsingResult=" + this.routeModelsParsingResult + ", routeRefreshMetadata=" + this.routeRefreshMetadata + ", newExpirationTimeElapsedSeconds=" + this.newExpirationTimeElapsedSeconds + ", overriddenTraffic=" + this.overriddenTraffic + ')';
    }
}
