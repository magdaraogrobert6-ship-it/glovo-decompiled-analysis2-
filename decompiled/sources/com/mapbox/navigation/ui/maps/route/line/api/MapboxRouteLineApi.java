package com.mapbox.navigation.ui.maps.route.line.api;

import android.util.LruCache;
import androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2;
import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.core.internal.LowMemoryManager$Observer;
import com.mapbox.navigation.core.routealternatives.AlternativeRouteMetadata;
import com.mapbox.navigation.core.routerefresh.ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$$ExternalSyntheticLambda8;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.internal.route.callout.model.RouteCalloutData;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getRouteLineExpression$expression$1;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.callout.model.RouteCallout;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingApiSender$sendCancelEvent$1;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusherProvider;
import com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteRestrictionData;
import com.mapbox.navigation.ui.maps.route.line.model.InactiveRouteColors;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDistancesIndex;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineError;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineGranularDistances;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineTrimOffset;
import com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue;
import com.mapbox.navigation.ui.maps.route.line.model.SegmentColorType;
import com.mapbox.navigation.ui.maps.route.line.model.VanishingPointState;
import com.mapbox.navigation.ui.maps.util.CacheResultUtils$cacheResult$1;
import com.mapbox.navigation.ui.maps.util.CacheResultUtils$cacheResult$5;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda4;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda6;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.TextAnnouncementContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDisplayingInAppMessageannotations;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getOpeningAnimation;
import o.getOrElse;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi {
    public int activeLegIndex;
    public List alternativeRoutesMetadata;
    public final CacheResultUtils$cacheResult$5 alternativelyStyleSegmentsNotInLeg;
    public final isAdapterPositionOnScreen alternativelyStyleSegmentsNotInLegCache$delegate;
    public Map alternativesDeviationOffset;
    public final ContextScope calculationsScope;
    public final p0 calloutApi;
    public boolean isMemoryMonitorObserverRegistered;
    public long lastIndexUpdateTimeNano;
    public Point lastLocationPoint;
    public long lastPointUpdateTimeNano;
    public final x lowMemoryManager;
    public final MapboxRouteLineApi$$ExternalSyntheticLambda0 lowMemoryObserver;
    public final MutexImpl mutex;
    public NavigationRoute primaryRoute;
    public List restrictedExpressionData;
    public final ArrayList routeFeatureData;
    public List routeLineExpressionData;
    public final MapboxRouteLineApiOptions routeLineOptions;
    public final JobControl routeProgressUpdatesJobControl;
    public final x routeProgressUpdatesQueue;
    public List routes;
    public final CopyOnWriteArrayList routesSetToRouteLineObservers;
    public final getOrElse sender;
    public final CopyOnWriteArrayList trafficBackfillRoadClasses;
    public final VanishingRouteLine vanishingRouteLine;

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$buildDrawRoutesState$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public double D$0;
        public double D$1;
        public double D$2;
        public int I$0;
        public MapboxRouteLineApi L$0;
        public Object L$1;
        public RouteLineValueCommandHolder L$10;
        public RouteLineValueCommandHolder L$11;
        public RouteLineValueCommandHolder L$12;
        public RouteLineValueCommandHolder L$13;
        public RouteLineValueCommandHolder L$14;
        public RouteLineValueCommandHolder L$15;
        public RouteLineValueCommandHolder L$16;
        public RouteLineValueCommandHolder L$17;
        public RouteLineValueCommandHolder L$18;
        public RouteLineDynamicData L$19;
        public Object L$2;
        public RouteCalloutData L$20;
        public FeatureCollection L$21;
        public MapboxRouteLineUtils L$22;
        public MapboxRouteLineApiOptions L$23;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public RouteLineValueCommandHolder L$7;
        public RouteLineValueCommandHolder L$8;
        public RouteLineValueCommandHolder L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxRouteLineApi.this.buildDrawRoutesState(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$preWarmRouteCaches$1, reason: invalid class name and case insensitive filesystem */
    public final class C01471 extends ContinuationImpl {
        public MapboxRouteLineApi L$0;
        public ArrayList L$1;
        public int label;
        public /* synthetic */ Object result;

        public C01471(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxRouteLineApi.this.preWarmRouteCaches(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$preWarmRouteCaches$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ boolean $alternativeRouteMetadataAvailable;
        public final /* synthetic */ List $routes;
        public final /* synthetic */ boolean $vanishingRouteLineEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, List list, boolean z2, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$vanishingRouteLineEnabled = z;
            this.$routes = list;
            this.$alternativeRouteMetadataAvailable = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass2(this.$vanishingRouteLineEnabled, this.$routes, this.$alternativeRouteMetadataAvailable, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            anonymousClass2.invokeSuspend(createfromparcel);
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            boolean z = this.$vanishingRouteLineEnabled;
            List list = this.$routes;
            if (z) {
                MapboxRouteLineUtils.granularDistancesProvider.invoke(onContentCardDismissed.read(list));
            }
            if (this.$alternativeRouteMetadataAvailable) {
                Iterator it = onContentCardDismissed.serializer(list, 1).iterator();
                while (it.hasNext()) {
                    MapboxRouteLineUtils.granularDistancesProvider.invoke((NavigationRoute) it.next());
                }
            }
            return createFromParcel.INSTANCE;
        }
    }

    public final void cancel() {
        getOrElse getorelse = this.sender;
        getorelse.getClass();
        RouteLineHistoryRecordingPusherProvider.instance.pushEventIfEnabled(new RouteLineHistoryRecordingApiSender$sendCancelEvent$1(getorelse, null, 0));
        JobKt.serializer(this.calculationsScope.serializer);
        JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.routeProgressUpdatesJobControl.job);
        stopMemoryMonitoring();
        ((LruCache) MapboxRouteLineUtils.extractRouteDataCache$delegate.MediaSessionCompatResultReceiverWrapper()).trimToSize(0);
        ((LruCache) MapboxRouteLineUtils.granularDistancesCache$delegate.MediaSessionCompatResultReceiverWrapper()).trimToSize(0);
        ((LruCache) this.alternativelyStyleSegmentsNotInLegCache$delegate.MediaSessionCompatResultReceiverWrapper()).evictAll();
    }

    public final Object routeLineActiveLegExpressionData(int i, ContinuationImpl continuationImpl) {
        if (!this.routeLineOptions.getStyleInactiveRouteLegsIndependently()) {
            return this.routeLineExpressionData;
        }
        Object objAwaitInternal = BuildersKt.IconCompatParcelizer(this.calculationsScope, null, null, new ClearDataUseCaseImpl$invoke$2(this, i, (ShortNewsContentCardView) null), 3).awaitInternal(continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objAwaitInternal;
    }

    public final void startMemoryMonitoring() {
        synchronized (this.lowMemoryObserver) {
            if (this.isMemoryMonitorObserverRegistered) {
                return;
            }
            this.isMemoryMonitorObserverRegistered = true;
            this.lowMemoryManager.addObserver(this.lowMemoryObserver);
        }
    }

    public final void stopMemoryMonitoring() {
        synchronized (this.lowMemoryObserver) {
            if (this.isMemoryMonitorObserverRegistered) {
                this.isMemoryMonitorObserverRegistered = false;
                this.lowMemoryManager.removeObserver(this.lowMemoryObserver);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$$ExternalSyntheticLambda0] */
    public MapboxRouteLineApi(MapboxRouteLineApiOptions mapboxRouteLineApiOptions) {
        VanishingRouteLine vanishingRouteLine;
        mapboxRouteLineApiOptions.getClass();
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(UrlUtils.serializer(), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
        Object[] objArr = 0;
        if (mapboxRouteLineApiOptions.getVanishingRouteLineEnabled()) {
            vanishingRouteLine = new VanishingRouteLine();
            vanishingRouteLine.vanishingPointState = VanishingPointState.DISABLED;
        } else {
            vanishingRouteLine = null;
        }
        getOrElse getorelse = new getOrElse(1);
        x xVar = new x(16);
        this.routeLineOptions = mapboxRouteLineApiOptions;
        this.calculationsScope = contextScopeRemoteActionCompatParcelizer;
        this.vanishingRouteLine = vanishingRouteLine;
        this.sender = getorelse;
        this.lowMemoryManager = xVar;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.routes = instance_delegatelambda0Var;
        this.alternativeRoutesMetadata = instance_delegatelambda0Var;
        this.routeLineExpressionData = instance_delegatelambda0Var;
        this.restrictedExpressionData = instance_delegatelambda0Var;
        this.routeFeatureData = new ArrayList();
        MutexImpl mutexImplIconCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.mutex = mutexImplIconCompatParcelizer;
        this.lowMemoryObserver = new LowMemoryManager$Observer() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$$ExternalSyntheticLambda0
            @Override // com.mapbox.navigation.core.internal.LowMemoryManager$Observer
            public final void onLowMemory() {
                ((LruCache) MapboxRouteLineUtils.extractRouteDataCache$delegate.MediaSessionCompatResultReceiverWrapper()).trimToSize(0);
                ((LruCache) MapboxRouteLineUtils.granularDistancesCache$delegate.MediaSessionCompatResultReceiverWrapper()).trimToSize(0);
                ((LruCache) this.f$0.alternativelyStyleSegmentsNotInLegCache$delegate.MediaSessionCompatResultReceiverWrapper()).evictAll();
            }
        };
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        ContextScope contextScopeRemoteActionCompatParcelizer2 = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read.IconCompatParcelizer()));
        this.routeProgressUpdatesJobControl = new JobControl(onbackinvokedlambda0Serializer, contextScopeRemoteActionCompatParcelizer2);
        this.routeProgressUpdatesQueue = new x(contextScopeRemoteActionCompatParcelizer2, 14, mutexImplIconCompatParcelizer);
        this.activeLegIndex = -1;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.trafficBackfillRoadClasses = copyOnWriteArrayList;
        this.alternativesDeviationOffset = SimpleItemTouchHelperCallback.serializer;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2.INSTANCE);
        this.alternativelyStyleSegmentsNotInLegCache$delegate = isadapterpositiononscreen;
        this.routesSetToRouteLineObservers = new CopyOnWriteArrayList();
        RouteLineHistoryRecordingPusherProvider.instance.pushEventOrAddToQueue(new FlowLiveDataConversions$asFlow$1$1((Object) getorelse, (Object) mapboxRouteLineApiOptions, (ShortNewsContentCardView) (objArr == true ? 1 : 0), 23));
        copyOnWriteArrayList.addAll(mapboxRouteLineApiOptions.getTrafficBackfillRoadClasses());
        this.calloutApi = mapboxRouteLineApiOptions.isRouteCalloutsEnabled() ? new p0(0) : null;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("init routeLineApiOptions: " + mapboxRouteLineApiOptions, "MapboxRouteLineApi");
        }
        CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2 = new CrossfadeKt$Crossfade$5$1$alpha$2(2, this);
        LruCache lruCache = (LruCache) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        lruCache.getClass();
        this.alternativelyStyleSegmentsNotInLeg = new CacheResultUtils$cacheResult$5(crossfadeKt$Crossfade$5$1$alpha$2, lruCache);
    }

    public static boolean isMultiLeg(NavigationRoute navigationRoute) {
        DirectionsRoute directionsRoute;
        List<RouteLeg> listLegs;
        return (navigationRoute == null || (directionsRoute = navigationRoute.directionsRoute) == null || (listLegs = directionsRoute.legs()) == null || listLegs.size() < 2) ? false : true;
    }

    public final void setNavigationRoutes(List list, List list2, RouteLineApi$$ExternalSyntheticLambda6 routeLineApi$$ExternalSyntheticLambda6) {
        list.getClass();
        List list3 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new NavigationRouteLine((NavigationRoute) it.next(), null));
        }
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        AsyncSection asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("MapboxRouteLineApi#setNavigationRouteLines");
        ContextScope contextScope = this.calculationsScope;
        JobKt.serializer(contextScope.serializer);
        if (arrayList.isEmpty()) {
            clearRouteLine(new RouteLineApi$$ExternalSyntheticLambda4(asyncSectionAsyncSectionStarted, 1, routeLineApi$$ExternalSyntheticLambda6));
            return;
        }
        startMemoryMonitoring();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, MainDispatcherLoader.read, null, new MapboxRouteLineApi$setNavigationRouteLines$2(this, arrayList, list2, asyncSectionAsyncSectionStarted, routeLineApi$$ExternalSyntheticLambda6, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0346  */
    /* JADX WARN: Code duplicated, block: B:103:0x047a  */
    /* JADX WARN: Code duplicated, block: B:104:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x0597  */
    /* JADX WARN: Code duplicated, block: B:109:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:117:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x05da  */
    /* JADX WARN: Code duplicated, block: B:121:0x0608  */
    /* JADX WARN: Code duplicated, block: B:124:0x061b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0654  */
    /* JADX WARN: Code duplicated, block: B:131:0x0661  */
    /* JADX WARN: Code duplicated, block: B:134:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x06c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x06c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:143:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:145:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:147:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:151:0x0702  */
    /* JADX WARN: Code duplicated, block: B:154:0x0711  */
    /* JADX WARN: Code duplicated, block: B:156:0x071a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0723  */
    /* JADX WARN: Code duplicated, block: B:161:0x0732  */
    /* JADX WARN: Code duplicated, block: B:162:0x0739  */
    /* JADX WARN: Code duplicated, block: B:164:0x074d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0777  */
    /* JADX WARN: Code duplicated, block: B:172:0x077d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0795  */
    /* JADX WARN: Code duplicated, block: B:175:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:176:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:178:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:180:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:181:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:186:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:190:0x0864  */
    /* JADX WARN: Code duplicated, block: B:193:0x06d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x064f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x029c  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0307  */
    /* JADX WARN: Code duplicated, block: B:92:0x030c  */
    /* JADX WARN: Code duplicated, block: B:93:0x030f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0315  */
    /* JADX WARN: Code duplicated, block: B:96:0x0318  */
    /* JADX WARN: Code duplicated, block: B:99:0x0343  */
    public final Object buildDrawRoutesState(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, ContinuationImpl continuationImpl) {
        AnonymousClass1 anonymousClass1;
        int i2;
        Object objAwaitInternal;
        MapboxRouteLineApi mapboxRouteLineApi;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        RouteFeatureData routeFeatureData;
        RouteFeatureData routeFeatureData2;
        RouteFeatureData routeFeatureData3;
        getOpeningAnimation getopeninganimationIconCompatParcelizer;
        double d;
        MapboxRouteLineApi mapboxRouteLineApi2;
        int i3;
        double dDoubleValue;
        double dDoubleValue2;
        getOpeningAnimation getopeninganimation;
        RouteLineValueCommandHolder routeLineValueCommandHolder;
        RouteLineValueCommandHolder routeLineValueCommandHolder2;
        FeatureCollection featureCollection;
        FeatureCollection featureCollectionFromFeatures;
        FeatureCollection featureCollectionFromFeatures2;
        double d2;
        double d3;
        Object objAwait;
        RouteLineValueCommandHolder routeLineValueCommandHolder3;
        FeatureCollection featureCollection2;
        CoroutineSingletons coroutineSingletons;
        RouteLineValueCommandHolder routeLineValueCommandHolder4;
        int i4;
        MapboxRouteLineApi mapboxRouteLineApi3;
        FeatureCollection featureCollection3;
        FeatureCollection featureCollection4;
        RouteFeatureData routeFeatureData4;
        double d4;
        double d5;
        double d6;
        NavigationRoute navigationRoute;
        Double d7;
        NavigationRoute navigationRoute2;
        Double d8;
        FeatureCollection featureCollection5;
        FeatureCollection featureCollection6;
        int i5;
        FeatureCollection featureCollection7;
        RouteLineValueCommandHolder routeLineValueCommandHolder5;
        RouteLineValueCommandHolder routeLineValueCommandHolder6;
        RouteLineValueCommandHolder routeLineValueCommandHolder7;
        RouteLineValueCommandHolder routeLineValueCommandHolder8;
        RouteLineValueCommandHolder routeLineValueCommandHolder9;
        RouteLineValueCommandHolder routeLineValueCommandHolder10;
        RouteLineValueCommandHolder routeLineValueCommandHolder11;
        RouteLineValueCommandHolder routeLineValueCommandHolder12;
        RouteLineValueCommandHolder routeLineValueCommandHolder13;
        RouteLineValueCommandHolder routeLineValueCommandHolder14;
        RouteLineValueCommandHolder routeLineValueCommandHolder15;
        NavigationRoute navigationRoute3;
        double d9;
        RouteLineValueCommandHolder routeLineValueCommandHolder16;
        RouteLineValueCommandHolder routeLineValueCommandHolder17;
        double d10;
        RouteLineDynamicData routeLineDynamicData;
        RouteLineDynamicData routeLineDynamicData2;
        FeatureCollection featureCollection8;
        RouteCalloutData routeCalloutData;
        RouteCalloutData routeCalloutData2;
        MapboxRouteLineUtils mapboxRouteLineUtils;
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions;
        FeatureCollection featureCollection9;
        RouteLineValueCommandHolder routeLineValueCommandHolder18;
        RouteLineValueCommandHolder routeLineValueCommandHolder19;
        RouteLineValueCommandHolder routeLineValueCommandHolder20;
        RouteLineValueCommandHolder routeLineValueCommandHolder21;
        RouteFeatureData routeFeatureData5;
        FeatureCollection featureCollection10;
        Object objRouteLineActiveLegExpressionData;
        CoroutineSingletons coroutineSingletons2;
        int i6;
        RouteLineValueCommandHolder routeLineValueCommandHolder22;
        RouteCalloutData routeCalloutData3;
        RouteFeatureData routeFeatureData6;
        RouteLineDynamicData routeLineDynamicData3;
        RouteLineValueCommandHolder routeLineValueCommandHolder23;
        RouteLineValueCommandHolder routeLineValueCommandHolder24;
        MapboxRouteLineApi mapboxRouteLineApi4;
        RouteLineValueCommandHolder routeLineValueCommandHolder25;
        RouteLineValueCommandHolder routeLineValueCommandHolder26;
        double d11;
        FeatureCollection featureCollection11;
        RouteLineValueCommandHolder routeLineValueCommandHolder27;
        RouteLineValueCommandHolder routeLineValueCommandHolder28;
        FeatureCollection featureCollection12;
        RouteLineValueCommandHolder routeLineValueCommandHolder29;
        double d12;
        FeatureCollection featureCollection13;
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions2;
        RouteLineValueCommandHolder routeLineValueCommandHolder30;
        double d13;
        List list;
        List list2;
        NavigationRoute navigationRoute4;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0;
        Iterator it;
        NavigationRoute navigationRoute5;
        Iterator it2;
        Object next;
        AlternativeRouteMetadata alternativeRouteMetadata;
        long jSerializer;
        double dSignum;
        long jSerializer2;
        int iWrite;
        setUnregisteredInAppMessage setunregisteredinappmessage;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jRemoteActionCompatParcelizer;
        long j6;
        long j7;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = anonymousClass1.label;
        List listSerializer = instance_delegatelambda0.write;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.lastLocationPoint = null;
            DeferredCoroutine deferredCoroutineIconCompatParcelizer = BuildersKt.IconCompatParcelizer(this.calculationsScope, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 2), 3);
            anonymousClass1.L$0 = this;
            i2 = i;
            anonymousClass1.I$0 = i2;
            anonymousClass1.label = 1;
            objAwaitInternal = deferredCoroutineIconCompatParcelizer.awaitInternal(anonymousClass1);
            if (objAwaitInternal == coroutineSingletons3) {
                return coroutineSingletons3;
            }
            mapboxRouteLineApi = this;
        } else {
            if (i8 == 1) {
                int i9 = anonymousClass1.I$0;
                MapboxRouteLineApi mapboxRouteLineApi5 = anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                mapboxRouteLineApi = mapboxRouteLineApi5;
                objAwaitInternal = obj;
                i2 = i9;
            } else if (i8 == 2) {
                d = anonymousClass1.D$0;
                int i10 = anonymousClass1.I$0;
                mapboxRouteLineApi = (MapboxRouteLineApi) anonymousClass1.L$6;
                getopeninganimationIconCompatParcelizer = (getOpeningAnimation) anonymousClass1.L$5;
                routeFeatureData3 = (RouteFeatureData) anonymousClass1.L$4;
                routeFeatureData2 = (RouteFeatureData) anonymousClass1.L$3;
                routeFeatureData = (RouteFeatureData) anonymousClass1.L$2;
                onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) anonymousClass1.L$1;
                mapboxRouteLineApi2 = anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                i3 = i10;
                mapboxRouteLineApi.routeLineExpressionData = (List) obj;
                if (routeFeatureData2 != null || (navigationRoute2 = routeFeatureData2.route) == null || (d8 = (Double) mapboxRouteLineApi2.alternativesDeviationOffset.get(navigationRoute2.id)) == null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = d8.doubleValue();
                }
                if (routeFeatureData3 != null || (navigationRoute = routeFeatureData3.route) == null || (d7 = (Double) mapboxRouteLineApi2.alternativesDeviationOffset.get(navigationRoute.id)) == null) {
                    dDoubleValue2 = 0.0d;
                } else {
                    dDoubleValue2 = d7.doubleValue();
                }
                if (routeFeatureData2 != null) {
                    NavigationRoute navigationRoute6 = routeFeatureData2.route;
                    getopeninganimation = getopeninganimationIconCompatParcelizer;
                    routeLineValueCommandHolder = navigationRoute6 != null ? new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxNavigation$notification$1$1(navigationRoute6, 6, mapboxRouteLineApi2), 0), new LineGradientCommandApplier(0)) : null;
                    if (((List) onviewattachedtowindowlambda0.write).size() > 1) {
                        routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxNavigation$notification$1$1(routeFeatureData3, 7, mapboxRouteLineApi2), 0), new LineGradientCommandApplier(0));
                    } else {
                        routeLineValueCommandHolder2 = null;
                    }
                    featureCollection = routeFeatureData.reversedFeatureCollection;
                    if (routeFeatureData2 != null) {
                        featureCollectionFromFeatures = routeFeatureData2.reversedFeatureCollection;
                    } else {
                        featureCollectionFromFeatures = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
                    }
                    if (routeFeatureData3 != null) {
                        featureCollectionFromFeatures2 = routeFeatureData3.reversedFeatureCollection;
                    } else {
                        featureCollectionFromFeatures2 = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
                    }
                    anonymousClass1.L$0 = mapboxRouteLineApi2;
                    anonymousClass1.L$1 = routeFeatureData;
                    anonymousClass1.L$2 = routeLineValueCommandHolder;
                    anonymousClass1.L$3 = routeLineValueCommandHolder2;
                    anonymousClass1.L$4 = featureCollection;
                    anonymousClass1.L$5 = featureCollectionFromFeatures;
                    anonymousClass1.L$6 = featureCollectionFromFeatures2;
                    anonymousClass1.I$0 = i3;
                    anonymousClass1.D$0 = d;
                    anonymousClass1.D$1 = dDoubleValue;
                    d2 = d;
                    d3 = dDoubleValue2;
                    anonymousClass1.D$2 = d3;
                    anonymousClass1.label = 3;
                    objAwait = getopeninganimation.await(anonymousClass1);
                    if (objAwait == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    routeLineValueCommandHolder3 = routeLineValueCommandHolder;
                    obj = objAwait;
                    featureCollection2 = featureCollectionFromFeatures;
                    coroutineSingletons = coroutineSingletons3;
                    routeLineValueCommandHolder4 = routeLineValueCommandHolder2;
                    MapboxRouteLineApi mapboxRouteLineApi6 = mapboxRouteLineApi2;
                    i4 = i3;
                    mapboxRouteLineApi3 = mapboxRouteLineApi6;
                    double d14 = dDoubleValue;
                    featureCollection3 = featureCollection;
                    featureCollection4 = featureCollectionFromFeatures2;
                    routeFeatureData4 = routeFeatureData;
                    d4 = d2;
                    d5 = d3;
                    d6 = d14;
                    featureCollection5 = (FeatureCollection) obj;
                    featureCollection6 = featureCollection3;
                    i5 = i4;
                    featureCollection7 = featureCollection2;
                    RouteLineValueCommandHolder routeLineValueCommandHolder31 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 1), 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 2), 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder6 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$4, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder7 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$3, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder8 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$2, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder9 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$1, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder10 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 3), 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder11 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 4), 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder12 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$8, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder13 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$7, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder14 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$6, 1), new LineGradientCommandApplier(0));
                    routeLineValueCommandHolder15 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$5, 1), new LineGradientCommandApplier(0));
                    navigationRoute3 = routeFeatureData4.route;
                    mapboxRouteLineApi3.getClass();
                    if (isMultiLeg(navigationRoute3)) {
                        List list3 = mapboxRouteLineApi3.routeLineExpressionData;
                        Double d15 = new Double(d4);
                        Double dDistance = navigationRoute3.directionsRoute.distance();
                        dDistance.getClass();
                        d10 = d5;
                        d9 = d6;
                        routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                        routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                        routeLineDynamicData = mapboxRouteLineApi3.getRouteLineDynamicDataForMaskingLayers$ui_maps_release(list3, d15, dDistance.doubleValue(), i5);
                    } else {
                        d9 = d6;
                        routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                        routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                        d10 = d5;
                        MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                        StylePropertyValue singleColorExpression = MapboxRouteLineUtils.getSingleColorExpression(0);
                        int i11 = 1;
                        routeLineDynamicData = new RouteLineDynamicData(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression, 0), i11), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression, 1), i11), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression, 2), i11), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression, 3), 1), new LineGradientCommandApplier(0)), new RouteLineTrimOffset(d4), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression, 4), 1), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression, 5), 1), new LineGradientCommandApplier(0)), null, Fields.SpotShadowColor);
                    }
                    if (mapboxRouteLineApi3.calloutApi != null) {
                        list = mapboxRouteLineApi3.routes;
                        list2 = mapboxRouteLineApi3.alternativeRoutesMetadata;
                        list.getClass();
                        list2.getClass();
                        if (list.size() <= 1) {
                            navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                            if (navigationRoute4 == null) {
                                routeLineDynamicData2 = routeLineDynamicData;
                                featureCollection8 = featureCollection7;
                            } else {
                                List listSerializer2 = onContentCardDismissed.serializer(list, 1);
                                baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer2.size() + 1);
                                unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                                it = listSerializer2.iterator();
                                while (it.hasNext()) {
                                    navigationRoute5 = (NavigationRoute) it.next();
                                    it2 = list2.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                                    alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                                    if (alternativeRouteMetadata != null) {
                                        double d16 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                        unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                        jSerializer = UriKt.serializer(d16, setUnregisteredInAppMessage.SECONDS);
                                    } else {
                                        unregisterInAppMessageManager unregisterinappmessagemanager3 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                        Double dDuration = navigationRoute5.directionsRoute.duration();
                                        dDuration.getClass();
                                        jSerializer = UriKt.serializer(dDuration.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                                    }
                                    Double dDuration2 = navigationRoute4.directionsRoute.duration();
                                    dDuration2.getClass();
                                    RouteLineDynamicData routeLineDynamicData4 = routeLineDynamicData;
                                    Iterator it3 = it;
                                    long j8 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration2.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                                    setUnregisteredInAppMessage setunregisteredinappmessage2 = setUnregisteredInAppMessage.MINUTES;
                                    setunregisteredinappmessage2.getClass();
                                    double dSerializer = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j8, setunregisteredinappmessage2);
                                    dSignum = Math.signum(dSerializer);
                                    jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer)), setunregisteredinappmessage2);
                                    iWrite = MathKt.write(dSignum);
                                    FeatureCollection featureCollection14 = featureCollection7;
                                    if (iWrite == dSignum) {
                                        j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                        j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                        if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                            if (iWrite == 0) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                                return null;
                                            }
                                            if (iWrite <= 0) {
                                                jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                            }
                                            list2 = list2;
                                        } else if (iWrite == 0) {
                                            jSerializer2 = 0;
                                        } else {
                                            j3 = jSerializer2 >> 1;
                                            j4 = iWrite;
                                            j5 = j3 * j4;
                                            if ((((int) jSerializer2) & 1) == 0) {
                                                if (-2147483647L > j3) {
                                                    if (j5 / j4 != j3) {
                                                        j6 = j3 / 1000000;
                                                        j7 = j6 * j4;
                                                        long j9 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                        if (j7 / j4 != j6) {
                                                        }
                                                        if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                            jRemoteActionCompatParcelizer = j2;
                                                        } else {
                                                            jRemoteActionCompatParcelizer = j;
                                                        }
                                                    } else if (-4611686018426999999L > j5) {
                                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                    } else {
                                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                    }
                                                } else if (j5 / j4 != j3) {
                                                    j6 = j3 / 1000000;
                                                    j7 = j6 * j4;
                                                    long j10 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                    if (j7 / j4 != j6) {
                                                    }
                                                    if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                        jRemoteActionCompatParcelizer = j2;
                                                    } else {
                                                        jRemoteActionCompatParcelizer = j;
                                                    }
                                                } else if (-4611686018426999999L > j5) {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                } else {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                }
                                            } else if (j5 / j4 == j3) {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                            } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                jRemoteActionCompatParcelizer = j2;
                                            } else {
                                                jRemoteActionCompatParcelizer = j;
                                            }
                                            jSerializer2 = jRemoteActionCompatParcelizer;
                                        }
                                    } else {
                                        list2 = list2;
                                        if ((((int) jSerializer2) & 1) == 0) {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                        } else {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                        }
                                        jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                                    }
                                    baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                                    it = it3;
                                    featureCollection7 = featureCollection14;
                                    routeLineDynamicData = routeLineDynamicData4;
                                    list2 = list2;
                                }
                                routeLineDynamicData2 = routeLineDynamicData;
                                featureCollection8 = featureCollection7;
                                listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                            }
                            routeCalloutData = new RouteCalloutData(listSerializer);
                        } else {
                            navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                            if (navigationRoute4 == null) {
                                routeLineDynamicData2 = routeLineDynamicData;
                                featureCollection8 = featureCollection7;
                            } else {
                                List listSerializer3 = onContentCardDismissed.serializer(list, 1);
                                baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer3.size() + 1);
                                unregisterInAppMessageManager unregisterinappmessagemanager4 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                                it = listSerializer3.iterator();
                                while (it.hasNext()) {
                                    navigationRoute5 = (NavigationRoute) it.next();
                                    it2 = list2.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                                    alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                                    if (alternativeRouteMetadata != null) {
                                        double d17 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                        unregisterInAppMessageManager unregisterinappmessagemanager5 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                        jSerializer = UriKt.serializer(d17, setUnregisteredInAppMessage.SECONDS);
                                    } else {
                                        unregisterInAppMessageManager unregisterinappmessagemanager6 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                        Double dDuration3 = navigationRoute5.directionsRoute.duration();
                                        dDuration3.getClass();
                                        jSerializer = UriKt.serializer(dDuration3.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                                    }
                                    Double dDuration4 = navigationRoute4.directionsRoute.duration();
                                    dDuration4.getClass();
                                    RouteLineDynamicData routeLineDynamicData5 = routeLineDynamicData;
                                    Iterator it4 = it;
                                    long j11 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration4.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                                    setUnregisteredInAppMessage setunregisteredinappmessage3 = setUnregisteredInAppMessage.MINUTES;
                                    setunregisteredinappmessage3.getClass();
                                    double dSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j11, setunregisteredinappmessage3);
                                    dSignum = Math.signum(dSerializer2);
                                    jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer2)), setunregisteredinappmessage3);
                                    iWrite = MathKt.write(dSignum);
                                    FeatureCollection featureCollection15 = featureCollection7;
                                    if (iWrite == dSignum) {
                                        j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                        j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                        if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                            if (iWrite == 0) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                                return null;
                                            }
                                            if (iWrite <= 0) {
                                                jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                            }
                                            list2 = list2;
                                        } else if (iWrite == 0) {
                                            jSerializer2 = 0;
                                        } else {
                                            j3 = jSerializer2 >> 1;
                                            j4 = iWrite;
                                            j5 = j3 * j4;
                                            if ((((int) jSerializer2) & 1) == 0) {
                                                if (-2147483647L > j3) {
                                                    if (j5 / j4 != j3) {
                                                        j6 = j3 / 1000000;
                                                        j7 = j6 * j4;
                                                        long j12 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                        if (j7 / j4 != j6) {
                                                        }
                                                        if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                            jRemoteActionCompatParcelizer = j2;
                                                        } else {
                                                            jRemoteActionCompatParcelizer = j;
                                                        }
                                                    } else if (-4611686018426999999L > j5) {
                                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                    } else {
                                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                    }
                                                } else if (j5 / j4 != j3) {
                                                    j6 = j3 / 1000000;
                                                    j7 = j6 * j4;
                                                    long j13 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                    if (j7 / j4 != j6) {
                                                    }
                                                    if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                        jRemoteActionCompatParcelizer = j2;
                                                    } else {
                                                        jRemoteActionCompatParcelizer = j;
                                                    }
                                                } else if (-4611686018426999999L > j5) {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                } else {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                }
                                            } else if (j5 / j4 == j3) {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                            } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                jRemoteActionCompatParcelizer = j2;
                                            } else {
                                                jRemoteActionCompatParcelizer = j;
                                            }
                                            jSerializer2 = jRemoteActionCompatParcelizer;
                                        }
                                    } else {
                                        list2 = list2;
                                        if ((((int) jSerializer2) & 1) == 0) {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                        } else {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                        }
                                        jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                                    }
                                    baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                                    it = it4;
                                    featureCollection7 = featureCollection15;
                                    routeLineDynamicData = routeLineDynamicData5;
                                    list2 = list2;
                                }
                                routeLineDynamicData2 = routeLineDynamicData;
                                featureCollection8 = featureCollection7;
                                listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                            }
                            routeCalloutData = new RouteCalloutData(listSerializer);
                        }
                    } else {
                        routeLineDynamicData2 = routeLineDynamicData;
                        featureCollection8 = featureCollection7;
                        routeCalloutData = new RouteCalloutData(listSerializer);
                    }
                    routeCalloutData2 = routeCalloutData;
                    mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                    mapboxRouteLineApiOptions = mapboxRouteLineApi3.routeLineOptions;
                    anonymousClass1.L$0 = mapboxRouteLineApi3;
                    anonymousClass1.L$1 = routeFeatureData4;
                    RouteLineValueCommandHolder routeLineValueCommandHolder32 = routeLineValueCommandHolder3;
                    anonymousClass1.L$2 = routeLineValueCommandHolder32;
                    anonymousClass1.L$3 = routeLineValueCommandHolder4;
                    featureCollection9 = featureCollection8;
                    anonymousClass1.L$4 = featureCollection9;
                    anonymousClass1.L$5 = featureCollection4;
                    anonymousClass1.L$6 = featureCollection5;
                    routeLineValueCommandHolder18 = routeLineValueCommandHolder31;
                    anonymousClass1.L$7 = routeLineValueCommandHolder18;
                    routeLineValueCommandHolder19 = routeLineValueCommandHolder16;
                    anonymousClass1.L$8 = routeLineValueCommandHolder19;
                    routeLineValueCommandHolder20 = routeLineValueCommandHolder17;
                    anonymousClass1.L$9 = routeLineValueCommandHolder20;
                    anonymousClass1.L$10 = routeLineValueCommandHolder7;
                    anonymousClass1.L$11 = routeLineValueCommandHolder8;
                    routeLineValueCommandHolder21 = routeLineValueCommandHolder32;
                    anonymousClass1.L$12 = r29;
                    anonymousClass1.L$13 = r30;
                    anonymousClass1.L$14 = r31;
                    anonymousClass1.L$15 = routeLineValueCommandHolder12;
                    anonymousClass1.L$16 = routeLineValueCommandHolder13;
                    anonymousClass1.L$17 = routeLineValueCommandHolder14;
                    anonymousClass1.L$18 = routeLineValueCommandHolder15;
                    anonymousClass1.L$19 = routeLineDynamicData2;
                    anonymousClass1.L$20 = routeCalloutData2;
                    anonymousClass1.L$21 = featureCollection6;
                    anonymousClass1.L$22 = mapboxRouteLineUtils;
                    anonymousClass1.L$23 = mapboxRouteLineApiOptions;
                    anonymousClass1.I$0 = i5;
                    routeFeatureData5 = routeFeatureData4;
                    featureCollection10 = featureCollection4;
                    anonymousClass1.D$0 = d4;
                    anonymousClass1.D$1 = d9;
                    anonymousClass1.D$2 = d10;
                    anonymousClass1.label = 4;
                    objRouteLineActiveLegExpressionData = mapboxRouteLineApi3.routeLineActiveLegExpressionData(i5, anonymousClass1);
                    coroutineSingletons2 = coroutineSingletons;
                    if (objRouteLineActiveLegExpressionData == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    i6 = i5;
                    obj = objRouteLineActiveLegExpressionData;
                    routeLineValueCommandHolder22 = routeLineValueCommandHolder19;
                    routeCalloutData3 = routeCalloutData2;
                    routeFeatureData6 = routeFeatureData5;
                    routeLineDynamicData3 = routeLineDynamicData2;
                    routeLineValueCommandHolder23 = routeLineValueCommandHolder10;
                    routeLineValueCommandHolder24 = routeLineValueCommandHolder15;
                    mapboxRouteLineApi4 = mapboxRouteLineApi3;
                    routeLineValueCommandHolder25 = routeLineValueCommandHolder7;
                    routeLineValueCommandHolder26 = routeLineValueCommandHolder4;
                    d11 = d4;
                    featureCollection11 = featureCollection10;
                    routeLineValueCommandHolder27 = routeLineValueCommandHolder9;
                    routeLineValueCommandHolder28 = routeLineValueCommandHolder11;
                    featureCollection12 = featureCollection6;
                    routeLineValueCommandHolder29 = routeLineValueCommandHolder20;
                    d12 = d9;
                    double d18 = d10;
                    featureCollection13 = featureCollection5;
                    mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
                    routeLineValueCommandHolder30 = routeLineValueCommandHolder8;
                    d13 = d18;
                } else {
                    getopeninganimation = getopeninganimationIconCompatParcelizer;
                }
                if (((List) onviewattachedtowindowlambda0.write).size() > 1) {
                    routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxNavigation$notification$1$1(routeFeatureData3, 7, mapboxRouteLineApi2), 0), new LineGradientCommandApplier(0));
                } else {
                    routeLineValueCommandHolder2 = null;
                }
                featureCollection = routeFeatureData.reversedFeatureCollection;
                if (routeFeatureData2 != null) {
                    featureCollectionFromFeatures = routeFeatureData2.reversedFeatureCollection;
                } else {
                    featureCollectionFromFeatures = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
                }
                if (routeFeatureData3 != null) {
                    featureCollectionFromFeatures2 = routeFeatureData3.reversedFeatureCollection;
                } else {
                    featureCollectionFromFeatures2 = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
                }
                anonymousClass1.L$0 = mapboxRouteLineApi2;
                anonymousClass1.L$1 = routeFeatureData;
                anonymousClass1.L$2 = routeLineValueCommandHolder;
                anonymousClass1.L$3 = routeLineValueCommandHolder2;
                anonymousClass1.L$4 = featureCollection;
                anonymousClass1.L$5 = featureCollectionFromFeatures;
                anonymousClass1.L$6 = featureCollectionFromFeatures2;
                anonymousClass1.I$0 = i3;
                anonymousClass1.D$0 = d;
                anonymousClass1.D$1 = dDoubleValue;
                d2 = d;
                d3 = dDoubleValue2;
                anonymousClass1.D$2 = d3;
                anonymousClass1.label = 3;
                objAwait = getopeninganimation.await(anonymousClass1);
                if (objAwait == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                routeLineValueCommandHolder3 = routeLineValueCommandHolder;
                obj = objAwait;
                featureCollection2 = featureCollectionFromFeatures;
                coroutineSingletons = coroutineSingletons3;
                routeLineValueCommandHolder4 = routeLineValueCommandHolder2;
                MapboxRouteLineApi mapboxRouteLineApi7 = mapboxRouteLineApi2;
                i4 = i3;
                mapboxRouteLineApi3 = mapboxRouteLineApi7;
                double d19 = dDoubleValue;
                featureCollection3 = featureCollection;
                featureCollection4 = featureCollectionFromFeatures2;
                routeFeatureData4 = routeFeatureData;
                d4 = d2;
                d5 = d3;
                d6 = d19;
                featureCollection5 = (FeatureCollection) obj;
                featureCollection6 = featureCollection3;
                i5 = i4;
                featureCollection7 = featureCollection2;
                RouteLineValueCommandHolder routeLineValueCommandHolder33 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 1), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 2), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder6 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$4, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder7 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$3, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder8 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$2, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder9 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$1, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder10 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 3), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder11 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 4), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder12 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$8, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder13 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$7, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder14 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$6, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder15 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$5, 1), new LineGradientCommandApplier(0));
                navigationRoute3 = routeFeatureData4.route;
                mapboxRouteLineApi3.getClass();
                if (isMultiLeg(navigationRoute3)) {
                    List list4 = mapboxRouteLineApi3.routeLineExpressionData;
                    Double d110 = new Double(d4);
                    Double dDistance2 = navigationRoute3.directionsRoute.distance();
                    dDistance2.getClass();
                    d10 = d5;
                    d9 = d6;
                    routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                    routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                    routeLineDynamicData = mapboxRouteLineApi3.getRouteLineDynamicDataForMaskingLayers$ui_maps_release(list4, d110, dDistance2.doubleValue(), i5);
                } else {
                    d9 = d6;
                    routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                    routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                    d10 = d5;
                    MapboxRouteLineUtils mapboxRouteLineUtils3 = MapboxRouteLineUtils.INSTANCE;
                    StylePropertyValue singleColorExpression2 = MapboxRouteLineUtils.getSingleColorExpression(0);
                    int i12 = 1;
                    routeLineDynamicData = new RouteLineDynamicData(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression2, 0), i12), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression2, 1), i12), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression2, 2), i12), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression2, 3), 1), new LineGradientCommandApplier(0)), new RouteLineTrimOffset(d4), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression2, 4), 1), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression2, 5), 1), new LineGradientCommandApplier(0)), null, Fields.SpotShadowColor);
                }
                if (mapboxRouteLineApi3.calloutApi != null) {
                    list = mapboxRouteLineApi3.routes;
                    list2 = mapboxRouteLineApi3.alternativeRoutesMetadata;
                    list.getClass();
                    list2.getClass();
                    if (list.size() <= 1) {
                        navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                        if (navigationRoute4 == null) {
                            routeLineDynamicData2 = routeLineDynamicData;
                            featureCollection8 = featureCollection7;
                        } else {
                            List listSerializer4 = onContentCardDismissed.serializer(list, 1);
                            baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer4.size() + 1);
                            unregisterInAppMessageManager unregisterinappmessagemanager7 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                            it = listSerializer4.iterator();
                            while (it.hasNext()) {
                                navigationRoute5 = (NavigationRoute) it.next();
                                it2 = list2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                                alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                                if (alternativeRouteMetadata != null) {
                                    double d111 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                    unregisterInAppMessageManager unregisterinappmessagemanager8 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    jSerializer = UriKt.serializer(d111, setUnregisteredInAppMessage.SECONDS);
                                } else {
                                    unregisterInAppMessageManager unregisterinappmessagemanager9 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    Double dDuration5 = navigationRoute5.directionsRoute.duration();
                                    dDuration5.getClass();
                                    jSerializer = UriKt.serializer(dDuration5.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                                }
                                Double dDuration6 = navigationRoute4.directionsRoute.duration();
                                dDuration6.getClass();
                                RouteLineDynamicData routeLineDynamicData6 = routeLineDynamicData;
                                Iterator it5 = it;
                                long j14 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration6.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                                setUnregisteredInAppMessage setunregisteredinappmessage4 = setUnregisteredInAppMessage.MINUTES;
                                setunregisteredinappmessage4.getClass();
                                double dSerializer3 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j14, setunregisteredinappmessage4);
                                dSignum = Math.signum(dSerializer3);
                                jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer3)), setunregisteredinappmessage4);
                                iWrite = MathKt.write(dSignum);
                                FeatureCollection featureCollection16 = featureCollection7;
                                if (iWrite == dSignum) {
                                    j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                    j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                    if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                        if (iWrite == 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                            return null;
                                        }
                                        if (iWrite <= 0) {
                                            jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                        }
                                        list2 = list2;
                                    } else if (iWrite == 0) {
                                        jSerializer2 = 0;
                                    } else {
                                        j3 = jSerializer2 >> 1;
                                        j4 = iWrite;
                                        j5 = j3 * j4;
                                        if ((((int) jSerializer2) & 1) == 0) {
                                            if (-2147483647L > j3) {
                                                if (j5 / j4 != j3) {
                                                    j6 = j3 / 1000000;
                                                    j7 = j6 * j4;
                                                    long j15 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                    if (j7 / j4 != j6) {
                                                    }
                                                    if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                        jRemoteActionCompatParcelizer = j2;
                                                    } else {
                                                        jRemoteActionCompatParcelizer = j;
                                                    }
                                                } else if (-4611686018426999999L > j5) {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                } else {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                }
                                            } else if (j5 / j4 != j3) {
                                                j6 = j3 / 1000000;
                                                j7 = j6 * j4;
                                                long j16 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                if (j7 / j4 != j6) {
                                                }
                                                if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                    jRemoteActionCompatParcelizer = j2;
                                                } else {
                                                    jRemoteActionCompatParcelizer = j;
                                                }
                                            } else if (-4611686018426999999L > j5) {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            } else {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            }
                                        } else if (j5 / j4 == j3) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                        } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                            jRemoteActionCompatParcelizer = j2;
                                        } else {
                                            jRemoteActionCompatParcelizer = j;
                                        }
                                        jSerializer2 = jRemoteActionCompatParcelizer;
                                    }
                                } else {
                                    list2 = list2;
                                    if ((((int) jSerializer2) & 1) == 0) {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                    }
                                    jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                                }
                                baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                                it = it5;
                                featureCollection7 = featureCollection16;
                                routeLineDynamicData = routeLineDynamicData6;
                                list2 = list2;
                            }
                            routeLineDynamicData2 = routeLineDynamicData;
                            featureCollection8 = featureCollection7;
                            listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                        }
                        routeCalloutData = new RouteCalloutData(listSerializer);
                    } else {
                        navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                        if (navigationRoute4 == null) {
                            routeLineDynamicData2 = routeLineDynamicData;
                            featureCollection8 = featureCollection7;
                        } else {
                            List listSerializer5 = onContentCardDismissed.serializer(list, 1);
                            baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer5.size() + 1);
                            unregisterInAppMessageManager unregisterinappmessagemanager10 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                            it = listSerializer5.iterator();
                            while (it.hasNext()) {
                                navigationRoute5 = (NavigationRoute) it.next();
                                it2 = list2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                                alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                                if (alternativeRouteMetadata != null) {
                                    double d112 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                    unregisterInAppMessageManager unregisterinappmessagemanager11 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    jSerializer = UriKt.serializer(d112, setUnregisteredInAppMessage.SECONDS);
                                } else {
                                    unregisterInAppMessageManager unregisterinappmessagemanager12 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    Double dDuration7 = navigationRoute5.directionsRoute.duration();
                                    dDuration7.getClass();
                                    jSerializer = UriKt.serializer(dDuration7.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                                }
                                Double dDuration8 = navigationRoute4.directionsRoute.duration();
                                dDuration8.getClass();
                                RouteLineDynamicData routeLineDynamicData7 = routeLineDynamicData;
                                Iterator it6 = it;
                                long j17 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration8.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                                setUnregisteredInAppMessage setunregisteredinappmessage5 = setUnregisteredInAppMessage.MINUTES;
                                setunregisteredinappmessage5.getClass();
                                double dSerializer4 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j17, setunregisteredinappmessage5);
                                dSignum = Math.signum(dSerializer4);
                                jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer4)), setunregisteredinappmessage5);
                                iWrite = MathKt.write(dSignum);
                                FeatureCollection featureCollection17 = featureCollection7;
                                if (iWrite == dSignum) {
                                    j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                    j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                    if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                        if (iWrite == 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                            return null;
                                        }
                                        if (iWrite <= 0) {
                                            jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                        }
                                        list2 = list2;
                                    } else if (iWrite == 0) {
                                        jSerializer2 = 0;
                                    } else {
                                        j3 = jSerializer2 >> 1;
                                        j4 = iWrite;
                                        j5 = j3 * j4;
                                        if ((((int) jSerializer2) & 1) == 0) {
                                            if (-2147483647L > j3) {
                                                if (j5 / j4 != j3) {
                                                    j6 = j3 / 1000000;
                                                    j7 = j6 * j4;
                                                    long j18 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                    if (j7 / j4 != j6) {
                                                    }
                                                    if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                        jRemoteActionCompatParcelizer = j2;
                                                    } else {
                                                        jRemoteActionCompatParcelizer = j;
                                                    }
                                                } else if (-4611686018426999999L > j5) {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                } else {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                                }
                                            } else if (j5 / j4 != j3) {
                                                j6 = j3 / 1000000;
                                                j7 = j6 * j4;
                                                long j19 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                if (j7 / j4 != j6) {
                                                }
                                                if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                    jRemoteActionCompatParcelizer = j2;
                                                } else {
                                                    jRemoteActionCompatParcelizer = j;
                                                }
                                            } else if (-4611686018426999999L > j5) {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            } else {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            }
                                        } else if (j5 / j4 == j3) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                        } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                            jRemoteActionCompatParcelizer = j2;
                                        } else {
                                            jRemoteActionCompatParcelizer = j;
                                        }
                                        jSerializer2 = jRemoteActionCompatParcelizer;
                                    }
                                } else {
                                    list2 = list2;
                                    if ((((int) jSerializer2) & 1) == 0) {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                    }
                                    jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                                }
                                baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                                it = it6;
                                featureCollection7 = featureCollection17;
                                routeLineDynamicData = routeLineDynamicData7;
                                list2 = list2;
                            }
                            routeLineDynamicData2 = routeLineDynamicData;
                            featureCollection8 = featureCollection7;
                            listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                        }
                        routeCalloutData = new RouteCalloutData(listSerializer);
                    }
                } else {
                    routeLineDynamicData2 = routeLineDynamicData;
                    featureCollection8 = featureCollection7;
                    routeCalloutData = new RouteCalloutData(listSerializer);
                }
                routeCalloutData2 = routeCalloutData;
                mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                mapboxRouteLineApiOptions = mapboxRouteLineApi3.routeLineOptions;
                anonymousClass1.L$0 = mapboxRouteLineApi3;
                anonymousClass1.L$1 = routeFeatureData4;
                RouteLineValueCommandHolder routeLineValueCommandHolder34 = routeLineValueCommandHolder3;
                anonymousClass1.L$2 = routeLineValueCommandHolder34;
                anonymousClass1.L$3 = routeLineValueCommandHolder4;
                featureCollection9 = featureCollection8;
                anonymousClass1.L$4 = featureCollection9;
                anonymousClass1.L$5 = featureCollection4;
                anonymousClass1.L$6 = featureCollection5;
                routeLineValueCommandHolder18 = routeLineValueCommandHolder33;
                anonymousClass1.L$7 = routeLineValueCommandHolder18;
                routeLineValueCommandHolder19 = routeLineValueCommandHolder16;
                anonymousClass1.L$8 = routeLineValueCommandHolder19;
                routeLineValueCommandHolder20 = routeLineValueCommandHolder17;
                anonymousClass1.L$9 = routeLineValueCommandHolder20;
                anonymousClass1.L$10 = routeLineValueCommandHolder7;
                anonymousClass1.L$11 = routeLineValueCommandHolder8;
                routeLineValueCommandHolder21 = routeLineValueCommandHolder34;
                anonymousClass1.L$12 = r29;
                anonymousClass1.L$13 = r30;
                anonymousClass1.L$14 = r31;
                anonymousClass1.L$15 = routeLineValueCommandHolder12;
                anonymousClass1.L$16 = routeLineValueCommandHolder13;
                anonymousClass1.L$17 = routeLineValueCommandHolder14;
                anonymousClass1.L$18 = routeLineValueCommandHolder15;
                anonymousClass1.L$19 = routeLineDynamicData2;
                anonymousClass1.L$20 = routeCalloutData2;
                anonymousClass1.L$21 = featureCollection6;
                anonymousClass1.L$22 = mapboxRouteLineUtils;
                anonymousClass1.L$23 = mapboxRouteLineApiOptions;
                anonymousClass1.I$0 = i5;
                routeFeatureData5 = routeFeatureData4;
                featureCollection10 = featureCollection4;
                anonymousClass1.D$0 = d4;
                anonymousClass1.D$1 = d9;
                anonymousClass1.D$2 = d10;
                anonymousClass1.label = 4;
                objRouteLineActiveLegExpressionData = mapboxRouteLineApi3.routeLineActiveLegExpressionData(i5, anonymousClass1);
                coroutineSingletons2 = coroutineSingletons;
                if (objRouteLineActiveLegExpressionData == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                i6 = i5;
                obj = objRouteLineActiveLegExpressionData;
                routeLineValueCommandHolder22 = routeLineValueCommandHolder19;
                routeCalloutData3 = routeCalloutData2;
                routeFeatureData6 = routeFeatureData5;
                routeLineDynamicData3 = routeLineDynamicData2;
                routeLineValueCommandHolder23 = routeLineValueCommandHolder10;
                routeLineValueCommandHolder24 = routeLineValueCommandHolder15;
                mapboxRouteLineApi4 = mapboxRouteLineApi3;
                routeLineValueCommandHolder25 = routeLineValueCommandHolder7;
                routeLineValueCommandHolder26 = routeLineValueCommandHolder4;
                d11 = d4;
                featureCollection11 = featureCollection10;
                routeLineValueCommandHolder27 = routeLineValueCommandHolder9;
                routeLineValueCommandHolder28 = routeLineValueCommandHolder11;
                featureCollection12 = featureCollection6;
                routeLineValueCommandHolder29 = routeLineValueCommandHolder20;
                d12 = d9;
                double d113 = d10;
                featureCollection13 = featureCollection5;
                mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
                routeLineValueCommandHolder30 = routeLineValueCommandHolder8;
                d13 = d113;
            } else if (i8 == 3) {
                double d20 = anonymousClass1.D$2;
                double d21 = anonymousClass1.D$1;
                d4 = anonymousClass1.D$0;
                int i13 = anonymousClass1.I$0;
                FeatureCollection featureCollection18 = (FeatureCollection) anonymousClass1.L$6;
                FeatureCollection featureCollection19 = (FeatureCollection) anonymousClass1.L$5;
                FeatureCollection featureCollection20 = (FeatureCollection) anonymousClass1.L$4;
                routeLineValueCommandHolder4 = (RouteLineValueCommandHolder) anonymousClass1.L$3;
                RouteLineValueCommandHolder routeLineValueCommandHolder35 = (RouteLineValueCommandHolder) anonymousClass1.L$2;
                RouteFeatureData routeFeatureData7 = (RouteFeatureData) anonymousClass1.L$1;
                MapboxRouteLineApi mapboxRouteLineApi8 = anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                routeLineValueCommandHolder3 = routeLineValueCommandHolder35;
                mapboxRouteLineApi3 = mapboxRouteLineApi8;
                featureCollection3 = featureCollection20;
                featureCollection2 = featureCollection19;
                featureCollection4 = featureCollection18;
                routeFeatureData4 = routeFeatureData7;
                coroutineSingletons = coroutineSingletons3;
                i4 = i13;
                d6 = d21;
                d5 = d20;
                featureCollection5 = (FeatureCollection) obj;
                featureCollection6 = featureCollection3;
                i5 = i4;
                featureCollection7 = featureCollection2;
                RouteLineValueCommandHolder routeLineValueCommandHolder36 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 1), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 2), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder6 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$4, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder7 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$3, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder8 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$2, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder9 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$1, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder10 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 3), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder11 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 4), 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder12 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$8, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder13 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$7, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder14 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$6, 1), new LineGradientCommandApplier(0));
                routeLineValueCommandHolder15 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$5, 1), new LineGradientCommandApplier(0));
                navigationRoute3 = routeFeatureData4.route;
                mapboxRouteLineApi3.getClass();
                if (isMultiLeg(navigationRoute3)) {
                    List list5 = mapboxRouteLineApi3.routeLineExpressionData;
                    Double d114 = new Double(d4);
                    Double dDistance3 = navigationRoute3.directionsRoute.distance();
                    dDistance3.getClass();
                    d10 = d5;
                    d9 = d6;
                    routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                    routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                    routeLineDynamicData = mapboxRouteLineApi3.getRouteLineDynamicDataForMaskingLayers$ui_maps_release(list5, d114, dDistance3.doubleValue(), i5);
                } else {
                    d9 = d6;
                    routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                    routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                    d10 = d5;
                    MapboxRouteLineUtils mapboxRouteLineUtils4 = MapboxRouteLineUtils.INSTANCE;
                    StylePropertyValue singleColorExpression3 = MapboxRouteLineUtils.getSingleColorExpression(0);
                    int i14 = 1;
                    routeLineDynamicData = new RouteLineDynamicData(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression3, 0), i14), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression3, 1), i14), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression3, 2), i14), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression3, 3), 1), new LineGradientCommandApplier(0)), new RouteLineTrimOffset(d4), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression3, 4), 1), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression3, 5), 1), new LineGradientCommandApplier(0)), null, Fields.SpotShadowColor);
                }
                if (mapboxRouteLineApi3.calloutApi != null) {
                    list = mapboxRouteLineApi3.routes;
                    list2 = mapboxRouteLineApi3.alternativeRoutesMetadata;
                    list.getClass();
                    list2.getClass();
                    if (list.size() <= 1 && list2.isEmpty()) {
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                            LoggerProviderKt.logW("alternativeRoutesMetadata is empty while alternative routes are present. Route line annotation data which can be rendered on the map to visualize a callout will not be enabled. Ensure to pass alternativeRoutesMetadata from call location to enable callouts.", "MapboxRouteCalloutsApi");
                        }
                        routeCalloutData = new RouteCalloutData(listSerializer);
                        routeLineDynamicData2 = routeLineDynamicData;
                        featureCollection8 = featureCollection7;
                    } else {
                        navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                        if (navigationRoute4 == null) {
                            routeLineDynamicData2 = routeLineDynamicData;
                            featureCollection8 = featureCollection7;
                        } else {
                            List listSerializer6 = onContentCardDismissed.serializer(list, 1);
                            baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer6.size() + 1);
                            unregisterInAppMessageManager unregisterinappmessagemanager13 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                            it = listSerializer6.iterator();
                            while (it.hasNext()) {
                                navigationRoute5 = (NavigationRoute) it.next();
                                it2 = list2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                                alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                                if (alternativeRouteMetadata != null) {
                                    double d115 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                    unregisterInAppMessageManager unregisterinappmessagemanager14 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    jSerializer = UriKt.serializer(d115, setUnregisteredInAppMessage.SECONDS);
                                } else {
                                    unregisterInAppMessageManager unregisterinappmessagemanager15 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    Double dDuration9 = navigationRoute5.directionsRoute.duration();
                                    dDuration9.getClass();
                                    jSerializer = UriKt.serializer(dDuration9.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                                }
                                Double dDuration10 = navigationRoute4.directionsRoute.duration();
                                dDuration10.getClass();
                                RouteLineDynamicData routeLineDynamicData8 = routeLineDynamicData;
                                Iterator it7 = it;
                                long j110 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration10.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                                setUnregisteredInAppMessage setunregisteredinappmessage6 = setUnregisteredInAppMessage.MINUTES;
                                setunregisteredinappmessage6.getClass();
                                double dSerializer5 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j110, setunregisteredinappmessage6);
                                dSignum = Math.signum(dSerializer5);
                                jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer5)), setunregisteredinappmessage6);
                                iWrite = MathKt.write(dSignum);
                                FeatureCollection featureCollection110 = featureCollection7;
                                if (iWrite == dSignum) {
                                    j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                    j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                    if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                        if (iWrite == 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                            return null;
                                        }
                                        if (iWrite <= 0) {
                                            jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                        }
                                        list2 = list2;
                                    } else if (iWrite == 0) {
                                        jSerializer2 = 0;
                                    } else {
                                        j3 = jSerializer2 >> 1;
                                        j4 = iWrite;
                                        j5 = j3 * j4;
                                        if ((((int) jSerializer2) & 1) == 0) {
                                            if (-2147483647L > j3 && j3 < 2147483648L) {
                                                jRemoteActionCompatParcelizer = UriKt.read(j5);
                                            } else if (j5 / j4 != j3) {
                                                j6 = j3 / 1000000;
                                                j7 = j6 * j4;
                                                long j111 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                if (j7 / j4 != j6 && (j111 ^ j7) >= 0) {
                                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j111, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                                } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                    jRemoteActionCompatParcelizer = j2;
                                                } else {
                                                    jRemoteActionCompatParcelizer = j;
                                                }
                                            } else if (-4611686018426999999L > j5 && j5 < 4611686018427000000L) {
                                                jRemoteActionCompatParcelizer = UriKt.read(j5);
                                            } else {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            }
                                        } else if (j5 / j4 == j3) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                        } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                            jRemoteActionCompatParcelizer = j2;
                                        } else {
                                            jRemoteActionCompatParcelizer = j;
                                        }
                                        jSerializer2 = jRemoteActionCompatParcelizer;
                                    }
                                } else {
                                    list2 = list2;
                                    if ((((int) jSerializer2) & 1) == 0) {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                    }
                                    jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                                }
                                baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                                it = it7;
                                featureCollection7 = featureCollection110;
                                routeLineDynamicData = routeLineDynamicData8;
                                list2 = list2;
                            }
                            routeLineDynamicData2 = routeLineDynamicData;
                            featureCollection8 = featureCollection7;
                            listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                        }
                        routeCalloutData = new RouteCalloutData(listSerializer);
                    }
                } else {
                    routeLineDynamicData2 = routeLineDynamicData;
                    featureCollection8 = featureCollection7;
                    routeCalloutData = new RouteCalloutData(listSerializer);
                }
                routeCalloutData2 = routeCalloutData;
                mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                mapboxRouteLineApiOptions = mapboxRouteLineApi3.routeLineOptions;
                anonymousClass1.L$0 = mapboxRouteLineApi3;
                anonymousClass1.L$1 = routeFeatureData4;
                RouteLineValueCommandHolder routeLineValueCommandHolder37 = routeLineValueCommandHolder3;
                anonymousClass1.L$2 = routeLineValueCommandHolder37;
                anonymousClass1.L$3 = routeLineValueCommandHolder4;
                featureCollection9 = featureCollection8;
                anonymousClass1.L$4 = featureCollection9;
                anonymousClass1.L$5 = featureCollection4;
                anonymousClass1.L$6 = featureCollection5;
                routeLineValueCommandHolder18 = routeLineValueCommandHolder36;
                anonymousClass1.L$7 = routeLineValueCommandHolder18;
                routeLineValueCommandHolder19 = routeLineValueCommandHolder16;
                anonymousClass1.L$8 = routeLineValueCommandHolder19;
                routeLineValueCommandHolder20 = routeLineValueCommandHolder17;
                anonymousClass1.L$9 = routeLineValueCommandHolder20;
                anonymousClass1.L$10 = routeLineValueCommandHolder7;
                anonymousClass1.L$11 = routeLineValueCommandHolder8;
                routeLineValueCommandHolder21 = routeLineValueCommandHolder37;
                anonymousClass1.L$12 = r29;
                anonymousClass1.L$13 = r30;
                anonymousClass1.L$14 = r31;
                anonymousClass1.L$15 = routeLineValueCommandHolder12;
                anonymousClass1.L$16 = routeLineValueCommandHolder13;
                anonymousClass1.L$17 = routeLineValueCommandHolder14;
                anonymousClass1.L$18 = routeLineValueCommandHolder15;
                anonymousClass1.L$19 = routeLineDynamicData2;
                anonymousClass1.L$20 = routeCalloutData2;
                anonymousClass1.L$21 = featureCollection6;
                anonymousClass1.L$22 = mapboxRouteLineUtils;
                anonymousClass1.L$23 = mapboxRouteLineApiOptions;
                anonymousClass1.I$0 = i5;
                routeFeatureData5 = routeFeatureData4;
                featureCollection10 = featureCollection4;
                anonymousClass1.D$0 = d4;
                anonymousClass1.D$1 = d9;
                anonymousClass1.D$2 = d10;
                anonymousClass1.label = 4;
                objRouteLineActiveLegExpressionData = mapboxRouteLineApi3.routeLineActiveLegExpressionData(i5, anonymousClass1);
                coroutineSingletons2 = coroutineSingletons;
                if (objRouteLineActiveLegExpressionData == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                i6 = i5;
                obj = objRouteLineActiveLegExpressionData;
                routeLineValueCommandHolder22 = routeLineValueCommandHolder19;
                routeCalloutData3 = routeCalloutData2;
                routeFeatureData6 = routeFeatureData5;
                routeLineDynamicData3 = routeLineDynamicData2;
                routeLineValueCommandHolder23 = routeLineValueCommandHolder10;
                routeLineValueCommandHolder24 = routeLineValueCommandHolder15;
                mapboxRouteLineApi4 = mapboxRouteLineApi3;
                routeLineValueCommandHolder25 = routeLineValueCommandHolder7;
                routeLineValueCommandHolder26 = routeLineValueCommandHolder4;
                d11 = d4;
                featureCollection11 = featureCollection10;
                routeLineValueCommandHolder27 = routeLineValueCommandHolder9;
                routeLineValueCommandHolder28 = routeLineValueCommandHolder11;
                featureCollection12 = featureCollection6;
                routeLineValueCommandHolder29 = routeLineValueCommandHolder20;
                d12 = d9;
                double d116 = d10;
                featureCollection13 = featureCollection5;
                mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
                routeLineValueCommandHolder30 = routeLineValueCommandHolder8;
                d13 = d116;
            } else if (i8 == 4) {
                double d22 = anonymousClass1.D$2;
                double d23 = anonymousClass1.D$1;
                double d24 = anonymousClass1.D$0;
                int i15 = anonymousClass1.I$0;
                MapboxRouteLineApiOptions mapboxRouteLineApiOptions3 = anonymousClass1.L$23;
                mapboxRouteLineUtils = anonymousClass1.L$22;
                featureCollection12 = anonymousClass1.L$21;
                RouteCalloutData routeCalloutData4 = anonymousClass1.L$20;
                RouteLineDynamicData routeLineDynamicData9 = anonymousClass1.L$19;
                RouteLineValueCommandHolder routeLineValueCommandHolder38 = anonymousClass1.L$18;
                RouteLineValueCommandHolder routeLineValueCommandHolder39 = anonymousClass1.L$17;
                RouteLineValueCommandHolder routeLineValueCommandHolder40 = anonymousClass1.L$16;
                RouteLineValueCommandHolder routeLineValueCommandHolder41 = anonymousClass1.L$15;
                RouteLineValueCommandHolder routeLineValueCommandHolder42 = anonymousClass1.L$14;
                RouteLineValueCommandHolder routeLineValueCommandHolder43 = anonymousClass1.L$13;
                routeLineValueCommandHolder27 = anonymousClass1.L$12;
                RouteLineValueCommandHolder routeLineValueCommandHolder44 = anonymousClass1.L$11;
                RouteLineValueCommandHolder routeLineValueCommandHolder45 = anonymousClass1.L$10;
                routeLineValueCommandHolder29 = anonymousClass1.L$9;
                routeLineValueCommandHolder22 = anonymousClass1.L$8;
                RouteLineValueCommandHolder routeLineValueCommandHolder46 = anonymousClass1.L$7;
                featureCollection13 = (FeatureCollection) anonymousClass1.L$6;
                FeatureCollection featureCollection21 = (FeatureCollection) anonymousClass1.L$5;
                FeatureCollection featureCollection22 = (FeatureCollection) anonymousClass1.L$4;
                RouteLineValueCommandHolder routeLineValueCommandHolder47 = (RouteLineValueCommandHolder) anonymousClass1.L$3;
                RouteLineValueCommandHolder routeLineValueCommandHolder48 = (RouteLineValueCommandHolder) anonymousClass1.L$2;
                routeFeatureData6 = (RouteFeatureData) anonymousClass1.L$1;
                mapboxRouteLineApi4 = anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                routeLineValueCommandHolder14 = routeLineValueCommandHolder39;
                routeLineValueCommandHolder13 = routeLineValueCommandHolder40;
                d11 = d24;
                i6 = i15;
                routeCalloutData3 = routeCalloutData4;
                routeLineDynamicData3 = routeLineDynamicData9;
                routeLineValueCommandHolder12 = routeLineValueCommandHolder41;
                routeLineValueCommandHolder25 = routeLineValueCommandHolder45;
                routeLineValueCommandHolder18 = routeLineValueCommandHolder46;
                featureCollection11 = featureCollection21;
                routeLineValueCommandHolder21 = routeLineValueCommandHolder48;
                d12 = d23;
                mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions3;
                routeLineValueCommandHolder24 = routeLineValueCommandHolder38;
                routeLineValueCommandHolder30 = routeLineValueCommandHolder44;
                featureCollection9 = featureCollection22;
                routeLineValueCommandHolder26 = routeLineValueCommandHolder47;
                d13 = d22;
                routeLineValueCommandHolder28 = routeLineValueCommandHolder42;
                routeLineValueCommandHolder23 = routeLineValueCommandHolder43;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list6 = (List) obj;
            List list7 = mapboxRouteLineApi4.restrictedExpressionData;
            Double dDistance4 = routeFeatureData6.route.directionsRoute.distance();
            dDistance4.getClass();
            double dDoubleValue3 = dDistance4.doubleValue();
            mapboxRouteLineUtils.getClass();
            RouteLineData routeLineData = new RouteLineData(featureCollection12, MapboxRouteLineUtils.getPrimaryRouteLineDynamicData$ui_maps_release(mapboxRouteLineApiOptions2, list6, list7, dDoubleValue3, d11, i6));
            featureCollection9.getClass();
            RouteLineData routeLineData2 = new RouteLineData(featureCollection9, new RouteLineDynamicData(routeLineValueCommandHolder18, routeLineValueCommandHolder22, routeLineValueCommandHolder21, routeLineValueCommandHolder30, new RouteLineTrimOffset(d12), routeLineValueCommandHolder29, routeLineValueCommandHolder25, routeLineValueCommandHolder27));
            featureCollection11.getClass();
            Expected expectedCreateValue = ExpectedFactory.createValue(new RouteSetValue(routeLineData, SQLite.read(routeLineData2, new RouteLineData(featureCollection11, new RouteLineDynamicData(routeLineValueCommandHolder23, routeLineValueCommandHolder28, routeLineValueCommandHolder26, routeLineValueCommandHolder14, new RouteLineTrimOffset(d13), routeLineValueCommandHolder12, routeLineValueCommandHolder13, routeLineValueCommandHolder24))), featureCollection13, routeCalloutData3, routeLineDynamicData3));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        }
        List list8 = (List) objAwaitInternal;
        List list9 = list8;
        if (!(list9 instanceof Collection) || !list9.isEmpty()) {
            Iterator it8 = list9.iterator();
            int i16 = 0;
            while (it8.hasNext()) {
                if (((RouteFeatureData) it8.next()).coordinatesCount < 2 && (i16 = i16 + 1) < 0) {
                    SQLite.RemoteActionCompatParcelizer();
                    throw null;
                }
            }
            if (i16 > 0) {
                Expected expectedCreateError = ExpectedFactory.createError(new RouteLineError("The route geometry contained less than two coordinates. At least two coordinates are required to render a route line."));
                expectedCreateError.getClass();
                return expectedCreateError;
            }
        }
        ArrayList arrayList = mapboxRouteLineApi.routeFeatureData;
        ContextScope contextScope = mapboxRouteLineApi.calculationsScope;
        arrayList.clear();
        arrayList.addAll(list8);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((RouteFeatureData) obj2).route, onContentCardDismissed.read(mapboxRouteLineApi.routes)}, getCieXyz.write())).booleanValue()) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(arrayList2, arrayList3);
        routeFeatureData = (RouteFeatureData) onContentCardDismissed.MediaMetadataCompat((List) arrayList2);
        if (routeFeatureData == null) {
            Expected expectedCreateError2 = ExpectedFactory.createError(new RouteLineError("There's no primary route to be drawn."));
            expectedCreateError2.getClass();
            return expectedCreateError2;
        }
        routeFeatureData2 = (RouteFeatureData) onContentCardDismissed.MediaMetadataCompat((List) arrayList3);
        routeFeatureData3 = (RouteFeatureData) onContentCardDismissed.read(1, arrayList3);
        VanishingRouteLine vanishingRouteLine = mapboxRouteLineApi.vanishingRouteLine;
        double d25 = (vanishingRouteLine == null || vanishingRouteLine.vanishingPointState == VanishingPointState.DISABLED) ? 0.0d : vanishingRouteLine.vanishPointOffset;
        ShortNewsContentCardView shortNewsContentCardView = null;
        DeferredCoroutine deferredCoroutineIconCompatParcelizer2 = BuildersKt.IconCompatParcelizer(contextScope, null, null, new FlowLiveDataConversions$asFlow$1$1(routeFeatureData, mapboxRouteLineApi, shortNewsContentCardView, 28), 3);
        getopeninganimationIconCompatParcelizer = BuildersKt.IconCompatParcelizer(contextScope, null, null, new DiskLruCache$launchCleanup$1(routeFeatureData, shortNewsContentCardView, 9), 3);
        anonymousClass1.L$0 = mapboxRouteLineApi;
        anonymousClass1.L$1 = onviewattachedtowindowlambda0;
        anonymousClass1.L$2 = routeFeatureData;
        anonymousClass1.L$3 = routeFeatureData2;
        anonymousClass1.L$4 = routeFeatureData3;
        anonymousClass1.L$5 = getopeninganimationIconCompatParcelizer;
        anonymousClass1.L$6 = mapboxRouteLineApi;
        anonymousClass1.I$0 = i2;
        anonymousClass1.D$0 = d25;
        anonymousClass1.label = 2;
        Object objAwaitInternal2 = deferredCoroutineIconCompatParcelizer2.awaitInternal(anonymousClass1);
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objAwaitInternal2 == coroutineSingletons3) {
            return coroutineSingletons3;
        }
        d = d25;
        mapboxRouteLineApi2 = mapboxRouteLineApi;
        int i17 = i2;
        obj = objAwaitInternal2;
        i3 = i17;
        mapboxRouteLineApi.routeLineExpressionData = (List) obj;
        if (routeFeatureData2 != null) {
            dDoubleValue = 0.0d;
        } else {
            dDoubleValue = 0.0d;
        }
        if (routeFeatureData3 != null) {
            dDoubleValue2 = 0.0d;
        } else {
            dDoubleValue2 = 0.0d;
        }
        if (routeFeatureData2 != null) {
            NavigationRoute navigationRoute7 = routeFeatureData2.route;
            getopeninganimation = getopeninganimationIconCompatParcelizer;
            if (navigationRoute7 != null) {
            }
            if (((List) onviewattachedtowindowlambda0.write).size() > 1) {
                routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxNavigation$notification$1$1(routeFeatureData3, 7, mapboxRouteLineApi2), 0), new LineGradientCommandApplier(0));
            } else {
                routeLineValueCommandHolder2 = null;
            }
            featureCollection = routeFeatureData.reversedFeatureCollection;
            if (routeFeatureData2 != null) {
                featureCollectionFromFeatures = routeFeatureData2.reversedFeatureCollection;
            } else {
                featureCollectionFromFeatures = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
            }
            if (routeFeatureData3 != null) {
                featureCollectionFromFeatures2 = routeFeatureData3.reversedFeatureCollection;
            } else {
                featureCollectionFromFeatures2 = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
            }
            anonymousClass1.L$0 = mapboxRouteLineApi2;
            anonymousClass1.L$1 = routeFeatureData;
            anonymousClass1.L$2 = routeLineValueCommandHolder;
            anonymousClass1.L$3 = routeLineValueCommandHolder2;
            anonymousClass1.L$4 = featureCollection;
            anonymousClass1.L$5 = featureCollectionFromFeatures;
            anonymousClass1.L$6 = featureCollectionFromFeatures2;
            anonymousClass1.I$0 = i3;
            anonymousClass1.D$0 = d;
            anonymousClass1.D$1 = dDoubleValue;
            d2 = d;
            d3 = dDoubleValue2;
            anonymousClass1.D$2 = d3;
            anonymousClass1.label = 3;
            objAwait = getopeninganimation.await(anonymousClass1);
            if (objAwait == coroutineSingletons3) {
                return coroutineSingletons3;
            }
            routeLineValueCommandHolder3 = routeLineValueCommandHolder;
            obj = objAwait;
            featureCollection2 = featureCollectionFromFeatures;
            coroutineSingletons = coroutineSingletons3;
            routeLineValueCommandHolder4 = routeLineValueCommandHolder2;
            MapboxRouteLineApi mapboxRouteLineApi9 = mapboxRouteLineApi2;
            i4 = i3;
            mapboxRouteLineApi3 = mapboxRouteLineApi9;
            double d117 = dDoubleValue;
            featureCollection3 = featureCollection;
            featureCollection4 = featureCollectionFromFeatures2;
            routeFeatureData4 = routeFeatureData;
            d4 = d2;
            d5 = d3;
            d6 = d117;
            featureCollection5 = (FeatureCollection) obj;
            featureCollection6 = featureCollection3;
            i5 = i4;
            featureCollection7 = featureCollection2;
            RouteLineValueCommandHolder routeLineValueCommandHolder310 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 1), 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 2), 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder6 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$4, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder7 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$3, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder8 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$2, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder9 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$1, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder10 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 3), 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder11 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 4), 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder12 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$8, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder13 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$7, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder14 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$6, 1), new LineGradientCommandApplier(0));
            routeLineValueCommandHolder15 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$5, 1), new LineGradientCommandApplier(0));
            navigationRoute3 = routeFeatureData4.route;
            mapboxRouteLineApi3.getClass();
            if (isMultiLeg(navigationRoute3)) {
                List list10 = mapboxRouteLineApi3.routeLineExpressionData;
                Double d118 = new Double(d4);
                Double dDistance5 = navigationRoute3.directionsRoute.distance();
                dDistance5.getClass();
                d10 = d5;
                d9 = d6;
                routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                routeLineDynamicData = mapboxRouteLineApi3.getRouteLineDynamicDataForMaskingLayers$ui_maps_release(list10, d118, dDistance5.doubleValue(), i5);
            } else {
                d9 = d6;
                routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
                routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
                d10 = d5;
                MapboxRouteLineUtils mapboxRouteLineUtils5 = MapboxRouteLineUtils.INSTANCE;
                StylePropertyValue singleColorExpression4 = MapboxRouteLineUtils.getSingleColorExpression(0);
                int i18 = 1;
                routeLineDynamicData = new RouteLineDynamicData(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression4, 0), i18), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression4, 1), i18), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression4, 2), i18), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression4, 3), 1), new LineGradientCommandApplier(0)), new RouteLineTrimOffset(d4), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression4, 4), 1), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression4, 5), 1), new LineGradientCommandApplier(0)), null, Fields.SpotShadowColor);
            }
            if (mapboxRouteLineApi3.calloutApi != null) {
                list = mapboxRouteLineApi3.routes;
                list2 = mapboxRouteLineApi3.alternativeRoutesMetadata;
                list.getClass();
                list2.getClass();
                if (list.size() <= 1) {
                    navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                    if (navigationRoute4 == null) {
                        routeLineDynamicData2 = routeLineDynamicData;
                        featureCollection8 = featureCollection7;
                    } else {
                        List listSerializer7 = onContentCardDismissed.serializer(list, 1);
                        baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer7.size() + 1);
                        unregisterInAppMessageManager unregisterinappmessagemanager16 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                        baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                        it = listSerializer7.iterator();
                        while (it.hasNext()) {
                            navigationRoute5 = (NavigationRoute) it.next();
                            it2 = list2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                            alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                            if (alternativeRouteMetadata != null) {
                                double d119 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                unregisterInAppMessageManager unregisterinappmessagemanager17 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                jSerializer = UriKt.serializer(d119, setUnregisteredInAppMessage.SECONDS);
                            } else {
                                unregisterInAppMessageManager unregisterinappmessagemanager18 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                Double dDuration11 = navigationRoute5.directionsRoute.duration();
                                dDuration11.getClass();
                                jSerializer = UriKt.serializer(dDuration11.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                            }
                            Double dDuration12 = navigationRoute4.directionsRoute.duration();
                            dDuration12.getClass();
                            RouteLineDynamicData routeLineDynamicData10 = routeLineDynamicData;
                            Iterator it9 = it;
                            long j112 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration12.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                            setUnregisteredInAppMessage setunregisteredinappmessage7 = setUnregisteredInAppMessage.MINUTES;
                            setunregisteredinappmessage7.getClass();
                            double dSerializer6 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j112, setunregisteredinappmessage7);
                            dSignum = Math.signum(dSerializer6);
                            jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer6)), setunregisteredinappmessage7);
                            iWrite = MathKt.write(dSignum);
                            FeatureCollection featureCollection111 = featureCollection7;
                            if (iWrite == dSignum) {
                                j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                    if (iWrite == 0) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                        return null;
                                    }
                                    if (iWrite <= 0) {
                                        jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                    }
                                    list2 = list2;
                                } else if (iWrite == 0) {
                                    jSerializer2 = 0;
                                } else {
                                    j3 = jSerializer2 >> 1;
                                    j4 = iWrite;
                                    j5 = j3 * j4;
                                    if ((((int) jSerializer2) & 1) == 0) {
                                        if (-2147483647L > j3) {
                                            if (j5 / j4 != j3) {
                                                j6 = j3 / 1000000;
                                                j7 = j6 * j4;
                                                long j113 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                if (j7 / j4 != j6) {
                                                }
                                                if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                    jRemoteActionCompatParcelizer = j2;
                                                } else {
                                                    jRemoteActionCompatParcelizer = j;
                                                }
                                            } else if (-4611686018426999999L > j5) {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            } else {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            }
                                        } else if (j5 / j4 != j3) {
                                            j6 = j3 / 1000000;
                                            j7 = j6 * j4;
                                            long j114 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                            if (j7 / j4 != j6) {
                                            }
                                            if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                jRemoteActionCompatParcelizer = j2;
                                            } else {
                                                jRemoteActionCompatParcelizer = j;
                                            }
                                        } else if (-4611686018426999999L > j5) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        } else {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        }
                                    } else if (j5 / j4 == j3) {
                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                    } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                        jRemoteActionCompatParcelizer = j2;
                                    } else {
                                        jRemoteActionCompatParcelizer = j;
                                    }
                                    jSerializer2 = jRemoteActionCompatParcelizer;
                                }
                            } else {
                                list2 = list2;
                                if ((((int) jSerializer2) & 1) == 0) {
                                    setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                } else {
                                    setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                }
                                jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                            }
                            baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                            it = it9;
                            featureCollection7 = featureCollection111;
                            routeLineDynamicData = routeLineDynamicData10;
                            list2 = list2;
                        }
                        routeLineDynamicData2 = routeLineDynamicData;
                        featureCollection8 = featureCollection7;
                        listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                    }
                    routeCalloutData = new RouteCalloutData(listSerializer);
                } else {
                    navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                    if (navigationRoute4 == null) {
                        routeLineDynamicData2 = routeLineDynamicData;
                        featureCollection8 = featureCollection7;
                    } else {
                        List listSerializer8 = onContentCardDismissed.serializer(list, 1);
                        baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer8.size() + 1);
                        unregisterInAppMessageManager unregisterinappmessagemanager19 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                        baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                        it = listSerializer8.iterator();
                        while (it.hasNext()) {
                            navigationRoute5 = (NavigationRoute) it.next();
                            it2 = list2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                            alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                            if (alternativeRouteMetadata != null) {
                                double d1110 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                                unregisterInAppMessageManager unregisterinappmessagemanager110 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                jSerializer = UriKt.serializer(d1110, setUnregisteredInAppMessage.SECONDS);
                            } else {
                                unregisterInAppMessageManager unregisterinappmessagemanager111 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                Double dDuration13 = navigationRoute5.directionsRoute.duration();
                                dDuration13.getClass();
                                jSerializer = UriKt.serializer(dDuration13.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                            }
                            Double dDuration14 = navigationRoute4.directionsRoute.duration();
                            dDuration14.getClass();
                            RouteLineDynamicData routeLineDynamicData11 = routeLineDynamicData;
                            Iterator it10 = it;
                            long j115 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration14.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                            setUnregisteredInAppMessage setunregisteredinappmessage8 = setUnregisteredInAppMessage.MINUTES;
                            setunregisteredinappmessage8.getClass();
                            double dSerializer7 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j115, setunregisteredinappmessage8);
                            dSignum = Math.signum(dSerializer7);
                            jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer7)), setunregisteredinappmessage8);
                            iWrite = MathKt.write(dSignum);
                            FeatureCollection featureCollection112 = featureCollection7;
                            if (iWrite == dSignum) {
                                j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                                j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                                if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                    if (iWrite == 0) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                        return null;
                                    }
                                    if (iWrite <= 0) {
                                        jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                    }
                                    list2 = list2;
                                } else if (iWrite == 0) {
                                    jSerializer2 = 0;
                                } else {
                                    j3 = jSerializer2 >> 1;
                                    j4 = iWrite;
                                    j5 = j3 * j4;
                                    if ((((int) jSerializer2) & 1) == 0) {
                                        if (-2147483647L > j3) {
                                            if (j5 / j4 != j3) {
                                                j6 = j3 / 1000000;
                                                j7 = j6 * j4;
                                                long j116 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                                if (j7 / j4 != j6) {
                                                }
                                                if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                    jRemoteActionCompatParcelizer = j2;
                                                } else {
                                                    jRemoteActionCompatParcelizer = j;
                                                }
                                            } else if (-4611686018426999999L > j5) {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            } else {
                                                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                            }
                                        } else if (j5 / j4 != j3) {
                                            j6 = j3 / 1000000;
                                            j7 = j6 * j4;
                                            long j117 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                            if (j7 / j4 != j6) {
                                            }
                                            if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                jRemoteActionCompatParcelizer = j2;
                                            } else {
                                                jRemoteActionCompatParcelizer = j;
                                            }
                                        } else if (-4611686018426999999L > j5) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        } else {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        }
                                    } else if (j5 / j4 == j3) {
                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                    } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                        jRemoteActionCompatParcelizer = j2;
                                    } else {
                                        jRemoteActionCompatParcelizer = j;
                                    }
                                    jSerializer2 = jRemoteActionCompatParcelizer;
                                }
                            } else {
                                list2 = list2;
                                if ((((int) jSerializer2) & 1) == 0) {
                                    setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                                } else {
                                    setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                                }
                                jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                            }
                            baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                            it = it10;
                            featureCollection7 = featureCollection112;
                            routeLineDynamicData = routeLineDynamicData11;
                            list2 = list2;
                        }
                        routeLineDynamicData2 = routeLineDynamicData;
                        featureCollection8 = featureCollection7;
                        listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                    }
                    routeCalloutData = new RouteCalloutData(listSerializer);
                }
            } else {
                routeLineDynamicData2 = routeLineDynamicData;
                featureCollection8 = featureCollection7;
                routeCalloutData = new RouteCalloutData(listSerializer);
            }
            routeCalloutData2 = routeCalloutData;
            mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            mapboxRouteLineApiOptions = mapboxRouteLineApi3.routeLineOptions;
            anonymousClass1.L$0 = mapboxRouteLineApi3;
            anonymousClass1.L$1 = routeFeatureData4;
            RouteLineValueCommandHolder routeLineValueCommandHolder311 = routeLineValueCommandHolder3;
            anonymousClass1.L$2 = routeLineValueCommandHolder311;
            anonymousClass1.L$3 = routeLineValueCommandHolder4;
            featureCollection9 = featureCollection8;
            anonymousClass1.L$4 = featureCollection9;
            anonymousClass1.L$5 = featureCollection4;
            anonymousClass1.L$6 = featureCollection5;
            routeLineValueCommandHolder18 = routeLineValueCommandHolder310;
            anonymousClass1.L$7 = routeLineValueCommandHolder18;
            routeLineValueCommandHolder19 = routeLineValueCommandHolder16;
            anonymousClass1.L$8 = routeLineValueCommandHolder19;
            routeLineValueCommandHolder20 = routeLineValueCommandHolder17;
            anonymousClass1.L$9 = routeLineValueCommandHolder20;
            anonymousClass1.L$10 = routeLineValueCommandHolder7;
            anonymousClass1.L$11 = routeLineValueCommandHolder8;
            routeLineValueCommandHolder21 = routeLineValueCommandHolder311;
            anonymousClass1.L$12 = r29;
            anonymousClass1.L$13 = r30;
            anonymousClass1.L$14 = r31;
            anonymousClass1.L$15 = routeLineValueCommandHolder12;
            anonymousClass1.L$16 = routeLineValueCommandHolder13;
            anonymousClass1.L$17 = routeLineValueCommandHolder14;
            anonymousClass1.L$18 = routeLineValueCommandHolder15;
            anonymousClass1.L$19 = routeLineDynamicData2;
            anonymousClass1.L$20 = routeCalloutData2;
            anonymousClass1.L$21 = featureCollection6;
            anonymousClass1.L$22 = mapboxRouteLineUtils;
            anonymousClass1.L$23 = mapboxRouteLineApiOptions;
            anonymousClass1.I$0 = i5;
            routeFeatureData5 = routeFeatureData4;
            featureCollection10 = featureCollection4;
            anonymousClass1.D$0 = d4;
            anonymousClass1.D$1 = d9;
            anonymousClass1.D$2 = d10;
            anonymousClass1.label = 4;
            objRouteLineActiveLegExpressionData = mapboxRouteLineApi3.routeLineActiveLegExpressionData(i5, anonymousClass1);
            coroutineSingletons2 = coroutineSingletons;
            if (objRouteLineActiveLegExpressionData == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            i6 = i5;
            obj = objRouteLineActiveLegExpressionData;
            routeLineValueCommandHolder22 = routeLineValueCommandHolder19;
            routeCalloutData3 = routeCalloutData2;
            routeFeatureData6 = routeFeatureData5;
            routeLineDynamicData3 = routeLineDynamicData2;
            routeLineValueCommandHolder23 = routeLineValueCommandHolder10;
            routeLineValueCommandHolder24 = routeLineValueCommandHolder15;
            mapboxRouteLineApi4 = mapboxRouteLineApi3;
            routeLineValueCommandHolder25 = routeLineValueCommandHolder7;
            routeLineValueCommandHolder26 = routeLineValueCommandHolder4;
            d11 = d4;
            featureCollection11 = featureCollection10;
            routeLineValueCommandHolder27 = routeLineValueCommandHolder9;
            routeLineValueCommandHolder28 = routeLineValueCommandHolder11;
            featureCollection12 = featureCollection6;
            routeLineValueCommandHolder29 = routeLineValueCommandHolder20;
            d12 = d9;
            double d1111 = d10;
            featureCollection13 = featureCollection5;
            mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
            routeLineValueCommandHolder30 = routeLineValueCommandHolder8;
            d13 = d1111;
            List list11 = (List) obj;
            List list12 = mapboxRouteLineApi4.restrictedExpressionData;
            Double dDistance6 = routeFeatureData6.route.directionsRoute.distance();
            dDistance6.getClass();
            double dDoubleValue4 = dDistance6.doubleValue();
            mapboxRouteLineUtils.getClass();
            RouteLineData routeLineData3 = new RouteLineData(featureCollection12, MapboxRouteLineUtils.getPrimaryRouteLineDynamicData$ui_maps_release(mapboxRouteLineApiOptions2, list11, list12, dDoubleValue4, d11, i6));
            featureCollection9.getClass();
            RouteLineData routeLineData4 = new RouteLineData(featureCollection9, new RouteLineDynamicData(routeLineValueCommandHolder18, routeLineValueCommandHolder22, routeLineValueCommandHolder21, routeLineValueCommandHolder30, new RouteLineTrimOffset(d12), routeLineValueCommandHolder29, routeLineValueCommandHolder25, routeLineValueCommandHolder27));
            featureCollection11.getClass();
            Expected expectedCreateValue2 = ExpectedFactory.createValue(new RouteSetValue(routeLineData3, SQLite.read(routeLineData4, new RouteLineData(featureCollection11, new RouteLineDynamicData(routeLineValueCommandHolder23, routeLineValueCommandHolder28, routeLineValueCommandHolder26, routeLineValueCommandHolder14, new RouteLineTrimOffset(d13), routeLineValueCommandHolder12, routeLineValueCommandHolder13, routeLineValueCommandHolder24))), featureCollection13, routeCalloutData3, routeLineDynamicData3));
            expectedCreateValue2.getClass();
            return expectedCreateValue2;
        }
        getopeninganimation = getopeninganimationIconCompatParcelizer;
        if (((List) onviewattachedtowindowlambda0.write).size() > 1) {
            routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxNavigation$notification$1$1(routeFeatureData3, 7, mapboxRouteLineApi2), 0), new LineGradientCommandApplier(0));
        } else {
            routeLineValueCommandHolder2 = null;
        }
        featureCollection = routeFeatureData.reversedFeatureCollection;
        if (routeFeatureData2 != null) {
            featureCollectionFromFeatures = routeFeatureData2.reversedFeatureCollection;
        } else {
            featureCollectionFromFeatures = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
        }
        if (routeFeatureData3 != null) {
            featureCollectionFromFeatures2 = routeFeatureData3.reversedFeatureCollection;
        } else {
            featureCollectionFromFeatures2 = FeatureCollection.fromFeatures((List<Feature>) listSerializer);
        }
        anonymousClass1.L$0 = mapboxRouteLineApi2;
        anonymousClass1.L$1 = routeFeatureData;
        anonymousClass1.L$2 = routeLineValueCommandHolder;
        anonymousClass1.L$3 = routeLineValueCommandHolder2;
        anonymousClass1.L$4 = featureCollection;
        anonymousClass1.L$5 = featureCollectionFromFeatures;
        anonymousClass1.L$6 = featureCollectionFromFeatures2;
        anonymousClass1.I$0 = i3;
        anonymousClass1.D$0 = d;
        anonymousClass1.D$1 = dDoubleValue;
        d2 = d;
        d3 = dDoubleValue2;
        anonymousClass1.D$2 = d3;
        anonymousClass1.label = 3;
        objAwait = getopeninganimation.await(anonymousClass1);
        if (objAwait == coroutineSingletons3) {
            return coroutineSingletons3;
        }
        routeLineValueCommandHolder3 = routeLineValueCommandHolder;
        obj = objAwait;
        featureCollection2 = featureCollectionFromFeatures;
        coroutineSingletons = coroutineSingletons3;
        routeLineValueCommandHolder4 = routeLineValueCommandHolder2;
        MapboxRouteLineApi mapboxRouteLineApi10 = mapboxRouteLineApi2;
        i4 = i3;
        mapboxRouteLineApi3 = mapboxRouteLineApi10;
        double d1112 = dDoubleValue;
        featureCollection3 = featureCollection;
        featureCollection4 = featureCollectionFromFeatures2;
        routeFeatureData4 = routeFeatureData;
        d4 = d2;
        d5 = d3;
        d6 = d1112;
        featureCollection5 = (FeatureCollection) obj;
        featureCollection6 = featureCollection3;
        i5 = i4;
        featureCollection7 = featureCollection2;
        RouteLineValueCommandHolder routeLineValueCommandHolder312 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 1), 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d6, 2), 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder6 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$4, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder7 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$3, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder8 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$2, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder9 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$1, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder10 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 3), 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder11 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineUtils$getRouteLineExpression$expression$1(d5, 4), 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder12 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$8, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder13 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$7, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder14 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$6, 1), new LineGradientCommandApplier(0));
        routeLineValueCommandHolder15 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE$5, 1), new LineGradientCommandApplier(0));
        navigationRoute3 = routeFeatureData4.route;
        mapboxRouteLineApi3.getClass();
        if (isMultiLeg(navigationRoute3)) {
            List list13 = mapboxRouteLineApi3.routeLineExpressionData;
            Double d1113 = new Double(d4);
            Double dDistance7 = navigationRoute3.directionsRoute.distance();
            dDistance7.getClass();
            d10 = d5;
            d9 = d6;
            routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
            routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
            routeLineDynamicData = mapboxRouteLineApi3.getRouteLineDynamicDataForMaskingLayers$ui_maps_release(list13, d1113, dDistance7.doubleValue(), i5);
        } else {
            d9 = d6;
            routeLineValueCommandHolder16 = routeLineValueCommandHolder5;
            routeLineValueCommandHolder17 = routeLineValueCommandHolder6;
            d10 = d5;
            MapboxRouteLineUtils mapboxRouteLineUtils6 = MapboxRouteLineUtils.INSTANCE;
            StylePropertyValue singleColorExpression5 = MapboxRouteLineUtils.getSingleColorExpression(0);
            int i19 = 1;
            routeLineDynamicData = new RouteLineDynamicData(new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression5, 0), i19), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression5, 1), i19), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression5, 2), i19), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression5, 3), 1), new LineGradientCommandApplier(0)), new RouteLineTrimOffset(d4), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression5, 4), 1), new LineGradientCommandApplier(0)), new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new MapboxRouteLineApi$buildDrawRoutesState$maskingLayerData$1(singleColorExpression5, 5), 1), new LineGradientCommandApplier(0)), null, Fields.SpotShadowColor);
        }
        if (mapboxRouteLineApi3.calloutApi != null) {
            list = mapboxRouteLineApi3.routes;
            list2 = mapboxRouteLineApi3.alternativeRoutesMetadata;
            list.getClass();
            list2.getClass();
            if (list.size() <= 1) {
                navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                if (navigationRoute4 == null) {
                    routeLineDynamicData2 = routeLineDynamicData;
                    featureCollection8 = featureCollection7;
                } else {
                    List listSerializer9 = onContentCardDismissed.serializer(list, 1);
                    baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer9.size() + 1);
                    unregisterInAppMessageManager unregisterinappmessagemanager112 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                    baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                    it = listSerializer9.iterator();
                    while (it.hasNext()) {
                        navigationRoute5 = (NavigationRoute) it.next();
                        it2 = list2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                        alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                        if (alternativeRouteMetadata != null) {
                            double d1114 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                            unregisterInAppMessageManager unregisterinappmessagemanager113 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            jSerializer = UriKt.serializer(d1114, setUnregisteredInAppMessage.SECONDS);
                        } else {
                            unregisterInAppMessageManager unregisterinappmessagemanager114 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            Double dDuration15 = navigationRoute5.directionsRoute.duration();
                            dDuration15.getClass();
                            jSerializer = UriKt.serializer(dDuration15.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                        }
                        Double dDuration16 = navigationRoute4.directionsRoute.duration();
                        dDuration16.getClass();
                        RouteLineDynamicData routeLineDynamicData12 = routeLineDynamicData;
                        Iterator it11 = it;
                        long j118 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration16.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                        setUnregisteredInAppMessage setunregisteredinappmessage9 = setUnregisteredInAppMessage.MINUTES;
                        setunregisteredinappmessage9.getClass();
                        double dSerializer8 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j118, setunregisteredinappmessage9);
                        dSignum = Math.signum(dSerializer8);
                        jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer8)), setunregisteredinappmessage9);
                        iWrite = MathKt.write(dSignum);
                        FeatureCollection featureCollection113 = featureCollection7;
                        if (iWrite == dSignum) {
                            j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                            j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                            if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                if (iWrite == 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                    return null;
                                }
                                if (iWrite <= 0) {
                                    jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                }
                                list2 = list2;
                            } else if (iWrite == 0) {
                                jSerializer2 = 0;
                            } else {
                                j3 = jSerializer2 >> 1;
                                j4 = iWrite;
                                j5 = j3 * j4;
                                if ((((int) jSerializer2) & 1) == 0) {
                                    if (-2147483647L > j3) {
                                        if (j5 / j4 != j3) {
                                            j6 = j3 / 1000000;
                                            j7 = j6 * j4;
                                            long j119 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                            if (j7 / j4 != j6) {
                                            }
                                            if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                jRemoteActionCompatParcelizer = j2;
                                            } else {
                                                jRemoteActionCompatParcelizer = j;
                                            }
                                        } else if (-4611686018426999999L > j5) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        } else {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        }
                                    } else if (j5 / j4 != j3) {
                                        j6 = j3 / 1000000;
                                        j7 = j6 * j4;
                                        long j1110 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                        if (j7 / j4 != j6) {
                                        }
                                        if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                            jRemoteActionCompatParcelizer = j2;
                                        } else {
                                            jRemoteActionCompatParcelizer = j;
                                        }
                                    } else if (-4611686018426999999L > j5) {
                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                    } else {
                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                    }
                                } else if (j5 / j4 == j3) {
                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                    jRemoteActionCompatParcelizer = j2;
                                } else {
                                    jRemoteActionCompatParcelizer = j;
                                }
                                jSerializer2 = jRemoteActionCompatParcelizer;
                            }
                        } else {
                            list2 = list2;
                            if ((((int) jSerializer2) & 1) == 0) {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                            } else {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                            }
                            jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                        }
                        baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                        it = it11;
                        featureCollection7 = featureCollection113;
                        routeLineDynamicData = routeLineDynamicData12;
                        list2 = list2;
                    }
                    routeLineDynamicData2 = routeLineDynamicData;
                    featureCollection8 = featureCollection7;
                    listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                }
                routeCalloutData = new RouteCalloutData(listSerializer);
            } else {
                navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                if (navigationRoute4 == null) {
                    routeLineDynamicData2 = routeLineDynamicData;
                    featureCollection8 = featureCollection7;
                } else {
                    List listSerializer10 = onContentCardDismissed.serializer(list, 1);
                    baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(listSerializer10.size() + 1);
                    unregisterInAppMessageManager unregisterinappmessagemanager115 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                    baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute4, true, UriKt.RemoteActionCompatParcelizer(0, setUnregisteredInAppMessage.SECONDS)));
                    it = listSerializer10.iterator();
                    while (it.hasNext()) {
                        navigationRoute5 = (NavigationRoute) it.next();
                        it2 = list2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((AlternativeRouteMetadata) next).navigationRoute.id, navigationRoute5.id}, getCieXyz.write())).booleanValue());
                        alternativeRouteMetadata = (AlternativeRouteMetadata) next;
                        if (alternativeRouteMetadata != null) {
                            double d1115 = alternativeRouteMetadata.infoFromStartOfPrimary.duration;
                            unregisterInAppMessageManager unregisterinappmessagemanager116 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            jSerializer = UriKt.serializer(d1115, setUnregisteredInAppMessage.SECONDS);
                        } else {
                            unregisterInAppMessageManager unregisterinappmessagemanager117 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                            Double dDuration17 = navigationRoute5.directionsRoute.duration();
                            dDuration17.getClass();
                            jSerializer = UriKt.serializer(dDuration17.doubleValue(), setUnregisteredInAppMessage.SECONDS);
                        }
                        Double dDuration18 = navigationRoute4.directionsRoute.duration();
                        dDuration18.getClass();
                        RouteLineDynamicData routeLineDynamicData13 = routeLineDynamicData;
                        Iterator it12 = it;
                        long j1111 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(UriKt.serializer(dDuration18.doubleValue(), setUnregisteredInAppMessage.SECONDS), BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer));
                        setUnregisteredInAppMessage setunregisteredinappmessage10 = setUnregisteredInAppMessage.MINUTES;
                        setunregisteredinappmessage10.getClass();
                        double dSerializer9 = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j1111, setunregisteredinappmessage10);
                        dSignum = Math.signum(dSerializer9);
                        jSerializer2 = UriKt.serializer(Math.ceil(Math.abs(dSerializer9)), setunregisteredinappmessage10);
                        iWrite = MathKt.write(dSignum);
                        FeatureCollection featureCollection114 = featureCollection7;
                        if (iWrite == dSignum) {
                            j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
                            j2 = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                            if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(jSerializer2)) {
                                if (iWrite == 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Multiplying infinite duration by zero yields an undefined result.");
                                    return null;
                                }
                                if (iWrite <= 0) {
                                    jSerializer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jSerializer2);
                                }
                                list2 = list2;
                            } else if (iWrite == 0) {
                                jSerializer2 = 0;
                            } else {
                                j3 = jSerializer2 >> 1;
                                j4 = iWrite;
                                j5 = j3 * j4;
                                if ((((int) jSerializer2) & 1) == 0) {
                                    if (-2147483647L > j3) {
                                        if (j5 / j4 != j3) {
                                            j6 = j3 / 1000000;
                                            j7 = j6 * j4;
                                            long j1112 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                            if (j7 / j4 != j6) {
                                            }
                                            if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                                jRemoteActionCompatParcelizer = j2;
                                            } else {
                                                jRemoteActionCompatParcelizer = j;
                                            }
                                        } else if (-4611686018426999999L > j5) {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        } else {
                                            jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                        }
                                    } else if (j5 / j4 != j3) {
                                        j6 = j3 / 1000000;
                                        j7 = j6 * j4;
                                        long j1113 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
                                        if (j7 / j4 != j6) {
                                        }
                                        if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                            jRemoteActionCompatParcelizer = j2;
                                        } else {
                                            jRemoteActionCompatParcelizer = j;
                                        }
                                    } else if (-4611686018426999999L > j5) {
                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                    } else {
                                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(j5 / 1000000);
                                    }
                                } else if (j5 / j4 == j3) {
                                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(RangesKt.read(j5, new getDisplayingInAppMessageannotations(-4611686018427387903L, 4611686018427387903L)));
                                } else if (Integer.signum(iWrite) * Long.signum(j3) > 0) {
                                    jRemoteActionCompatParcelizer = j2;
                                } else {
                                    jRemoteActionCompatParcelizer = j;
                                }
                                jSerializer2 = jRemoteActionCompatParcelizer;
                            }
                        } else {
                            list2 = list2;
                            if ((((int) jSerializer2) & 1) == 0) {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.NANOSECONDS;
                            } else {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.MILLISECONDS;
                            }
                            jSerializer2 = UriKt.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jSerializer2, setunregisteredinappmessage) * dSignum, setunregisteredinappmessage);
                        }
                        baseContentCardViewExternalSyntheticLambda0.add(new RouteCallout(navigationRoute5, false, jSerializer2));
                        it = it12;
                        featureCollection7 = featureCollection114;
                        routeLineDynamicData = routeLineDynamicData13;
                        list2 = list2;
                    }
                    routeLineDynamicData2 = routeLineDynamicData;
                    featureCollection8 = featureCollection7;
                    listSerializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                }
                routeCalloutData = new RouteCalloutData(listSerializer);
            }
        } else {
            routeLineDynamicData2 = routeLineDynamicData;
            featureCollection8 = featureCollection7;
            routeCalloutData = new RouteCalloutData(listSerializer);
        }
        routeCalloutData2 = routeCalloutData;
        mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
        mapboxRouteLineApiOptions = mapboxRouteLineApi3.routeLineOptions;
        anonymousClass1.L$0 = mapboxRouteLineApi3;
        anonymousClass1.L$1 = routeFeatureData4;
        RouteLineValueCommandHolder routeLineValueCommandHolder313 = routeLineValueCommandHolder3;
        anonymousClass1.L$2 = routeLineValueCommandHolder313;
        anonymousClass1.L$3 = routeLineValueCommandHolder4;
        featureCollection9 = featureCollection8;
        anonymousClass1.L$4 = featureCollection9;
        anonymousClass1.L$5 = featureCollection4;
        anonymousClass1.L$6 = featureCollection5;
        routeLineValueCommandHolder18 = routeLineValueCommandHolder312;
        anonymousClass1.L$7 = routeLineValueCommandHolder18;
        routeLineValueCommandHolder19 = routeLineValueCommandHolder16;
        anonymousClass1.L$8 = routeLineValueCommandHolder19;
        routeLineValueCommandHolder20 = routeLineValueCommandHolder17;
        anonymousClass1.L$9 = routeLineValueCommandHolder20;
        anonymousClass1.L$10 = routeLineValueCommandHolder7;
        anonymousClass1.L$11 = routeLineValueCommandHolder8;
        routeLineValueCommandHolder21 = routeLineValueCommandHolder313;
        anonymousClass1.L$12 = r29;
        anonymousClass1.L$13 = r30;
        anonymousClass1.L$14 = r31;
        anonymousClass1.L$15 = routeLineValueCommandHolder12;
        anonymousClass1.L$16 = routeLineValueCommandHolder13;
        anonymousClass1.L$17 = routeLineValueCommandHolder14;
        anonymousClass1.L$18 = routeLineValueCommandHolder15;
        anonymousClass1.L$19 = routeLineDynamicData2;
        anonymousClass1.L$20 = routeCalloutData2;
        anonymousClass1.L$21 = featureCollection6;
        anonymousClass1.L$22 = mapboxRouteLineUtils;
        anonymousClass1.L$23 = mapboxRouteLineApiOptions;
        anonymousClass1.I$0 = i5;
        routeFeatureData5 = routeFeatureData4;
        featureCollection10 = featureCollection4;
        anonymousClass1.D$0 = d4;
        anonymousClass1.D$1 = d9;
        anonymousClass1.D$2 = d10;
        anonymousClass1.label = 4;
        objRouteLineActiveLegExpressionData = mapboxRouteLineApi3.routeLineActiveLegExpressionData(i5, anonymousClass1);
        coroutineSingletons2 = coroutineSingletons;
        if (objRouteLineActiveLegExpressionData == coroutineSingletons2) {
            return coroutineSingletons2;
        }
        i6 = i5;
        obj = objRouteLineActiveLegExpressionData;
        routeLineValueCommandHolder22 = routeLineValueCommandHolder19;
        routeCalloutData3 = routeCalloutData2;
        routeFeatureData6 = routeFeatureData5;
        routeLineDynamicData3 = routeLineDynamicData2;
        routeLineValueCommandHolder23 = routeLineValueCommandHolder10;
        routeLineValueCommandHolder24 = routeLineValueCommandHolder15;
        mapboxRouteLineApi4 = mapboxRouteLineApi3;
        routeLineValueCommandHolder25 = routeLineValueCommandHolder7;
        routeLineValueCommandHolder26 = routeLineValueCommandHolder4;
        d11 = d4;
        featureCollection11 = featureCollection10;
        routeLineValueCommandHolder27 = routeLineValueCommandHolder9;
        routeLineValueCommandHolder28 = routeLineValueCommandHolder11;
        featureCollection12 = featureCollection6;
        routeLineValueCommandHolder29 = routeLineValueCommandHolder20;
        d12 = d9;
        double d1116 = d10;
        featureCollection13 = featureCollection5;
        mapboxRouteLineApiOptions2 = mapboxRouteLineApiOptions;
        routeLineValueCommandHolder30 = routeLineValueCommandHolder8;
        d13 = d1116;
        List list14 = (List) obj;
        List list15 = mapboxRouteLineApi4.restrictedExpressionData;
        Double dDistance8 = routeFeatureData6.route.directionsRoute.distance();
        dDistance8.getClass();
        double dDoubleValue5 = dDistance8.doubleValue();
        mapboxRouteLineUtils.getClass();
        RouteLineData routeLineData5 = new RouteLineData(featureCollection12, MapboxRouteLineUtils.getPrimaryRouteLineDynamicData$ui_maps_release(mapboxRouteLineApiOptions2, list14, list15, dDoubleValue5, d11, i6));
        featureCollection9.getClass();
        RouteLineData routeLineData6 = new RouteLineData(featureCollection9, new RouteLineDynamicData(routeLineValueCommandHolder18, routeLineValueCommandHolder22, routeLineValueCommandHolder21, routeLineValueCommandHolder30, new RouteLineTrimOffset(d12), routeLineValueCommandHolder29, routeLineValueCommandHolder25, routeLineValueCommandHolder27));
        featureCollection11.getClass();
        Expected expectedCreateValue3 = ExpectedFactory.createValue(new RouteSetValue(routeLineData5, SQLite.read(routeLineData6, new RouteLineData(featureCollection11, new RouteLineDynamicData(routeLineValueCommandHolder23, routeLineValueCommandHolder28, routeLineValueCommandHolder26, routeLineValueCommandHolder14, new RouteLineTrimOffset(d13), routeLineValueCommandHolder12, routeLineValueCommandHolder13, routeLineValueCommandHolder24))), featureCollection13, routeCalloutData3, routeLineDynamicData3));
        expectedCreateValue3.getClass();
        return expectedCreateValue3;
    }

    public final void clearRouteLine(MapboxNavigationConsumer mapboxNavigationConsumer) {
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        AsyncSection asyncSectionAsyncSectionStarted = PerformanceTracker.asyncSectionStarted("MapboxRouteLineApi#clearRouteLine");
        stopMemoryMonitoring();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.calculationsScope, MainDispatcherLoader.read, null, new MutatorMutex$mutate$2(this, asyncSectionAsyncSectionStarted, mapboxNavigationConsumer, (ShortNewsContentCardView) null, 4), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$findClosestRoute(MapboxRouteLineApi mapboxRouteLineApi, Point point, MapboxMap mapboxMap, float f, List list, ContinuationImpl continuationImpl) {
        MapboxRouteLineApi$findClosestRoute$2 mapboxRouteLineApi$findClosestRoute$2;
        List list2;
        if (continuationImpl instanceof MapboxRouteLineApi$findClosestRoute$2) {
            mapboxRouteLineApi$findClosestRoute$2 = (MapboxRouteLineApi$findClosestRoute$2) continuationImpl;
            int i = mapboxRouteLineApi$findClosestRoute$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapboxRouteLineApi$findClosestRoute$2.label = i - Integer.MIN_VALUE;
            } else {
                mapboxRouteLineApi$findClosestRoute$2 = new MapboxRouteLineApi$findClosestRoute$2(mapboxRouteLineApi, continuationImpl);
            }
        } else {
            mapboxRouteLineApi$findClosestRoute$2 = new MapboxRouteLineApi$findClosestRoute$2(mapboxRouteLineApi, continuationImpl);
        }
        Object obj = mapboxRouteLineApi$findClosestRoute$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mapboxRouteLineApi$findClosestRoute$2.label;
        int i3 = 3;
        Set layerIdsForPrimaryRoute$ui_maps_release = null;
        int i4 = 1;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(list);
            List list3 = listPlaybackStateCompat;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((RouteFeatureData) it.next()).reversedFeatureCollection);
            }
            Style styleDeprecated = mapboxMap.getStyleDeprecated();
            if (styleDeprecated != null) {
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                layerIdsForPrimaryRoute$ui_maps_release = MapboxRouteLineUtils.getLayerIdsForPrimaryRoute$ui_maps_release(styleDeprecated, MapboxRouteLineUtils.sourceLayerMap);
            }
            if (layerIdsForPrimaryRoute$ui_maps_release == null) {
                layerIdsForPrimaryRoute$ui_maps_release = ItemTouchHelperAdapter.serializer;
            }
            Set set = layerIdsForPrimaryRoute$ui_maps_release;
            List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.write((Iterable) onContentCardDismissed.serializer(onContentCardDismissed.serializer(MapboxRouteLineUtils.layerGroup1SourceLayerIds, MapboxRouteLineUtils.layerGroup2SourceLayerIds), MapboxRouteLineUtils.layerGroup3SourceLayerIds), (Iterable) set));
            List listPlaybackStateCompat3 = onContentCardDismissed.PlaybackStateCompat(set);
            ScreenCoordinate screenCoordinatePixelForCoordinate = mapboxMap.pixelForCoordinate(point);
            CompositeClosestRouteHandler compositeClosestRouteHandler = new CompositeClosestRouteHandler(SQLite.read(new CompositeClosestRouteHandler(listPlaybackStateCompat3, i4), new RectClosestRouteHandler(listPlaybackStateCompat3, f), new CompositeClosestRouteHandler(listPlaybackStateCompat2, i4), new RectClosestRouteHandler(listPlaybackStateCompat2, f)), 0);
            mapboxRouteLineApi$findClosestRoute$2.L$0 = listPlaybackStateCompat;
            mapboxRouteLineApi$findClosestRoute$2.label = 1;
            Object objHandle = compositeClosestRouteHandler.handle(mapboxMap, screenCoordinatePixelForCoordinate, arrayList, mapboxRouteLineApi$findClosestRoute$2);
            if (objHandle == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = listPlaybackStateCompat;
            obj = objHandle;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = mapboxRouteLineApi$findClosestRoute$2.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Object objFold = ((Expected) obj).fold(new Snapshotter$$ExternalSyntheticLambda0(25), new MapboxTripSession$$ExternalSyntheticLambda8(list2, i3));
        objFold.getClass();
        return objFold;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object access$setNewRouteData(MapboxRouteLineApi mapboxRouteLineApi, ArrayList arrayList, SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1, List list, int i, ContinuationImpl continuationImpl) {
        MapboxRouteLineApi$setNewRouteData$1 mapboxRouteLineApi$setNewRouteData$1;
        String str;
        ArrayList arrayList2;
        SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$2;
        Object next;
        double d;
        MapboxRouteLineApi mapboxRouteLineApi2 = mapboxRouteLineApi;
        int i2 = i;
        VanishingRouteLine vanishingRouteLine = mapboxRouteLineApi2.vanishingRouteLine;
        if (continuationImpl instanceof MapboxRouteLineApi$setNewRouteData$1) {
            mapboxRouteLineApi$setNewRouteData$1 = (MapboxRouteLineApi$setNewRouteData$1) continuationImpl;
            int i3 = mapboxRouteLineApi$setNewRouteData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mapboxRouteLineApi$setNewRouteData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                mapboxRouteLineApi$setNewRouteData$1 = new MapboxRouteLineApi$setNewRouteData$1(mapboxRouteLineApi2, continuationImpl);
            }
        } else {
            mapboxRouteLineApi$setNewRouteData$1 = new MapboxRouteLineApi$setNewRouteData$1(mapboxRouteLineApi2, continuationImpl);
        }
        Object obj = mapboxRouteLineApi$setNewRouteData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = mapboxRouteLineApi$setNewRouteData$1.label;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(((NavigationRoute) obj2).id)) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() < arrayList.size()) {
                LoggerProviderKt.logW("Routes provided to MapboxRouteLineApi contain duplicates (based on NavigationRoute#id) - using only distinct instances", "MapboxRouteLineApi");
            }
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                str = "MapboxRouteLineApi";
                LoggerProviderKt.logD("setNewRouteData: distinct routes ids are: ".concat(onContentCardDismissed.IconCompatParcelizer(arrayList3, ", ", null, null, MapboxRouteLineApi$setNewRouteData$2$1.INSTANCE, 30)), str);
            } else {
                str = "MapboxRouteLineApi";
            }
            arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                AlternativeRouteMetadata alternativeRouteMetadata = (AlternativeRouteMetadata) obj3;
                Iterator it = arrayList3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) next).id, alternativeRouteMetadata.navigationRoute.id}, getCieXyz.write())).booleanValue());
                if (next != null) {
                    arrayList2.add(obj3);
                }
            }
            Object objMediaMetadataCompat = onContentCardDismissed.MediaMetadataCompat((List) arrayList3);
            if (objMediaMetadataCompat != null) {
                DirectionsRoute directionsRoute = ((NavigationRoute) objMediaMetadataCompat).directionsRoute;
                NavigationRoute navigationRoute = mapboxRouteLineApi2.primaryRoute;
                if (!zzmb.isSameRoute(directionsRoute, navigationRoute != null ? navigationRoute.directionsRoute : null) && vanishingRouteLine != null) {
                    vanishingRouteLine.vanishPointOffset = 0.0d;
                }
            }
            mapboxRouteLineApi2.alternativeRoutesMetadata = arrayList2;
            mapboxRouteLineApi2.routes = arrayList3;
            Iterator it2 = mapboxRouteLineApi2.routesSetToRouteLineObservers.iterator();
            if (!it2.hasNext()) {
                mapboxRouteLineApi2.primaryRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat((List) arrayList3);
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("trimming route data caches to size " + arrayList3.size(), str);
                }
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                int size = arrayList3.size();
                ((LruCache) MapboxRouteLineUtils.extractRouteDataCache$delegate.MediaSessionCompatResultReceiverWrapper()).trimToSize(size);
                ((LruCache) MapboxRouteLineUtils.granularDistancesCache$delegate.MediaSessionCompatResultReceiverWrapper()).trimToSize(size);
                mapboxRouteLineApi2.activeLegIndex = i2;
                boolean z = vanishingRouteLine != null;
                boolean zIsEmpty = arrayList2.isEmpty();
                mapboxRouteLineApi$setNewRouteData$1.L$0 = mapboxRouteLineApi2;
                mapboxRouteLineApi$setNewRouteData$1.L$1 = searchOptionsKt$validateLimit$1;
                mapboxRouteLineApi$setNewRouteData$1.L$2 = arrayList2;
                mapboxRouteLineApi$setNewRouteData$1.I$0 = i2;
                mapboxRouteLineApi$setNewRouteData$1.label = 1;
                if (mapboxRouteLineApi2.preWarmRouteCaches(arrayList3, z, !zIsEmpty, mapboxRouteLineApi$setNewRouteData$1) != coroutineSingletons) {
                    searchOptionsKt$validateLimit$2 = searchOptionsKt$validateLimit$1;
                }
            }
            throw ff$$ExternalSyntheticOutline0.m(it2);
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = mapboxRouteLineApi$setNewRouteData$1.I$0;
        ArrayList arrayList4 = mapboxRouteLineApi$setNewRouteData$1.L$2;
        searchOptionsKt$validateLimit$2 = mapboxRouteLineApi$setNewRouteData$1.L$1;
        MapboxRouteLineApi mapboxRouteLineApi3 = mapboxRouteLineApi$setNewRouteData$1.L$0;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        arrayList2 = arrayList4;
        i2 = i5;
        mapboxRouteLineApi2 = mapboxRouteLineApi3;
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList2, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AlternativeRouteMetadata alternativeRouteMetadata2 = (AlternativeRouteMetadata) it3.next();
            String str2 = alternativeRouteMetadata2.navigationRoute.id;
            CacheResultUtils$cacheResult$1 cacheResultUtils$cacheResult$1 = MapboxRouteLineUtils.granularDistancesProvider;
            cacheResultUtils$cacheResult$1.getClass();
            NavigationRoute navigationRoute2 = alternativeRouteMetadata2.navigationRoute;
            RouteLineGranularDistances routeLineGranularDistances = (RouteLineGranularDistances) cacheResultUtils$cacheResult$1.invoke(navigationRoute2);
            if (routeLineGranularDistances != null) {
                double d2 = routeLineGranularDistances.completeDistance;
                RouteLineDistancesIndex[] routeLineDistancesIndexArr = routeLineGranularDistances.routeDistances;
                if (routeLineDistancesIndexArr.length == 0 || d2 <= 0.0d) {
                    LoggerProviderKt.logW("Remaining distances array size is " + routeLineDistancesIndexArr.length + " and the full distance is " + d2 + " - unable to calculate the deviation point of the alternative with ID '" + navigationRoute2.id + "' to hide the portion that overlaps with the primary route.", "MapboxRouteLineUtils");
                    i2 = i2;
                    it3 = it3;
                    d = 0.0d;
                } else {
                    int i6 = alternativeRouteMetadata2.forkIntersectionOfAlternativeRoute.geometryIndexInRoute;
                    if (i6 >= 0 && i6 <= routeLineDistancesIndexArr.length - 1) {
                        i2 = i2;
                        it3 = it3;
                        double d3 = routeLineDistancesIndexArr[i6].distanceRemaining;
                        if (d3 > d2) {
                            LoggerProviderKt.logW("distance remaining > full distance - unable to calculate the deviation point of the alternative with ID '" + navigationRoute2.id + "' to hide the portion that overlaps with the primary route.", "MapboxRouteLineUtils");
                            d = 0.0d;
                        } else {
                            d = 1.0d - (d3 / d2);
                        }
                    } else {
                        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i6, "Remaining distance at index '", "' requested but there are ");
                        sbM.append(routeLineDistancesIndexArr.length);
                        sbM.append(" elements in the distances array - unable to calculate the deviation point of the alternative with ID '");
                        sbM.append(navigationRoute2.id);
                        sbM.append("' to hide the portion that overlaps with the primary route.");
                        LoggerProviderKt.logW(sbM.toString(), "MapboxRouteLineUtils");
                        d = 0.0d;
                    }
                }
            } else {
                i2 = i2;
                it3 = it3;
                d = 0.0d;
            }
            linkedHashMap.put(str2, new Double(d));
            it3 = it3;
            i2 = i2;
        }
        mapboxRouteLineApi2.alternativesDeviationOffset = linkedHashMap;
        mapboxRouteLineApi$setNewRouteData$1.L$0 = null;
        mapboxRouteLineApi$setNewRouteData$1.L$1 = null;
        mapboxRouteLineApi$setNewRouteData$1.L$2 = null;
        mapboxRouteLineApi$setNewRouteData$1.label = 2;
        Object objBuildDrawRoutesState = mapboxRouteLineApi2.buildDrawRoutesState(searchOptionsKt$validateLimit$2, i2, mapboxRouteLineApi$setNewRouteData$1);
        return objBuildDrawRoutesState == coroutineSingletons ? coroutineSingletons : objBuildDrawRoutesState;
    }

    public final RouteLineDynamicData getRouteLineDynamicDataForMaskingLayers$ui_maps_release(List list, Double d, final double d2, final int i) {
        list.getClass();
        final SegmentColorType segmentColorType = SegmentColorType.TRANSPARENT;
        segmentColorType.getClass();
        final List list2 = (List) this.alternativelyStyleSegmentsNotInLeg.invoke(Integer.valueOf(i), list, new InactiveRouteColors(segmentColorType, segmentColorType, segmentColorType, segmentColorType, segmentColorType, segmentColorType, segmentColorType));
        int i2 = 1;
        RouteLineValueCommandHolder routeLineValueCommandHolder = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$getRouteLineDynamicDataForMaskingLayers$trafficExpProvider$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                return new StylePropertyValue(MapboxRouteLineUtils.getTrafficLineExpression$ui_maps_release(routeLineViewOptionsData, 0.0d, SegmentColorType.PRIMARY_UNKNOWN_CONGESTION, list2, d2), StylePropertyValueKind.EXPRESSION);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, i2), new LineGradientCommandApplier(0));
        RouteLineValueCommandHolder routeLineValueCommandHolder2 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(list, i, 2), i2), new LineGradientCommandApplier(0));
        RouteLineValueCommandHolder routeLineValueCommandHolder3 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(list, i, i2), i2), new LineGradientCommandApplier(0));
        RouteLineValueCommandHolder routeLineValueCommandHolder4 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(list, i, 4), i2), new LineGradientCommandApplier(0));
        RouteLineValueCommandHolder routeLineValueCommandHolder5 = new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new ExpiringDataRemover$removeExpiringDataFromRoute$directionsRouteBlock$1(list, i, 3), i2), new LineGradientCommandApplier(0));
        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
        final List list3 = this.restrictedExpressionData;
        final MapboxRouteLineApiOptions mapboxRouteLineApiOptions = this.routeLineOptions;
        mapboxRouteLineApiOptions.getClass();
        list3.getClass();
        return new RouteLineDynamicData(routeLineValueCommandHolder2, routeLineValueCommandHolder3, routeLineValueCommandHolder, new RouteLineValueCommandHolder(new HeavyRouteLineValueProvider(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$getRestrictedLineExpressionProducer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                routeLineViewOptionsData.getClass();
                MapboxRouteLineUtils mapboxRouteLineUtils2 = MapboxRouteLineUtils.INSTANCE;
                return new StylePropertyValue(MapboxRouteLineUtils.access$getRestrictedLineExpression(list3, i, mapboxRouteLineApiOptions.getCalculateRestrictedRoadSections(), routeLineViewOptionsData.getRouteLineColorResources().getRestrictedRoadColor(), segmentColorType.getColor(routeLineViewOptionsData)), StylePropertyValueKind.EXPRESSION);
            }
        }, i2), new LineGradientCommandApplier(0)), new RouteLineTrimOffset(d.doubleValue()), routeLineValueCommandHolder4, routeLineValueCommandHolder5, null, Fields.SpotShadowColor);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c8  */
    public final Object preWarmRouteCaches(ArrayList arrayList, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        C01471 c01471;
        MapboxRouteLineApi mapboxRouteLineApi;
        ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        List<StepIntersection> list;
        ArrayList<onViewAttachedToWindowlambda0> arrayListRemoteActionCompatParcelizer;
        RouteLineGranularDistances routeLineGranularDistances;
        RouteLineDistancesIndex[][] routeLineDistancesIndexArr;
        Integer numGeometryIndex;
        int i;
        List<StepIntersection> list2;
        boolean z3;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        ArrayList arrayList2 = arrayList;
        if (continuationImpl instanceof C01471) {
            c01471 = (C01471) continuationImpl;
            int i2 = c01471.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c01471.label = i2 - Integer.MIN_VALUE;
            } else {
                c01471 = new C01471(continuationImpl);
            }
        } else {
            c01471 = new C01471(continuationImpl);
        }
        Object obj = c01471.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = c01471.label;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ArrayList arrayList3 = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (arrayList.isEmpty()) {
                return createfromparcel;
            }
            TextAnnouncementContentCardView textAnnouncementContentCardView = this.calculationsScope.serializer;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(z, arrayList2, z2, null);
            c01471.L$0 = this;
            c01471.L$1 = arrayList2;
            c01471.label = 1;
            if (BuildersKt.withContext(textAnnouncementContentCardView, anonymousClass2, c01471) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mapboxRouteLineApi = this;
        } else if (i3 == 1) {
            arrayList2 = c01471.L$1;
            mapboxRouteLineApi = c01471.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean calculateRestrictedRoadSections = mapboxRouteLineApi.routeLineOptions.getCalculateRestrictedRoadSections();
        List<StepIntersection> list3 = instance_delegatelambda0.write;
        if (calculateRestrictedRoadSections) {
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.read((List) arrayList2);
            CacheResultUtils$cacheResult$1 cacheResultUtils$cacheResult$1 = MapboxRouteLineUtils.granularDistancesProvider;
            navigationRoute.getClass();
            cacheResultUtils$cacheResult$1.getClass();
            ArrayList arrayList4 = new ArrayList();
            List<RouteLeg> listLegs = navigationRoute.directionsRoute.legs();
            if (listLegs != null) {
                int i4 = 0;
                for (Object obj2 : listLegs) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        RouteLeg routeLeg = (RouteLeg) obj2;
                        routeLeg.getClass();
                        List<LegStep> listSteps = routeLeg.steps();
                        if (listSteps != null) {
                            List<LegStep> list4 = listSteps;
                            ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                            Iterator<T> it = list4.iterator();
                            while (it.hasNext()) {
                                List<StepIntersection> listIntersections = ((LegStep) it.next()).intersections();
                                if (listIntersections == null) {
                                    listIntersections = list3;
                                }
                                arrayList5.add(listIntersections);
                            }
                            arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList5);
                        } else {
                            arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = arrayList3;
                        }
                        if (arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
                            ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 10));
                            int i6 = 0;
                            for (Object obj3 : arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                                if (i6 >= 0) {
                                    StepIntersection stepIntersection = (StepIntersection) obj3;
                                    List<String> listClasses = stepIntersection.classes();
                                    boolean zContains = listClasses != null ? listClasses.contains("restricted") : false;
                                    if (i6 != 0) {
                                        list2 = list3;
                                        List<String> listClasses2 = ((StepIntersection) arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.get(i6 - 1)).classes();
                                        if (listClasses2 != null && listClasses2.contains("restricted")) {
                                            z3 = true;
                                        }
                                        if (!zContains || i6 == 0 || z3) {
                                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(stepIntersection, Boolean.valueOf(zContains));
                                        } else {
                                            onviewattachedtowindowlambda0 = null;
                                        }
                                        arrayList6.add(onviewattachedtowindowlambda0);
                                        i6++;
                                        list3 = list2;
                                    } else {
                                        list2 = list3;
                                    }
                                    z3 = false;
                                    if (zContains) {
                                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(stepIntersection, Boolean.valueOf(zContains));
                                    } else {
                                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(stepIntersection, Boolean.valueOf(zContains));
                                    }
                                    arrayList6.add(onviewattachedtowindowlambda0);
                                    i6++;
                                    list3 = list2;
                                } else {
                                    SQLite.serializer();
                                    throw null;
                                }
                            }
                            list = list3;
                            arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList6);
                            if (arrayListRemoteActionCompatParcelizer.size() <= 1) {
                            }
                            if (arrayListRemoteActionCompatParcelizer == null) {
                                routeLineGranularDistances = (RouteLineGranularDistances) cacheResultUtils$cacheResult$1.invoke(navigationRoute);
                                if (routeLineGranularDistances != null) {
                                    routeLineDistancesIndexArr = routeLineGranularDistances.legsDistances;
                                } else {
                                    routeLineDistancesIndexArr = null;
                                }
                                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : arrayListRemoteActionCompatParcelizer) {
                                    numGeometryIndex = ((StepIntersection) onviewattachedtowindowlambda1.serializer).geometryIndex();
                                    if (numGeometryIndex != null || routeLineDistancesIndexArr == null) {
                                        i = i5;
                                    } else if (!(!(routeLineDistancesIndexArr.length == 0)) || i4 >= routeLineDistancesIndexArr.length) {
                                        i = i5;
                                    } else {
                                        int iIntValue = numGeometryIndex.intValue();
                                        RouteLineDistancesIndex[] routeLineDistancesIndexArr2 = routeLineDistancesIndexArr[i4];
                                        if (iIntValue < routeLineDistancesIndexArr2.length) {
                                            double d = routeLineDistancesIndexArr2[numGeometryIndex.intValue()].distanceRemaining;
                                            Object objInvoke = cacheResultUtils$cacheResult$1.invoke(navigationRoute);
                                            objInvoke.getClass();
                                            i = i5;
                                            double d2 = 1.0d - (d / ((RouteLineGranularDistances) objInvoke).completeDistance);
                                            if (0.0d <= d2 && d2 <= 1.0d) {
                                                arrayList4.add(new ExtractedRouteRestrictionData(i4, d2, ((Boolean) onviewattachedtowindowlambda1.write).booleanValue()));
                                            }
                                        } else {
                                            i = i5;
                                        }
                                    }
                                    i5 = i;
                                }
                            }
                            list3 = list;
                            i4 = i5;
                            arrayList3 = null;
                        } else {
                            list = list3;
                        }
                        arrayListRemoteActionCompatParcelizer = null;
                        if (arrayListRemoteActionCompatParcelizer == null) {
                            routeLineGranularDistances = (RouteLineGranularDistances) cacheResultUtils$cacheResult$1.invoke(navigationRoute);
                            if (routeLineGranularDistances != null) {
                                routeLineDistancesIndexArr = routeLineGranularDistances.legsDistances;
                            } else {
                                routeLineDistancesIndexArr = null;
                            }
                            while (r0.hasNext()) {
                                numGeometryIndex = ((StepIntersection) onviewattachedtowindowlambda1.serializer).geometryIndex();
                                if (numGeometryIndex != null) {
                                    i = i5;
                                } else {
                                    i = i5;
                                }
                                i5 = i;
                            }
                        }
                        list3 = list;
                        i4 = i5;
                        arrayList3 = null;
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                }
            }
            list3 = arrayList4;
        }
        mapboxRouteLineApi.restrictedExpressionData = list3;
        return createfromparcel;
    }
}
