package com.mapbox.maps.extension.style.layers;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import androidx.transition.TransitionValuesMaps;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import coil3.network.NetworkHeaders$Builder;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.ui.WebChatFragment;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.re2j.Parser;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$deviceOrientationFlow$1$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$locationObserver$1;
import com.mapbox.maps.plugin.locationcomponent.LocationCompassEngine;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsResponseParsingResult;
import com.mapbox.navigation.base.internal.utils.MapboxApiExKt$WhenMappings;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.core.internal.router.NavigationRouterRefreshError;
import com.mapbox.navigation.ui.maps.camera.data.ViewportDataSourceProcessor;
import com.mapbox.navigation.ui.maps.camera.data.ViewportProperty$ZoomProperty;
import com.mapbox.navigation.ui.maps.internal.camera.CachedRemainingPoints;
import com.mapbox.navigation.ui.maps.internal.camera.InternalViewportDataSourceOptions;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewMode;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewViewportDataSource;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewViewportDataSource$updateDebugger$1;
import com.mapbox.navigation.ui.maps.internal.camera.RouteIndices;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.ui.maps.route.line.api.RouteRenderCallbackHolder;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineError;
import com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue;
import com.mapbox.navigation.ui.maps.util.MapSizeInitializedCallbackHelper$CancellableImpl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.MapboxAPI;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda4;
import io.grpc.internal.MetadataApplierImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ConstraintReferenceIncorrectConstraintException;
import o.GraphicsLayerV29;
import o.GraphicsViewLayer;
import o.VectorPropertyTranslateX;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.discardDisplayListInternalui_graphics;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.evaluateFeaturefwf_client_release;
import o.getFilterQualityfv9h1I;
import o.instance_delegatelambda0;
import o.isPlacementApproachInProgress;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeSingleSubscriptionlambda101;
import o.setFirstVerticalBias;
import o.setStrokeCapBeK7IIE;
import o.toColorLong8_81llA;
import org.koin.androidx.viewmodel.GetViewModelKt;

/* JADX INFO: loaded from: classes2.dex */
public final class LayerUtils$getLayer$source$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object $layerId;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_getLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerUtils$getLayer$source$2(MapboxRouteLineView mapboxRouteLineView, Style style, RouteSetValue routeSetValue) {
        super(0);
        this.$r8$classId = 15;
        this.$this_getLayer = style;
        this.$layerId = routeSetValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayerUtils$getLayer$source$2(Object obj, int i, Object obj2) {
        super(0);
        this.$r8$classId = i;
        this.$this_getLayer = obj;
        this.$layerId = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:142:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x04be  */
    /* JADX WARN: Code duplicated, block: B:145:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:238:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a4 A[PHI: r2
  0x01a4: PHI (r2v60 o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) = (r2v59 o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM), (r2v64 o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) binds: [B:54:0x01a2, B:51:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0279  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        String str;
        Object next;
        NavigationRoute navigationRoute;
        List listStepsGeometryToPoints;
        createFromParcel createfromparcel;
        double d;
        CameraOptions cameraOptions$default;
        Parser.Pair pair;
        RouteIndices routeIndices;
        RouteLegProgress routeLegProgress;
        RouteProgress routeProgress;
        RouteStepProgress routeStepProgress;
        List listPlaybackStateCompat;
        List listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Integer num;
        List<RouteLeg> listLegs;
        List listSerializer;
        RouteLeg routeLeg;
        List<LegStep> listSteps;
        LegStep legStep;
        List list;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        int i = 2 % 2;
        int i2 = write + 81;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj = this.$layerId;
        Object obj2 = this.$this_getLayer;
        switch (i4) {
            case 0:
                return (String) TypeUtilsKt.unwrap(((MapboxStyleManager) obj2).getStyleLayerProperty((String) obj, "source"), String.class);
            case 1:
                ((GraphicsViewLayer) obj2).read.write(((GraphicsLayerV29) ((isPlacementApproachInProgress) obj)).serializer);
                return createfromparcel2;
            case 2:
                Uri uri = Uri.parse("package:" + ((Context) obj2).getPackageName());
                uri.getClass();
                ((WebChatFragment) obj).startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri));
                return createfromparcel2;
            case 3:
                return evaluateFeaturefwf_client_release.read((WebChatFragment) obj2).RemoteActionCompatParcelizer((VectorPropertyTranslateX) obj, displayInAppMessagelambda1.serializer(discardDisplayListInternalui_graphics.class), null);
            case 4:
                WebChatFragment webChatFragment = (WebChatFragment) obj2;
                getFilterQualityfv9h1I viewModelStore = ((VectorPropertyTranslateX) obj).write.getViewModelStore();
                setStrokeCapBeK7IIE defaultViewModelCreationExtras = webChatFragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                return GetViewModelKt.read(displayInAppMessagelambda1.serializer(WebChatViewmodel.class), viewModelStore, defaultViewModelCreationExtras, evaluateFeaturefwf_client_release.read(webChatFragment));
            case 5:
                CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1.access$finishAnimation((CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1) obj2, (Animator) obj, CameraAnimationsPluginImpl.AnimationFinishStatus.CANCELED);
                return createfromparcel2;
            case 6:
                ((DeviceLocationProvider) obj2).removeLocationObserver((DefaultLocationProvider$locationObserver$1) obj);
                return createfromparcel2;
            case 7:
                LocationCompassEngine locationCompassEngine = ((DefaultLocationProvider) obj2).locationCompassEngine;
                locationCompassEngine.getClass();
                LinkedHashSet linkedHashSet = locationCompassEngine.compassListeners;
                if (linkedHashSet.remove((DefaultLocationProvider$deviceOrientationFlow$1$$ExternalSyntheticLambda0) obj) && linkedHashSet.isEmpty()) {
                    int i5 = RemoteActionCompatParcelizer + 53;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        Sensor sensor = locationCompassEngine.compassSensor;
                        throw null;
                    }
                    Sensor sensor2 = locationCompassEngine.compassSensor;
                    boolean z = sensor2 != null;
                    SensorManager sensorManager = locationCompassEngine.sensorManager;
                    if (z) {
                        sensorManager.unregisterListener(locationCompassEngine, sensor2);
                    } else {
                        sensorManager.unregisterListener(locationCompassEngine, locationCompassEngine.gravitySensor);
                        sensorManager.unregisterListener(locationCompassEngine, locationCompassEngine.magneticFieldSensor);
                    }
                }
                return createfromparcel2;
            case 8:
                TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) obj;
                RouteInterface routeInterface = (RouteInterface) onContentCardDismissed.read((List) obj2);
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                    LoggerProviderKt.logI("parsing " + routeInterface.getResponseUuid(), "JsonResponseOptimizedRouteInterfaceParser");
                }
                p0 p0Var = (p0) transitionValuesMaps.MediaMetadataCompat;
                DataRef responseJsonRef = routeInterface.getResponseJsonRef();
                responseJsonRef.getClass();
                String requestUri = routeInterface.getRequestUri();
                requestUri.getClass();
                RouterOrigin routerOrigin = routeInterface.getRouterOrigin();
                routerOrigin.getClass();
                String strMapToSdkRouteOrigin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
                MapboxAPI mapboxAPI = routeInterface.getMapboxAPI();
                mapboxAPI.getClass();
                int i6 = MapboxApiExKt$WhenMappings.$EnumSwitchMapping$0[mapboxAPI.ordinal()];
                if (i6 == 1) {
                    str = "DIRECTIONS_API";
                } else {
                    if (i6 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    str = "MAP_MATCHING_API";
                }
                Object objM4527parseIoAF18A = p0Var.m4527parseIoAF18A(new ResponseToParse(responseJsonRef, requestUri, strMapToSdkRouteOrigin, str));
                ExtrasKt.RemoteActionCompatParcelizer(objM4527parseIoAF18A);
                return (DirectionsResponseParsingResult) objM4527parseIoAF18A;
            case 9:
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                PerformanceTracker.asyncSectionCompleted((AsyncSection) obj2);
                ((CallsKt$await$2$2) obj).onFailure(new NavigationRouterRefreshError("Request cancelled", null, null, 14));
                return createfromparcel2;
            case 10:
                ((MetadataApplierImpl) obj2).MediaDescriptionCompat = new AnalyticsServiceImpl(8, (NetworkFetcher.AnonymousClass2) obj);
                return createfromparcel2;
            case 11:
                OverviewViewportDataSource overviewViewportDataSource = (OverviewViewportDataSource) obj;
                List list2 = (List) obj2;
                if (list2.isEmpty()) {
                    overviewViewportDataSource.navigationRoutes = instance_delegatelambda0Var;
                    overviewViewportDataSource.indicesConverter.onRoutesChanged(instance_delegatelambda0Var);
                    overviewViewportDataSource.runIfActive(new OverviewViewportDataSource$updateDebugger$1(overviewViewportDataSource, 2));
                } else {
                    List list3 = list2;
                    ArrayList<List> arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    int i7 = 0;
                    while (it.hasNext()) {
                        int i8 = write + 109;
                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            next = it.next();
                            int i9 = 89 / 0;
                            if (i7 < 0) {
                                SQLite.serializer();
                                throw null;
                            }
                            navigationRoute = (NavigationRoute) next;
                            if (i7 != 0) {
                                overviewViewportDataSource.internalOptions.getClass();
                                listStepsGeometryToPoints = null;
                            } else {
                                DirectionsRoute directionsRoute = navigationRoute.directionsRoute;
                                directionsRoute.getClass();
                                listStepsGeometryToPoints = DecodeUtils.stepsGeometryToPoints(directionsRoute);
                            }
                            if (listStepsGeometryToPoints != null) {
                                int i10 = RemoteActionCompatParcelizer + 37;
                                write = i10 % Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                arrayList.add(listStepsGeometryToPoints);
                            }
                            i7++;
                        } else {
                            next = it.next();
                            if (i7 < 0) {
                                SQLite.serializer();
                                throw null;
                            }
                            navigationRoute = (NavigationRoute) next;
                            if (i7 != 0) {
                                overviewViewportDataSource.internalOptions.getClass();
                                listStepsGeometryToPoints = null;
                            } else {
                                DirectionsRoute directionsRoute2 = navigationRoute.directionsRoute;
                                directionsRoute2.getClass();
                                listStepsGeometryToPoints = DecodeUtils.stepsGeometryToPoints(directionsRoute2);
                            }
                            if (listStepsGeometryToPoints != null) {
                                int i12 = RemoteActionCompatParcelizer + 37;
                                write = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                arrayList.add(listStepsGeometryToPoints);
                            }
                            i7++;
                        }
                    }
                    com.airbnb.lottie.PerformanceTracker performanceTracker2 = overviewViewportDataSource.indicesConverter;
                    Parser.Pair pair2 = overviewViewportDataSource.options;
                    overviewViewportDataSource.internalOptions.getClass();
                    performanceTracker2.onRoutesChanged(onContentCardDismissed.read(list3, 1));
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                    for (List list4 : arrayList) {
                        int i14 = write + 9;
                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        Object obj3 = ((AnalyticsServiceImpl) pair2.write).locationProvider;
                        list4.getClass();
                        Iterator it2 = list4.iterator();
                        int size = 0;
                        while (it2.hasNext()) {
                            Iterator it3 = ((List) it2.next()).iterator();
                            while (it3.hasNext()) {
                                int i16 = RemoteActionCompatParcelizer + 27;
                                write = i16 % Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                                size += ((List) it3.next()).size();
                                if (size >= 100) {
                                    List<List> list5 = list4;
                                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                                    for (List<List> list6 : list5) {
                                        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                                        for (List list7 : list6) {
                                            ArrayList arrayList5 = new ArrayList();
                                            int i18 = 0;
                                            for (Object obj4 : list7) {
                                                if (i18 < 0) {
                                                    SQLite.serializer();
                                                    throw null;
                                                }
                                                if (i18 % 25 == 0 || i18 == list7.size() - 1) {
                                                    arrayList5.add(obj4);
                                                }
                                                i18++;
                                            }
                                            arrayList4.add(arrayList5);
                                        }
                                        arrayList3.add(arrayList4);
                                    }
                                    list4 = arrayList3;
                                }
                                break;
                            }
                        }
                        arrayList2.add(list4);
                    }
                    overviewViewportDataSource.simplifiedCompleteRoutesPoints = arrayList2;
                    overviewViewportDataSource.simplifiedRemainingPointsOnRoutes = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList2)));
                }
                return createfromparcel2;
            case 12:
                CameraState cameraState = (CameraState) obj;
                OverviewViewportDataSource overviewViewportDataSource2 = (OverviewViewportDataSource) obj2;
                List list8 = overviewViewportDataSource2.simplifiedRemainingPointsOnRoutes;
                ViewportProperty$ZoomProperty viewportProperty$ZoomProperty = overviewViewportDataSource2.zoomProperty;
                ViewportProperty$ZoomProperty viewportProperty$ZoomProperty2 = overviewViewportDataSource2.centerProperty;
                Parser.Pair pair3 = overviewViewportDataSource2.options;
                ViewportProperty$ZoomProperty viewportProperty$ZoomProperty3 = overviewViewportDataSource2.pitchProperty;
                ViewportProperty$ZoomProperty viewportProperty$ZoomProperty4 = overviewViewportDataSource2.bearingProperty;
                ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) list8);
                Location location = overviewViewportDataSource2.targetLocation;
                if (location != null && overviewViewportDataSource2.internalOptions.overviewMode != OverviewMode.POINTS) {
                    Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                    pointFromLngLat.getClass();
                    arrayListIconCompatParcelizer.add(0, pointFromLngLat);
                }
                arrayListIconCompatParcelizer.addAll(overviewViewportDataSource2.additionalPointsToFrame);
                if (arrayListIconCompatParcelizer.isEmpty()) {
                    int i19 = RemoteActionCompatParcelizer + 79;
                    write = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) pair3.write;
                    viewportProperty$ZoomProperty4.RatingCompat = Double.valueOf(cameraState.getBearing());
                    viewportProperty$ZoomProperty3.RatingCompat = Double.valueOf(cameraState.getPitch());
                    Point center = cameraState.getCenter();
                    center.getClass();
                    viewportProperty$ZoomProperty2.RatingCompat = center;
                    double zoom = cameraState.getZoom();
                    analyticsServiceImpl.getClass();
                    viewportProperty$ZoomProperty.RatingCompat = Double.valueOf(Math.min(zoom, 16.35d));
                    pair = pair3;
                    createfromparcel = createfromparcel2;
                } else {
                    viewportProperty$ZoomProperty3.RatingCompat = Double.valueOf(0.0d);
                    double bearing = cameraState.getBearing();
                    createfromparcel = createfromparcel2;
                    double dPow = Math.pow(10.0d, 6.0d);
                    viewportProperty$ZoomProperty4.RatingCompat = Double.valueOf(((double) MathKt.write((((((0.0d - bearing) + 540.0d) % 360.0d) - 180.0d) + bearing) * dPow)) / dPow);
                    if (arrayListIconCompatParcelizer.isEmpty()) {
                        d = 16.35d;
                        cameraOptions$default = ExtensionUtils.toCameraOptions$default(cameraState, null, 1, null);
                    } else {
                        MapboxMap mapboxMap = overviewViewportDataSource2.mapboxMap;
                        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().padding(overviewViewportDataSource2.padding).bearing((Double) viewportProperty$ZoomProperty4.RatingCompat).pitch((Double) viewportProperty$ZoomProperty3.RatingCompat).build();
                        cameraOptionsBuild.getClass();
                        d = 16.35d;
                        cameraOptions$default = mapboxMap.cameraForCoordinates(arrayListIconCompatParcelizer, cameraOptionsBuild, null, null, null);
                    }
                    if (CameraOptionsUtils.isEmpty(cameraOptions$default)) {
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                            LoggerProviderKt.logW("CameraOptions is empty", "OverviewViewportDataSource");
                        }
                        pair = pair3;
                    } else {
                        Point center2 = cameraOptions$default.getCenter();
                        center2.getClass();
                        viewportProperty$ZoomProperty2.RatingCompat = center2;
                        Double zoom2 = cameraOptions$default.getZoom();
                        zoom2.getClass();
                        double dDoubleValue = zoom2.doubleValue();
                        pair = pair3;
                        ((AnalyticsServiceImpl) pair.write).getClass();
                        viewportProperty$ZoomProperty.RatingCompat = Double.valueOf(Math.min(dDoubleValue, d));
                    }
                }
                overviewViewportDataSource2.runIfActive(new OverviewViewportDataSource$updateDebugger$1(overviewViewportDataSource2, arrayListIconCompatParcelizer));
                AnalyticsServiceImpl analyticsServiceImpl2 = (AnalyticsServiceImpl) pair.write;
                CameraOptions.Builder builder = new CameraOptions.Builder();
                analyticsServiceImpl2.getClass();
                builder.center((Point) viewportProperty$ZoomProperty2.RatingCompat);
                builder.zoom((Double) viewportProperty$ZoomProperty.RatingCompat);
                builder.bearing((Double) viewportProperty$ZoomProperty4.RatingCompat);
                builder.pitch((Double) viewportProperty$ZoomProperty3.RatingCompat);
                builder.padding(overviewViewportDataSource2.padding);
                CameraOptions cameraOptionsBuild2 = builder.build();
                cameraOptionsBuild2.getClass();
                overviewViewportDataSource2.viewportData = cameraOptionsBuild2;
                return createfromparcel;
            case 13:
                RouteProgress routeProgress2 = (RouteProgress) obj2;
                RouteLegProgress routeLegProgress2 = routeProgress2.currentLegProgress;
                RouteStepProgress routeStepProgress2 = routeLegProgress2.currentStepProgress;
                OverviewViewportDataSource overviewViewportDataSource3 = (OverviewViewportDataSource) obj;
                List list9 = overviewViewportDataSource3.navigationRoutes;
                InternalViewportDataSourceOptions internalViewportDataSourceOptions = overviewViewportDataSource3.internalOptions;
                ArrayList arrayList6 = new ArrayList();
                int i21 = 0;
                for (Object obj5 : list9) {
                    if (i21 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    NavigationRoute navigationRoute2 = (NavigationRoute) obj5;
                    if (i21 > 0) {
                        internalViewportDataSourceOptions.getClass();
                    } else {
                        if (i21 == 0) {
                            routeIndices = new RouteIndices(routeLegProgress2.legIndex, routeStepProgress2.stepIndex, routeLegProgress2.geometryIndex);
                        } else {
                            com.mapbox.navigation.base.internal.trip.model.RouteIndices routeIndices2 = (com.mapbox.navigation.base.internal.trip.model.RouteIndices) routeProgress2.alternativeRoutesIndices.get(navigationRoute2.id);
                            routeIndices = routeIndices2 != null ? new RouteIndices(routeIndices2.legIndex, routeIndices2.stepIndex, routeIndices2.legGeometryIndex) : null;
                        }
                        if (routeIndices != null) {
                            int i22 = routeIndices.stepIndex;
                            int i23 = routeIndices.legIndex;
                            HashMap map = overviewViewportDataSource3.cachedRemainingPoints;
                            String str2 = navigationRoute2.id;
                            DirectionsRoute directionsRoute3 = navigationRoute2.directionsRoute;
                            CachedRemainingPoints cachedRemainingPoints = (CachedRemainingPoints) map.get(str2);
                            if (routeIndices.equals(cachedRemainingPoints != null ? cachedRemainingPoints.indices : null)) {
                                routeLegProgress = routeLegProgress2;
                                routeProgress = routeProgress2;
                                routeStepProgress = routeStepProgress2;
                            } else {
                                int i24 = RemoteActionCompatParcelizer + 37;
                                routeLegProgress = routeLegProgress2;
                                write = i24 % Fields.SpotShadowColor;
                                int i25 = i24 % 2;
                                com.airbnb.lottie.PerformanceTracker performanceTracker3 = overviewViewportDataSource3.indicesConverter;
                                int i26 = routeIndices.legGeometryIndex;
                                performanceTracker3.getClass();
                                str2.getClass();
                                List list10 = (List) performanceTracker3.IconCompatParcelizer.get(str2);
                                if (list10 == null || (list = (List) onContentCardDismissed.read(i23, list10)) == null) {
                                    routeProgress = routeProgress2;
                                    routeStepProgress = routeStepProgress2;
                                } else {
                                    routeProgress = routeProgress2;
                                    int i27 = write + 111;
                                    routeStepProgress = routeStepProgress2;
                                    RemoteActionCompatParcelizer = i27 % Fields.SpotShadowColor;
                                    if (i27 % 2 != 0) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onContentCardDismissed.read(i22, list);
                                        int i28 = 30 / 0;
                                        num = r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? (Integer) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(i26)) : null;
                                    } else {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onContentCardDismissed.read(i22, list);
                                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                                        }
                                    }
                                    if (num != null) {
                                        HashMap map2 = overviewViewportDataSource3.cachedRemainingPoints;
                                        int iIntValue = num.intValue();
                                        listLegs = directionsRoute3.legs();
                                        if (listLegs != null || (routeLeg = (RouteLeg) onContentCardDismissed.read(i23, listLegs)) == null || (listSteps = routeLeg.steps()) == null || (legStep = (LegStep) onContentCardDismissed.read(i22, listSteps)) == null) {
                                            listSerializer = null;
                                        } else {
                                            listSerializer = onContentCardDismissed.serializer(DecodeUtils.stepGeometryToPoints(directionsRoute3, legStep), iIntValue);
                                        }
                                        if (listSerializer == null) {
                                            listSerializer = instance_delegatelambda0Var;
                                        }
                                        map2.put(str2, new CachedRemainingPoints(routeIndices, listSerializer));
                                    }
                                }
                                if (num != null) {
                                    HashMap map3 = overviewViewportDataSource3.cachedRemainingPoints;
                                    int iIntValue2 = num.intValue();
                                    listLegs = directionsRoute3.legs();
                                    if (listLegs != null) {
                                        listSerializer = null;
                                    } else {
                                        listSerializer = null;
                                    }
                                    if (listSerializer == null) {
                                        listSerializer = instance_delegatelambda0Var;
                                    }
                                    map3.put(str2, new CachedRemainingPoints(routeIndices, listSerializer));
                                }
                            }
                            List list11 = (List) overviewViewportDataSource3.simplifiedCompleteRoutesPoints.get(i21);
                            CachedRemainingPoints cachedRemainingPoints2 = (CachedRemainingPoints) overviewViewportDataSource3.cachedRemainingPoints.get(str2);
                            List list12 = cachedRemainingPoints2 != null ? cachedRemainingPoints2.remainingPointsOnCurrentStep : null;
                            if (list12 == null) {
                                list12 = instance_delegatelambda0Var;
                            }
                            OverviewMode overviewMode = internalViewportDataSourceOptions.overviewMode;
                            list11.getClass();
                            overviewMode.getClass();
                            List list13 = !list11.isEmpty() ? (List) list11.get(i23) : instance_delegatelambda0Var;
                            if (i22 < list13.size()) {
                                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Integer.valueOf(i22 + 1), Integer.valueOf(list13.size() - 1)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                                ensuresubscribedtoinappmessageeventslambda7.getClass();
                                if (ensuresubscribedtoinappmessageeventslambda7.write()) {
                                    listPlaybackStateCompat = instance_delegatelambda0Var;
                                } else {
                                    listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(list13.subList(ensuresubscribedtoinappmessageeventslambda7.write, ensuresubscribedtoinappmessageeventslambda7.read + 1));
                                }
                            } else {
                                listPlaybackStateCompat = instance_delegatelambda0Var;
                            }
                            ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(listPlaybackStateCompat);
                            int i29 = ViewportDataSourceProcessor.WhenMappings.$EnumSwitchMapping$0[overviewMode.ordinal()];
                            if (i29 == 1 || i29 == 2) {
                                listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = instance_delegatelambda0Var;
                            } else {
                                if (i29 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(list11.subList(i23 + 1, list11.size())));
                            }
                            arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(SQLite.read(list12, arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2, listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
                        }
                        if (arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                            arrayList6.add(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                        }
                        i21++;
                        routeLegProgress2 = routeLegProgress;
                        routeStepProgress2 = routeStepProgress;
                        routeProgress2 = routeProgress;
                    }
                    routeLegProgress = routeLegProgress2;
                    routeProgress = routeProgress2;
                    routeStepProgress = routeStepProgress2;
                    arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    if (arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                        arrayList6.add(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    }
                    i21++;
                    routeLegProgress2 = routeLegProgress;
                    routeStepProgress2 = routeStepProgress;
                    routeProgress2 = routeProgress;
                }
                overviewViewportDataSource3.simplifiedRemainingPointsOnRoutes = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList6);
                return createfromparcel2;
            case 14:
                PerformanceTracker.asyncSectionCompleted((AsyncSection) obj);
                Expected expectedCreateError = ExpectedFactory.createError(new RouteLineError("Skipping #updateWithRouteProgress because a newer one is available."));
                expectedCreateError.getClass();
                ((RouteLineApi$$ExternalSyntheticLambda4) obj2).accept(expectedCreateError);
                LoggerProviderKt.logW("Skipping #updateWithRouteProgress because a newer one is available.", "MapboxRouteLineApi");
                return createfromparcel2;
            case 15:
                MapboxRouteLineView.updateSource((Style) obj2, "mapbox-navigation-waypoint-source", ((RouteSetValue) obj).waypointsSource, null);
                return createfromparcel2;
            case 16:
                ((NetworkHeaders$Builder) obj2).maybeFinish((RouteRenderCallbackHolder) ((Map.Entry) obj).getValue());
                return createfromparcel2;
            case 17:
                SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1 = (SearchOptionsKt$validateLimit$1) obj;
                AtomicBoolean atomicBoolean = ((MapSizeInitializedCallbackHelper$CancellableImpl) obj2).isComplete;
                if (!atomicBoolean.get()) {
                    int i30 = RemoteActionCompatParcelizer + 101;
                    write = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    searchOptionsKt$validateLimit$1.invoke();
                }
                atomicBoolean.set(true);
                return createfromparcel2;
            case 18:
                ((cancelPendingWebViewPause) obj2).IconCompatParcelizer = false;
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj).invoke();
                return createfromparcel2;
            default:
                OnTheWayLifecycleObserverImpl onTheWayLifecycleObserverImpl = (OnTheWayLifecycleObserverImpl) obj2;
                ConstraintReferenceIncorrectConstraintException constraintReferenceIncorrectConstraintException = (ConstraintReferenceIncorrectConstraintException) ((setFirstVerticalBias) onTheWayLifecycleObserverImpl.serializer);
                if (!((SharedPreferences) constraintReferenceIncorrectConstraintException.write.MediaSessionCompatResultReceiverWrapper()).getBoolean("dark_mode_discovery_seen_key", false) && ((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) obj).getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.RESUMED)) {
                    new DarkModeDiscoveryDialogFragment().RemoteActionCompatParcelizer(((MainActivity) onTheWayLifecycleObserverImpl.write).getSupportFragmentManager(), "com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment");
                    ((removeSingleSubscriptionlambda101) onTheWayLifecycleObserverImpl.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer.logEvent("dark_mode_pop_up_displayed", null);
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) constraintReferenceIncorrectConstraintException.write.MediaSessionCompatResultReceiverWrapper()).edit();
                    editorEdit.putBoolean("dark_mode_discovery_seen_key", true);
                    editorEdit.apply();
                }
                return createfromparcel2;
        }
    }
}
