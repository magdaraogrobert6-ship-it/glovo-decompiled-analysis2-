package com.mapbox.navigation.core.trip.session;

import com.airbnb.lottie.parser.DropShadowEffect;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.core.MapboxNavigation$createInternalFallbackVersionsObserver$1;
import com.mapbox.navigation.core.reroute.NativeMapboxRerouteController;
import com.mapbox.navigation.core.trip.session.eh.EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.navigator.internal.NativeNavigatorRecreationObserver;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RoadObjectMatcher;
import com.mapbox.navigator.RoadObjectsStoreInterface;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.util.concurrent.CopyOnWriteArraySet;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxTripSession$$ExternalSyntheticLambda2 implements NativeNavigatorRecreationObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxTripSession$$ExternalSyntheticLambda2(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.navigation.navigator.internal.NativeNavigatorRecreationObserver
    public final void onNativeNavigatorRecreated() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            MapboxTripSession mapboxTripSession = (MapboxTripSession) obj;
            MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl = mapboxTripSession.navigator;
            if (!mapboxTripSession.fallbackVersionsObservers.isEmpty()) {
                MapboxNavigation$createInternalFallbackVersionsObserver$1 mapboxNavigation$createInternalFallbackVersionsObserver$1 = mapboxTripSession.nativeFallbackVersionsObserver;
                if (!mapboxNativeNavigatorImpl.warnIfShutdown("setFallbackVersionsObserver")) {
                    mapboxNativeNavigatorImpl.getNavigator().setFallbackVersionsObserver(mapboxNavigation$createInternalFallbackVersionsObserver$1);
                }
            }
            if (mapboxTripSession.state == TripSessionState.STARTED) {
                MapboxTripSession$navigatorObserver$1 mapboxTripSession$navigatorObserver$1 = mapboxTripSession.navigatorObserver;
                mapboxTripSession$navigatorObserver$1.getClass();
                if (mapboxNativeNavigatorImpl.warnIfShutdown("addNavigatorObserver")) {
                    return;
                }
                mapboxNativeNavigatorImpl.currentNavigatorObservers.add(mapboxTripSession$navigatorObserver$1);
                mapboxNativeNavigatorImpl.getNavigator().addObserver(mapboxTripSession$navigatorObserver$1);
                return;
            }
            return;
        }
        if (i == 1) {
            NativeMapboxRerouteController nativeMapboxRerouteController = (NativeMapboxRerouteController) obj;
            MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl2 = nativeMapboxRerouteController.rerouteInterface;
            if (nativeMapboxRerouteController.isEnabled) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("Navigator recreated - re-registering native reroute observer", "NativeMapboxRerouteController");
                }
                AnalyticsServiceImpl analyticsServiceImpl = nativeMapboxRerouteController.nativeRerouteObserver;
                mapboxNativeNavigatorImpl2.getClass();
                analyticsServiceImpl.getClass();
                if (!mapboxNativeNavigatorImpl2.warnIfShutdown("addRerouteObserver")) {
                    mapboxNativeNavigatorImpl2.getNavigator().addRerouteObserver(analyticsServiceImpl);
                }
            }
            nativeMapboxRerouteController.rerouteController = mapboxNativeNavigatorImpl2.warnIfShutdown("getRerouteController") ? null : mapboxNativeNavigatorImpl2.getNavigator().getRerouteController();
            nativeMapboxRerouteController.rerouteDetector = mapboxNativeNavigatorImpl2.warnIfShutdown("getRerouteDetector") ? null : mapboxNativeNavigatorImpl2.getNavigator().getRerouteDetector();
            return;
        }
        if (i != 2) {
            x xVar = (x) obj;
            if (((CopyOnWriteArraySet) xVar.RemoteActionCompatParcelizer).isEmpty()) {
                return;
            }
            RoadObjectMatcher roadObjectMatcher = ((MapboxNativeNavigatorImpl) xVar.read).roadObjectMatcher;
            if (roadObjectMatcher != null) {
                roadObjectMatcher.setListener((AnalyticsServiceImpl) xVar.IconCompatParcelizer);
                return;
            } else {
                removeNodeAtDepth.serializer("roadObjectMatcher");
                throw null;
            }
        }
        DropShadowEffect dropShadowEffect = (DropShadowEffect) obj;
        if (((CopyOnWriteArraySet) dropShadowEffect.write).isEmpty()) {
            return;
        }
        MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl3 = (MapboxNativeNavigatorImpl) dropShadowEffect.read;
        EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1 eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1 = (EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1) dropShadowEffect.serializer;
        if (!mapboxNativeNavigatorImpl3.warnIfShutdown("setElectronicHorizonObserver")) {
            mapboxNativeNavigatorImpl3.getNavigator().setElectronicHorizonObserver(eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1);
        }
        EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1 eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$2 = (EHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$1) dropShadowEffect.MediaDescriptionCompat;
        eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$2.getClass();
        if (mapboxNativeNavigatorImpl3.warnIfShutdown("addRoadObjectsStoreObserver")) {
            return;
        }
        RoadObjectsStoreInterface roadObjectsStoreInterface = mapboxNativeNavigatorImpl3.roadObjectsStore;
        if (roadObjectsStoreInterface != null) {
            roadObjectsStoreInterface.addObserver(eHorizonSubscriptionManagerImpl$roadObjectsStoreObserver$2);
        } else {
            removeNodeAtDepth.serializer("roadObjectsStore");
            throw null;
        }
    }
}
