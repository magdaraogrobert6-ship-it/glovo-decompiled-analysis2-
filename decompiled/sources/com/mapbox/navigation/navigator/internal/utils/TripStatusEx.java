package com.mapbox.navigation.navigator.internal.utils;

import com.google.android.gms.internal.mlkit_vision_face.zzki;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.route.LegWaypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.navigator.internal.TripStatus;
import java.util.ArrayList;
import java.util.Iterator;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TripStatusEx {
    public static final LegWaypoint getCurrentLegDestination(TripStatus tripStatus, NavigationRoute navigationRoute) {
        Object next;
        String str;
        navigationRoute.getClass();
        Iterator it = onContentCardDismissed.serializer(navigationRoute.nativeWaypoints, Math.max(1, tripStatus.navigationStatus.getNextWaypointIndex())).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zzki.isLegWaypoint((Waypoint) next));
        Waypoint waypoint = (Waypoint) next;
        if (waypoint == null) {
            return null;
        }
        int i = waypoint.type;
        if (i == 1) {
            str = "REGULAR";
        } else if (i == 3) {
            str = "EV_CHARGING_ADDED";
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(waypoint + " is not a leg waypoint");
            }
            str = "EV_CHARGING_USER_PROVIDED";
        }
        return new LegWaypoint(waypoint.location, waypoint.name, waypoint.target, str, waypoint.metadata);
    }

    public static final int calculateRemainingWaypoints(TripStatus tripStatus) {
        NavigationRoute navigationRoute = tripStatus.route;
        ArrayList arrayList = navigationRoute != null ? navigationRoute.nativeWaypoints : null;
        if (arrayList != null) {
            return arrayList.size() - Math.max(1, tripStatus.navigationStatus.getNextWaypointIndex());
        }
        return 0;
    }
}
