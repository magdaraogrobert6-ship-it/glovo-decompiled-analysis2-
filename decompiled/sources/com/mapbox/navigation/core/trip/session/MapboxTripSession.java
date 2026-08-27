package com.mapbox.navigation.core.trip.session;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.room.Room;
import coil3.ExtrasKt;
import coil3.UriKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmc;
import com.google.android.gms.internal.mlkit_vision_face.zzmm;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationExtraKeys;
import com.mapbox.geojson.Point;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.internal.factory.RoadObjectFactory;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.LegWaypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda2;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda3;
import com.mapbox.navigation.core.MapboxNavigation$createInternalFallbackVersionsObserver$1;
import com.mapbox.navigation.core.SetRoutes$RefreshRoutes$RefreshControllerRefresh;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.navigator.LocationEx;
import com.mapbox.navigation.core.navigator.NavigatorMapper;
import com.mapbox.navigation.core.reroute.RerouteState$FetchingRoute;
import com.mapbox.navigation.core.trip.service.MapboxTripService;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.navigator.internal.TripStatus;
import com.mapbox.navigation.navigator.internal.utils.TripStatusEx;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.BannerInstruction;
import com.mapbox.navigator.FixLocation;
import com.mapbox.navigator.NavigationStatus;
import com.mapbox.navigator.NavigationStatusOrigin;
import com.mapbox.navigator.NavigatorObserver;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.RouteState;
import com.mapbox.navigator.RoutesChangeInfo;
import com.mapbox.navigator.SetRoutesReason;
import com.mapbox.navigator.UpcomingRouteAlertUpdate;
import com.mapbox.navigator.VoiceInstruction;
import com.sentiance.core.model.events.H$b;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.accessstartTrackingTable;
import o.createFromParcel;
import o.getCieXyz;
import o.getGetTextLayoutResult;
import o.instance_delegatelambda0;
import o.la;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTripSession {
    private static int read = 1;
    private static int write;
    public final H$b bannerInstructionEvent;
    public final CopyOnWriteArraySet bannerInstructionsObservers;
    public final DropShadowEffect eHorizonSubscriptionManager;
    public final CopyOnWriteArraySet fallbackVersionsObservers;
    public boolean hadOffRouteDeviation;
    public final JobControl ioJobController;
    public boolean isOffRoute;
    public final AtomicBoolean isUpdatingRoute;
    public VoiceInstructions lastVoiceInstruction;
    public LocationMatcherResult locationMatcherResult;
    public final CopyOnWriteArraySet locationObservers;
    public final JobControl mainJobController;
    public final MapboxNavigation$createInternalFallbackVersionsObserver$1 nativeFallbackVersionsObserver;
    public final MapboxNativeNavigatorImpl navigator;
    public final MapboxTripSession$navigatorObserver$1 navigatorObserver;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU notificationJob;
    public MapboxNavigation$$ExternalSyntheticLambda2 offRouteObserverForReroute;
    public final CopyOnWriteArraySet offRouteObservers;
    public final MapboxTripSession$onRawLocationUpdate$1 onRawLocationUpdate;
    public NavigationRoute primaryRoute;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU rawLocationJob;
    public final MutableStateFlow rawLocationState;
    public final int repeatRerouteAfterOffRouteDelaySeconds;
    public RerouteInvocationHandler rerouteInvocationHandler;
    public List roadObjects;
    public RouteProgress routeProgress;
    public final CopyOnWriteArraySet routeProgressObservers;
    public TripSessionState state;
    public final CopyOnWriteArraySet stateObservers;
    public final MapboxTripService tripService;
    public final DisplayCallbacksImpl tripSessionLocationEngine;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU updateLegIndexJob;
    public final CopyOnWriteArraySet voiceInstructionsObservers;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.trip.session.MapboxTripSession$setRouteToNativeNavigator$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public MapboxTripSession L$0;
        public List L$1;
        public MapboxTripSession L$2;
        public NavigationRoute L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxTripSession.this.setRouteToNativeNavigator(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.navigation.core.trip.session.MapboxTripSession$setRoutes$1, reason: invalid class name and case insensitive filesystem */
    public final class C01461 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public MapboxTripSession L$3;
        public SetRoutes$RefreshRoutes$RefreshControllerRefresh L$4;
        public NavigationRoute L$5;
        public Expected L$6;
        public Iterator L$7;
        public int label;
        public /* synthetic */ Object result;

        public C01461(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MapboxTripSession.this.setRoutes(null, null, this);
        }
    }

    public final class RerouteInvocationHandler {
        public final int repeatRerouteAfterOffRouteDelaySeconds;
        public final zznc rerouteController;
        public long startTimeMark = BrazeInAppMessageManagerWhenMappings.write();
        public final MapboxTripSession tripSession;

        public RerouteInvocationHandler(MapboxTripSession mapboxTripSession, zznc zzncVar, int i) {
            this.tripSession = mapboxTripSession;
            this.rerouteController = zzncVar;
            this.repeatRerouteAfterOffRouteDelaySeconds = i;
        }
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [com.mapbox.navigation.core.trip.session.MapboxTripSession$navigatorObserver$1] */
    public MapboxTripSession(MapboxTripService mapboxTripService, MapboxDirectionsSession mapboxDirectionsSession, DisplayCallbacksImpl displayCallbacksImpl, MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl, ThreadController threadController, DropShadowEffect dropShadowEffect, int i) {
        threadController.getClass();
        this.tripService = mapboxTripService;
        this.tripSessionLocationEngine = displayCallbacksImpl;
        this.navigator = mapboxNativeNavigatorImpl;
        this.eHorizonSubscriptionManager = dropShadowEffect;
        this.repeatRerouteAfterOffRouteDelaySeconds = i;
        int i2 = 0;
        this.isUpdatingRoute = new AtomicBoolean(false);
        mapboxDirectionsSession.onSetNavigationRoutesStartedObservers.add(new MapboxTripSession$$ExternalSyntheticLambda3(this));
        int i3 = 1;
        MapboxNavigation$$ExternalSyntheticLambda3 mapboxNavigation$$ExternalSyntheticLambda3 = new MapboxNavigation$$ExternalSyntheticLambda3(i3, this);
        mapboxDirectionsSession.onSetNavigationRoutesFinishedObservers.add(mapboxNavigation$$ExternalSyntheticLambda3);
        RoutesUpdatedResult routesUpdatedResult = mapboxDirectionsSession.routesUpdatedResult;
        if (routesUpdatedResult != null) {
            mapboxNavigation$$ExternalSyntheticLambda3.onRoutesChanged(routesUpdatedResult);
            int i4 = read + 83;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.mainJobController = threadController.getMainScopeAndRootJob();
        onBackInvokedlambda0 onbackinvokedlambda0 = new onBackInvokedlambda0(threadController.ioRootJob);
        this.ioJobController = new JobControl(onbackinvokedlambda0, YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0, ThreadController.IODispatcher)));
        this.locationObservers = new CopyOnWriteArraySet();
        this.routeProgressObservers = new CopyOnWriteArraySet();
        this.offRouteObservers = new CopyOnWriteArraySet();
        this.stateObservers = new CopyOnWriteArraySet();
        this.bannerInstructionsObservers = new CopyOnWriteArraySet();
        this.voiceInstructionsObservers = new CopyOnWriteArraySet();
        new CopyOnWriteArraySet();
        new CopyOnWriteArraySet();
        this.fallbackVersionsObservers = new CopyOnWriteArraySet();
        this.bannerInstructionEvent = new H$b(3);
        this.state = TripSessionState.STOPPED;
        this.rawLocationState = StateFlowKt.read(null);
        this.roadObjects = instance_delegatelambda0.write;
        this.nativeFallbackVersionsObserver = new MapboxNavigation$createInternalFallbackVersionsObserver$1(i3, this);
        this.onRawLocationUpdate = new MapboxTripSession$onRawLocationUpdate$1(this, i2);
        mapboxNativeNavigatorImpl.addNativeNavigatorRecreationObserver(new MapboxTripSession$$ExternalSyntheticLambda2(i2, this));
        this.navigatorObserver = new NavigatorObserver() { // from class: com.mapbox.navigation.core.trip.session.MapboxTripSession$navigatorObserver$1
            @Override // com.mapbox.navigator.NavigatorObserver
            public final void onRoutesChanged(RoutesChangeInfo routesChangeInfo) {
                routesChangeInfo.getClass();
            }

            @Override // com.mapbox.navigator.NavigatorObserver
            public final void onStatus(NavigationStatusOrigin navigationStatusOrigin, NavigationStatus navigationStatus) throws accessstartTrackingTable {
                MapboxTripSession mapboxTripSession = this.this$0;
                navigationStatusOrigin.getClass();
                navigationStatus.getClass();
                try {
                    PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                    if (!PerformanceTracker.getTrackingIsActive()) {
                        MapboxTripSession.access$processNativeStatus(mapboxTripSession, navigationStatus);
                        return;
                    }
                    PerformanceTracker.syncSectionStarted("NavigatorObserver#onStatus");
                    try {
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        MapboxTripSession.access$processNativeStatus(mapboxTripSession, navigationStatus);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavigatorObserver#onStatus", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("NavigatorObserver#onStatus", null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                        StringBuilder sb = new StringBuilder("Error processing native status update: origin=");
                        sb.append(navigationStatusOrigin);
                        sb.append(", status=");
                        sb.append(navigationStatus);
                        sb.append(".\nError: ");
                        sb.append(th2);
                        sb.append("\nMapboxTripSession state: isUpdatingRoute=");
                        sb.append(mapboxTripSession.isUpdatingRoute.get());
                        sb.append(", primaryRoute=");
                        NavigationRoute navigationRoute = mapboxTripSession.primaryRoute;
                        sb.append(navigationRoute != null ? navigationRoute.id : null);
                        LoggerProviderKt.logE(sb.toString(), "MapboxTripSession");
                    }
                    throw new accessstartTrackingTable("Error processing native status update", th2, 4);
                }
            }
        };
        int i7 = read + 95;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final void registerRouteProgressObserver(RouteProgressObserver routeProgressObserver) {
        int i = 2 % 2;
        int i2 = read + 29;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            routeProgressObserver.getClass();
            this.routeProgressObservers.add(routeProgressObserver);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        routeProgressObserver.getClass();
        this.routeProgressObservers.add(routeProgressObserver);
        RouteProgress routeProgress = this.routeProgress;
        if (routeProgress != null) {
            routeProgressObserver.onRouteProgressChanged(routeProgress);
        }
        int i3 = read + 47;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
    }

    public final void registerLocationObserver(LocationObserver locationObserver) {
        int i = 2 % 2;
        locationObserver.getClass();
        this.locationObservers.add(locationObserver);
        Location location = (Location) this.rawLocationState.read();
        if (location != null) {
            locationObserver.onNewRawLocation(location);
            int i2 = read + 105;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        LocationMatcherResult locationMatcherResult = this.locationMatcherResult;
        if (locationMatcherResult != null) {
            int i4 = read + 69;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                locationObserver.onNewLocationMatcherResult(locationMatcherResult);
                throw null;
            }
            locationObserver.onNewLocationMatcherResult(locationMatcherResult);
            int i5 = write + 71;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    public final void setOffRoute(boolean z) {
        int i = 2 % 2;
        int i2 = write + 81;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.isOffRoute == z) {
            int i4 = i3 + 91;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        this.isOffRoute = z;
        Iterator it = this.offRouteObservers.iterator();
        while (it.hasNext()) {
            ((MapboxNavigation$$ExternalSyntheticLambda2) it.next()).onOffRouteStateChanged(z);
            int i6 = write + 111;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public final void stop() {
        int i = 2 % 2;
        TripSessionState tripSessionState = this.state;
        TripSessionState tripSessionState2 = TripSessionState.STOPPED;
        Object obj = null;
        if (tripSessionState != tripSessionState2) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI("Stop trip session", "MapboxTripSession");
            }
            MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = this.navigator;
            if (!mapboxNativeNavigatorImpl.warnIfShutdown("stopNavigationSession")) {
                mapboxNativeNavigatorImpl.getNavigator().stopNavigationSession();
            }
            MapboxTripSession$navigatorObserver$1 mapboxTripSession$navigatorObserver$1 = this.navigatorObserver;
            mapboxTripSession$navigatorObserver$1.getClass();
            if (!mapboxNativeNavigatorImpl.warnIfShutdown("removeNavigatorObserver")) {
                mapboxNativeNavigatorImpl.getNavigator().removeObserver(mapboxTripSession$navigatorObserver$1);
                mapboxNativeNavigatorImpl.currentNavigatorObservers.remove(mapboxTripSession$navigatorObserver$1);
            }
            MapboxTripService mapboxTripService = this.tripService;
            boolean zCompareAndSet = mapboxTripService.serviceStarted.compareAndSet(true, false);
            if (zCompareAndSet) {
                int i2 = read + 57;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                MapboxTripService.currentTripNotification = null;
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = mapboxTripService.notificationJob;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                mapboxTripService.notificationJob = null;
                mapboxTripService.terminateLambda.invoke();
                mapboxTripService.tripNotification.onTripSessionStopped();
            } else if (!zCompareAndSet) {
                int i4 = write + 23;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    LoggerProviderKt.logI("Service is not started yet", "MapboxTripService");
                    throw null;
                }
                LoggerProviderKt.logI("Service is not started yet", "MapboxTripService");
            }
            this.tripSessionLocationEngine.stopLocationUpdates();
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.rawLocationJob;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
            }
            this.rawLocationJob = null;
            JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.mainJobController.job);
            JobKt.IconCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.ioJobController.job);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = this.updateLegIndexJob;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                int i5 = write + 61;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                    int i6 = 49 / 0;
                } else {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                }
            }
            this.locationMatcherResult = null;
            this.rawLocationState.IconCompatParcelizer(null);
            this.routeProgress = null;
            setOffRoute(false);
            this.hadOffRouteDeviation = false;
            if (this.state != tripSessionState2) {
                this.state = tripSessionState2;
                Iterator it = this.stateObservers.iterator();
                while (it.hasNext()) {
                    int i7 = read + 81;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        ((TripSessionStateObserver) it.next()).onSessionStateChanged(tripSessionState2);
                        obj.hashCode();
                        throw null;
                    }
                    ((TripSessionStateObserver) it.next()).onSessionStateChanged(tripSessionState2);
                    int i8 = read + 65;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
            }
        }
        int i10 = write + 39;
        read = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final Object setRouteToNativeNavigator(List list, int i, SetRoutesReason setRoutesReason, ContinuationImpl continuationImpl) throws Throwable {
        AnonymousClass1 anonymousClass1;
        MapboxTripSession mapboxTripSession;
        NavigationRoute navigationRoute;
        Object routes;
        MapboxTripSession mapboxTripSession2;
        List list2 = list;
        int i2 = 2 % 2;
        int i3 = write + 105;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i5 = anonymousClass1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i5 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        int i6 = write + 5;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        Object obj = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = anonymousClass2.label;
        int i9 = 0;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.isUpdatingRoute.set(true);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("native routes update (route IDs: ");
                List list3 = list2;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                Iterator it = list3.iterator();
                while (!(!it.hasNext())) {
                    int i10 = write + 91;
                    read = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        arrayList.add(((NavigationRoute) it.next()).id);
                        throw null;
                    }
                    arrayList.add(((NavigationRoute) it.next()).id);
                }
                sb.append(arrayList);
                sb.append(") - starting");
                LoggerProviderKt.logD(sb.toString(), "MapboxTripSession");
                navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
                MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = this.navigator;
                List listSerializer = onContentCardDismissed.serializer(list2, 1);
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = list2;
                anonymousClass2.L$2 = this;
                anonymousClass2.L$3 = navigationRoute;
                anonymousClass2.label = 1;
                routes = mapboxNativeNavigatorImpl.setRoutes(navigationRoute, i, listSerializer, setRoutesReason, anonymousClass2);
                if (routes == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mapboxTripSession = this;
                mapboxTripSession2 = mapboxTripSession;
            } catch (Throwable th) {
                th = th;
                mapboxTripSession = this;
                mapboxTripSession.isUpdatingRoute.set(false);
                throw th;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = write + 9;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            NavigationRoute navigationRoute2 = anonymousClass2.L$3;
            mapboxTripSession = anonymousClass2.L$2;
            List list4 = anonymousClass2.L$1;
            mapboxTripSession2 = anonymousClass2.L$0;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                navigationRoute = navigationRoute2;
                list2 = list4;
                routes = obj;
            } catch (Throwable th2) {
                th = th2;
                mapboxTripSession.isUpdatingRoute.set(false);
                throw th;
            }
        }
        Object objFold = ((Expected) routes).onValue(new ArrivalProgressObserver$$ExternalSyntheticLambda0(mapboxTripSession2, 7, navigationRoute)).mapValue(new Snapshotter$$ExternalSyntheticLambda0(20)).fold(new Snapshotter$$ExternalSyntheticLambda0(21), new MapboxTripSession$$ExternalSyntheticLambda8(list2, i9));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("native routes update (route IDs: ");
        List list5 = list2;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            int i13 = read + 63;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                arrayList2.add(((NavigationRoute) it2.next()).id);
                int i14 = 56 / 0;
            } else {
                arrayList2.add(((NavigationRoute) it2.next()).id);
            }
        }
        sb2.append(arrayList2);
        sb2.append(") - finished");
        LoggerProviderKt.logD(sb2.toString(), "MapboxTripSession");
        mapboxTripSession.isUpdatingRoute.set(false);
        objFold.getClass();
        return objFold;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public static final Object access$publishRawLocation(MapboxTripSession mapboxTripSession, Location location, ContinuationImpl continuationImpl) throws Throwable {
        MapboxTripSession$publishRawLocation$1 mapboxTripSession$publishRawLocation$1;
        Object contents;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        long j;
        String str;
        String str2;
        Object result;
        int i;
        Location location2 = location;
        int i2 = 2 % 2;
        mapboxTripSession.getClass();
        Object obj = null;
        if (continuationImpl instanceof MapboxTripSession$publishRawLocation$1) {
            int i3 = write + 5;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = ((MapboxTripSession$publishRawLocation$1) continuationImpl).label;
                obj.hashCode();
                throw null;
            }
            mapboxTripSession$publishRawLocation$1 = (MapboxTripSession$publishRawLocation$1) continuationImpl;
            int i5 = mapboxTripSession$publishRawLocation$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mapboxTripSession$publishRawLocation$1.label = i5 - Integer.MIN_VALUE;
            } else {
                mapboxTripSession$publishRawLocation$1 = new MapboxTripSession$publishRawLocation$1(mapboxTripSession, continuationImpl);
            }
        } else {
            mapboxTripSession$publishRawLocation$1 = new MapboxTripSession$publishRawLocation$1(mapboxTripSession, continuationImpl);
        }
        Object obj2 = mapboxTripSession$publishRawLocation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = mapboxTripSession$publishRawLocation$1.label;
        if (i6 != 0) {
            int i7 = read + 1;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = mapboxTripSession$publishRawLocation$1.J$0;
            i = mapboxTripSession$publishRawLocation$1.I$0;
            Location location3 = mapboxTripSession$publishRawLocation$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            j = j2;
            location2 = location3;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            int iHashCode = location.hashCode();
            Iterator it = mapboxTripSession.locationObservers.iterator();
            while (it.hasNext()) {
                ((LocationObserver) it.next()).onNewRawLocation(location2);
            }
            long jNanoTime = System.nanoTime();
            MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = mapboxTripSession.navigator;
            Value extra = location.getExtra();
            if (extra != null) {
                int i8 = read + 63;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                contents = extra.getContents();
            } else {
                contents = null;
            }
            Map map = contents instanceof HashMap ? (HashMap) contents : null;
            if (map == null) {
                map = SimpleItemTouchHelperCallback.serializer;
            }
            HashMap map2 = new HashMap(map);
            Value value = (Value) map2.get(LocationExtraKeys.IS_MOCK);
            Object contents2 = value != null ? value.getContents() : null;
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{contents2 instanceof Boolean ? (Boolean) contents2 : null, Boolean.TRUE}, getCieXyz.write())).booleanValue();
            map2.remove(LocationExtraKeys.IS_MOCK);
            Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
            Long monotonicTimestamp = location.getMonotonicTimestamp();
            if (monotonicTimestamp == null) {
                monotonicTimestamp = 0L;
            }
            long jLongValue = monotonicTimestamp.longValue();
            Date date = new Date(location.getTimestamp());
            Double speed = location.getSpeed();
            Float fValueOf4 = speed != null ? Float.valueOf((float) speed.doubleValue()) : null;
            Double bearing = location.getBearing();
            if (bearing != null) {
                int i10 = read + 45;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                fValueOf = Float.valueOf((float) bearing.doubleValue());
            } else {
                fValueOf = null;
            }
            Double altitude = location.getAltitude();
            if (altitude != null) {
                int i12 = read + 37;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    Float.valueOf((float) altitude.doubleValue());
                    obj.hashCode();
                    throw null;
                }
                fValueOf2 = Float.valueOf((float) altitude.doubleValue());
            } else {
                fValueOf2 = null;
            }
            Double horizontalAccuracy = location.getHorizontalAccuracy();
            Float fValueOf5 = horizontalAccuracy != null ? Float.valueOf((float) horizontalAccuracy.doubleValue()) : null;
            String source = location.getSource();
            Double bearingAccuracy = location.getBearingAccuracy();
            Float fValueOf6 = bearingAccuracy != null ? Float.valueOf((float) bearingAccuracy.doubleValue()) : null;
            Double speedAccuracy = location.getSpeedAccuracy();
            Float fValueOf7 = speedAccuracy != null ? Float.valueOf((float) speedAccuracy.doubleValue()) : null;
            Double verticalAccuracy = location.getVerticalAccuracy();
            if (verticalAccuracy != null) {
                int i13 = write + 35;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                fValueOf3 = Float.valueOf((float) verticalAccuracy.doubleValue());
            } else {
                fValueOf3 = null;
            }
            FixLocation fixLocation = new FixLocation(pointFromLngLat, jLongValue, date, fValueOf4, fValueOf, fValueOf2, fValueOf5, source, fValueOf6, fValueOf7, fValueOf3, map2, zBooleanValue);
            mapboxTripSession$publishRawLocation$1.L$0 = location2;
            mapboxTripSession$publishRawLocation$1.I$0 = iHashCode;
            j = jNanoTime;
            mapboxTripSession$publishRawLocation$1.J$0 = j;
            mapboxTripSession$publishRawLocation$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(mapboxTripSession$publishRawLocation$1));
            cancellableContinuationImpl.read();
            if (mapboxNativeNavigatorImpl.warnIfShutdown("updateLocation")) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                int i15 = 6;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("MapboxNativeNavigatorImpl#updateLocation");
                    try {
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        String str3 = "location.monotonicTimestampNanoseconds = " + fixLocation.getMonotonicTimestampNanoseconds();
                        if (PerformanceTracker.getTrackingIsActive()) {
                            PerformanceTracker.syncSectionStarted(str3);
                            try {
                                str2 = "MapboxNativeNavigatorImpl#updateLocation";
                                try {
                                    try {
                                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str3, new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(BrazeInAppMessageManagerWhenMappings.write())));
                                    } catch (Throwable th) {
                                        th = th;
                                        str = str2;
                                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str, null);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str = str2;
                                    try {
                                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str3, null);
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str, null);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str = "MapboxNativeNavigatorImpl#updateLocation";
                            }
                        } else {
                            str2 = "MapboxNativeNavigatorImpl#updateLocation";
                        }
                        mapboxNativeNavigatorImpl.getNavigator().updateLocation(fixLocation, new CallsKt$await$2$2(cancellableContinuationImpl, i15));
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str2, new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th5) {
                        th = th5;
                        str = "MapboxNativeNavigatorImpl#updateLocation";
                    }
                } else {
                    String str4 = "location.monotonicTimestampNanoseconds = " + fixLocation.getMonotonicTimestampNanoseconds();
                    if (PerformanceTracker.getTrackingIsActive()) {
                        PerformanceTracker.syncSectionStarted(str4);
                        try {
                            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str4, new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(BrazeInAppMessageManagerWhenMappings.write())));
                        } catch (Throwable th6) {
                            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(str4, null);
                            throw th6;
                        }
                    }
                    mapboxNativeNavigatorImpl.getNavigator().updateLocation(fixLocation, new CallsKt$await$2$2(cancellableContinuationImpl, i15));
                }
                result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (result == coroutineSingletons) {
                    int i16 = read + 25;
                    write = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    return coroutineSingletons;
                }
                i = iHashCode;
            }
            result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (result == coroutineSingletons) {
                int i18 = read + 25;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return coroutineSingletons;
            }
            i = iHashCode;
        }
        LoggerProviderKt.logD("updateRawLocation; system elapsed time: " + System.nanoTime() + "; location (" + i + ") elapsed time: " + location2.getMonotonicTimestamp() + ",notify NN for " + ((System.nanoTime() - j) / 1000000) + " ms", "MapboxTripSession");
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0381 -> B:189:0x038b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object setRoutes(java.util.List r36, o.getCutText r37, kotlin.coroutines.jvm.internal.ContinuationImpl r38) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.core.trip.session.MapboxTripSession.setRoutes(java.util.List, o.getCutText, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$processNativeStatus(MapboxTripSession mapboxTripSession, NavigationStatus navigationStatus) {
        TripStatus tripStatus;
        LocationMatcherResult locationMatcherResult;
        boolean zBooleanValue;
        Integer numValueOf;
        ArrayList updatedObjectsAhead;
        int i;
        RouteProgress routeProgressFrom;
        RouteProgress routeProgressFrom2;
        String str;
        MapboxNavigation$$ExternalSyntheticLambda2 mapboxNavigation$$ExternalSyntheticLambda2;
        BannerInstructions bannerInstructions;
        Boolean boolValueOf;
        Integer numValueOf2;
        int i2 = 2 % 2;
        JobControl jobControl = mapboxTripSession.mainJobController;
        H$b h$b = mapboxTripSession.bannerInstructionEvent;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            StringBuilder sb = new StringBuilder("navigatorObserver#onStatus; fixLocation elapsed time: ");
            sb.append(navigationStatus.getLocation().getMonotonicTimestampNanoseconds());
            sb.append(", state: ");
            sb.append(navigationStatus.getRouteState());
            sb.append(";instructions: banner idx [");
            BannerInstruction bannerInstruction = navigationStatus.getBannerInstruction();
            if (bannerInstruction != null) {
                int i3 = read + 37;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                numValueOf2 = Integer.valueOf(bannerInstruction.getIndex());
            } else {
                numValueOf2 = null;
            }
            sb.append(numValueOf2);
            sb.append("], voice idx [");
            VoiceInstruction voiceInstruction = navigationStatus.getVoiceInstruction();
            sb.append(voiceInstruction != null ? Integer.valueOf(voiceInstruction.getIndex()) : null);
            sb.append(']');
            LoggerProviderKt.logD(sb.toString(), "MapboxTripSession");
        }
        mapboxTripSession.hadOffRouteDeviation = mapboxTripSession.hadOffRouteDeviation || navigationStatus.getRouteState() == RouteState.OFF_ROUTE;
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxTripSession#processNativeStatus-getTripStatus");
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                TripStatus tripStatus2 = new TripStatus(mapboxTripSession.primaryRoute, navigationStatus);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-getTripStatus", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                tripStatus = tripStatus2;
            } catch (Throwable th) {
                int i5 = read + 13;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-getTripStatus", null);
                throw th;
            }
        } else {
            tripStatus = new TripStatus(mapboxTripSession.primaryRoute, navigationStatus);
        }
        boolean trackingIsActive = PerformanceTracker.getTrackingIsActive();
        NavigationStatus navigationStatus2 = tripStatus.navigationStatus;
        if (trackingIsActive) {
            PerformanceTracker.syncSectionStarted("MapboxTripSession#processNativeStatus-prepare-location-matcher-result");
            try {
                long jWrite2 = BrazeInAppMessageManagerWhenMappings.write();
                FixLocation location = navigationStatus2.getLocation();
                location.getClass();
                Location location2 = LocationEx.toLocation(location);
                List<FixLocation> keyPoints = navigationStatus2.getKeyPoints();
                keyPoints.getClass();
                locationMatcherResult = NavigatorMapper.getLocationMatcherResult(tripStatus, location2, LocationEx.toLocations(keyPoints), zzmc.buildRoadObject(navigationStatus2));
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-prepare-location-matcher-result", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite2)));
            } catch (Throwable th2) {
                int i7 = read + 75;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-prepare-location-matcher-result", null);
                    throw null;
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-prepare-location-matcher-result", null);
                throw th2;
            }
        } else {
            FixLocation location3 = navigationStatus2.getLocation();
            location3.getClass();
            Location location4 = LocationEx.toLocation(location3);
            List<FixLocation> keyPoints2 = navigationStatus2.getKeyPoints();
            keyPoints2.getClass();
            locationMatcherResult = NavigatorMapper.getLocationMatcherResult(tripStatus, location4, LocationEx.toLocations(keyPoints2), zzmc.buildRoadObject(navigationStatus2));
        }
        CopyOnWriteArraySet copyOnWriteArraySet = mapboxTripSession.locationObservers;
        int i8 = 18;
        if (!PerformanceTracker.getTrackingIsActive()) {
            mapboxTripSession.locationMatcherResult = locationMatcherResult;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new FlowLiveDataConversions$asFlow$1$1(it.next(), (Object) locationMatcherResult, (ShortNewsContentCardView) (objArr5 == true ? 1 : 0), i8), 3);
            }
        } else {
            PerformanceTracker.syncSectionStarted("MapboxTripSession#updateLocationMatcherResult");
            try {
                long jWrite3 = BrazeInAppMessageManagerWhenMappings.write();
                mapboxTripSession.locationMatcherResult = locationMatcherResult;
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new FlowLiveDataConversions$asFlow$1$1(it2.next(), (Object) locationMatcherResult, (ShortNewsContentCardView) (objArr == true ? 1 : 0), i8), 3);
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateLocationMatcherResult", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite3)));
            } catch (Throwable th3) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateLocationMatcherResult", null);
                throw th3;
            }
        }
        navigationStatus.getLayer();
        if (mapboxTripSession.isUpdatingRoute.get()) {
            int i9 = write + 25;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                LoggerProviderKt.logD("route progress update dropped - updating routes", "MapboxTripSession");
                return;
            } else {
                LoggerProviderKt.logD("route progress update dropped - updating routes", "MapboxTripSession");
                int i10 = 41 / 0;
                return;
            }
        }
        if (navigationStatus2.getRouteState() != RouteState.INVALID) {
            BannerInstruction bannerInstruction2 = navigationStatus2.getBannerInstruction();
            PerformanceTracker performanceTracker2 = PerformanceTracker.INSTANCE;
            if (!PerformanceTracker.getTrackingIsActive()) {
                boolValueOf = Boolean.valueOf(h$b.isOccurring(NavigatorMapper.getCurrentBannerInstructions(mapboxTripSession.primaryRoute, navigationStatus2), bannerInstruction2 != null ? Integer.valueOf(bannerInstruction2.getIndex()) : null));
            } else {
                PerformanceTracker.syncSectionStarted("MapboxTripSession#processNativeStatus-getBannerInstructions");
                try {
                    long jWrite4 = BrazeInAppMessageManagerWhenMappings.write();
                    boolValueOf = Boolean.valueOf(h$b.isOccurring(NavigatorMapper.getCurrentBannerInstructions(mapboxTripSession.primaryRoute, navigationStatus2), bannerInstruction2 != null ? Integer.valueOf(bannerInstruction2.getIndex()) : null));
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-getBannerInstructions", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite4)));
                } catch (Throwable th4) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-getBannerInstructions", null);
                    throw th4;
                }
            }
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        PerformanceTracker performanceTracker3 = PerformanceTracker.INSTANCE;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxTripSession#processNativeStatus-calculateRemainingWaypoints");
            try {
                long jWrite5 = BrazeInAppMessageManagerWhenMappings.write();
                int iCalculateRemainingWaypoints = TripStatusEx.calculateRemainingWaypoints(tripStatus);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-calculateRemainingWaypoints", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite5)));
                numValueOf = Integer.valueOf(iCalculateRemainingWaypoints);
            } catch (Throwable th5) {
                int i11 = read + 13;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-calculateRemainingWaypoints", null);
                    throw null;
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-calculateRemainingWaypoints", null);
                throw th5;
            }
        } else {
            numValueOf = Integer.valueOf(TripStatusEx.calculateRemainingWaypoints(tripStatus));
        }
        int iIntValue = numValueOf.intValue();
        BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper = (BannerInstructionEvent$LatestInstructionWrapper) h$b.serializer;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxTripSession#processNativeStatus-getUpdatedObjectsAhead");
            try {
                long jWrite6 = BrazeInAppMessageManagerWhenMappings.write();
                RoadObjectType[] roadObjectTypeArr = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
                List list = mapboxTripSession.roadObjects;
                List<UpcomingRouteAlertUpdate> upcomingRouteAlertUpdates = navigationStatus2.getUpcomingRouteAlertUpdates();
                upcomingRouteAlertUpdates.getClass();
                ArrayList updatedObjectsAhead2 = RoadObjectFactory.getUpdatedObjectsAhead(list, upcomingRouteAlertUpdates);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-getUpdatedObjectsAhead", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite6)));
                updatedObjectsAhead = updatedObjectsAhead2;
            } catch (Throwable th6) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-getUpdatedObjectsAhead", null);
                throw th6;
            }
        } else {
            RoadObjectType[] roadObjectTypeArr2 = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
            List list2 = mapboxTripSession.roadObjects;
            List<UpcomingRouteAlertUpdate> upcomingRouteAlertUpdates2 = navigationStatus2.getUpcomingRouteAlertUpdates();
            upcomingRouteAlertUpdates2.getClass();
            updatedObjectsAhead = RoadObjectFactory.getUpdatedObjectsAhead(list2, upcomingRouteAlertUpdates2);
        }
        boolean trackingIsActive2 = PerformanceTracker.getTrackingIsActive();
        NavigationRoute navigationRoute = tripStatus.route;
        if (trackingIsActive2) {
            i = 3;
            PerformanceTracker.syncSectionStarted("MapboxTripSession#processNativeStatus-create-route-progress");
            try {
                long jWrite7 = BrazeInAppMessageManagerWhenMappings.write();
                if (navigationRoute != null) {
                    routeProgressFrom = NavigatorMapper.getRouteProgressFrom(navigationRoute, navigationStatus2, iIntValue, bannerInstructionEvent$LatestInstructionWrapper != null ? bannerInstructionEvent$LatestInstructionWrapper.latestBannerInstructions : null, bannerInstructionEvent$LatestInstructionWrapper != null ? Integer.valueOf(bannerInstructionEvent$LatestInstructionWrapper.latestInstructionIndex) : null, mapboxTripSession.lastVoiceInstruction, updatedObjectsAhead, TripStatusEx.getCurrentLegDestination(tripStatus, navigationRoute));
                    if (routeProgressFrom == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("route progress update dropped - currentPrimaryRoute ID: ");
                        NavigationRoute navigationRoute2 = mapboxTripSession.primaryRoute;
                        if (navigationRoute2 != null) {
                            int i12 = write + 9;
                            read = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            str = navigationRoute2.id;
                        } else {
                            str = null;
                        }
                        sb2.append(str);
                        sb2.append("; currentState: ");
                        sb2.append(navigationStatus.getRouteState());
                        LoggerProviderKt.logD(sb2.toString(), "MapboxTripSession");
                    }
                } else {
                    routeProgressFrom = null;
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-create-route-progress", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite7)));
                routeProgressFrom2 = routeProgressFrom;
            } catch (Throwable th7) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#processNativeStatus-create-route-progress", null);
                throw th7;
            }
        } else if (navigationRoute != null) {
            LegWaypoint currentLegDestination = TripStatusEx.getCurrentLegDestination(tripStatus, navigationRoute);
            if (bannerInstructionEvent$LatestInstructionWrapper != null) {
                int i14 = read + 121;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                bannerInstructions = bannerInstructionEvent$LatestInstructionWrapper.latestBannerInstructions;
            } else {
                bannerInstructions = null;
            }
            i = 3;
            routeProgressFrom2 = NavigatorMapper.getRouteProgressFrom(navigationRoute, navigationStatus2, iIntValue, bannerInstructions, bannerInstructionEvent$LatestInstructionWrapper != null ? Integer.valueOf(bannerInstructionEvent$LatestInstructionWrapper.latestInstructionIndex) : null, mapboxTripSession.lastVoiceInstruction, updatedObjectsAhead, currentLegDestination);
            if (routeProgressFrom2 == null) {
                StringBuilder sb3 = new StringBuilder("route progress update dropped - currentPrimaryRoute ID: ");
                NavigationRoute navigationRoute3 = mapboxTripSession.primaryRoute;
                sb3.append(navigationRoute3 != null ? navigationRoute3.id : null);
                sb3.append("; currentState: ");
                sb3.append(navigationStatus.getRouteState());
                LoggerProviderKt.logD(sb3.toString(), "MapboxTripSession");
            }
        } else {
            i = 3;
            routeProgressFrom2 = null;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = mapboxTripSession.routeProgressObservers;
        mapboxTripSession.routeProgress = routeProgressFrom2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = mapboxTripSession.notificationJob;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        mapboxTripSession.notificationJob = BuildersKt.RemoteActionCompatParcelizer(mapboxTripSession.ioJobController.scope, null, null, new FlowLiveDataConversions$asFlow$1$1((Object) mapboxTripSession, (Object) routeProgressFrom2, (ShortNewsContentCardView) (objArr4 == true ? 1 : 0), 19), i);
        if (routeProgressFrom2 != null) {
            LoggerProviderKt.logD("dispatching progress update; state: " + routeProgressFrom2.currentState, "MapboxTripSession");
            if (!PerformanceTracker.getTrackingIsActive()) {
                int i16 = write + 49;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                Iterator it3 = copyOnWriteArraySet2.iterator();
                while (it3.hasNext()) {
                    BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new FlowLiveDataConversions$asFlow$1$1(it3.next(), (Object) routeProgressFrom2, (ShortNewsContentCardView) (objArr3 == true ? 1 : 0), 20), i);
                }
            } else {
                PerformanceTracker.syncSectionStarted("MapboxTripSession#updateRouteProgress-dispatch-route-progress-update");
                try {
                    long jWrite8 = BrazeInAppMessageManagerWhenMappings.write();
                    Iterator it4 = copyOnWriteArraySet2.iterator();
                    while (it4.hasNext()) {
                        BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new FlowLiveDataConversions$asFlow$1$1(it4.next(), (Object) routeProgressFrom2, (ShortNewsContentCardView) (objArr2 == true ? 1 : 0), 20), 3);
                    }
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateRouteProgress-dispatch-route-progress-update", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite8)));
                } catch (Throwable th8) {
                    PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateRouteProgress-dispatch-route-progress-update", null);
                    throw th8;
                }
            }
            if (zBooleanValue) {
                MapboxTripSession$onRawLocationUpdate$1 mapboxTripSession$onRawLocationUpdate$1 = new MapboxTripSession$onRawLocationUpdate$1(mapboxTripSession, 1);
                BannerInstructions bannerInstructions2 = (BannerInstructions) h$b.write;
                if (bannerInstructions2 != null) {
                    mapboxTripSession$onRawLocationUpdate$1.invoke(bannerInstructions2);
                }
            }
        }
        VoiceInstructions voiceInstructions = routeProgressFrom2 != null ? routeProgressFrom2.voiceInstructions : null;
        boolean z = navigationStatus.getVoiceInstruction() != null;
        if (voiceInstructions != null && z) {
            Iterator it5 = mapboxTripSession.voiceInstructionsObservers.iterator();
            while (it5.hasNext()) {
                ((ProducerCoroutine) ((la) it5.next()).RemoteActionCompatParcelizer).b_(voiceInstructions);
            }
            mapboxTripSession.lastVoiceInstruction = routeProgressFrom2.voiceInstructions;
        }
        RerouteInvocationHandler rerouteInvocationHandler = mapboxTripSession.rerouteInvocationHandler;
        if (rerouteInvocationHandler != null) {
            int i18 = rerouteInvocationHandler.repeatRerouteAfterOffRouteDelaySeconds;
            MapboxTripSession mapboxTripSession2 = rerouteInvocationHandler.tripSession;
            boolean z2 = mapboxTripSession2.isOffRoute;
            if (i18 == -1) {
                if (z2 != zzmm.access$isOffRoute(tripStatus) && (mapboxNavigation$$ExternalSyntheticLambda2 = mapboxTripSession2.offRouteObserverForReroute) != null) {
                    mapboxNavigation$$ExternalSyntheticLambda2.onOffRouteStateChanged(zzmm.access$isOffRoute(tripStatus));
                }
            } else if (!z2 && zzmm.access$isOffRoute(tripStatus)) {
                LoggerProviderKt.logI("Trigger off-route observer for re-route", "RerouteInvocationHandler");
                rerouteInvocationHandler.startTimeMark = BrazeInAppMessageManagerWhenMappings.write();
                MapboxNavigation$$ExternalSyntheticLambda2 mapboxNavigation$$ExternalSyntheticLambda3 = mapboxTripSession2.offRouteObserverForReroute;
                if (mapboxNavigation$$ExternalSyntheticLambda3 != null) {
                    mapboxNavigation$$ExternalSyntheticLambda3.onOffRouteStateChanged(true);
                }
            } else if (mapboxTripSession2.isOffRoute && zzmm.access$isOffRoute(tripStatus)) {
                int i19 = read + 117;
                write = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getGetTextLayoutResult state = rerouteInvocationHandler.rerouteController.getState();
                if (state instanceof RerouteState$FetchingRoute) {
                    LoggerProviderKt.logI("Re-route is in progress [" + state + ']', "RerouteInvocationHandler");
                    rerouteInvocationHandler.startTimeMark = BrazeInAppMessageManagerWhenMappings.write();
                } else {
                    long jSerializer = DefaultInAppMessageViewWrapper.serializer(rerouteInvocationHandler.startTimeMark);
                    unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                    if (BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jSerializer, UriKt.RemoteActionCompatParcelizer(i18, setUnregisteredInAppMessage.SECONDS)) >= 0) {
                        LoggerProviderKt.logI("Re-route not invoked [" + state + "]. Repeating off-route observer call for re-route", "RerouteInvocationHandler");
                        rerouteInvocationHandler.startTimeMark = BrazeInAppMessageManagerWhenMappings.write();
                        MapboxNavigation$$ExternalSyntheticLambda2 mapboxNavigation$$ExternalSyntheticLambda4 = mapboxTripSession2.offRouteObserverForReroute;
                        if (mapboxNavigation$$ExternalSyntheticLambda4 != null) {
                            int i21 = read + 73;
                            write = i21 % Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            mapboxNavigation$$ExternalSyntheticLambda4.onOffRouteStateChanged(true);
                        }
                    }
                }
            } else if (!mapboxTripSession2.isOffRoute) {
                rerouteInvocationHandler.startTimeMark = BrazeInAppMessageManagerWhenMappings.write();
            }
        }
        mapboxTripSession.setOffRoute(zzmm.access$isOffRoute(tripStatus));
    }
}
