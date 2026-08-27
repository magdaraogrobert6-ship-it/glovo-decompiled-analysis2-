package com.google.firestore.v1;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.SetRoutes$Alternatives;
import com.mapbox.navigation.core.SetRoutes$CleanUp;
import com.mapbox.navigation.core.SetRoutes$NewRoutes;
import com.mapbox.navigation.core.SetRoutes$RefreshRoutes$RefreshControllerRefresh;
import com.mapbox.navigation.core.SetRoutes$Reorder;
import com.mapbox.navigation.core.SetRoutes$Reroute;
import com.mapbox.navigation.core.internal.RouteProgressData;
import io.sentry.SentryClient;
import o.getCutText;
import o.getExpand;
import o.getGetScrollViewportLength;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FirestoreGrpc {
    public static volatile SentryClient IconCompatParcelizer;
    public static volatile SentryClient serializer;

    public static final int initialLegIndex(getCutText getcuttext) {
        getcuttext.getClass();
        if (getcuttext instanceof SetRoutes$Alternatives) {
            return ((SetRoutes$Alternatives) getcuttext).legIndex;
        }
        if (getcuttext instanceof SetRoutes$Reorder) {
            return ((SetRoutes$Reorder) getcuttext).legIndex;
        }
        if (getcuttext.equals(SetRoutes$CleanUp.INSTANCE)) {
            return 0;
        }
        if (getcuttext instanceof SetRoutes$NewRoutes) {
            return ((SetRoutes$NewRoutes) getcuttext).legIndex;
        }
        if (getcuttext instanceof getExpand) {
            return 0;
        }
        if (getcuttext instanceof SetRoutes$RefreshRoutes$RefreshControllerRefresh) {
            return ((RouteProgressData) ((SetRoutes$RefreshRoutes$RefreshControllerRefresh) getcuttext).routeRefreshResult.primaryRouteRefresherResult.routeProgressData).legIndex;
        }
        if (getcuttext instanceof SetRoutes$Reroute) {
            return ((SetRoutes$Reroute) getcuttext).legIndex;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return 0;
    }

    public static final String mapToReason(getCutText getcuttext) {
        getcuttext.getClass();
        if (getcuttext instanceof SetRoutes$Alternatives) {
            return "ROUTES_UPDATE_REASON_ALTERNATIVE";
        }
        if (getcuttext.equals(SetRoutes$CleanUp.INSTANCE)) {
            return "ROUTES_UPDATE_REASON_CLEAN_UP";
        }
        if ((getcuttext instanceof SetRoutes$NewRoutes) || (getcuttext instanceof SetRoutes$Reorder)) {
            return "ROUTES_UPDATE_REASON_NEW";
        }
        if (getcuttext instanceof getGetScrollViewportLength) {
            return "ROUTES_UPDATE_REASON_REFRESH";
        }
        if (getcuttext instanceof SetRoutes$Reroute) {
            return "ROUTES_UPDATE_REASON_REROUTE";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
