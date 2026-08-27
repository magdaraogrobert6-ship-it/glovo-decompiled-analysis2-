package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.sqlite.SQLite;
import com.google.gson.JsonObject;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsRouteFBWrapper;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.base.utils.DecodeUtils$stepsGeometryDecodeCache$1;
import com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineGranularDistances;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ReversedListReadOnly;
import kotlin.jvm.internal.Lambda;
import o.BrazeInAppMessageManagerWhenMappings;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$extractRouteData$1 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final MapboxRouteLineUtils$extractRouteData$1 INSTANCE;
    public static final MapboxRouteLineUtils$extractRouteData$1 INSTANCE$1;
    public static final MapboxRouteLineUtils$extractRouteData$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$extractRouteData$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:119:0x030a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0165  */
    /* JADX WARN: Code duplicated, block: B:52:0x0196  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x030a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ?? arrayList;
        Iterator it;
        String str;
        String str2;
        Feature featureFromGeometry;
        int i = this.$r8$classId;
        List<Point> orDecode = instance_delegatelambda0.write;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                NavigationRoute navigationRoute = (NavigationRoute) obj;
                String str3 = (String) obj2;
                navigationRoute.getClass();
                DirectionsRoute directionsRoute = navigationRoute.directionsRoute;
                DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
                DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$2 = DecodeUtils.completeGeometryDecodeCache;
                directionsRoute.getClass();
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("DirectionsRoute.completeGeometryToPoints");
                    try {
                        BrazeInAppMessageManagerWhenMappings.write();
                        if (directionsRoute instanceof DirectionsRouteFBWrapper) {
                            List<Point> geometryNumeric$base_release = ((DirectionsRouteFBWrapper) directionsRoute).getGeometryNumeric$base_release();
                            if (geometryNumeric$base_release != null) {
                                orDecode = geometryNumeric$base_release;
                            }
                        } else {
                            orDecode = DecodeUtils.getOrDecode(decodeUtils$stepsGeometryDecodeCache$1, directionsRoute.geometry(), DecodeUtils.precision(directionsRoute));
                        }
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.completeGeometryToPoints", null);
                    } catch (Throwable th) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("DirectionsRoute.completeGeometryToPoints", null);
                        throw th;
                    }
                } else if (directionsRoute instanceof DirectionsRouteFBWrapper) {
                    List<Point> geometryNumeric$base_release2 = ((DirectionsRouteFBWrapper) directionsRoute).getGeometryNumeric$base_release();
                    if (geometryNumeric$base_release2 != null) {
                        orDecode = geometryNumeric$base_release2;
                    }
                } else {
                    orDecode = DecodeUtils.getOrDecode(decodeUtils$stepsGeometryDecodeCache$1, directionsRoute.geometry(), DecodeUtils.precision(directionsRoute));
                }
                LineString lineStringFromLngLats = LineString.fromLngLats(new ReversedListReadOnly(orDecode));
                String str4 = navigationRoute.id;
                if (str3 == null) {
                    featureFromGeometry = Feature.fromGeometry(lineStringFromLngLats, (JsonObject) null, str4);
                } else {
                    Feature featureFromGeometry2 = Feature.fromGeometry(lineStringFromLngLats, (JsonObject) null, str4);
                    featureFromGeometry2.addBooleanProperty(str3, Boolean.TRUE);
                    featureFromGeometry = featureFromGeometry2;
                }
                FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures((List<Feature>) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{featureFromGeometry}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                featureCollectionFromFeatures.getClass();
                return new RouteFeatureData(navigationRoute, featureCollectionFromFeatures, lineStringFromLngLats.coordinates().size());
            }
            NavigationRoute navigationRoute2 = (NavigationRoute) obj;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
            navigationRoute2.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            List list = (List) MapboxRouteLineUtils.extractRouteData.invoke(navigationRoute2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (Object obj3 : list) {
                if (i3 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                ExtractedRouteData extractedRouteData = (ExtractedRouteData) obj3;
                if (i3 == 0 || ((ExtractedRouteData) list.get(i3)).isLegOrigin) {
                    arrayList2.add(obj3);
                } else {
                    int i4 = i3 - 1;
                    String str5 = ((ExtractedRouteData) list.get(i4)).trafficCongestionIdentifier;
                    String str6 = extractedRouteData.trafficCongestionIdentifier;
                    String str7 = extractedRouteData.roadClass;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, str6}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ExtractedRouteData) list.get(i4)).roadClass, str7}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ExtractedRouteData) list.get(i4)).trafficCongestionIdentifier, extractedRouteData.trafficCongestionIdentifier}, getCieXyz.write())).booleanValue() || str7 != null) {
                                arrayList2.add(obj3);
                            }
                        }
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ExtractedRouteData) list.get(i4)).trafficCongestionIdentifier, extractedRouteData.trafficCongestionIdentifier}, getCieXyz.write())).booleanValue()) {
                            arrayList2.add(obj3);
                        } else {
                            arrayList2.add(obj3);
                        }
                    }
                }
                i3++;
            }
            return arrayList2;
        }
        NavigationRoute navigationRoute3 = (NavigationRoute) obj;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
        navigationRoute3.getClass();
        DirectionsRoute directionsRoute2 = navigationRoute3.directionsRoute;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        ArrayList arrayList3 = new ArrayList();
        RouteLineGranularDistances routeLineGranularDistances = (RouteLineGranularDistances) MapboxRouteLineUtils.granularDistancesProvider.invoke(navigationRoute3);
        if (routeLineGranularDistances != null) {
            RouteLineDistancesIndex[][] routeLineDistancesIndexArr = routeLineGranularDistances.legsDistances;
            int length = routeLineDistancesIndexArr.length;
            List<RouteLeg> listLegs = directionsRoute2.legs();
            if (length == (listLegs != null ? listLegs.size() : 0)) {
                List<RouteLeg> listLegs2 = directionsRoute2.legs();
                if (listLegs2 != null) {
                    Iterator it2 = listLegs2.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (i5 < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        RouteLeg routeLeg = (RouteLeg) next;
                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                        routeLeg.getClass();
                        List<Closure> listClosures = routeLeg.closures();
                        if (listClosures != null) {
                            List<Closure> list2 = listClosures;
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                            for (Closure closure : list2) {
                                Integer numGeometryIndexStart = closure.geometryIndexStart();
                                numGeometryIndexStart.getClass();
                                int iIntValue = numGeometryIndexStart.intValue();
                                Integer numGeometryIndexEnd = closure.geometryIndexEnd();
                                numGeometryIndexEnd.getClass();
                                arrayList.add(new ensureSubscribedToInAppMessageEventslambda7(iIntValue, numGeometryIndexEnd.intValue(), i2));
                            }
                        } else {
                            arrayList = orDecode;
                        }
                        Iterable iterable = (Iterable) arrayList;
                        MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                        String[] roadClassArray$ui_maps_release = MapboxRouteLineUtils.getRoadClassArray$ui_maps_release(routeLeg.steps());
                        List list3 = (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(routeLeg);
                        RouteLineDistancesIndex[] routeLineDistancesIndexArr2 = routeLineDistancesIndexArr[i5];
                        int length2 = routeLineDistancesIndexArr2.length;
                        int i6 = 0;
                        int i7 = 0;
                        while (i7 < length2) {
                            RouteLineDistancesIndex routeLineDistancesIndex = routeLineDistancesIndexArr2[i7];
                            Iterator it3 = iterable.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    it = it2;
                                    List list4 = list3;
                                    if (list4 != null && !list4.isEmpty() && i6 < list3.size()) {
                                        str = (String) list3.get(i6);
                                        break;
                                    }
                                    str = SystemUtils.UNKNOWN;
                                    break;
                                }
                                it = it2;
                                if (((ensureSubscribedToInAppMessageEventslambda7) it3.next()).serializer(i6)) {
                                    str = "closed";
                                    break;
                                }
                                it2 = it;
                            }
                            MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                            List<Point> list5 = orDecode;
                            int i8 = i6;
                            while (true) {
                                if (roadClassArray$ui_maps_release.length == 0 || roadClassArray$ui_maps_release.length <= i8 || i8 < 0) {
                                    str2 = null;
                                    break;
                                }
                                str2 = roadClassArray$ui_maps_release[i8];
                                if (str2 != null) {
                                    break;
                                }
                                i8--;
                            }
                            RouteLineDistancesIndex[][] routeLineDistancesIndexArr3 = routeLineDistancesIndexArr;
                            int i9 = i7;
                            double d = 1.0d - (routeLineDistancesIndex.distanceRemaining / routeLineGranularDistances.completeDistance);
                            arrayList3.add(new ExtractedRouteData(d, str, str2, i5, i6 == 0));
                            i7 = i9 + 1;
                            i6++;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                            roadClassArray$ui_maps_release = roadClassArray$ui_maps_release;
                            routeLineDistancesIndexArr = routeLineDistancesIndexArr3;
                            list3 = list3;
                            orDecode = list5;
                            routeLineDistancesIndexArr2 = routeLineDistancesIndexArr2;
                            length2 = length2;
                            it2 = it;
                        }
                        i5++;
                        i2 = 1;
                    }
                }
            } else if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                LoggerProviderKt.logE("Unable to produce route granular distances for '" + navigationRoute3.id + "'.", "MapboxRouteLineUtils");
            }
        } else if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
            LoggerProviderKt.logE("Unable to produce route granular distances for '" + navigationRoute3.id + "'.", "MapboxRouteLineUtils");
        }
        return arrayList3;
    }

    static {
        int i = 2;
        INSTANCE = new MapboxRouteLineUtils$extractRouteData$1(i, 0);
        INSTANCE$1 = new MapboxRouteLineUtils$extractRouteData$1(i, 1);
        INSTANCE$2 = new MapboxRouteLineUtils$extractRouteData$1(i, i);
    }
}
