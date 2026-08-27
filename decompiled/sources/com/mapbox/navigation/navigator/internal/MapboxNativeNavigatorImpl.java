package com.mapbox.navigation.navigator.internal;

import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzky;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRefreshResponse;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRouteRefresh;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_RouteLegRefresh;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.AdasisFacadeBuilder;
import com.mapbox.navigator.AdasisFacadeHandle;
import com.mapbox.navigator.BillingProductType;
import com.mapbox.navigator.CacheFactory;
import com.mapbox.navigator.CacheHandle;
import com.mapbox.navigator.ConfigHandle;
import com.mapbox.navigator.Experimental;
import com.mapbox.navigator.GraphAccessor;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.mapbox.navigator.InputsServiceHandle;
import com.mapbox.navigator.Navigator;
import com.mapbox.navigator.NavigatorInterface;
import com.mapbox.navigator.NavigatorObserver;
import com.mapbox.navigator.RoadObjectMatcher;
import com.mapbox.navigator.RoadObjectMatcherConfig;
import com.mapbox.navigator.RoadObjectsStoreInterface;
import com.mapbox.navigator.RouteAlternativesControllerInterface;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.RouterType;
import com.mapbox.navigator.SetRoutesParams;
import com.mapbox.navigator.SetRoutesReason;
import com.mapbox.navigator.Telemetry;
import com.mapbox.navigator.TilesConfig;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNativeNavigatorImpl {
    public AdasisFacadeHandle adasisFacade;
    public CacheHandle cache;
    public final ConfigHandle config;
    public final ArrayList currentNavigatorObservers;
    public final m eventsMetadataProvider;
    public Experimental experimental;
    public final HistoryRecorderHandle historyRecorderComposite;
    public final InputsServiceHandle inputsService;
    public boolean isShutdown;
    public final CopyOnWriteArraySet nativeNavigatorRecreationObservers;
    public Navigator navigator;
    public RoadObjectMatcher roadObjectMatcher;
    public final RoadObjectMatcherConfig roadObjectMatcherConfig;
    public RoadObjectsStoreInterface roadObjectsStore;
    public RouteAlternativesControllerInterface routeAlternativesController;
    public Telemetry telemetry;

    /* JADX INFO: renamed from: com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl$refreshRoute$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public MapboxNativeNavigatorImpl L$0;
        public NavigationRoute L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxNativeNavigatorImpl.this.refreshRoute(null, null, null, this);
        }
    }

    public final void init(TilesConfig tilesConfig) {
        CacheHandle cacheHandleBuild;
        AdasisFacadeHandle adasisFacadeHandleBuild;
        Navigator navigator;
        RoadObjectMatcher roadObjectMatcher;
        RoadObjectsStoreInterface roadObjectsStoreInterfaceRoadObjectsStore;
        Experimental experimental;
        RouteAlternativesControllerInterface routeAlternativesController;
        Telemetry telemetry;
        this.isShutdown = false;
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        HistoryRecorderHandle historyRecorderHandle = this.historyRecorderComposite;
        ConfigHandle configHandle = this.config;
        if (trackingIsActive) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-cacheHandle");
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                cacheHandleBuild = CacheFactory.build(tilesConfig, configHandle, historyRecorderHandle, BillingProductType.CF);
                cacheHandleBuild.getClass();
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-cacheHandle", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-cacheHandle", null);
                throw th;
            }
        } else {
            cacheHandleBuild = CacheFactory.build(tilesConfig, configHandle, historyRecorderHandle, BillingProductType.CF);
            cacheHandleBuild.getClass();
        }
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-adasisFacade");
            try {
                long jWrite2 = BrazeInAppMessageManagerWhenMappings.write();
                AdasisFacadeHandle adasisFacadeHandleBuild2 = AdasisFacadeBuilder.build(configHandle, cacheHandleBuild, historyRecorderHandle);
                adasisFacadeHandleBuild2.getClass();
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-adasisFacade", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite2)));
                adasisFacadeHandleBuild = adasisFacadeHandleBuild2;
            } catch (Throwable th2) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-adasisFacade", null);
                throw th2;
            }
        } else {
            adasisFacadeHandleBuild = AdasisFacadeBuilder.build(configHandle, cacheHandleBuild, historyRecorderHandle);
            adasisFacadeHandleBuild.getClass();
        }
        this.adasisFacade = adasisFacadeHandleBuild;
        boolean trackingIsActive2 = PerformanceTracker.getTrackingIsActive();
        InputsServiceHandle inputsServiceHandle = this.inputsService;
        if (trackingIsActive2) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-navigator");
            try {
                long jWrite3 = BrazeInAppMessageManagerWhenMappings.write();
                HistoryRecorderHandle historyRecorderHandle2 = this.historyRecorderComposite;
                AdasisFacadeHandle adasisFacadeHandle = this.adasisFacade;
                if (adasisFacadeHandle == null) {
                    removeNodeAtDepth.serializer("adasisFacade");
                    throw null;
                }
                inputsServiceHandle.getClass();
                Navigator navigator2 = new Navigator(configHandle, cacheHandleBuild, historyRecorderHandle2, RouterType.HYBRID, inputsServiceHandle, adasisFacadeHandle, null);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-navigator", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite3)));
                navigator = navigator2;
            } catch (Throwable th3) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-navigator", null);
                throw th3;
            }
        } else {
            AdasisFacadeHandle adasisFacadeHandle2 = this.adasisFacade;
            if (adasisFacadeHandle2 == null) {
                removeNodeAtDepth.serializer("adasisFacade");
                throw null;
            }
            inputsServiceHandle.getClass();
            CacheHandle cacheHandle = cacheHandleBuild;
            navigator = new Navigator(configHandle, cacheHandle, this.historyRecorderComposite, RouterType.HYBRID, inputsServiceHandle, adasisFacadeHandle2, null);
        }
        this.navigator = navigator;
        this.cache = cacheHandleBuild;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-graphAccessor");
            try {
                long jWrite4 = BrazeInAppMessageManagerWhenMappings.write();
                new GraphAccessor(cacheHandleBuild);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-graphAccessor", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite4)));
            } catch (Throwable th4) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-graphAccessor", null);
                throw th4;
            }
        } else {
            new GraphAccessor(cacheHandleBuild);
        }
        boolean trackingIsActive3 = PerformanceTracker.getTrackingIsActive();
        RoadObjectMatcherConfig roadObjectMatcherConfig = this.roadObjectMatcherConfig;
        if (trackingIsActive3) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-roadObjectMatcher");
            try {
                long jWrite5 = BrazeInAppMessageManagerWhenMappings.write();
                RoadObjectMatcher roadObjectMatcher2 = new RoadObjectMatcher(cacheHandleBuild, roadObjectMatcherConfig);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-roadObjectMatcher", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite5)));
                roadObjectMatcher = roadObjectMatcher2;
            } catch (Throwable th5) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-roadObjectMatcher", null);
                throw th5;
            }
        } else {
            roadObjectMatcher = new RoadObjectMatcher(cacheHandleBuild, roadObjectMatcherConfig);
        }
        this.roadObjectMatcher = roadObjectMatcher;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-roadObjectsStore");
            try {
                long jWrite6 = BrazeInAppMessageManagerWhenMappings.write();
                RoadObjectsStoreInterface roadObjectsStoreInterfaceRoadObjectsStore2 = getNavigator().roadObjectsStore();
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-roadObjectsStore", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite6)));
                roadObjectsStoreInterfaceRoadObjectsStore = roadObjectsStoreInterfaceRoadObjectsStore2;
            } catch (Throwable th6) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-roadObjectsStore", null);
                throw th6;
            }
        } else {
            roadObjectsStoreInterfaceRoadObjectsStore = getNavigator().roadObjectsStore();
        }
        roadObjectsStoreInterfaceRoadObjectsStore.getClass();
        this.roadObjectsStore = roadObjectsStoreInterfaceRoadObjectsStore;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-experimental");
            try {
                long jWrite7 = BrazeInAppMessageManagerWhenMappings.write();
                Experimental experimental2 = getNavigator().getExperimental();
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-experimental", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite7)));
                experimental = experimental2;
            } catch (Throwable th7) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-experimental", null);
                throw th7;
            }
        } else {
            experimental = getNavigator().getExperimental();
        }
        experimental.getClass();
        this.experimental = experimental;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-routeAlternativesController");
            try {
                long jWrite8 = BrazeInAppMessageManagerWhenMappings.write();
                RouteAlternativesControllerInterface routeAlternativesController2 = getNavigator().getRouteAlternativesController();
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-routeAlternativesController", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite8)));
                routeAlternativesController = routeAlternativesController2;
            } catch (Throwable th8) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-routeAlternativesController", null);
                throw th8;
            }
        } else {
            routeAlternativesController = getNavigator().getRouteAlternativesController();
        }
        routeAlternativesController.getClass();
        this.routeAlternativesController = routeAlternativesController;
        boolean trackingIsActive4 = PerformanceTracker.getTrackingIsActive();
        m mVar = this.eventsMetadataProvider;
        if (trackingIsActive4) {
            PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#init-telemetry");
            try {
                long jWrite9 = BrazeInAppMessageManagerWhenMappings.write();
                Telemetry telemetry2 = getNavigator().getTelemetry(mVar);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-telemetry", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite9)));
                telemetry = telemetry2;
            } catch (Throwable th9) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNativeNavigatorImpl#init-telemetry", null);
                throw th9;
            }
        } else {
            telemetry = getNavigator().getTelemetry(mVar);
        }
        telemetry.getClass();
        this.telemetry = telemetry;
    }

    public final void addNativeNavigatorRecreationObserver(NativeNavigatorRecreationObserver nativeNavigatorRecreationObserver) {
        if (warnIfShutdown("addNativeNavigatorRecreationObserver")) {
            return;
        }
        this.nativeNavigatorRecreationObservers.add(nativeNavigatorRecreationObserver);
    }

    public final RouterInterface getRouter() {
        if (warnIfShutdown("getRouter")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Navigator is shut down");
            return null;
        }
        RouterInterface router = getNavigator().getRouter();
        router.getClass();
        return router;
    }

    public final Object setRoutes(NavigationRoute navigationRoute, int i, List list, SetRoutesReason setRoutesReason, ContinuationImpl continuationImpl) {
        SetRoutesParams setRoutesParams;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(continuationImpl));
        cancellableContinuationImpl.read();
        if (warnIfShutdown("setRoutes")) {
            cancellableContinuationImpl.resumeWith(ExpectedFactory.createError("Navigator is shut down"));
        } else {
            NavigatorInterface navigator = getNavigator();
            if (navigationRoute != null) {
                RouteInterface routeInterface = navigationRoute.nativeRoute;
                List<NavigationRoute> list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (NavigationRoute navigationRoute2 : list2) {
                    navigationRoute2.getClass();
                    arrayList.add(navigationRoute2.nativeRoute);
                }
                setRoutesParams = new SetRoutesParams(routeInterface, i, arrayList);
            } else {
                setRoutesParams = null;
            }
            navigator.setRoutes(setRoutesParams, setRoutesReason, new CallsKt$await$2$2(cancellableContinuationImpl, 4));
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public MapboxNativeNavigatorImpl(TilesConfig tilesConfig, HistoryRecorderHandle historyRecorderHandle, RoadObjectMatcherConfig roadObjectMatcherConfig, ConfigHandle configHandle, m mVar) {
        this.historyRecorderComposite = historyRecorderHandle;
        this.roadObjectMatcherConfig = roadObjectMatcherConfig;
        this.config = configHandle;
        this.eventsMetadataProvider = mVar;
        InputsServiceHandle inputsServiceHandleBuild = InputsServiceHandle.build(configHandle, historyRecorderHandle);
        inputsServiceHandleBuild.getClass();
        this.inputsService = inputsServiceHandleBuild;
        this.nativeNavigatorRecreationObservers = new CopyOnWriteArraySet();
        init(tilesConfig);
        this.currentNavigatorObservers = new ArrayList();
    }

    public final void setUserLanguages(ArrayList arrayList) {
        if (warnIfShutdown("setUserLanguages")) {
            return;
        }
        getNavigator().config().mutableSettings().setUserLanguages(arrayList);
    }

    public final void unregisterAllNativeNavigatorObservers() {
        getNavigator().setElectronicHorizonObserver(null);
        getNavigator().setFallbackVersionsObserver(null);
        ArrayList arrayList = this.currentNavigatorObservers;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getNavigator().removeObserver((NavigatorObserver) it.next());
        }
        arrayList.clear();
    }

    public final boolean warnIfShutdown(String str) {
        if (!this.isShutdown) {
            return false;
        }
        LoggerProviderKt.logW(str.concat(" called after the navigator was shut down, ignoring."), "MapboxNativeNavigatorImpl");
        return true;
    }

    public final NavigatorInterface getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        removeNodeAtDepth.serializer("navigator");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object refreshRoute(NavigationRoute navigationRoute, DataRef dataRef, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        AnonymousClass1 anonymousClass1;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 anonymousClass11;
        ArrayList arrayList;
        Map mapSingletonMap;
        Object objWithContext;
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl;
        NavigationRoute navigationRoute2 = navigationRoute;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        int i3 = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            if (i2 == 1) {
            } else if (i2 == 2) {
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) anonymousClass1.L$2;
                NavigationRoute navigationRoute3 = anonymousClass1.L$1;
                mapboxNativeNavigatorImpl = anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                anonymousClass11 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                navigationRoute2 = navigationRoute3;
                objWithContext = obj;
            } else if (i2 == 3) {
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (warnIfShutdown("refreshRoute")) {
            Expected expectedCreateError = ExpectedFactory.createError("Navigator is shut down");
            expectedCreateError.getClass();
            return expectedCreateError;
        }
        anonymousClass11 = new MapboxNavigation.AnonymousClass11(i3, navigationRoute2);
        if (dataRef != null && num != null) {
            StringBuilder sb = new StringBuilder("Refreshing native route ");
            navigationRoute.getClass();
            RouteInterface routeInterface = navigationRoute2.nativeRoute;
            sb.append(routeInterface.getRouteId());
            sb.append(" with response from Directions API at geometry index ");
            sb.append(num);
            LoggerProviderKt.logD(sb.toString(), "MapboxNativeNavigatorImpl");
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = navigationRoute2;
            anonymousClass1.L$2 = dataRef;
            anonymousClass1.L$3 = num;
            anonymousClass1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(anonymousClass1));
            cancellableContinuationImpl.read();
            getNavigator().refreshRoute(dataRef, routeInterface.getRouteId(), num.intValue(), new Vw$Vw(anonymousClass11, 12, cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result != coroutineSingletons) {
                return result;
            }
        } else {
            navigationRoute.getClass();
            DirectionsParsedRouteData directionsParsedRouteData = (DirectionsParsedRouteData) navigationRoute2.operations.read;
            List<RouteLeg> listLegs = directionsParsedRouteData.route.legs();
            if (listLegs != null) {
                List<RouteLeg> list = listLegs;
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (RouteLeg routeLeg : list) {
                    arrayList.add(new AutoValue_RouteLegRefresh(null, routeLeg.incidents(), routeLeg.annotation(), null, routeLeg.notifications()));
                }
            } else {
                arrayList = null;
            }
            List list2 = directionsParsedRouteData.routesWaypoint;
            if (list2 != null) {
                JsonArray jsonArray = new JsonArray();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    jsonArray.add(JsonParser.parseString(((DirectionsWaypoint) it.next()).toJson()));
                }
                mapSingletonMap = Collections.singletonMap("waypoints", jsonArray);
                mapSingletonMap.getClass();
            } else {
                mapSingletonMap = null;
            }
            AutoValue_DirectionsRefreshResponse autoValue_DirectionsRefreshResponse = new AutoValue_DirectionsRefreshResponse(null, "200", null, new AutoValue_DirectionsRouteRefresh(zzky.toSerializableProperties(mapSingletonMap), arrayList));
            Throwable thSerializer = onItemDismiss.serializer(autoValue_DirectionsRefreshResponse);
            if (thSerializer == null) {
                DefaultScheduler defaultScheduler = ThreadController.DefaultDispatcher;
                DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(autoValue_DirectionsRefreshResponse, shortNewsContentCardView, 7);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = navigationRoute2;
                anonymousClass1.L$2 = anonymousClass11;
                anonymousClass1.label = 2;
                objWithContext = BuildersKt.withContext(defaultScheduler, diskLruCache$launchCleanup$1, anonymousClass1);
                if (objWithContext != coroutineSingletons) {
                    mapboxNativeNavigatorImpl = this;
                }
            } else {
                String message = thSerializer.getMessage();
                if (message == null) {
                    message = "unknown error during refresh response client side generation";
                }
                Expected expectedCreateError2 = ExpectedFactory.createError(message);
                expectedCreateError2.getClass();
                return expectedCreateError2;
            }
        }
        String str = (String) objWithContext;
        anonymousClass1.L$0 = mapboxNativeNavigatorImpl;
        anonymousClass1.L$1 = navigationRoute2;
        anonymousClass1.L$2 = anonymousClass11;
        anonymousClass1.L$3 = str;
        anonymousClass1.label = 3;
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(anonymousClass1));
        cancellableContinuationImpl2.read();
        StringBuilder sb2 = new StringBuilder("Refreshing native route ");
        navigationRoute2.getClass();
        RouteInterface routeInterface2 = navigationRoute2.nativeRoute;
        sb2.append(routeInterface2.getRouteId());
        sb2.append(" with generated refresh response: ");
        sb2.append(str);
        LoggerProviderKt.logD(sb2.toString(), "MapboxNativeNavigatorImpl");
        mapboxNativeNavigatorImpl.getNavigator().refreshRoute(str, routeInterface2.getRouteId(), 0, new Parser.Pair(anonymousClass11, 6, cancellableContinuationImpl2));
        Object result2 = cancellableContinuationImpl2.getResult();
        return result2 == coroutineSingletons ? coroutineSingletons : result2;
    }
}
