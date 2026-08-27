package com.mapbox.navigation.core.routerefresh;

import android.os.SystemClock;
import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmi;
import com.google.gson.JsonElement;
import com.google.re2j.Parser;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.navigation.base.internal.RouteRefreshRequestData;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.RoutesRefreshData;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.internal.RouteProgressData;
import com.mapbox.navigation.core.internal.router.NavigationRouterRefreshError;
import com.mapbox.navigation.core.internal.router.OngoingRequest;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.RouteRefreshOptions;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.navigator.RouterRefreshCallback;
import com.mapbox.navigator.RoutingMode;
import com.mapbox.navigator.RoutingProfile;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache$set$2;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.replay.ReplayCache$rotate$1$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.cancelPendingWebViewPause;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getOnFillData;
import o.getPageUp;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setViewAccessibilityFlagMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefresher {
    public final AnalyticsServiceImpl evRefreshDataProvider;
    public final getContentViewGroupParentLayout globalScope = setViewAccessibilityFlagMap.serializer;
    public final p0 routeDiffProvider;
    public final MapboxDirectionsSession routeRefresh;
    public final AnalyticsServiceImpl routesRefreshDataProvider;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.routerefresh.RouteRefresher$refresh$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRefresher.this.refresh(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.core.routerefresh.RouteRefresher$refreshRoutes$1, reason: invalid class name and case insensitive filesystem */
    public final class C01451 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C01451(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteRefresher.this.refreshRoutes(null, 0L, this);
        }
    }

    public RouteRefresher(AnalyticsServiceImpl analyticsServiceImpl, AnalyticsServiceImpl analyticsServiceImpl2, p0 p0Var, MapboxDirectionsSession mapboxDirectionsSession) {
        this.routesRefreshDataProvider = analyticsServiceImpl;
        this.evRefreshDataProvider = analyticsServiceImpl2;
        this.routeDiffProvider = p0Var;
        this.routeRefresh = mapboxDirectionsSession;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object refresh(List list, long j, ContinuationImpl continuationImpl) {
        AnonymousClass1 anonymousClass1;
        RouteRefresher routeRefresher;
        List list2;
        RoutesRefreshData routesRefreshData;
        List list3;
        NavigationRoute navigationRoute;
        ArrayList arrayList;
        int i;
        int i2;
        NavigationRoute navigationRoute2;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object routesRefreshData2 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = anonymousClass1.label;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(routesRefreshData2);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.J$0 = j;
            anonymousClass1.label = 1;
            routesRefreshData2 = this.routesRefreshDataProvider.getRoutesRefreshData(list, anonymousClass1);
            if (routesRefreshData2 != coroutineSingletons) {
                routeRefresher = this;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            j = anonymousClass1.J$0;
            list = (List) anonymousClass1.L$1;
            routeRefresher = (RouteRefresher) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(routesRefreshData2);
        } else {
            if (i4 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            routesRefreshData = (RoutesRefreshData) anonymousClass1.L$1;
            list2 = (List) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(routesRefreshData2);
        }
        list3 = (List) routesRefreshData2;
        if (((RouteRefresherResult) onContentCardDismissed.read(list3)).status instanceof RouteRefresherStatus$Success) {
            navigationRoute = ((RouteRefresherResult) onContentCardDismissed.read(list3)).route;
        } else {
            navigationRoute = (NavigationRoute) onContentCardDismissed.read(list2);
        }
        ArrayList arrayList2 = routesRefreshData.alternativeRoutesProgressData;
        arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        i = 0;
        for (Object obj : arrayList2) {
            i2 = i + 1;
            if (i >= 0) {
                SQLite.serializer();
                throw null;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
            if (((RouteRefresherResult) list3.get(i2)).status instanceof RouteRefresherStatus$Success) {
                navigationRoute2 = ((RouteRefresherResult) list3.get(i2)).route;
            } else {
                navigationRoute2 = (NavigationRoute) list2.get(i2);
            }
            arrayList.add(new RouteRefresherResult(navigationRoute2, onviewattachedtowindowlambda0.write, ((RouteRefresherResult) list3.get(i2)).status));
            i = i2;
        }
        return new RoutesRefresherResult(new RouteRefresherResult(navigationRoute, routesRefreshData.primaryRouteProgressData, ((RouteRefresherResult) onContentCardDismissed.read(list3)).status), arrayList);
        RoutesRefreshData routesRefreshData3 = (RoutesRefreshData) routesRefreshData2;
        anonymousClass1.L$0 = list;
        anonymousClass1.L$1 = routesRefreshData3;
        anonymousClass1.label = 2;
        Object objRefreshRoutes = routeRefresher.refreshRoutes(routesRefreshData3, j, anonymousClass1);
        if (objRefreshRoutes != coroutineSingletons) {
            list2 = list;
            routesRefreshData = routesRefreshData3;
            routesRefreshData2 = objRefreshRoutes;
            list3 = (List) routesRefreshData2;
            if (((RouteRefresherResult) onContentCardDismissed.read(list3)).status instanceof RouteRefresherStatus$Success) {
                navigationRoute = ((RouteRefresherResult) onContentCardDismissed.read(list3)).route;
            } else {
                navigationRoute = (NavigationRoute) onContentCardDismissed.read(list2);
            }
            ArrayList arrayList3 = routesRefreshData.alternativeRoutesProgressData;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
            i = 0;
            while (r0.hasNext()) {
                i2 = i + 1;
                if (i >= 0) {
                    SQLite.serializer();
                    throw null;
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) obj;
                if (((RouteRefresherResult) list3.get(i2)).status instanceof RouteRefresherStatus$Success) {
                    navigationRoute2 = ((RouteRefresherResult) list3.get(i2)).route;
                } else {
                    navigationRoute2 = (NavigationRoute) list2.get(i2);
                }
                arrayList.add(new RouteRefresherResult(navigationRoute2, onviewattachedtowindowlambda1.write, ((RouteRefresherResult) list3.get(i2)).status));
                i = i2;
            }
            return new RoutesRefresherResult(new RouteRefresherResult(navigationRoute, routesRefreshData.primaryRouteProgressData, ((RouteRefresherResult) onContentCardDismissed.read(list3)).status), arrayList);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object refreshRoutes(RoutesRefreshData routesRefreshData, long j, ContinuationImpl continuationImpl) {
        C01451 c01451;
        if (continuationImpl instanceof C01451) {
            c01451 = (C01451) continuationImpl;
            int i = c01451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01451.label = i - Integer.MIN_VALUE;
            } else {
                c01451 = new C01451(continuationImpl);
            }
        } else {
            c01451 = new C01451(continuationImpl);
        }
        Object objCoroutineScope = c01451.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01451.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
            VendorReviewConfigCache$set$2 vendorReviewConfigCache$set$2 = new VendorReviewConfigCache$set$2(routesRefreshData, j, this, (ShortNewsContentCardView) null);
            c01451.label = 1;
            objCoroutineScope = YieldKt.coroutineScope(vendorReviewConfigCache$set$2, c01451);
            if (objCoroutineScope != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
                return objCoroutineScope;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
        c01451.label = 2;
        Object objAwaitAll = JobKt.awaitAll((Collection) objCoroutineScope, c01451);
        return objAwaitAll == coroutineSingletons ? coroutineSingletons : objAwaitAll;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object access$refreshRoute(RouteRefresher routeRefresher, final NavigationRoute navigationRoute, RouteProgressData routeProgressData, ContinuationImpl continuationImpl) {
        RouteRefresher$refreshRoute$1 routeRefresher$refreshRoute$1;
        CancellableContinuationImpl cancellableContinuationImpl;
        long jLongValue;
        RouteProgressData routeProgressData2;
        RouteRefresher routeRefresher2;
        NavigationRoute navigationRoute2;
        Object obj;
        RouteRefreshRequestData routeRefreshRequestData;
        RoutingMode routingMode;
        final cancelPendingWebViewPause cancelpendingwebviewpause;
        final AsyncSection asyncSectionAsyncSectionStarted;
        Long lValueOf;
        RouteRefresherStatus$Failure routeRefresherStatus$Failure = RouteRefresherStatus$Failure.INSTANCE$2;
        if (continuationImpl instanceof RouteRefresher$refreshRoute$1) {
            routeRefresher$refreshRoute$1 = (RouteRefresher$refreshRoute$1) continuationImpl;
            int i = routeRefresher$refreshRoute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeRefresher$refreshRoute$1.label = i - Integer.MIN_VALUE;
            } else {
                routeRefresher$refreshRoute$1 = new RouteRefresher$refreshRoute$1(routeRefresher, continuationImpl);
            }
        } else {
            routeRefresher$refreshRoute$1 = new RouteRefresher$refreshRoute$1(routeRefresher, continuationImpl);
        }
        Object obj2 = routeRefresher$refreshRoute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeRefresher$refreshRoute$1.label;
        String str = "RouteRefreshController";
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            getOnFillData getonfilldataValidateRoute = RouteRefreshValidator.validateRoute(navigationRoute);
            RouteOptions routeOptions = navigationRoute.routeOptions;
            String str2 = navigationRoute.id;
            if (getonfilldataValidateRoute instanceof RouteRefreshValidator$RouteValidationResult$Invalid) {
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("route ", str2, " can't be refreshed because ");
                sbM.append(((RouteRefreshValidator$RouteValidationResult$Invalid) getonfilldataValidateRoute).reason);
                LoggerProviderKt.logI(sbM.toString(), "RouteRefreshController");
                return new RouteRefresherResult(navigationRoute, routeProgressData, RouteRefresherStatus$Failure.INSTANCE$1, false);
            }
            Long l = navigationRoute.expirationTimeElapsedSeconds;
            if (l != null) {
                if (SystemClock.elapsedRealtime() / 1000 >= l.longValue()) {
                    LoggerProviderKt.logI("route " + str2 + " will not be refreshed because it is invalidated", "RouteRefreshController");
                    return new RouteRefresherResult(navigationRoute, routeProgressData, routeRefresherStatus$Failure, false);
                }
            }
            int i3 = routeProgressData.legIndex;
            int i4 = routeProgressData.routeGeometryIndex;
            Integer num = routeProgressData.legGeometryIndex;
            AnalyticsServiceImpl analyticsServiceImpl = routeRefresher.evRefreshDataProvider;
            routeOptions.getClass();
            HashMap map = new HashMap();
            if (zzmi.isEVRoute(routeOptions.getUnrecognizedJsonProperties())) {
                map.put("engine", "electric");
                Parser.Pair pair = (Parser.Pair) analyticsServiceImpl.locationProvider;
                Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
                unrecognizedJsonProperties.getClass();
                map.putAll(pair.currentData(unrecognizedJsonProperties));
            }
            final RouteRefreshRequestData routeRefreshRequestData2 = new RouteRefreshRequestData(i3, i4, num, map);
            routeRefresher$refreshRoute$1.L$0 = routeRefresher;
            routeRefresher$refreshRoute$1.L$1 = navigationRoute;
            routeRefresher$refreshRoute$1.L$2 = routeProgressData;
            routeRefresher$refreshRoute$1.L$3 = routeRefreshRequestData2;
            routeRefresher$refreshRoute$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(routeRefresher$refreshRoute$1));
            cancellableContinuationImpl2.read();
            MapboxDirectionsSession mapboxDirectionsSession = routeRefresher.routeRefresh;
            final CallsKt$await$2$2 callsKt$await$2$2 = new CallsKt$await$2$2(cancellableContinuationImpl2, 2);
            final BlockRunner blockRunner = mapboxDirectionsSession.router;
            final String strRequestUuid = navigationRoute.directionsRoute.requestUuid();
            int routeIndex = navigationRoute.nativeRoute.getRouteIndex();
            if (strRequestUuid != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strRequestUuid)) {
                String strProfile = routeOptions.profile();
                strProfile.getClass();
                switch (strProfile) {
                    case "driving-traffic":
                        routingMode = RoutingMode.DRIVING_TRAFFIC;
                        final RouteRefreshOptions routeRefreshOptions = new RouteRefreshOptions(strRequestUuid, routeIndex, i3, new RoutingProfile(routingMode, routeOptions.user()), routeOptions.baseUrl(), Integer.valueOf(i4), new HashMap(map));
                        final RouterInterface router$navigation_release = blockRunner.getRouter$navigation_release();
                        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        cancelpendingwebviewpause = new cancelPendingWebViewPause();
                        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                        asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("RouterWrapper#getRouteRefresh()");
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        lValueOf = Long.valueOf(router$navigation_release.getRouteRefresh(routeRefreshOptions, new RouterRefreshCallback() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda0
                            @Override // com.mapbox.navigator.RouterRefreshCallback
                            public final void run(Expected expected, RouterOrigin routerOrigin, HashMap map2) {
                                NavigationRoute navigationRoute3 = navigationRoute;
                                navigationRoute3.getClass();
                                AsyncSection asyncSection = asyncSectionAsyncSectionStarted;
                                asyncSection.getClass();
                                expected.getClass();
                                routerOrigin.getClass();
                                map2.getClass();
                                cancelpendingwebviewpause.IconCompatParcelizer = true;
                                LoggerProviderKt.logI("Received result from router.getRouteRefresh for " + navigationRoute3.id, "RouterWrapper");
                                BlockRunner blockRunner2 = blockRunner;
                                BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new RouterWrapper$getRouteRefresh$1$1(asyncSection, blockRunner2, createinappmessageeventsubscriber, router$navigation_release, strRequestUuid, routeRefreshRequestData2, routeRefreshOptions, navigationRoute3, expected, callsKt$await$2$2, null), 3);
                            }
                        }));
                        createinappmessageeventsubscriber.IconCompatParcelizer = lValueOf;
                        if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                            ((LinkedHashMap) blockRunner.write).put(lValueOf, new OngoingRequest(new LayerUtils$getLayer$source$2(asyncSectionAsyncSectionStarted, 9, callsKt$await$2$2)));
                        }
                        jLongValue = ((Number) createinappmessageeventsubscriber.IconCompatParcelizer).longValue();
                        break;
                    case "walking":
                        routingMode = RoutingMode.WALKING;
                        final RouteRefreshOptions routeRefreshOptions2 = new RouteRefreshOptions(strRequestUuid, routeIndex, i3, new RoutingProfile(routingMode, routeOptions.user()), routeOptions.baseUrl(), Integer.valueOf(i4), new HashMap(map));
                        final RouterInterface router$navigation_release2 = blockRunner.getRouter$navigation_release();
                        final createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                        cancelpendingwebviewpause = new cancelPendingWebViewPause();
                        PerformanceTracker performanceTracker2 = PerformanceTracker.INSTANCE;
                        asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("RouterWrapper#getRouteRefresh()");
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        lValueOf = Long.valueOf(router$navigation_release2.getRouteRefresh(routeRefreshOptions2, new RouterRefreshCallback() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda0
                            @Override // com.mapbox.navigator.RouterRefreshCallback
                            public final void run(Expected expected, RouterOrigin routerOrigin, HashMap map2) {
                                NavigationRoute navigationRoute3 = navigationRoute;
                                navigationRoute3.getClass();
                                AsyncSection asyncSection = asyncSectionAsyncSectionStarted;
                                asyncSection.getClass();
                                expected.getClass();
                                routerOrigin.getClass();
                                map2.getClass();
                                cancelpendingwebviewpause.IconCompatParcelizer = true;
                                LoggerProviderKt.logI("Received result from router.getRouteRefresh for " + navigationRoute3.id, "RouterWrapper");
                                BlockRunner blockRunner2 = blockRunner;
                                BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new RouterWrapper$getRouteRefresh$1$1(asyncSection, blockRunner2, createinappmessageeventsubscriber2, router$navigation_release2, strRequestUuid, routeRefreshRequestData2, routeRefreshOptions2, navigationRoute3, expected, callsKt$await$2$2, null), 3);
                            }
                        }));
                        createinappmessageeventsubscriber2.IconCompatParcelizer = lValueOf;
                        if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                            ((LinkedHashMap) blockRunner.write).put(lValueOf, new OngoingRequest(new LayerUtils$getLayer$source$2(asyncSectionAsyncSectionStarted, 9, callsKt$await$2$2)));
                        }
                        jLongValue = ((Number) createinappmessageeventsubscriber2.IconCompatParcelizer).longValue();
                        break;
                    case "cycling":
                        routingMode = RoutingMode.CYCLING;
                        final RouteRefreshOptions routeRefreshOptions3 = new RouteRefreshOptions(strRequestUuid, routeIndex, i3, new RoutingProfile(routingMode, routeOptions.user()), routeOptions.baseUrl(), Integer.valueOf(i4), new HashMap(map));
                        final RouterInterface router$navigation_release3 = blockRunner.getRouter$navigation_release();
                        final createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = new createInAppMessageEventSubscriber();
                        cancelpendingwebviewpause = new cancelPendingWebViewPause();
                        PerformanceTracker performanceTracker3 = PerformanceTracker.INSTANCE;
                        asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("RouterWrapper#getRouteRefresh()");
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        lValueOf = Long.valueOf(router$navigation_release3.getRouteRefresh(routeRefreshOptions3, new RouterRefreshCallback() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda0
                            @Override // com.mapbox.navigator.RouterRefreshCallback
                            public final void run(Expected expected, RouterOrigin routerOrigin, HashMap map2) {
                                NavigationRoute navigationRoute3 = navigationRoute;
                                navigationRoute3.getClass();
                                AsyncSection asyncSection = asyncSectionAsyncSectionStarted;
                                asyncSection.getClass();
                                expected.getClass();
                                routerOrigin.getClass();
                                map2.getClass();
                                cancelpendingwebviewpause.IconCompatParcelizer = true;
                                LoggerProviderKt.logI("Received result from router.getRouteRefresh for " + navigationRoute3.id, "RouterWrapper");
                                BlockRunner blockRunner2 = blockRunner;
                                BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new RouterWrapper$getRouteRefresh$1$1(asyncSection, blockRunner2, createinappmessageeventsubscriber3, router$navigation_release3, strRequestUuid, routeRefreshRequestData2, routeRefreshOptions3, navigationRoute3, expected, callsKt$await$2$2, null), 3);
                            }
                        }));
                        createinappmessageeventsubscriber3.IconCompatParcelizer = lValueOf;
                        if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                            ((LinkedHashMap) blockRunner.write).put(lValueOf, new OngoingRequest(new LayerUtils$getLayer$source$2(asyncSectionAsyncSectionStarted, 9, callsKt$await$2$2)));
                        }
                        jLongValue = ((Number) createinappmessageeventsubscriber3.IconCompatParcelizer).longValue();
                        break;
                    case "driving":
                        routingMode = RoutingMode.DRIVING;
                        final RouteRefreshOptions routeRefreshOptions4 = new RouteRefreshOptions(strRequestUuid, routeIndex, i3, new RoutingProfile(routingMode, routeOptions.user()), routeOptions.baseUrl(), Integer.valueOf(i4), new HashMap(map));
                        final RouterInterface router$navigation_release4 = blockRunner.getRouter$navigation_release();
                        final createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = new createInAppMessageEventSubscriber();
                        cancelpendingwebviewpause = new cancelPendingWebViewPause();
                        PerformanceTracker performanceTracker4 = PerformanceTracker.INSTANCE;
                        asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("RouterWrapper#getRouteRefresh()");
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                        lValueOf = Long.valueOf(router$navigation_release4.getRouteRefresh(routeRefreshOptions4, new RouterRefreshCallback() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda0
                            @Override // com.mapbox.navigator.RouterRefreshCallback
                            public final void run(Expected expected, RouterOrigin routerOrigin, HashMap map2) {
                                NavigationRoute navigationRoute3 = navigationRoute;
                                navigationRoute3.getClass();
                                AsyncSection asyncSection = asyncSectionAsyncSectionStarted;
                                asyncSection.getClass();
                                expected.getClass();
                                routerOrigin.getClass();
                                map2.getClass();
                                cancelpendingwebviewpause.IconCompatParcelizer = true;
                                LoggerProviderKt.logI("Received result from router.getRouteRefresh for " + navigationRoute3.id, "RouterWrapper");
                                BlockRunner blockRunner2 = blockRunner;
                                BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new RouterWrapper$getRouteRefresh$1$1(asyncSection, blockRunner2, createinappmessageeventsubscriber4, router$navigation_release4, strRequestUuid, routeRefreshRequestData2, routeRefreshOptions4, navigationRoute3, expected, callsKt$await$2$2, null), 3);
                            }
                        }));
                        createinappmessageeventsubscriber4.IconCompatParcelizer = lValueOf;
                        if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                            ((LinkedHashMap) blockRunner.write).put(lValueOf, new OngoingRequest(new LayerUtils$getLayer$source$2(asyncSectionAsyncSectionStarted, 9, callsKt$await$2$2)));
                        }
                        jLongValue = ((Number) createinappmessageeventsubscriber4.IconCompatParcelizer).longValue();
                        break;
                    default:
                        if (strProfile.equals("driving-traffic")) {
                            routingMode = RoutingMode.DRIVING_TRAFFIC;
                            final RouteRefreshOptions routeRefreshOptions5 = new RouteRefreshOptions(strRequestUuid, routeIndex, i3, new RoutingProfile(routingMode, routeOptions.user()), routeOptions.baseUrl(), Integer.valueOf(i4), new HashMap(map));
                            final RouterInterface router$navigation_release5 = blockRunner.getRouter$navigation_release();
                            final createInAppMessageEventSubscriber createinappmessageeventsubscriber5 = new createInAppMessageEventSubscriber();
                            cancelpendingwebviewpause = new cancelPendingWebViewPause();
                            PerformanceTracker performanceTracker5 = PerformanceTracker.INSTANCE;
                            asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("RouterWrapper#getRouteRefresh()");
                            cancellableContinuationImpl = cancellableContinuationImpl2;
                            lValueOf = Long.valueOf(router$navigation_release5.getRouteRefresh(routeRefreshOptions5, new RouterRefreshCallback() { // from class: com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda0
                                @Override // com.mapbox.navigator.RouterRefreshCallback
                                public final void run(Expected expected, RouterOrigin routerOrigin, HashMap map2) {
                                    NavigationRoute navigationRoute3 = navigationRoute;
                                    navigationRoute3.getClass();
                                    AsyncSection asyncSection = asyncSectionAsyncSectionStarted;
                                    asyncSection.getClass();
                                    expected.getClass();
                                    routerOrigin.getClass();
                                    map2.getClass();
                                    cancelpendingwebviewpause.IconCompatParcelizer = true;
                                    LoggerProviderKt.logI("Received result from router.getRouteRefresh for " + navigationRoute3.id, "RouterWrapper");
                                    BlockRunner blockRunner2 = blockRunner;
                                    BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) blockRunner2.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new RouterWrapper$getRouteRefresh$1$1(asyncSection, blockRunner2, createinappmessageeventsubscriber5, router$navigation_release5, strRequestUuid, routeRefreshRequestData2, routeRefreshOptions5, navigationRoute3, expected, callsKt$await$2$2, null), 3);
                                }
                            }));
                            createinappmessageeventsubscriber5.IconCompatParcelizer = lValueOf;
                            if (!cancelpendingwebviewpause.IconCompatParcelizer) {
                                ((LinkedHashMap) blockRunner.write).put(lValueOf, new OngoingRequest(new LayerUtils$getLayer$source$2(asyncSectionAsyncSectionStarted, 9, callsKt$await$2$2)));
                            }
                            jLongValue = ((Number) createinappmessageeventsubscriber5.IconCompatParcelizer).longValue();
                            break;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid routing profile: ".concat(strProfile));
                        return null;
                }
            }
            cancellableContinuationImpl = cancellableContinuationImpl2;
            String strMediaSessionCompatQueueItem = isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n                   Route refresh failed because of a empty or null param:\n                   requestUuid = " + strRequestUuid + "\n                ");
            LoggerProviderKt.logW(strMediaSessionCompatQueueItem, "RouterWrapper");
            callsKt$await$2$2.onFailure(new NavigationRouterRefreshError("Route refresh failed", new Exception(strMediaSessionCompatQueueItem), null, 12));
            jLongValue = -1;
            ReplayCache$rotate$1$1 replayCache$rotate$1$1 = new ReplayCache$rotate$1$1(navigationRoute, routeRefresher, jLongValue);
            CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl;
            cancellableContinuationImpl3.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) replayCache$rotate$1$1);
            Object result = cancellableContinuationImpl3.getResult();
            if (result == coroutineSingletons) {
                return coroutineSingletons;
            }
            routeProgressData2 = routeProgressData;
            routeRefresher2 = routeRefresher;
            navigationRoute2 = navigationRoute;
            obj = result;
            routeRefreshRequestData = routeRefreshRequestData2;
        } else if (i2 == 1) {
            RouteRefreshRequestData routeRefreshRequestData3 = routeRefresher$refreshRoute$1.L$3;
            routeProgressData2 = routeRefresher$refreshRoute$1.L$2;
            navigationRoute2 = routeRefresher$refreshRoute$1.L$1;
            routeRefresher2 = routeRefresher$refreshRoute$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            obj = obj2;
            str = "RouteRefreshController";
            routeRefresherStatus$Failure = routeRefresherStatus$Failure;
            routeRefreshRequestData = routeRefreshRequestData3;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        getPageUp getpageup = (getPageUp) obj;
        if (getpageup instanceof RouteRefresher$RouteRefreshResult$Fail) {
            StringBuilder sb = new StringBuilder("Route refresh error: ");
            NavigationRouterRefreshError navigationRouterRefreshError = ((RouteRefresher$RouteRefreshResult$Fail) getpageup).error;
            sb.append(navigationRouterRefreshError.message);
            sb.append(" throwable=");
            sb.append(navigationRouterRefreshError.throwable);
            LoggerProviderKt.logE(sb.toString(), str);
            Integer num2 = navigationRouterRefreshError.refreshTtl;
            return new RouteRefresherResult(navigationRoute2, routeProgressData2, (num2 != null && num2.intValue() == 0) ? routeRefresherStatus$Failure : RouteRefresherStatus$Failure.INSTANCE);
        }
        String str3 = str;
        if (getpageup instanceof RouteRefresher$RouteRefreshResult$Success) {
            StringBuilder sb2 = new StringBuilder("Received refreshed route ");
            RouteRefresher$RouteRefreshResult$Success routeRefresher$RouteRefreshResult$Success = (RouteRefresher$RouteRefreshResult$Success) getpageup;
            NavigationRoute navigationRoute3 = routeRefresher$RouteRefreshResult$Success.route;
            sb2.append(navigationRoute3.id);
            LoggerProviderKt.logI(sb2.toString(), str3);
            int i5 = routeRefreshRequestData.legIndex;
            p0 p0Var = routeRefresher2.routeDiffProvider;
            navigationRoute2.getClass();
            String str4 = navigationRoute3.id;
            ArrayList arrayList = new ArrayList();
            List<RouteLeg> listLegs = navigationRoute2.directionsRoute.legs();
            List<RouteLeg> listLegs2 = navigationRoute3.directionsRoute.legs();
            if (listLegs != null && listLegs2 != null) {
                int iMin = Math.min(listLegs.size(), listLegs2.size());
                while (i5 < iMin) {
                    RouteLeg routeLeg = listLegs.get(i5);
                    RouteLeg routeLeg2 = listLegs2.get(i5);
                    routeLeg.getClass();
                    routeLeg2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    LegAnnotation legAnnotationAnnotation = routeLeg.annotation();
                    LegAnnotation legAnnotationAnnotation2 = routeLeg2.annotation();
                    List<RouteLeg> list = listLegs;
                    ArrayList arrayList3 = new ArrayList();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.distance() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.distance() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("distance");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.duration() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.duration() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add(InAppMessageBase.DURATION);
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.speed() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.speed() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("speed");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.maxspeed() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.maxspeed() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("maxSpeed");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.congestion() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.congestion() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("congestion");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.congestionNumeric() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.congestionNumeric() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("congestionNumeric");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.getUnrecognizedProperty("state_of_charge") : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.getUnrecognizedProperty("state_of_charge") : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("state_of_charge");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.currentSpeed() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.currentSpeed() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("current_speed");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{legAnnotationAnnotation != null ? legAnnotationAnnotation.freeflowSpeed() : null, legAnnotationAnnotation2 != null ? legAnnotationAnnotation2.freeflowSpeed() : null}, getCieXyz.write())).booleanValue()) {
                        arrayList3.add("freeflow_speed");
                    }
                    arrayList2.addAll(arrayList3);
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeLeg.incidents(), routeLeg2.incidents()}, getCieXyz.write())).booleanValue()) {
                        arrayList2.add("incidents");
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeLeg.closures(), routeLeg2.closures()}, getCieXyz.write())).booleanValue()) {
                        arrayList2.add("closures");
                    }
                    if (!arrayList2.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder("Updated ");
                        c8$$ExternalSyntheticOutline0.m(sb3, onContentCardDismissed.IconCompatParcelizer(arrayList2, null, null, null, null, 63), " at route ", str4, " leg ");
                        sb3.append(i5);
                        arrayList.add(sb3.toString());
                    }
                    i5++;
                    listLegs = list;
                    listLegs2 = listLegs2;
                    iMin = iMin;
                    routeProgressData2 = routeProgressData2;
                }
            }
            RouteProgressData routeProgressData3 = routeProgressData2;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute2.waypoints, navigationRoute3.waypoints}, getCieXyz.write())).booleanValue()) {
                arrayList.add("Updated waypoints at route " + str4);
            }
            if (arrayList.isEmpty()) {
                LoggerProviderKt.logI("No changes in annotations for route " + str4, str3);
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LoggerProviderKt.logI((String) it.next(), str3);
                }
            }
            return new RouteRefresherResult(navigationRoute3, routeProgressData3, new RouteRefresherStatus$Success(routeRefresher$RouteRefreshResult$Success.refreshResponse));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
