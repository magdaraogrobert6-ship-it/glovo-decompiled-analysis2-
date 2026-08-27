package com.mapbox.navigation.tripdata.progress.api;

import coil3.UriKt;
import com.mapbox.navigation.base.internal.route.TimeZone;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.tripdata.progress.TripProgressProcessor$WhenMappings;
import com.mapbox.navigation.tripdata.progress.TripProgressResult$RouteProgressCalculation;
import com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateFormatter;
import com.mapbox.navigation.tripdata.progress.model.TripProgressUpdateValue;
import java.util.List;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTripProgressApi {
    public final TripProgressUpdateFormatter formatter;

    public MapboxTripProgressApi(TripProgressUpdateFormatter tripProgressUpdateFormatter) {
        this.formatter = tripProgressUpdateFormatter;
    }

    public final TripProgressUpdateValue getTripProgress(RouteProgress routeProgress) {
        TripProgressResult$RouteProgressCalculation tripProgressResult$RouteProgressCalculation;
        TimeZone timeZone;
        routeProgress.getClass();
        NavigationRoute navigationRoute = routeProgress.navigationRoute;
        navigationRoute.getClass();
        Waypoint waypoint = (Waypoint) onContentCardDismissed.MediaBrowserCompatMediaItem((List) navigationRoute.nativeWaypoints);
        java.util.TimeZone timeZone2 = null;
        timeZone2 = null;
        if (waypoint != null && (timeZone = waypoint.timeZone) != null) {
            String str = timeZone.identifier;
            String[] availableIDs = java.util.TimeZone.getAvailableIDs();
            availableIDs.getClass();
            String strConcat = onContentCardClicked.IconCompatParcelizer(availableIDs, str) ? str : null;
            if (strConcat == null) {
                strConcat = "GMT".concat(timeZone.offset);
            }
            timeZone2 = java.util.TimeZone.getTimeZone(strConcat);
            timeZone2.getClass();
        }
        java.util.TimeZone timeZone3 = timeZone2;
        if (TripProgressProcessor$WhenMappings.$EnumSwitchMapping$0[routeProgress.currentState.ordinal()] == 1) {
            tripProgressResult$RouteProgressCalculation = new TripProgressResult$RouteProgressCalculation(System.currentTimeMillis(), 0.0d, 0.0d, 0.0d, 100.0d, timeZone3);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            long jWrite = BrazeInAppMessageManagerExternalSyntheticLambda2.write(UriKt.serializer(routeProgress.durationRemaining, setUnregisteredInAppMessage.SECONDS));
            float f = routeProgress.distanceRemaining;
            double d = routeProgress.currentLegProgress.durationRemaining;
            double d2 = routeProgress.durationRemaining;
            float f2 = routeProgress.distanceTraveled;
            tripProgressResult$RouteProgressCalculation = new TripProgressResult$RouteProgressCalculation(jWrite + jCurrentTimeMillis, f, d, d2, f2 / (f + f2), timeZone3);
        }
        return new TripProgressUpdateValue(tripProgressResult$RouteProgressCalculation.distanceRemaining, tripProgressResult$RouteProgressCalculation.currentLegTimeRemaining, this.formatter);
    }
}
