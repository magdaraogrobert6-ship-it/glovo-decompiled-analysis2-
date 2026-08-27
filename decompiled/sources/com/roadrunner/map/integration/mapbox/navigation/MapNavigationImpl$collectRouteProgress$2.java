package com.roadrunner.map.integration.mapbox.navigation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.navigation.base.internal.CoalescingBlockingQueue$Item;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusherProvider;
import com.mapbox.navigation.ui.maps.route.line.api.HeavyRouteLineValueProvider;
import com.mapbox.navigation.ui.maps.route.line.api.LineGradientCommandApplier;
import com.mapbox.navigation.ui.maps.route.line.api.LineTrimCommandApplier;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$setNewRouteData$2$1;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$updateWithRouteProgress$1;
import com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder;
import com.mapbox.navigation.ui.maps.route.line.api.VanishingRouteLine;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineError;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineGranularDistances;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineUpdateValue;
import com.mapbox.navigation.ui.maps.route.line.model.VanishingPointState;
import com.mapbox.navigation.ui.maps.route.line.model.VanishingRouteLineExpressions;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.turf.TurfException;
import com.mapbox.turf.models.LineIntersectsResult;
import com.roadrunner.map.integration.mapbox.maneuver.ManeuverApi;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda4;
import com.roadrunner.map.integration.mapbox.tripprogress.TripProgressApi;
import com.sentiance.core.model.events.N$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ContextScope;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.accessgetGocp;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.gd;
import o.ge;
import o.getOrElse;
import o.getQueryParameterslambda2;
import o.getSimplefcGXIks;
import o.i0;
import o.ia;
import o.instance_delegatelambda0;
import o.isItemViewSwipeEnabled;
import o.k7ExternalSyntheticLambda9;
import o.kg;
import o.lc;
import o.m7;
import o.n6;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.setRectOutlinetz77jQwdefault;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$collectRouteProgress$2 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ MapboxMap read;
    public final /* synthetic */ MapNavigationImpl serializer;

    public /* synthetic */ MapNavigationImpl$collectRouteProgress$2(MapNavigationImpl mapNavigationImpl, MapboxMap mapboxMap, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mapNavigationImpl;
        this.read = mapboxMap;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:105:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:108:0x03da  */
    /* JADX WARN: Code duplicated, block: B:113:0x03e9 A[PHI: r23 r43
  0x03e9: PHI (r23v6 o.m7) = (r23v7 o.m7), (r23v8 o.m7) binds: [B:112:0x03e7, B:101:0x03b8] A[DONT_GENERATE, DONT_INLINE]
  0x03e9: PHI (r43v7 com.mapbox.maps.Style) = (r43v8 com.mapbox.maps.Style), (r43v9 com.mapbox.maps.Style) binds: [B:112:0x03e7, B:101:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0462  */
    /* JADX WARN: Code duplicated, block: B:133:0x0115 A[EDGE_INSN: B:133:0x0115->B:48:0x0115 BREAK  A[LOOP:0: B:45:0x0109->B:47:0x0112], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[PHI: r5
  0x00cf: PHI (r5v12 java.lang.Integer) = (r5v11 java.lang.Integer), (r5v59 java.lang.Integer) binds: [B:37:0x00cd, B:34:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[LOOP:0: B:45:0x0109->B:47:0x0112, LOOP_START, PHI: r9
  0x0109: PHI (r9v15 int) = (r9v5 int), (r9v16 int) binds: [B:44:0x0107, B:47:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[LOOP:0: B:45:0x0109->B:47:0x0112, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x023c  */
    /* JADX WARN: Code duplicated, block: B:62:0x027a  */
    /* JADX WARN: Code duplicated, block: B:63:0x028b  */
    /* JADX WARN: Code duplicated, block: B:66:0x029b  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x02da  */
    /* JADX WARN: Code duplicated, block: B:80:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0305  */
    /* JADX WARN: Code duplicated, block: B:84:0x0322  */
    /* JADX WARN: Code duplicated, block: B:85:0x032b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0344  */
    /* JADX WARN: Code duplicated, block: B:89:0x034c  */
    /* JADX WARN: Code duplicated, block: B:91:0x034f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0371  */
    /* JADX WARN: Code duplicated, block: B:94:0x037a  */
    /* JADX WARN: Code duplicated, block: B:98:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:99:0x03a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00f8, please report this as an issue */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        VanishingPointState vanishingPointState;
        m7 m7Var;
        Style style;
        Expected expectedCreateError;
        VanishingRouteLineExpressions vanishingRouteLineExpressions;
        Integer num;
        int iIntValue;
        RouteLineDistancesIndex[] routeLineDistancesIndexArr;
        RouteLineDistancesIndex routeLineDistancesIndex;
        RouteLineGranularDistances routeLineGranularDistances;
        RouteLineDistancesIndex routeLineDistancesIndex2;
        Double dValueOf;
        double d;
        ArrayList arrayList;
        int iMax;
        Feature featureFromGeometry;
        int i;
        Number numberProperty;
        double dDoubleValue;
        Feature featureFromGeometry2;
        Feature featureFromGeometry3;
        int i2;
        Feature feature;
        double dLongitude;
        double dLatitude;
        double dLongitude2;
        double dLatitude2;
        double dLatitude3;
        double d2;
        double d3;
        double d4;
        double d5;
        LineIntersectsResult lineIntersectsResult;
        Feature featureFromGeometry4;
        Feature feature2;
        double d6;
        double d7;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = this.RemoteActionCompatParcelizer;
        if (i7 == 0) {
            return emit((RouteProgress) obj, shortNewsContentCardView);
        }
        int i8 = 1;
        if (i7 != 1) {
            return emit((RoutesUpdatedResult) obj, shortNewsContentCardView);
        }
        Point point = (Point) obj;
        m7 m7Var2 = this.serializer.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        point.getClass();
        Style styleDeprecated = this.read.getStyleDeprecated();
        if (styleDeprecated != null) {
            m7Var2.IconCompatParcelizer(styleDeprecated);
            MapboxRouteLineApi mapboxRouteLineApiIconCompatParcelizer = m7Var2.IconCompatParcelizer();
            mapboxRouteLineApiIconCompatParcelizer.getClass();
            long jNanoTime = System.nanoTime();
            VanishingRouteLine vanishingRouteLine = mapboxRouteLineApiIconCompatParcelizer.vanishingRouteLine;
            ShortNewsContentCardView shortNewsContentCardView2 = null;
            if (vanishingRouteLine != null) {
                int i9 = write + 99;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                vanishingPointState = vanishingRouteLine.vanishingPointState;
            } else {
                vanishingPointState = null;
            }
            if (vanishingPointState == VanishingPointState.DISABLED || jNanoTime - mapboxRouteLineApiIconCompatParcelizer.lastIndexUpdateTimeNano > 1.5E9d || jNanoTime - mapboxRouteLineApiIconCompatParcelizer.lastPointUpdateTimeNano < mapboxRouteLineApiIconCompatParcelizer.routeLineOptions.getVanishingRouteLineUpdateIntervalNano()) {
                m7Var = m7Var2;
                style = styleDeprecated;
                expectedCreateError = ExpectedFactory.createError(new RouteLineError("Vanishing point state is disabled or the update doesn't fall within the configured interval window."));
                expectedCreateError.getClass();
            } else if (point.equals(mapboxRouteLineApiIconCompatParcelizer.lastLocationPoint)) {
                expectedCreateError = ExpectedFactory.createError(new RouteLineError("Provided point is equal to the last update, skipping recalculation."));
                expectedCreateError.getClass();
                m7Var = m7Var2;
                style = styleDeprecated;
            } else {
                getOrElse getorelse = mapboxRouteLineApiIconCompatParcelizer.sender;
                getorelse.getClass();
                RouteLineHistoryRecordingPusherProvider.instance.pushEventIfEnabled(new FlowLiveDataConversions$asFlow$1$1(getorelse, point, shortNewsContentCardView2, 24));
                mapboxRouteLineApiIconCompatParcelizer.lastLocationPoint = point;
                NavigationRoute navigationRoute = mapboxRouteLineApiIconCompatParcelizer.primaryRoute;
                if (navigationRoute != null) {
                    mapboxRouteLineApiIconCompatParcelizer.startMemoryMonitoring();
                    Object objInvoke = MapboxRouteLineUtils.granularDistancesProvider.invoke(navigationRoute);
                    if (objInvoke != null) {
                        int i11 = IconCompatParcelizer + 81;
                        int i12 = i11 % Fields.SpotShadowColor;
                        write = i12;
                        int i13 = i11 % 2;
                        RouteLineGranularDistances routeLineGranularDistances2 = (RouteLineGranularDistances) objInvoke;
                        if (vanishingRouteLine != null) {
                            int i14 = i12 + 29;
                            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                            if (i14 % 2 != 0) {
                                num = vanishingRouteLine.upcomingRouteGeometrySegmentIndex;
                                int i15 = 25 / 0;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                    routeLineDistancesIndexArr = routeLineGranularDistances2.routeDistances;
                                    routeLineDistancesIndex = (RouteLineDistancesIndex) onContentCardClicked.IconCompatParcelizer(iIntValue, routeLineDistancesIndexArr);
                                    if (routeLineDistancesIndex == null) {
                                        int i16 = IconCompatParcelizer + 9;
                                        write = i16 % Fields.SpotShadowColor;
                                        int i17 = i16 % 2;
                                        LoggerProviderKt.logD("Upcoming route line index is null.", "VanishingRouteLine");
                                        m7Var = m7Var2;
                                        style = styleDeprecated;
                                        dValueOf = null;
                                    } else {
                                        if (iIntValue > 0) {
                                            arrayList = new ArrayList();
                                            iMax = Math.max(iIntValue - 10, 0);
                                            if (iMax <= iIntValue) {
                                                while (true) {
                                                    arrayList.add(routeLineDistancesIndexArr[iMax].point);
                                                    if (iMax != iIntValue) {
                                                        break;
                                                    }
                                                    iMax++;
                                                }
                                            }
                                            if (arrayList.size() >= 2) {
                                                throw new TurfException("Turf nearestPointOnLine requires a List of Points made up of at least 2 coordinates.");
                                            }
                                            featureFromGeometry = Feature.fromGeometry(Point.fromLngLat(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
                                            featureFromGeometry.addNumberProperty("dist", Double.valueOf(Double.POSITIVE_INFINITY));
                                            i = 0;
                                            while (i < arrayList.size() - i8) {
                                                featureFromGeometry2 = Feature.fromGeometry((Geometry) arrayList.get(i));
                                                int i18 = i + 1;
                                                featureFromGeometry3 = Feature.fromGeometry((Geometry) arrayList.get(i18));
                                                featureFromGeometry2.addNumberProperty("dist", Double.valueOf(TuplesKt.distance(point, (Point) featureFromGeometry2.geometry(), "meters")));
                                                featureFromGeometry3.addNumberProperty("dist", Double.valueOf(TuplesKt.distance(point, (Point) featureFromGeometry3.geometry(), "meters")));
                                                i2 = i;
                                                ArrayList arrayList2 = arrayList;
                                                RouteLineDistancesIndex routeLineDistancesIndex3 = routeLineDistancesIndex;
                                                feature = featureFromGeometry;
                                                double dMax = Math.max(featureFromGeometry2.properties().get("dist").getAsDouble(), featureFromGeometry3.properties().get("dist").getAsDouble());
                                                double dBearing = TuplesKt.bearing((Point) featureFromGeometry2.geometry(), (Point) featureFromGeometry3.geometry());
                                                Style style2 = styleDeprecated;
                                                m7 m7Var3 = m7Var2;
                                                RouteLineGranularDistances routeLineGranularDistances3 = routeLineGranularDistances2;
                                                Feature featureFromGeometry5 = Feature.fromGeometry(TuplesKt.destination(point, dMax, dBearing + 90.0d, "meters"));
                                                Feature featureFromGeometry6 = Feature.fromGeometry(TuplesKt.destination(point, dMax, dBearing - 90.0d, "meters"));
                                                dLongitude = ((Point) featureFromGeometry5.geometry()).longitude();
                                                dLatitude = ((Point) featureFromGeometry5.geometry()).latitude();
                                                double dLongitude3 = ((Point) featureFromGeometry6.geometry()).longitude();
                                                double dLatitude4 = ((Point) featureFromGeometry6.geometry()).latitude();
                                                dLongitude2 = ((Point) featureFromGeometry2.geometry()).longitude();
                                                dLatitude2 = ((Point) featureFromGeometry2.geometry()).latitude();
                                                double dLongitude4 = ((Point) featureFromGeometry3.geometry()).longitude();
                                                dLatitude3 = ((Point) featureFromGeometry3.geometry()).latitude() - dLatitude2;
                                                d2 = dLongitude3 - dLongitude;
                                                d3 = dLongitude4 - dLongitude2;
                                                d4 = dLatitude4 - dLatitude;
                                                d5 = (dLatitude3 * d2) - (d3 * d4);
                                                if (d5 == 0.0d) {
                                                    lineIntersectsResult = null;
                                                } else {
                                                    double d8 = dLatitude - dLatitude2;
                                                    double d9 = dLongitude - dLongitude2;
                                                    d6 = ((d3 * d8) - (dLatitude3 * d9)) / d5;
                                                    d7 = ((d8 * d2) - (d9 * d4)) / d5;
                                                    lineIntersectsResult = new LineIntersectsResult(Double.valueOf((d2 * d6) + dLongitude), Double.valueOf((d4 * d6) + dLatitude), false, false);
                                                    if (d6 >= 0.0d && d6 <= 1.0d) {
                                                        i5 = IconCompatParcelizer + 115;
                                                        write = i5 % Fields.SpotShadowColor;
                                                        if (i5 % 2 == 0) {
                                                            N$b builder = lineIntersectsResult.toBuilder();
                                                            builder.IconCompatParcelizer = Boolean.TRUE;
                                                            lineIntersectsResult = builder.build();
                                                            int i19 = 89 / 0;
                                                        } else {
                                                            N$b builder2 = lineIntersectsResult.toBuilder();
                                                            builder2.IconCompatParcelizer = Boolean.TRUE;
                                                            lineIntersectsResult = builder2.build();
                                                        }
                                                    }
                                                    if (d7 >= 0.0d) {
                                                        int i20 = write + 111;
                                                        i3 = i20 % Fields.SpotShadowColor;
                                                        IconCompatParcelizer = i3;
                                                        int i21 = i20 % 2;
                                                        if (d7 <= 1.0d) {
                                                            i4 = i3 + 63;
                                                            write = i4 % Fields.SpotShadowColor;
                                                            if (i4 % 2 == 0) {
                                                                N$b builder3 = lineIntersectsResult.toBuilder();
                                                                builder3.serializer = Boolean.TRUE;
                                                                lineIntersectsResult = builder3.build();
                                                                int i22 = 82 / 0;
                                                            } else {
                                                                N$b builder4 = lineIntersectsResult.toBuilder();
                                                                builder4.serializer = Boolean.TRUE;
                                                                lineIntersectsResult = builder4.build();
                                                            }
                                                        }
                                                    }
                                                    if (lineIntersectsResult.onLine1 || !lineIntersectsResult.onLine2) {
                                                        lineIntersectsResult = null;
                                                    }
                                                }
                                                if (lineIntersectsResult != null) {
                                                    featureFromGeometry4 = Feature.fromGeometry(Point.fromLngLat(lineIntersectsResult.horizontalIntersection.doubleValue(), lineIntersectsResult.verticalIntersection.doubleValue()));
                                                    featureFromGeometry4.addNumberProperty("dist", Double.valueOf(TuplesKt.distance(point, (Point) featureFromGeometry4.geometry(), "meters")));
                                                } else {
                                                    featureFromGeometry4 = null;
                                                }
                                                if (((Double) r31.getNumberProperty("dist")).doubleValue() < ((Double) feature.getNumberProperty("dist")).doubleValue()) {
                                                    r31.addNumberProperty("index", Integer.valueOf(i2));
                                                    feature2 = featureFromGeometry2;
                                                } else {
                                                    feature2 = feature;
                                                }
                                                if (((Double) featureFromGeometry3.getNumberProperty("dist")).doubleValue() < ((Double) feature2.getNumberProperty("dist")).doubleValue()) {
                                                    featureFromGeometry3.addNumberProperty("index", Integer.valueOf(i2));
                                                } else {
                                                    featureFromGeometry3 = feature2;
                                                }
                                                if (featureFromGeometry4 != null) {
                                                    int i23 = write + 19;
                                                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                                                    int i24 = i23 % 2;
                                                    if (((Double) featureFromGeometry4.getNumberProperty("dist")).doubleValue() < ((Double) featureFromGeometry3.getNumberProperty("dist")).doubleValue()) {
                                                        featureFromGeometry4.addNumberProperty("index", Integer.valueOf(i2));
                                                        featureFromGeometry = featureFromGeometry4;
                                                    } else {
                                                        featureFromGeometry = featureFromGeometry3;
                                                    }
                                                } else {
                                                    featureFromGeometry = featureFromGeometry3;
                                                }
                                                int i25 = IconCompatParcelizer + 27;
                                                write = i25 % Fields.SpotShadowColor;
                                                int i26 = i25 % 2;
                                                routeLineGranularDistances2 = routeLineGranularDistances3;
                                                routeLineDistancesIndex = routeLineDistancesIndex3;
                                                i = i18;
                                                arrayList = arrayList2;
                                                m7Var2 = m7Var3;
                                                i8 = 1;
                                                styleDeprecated = style2;
                                            }
                                            m7Var = m7Var2;
                                            routeLineGranularDistances = routeLineGranularDistances2;
                                            style = styleDeprecated;
                                            routeLineDistancesIndex2 = routeLineDistancesIndex;
                                            numberProperty = featureFromGeometry.getNumberProperty("dist");
                                            if (numberProperty != null) {
                                                dDoubleValue = numberProperty.doubleValue();
                                            } else {
                                                int i27 = write + 101;
                                                IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                                                int i28 = i27 % 2;
                                                dDoubleValue = 0.0d;
                                            }
                                            if (dDoubleValue > 10.0d) {
                                                dValueOf = null;
                                            }
                                        } else {
                                            m7Var = m7Var2;
                                            routeLineGranularDistances = routeLineGranularDistances2;
                                            style = styleDeprecated;
                                            routeLineDistancesIndex2 = routeLineDistancesIndex;
                                        }
                                        double d10 = routeLineDistancesIndex2.distanceRemaining;
                                        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                                        double dCalculateDistance$ui_maps_release = MapboxRouteLineUtils.calculateDistance$ui_maps_release(routeLineDistancesIndex2.point, point) + d10;
                                        double d11 = routeLineGranularDistances.completeDistance;
                                        d = d11 >= dCalculateDistance$ui_maps_release ? 1.0d - (dCalculateDistance$ui_maps_release / d11) : 0.0d;
                                        if (vanishingRouteLine.vanishingPointState == VanishingPointState.ONLY_INCREASE_PROGRESS || vanishingRouteLine.vanishPointOffset <= d) {
                                            dValueOf = Double.valueOf(d);
                                        } else {
                                            dValueOf = null;
                                        }
                                    }
                                    if (dValueOf != null) {
                                        double dDoubleValue2 = dValueOf.doubleValue();
                                        vanishingRouteLine.vanishPointOffset = dDoubleValue2;
                                        StylePropertyValue stylePropertyValue = new StylePropertyValue(new Value(1.0d - dDoubleValue2), StylePropertyValueKind.CONSTANT);
                                        int i29 = 1;
                                        vanishingRouteLineExpressions = new VanishingRouteLineExpressions(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue, 9), i29), new LineTrimCommandApplier()), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue, 8), i29), new LineTrimCommandApplier()), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue, 7), i29), new LineTrimCommandApplier()), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue, 6), i29), new LineTrimCommandApplier()));
                                    }
                                } else {
                                    m7Var = m7Var2;
                                    style = styleDeprecated;
                                }
                                vanishingRouteLineExpressions = null;
                            } else {
                                num = vanishingRouteLine.upcomingRouteGeometrySegmentIndex;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                    routeLineDistancesIndexArr = routeLineGranularDistances2.routeDistances;
                                    routeLineDistancesIndex = (RouteLineDistancesIndex) onContentCardClicked.IconCompatParcelizer(iIntValue, routeLineDistancesIndexArr);
                                    if (routeLineDistancesIndex == null) {
                                        int i110 = IconCompatParcelizer + 9;
                                        write = i110 % Fields.SpotShadowColor;
                                        int i111 = i110 % 2;
                                        LoggerProviderKt.logD("Upcoming route line index is null.", "VanishingRouteLine");
                                        m7Var = m7Var2;
                                        style = styleDeprecated;
                                        dValueOf = null;
                                    } else {
                                        if (iIntValue > 0) {
                                            arrayList = new ArrayList();
                                            iMax = Math.max(iIntValue - 10, 0);
                                            if (iMax <= iIntValue) {
                                                while (true) {
                                                    arrayList.add(routeLineDistancesIndexArr[iMax].point);
                                                    if (iMax != iIntValue) {
                                                        break;
                                                        break;
                                                    }
                                                    iMax++;
                                                }
                                            }
                                            if (arrayList.size() >= 2) {
                                                throw new TurfException("Turf nearestPointOnLine requires a List of Points made up of at least 2 coordinates.");
                                            }
                                            featureFromGeometry = Feature.fromGeometry(Point.fromLngLat(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
                                            featureFromGeometry.addNumberProperty("dist", Double.valueOf(Double.POSITIVE_INFINITY));
                                            i = 0;
                                            while (i < arrayList.size() - i8) {
                                                featureFromGeometry2 = Feature.fromGeometry((Geometry) arrayList.get(i));
                                                int i112 = i + 1;
                                                featureFromGeometry3 = Feature.fromGeometry((Geometry) arrayList.get(i112));
                                                featureFromGeometry2.addNumberProperty("dist", Double.valueOf(TuplesKt.distance(point, (Point) featureFromGeometry2.geometry(), "meters")));
                                                featureFromGeometry3.addNumberProperty("dist", Double.valueOf(TuplesKt.distance(point, (Point) featureFromGeometry3.geometry(), "meters")));
                                                i2 = i;
                                                ArrayList arrayList3 = arrayList;
                                                RouteLineDistancesIndex routeLineDistancesIndex4 = routeLineDistancesIndex;
                                                feature = featureFromGeometry;
                                                double dMax2 = Math.max(featureFromGeometry2.properties().get("dist").getAsDouble(), featureFromGeometry3.properties().get("dist").getAsDouble());
                                                double dBearing2 = TuplesKt.bearing((Point) featureFromGeometry2.geometry(), (Point) featureFromGeometry3.geometry());
                                                Style style3 = styleDeprecated;
                                                m7 m7Var4 = m7Var2;
                                                RouteLineGranularDistances routeLineGranularDistances4 = routeLineGranularDistances2;
                                                Feature featureFromGeometry7 = Feature.fromGeometry(TuplesKt.destination(point, dMax2, dBearing2 + 90.0d, "meters"));
                                                Feature featureFromGeometry8 = Feature.fromGeometry(TuplesKt.destination(point, dMax2, dBearing2 - 90.0d, "meters"));
                                                dLongitude = ((Point) featureFromGeometry7.geometry()).longitude();
                                                dLatitude = ((Point) featureFromGeometry7.geometry()).latitude();
                                                double dLongitude5 = ((Point) featureFromGeometry8.geometry()).longitude();
                                                double dLatitude5 = ((Point) featureFromGeometry8.geometry()).latitude();
                                                dLongitude2 = ((Point) featureFromGeometry2.geometry()).longitude();
                                                dLatitude2 = ((Point) featureFromGeometry2.geometry()).latitude();
                                                double dLongitude6 = ((Point) featureFromGeometry3.geometry()).longitude();
                                                dLatitude3 = ((Point) featureFromGeometry3.geometry()).latitude() - dLatitude2;
                                                d2 = dLongitude5 - dLongitude;
                                                d3 = dLongitude6 - dLongitude2;
                                                d4 = dLatitude5 - dLatitude;
                                                d5 = (dLatitude3 * d2) - (d3 * d4);
                                                if (d5 == 0.0d) {
                                                    lineIntersectsResult = null;
                                                } else {
                                                    double d12 = dLatitude - dLatitude2;
                                                    double d13 = dLongitude - dLongitude2;
                                                    d6 = ((d3 * d12) - (dLatitude3 * d13)) / d5;
                                                    d7 = ((d12 * d2) - (d13 * d4)) / d5;
                                                    lineIntersectsResult = new LineIntersectsResult(Double.valueOf((d2 * d6) + dLongitude), Double.valueOf((d4 * d6) + dLatitude), false, false);
                                                    if (d6 >= 0.0d) {
                                                        i5 = IconCompatParcelizer + 115;
                                                        write = i5 % Fields.SpotShadowColor;
                                                        if (i5 % 2 == 0) {
                                                            N$b builder5 = lineIntersectsResult.toBuilder();
                                                            builder5.IconCompatParcelizer = Boolean.TRUE;
                                                            lineIntersectsResult = builder5.build();
                                                            int i113 = 89 / 0;
                                                        } else {
                                                            N$b builder6 = lineIntersectsResult.toBuilder();
                                                            builder6.IconCompatParcelizer = Boolean.TRUE;
                                                            lineIntersectsResult = builder6.build();
                                                        }
                                                    }
                                                    if (d7 >= 0.0d) {
                                                        int i210 = write + 111;
                                                        i3 = i210 % Fields.SpotShadowColor;
                                                        IconCompatParcelizer = i3;
                                                        int i211 = i210 % 2;
                                                        if (d7 <= 1.0d) {
                                                            i4 = i3 + 63;
                                                            write = i4 % Fields.SpotShadowColor;
                                                            if (i4 % 2 == 0) {
                                                                N$b builder7 = lineIntersectsResult.toBuilder();
                                                                builder7.serializer = Boolean.TRUE;
                                                                lineIntersectsResult = builder7.build();
                                                                int i212 = 82 / 0;
                                                            } else {
                                                                N$b builder8 = lineIntersectsResult.toBuilder();
                                                                builder8.serializer = Boolean.TRUE;
                                                                lineIntersectsResult = builder8.build();
                                                            }
                                                        }
                                                    }
                                                    if (lineIntersectsResult.onLine1) {
                                                        lineIntersectsResult = null;
                                                    } else {
                                                        lineIntersectsResult = null;
                                                    }
                                                }
                                                if (lineIntersectsResult != null) {
                                                    featureFromGeometry4 = Feature.fromGeometry(Point.fromLngLat(lineIntersectsResult.horizontalIntersection.doubleValue(), lineIntersectsResult.verticalIntersection.doubleValue()));
                                                    featureFromGeometry4.addNumberProperty("dist", Double.valueOf(TuplesKt.distance(point, (Point) featureFromGeometry4.geometry(), "meters")));
                                                } else {
                                                    featureFromGeometry4 = null;
                                                }
                                                if (((Double) r31.getNumberProperty("dist")).doubleValue() < ((Double) feature.getNumberProperty("dist")).doubleValue()) {
                                                    r31.addNumberProperty("index", Integer.valueOf(i2));
                                                    feature2 = featureFromGeometry2;
                                                } else {
                                                    feature2 = feature;
                                                }
                                                if (((Double) featureFromGeometry3.getNumberProperty("dist")).doubleValue() < ((Double) feature2.getNumberProperty("dist")).doubleValue()) {
                                                    featureFromGeometry3.addNumberProperty("index", Integer.valueOf(i2));
                                                } else {
                                                    featureFromGeometry3 = feature2;
                                                }
                                                if (featureFromGeometry4 != null) {
                                                    int i213 = write + 19;
                                                    IconCompatParcelizer = i213 % Fields.SpotShadowColor;
                                                    int i214 = i213 % 2;
                                                    if (((Double) featureFromGeometry4.getNumberProperty("dist")).doubleValue() < ((Double) featureFromGeometry3.getNumberProperty("dist")).doubleValue()) {
                                                        featureFromGeometry4.addNumberProperty("index", Integer.valueOf(i2));
                                                        featureFromGeometry = featureFromGeometry4;
                                                    } else {
                                                        featureFromGeometry = featureFromGeometry3;
                                                    }
                                                } else {
                                                    featureFromGeometry = featureFromGeometry3;
                                                }
                                                int i215 = IconCompatParcelizer + 27;
                                                write = i215 % Fields.SpotShadowColor;
                                                int i216 = i215 % 2;
                                                routeLineGranularDistances2 = routeLineGranularDistances4;
                                                routeLineDistancesIndex = routeLineDistancesIndex4;
                                                i = i112;
                                                arrayList = arrayList3;
                                                m7Var2 = m7Var4;
                                                i8 = 1;
                                                styleDeprecated = style3;
                                            }
                                            m7Var = m7Var2;
                                            routeLineGranularDistances = routeLineGranularDistances2;
                                            style = styleDeprecated;
                                            routeLineDistancesIndex2 = routeLineDistancesIndex;
                                            numberProperty = featureFromGeometry.getNumberProperty("dist");
                                            if (numberProperty != null) {
                                                dDoubleValue = numberProperty.doubleValue();
                                            } else {
                                                int i217 = write + 101;
                                                IconCompatParcelizer = i217 % Fields.SpotShadowColor;
                                                int i218 = i217 % 2;
                                                dDoubleValue = 0.0d;
                                            }
                                            if (dDoubleValue > 10.0d) {
                                                dValueOf = null;
                                            }
                                        } else {
                                            m7Var = m7Var2;
                                            routeLineGranularDistances = routeLineGranularDistances2;
                                            style = styleDeprecated;
                                            routeLineDistancesIndex2 = routeLineDistancesIndex;
                                        }
                                        double d14 = routeLineDistancesIndex2.distanceRemaining;
                                        MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                                        double dCalculateDistance$ui_maps_release2 = MapboxRouteLineUtils.calculateDistance$ui_maps_release(routeLineDistancesIndex2.point, point) + d14;
                                        double d15 = routeLineGranularDistances.completeDistance;
                                        if (d15 >= dCalculateDistance$ui_maps_release2) {
                                        }
                                        if (vanishingRouteLine.vanishingPointState == VanishingPointState.ONLY_INCREASE_PROGRESS) {
                                        }
                                        dValueOf = Double.valueOf(d);
                                    }
                                    if (dValueOf != null) {
                                        double dDoubleValue3 = dValueOf.doubleValue();
                                        vanishingRouteLine.vanishPointOffset = dDoubleValue3;
                                        StylePropertyValue stylePropertyValue2 = new StylePropertyValue(new Value(1.0d - dDoubleValue3), StylePropertyValueKind.CONSTANT);
                                        int i219 = 1;
                                        vanishingRouteLineExpressions = new VanishingRouteLineExpressions(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue2, 9), i219), new LineTrimCommandApplier()), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue2, 8), i219), new LineTrimCommandApplier()), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue2, 7), i219), new LineTrimCommandApplier()), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(stylePropertyValue2, 6), i219), new LineTrimCommandApplier()));
                                    }
                                } else {
                                    m7Var = m7Var2;
                                    style = styleDeprecated;
                                }
                                vanishingRouteLineExpressions = null;
                            }
                        } else {
                            m7Var = m7Var2;
                            style = styleDeprecated;
                            vanishingRouteLineExpressions = null;
                        }
                    } else {
                        m7Var = m7Var2;
                        style = styleDeprecated;
                        vanishingRouteLineExpressions = null;
                    }
                } else {
                    m7Var = m7Var2;
                    style = styleDeprecated;
                    vanishingRouteLineExpressions = null;
                }
                mapboxRouteLineApiIconCompatParcelizer.lastPointUpdateTimeNano = System.nanoTime();
                if (vanishingRouteLineExpressions == null) {
                    expectedCreateError = ExpectedFactory.createError(new RouteLineError("No expression generated for update."));
                    expectedCreateError.getClass();
                } else {
                    RouteLineValueCommandHolder routeLineValueCommandHolder = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$9, 1), new LineGradientCommandApplier(1));
                    RouteLineValueCommandHolder routeLineValueCommandHolder2 = vanishingRouteLineExpressions.routeLineValueCommandHolder;
                    RouteLineDynamicData routeLineDynamicData = new RouteLineDynamicData(routeLineValueCommandHolder2, vanishingRouteLineExpressions.routeLineCasingExpressionCommandHolder, vanishingRouteLineExpressions.trafficLineExpressionCommandHolder, vanishingRouteLineExpressions.restrictedRoadExpressionCommandHolder, null, null, null, routeLineValueCommandHolder2, 112);
                    expectedCreateError = ExpectedFactory.createValue(new RouteLineUpdateValue(routeLineDynamicData, SQLite.read(new RouteLineDynamicData(routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, null, null, null, null, 240), new RouteLineDynamicData(routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, null, null, null, null, 240)), MapboxRouteLineApi.isMultiLeg(mapboxRouteLineApiIconCompatParcelizer.primaryRoute) ? routeLineDynamicData : null));
                    expectedCreateError.getClass();
                }
            }
            m7Var.RemoteActionCompatParcelizer().renderRouteLineUpdate(style, expectedCreateError);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public Object emit(RoutesUpdatedResult routesUpdatedResult, ShortNewsContentCardView shortNewsContentCardView) {
        kg kgVar;
        kg kgVar2;
        RoutesUpdatedResult routesUpdatedResult2 = routesUpdatedResult;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof kg) {
            kgVar = (kg) shortNewsContentCardView;
            int i2 = kgVar.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kgVar.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                kgVar = new kg(this, shortNewsContentCardView);
            }
        } else {
            kgVar = new kg(this, shortNewsContentCardView);
        }
        Object obj = kgVar.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = kgVar.RemoteActionCompatParcelizer;
        MapNavigationImpl mapNavigationImpl = this.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            List<NavigationRoute> list = routesUpdatedResult2.navigationRoutes;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (NavigationRoute navigationRoute : list) {
                int i4 = IconCompatParcelizer + 27;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Iterable iterableLegs = navigationRoute.directionsRoute.legs();
                List<String> list2 = instance_delegatelambda0.write;
                if (iterableLegs == null) {
                    int i6 = write + 55;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    iterableLegs = list2;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = iterableLegs.iterator();
                while (it.hasNext()) {
                    Iterable iterableSteps = ((RouteLeg) it.next()).steps();
                    if (iterableSteps == null) {
                        iterableSteps = list2;
                    }
                    onContentCardDismissed.RemoteActionCompatParcelizer(iterableSteps, (Collection) arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    int i8 = IconCompatParcelizer + 21;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    Iterable iterableIntersections = ((LegStep) it2.next()).intersections();
                    if (iterableIntersections == null) {
                        iterableIntersections = list2;
                    }
                    onContentCardDismissed.RemoteActionCompatParcelizer(iterableIntersections, (Collection) arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (!(!it3.hasNext())) {
                    List<String> listClasses = ((StepIntersection) it3.next()).classes();
                    if (listClasses == null) {
                        int i10 = write + 9;
                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        listClasses = list2;
                    }
                    onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listClasses, (Collection) arrayList4);
                }
                Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList4);
                RouteOptions routeOptions = navigationRoute.directionsRoute.routeOptions();
                List<String> listExcludeList = routeOptions != null ? routeOptions.excludeList() : null;
                if (listExcludeList != null) {
                    list2 = listExcludeList;
                }
                Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(list2);
                arrayList.add(new lc(navigationRoute, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2, onContentCardDismissed.read(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2)));
            }
            if (arrayList.isEmpty()) {
                kgVar2 = kgVar;
                break;
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    kgVar2 = kgVar;
                    break;
                }
                if (!((lc) it4.next()).IconCompatParcelizer.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(arrayList.iterator());
                    while (((Iterator) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.IconCompatParcelizer).hasNext()) {
                        Object next = r8lambdaorcgh_zecjpqysbjv51vn1ttu44.next();
                        if (!((lc) ((isItemViewSwipeEnabled) next).read).IconCompatParcelizer.isEmpty()) {
                            int i12 = write + 37;
                            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            arrayList5.add(next);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(arrayList5, 10));
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        int i14 = write + 15;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        arrayList6.add(Integer.valueOf(((isItemViewSwipeEnabled) it5.next()).IconCompatParcelizer));
                    }
                    ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                    int i16 = 0;
                    for (Object obj2 : arrayList) {
                        if (i16 < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        lc lcVar = (lc) obj2;
                        DirectionsRoute directionsRoute = lcVar.RemoteActionCompatParcelizer.directionsRoute;
                        kg kgVar3 = kgVar;
                        arrayList7.add("[idx=" + i16 + " classes=" + lcVar.read + " requested=" + lcVar.serializer + " violating=" + lcVar.IconCompatParcelizer + " distance=" + ((int) directionsRoute.distance().doubleValue()) + "m duration=" + ((int) directionsRoute.duration().doubleValue()) + "s]");
                        i16++;
                        kgVar = kgVar3;
                        arrayList6 = arrayList6;
                    }
                    kgVar2 = kgVar;
                    String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList7, " ", null, null, null, 62);
                    Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("mapbox returned route(s) violating exclude: violatingIndices=" + arrayList6 + ", routes=" + strIconCompatParcelizer));
                    break;
                }
            }
            List list3 = routesUpdatedResult2.navigationRoutes;
            mapNavigationImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = list3;
            m7 m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            setRectOutlinetz77jQwdefault setrectoutlinetz77jqwdefault = new setRectOutlinetz77jQwdefault(23);
            MapboxMap mapboxMap = this.read;
            m7Var.serializer(list3, mapboxMap, setrectoutlinetz77jqwdefault);
            RouteArrowApi routeArrowApi = mapNavigationImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            kg kgVar4 = kgVar2;
            kgVar4.IconCompatParcelizer = routesUpdatedResult2;
            kgVar4.RemoteActionCompatParcelizer = 1;
            if (routeArrowApi.onRoutesUpdatedResult$mapbox(routesUpdatedResult2, mapboxMap, kgVar4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            routesUpdatedResult2 = kgVar.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        ia iaVar = mapNavigationImpl.ResultReceiver;
        routesUpdatedResult2.getClass();
        List list4 = routesUpdatedResult2.navigationRoutes;
        MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource = iaVar.ParcelableVolumeInfo;
        if (mapboxNavigationViewportDataSource != null) {
            if (list4.isEmpty()) {
                mapboxNavigationViewportDataSource.clearRouteData();
            } else {
                NavigationRoute navigationRoute2 = (NavigationRoute) onContentCardDismissed.read(list4);
                navigationRoute2.getClass();
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#onRouteChanged");
                    try {
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        mapboxNavigationViewportDataSource.onRoutesChanged$ui_maps_release((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute2}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th) {
                        int i17 = write + 73;
                        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteChanged", null);
                        throw th;
                    }
                } else {
                    mapboxNavigationViewportDataSource.onRoutesChanged$ui_maps_release((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute2}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                }
            }
            mapboxNavigationViewportDataSource.evaluate();
        }
        n6 n6Var = mapNavigationImpl.accessensureViewModelStore.MediaMetadataCompat;
        if (!(n6Var.write.read() instanceof gd)) {
            n6Var.read.write(ge.read);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[PHI: r0
  0x0073: PHI (r0v5 com.mapbox.navigation.base.trip.model.RouteProgress) = 
  (r0v13 com.mapbox.navigation.base.trip.model.RouteProgress)
  (r0v16 com.mapbox.navigation.base.trip.model.RouteProgress)
 binds: [B:44:0x010b, B:26:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e A[Catch: IndexOutOfBoundsException -> 0x014a, TRY_LEAVE, TryCatch #0 {IndexOutOfBoundsException -> 0x014a, blocks: (B:49:0x0118, B:51:0x011e, B:56:0x0141, B:53:0x012b, B:55:0x013e, B:58:0x0146, B:59:0x0149, B:54:0x012e), top: B:77:0x0118, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012b A[Catch: IndexOutOfBoundsException -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IndexOutOfBoundsException -> 0x014a, blocks: (B:49:0x0118, B:51:0x011e, B:56:0x0141, B:53:0x012b, B:55:0x013e, B:58:0x0146, B:59:0x0149, B:54:0x012e), top: B:77:0x0118, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Object emit(RouteProgress routeProgress, ShortNewsContentCardView shortNewsContentCardView) {
        k7ExternalSyntheticLambda9 k7externalsyntheticlambda9;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        MapNavigationImpl mapNavigationImpl;
        accessgetGocp accessgetgocp;
        TripProgressApi tripProgressApi;
        RouteProgress routeProgress2;
        i0 i0Var;
        getSimplefcGXIks getsimplefcgxiks;
        RouteProgress routeProgress3;
        MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource;
        ManeuverApi maneuverApi;
        m7 m7Var;
        MapboxMap mapboxMap;
        Style styleDeprecated;
        RouteArrowApi routeArrowApi;
        CoalescingBlockingQueue$Item coalescingBlockingQueue$Item;
        int i3;
        int i4;
        Object[] objArr;
        RouteProgress routeProgress4 = routeProgress;
        int i5 = 2 % 2;
        int i6 = write + 95;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = 0;
        if (i6 % 2 == 0) {
            if (!(!(shortNewsContentCardView instanceof k7ExternalSyntheticLambda9))) {
                k7externalsyntheticlambda9 = (k7ExternalSyntheticLambda9) shortNewsContentCardView;
                i = k7externalsyntheticlambda9.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    k7externalsyntheticlambda9.read = i - Integer.MIN_VALUE;
                }
            }
            obj = k7externalsyntheticlambda9.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = k7externalsyntheticlambda9.read;
            mapNavigationImpl = this.serializer;
            accessgetgocp = null;
            objArr = 0;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                tripProgressApi = mapNavigationImpl.accessensureViewModelStore;
                k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress4;
                k7externalsyntheticlambda9.read = 1;
                if (tripProgressApi.onRouteProgress$mapbox(routeProgress4, k7externalsyntheticlambda9) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            int i8 = write;
            i4 = i8 + 121;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                routeProgress4 = k7externalsyntheticlambda9.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                routeProgress4 = k7externalsyntheticlambda9.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            routeProgress4.getClass();
            mapboxMap = this.read;
            styleDeprecated = mapboxMap.getStyleDeprecated();
            if (styleDeprecated != null) {
                m7Var.IconCompatParcelizer(styleDeprecated);
                MapboxRouteLineApi mapboxRouteLineApiIconCompatParcelizer = m7Var.IconCompatParcelizer();
                RouteLineApi$$ExternalSyntheticLambda4 routeLineApi$$ExternalSyntheticLambda4 = new RouteLineApi$$ExternalSyntheticLambda4(m7Var, i7, styleDeprecated);
                mapboxRouteLineApiIconCompatParcelizer.getClass();
                AsyncSection asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("MapboxRouteLineApi#updateWithRouteProgress");
                x xVar = mapboxRouteLineApiIconCompatParcelizer.routeProgressUpdatesQueue;
                CoalescingBlockingQueue$Item coalescingBlockingQueue$Item2 = new CoalescingBlockingQueue$Item(new MapboxRouteLineApi$updateWithRouteProgress$1(mapboxRouteLineApiIconCompatParcelizer, routeProgress4, routeLineApi$$ExternalSyntheticLambda4, asyncSectionAsyncSectionStarted, null), new LayerUtils$getLayer$source$2(routeLineApi$$ExternalSyntheticLambda4, 14, asyncSectionAsyncSectionStarted));
                xVar.getClass();
                coalescingBlockingQueue$Item = (CoalescingBlockingQueue$Item) xVar.IconCompatParcelizer;
                if (coalescingBlockingQueue$Item != null) {
                    i3 = IconCompatParcelizer + 25;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        coalescingBlockingQueue$Item.cancellation.invoke();
                        throw null;
                    }
                    coalescingBlockingQueue$Item.cancellation.invoke();
                }
                xVar.IconCompatParcelizer = coalescingBlockingQueue$Item2;
                BuildersKt.RemoteActionCompatParcelizer((ContextScope) xVar.read, null, null, new PerseusLogger$w$1((Object) xVar, (ShortNewsContentCardView) (objArr == true ? 1 : 0), 6), 3);
            }
            routeArrowApi = mapNavigationImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress4;
            k7externalsyntheticlambda9.read = 2;
            if (routeArrowApi.onRouteProgress$mapbox(routeProgress4, mapboxMap, k7externalsyntheticlambda9) != coroutineSingletons) {
                routeProgress3 = routeProgress4;
                ia iaVar = mapNavigationImpl.ResultReceiver;
                routeProgress3.getClass();
                mapboxNavigationViewportDataSource = iaVar.ParcelableVolumeInfo;
                if (mapboxNavigationViewportDataSource != null) {
                    if (PerformanceTracker.getTrackingIsActive()) {
                        PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#onRouteProgressChanged");
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteProgressChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } else {
                        mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                        int i9 = IconCompatParcelizer + 57;
                        write = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                    mapboxNavigationViewportDataSource.evaluate();
                }
                maneuverApi = mapNavigationImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress3;
                k7externalsyntheticlambda9.read = 3;
                if (maneuverApi.onRouteProgress$mapbox(routeProgress3, k7externalsyntheticlambda9) != coroutineSingletons) {
                    routeProgress2 = routeProgress3;
                    i0Var = mapNavigationImpl.write;
                    getsimplefcgxiks = mapNavigationImpl.read;
                    if (getsimplefcgxiks != null) {
                        accessgetgocp = getsimplefcgxiks.IconCompatParcelizer;
                        int i11 = write + 79;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    }
                    routeProgress2.getClass();
                    if (accessgetgocp != null) {
                        i0Var.RemoteActionCompatParcelizer(accessgetgocp);
                    }
                    return createFromParcel.INSTANCE;
                }
            }
            return coroutineSingletons;
        }
        int i13 = 8 / 0;
        if (shortNewsContentCardView instanceof k7ExternalSyntheticLambda9) {
            k7externalsyntheticlambda9 = (k7ExternalSyntheticLambda9) shortNewsContentCardView;
            i = k7externalsyntheticlambda9.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7externalsyntheticlambda9.read = i - Integer.MIN_VALUE;
            }
        }
        obj = k7externalsyntheticlambda9.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = k7externalsyntheticlambda9.read;
        mapNavigationImpl = this.serializer;
        accessgetgocp = null;
        objArr = 0;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            tripProgressApi = mapNavigationImpl.accessensureViewModelStore;
            k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress4;
            k7externalsyntheticlambda9.read = 1;
            if (tripProgressApi.onRouteProgress$mapbox(routeProgress4, k7externalsyntheticlambda9) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i14 = write;
        i4 = i14 + 121;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0 ? i2 == 1 : i2 == 1) {
            routeProgress4 = k7externalsyntheticlambda9.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i2 == 2) {
                routeProgress4 = k7externalsyntheticlambda9.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                routeProgress3 = routeProgress4;
                ia iaVar2 = mapNavigationImpl.ResultReceiver;
                routeProgress3.getClass();
                mapboxNavigationViewportDataSource = iaVar2.ParcelableVolumeInfo;
                if (mapboxNavigationViewportDataSource != null) {
                    try {
                        if (PerformanceTracker.getTrackingIsActive()) {
                            mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                            int i15 = IconCompatParcelizer + 57;
                            write = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                        } else {
                            PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#onRouteProgressChanged");
                            try {
                                long jWrite2 = BrazeInAppMessageManagerWhenMappings.write();
                                mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteProgressChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite2)));
                            } catch (Throwable th) {
                                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteProgressChanged", null);
                                throw th;
                            }
                        }
                        mapboxNavigationViewportDataSource.evaluate();
                    } catch (IndexOutOfBoundsException e) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Mapbox ViewportDataSource route progress crash caught", new Object[0]);
                    }
                }
                maneuverApi = mapNavigationImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress3;
                k7externalsyntheticlambda9.read = 3;
                if (maneuverApi.onRouteProgress$mapbox(routeProgress3, k7externalsyntheticlambda9) != coroutineSingletons) {
                    routeProgress2 = routeProgress3;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = i14 + 31;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            routeProgress2 = k7externalsyntheticlambda9.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        i0Var = mapNavigationImpl.write;
        getsimplefcgxiks = mapNavigationImpl.read;
        if (getsimplefcgxiks != null) {
            accessgetgocp = getsimplefcgxiks.IconCompatParcelizer;
            int i19 = write + 79;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i110 = i19 % 2;
        }
        routeProgress2.getClass();
        if (accessgetgocp != null && routeProgress2.distanceRemaining <= 150.0f) {
            i0Var.RemoteActionCompatParcelizer(accessgetgocp);
        }
        return createFromParcel.INSTANCE;
        m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        routeProgress4.getClass();
        mapboxMap = this.read;
        styleDeprecated = mapboxMap.getStyleDeprecated();
        if (styleDeprecated != null) {
            m7Var.IconCompatParcelizer(styleDeprecated);
            MapboxRouteLineApi mapboxRouteLineApiIconCompatParcelizer2 = m7Var.IconCompatParcelizer();
            RouteLineApi$$ExternalSyntheticLambda4 routeLineApi$$ExternalSyntheticLambda5 = new RouteLineApi$$ExternalSyntheticLambda4(m7Var, i7, styleDeprecated);
            mapboxRouteLineApiIconCompatParcelizer2.getClass();
            AsyncSection asyncSectionAsyncSectionStarted2 = PerformanceTracker.asyncSectionStarted("MapboxRouteLineApi#updateWithRouteProgress");
            x xVar2 = mapboxRouteLineApiIconCompatParcelizer2.routeProgressUpdatesQueue;
            CoalescingBlockingQueue$Item coalescingBlockingQueue$Item3 = new CoalescingBlockingQueue$Item(new MapboxRouteLineApi$updateWithRouteProgress$1(mapboxRouteLineApiIconCompatParcelizer2, routeProgress4, routeLineApi$$ExternalSyntheticLambda5, asyncSectionAsyncSectionStarted2, null), new LayerUtils$getLayer$source$2(routeLineApi$$ExternalSyntheticLambda5, 14, asyncSectionAsyncSectionStarted2));
            xVar2.getClass();
            coalescingBlockingQueue$Item = (CoalescingBlockingQueue$Item) xVar2.IconCompatParcelizer;
            if (coalescingBlockingQueue$Item != null) {
                i3 = IconCompatParcelizer + 25;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    coalescingBlockingQueue$Item.cancellation.invoke();
                    throw null;
                }
                coalescingBlockingQueue$Item.cancellation.invoke();
            }
            xVar2.IconCompatParcelizer = coalescingBlockingQueue$Item3;
            BuildersKt.RemoteActionCompatParcelizer((ContextScope) xVar2.read, null, null, new PerseusLogger$w$1((Object) xVar2, (ShortNewsContentCardView) (objArr == true ? 1 : 0), 6), 3);
        }
        routeArrowApi = mapNavigationImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress4;
        k7externalsyntheticlambda9.read = 2;
        if (routeArrowApi.onRouteProgress$mapbox(routeProgress4, mapboxMap, k7externalsyntheticlambda9) != coroutineSingletons) {
            routeProgress3 = routeProgress4;
            ia iaVar3 = mapNavigationImpl.ResultReceiver;
            routeProgress3.getClass();
            mapboxNavigationViewportDataSource = iaVar3.ParcelableVolumeInfo;
            if (mapboxNavigationViewportDataSource != null) {
                if (PerformanceTracker.getTrackingIsActive()) {
                    mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                    int i111 = IconCompatParcelizer + 57;
                    write = i111 % Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                } else {
                    PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#onRouteProgressChanged");
                    long jWrite3 = BrazeInAppMessageManagerWhenMappings.write();
                    mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteProgressChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite3)));
                }
                mapboxNavigationViewportDataSource.evaluate();
            }
            maneuverApi = mapNavigationImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress3;
            k7externalsyntheticlambda9.read = 3;
            if (maneuverApi.onRouteProgress$mapbox(routeProgress3, k7externalsyntheticlambda9) != coroutineSingletons) {
                routeProgress2 = routeProgress3;
                i0Var = mapNavigationImpl.write;
                getsimplefcgxiks = mapNavigationImpl.read;
                if (getsimplefcgxiks != null) {
                    accessgetgocp = getsimplefcgxiks.IconCompatParcelizer;
                    int i113 = write + 79;
                    IconCompatParcelizer = i113 % Fields.SpotShadowColor;
                    int i114 = i113 % 2;
                }
                routeProgress2.getClass();
                if (accessgetgocp != null) {
                    i0Var.RemoteActionCompatParcelizer(accessgetgocp);
                }
                return createFromParcel.INSTANCE;
            }
        }
        return coroutineSingletons;
        k7externalsyntheticlambda9 = new k7ExternalSyntheticLambda9(this, shortNewsContentCardView);
        obj = k7externalsyntheticlambda9.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = k7externalsyntheticlambda9.read;
        mapNavigationImpl = this.serializer;
        accessgetgocp = null;
        objArr = 0;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            tripProgressApi = mapNavigationImpl.accessensureViewModelStore;
            k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress4;
            k7externalsyntheticlambda9.read = 1;
            if (tripProgressApi.onRouteProgress$mapbox(routeProgress4, k7externalsyntheticlambda9) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i115 = write;
        i4 = i115 + 121;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            routeProgress4 = k7externalsyntheticlambda9.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            routeProgress4 = k7externalsyntheticlambda9.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        routeProgress4.getClass();
        mapboxMap = this.read;
        styleDeprecated = mapboxMap.getStyleDeprecated();
        if (styleDeprecated != null) {
            m7Var.IconCompatParcelizer(styleDeprecated);
            MapboxRouteLineApi mapboxRouteLineApiIconCompatParcelizer3 = m7Var.IconCompatParcelizer();
            RouteLineApi$$ExternalSyntheticLambda4 routeLineApi$$ExternalSyntheticLambda6 = new RouteLineApi$$ExternalSyntheticLambda4(m7Var, i7, styleDeprecated);
            mapboxRouteLineApiIconCompatParcelizer3.getClass();
            AsyncSection asyncSectionAsyncSectionStarted3 = PerformanceTracker.asyncSectionStarted("MapboxRouteLineApi#updateWithRouteProgress");
            x xVar3 = mapboxRouteLineApiIconCompatParcelizer3.routeProgressUpdatesQueue;
            CoalescingBlockingQueue$Item coalescingBlockingQueue$Item4 = new CoalescingBlockingQueue$Item(new MapboxRouteLineApi$updateWithRouteProgress$1(mapboxRouteLineApiIconCompatParcelizer3, routeProgress4, routeLineApi$$ExternalSyntheticLambda6, asyncSectionAsyncSectionStarted3, null), new LayerUtils$getLayer$source$2(routeLineApi$$ExternalSyntheticLambda6, 14, asyncSectionAsyncSectionStarted3));
            xVar3.getClass();
            coalescingBlockingQueue$Item = (CoalescingBlockingQueue$Item) xVar3.IconCompatParcelizer;
            if (coalescingBlockingQueue$Item != null) {
                i3 = IconCompatParcelizer + 25;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    coalescingBlockingQueue$Item.cancellation.invoke();
                    throw null;
                }
                coalescingBlockingQueue$Item.cancellation.invoke();
            }
            xVar3.IconCompatParcelizer = coalescingBlockingQueue$Item4;
            BuildersKt.RemoteActionCompatParcelizer((ContextScope) xVar3.read, null, null, new PerseusLogger$w$1((Object) xVar3, (ShortNewsContentCardView) (objArr == true ? 1 : 0), 6), 3);
        }
        routeArrowApi = mapNavigationImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress4;
        k7externalsyntheticlambda9.read = 2;
        if (routeArrowApi.onRouteProgress$mapbox(routeProgress4, mapboxMap, k7externalsyntheticlambda9) != coroutineSingletons) {
            routeProgress3 = routeProgress4;
            ia iaVar4 = mapNavigationImpl.ResultReceiver;
            routeProgress3.getClass();
            mapboxNavigationViewportDataSource = iaVar4.ParcelableVolumeInfo;
            if (mapboxNavigationViewportDataSource != null) {
                if (PerformanceTracker.getTrackingIsActive()) {
                    mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                    int i116 = IconCompatParcelizer + 57;
                    write = i116 % Fields.SpotShadowColor;
                    int i117 = i116 % 2;
                } else {
                    PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#onRouteProgressChanged");
                    long jWrite4 = BrazeInAppMessageManagerWhenMappings.write();
                    mapboxNavigationViewportDataSource.onRouteProgressChangedInternal(routeProgress3);
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRouteProgressChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite4)));
                }
                mapboxNavigationViewportDataSource.evaluate();
            }
            maneuverApi = mapNavigationImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            k7externalsyntheticlambda9.IconCompatParcelizer = routeProgress3;
            k7externalsyntheticlambda9.read = 3;
            if (maneuverApi.onRouteProgress$mapbox(routeProgress3, k7externalsyntheticlambda9) != coroutineSingletons) {
                routeProgress2 = routeProgress3;
                i0Var = mapNavigationImpl.write;
                getsimplefcgxiks = mapNavigationImpl.read;
                if (getsimplefcgxiks != null) {
                    accessgetgocp = getsimplefcgxiks.IconCompatParcelizer;
                    int i118 = write + 79;
                    IconCompatParcelizer = i118 % Fields.SpotShadowColor;
                    int i119 = i118 % 2;
                }
                routeProgress2.getClass();
                if (accessgetgocp != null) {
                    i0Var.RemoteActionCompatParcelizer(accessgetgocp);
                }
                return createFromParcel.INSTANCE;
            }
        }
        return coroutineSingletons;
    }
}
