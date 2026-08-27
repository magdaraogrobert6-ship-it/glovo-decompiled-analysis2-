package com.mapbox.navigation.core;

import androidx.collection.ObjectList$toString$1;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.DecodeUtilsExKt;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.base.utils.DecodeUtils$removeAllRoutesExcept$1$1$1$1;
import com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1;
import com.mapbox.navigation.core.directions.session.RoutesObserver;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.preview.RoutesPreview;
import com.mapbox.navigation.core.preview.RoutesPreviewUpdate;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesCacheClearer implements RoutesObserver {
    public List currentActiveRoutes;
    public List currentPreviewsRoutes;

    public final void routesPreviewUpdated(RoutesPreviewUpdate routesPreviewUpdate) {
        routesPreviewUpdate.getClass();
        RoutesPreview routesPreview = routesPreviewUpdate.routesPreview;
        this.currentPreviewsRoutes = routesPreview != null ? routesPreview.routesList : null;
        List list = routesPreview != null ? routesPreview.routesList : null;
        if ((list == null || list.isEmpty()) && this.currentActiveRoutes.isEmpty()) {
            DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
            DecodeUtilsExKt.clearCache();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v40, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.ArrayList] */
    @Override // com.mapbox.navigation.core.directions.session.RoutesObserver
    public final void onRoutesChanged(RoutesUpdatedResult routesUpdatedResult) {
        ?? arrayList;
        List list;
        routesUpdatedResult.getClass();
        List list2 = routesUpdatedResult.navigationRoutes;
        this.currentActiveRoutes = list2;
        if (list2.isEmpty() && ((list = this.currentPreviewsRoutes) == null || list.isEmpty())) {
            DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
            DecodeUtilsExKt.clearCache();
            return;
        }
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$2 = DecodeUtils.completeGeometryDecodeCache;
        List list3 = routesUpdatedResult.navigationRoutes;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((NavigationRoute) it.next()).directionsRoute);
        }
        List list4 = this.currentPreviewsRoutes;
        if (list4 != null) {
            List list5 = list4;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList.add(((NavigationRoute) it2.next()).directionsRoute);
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = instance_delegatelambda0.write;
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Iterable) arrayList, arrayList2);
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (!PerformanceTracker.getTrackingIsActive()) {
            synchronized (DecodeUtils.stepsGeometryDecodeCache) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("Looking for routes to remove among cached: " + onContentCardDismissed.IconCompatParcelizer(DecodeUtils.cachedRoutes.IconCompatParcelizer, ",", null, null, DecodeUtils$removeAllRoutesExcept$1$1$1$1.INSTANCE, 30) + ", while " + onContentCardDismissed.IconCompatParcelizer(arrayListIconCompatParcelizer, ",", null, null, DecodeUtils$removeAllRoutesExcept$1$1$1$1.INSTANCE$1, 30) + " should be kept", "DecodeUtils");
                }
                for (DecodeUtils.CachedRouteInfo cachedRouteInfo : DecodeUtils.cachedRoutes.filter(new ObjectList$toString$1(20, arrayListIconCompatParcelizer))) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cleaning steps geometry caches for route: ");
                        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$3 = DecodeUtils.completeGeometryDecodeCache;
                        sb.append(DecodeUtils.routeIdForLogs(cachedRouteInfo.route));
                        LoggerProviderKt.logD(sb.toString(), "DecodeUtils");
                    }
                    List<RouteLeg> listLegs = cachedRouteInfo.route.legs();
                    if (listLegs != null) {
                        Iterator it3 = listLegs.iterator();
                        while (it3.hasNext()) {
                            List<LegStep> listSteps = ((RouteLeg) it3.next()).steps();
                            if (listSteps != null) {
                                Iterator it4 = listSteps.iterator();
                                while (it4.hasNext()) {
                                    String strGeometry = ((LegStep) it4.next()).geometry();
                                    if (strGeometry != null) {
                                        DecodeUtils.stepsGeometryDecodeCache.remove(new onViewAttachedToWindowlambda0(strGeometry, Integer.valueOf(cachedRouteInfo.precision)));
                                    }
                                }
                            }
                        }
                    }
                    u$a u_a = DecodeUtils.cachedRoutes;
                    u_a.getClass();
                    u_a.IconCompatParcelizer.remove(cachedRouteInfo);
                }
            }
            return;
        }
        PerformanceTracker.syncSectionStarted("DecodeUtils.removeAllRoutesExcept");
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            synchronized (DecodeUtils.stepsGeometryDecodeCache) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("Looking for routes to remove among cached: " + onContentCardDismissed.IconCompatParcelizer(DecodeUtils.cachedRoutes.IconCompatParcelizer, ",", null, null, DecodeUtils$removeAllRoutesExcept$1$1$1$1.INSTANCE, 30) + ", while " + onContentCardDismissed.IconCompatParcelizer(arrayListIconCompatParcelizer, ",", null, null, DecodeUtils$removeAllRoutesExcept$1$1$1$1.INSTANCE$1, 30) + " should be kept", "DecodeUtils");
                }
                for (DecodeUtils.CachedRouteInfo cachedRouteInfo2 : DecodeUtils.cachedRoutes.filter(new ObjectList$toString$1(20, arrayListIconCompatParcelizer))) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cleaning steps geometry caches for route: ");
                        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$4 = DecodeUtils.completeGeometryDecodeCache;
                        sb2.append(DecodeUtils.routeIdForLogs(cachedRouteInfo2.route));
                        LoggerProviderKt.logD(sb2.toString(), "DecodeUtils");
                    }
                    List<RouteLeg> listLegs2 = cachedRouteInfo2.route.legs();
                    if (listLegs2 != null) {
                        Iterator it5 = listLegs2.iterator();
                        while (it5.hasNext()) {
                            List<LegStep> listSteps2 = ((RouteLeg) it5.next()).steps();
                            if (listSteps2 != null) {
                                Iterator it6 = listSteps2.iterator();
                                while (it6.hasNext()) {
                                    String strGeometry2 = ((LegStep) it6.next()).geometry();
                                    if (strGeometry2 != null) {
                                        DecodeUtils.stepsGeometryDecodeCache.remove(new onViewAttachedToWindowlambda0(strGeometry2, Integer.valueOf(cachedRouteInfo2.precision)));
                                    }
                                }
                            }
                        }
                    }
                    u$a u_a2 = DecodeUtils.cachedRoutes;
                    u_a2.getClass();
                    u_a2.IconCompatParcelizer.remove(cachedRouteInfo2);
                }
            }
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DecodeUtils.removeAllRoutesExcept", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DecodeUtils.removeAllRoutesExcept", null);
            throw th;
        }
    }
}
