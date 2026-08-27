package com.google.android.gms.internal.mlkit_vision_face;

import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsRouteFBWrapper;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.utils.DirectionsRouteEx$stepsNamesAsString$1;
import com.mapbox.navigation.base.route.NavigationRoute;
import java.util.List;
import java.util.Map;
import o.BrazeInAppMessageManagerWhenMappings;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmb {
    public static final boolean areSameRoutes(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!isSameRoute(((NavigationRoute) list.get(i)).directionsRoute, ((NavigationRoute) list2.get(i)).directionsRoute)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isSameRoute(DirectionsRoute directionsRoute, DirectionsRoute directionsRoute2) {
        directionsRoute.getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (!PerformanceTracker.getTrackingIsActive()) {
            if (directionsRoute == directionsRoute2) {
                return true;
            }
            if (directionsRoute2 != null) {
                String strGeometry = directionsRoute.geometry();
                String strGeometry2 = directionsRoute2.geometry();
                if (strGeometry != null && strGeometry2 != null) {
                    return strGeometry.equals(strGeometry2);
                }
                String strStepsNamesAsString = stepsNamesAsString(directionsRoute);
                String strStepsNamesAsString2 = stepsNamesAsString(directionsRoute2);
                if (strStepsNamesAsString != null && strStepsNamesAsString2 != null) {
                    return strStepsNamesAsString.equals(strStepsNamesAsString2);
                }
            }
            return false;
        }
        PerformanceTracker.syncSectionStarted("DirectionsRoute.isSameRoute");
        try {
            BrazeInAppMessageManagerWhenMappings.write();
            if (directionsRoute == directionsRoute2) {
                return true;
            }
            if (directionsRoute2 == null) {
                return false;
            }
            String strGeometry3 = directionsRoute.geometry();
            String strGeometry4 = directionsRoute2.geometry();
            if (strGeometry3 != null && strGeometry4 != null) {
                return strGeometry3.equals(strGeometry4);
            }
            String strStepsNamesAsString3 = stepsNamesAsString(directionsRoute);
            String strStepsNamesAsString4 = stepsNamesAsString(directionsRoute2);
            if (strStepsNamesAsString3 == null || strStepsNamesAsString4 == null) {
                return false;
            }
            return strStepsNamesAsString3.equals(strStepsNamesAsString4);
        } finally {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.isSameRoute", null);
        }
    }

    public static final Integer refreshTtl(DirectionsRoute directionsRoute) {
        JsonElement jsonElement;
        try {
            if (directionsRoute instanceof DirectionsRouteFBWrapper) {
                return ((DirectionsRouteFBWrapper) directionsRoute).getRefreshTtl$base_release();
            }
            Map<String, JsonElement> unrecognizedJsonProperties = directionsRoute.getUnrecognizedJsonProperties();
            if (unrecognizedJsonProperties == null || (jsonElement = unrecognizedJsonProperties.get("refresh_ttl")) == null) {
                return null;
            }
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String stepsNamesAsString(DirectionsRoute directionsRoute) {
        List<RouteLeg> listLegs = directionsRoute.legs();
        if (listLegs != null) {
            return onContentCardDismissed.IconCompatParcelizer(listLegs, null, null, null, DirectionsRouteEx$stepsNamesAsString$1.INSTANCE, 31);
        }
        return null;
    }
}
