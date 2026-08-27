package com.mapbox.navigation.ui.maps.route.line.api;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteProgressState;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusherProvider;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineError;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineUpdateValue;
import com.mapbox.navigation.ui.maps.route.line.model.VanishingPointState;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda4;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getOrElse;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$updateWithRouteProgress$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ RouteLineApi$$ExternalSyntheticLambda4 $consumer;
    public final /* synthetic */ RouteProgress $routeProgress;
    public final /* synthetic */ AsyncSection $updateWithRouteProgressSection;
    public double D$0;
    public NavigationRoute L$0;
    public RouteLineDynamicData L$1;
    public MapboxRouteLineUtils L$2;
    public MapboxRouteLineApiOptions L$3;
    public int label;
    public final /* synthetic */ MapboxRouteLineApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineApi$updateWithRouteProgress$1(MapboxRouteLineApi mapboxRouteLineApi, RouteProgress routeProgress, RouteLineApi$$ExternalSyntheticLambda4 routeLineApi$$ExternalSyntheticLambda4, AsyncSection asyncSection, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = mapboxRouteLineApi;
        this.$routeProgress = routeProgress;
        this.$consumer = routeLineApi$$ExternalSyntheticLambda4;
        this.$updateWithRouteProgressSection = asyncSection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new MapboxRouteLineApi$updateWithRouteProgress$1(this.this$0, this.$routeProgress, this.$consumer, this.$updateWithRouteProgressSection, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((MapboxRouteLineApi$updateWithRouteProgress$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteLineApi$$ExternalSyntheticLambda4 routeLineApi$$ExternalSyntheticLambda4;
        AsyncSection asyncSection;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        RouteLineDynamicData routeLineDynamicDataForMaskingLayers$ui_maps_release;
        RouteLineDynamicData primaryRouteLineDynamicData$ui_maps_release;
        MapboxRouteLineUtils mapboxRouteLineUtils;
        Object objRouteLineActiveLegExpressionData;
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions;
        double d;
        NavigationRoute navigationRoute;
        VanishingPointState vanishingPointState;
        RouteProgress routeProgress = this.$routeProgress;
        NavigationRoute navigationRoute2 = routeProgress.navigationRoute;
        MapboxRouteLineApi mapboxRouteLineApi = this.this$0;
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions2 = mapboxRouteLineApi.routeLineOptions;
        VanishingRouteLine vanishingRouteLine = mapboxRouteLineApi.vanishingRouteLine;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RouteLineApi$$ExternalSyntheticLambda4 routeLineApi$$ExternalSyntheticLambda5 = this.$consumer;
        AsyncSection asyncSection2 = this.$updateWithRouteProgressSection;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getOrElse getorelse = mapboxRouteLineApi.sender;
            getorelse.getClass();
            RouteLineHistoryRecordingPusherProvider.instance.pushEventIfEnabled(new FlowLiveDataConversions$asFlow$1$1(getorelse, routeProgress, shortNewsContentCardView, 25));
            NavigationRoute navigationRoute3 = mapboxRouteLineApi.primaryRoute;
            RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
            Integer num = new Integer(routeLegProgress.legIndex);
            if (navigationRoute3 == null) {
                PerformanceTracker.asyncSectionCompleted(asyncSection2);
                Expected expectedCreateError = ExpectedFactory.createError(new RouteLineError("You're calling #updateWithRouteProgress without any routes being set."));
                expectedCreateError.getClass();
                routeLineApi$$ExternalSyntheticLambda5.accept(expectedCreateError);
                LoggerProviderKt.logW("You're calling #updateWithRouteProgress without any routes being set.", "MapboxRouteLineApi");
            } else {
                String str = navigationRoute3.id;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, navigationRoute2.id}, getCieXyz.write())).booleanValue()) {
                    mapboxRouteLineApi.startMemoryMonitoring();
                    if (vanishingRouteLine != null) {
                        vanishingRouteLine.upcomingRouteGeometrySegmentIndex = Integer.valueOf(routeProgress.currentRouteGeometryIndex + 1);
                    }
                    routeLineApi$$ExternalSyntheticLambda4 = routeLineApi$$ExternalSyntheticLambda5;
                    asyncSection = asyncSection2;
                    mapboxRouteLineApi.lastIndexUpdateTimeNano = System.nanoTime();
                    RouteProgressState routeProgressState = routeProgress.currentState;
                    if (vanishingRouteLine != null) {
                        int i2 = VanishingRouteLine.WhenMappings.$EnumSwitchMapping$0[routeProgressState.ordinal()];
                        if (i2 != 1) {
                            vanishingPointState = i2 != 2 ? VanishingPointState.DISABLED : VanishingPointState.ONLY_INCREASE_PROGRESS;
                        } else {
                            vanishingPointState = VanishingPointState.ENABLED;
                        }
                        vanishingRouteLine.vanishingPointState = vanishingPointState;
                    }
                    boolean z = num.intValue() != mapboxRouteLineApi.activeLegIndex;
                    mapboxRouteLineApi.activeLegIndex = num.intValue();
                    if (z) {
                        double d2 = (vanishingRouteLine == null || vanishingRouteLine.vanishingPointState == VanishingPointState.DISABLED) ? 0.0d : vanishingRouteLine.vanishPointOffset;
                        Double d3 = new Double(d2);
                        DirectionsRoute directionsRoute = navigationRoute3.directionsRoute;
                        List<RouteLeg> listLegs = directionsRoute.legs();
                        int size = listLegs != null ? listLegs.size() : 0;
                        int i3 = routeLegProgress.legIndex;
                        if (!MapboxRouteLineApi.isMultiLeg(navigationRoute3) || i3 >= size) {
                            routeLineDynamicDataForMaskingLayers$ui_maps_release = null;
                        } else {
                            List list = mapboxRouteLineApi.routeLineExpressionData;
                            Double dDistance = directionsRoute.distance();
                            dDistance.getClass();
                            routeLineDynamicDataForMaskingLayers$ui_maps_release = mapboxRouteLineApi.getRouteLineDynamicDataForMaskingLayers$ui_maps_release(list, d3, dDistance.doubleValue(), i3);
                        }
                        if (mapboxRouteLineApiOptions2.getStyleInactiveRouteLegsIndependently()) {
                            mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                            int i4 = mapboxRouteLineApi.activeLegIndex;
                            this.L$0 = navigationRoute3;
                            this.L$1 = routeLineDynamicDataForMaskingLayers$ui_maps_release;
                            this.L$2 = mapboxRouteLineUtils;
                            this.L$3 = mapboxRouteLineApiOptions2;
                            this.D$0 = d2;
                            this.label = 1;
                            objRouteLineActiveLegExpressionData = mapboxRouteLineApi.routeLineActiveLegExpressionData(i4, this);
                            if (objRouteLineActiveLegExpressionData == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            mapboxRouteLineApiOptions = mapboxRouteLineApiOptions2;
                            d = d2;
                            navigationRoute = navigationRoute3;
                        } else {
                            primaryRouteLineDynamicData$ui_maps_release = null;
                        }
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(routeLineDynamicDataForMaskingLayers$ui_maps_release, primaryRouteLineDynamicData$ui_maps_release);
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, null);
                    }
                    RouteLineDynamicData routeLineDynamicData = (RouteLineDynamicData) onviewattachedtowindowlambda0.serializer;
                    RouteLineDynamicData routeLineDynamicData2 = (RouteLineDynamicData) onviewattachedtowindowlambda0.write;
                    RouteLineValueCommandHolder routeLineValueCommandHolder = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$9, 1), new LineGradientCommandApplier(1));
                    PerformanceTracker.asyncSectionCompleted(asyncSection);
                    Expected expectedCreateValue = ExpectedFactory.createValue(new RouteLineUpdateValue(routeLineDynamicData2, SQLite.read(new RouteLineDynamicData(routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, null, null, null, null, 240), new RouteLineDynamicData(routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, routeLineValueCommandHolder, null, null, null, null, 240)), routeLineDynamicData));
                    expectedCreateValue.getClass();
                    routeLineApi$$ExternalSyntheticLambda4.accept(expectedCreateValue);
                } else {
                    PerformanceTracker.asyncSectionCompleted(asyncSection2);
                    StringBuilder sb = new StringBuilder("Provided primary route (#setNavigationRoutes, ID: ");
                    sb.append(str);
                    sb.append(") and navigated route (#updateWithRouteProgress, ID: ");
                    String strM = ff$$ExternalSyntheticOutline0.m(sb, navigationRoute2.id, ") are not the same. Aborting the update.");
                    Expected expectedCreateError2 = ExpectedFactory.createError(new RouteLineError(strM));
                    expectedCreateError2.getClass();
                    routeLineApi$$ExternalSyntheticLambda5.accept(expectedCreateError2);
                    LoggerProviderKt.logE(strM, "MapboxRouteLineApi");
                }
            }
            return createFromParcel.INSTANCE;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        double d4 = this.D$0;
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions3 = this.L$3;
        mapboxRouteLineUtils = this.L$2;
        routeLineDynamicDataForMaskingLayers$ui_maps_release = this.L$1;
        navigationRoute = this.L$0;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        d = d4;
        mapboxRouteLineApiOptions = mapboxRouteLineApiOptions3;
        routeLineApi$$ExternalSyntheticLambda4 = routeLineApi$$ExternalSyntheticLambda5;
        asyncSection = asyncSection2;
        objRouteLineActiveLegExpressionData = obj;
        List list2 = (List) objRouteLineActiveLegExpressionData;
        List list3 = mapboxRouteLineApi.restrictedExpressionData;
        Double dDistance2 = navigationRoute.directionsRoute.distance();
        dDistance2.getClass();
        double dDoubleValue = dDistance2.doubleValue();
        int i5 = mapboxRouteLineApi.activeLegIndex;
        mapboxRouteLineUtils.getClass();
        primaryRouteLineDynamicData$ui_maps_release = MapboxRouteLineUtils.getPrimaryRouteLineDynamicData$ui_maps_release(mapboxRouteLineApiOptions, list2, list3, dDoubleValue, d, i5);
        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(routeLineDynamicDataForMaskingLayers$ui_maps_release, primaryRouteLineDynamicData$ui_maps_release);
        RouteLineDynamicData routeLineDynamicData3 = (RouteLineDynamicData) onviewattachedtowindowlambda0.serializer;
        RouteLineDynamicData routeLineDynamicData4 = (RouteLineDynamicData) onviewattachedtowindowlambda0.write;
        RouteLineValueCommandHolder routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$9, 1), new LineGradientCommandApplier(1));
        PerformanceTracker.asyncSectionCompleted(asyncSection);
        Expected expectedCreateValue2 = ExpectedFactory.createValue(new RouteLineUpdateValue(routeLineDynamicData4, SQLite.read(new RouteLineDynamicData(routeLineValueCommandHolder2, routeLineValueCommandHolder2, routeLineValueCommandHolder2, routeLineValueCommandHolder2, null, null, null, null, 240), new RouteLineDynamicData(routeLineValueCommandHolder2, routeLineValueCommandHolder2, routeLineValueCommandHolder2, routeLineValueCommandHolder2, null, null, null, null, 240)), routeLineDynamicData3));
        expectedCreateValue2.getClass();
        routeLineApi$$ExternalSyntheticLambda4.accept(expectedCreateValue2);
        return createFromParcel.INSTANCE;
    }
}
