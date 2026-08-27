package com.mapbox.navigation.base.route;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.internal.factory.RoadObjectFactory;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.TimeZone;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.internal.route.operations.RouteUpdate;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.mapbox.navigation.base.internal.utils.DirectionsRouteEx$WhenMappings;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.trip.model.roadobject.UpcomingRoadObject;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RoadObject;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.UpcomingRouteAlert;
import com.mapbox.navigator.WaypointType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.BrazeInAppMessageManagerWhenMappings;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.onMove;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationRoute {
    public final DirectionsRoute directionsRoute;
    public Long expirationTimeElapsedSeconds;
    public final String id;
    public final RouteInterface nativeRoute;
    public final ArrayList nativeWaypoints;
    public final x operations;
    public final String origin;
    public final CongestionNumericOverride overriddenTraffic;
    public final String responseOriginAPI;
    public final RouteOptions routeOptions;
    public final RouteRefreshMetadata routeRefreshMetadata;
    public final List unavoidableClosures;
    public final ArrayList upcomingRoadObjects;
    public final List waypoints;

    public final DirectionsRoute getDirectionsRoute() {
        return this.directionsRoute;
    }

    public final boolean equals(Object obj) {
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        List list = this.waypoints;
        DirectionsRoute directionsRoute = this.directionsRoute;
        String str = this.id;
        if (!trackingIsActive) {
            if (this != obj) {
                if (NavigationRoute.class.equals(obj != null ? obj.getClass() : null)) {
                    obj.getClass();
                    NavigationRoute navigationRoute = (NavigationRoute) obj;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, navigationRoute.id}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{directionsRoute, navigationRoute.directionsRoute}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, navigationRoute.waypoints}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        PerformanceTracker.syncSectionStarted("NavRoute#equals");
        try {
            BrazeInAppMessageManagerWhenMappings.write();
            if (this == obj) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
                return true;
            }
            if (!NavigationRoute.class.equals(obj != null ? obj.getClass() : null)) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
                return false;
            }
            obj.getClass();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ((NavigationRoute) obj).id}, getCieXyz.write())).booleanValue()) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{directionsRoute, ((NavigationRoute) obj).directionsRoute}, getCieXyz.write())).booleanValue()) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, ((NavigationRoute) obj).waypoints}, getCieXyz.write())).booleanValue()) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
                return true;
            }
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
            return false;
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#equals", null);
            throw th;
        }
    }

    public final int hashCode() {
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        List list = this.waypoints;
        DirectionsRoute directionsRoute = this.directionsRoute;
        String str = this.id;
        if (!trackingIsActive) {
            return ((directionsRoute.hashCode() + (str.hashCode() * 31)) * 31) + (list != null ? list.hashCode() : 0);
        }
        PerformanceTracker.syncSectionStarted("NavRoute#hashCode");
        try {
            BrazeInAppMessageManagerWhenMappings.write();
            int iHashCode = str.hashCode();
            return (((iHashCode * 31) + directionsRoute.hashCode()) * 31) + (list != null ? list.hashCode() : 0);
        } finally {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavRoute#hashCode", null);
        }
    }

    public final NavigationRoute refresh(RouteUpdate routeUpdate, HashMap map) {
        RouteRefreshMetadata routeRefreshMetadata;
        DirectionsRouteModelParsingResult directionsRouteModelParsingResult = routeUpdate.routeModelsParsingResult;
        DirectionsParsedRouteData directionsParsedRouteData = directionsRouteModelParsingResult.data;
        DirectionsRoute directionsRoute = directionsParsedRouteData.route;
        List list = directionsParsedRouteData.routesWaypoint;
        x xVar = directionsRouteModelParsingResult.operations;
        RouteRefreshMetadata routeRefreshMetadata2 = routeUpdate.routeRefreshMetadata;
        if (map != null) {
            routeRefreshMetadata = new RouteRefreshMetadata(map, routeRefreshMetadata2 != null ? routeRefreshMetadata2.isUpToDate : true);
        } else {
            routeRefreshMetadata = routeRefreshMetadata2;
        }
        return copy$base_release$default(this, directionsRoute, list, (CongestionNumericOverride) routeUpdate.overriddenTraffic.update(this.overriddenTraffic), (Long) routeUpdate.newExpirationTimeElapsedSeconds.update(this.expirationTimeElapsedSeconds), routeRefreshMetadata, xVar, 268);
    }

    public NavigationRoute(DirectionsRoute directionsRoute, List list, String str, RouteRefreshMetadata routeRefreshMetadata, RouteOptions routeOptions, RouteInterface routeInterface, Long l, x xVar, List list2, CongestionNumericOverride congestionNumericOverride) {
        Waypoint.InternalType internalType;
        Map mapSerializer;
        TimeZone timeZone;
        routeInterface.getClass();
        list2.getClass();
        this.directionsRoute = directionsRoute;
        this.waypoints = list;
        this.responseOriginAPI = str;
        this.routeRefreshMetadata = routeRefreshMetadata;
        this.routeOptions = routeOptions;
        this.nativeRoute = routeInterface;
        this.expirationTimeElapsedSeconds = l;
        this.operations = xVar;
        this.unavoidableClosures = list2;
        this.overriddenTraffic = congestionNumericOverride;
        String routeId = routeInterface.getRouteId();
        routeId.getClass();
        this.id = routeId;
        com.mapbox.navigator.RouterOrigin routerOrigin = routeInterface.getRouterOrigin();
        routerOrigin.getClass();
        this.origin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
        RoadObjectType[] roadObjectTypeArr = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
        List<UpcomingRouteAlert> alerts = routeInterface.getRouteInfo().getAlerts();
        alerts.getClass();
        ArrayList<UpcomingRouteAlert> arrayList = new ArrayList();
        for (Object obj : alerts) {
            RoadObjectType[] roadObjectTypeArr2 = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
            RoadObjectType type = ((UpcomingRouteAlert) obj).getRoadObject().getType();
            type.getClass();
            if (onContentCardClicked.IconCompatParcelizer(roadObjectTypeArr2, type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (UpcomingRouteAlert upcomingRouteAlert : arrayList) {
            RoadObjectType[] roadObjectTypeArr3 = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
            RoadObject roadObject = upcomingRouteAlert.getRoadObject();
            roadObject.getClass();
            arrayList2.add(new UpcomingRoadObject(RoadObjectFactory.buildRoadObject(roadObject), Double.valueOf(upcomingRouteAlert.getDistanceToStart())));
        }
        this.upcomingRoadObjects = arrayList2;
        List<com.mapbox.navigator.Waypoint> waypoints = this.nativeRoute.getWaypoints();
        waypoints.getClass();
        List<com.mapbox.navigator.Waypoint> list3 = waypoints;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        for (com.mapbox.navigator.Waypoint waypoint : list3) {
            Point location = waypoint.getLocation();
            WaypointType type2 = waypoint.getType();
            type2.getClass();
            int i = DirectionsRouteEx$WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i == 1) {
                internalType = Waypoint.InternalType.Regular;
            } else if (i == 2) {
                internalType = Waypoint.InternalType.Silent;
            } else if (i == 3) {
                internalType = Waypoint.InternalType.EvChargingServer;
            } else {
                if (i != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
                }
                internalType = Waypoint.InternalType.EvChargingUser;
            }
            Waypoint.InternalType internalType2 = internalType;
            String name = waypoint.getName();
            Point target = waypoint.getTarget();
            String metadata = waypoint.getMetadata();
            if (metadata != null) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : JsonParser.parseString(metadata).getAsJsonObject().entrySet()) {
                        String key = entry.getKey();
                        key.getClass();
                        JsonElement value = entry.getValue();
                        value.getClass();
                        linkedHashMap.put(key, value);
                    }
                    mapSerializer = onMove.serializer(linkedHashMap);
                } catch (Throwable th) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Could not parse ", metadata, " to metadata: ");
                        sbM.append(th.getMessage());
                        LoggerProviderKt.logE(sbM.toString(), null);
                    }
                    mapSerializer = null;
                }
            } else {
                mapSerializer = null;
            }
            com.mapbox.navigator.TimeZone timeZone2 = waypoint.getTimeZone();
            if (timeZone2 != null) {
                String offset = timeZone2.getOffset();
                offset.getClass();
                String identifier = timeZone2.getIdentifier();
                identifier.getClass();
                String abbreviation = timeZone2.getAbbreviation();
                abbreviation.getClass();
                timeZone = new TimeZone(offset, identifier, abbreviation);
            } else {
                timeZone = null;
            }
            location.getClass();
            name.getClass();
            arrayList3.add(new Waypoint(location, name, target, internalType2, mapSerializer, timeZone));
        }
        this.nativeWaypoints = arrayList3;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("NavigationRoute(id="), this.id, ')');
    }

    public static NavigationRoute copy$base_release$default(NavigationRoute navigationRoute, DirectionsRoute directionsRoute, List list, CongestionNumericOverride congestionNumericOverride, Long l, RouteRefreshMetadata routeRefreshMetadata, x xVar, int i) {
        DirectionsRoute directionsRoute2 = (i & 1) != 0 ? navigationRoute.directionsRoute : directionsRoute;
        List list2 = (i & 2) != 0 ? navigationRoute.waypoints : list;
        RouteOptions routeOptions = navigationRoute.routeOptions;
        RouteInterface routeInterface = navigationRoute.nativeRoute;
        CongestionNumericOverride congestionNumericOverride2 = (i & 16) != 0 ? navigationRoute.overriddenTraffic : congestionNumericOverride;
        Long l2 = (i & 32) != 0 ? navigationRoute.expirationTimeElapsedSeconds : l;
        RouteRefreshMetadata routeRefreshMetadata2 = (i & 64) != 0 ? navigationRoute.routeRefreshMetadata : routeRefreshMetadata;
        x xVar2 = (i & Fields.SpotShadowColor) != 0 ? navigationRoute.operations : xVar;
        String str = navigationRoute.responseOriginAPI;
        navigationRoute.getClass();
        directionsRoute2.getClass();
        routeOptions.getClass();
        routeInterface.getClass();
        xVar2.getClass();
        str.getClass();
        return new NavigationRoute(directionsRoute2, list2, str, routeRefreshMetadata2, routeOptions, routeInterface, l2, xVar2, navigationRoute.unavoidableClosures, congestionNumericOverride2);
    }

    public /* synthetic */ NavigationRoute(DirectionsRoute directionsRoute, List list, String str, RouteOptions routeOptions, RouteInterface routeInterface, Long l, x xVar) {
        ArrayList arrayList;
        List<RouteLeg> listLegs = directionsRoute.legs();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (listLegs != null) {
            List<RouteLeg> list2 = listLegs;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                List<Closure> listClosures = ((RouteLeg) it.next()).closures();
                if (listClosures == null) {
                    listClosures = instance_delegatelambda0Var;
                }
                arrayList.add(listClosures);
            }
        } else {
            arrayList = null;
        }
        this(directionsRoute, list, str, null, routeOptions, routeInterface, l, xVar, arrayList == null ? instance_delegatelambda0Var : arrayList, null);
    }
}
