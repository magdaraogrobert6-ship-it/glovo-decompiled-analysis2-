package com.google.android.gms.internal.mlkit_vision_face;

import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.internal.route.operations.OptionallyRefreshedData;
import com.mapbox.navigation.base.internal.route.operations.RouteUpdate;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouteRefreshMetadata;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.util.List;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmk {
    public static NavigationRoute update$default(NavigationRoute navigationRoute, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, CongestionNumericOverride congestionNumericOverride, RouteRefreshMetadata routeRefreshMetadata, int i) {
        if ((i & 4) != 0) {
            congestionNumericOverride = navigationRoute.overriddenTraffic;
        }
        if ((i & 8) != 0) {
            routeRefreshMetadata = navigationRoute.routeRefreshMetadata;
        }
        navigationRoute.getClass();
        DirectionsParsedRouteData directionsParsedRouteData = (DirectionsParsedRouteData) navigationRoute.operations.read;
        DirectionsParsedRouteData directionsParsedRouteDataCopy$default = DirectionsParsedRouteData.copy$default(directionsParsedRouteData, (DirectionsRoute) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(directionsParsedRouteData.route), (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(directionsParsedRouteData.routesWaypoint));
        NavigationRoute navigationRouteRefresh = navigationRoute.refresh(new RouteUpdate(new DirectionsRouteModelParsingResult(directionsParsedRouteDataCopy$default, new x(directionsParsedRouteDataCopy$default, congestionNumericOverride)), routeRefreshMetadata, new OptionallyRefreshedData.NoUpdates(), new OptionallyRefreshedData.Updated(congestionNumericOverride)), null);
        Throwable thSerializer = onItemDismiss.serializer(navigationRouteRefresh);
        if (thSerializer == null) {
            return navigationRouteRefresh;
        }
        if (!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
            return navigationRoute;
        }
        LoggerProviderKt.logE("Can't update " + navigationRoute.nativeRoute.getRouteId() + " because of " + thSerializer.getMessage() + ". Working with initial route instead.", "RouteRefresh");
        return navigationRoute;
    }
}
