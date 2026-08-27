package com.mapbox.navigation.core;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.LocationProvider;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.replay.MapboxReplayer;
import com.mapbox.navigation.core.routealternatives.RouteAlternativesController$pause$1;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$navigatorObserver$1;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$onRawLocationUpdate$1;
import com.mapbox.navigation.core.trip.session.TripSessionState;
import com.mapbox.navigation.core.trip.session.TripSessionStateObserver;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.base.location.LocationEngineAdapter$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.I$b;
import io.grpc.internal.MetadataApplierImpl;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.isAdapterPositionOnScreen;
import o.onBackCancelledlambda3;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$startSession$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxNavigation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigation$startSession$1(MapboxNavigation mapboxNavigation, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = mapboxNavigation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxNavigation mapboxNavigation = this.this$0;
        Object[] objArr = 0;
        if (i != 0) {
            if (i == 1) {
                return (MapboxReplayer) ((isAdapterPositionOnScreen) mapboxNavigation.tripSessionLocationEngine.write).MediaSessionCompatResultReceiverWrapper();
            }
            MapboxTripSession mapboxTripSession = mapboxNavigation.tripSession;
            RouteProgress routeProgress = mapboxTripSession.routeProgress;
            mapboxNavigation.latestLegIndex = routeProgress != null ? Integer.valueOf(routeProgress.currentLegProgress.legIndex) : null;
            MetadataApplierImpl metadataApplierImpl = mapboxNavigation.routeAlternativesController;
            metadataApplierImpl.getClass();
            metadataApplierImpl.updateNativeObserver(new RouteAlternativesController$pause$1(metadataApplierImpl, 0));
            ((I$b) mapboxNavigation.routeRefreshController.RemoteActionCompatParcelizer).pause();
            mapboxTripSession.stop();
            MapboxNativeNavigatorImpl navigator = mapboxNavigation.getNavigator();
            if (!navigator.warnIfShutdown("pause")) {
                navigator.getNavigator().pause();
            }
            return createfromparcel;
        }
        MapboxTripSession mapboxTripSession2 = mapboxNavigation.tripSession;
        TripSessionState tripSessionState = mapboxTripSession2.state;
        MapboxNativeNavigatorImpl navigator2 = mapboxNavigation.getNavigator();
        if (!navigator2.warnIfShutdown("resume")) {
            navigator2.getNavigator().resume();
        }
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = mapboxTripSession2.navigator;
        TripSessionState tripSessionState2 = mapboxTripSession2.state;
        TripSessionState tripSessionState3 = TripSessionState.STARTED;
        if (tripSessionState2 != tripSessionState3) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                LoggerProviderKt.logI("Start trip session, replay enabled: false", "MapboxTripSession");
            }
            MapboxTripSession$navigatorObserver$1 mapboxTripSession$navigatorObserver$1 = mapboxTripSession2.navigatorObserver;
            mapboxTripSession$navigatorObserver$1.getClass();
            if (!mapboxNativeNavigatorImpl.warnIfShutdown("addNavigatorObserver")) {
                mapboxNativeNavigatorImpl.currentNavigatorObservers.add(mapboxTripSession$navigatorObserver$1);
                mapboxNativeNavigatorImpl.getNavigator().addObserver(mapboxTripSession$navigatorObserver$1);
            }
            if (!mapboxNativeNavigatorImpl.warnIfShutdown("startNavigationSession")) {
                mapboxNativeNavigatorImpl.getNavigator().startNavigationSession();
            }
            if (mapboxTripSession2.state != tripSessionState3) {
                mapboxTripSession2.state = tripSessionState3;
                Iterator it = mapboxTripSession2.stateObservers.iterator();
                while (it.hasNext()) {
                    ((TripSessionStateObserver) it.next()).onSessionStateChanged(tripSessionState3);
                }
            }
            mapboxTripSession2.rawLocationJob = FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new RealImageLoader$execute$2$job$1(mapboxTripSession2, (ShortNewsContentCardView) null, 19), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mapboxTripSession2.rawLocationState)), mapboxTripSession2.mainJobController.scope);
        }
        DisplayCallbacksImpl displayCallbacksImpl = mapboxTripSession2.tripSessionLocationEngine;
        MapboxTripSession$onRawLocationUpdate$1 mapboxTripSession$onRawLocationUpdate$1 = mapboxTripSession2.onRawLocationUpdate;
        mapboxTripSession$onRawLocationUpdate$1.getClass();
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("starting location updates for location engine", "TripSessionLocationEngine");
        }
        displayCallbacksImpl.stopLocationUpdates();
        displayCallbacksImpl.IconCompatParcelizer = mapboxTripSession$onRawLocationUpdate$1;
        LocationProvider locationProvider = (LocationProvider) displayCallbacksImpl.MediaDescriptionCompat;
        displayCallbacksImpl.RatingCompat = locationProvider;
        if (locationProvider != null) {
            LocationEngineAdapter$$ExternalSyntheticLambda0 locationEngineAdapter$$ExternalSyntheticLambda0 = (LocationEngineAdapter$$ExternalSyntheticLambda0) displayCallbacksImpl.read;
            Looper looper = ((HandlerThread) displayCallbacksImpl.MediaMetadataCompat).getLooper();
            looper.getClass();
            locationProvider.addLocationObserver(locationEngineAdapter$$ExternalSyntheticLambda0, looper);
        }
        LocationProvider locationProvider2 = (LocationProvider) displayCallbacksImpl.RatingCompat;
        displayCallbacksImpl.MediaBrowserCompatMediaItem = locationProvider2 != null ? locationProvider2.getLastLocation((MapboxNavigation$$ExternalSyntheticLambda4) displayCallbacksImpl.serializer) : null;
        MetadataApplierImpl metadataApplierImpl2 = mapboxNavigation.routeAlternativesController;
        metadataApplierImpl2.getClass();
        metadataApplierImpl2.updateNativeObserver(new RouteAlternativesController$pause$1(metadataApplierImpl2, 2));
        ((I$b) mapboxNavigation.routeRefreshController.RemoteActionCompatParcelizer).resume(false);
        if (tripSessionState == TripSessionState.STOPPED) {
            BuildersKt.RemoteActionCompatParcelizer(mapboxNavigation.threadController.getMainScopeAndRootJob().scope, MainDispatcherLoader.read.IconCompatParcelizer(), null, new PerseusLogger$w$1((Object) mapboxNavigation, (ShortNewsContentCardView) (objArr == true ? 1 : 0), 7), 2);
        }
        Field field = mapboxNavigation.notificationChannelField;
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        obj.getClass();
        onBackCancelledlambda3 onbackcancelledlambda3 = (onBackCancelledlambda3) obj;
        ContextScope contextScope = mapboxNavigation.mainJobController.scope;
        FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$1 = new FlowLiveDataConversions$asFlow$1$1(mapboxNavigation, null, 15);
        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        cancelpendingwebviewpause.IconCompatParcelizer = true;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NetworkFetcher$doFetch$fetchResult$1(cancelpendingwebviewpause, flowLiveDataConversions$asFlow$1$1, onbackcancelledlambda3, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.utils.internal.ThreadControllerKt$monitorChannelWithException$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final /* bridge */ /* synthetic */ Object invoke() {
                return createFromParcel.INSTANCE;
            }
        }, null, 3), 3);
        return createfromparcel;
    }
}
