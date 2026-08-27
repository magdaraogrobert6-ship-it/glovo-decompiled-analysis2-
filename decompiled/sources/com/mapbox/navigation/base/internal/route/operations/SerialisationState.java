package com.mapbox.navigation.base.internal.route.operations;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.navigation.base.route.RouteRefreshMetadata;
import com.mapbox.navigator.RouterOrigin;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
final class SerialisationState {
    private final DirectionsRoute directionRoute;
    private final Long expirationTimeElapsedSeconds;
    private final String responseOriginAPI;
    private final String responseUUID;
    private final int routeIndex;
    private final RouteOptions routeOptions;
    private final RouteRefreshMetadata routeRefreshMetadata;
    private final RouterOrigin routerOrigin;
    private final List<List<Closure>> unavoidableClosures;
    private final List<DirectionsWaypoint> waypoints;

    public final DirectionsRoute component1() {
        return this.directionRoute;
    }

    public final RouteRefreshMetadata component10() {
        return this.routeRefreshMetadata;
    }

    public final RouteOptions component2() {
        return this.routeOptions;
    }

    public final List<DirectionsWaypoint> component3() {
        return this.waypoints;
    }

    public final int component4() {
        return this.routeIndex;
    }

    public final RouterOrigin component5() {
        return this.routerOrigin;
    }

    public final List<List<Closure>> component6() {
        return this.unavoidableClosures;
    }

    public final String component7() {
        return this.responseOriginAPI;
    }

    public final String component8() {
        return this.responseUUID;
    }

    public final Long component9() {
        return this.expirationTimeElapsedSeconds;
    }

    public final DirectionsRoute getDirectionRoute() {
        return this.directionRoute;
    }

    public final Long getExpirationTimeElapsedSeconds() {
        return this.expirationTimeElapsedSeconds;
    }

    public final String getResponseOriginAPI() {
        return this.responseOriginAPI;
    }

    public final String getResponseUUID() {
        return this.responseUUID;
    }

    public final int getRouteIndex() {
        return this.routeIndex;
    }

    public final RouteOptions getRouteOptions() {
        return this.routeOptions;
    }

    public final RouteRefreshMetadata getRouteRefreshMetadata() {
        return this.routeRefreshMetadata;
    }

    public final RouterOrigin getRouterOrigin() {
        return this.routerOrigin;
    }

    public final List<List<Closure>> getUnavoidableClosures() {
        return this.unavoidableClosures;
    }

    public final List<DirectionsWaypoint> getWaypoints() {
        return this.waypoints;
    }

    public int hashCode() {
        int iHashCode = this.directionRoute.hashCode();
        int iHashCode2 = this.routeOptions.hashCode();
        List<DirectionsWaypoint> list = this.waypoints;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.unavoidableClosures, (this.routerOrigin.hashCode() + af$$ExternalSyntheticOutline0.m(this.routeIndex, (((iHashCode2 + (iHashCode * 31)) * 31) + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31, 31), 31, this.responseOriginAPI), 31, this.responseUUID);
        Long l = this.expirationTimeElapsedSeconds;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        RouteRefreshMetadata routeRefreshMetadata = this.routeRefreshMetadata;
        return ((iM + iHashCode3) * 31) + (routeRefreshMetadata != null ? routeRefreshMetadata.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerialisationState(DirectionsRoute directionsRoute, RouteOptions routeOptions, List<? extends DirectionsWaypoint> list, int i, RouterOrigin routerOrigin, List<? extends List<? extends Closure>> list2, String str, String str2, Long l, RouteRefreshMetadata routeRefreshMetadata) {
        directionsRoute.getClass();
        routeOptions.getClass();
        routerOrigin.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        this.directionRoute = directionsRoute;
        this.routeOptions = routeOptions;
        this.waypoints = list;
        this.routeIndex = i;
        this.routerOrigin = routerOrigin;
        this.unavoidableClosures = list2;
        this.responseOriginAPI = str;
        this.responseUUID = str2;
        this.expirationTimeElapsedSeconds = l;
        this.routeRefreshMetadata = routeRefreshMetadata;
    }

    public final SerialisationState copy(DirectionsRoute directionsRoute, RouteOptions routeOptions, List<? extends DirectionsWaypoint> list, int i, RouterOrigin routerOrigin, List<? extends List<? extends Closure>> list2, String str, String str2, Long l, RouteRefreshMetadata routeRefreshMetadata) {
        directionsRoute.getClass();
        routeOptions.getClass();
        routerOrigin.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        return new SerialisationState(directionsRoute, routeOptions, list, i, routerOrigin, list2, str, str2, l, routeRefreshMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerialisationState)) {
            return false;
        }
        SerialisationState serialisationState = (SerialisationState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.directionRoute, serialisationState.directionRoute}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeOptions, serialisationState.routeOptions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypoints, serialisationState.waypoints}, getCieXyz.write())).booleanValue() || this.routeIndex != serialisationState.routeIndex || this.routerOrigin != serialisationState.routerOrigin) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.unavoidableClosures, serialisationState.unavoidableClosures}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseOriginAPI, serialisationState.responseOriginAPI}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseUUID, serialisationState.responseUUID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expirationTimeElapsedSeconds, serialisationState.expirationTimeElapsedSeconds}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeRefreshMetadata, serialisationState.routeRefreshMetadata}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "SerialisationState(directionRoute=" + this.directionRoute + ", routeOptions=" + this.routeOptions + ", waypoints=" + this.waypoints + ", routeIndex=" + this.routeIndex + ", routerOrigin=" + this.routerOrigin + ", unavoidableClosures=" + this.unavoidableClosures + ", responseOriginAPI=" + this.responseOriginAPI + ", responseUUID=" + this.responseUUID + ", expirationTimeElapsedSeconds=" + this.expirationTimeElapsedSeconds + ", routeRefreshMetadata=" + this.routeRefreshMetadata + ')';
    }
}
