package com.mapbox.navigation.base.utils;

import androidx.collection.LruCache;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsRouteFBWrapper;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.LegStepFBWrapper;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.utils.PolylineUtils;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.accessgetInstancedelegatecp;
import o.disposeCurrentNodes;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DecodeUtils {
    public static final u$a cachedRoutes = new u$a(9);
    public static final DecodeUtils$stepsGeometryDecodeCache$1 completeGeometryDecodeCache;
    public static final DecodeUtils$stepsGeometryDecodeCache$1 stepsGeometryDecodeCache;

    public final class CachedRouteInfo {
        public final int precision;
        public final DirectionsRoute route;

        public final int hashCode() {
            return Integer.hashCode(this.precision) + (this.route.hashCode() * 31);
        }

        public CachedRouteInfo(DirectionsRoute directionsRoute, int i) {
            directionsRoute.getClass();
            this.route = directionsRoute;
            this.precision = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedRouteInfo)) {
                return false;
            }
            CachedRouteInfo cachedRouteInfo = (CachedRouteInfo) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, cachedRouteInfo.route}, getCieXyz.write())).booleanValue() && this.precision == cachedRouteInfo.precision;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CachedRouteInfo(route=");
            sb.append(this.route);
            sb.append(", precision=");
            return af$$ExternalSyntheticOutline0.m(sb, this.precision, ')');
        }
    }

    public static List getOrDecode(LruCache lruCache, String str, int i) {
        List<Point> list;
        List<Point> listDecode;
        if (str == null) {
            return instance_delegatelambda0.write;
        }
        synchronized (lruCache) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(str, Integer.valueOf(i));
            list = (List) lruCache.get(onviewattachedtowindowlambda0);
            if (list == null) {
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("DecodeUtils.decode-cache-miss");
                    try {
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        listDecode = PolylineUtils.decode(str, i);
                        lruCache.put(onviewattachedtowindowlambda0, listDecode);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DecodeUtils.decode-cache-miss", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DecodeUtils.decode-cache-miss", null);
                        throw th;
                    }
                } else {
                    listDecode = PolylineUtils.decode(str, i);
                    lruCache.put(onviewattachedtowindowlambda0, listDecode);
                }
                list = listDecode;
            }
        }
        return list;
    }

    public static String routeIdForLogs(DirectionsRoute directionsRoute) {
        return directionsRoute.requestUuid() + '#' + directionsRoute.routeIndex();
    }

    public static final List stepGeometryToPoints(DirectionsRoute directionsRoute, LegStep legStep) {
        directionsRoute.getClass();
        legStep.getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = stepsGeometryDecodeCache;
        List<Point> list = instance_delegatelambda0.write;
        if (!trackingIsActive) {
            if (legStep instanceof LegStepFBWrapper) {
                List<Point> geometryNumeric$base_release = ((LegStepFBWrapper) legStep).getGeometryNumeric$base_release();
                return geometryNumeric$base_release == null ? list : geometryNumeric$base_release;
            }
            int iPrecision = precision(directionsRoute);
            cacheRoute(directionsRoute, iPrecision);
            return getOrDecode(decodeUtils$stepsGeometryDecodeCache$1, legStep.geometry(), iPrecision);
        }
        PerformanceTracker.syncSectionStarted("DirectionsRoute.stepGeometryToPoints");
        try {
            BrazeInAppMessageManagerWhenMappings.write();
            if (!(legStep instanceof LegStepFBWrapper)) {
                int iPrecision2 = precision(directionsRoute);
                cacheRoute(directionsRoute, iPrecision2);
                return getOrDecode(decodeUtils$stepsGeometryDecodeCache$1, legStep.geometry(), iPrecision2);
            }
            List<Point> geometryNumeric$base_release2 = ((LegStepFBWrapper) legStep).getGeometryNumeric$base_release();
            if (geometryNumeric$base_release2 != null) {
                list = geometryNumeric$base_release2;
            }
            return list;
        } finally {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.stepGeometryToPoints", null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public static final List stepsGeometryToPoints(DirectionsRoute directionsRoute) {
        ArrayList arrayList;
        ?? arrayList2;
        ArrayList arrayList3;
        ?? arrayList4;
        List<LegStep> listSteps;
        ?? arrayList5;
        ?? arrayList6;
        List<LegStep> listSteps2;
        directionsRoute.getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = stepsGeometryDecodeCache;
        List<Point> list = instance_delegatelambda0.write;
        ArrayList arrayList7 = null;
        if (!trackingIsActive) {
            if (directionsRoute instanceof DirectionsRouteFBWrapper) {
                List<RouteLeg> listLegs = ((DirectionsRouteFBWrapper) directionsRoute).legs();
                if (listLegs != null) {
                    List<RouteLeg> list2 = listLegs;
                    ArrayList arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                    for (RouteLeg routeLeg : list2) {
                        if (routeLeg == null || (listSteps2 = routeLeg.steps()) == null) {
                            arrayList6 = 0;
                        } else {
                            List<LegStep> list3 = listSteps2;
                            arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                            for (LegStep legStep : list3) {
                                legStep.getClass();
                                List<Point> geometryNumeric$base_release = ((LegStepFBWrapper) legStep).getGeometryNumeric$base_release();
                                if (geometryNumeric$base_release == null) {
                                    geometryNumeric$base_release = list;
                                }
                                arrayList6.add(geometryNumeric$base_release);
                            }
                        }
                        if (arrayList6 == 0) {
                            arrayList6 = list;
                        }
                        arrayList8.add(arrayList6);
                    }
                    arrayList7 = arrayList8;
                }
                if (arrayList7 != null) {
                    return arrayList7;
                }
            } else {
                int iPrecision = precision(directionsRoute);
                cacheRoute(directionsRoute, iPrecision);
                List<RouteLeg> listLegs2 = directionsRoute.legs();
                if (listLegs2 != null) {
                    List<RouteLeg> list4 = listLegs2;
                    ArrayList arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        List<LegStep> listSteps3 = ((RouteLeg) it.next()).steps();
                        if (listSteps3 != null) {
                            List<LegStep> list5 = listSteps3;
                            arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(getOrDecode(decodeUtils$stepsGeometryDecodeCache$1, ((LegStep) it2.next()).geometry(), iPrecision));
                            }
                        } else {
                            arrayList5 = 0;
                        }
                        if (arrayList5 == 0) {
                            arrayList5 = list;
                        }
                        arrayList9.add(arrayList5);
                    }
                    arrayList7 = arrayList9;
                }
                if (arrayList7 != null) {
                    return arrayList7;
                }
            }
            return list;
        }
        PerformanceTracker.syncSectionStarted("DirectionsRoute.stepsGeometryToPoints");
        try {
            BrazeInAppMessageManagerWhenMappings.write();
            if (!(directionsRoute instanceof DirectionsRouteFBWrapper)) {
                int iPrecision2 = precision(directionsRoute);
                cacheRoute(directionsRoute, iPrecision2);
                List<RouteLeg> listLegs3 = directionsRoute.legs();
                if (listLegs3 != null) {
                    List<RouteLeg> list6 = listLegs3;
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        List<LegStep> listSteps4 = ((RouteLeg) it3.next()).steps();
                        if (listSteps4 != null) {
                            List<LegStep> list7 = listSteps4;
                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                            Iterator it4 = list7.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(getOrDecode(decodeUtils$stepsGeometryDecodeCache$1, ((LegStep) it4.next()).geometry(), iPrecision2));
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = list;
                        }
                        arrayList.add(arrayList2);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    list = arrayList;
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.stepsGeometryToPoints", null);
                return list;
            }
            List<RouteLeg> listLegs4 = ((DirectionsRouteFBWrapper) directionsRoute).legs();
            if (listLegs4 != null) {
                List<RouteLeg> list8 = listLegs4;
                arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                for (RouteLeg routeLeg2 : list8) {
                    if (routeLeg2 == null || (listSteps = routeLeg2.steps()) == null) {
                        arrayList4 = 0;
                    } else {
                        List<LegStep> list9 = listSteps;
                        arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list9, 10));
                        for (LegStep legStep2 : list9) {
                            legStep2.getClass();
                            List<Point> geometryNumeric$base_release2 = ((LegStepFBWrapper) legStep2).getGeometryNumeric$base_release();
                            if (geometryNumeric$base_release2 == null) {
                                geometryNumeric$base_release2 = list;
                            }
                            arrayList4.add(geometryNumeric$base_release2);
                        }
                    }
                    if (arrayList4 == 0) {
                        arrayList4 = list;
                    }
                    arrayList3.add(arrayList4);
                }
            } else {
                arrayList3 = null;
            }
            if (arrayList3 != null) {
                list = arrayList3;
            }
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.stepsGeometryToPoints", null);
            return list;
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.stepsGeometryToPoints", null);
            throw th;
        }
    }

    public static void cacheRoute(DirectionsRoute directionsRoute, int i) {
        List<RouteLeg> listLegs;
        List<RouteLeg> listLegs2;
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (!PerformanceTracker.getTrackingIsActive()) {
            synchronized (stepsGeometryDecodeCache) {
                disposeCurrentNodes disposecurrentnodesAdd = cachedRoutes.add(directionsRoute, i);
                if (disposecurrentnodesAdd instanceof DecodeUtils$RouteList$AddResult$Reordered) {
                    return;
                }
                if (!(disposecurrentnodesAdd instanceof DecodeUtils$RouteList$AddResult$Added)) {
                    throw new NoWhenBranchMatchedException();
                }
                CachedRouteInfo cachedRouteInfo = ((DecodeUtils$RouteList$AddResult$Added) disposecurrentnodesAdd).evicted;
                if (cachedRouteInfo != null && (listLegs2 = cachedRouteInfo.route.legs()) != null) {
                    Iterator<T> it = listLegs2.iterator();
                    while (it.hasNext()) {
                        List<LegStep> listSteps = ((RouteLeg) it.next()).steps();
                        if (listSteps != null) {
                            Iterator<T> it2 = listSteps.iterator();
                            while (it2.hasNext()) {
                                String strGeometry = ((LegStep) it2.next()).geometry();
                                if (strGeometry != null) {
                                    stepsGeometryDecodeCache.remove(new onViewAttachedToWindowlambda0(strGeometry, Integer.valueOf(cachedRouteInfo.precision)));
                                }
                            }
                        }
                    }
                }
                return;
            }
        }
        PerformanceTracker.syncSectionStarted("DecodeUtils.cacheRoute");
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            synchronized (stepsGeometryDecodeCache) {
                disposeCurrentNodes disposecurrentnodesAdd2 = cachedRoutes.add(directionsRoute, i);
                if (!(disposecurrentnodesAdd2 instanceof DecodeUtils$RouteList$AddResult$Reordered)) {
                    if (!(disposecurrentnodesAdd2 instanceof DecodeUtils$RouteList$AddResult$Added)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CachedRouteInfo cachedRouteInfo2 = ((DecodeUtils$RouteList$AddResult$Added) disposecurrentnodesAdd2).evicted;
                    if (cachedRouteInfo2 != null && (listLegs = cachedRouteInfo2.route.legs()) != null) {
                        Iterator<T> it3 = listLegs.iterator();
                        while (it3.hasNext()) {
                            List<LegStep> listSteps2 = ((RouteLeg) it3.next()).steps();
                            if (listSteps2 != null) {
                                Iterator<T> it4 = listSteps2.iterator();
                                while (it4.hasNext()) {
                                    String strGeometry2 = ((LegStep) it4.next()).geometry();
                                    if (strGeometry2 != null) {
                                        stepsGeometryDecodeCache.remove(new onViewAttachedToWindowlambda0(strGeometry2, Integer.valueOf(cachedRouteInfo2.precision)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DecodeUtils.cacheRoute", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DecodeUtils.cacheRoute", null);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1] */
    static {
        final int i = 75000;
        final int i2 = 1;
        completeGeometryDecodeCache = new LruCache(i) { // from class: com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1
            @Override // androidx.collection.LruCache
            public final int sizeOf(Object obj, Object obj2) {
                if (i2 != 0) {
                    List list = (List) obj2;
                    ((onViewAttachedToWindowlambda0) obj).getClass();
                    list.getClass();
                    int size = list.size();
                    if (size < 1) {
                        return 1;
                    }
                    return size;
                }
                List list2 = (List) obj2;
                ((onViewAttachedToWindowlambda0) obj).getClass();
                list2.getClass();
                int size2 = list2.size();
                if (size2 < 1) {
                    return 1;
                }
                return size2;
            }
        };
        final int i3 = 150000;
        final int i4 = 0;
        stepsGeometryDecodeCache = new LruCache(i3) { // from class: com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1
            @Override // androidx.collection.LruCache
            public final int sizeOf(Object obj, Object obj2) {
                if (i4 != 0) {
                    List list = (List) obj2;
                    ((onViewAttachedToWindowlambda0) obj).getClass();
                    list.getClass();
                    int size = list.size();
                    if (size < 1) {
                        return 1;
                    }
                    return size;
                }
                List list2 = (List) obj2;
                ((onViewAttachedToWindowlambda0) obj).getClass();
                list2.getClass();
                int size2 = list2.size();
                if (size2 < 1) {
                    return 1;
                }
                return size2;
            }
        };
    }

    public static int precision(DirectionsRoute directionsRoute) {
        RouteOptions routeOptions = directionsRoute.routeOptions();
        String strGeometries = routeOptions != null ? routeOptions.geometries() : null;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strGeometries, "polyline"}, getCieXyz.write())).booleanValue() ? 5 : 6;
    }
}
