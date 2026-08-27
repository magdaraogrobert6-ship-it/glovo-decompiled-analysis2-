package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.common.TileStore;
import com.mapbox.common.TilesetDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Navigator implements NavigatorInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class NavigatorPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Navigator.cleanNativePeer(this.peer);
        }

        public NavigatorPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle);

    private native void initialize(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType);

    private native void initialize(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle);

    private native void initialize(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle, AdasisFacadeHandle adasisFacadeHandle);

    private native void initialize(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle, AdasisFacadeHandle adasisFacadeHandle, CacheHandle cacheHandle2);

    private native void initialize(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle);

    private native void initialize(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType);

    private native void initialize(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle);

    private native void initialize(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle, AdasisFacadeHandle adasisFacadeHandle);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void addObserver(NavigatorObserver navigatorObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void addRerouteObserver(RerouteObserver rerouteObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void addRouteRefreshObserver(RouteRefreshObserver routeRefreshObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void changeLeg(int i, ChangeLegCallback changeLegCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native ConfigHandle config();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native PredictiveCacheController createPredictiveCacheController(TileStore tileStore, PredictiveCacheControllerOptions predictiveCacheControllerOptions, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native PredictiveCacheController createPredictiveCacheController(TileStore tileStore, List<TilesetDescriptor> list, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native PredictiveCacheController createPredictiveCacheController(PredictiveCacheControllerOptions predictiveCacheControllerOptions, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    @Override // com.mapbox.navigator.NavigatorInterface
    @Deprecated
    public native PredictiveCacheController createPredictiveCacheController(PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native List<RouteAlternative> getAlternativeRoutes();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native Experimental getExperimental();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native LaneGraphAccessor getHDLaneGraphAccessor();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RouteGeometrySmoother getHDRouteGeometrySmoother();

    @Override // com.mapbox.navigator.NavigatorInterface
    @MapboxExperimental
    public native Cancelable getHDRouteLaneGuidancesForBBox(BoundingBox boundingBox, String str, GetHDRouteLaneGuidancesCallback getHDRouteLaneGuidancesCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RouteObjectMatcher getHDRouteObjectMatcher();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native InputsServiceHandle getInputsService();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native NavigationStatus getNavigationStatus();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RouteInterface getPrimaryRoute();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RerouteControllerInterface getRerouteController();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RerouteDetectorInterface getRerouteDetector();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RouteAlternativesControllerInterface getRouteAlternativesController();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RouterInterface getRouter();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native Telemetry getTelemetry(EventsMetadataInterface eventsMetadataInterface);

    @Override // com.mapbox.navigator.NavigatorInterface
    @MapboxExperimental
    @Deprecated
    public native VoiceInstructionsRetriever getVoiceInstructionsRetriever();

    @Override // com.mapbox.navigator.NavigatorInterface
    @MapboxExperimental
    public native void getVoiceInstructionsRetriever(VoiceInstructionsRetrieverCallback voiceInstructionsRetrieverCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void onEvDataUpdated(EvStateData evStateData);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void pause();

    @Override // com.mapbox.navigator.NavigatorInterface
    @Deprecated
    public native void refreshRoute(DataRef dataRef, String str, int i, RefreshRouteCallback refreshRouteCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    @Deprecated
    public native void refreshRoute(String str, String str2, int i, RefreshRouteCallback refreshRouteCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void removeObserver(NavigatorObserver navigatorObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void removeRerouteObserver(RerouteObserver rerouteObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void removeRouteRefreshObserver(RouteRefreshObserver routeRefreshObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void reset(ResetCallback resetCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void restoreNavigationSession(NavigationSessionState navigationSessionState);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void resume();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native RoadObjectsStore roadObjectsStore();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void setAlternativeRoutes(List<RouteInterface> list, SetAlternativeRoutesCallback setAlternativeRoutesCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void setElectronicHorizonObserver(ElectronicHorizonObserver electronicHorizonObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void setFallbackVersionsObserver(FallbackVersionsObserver fallbackVersionsObserver);

    @Override // com.mapbox.navigator.NavigatorInterface
    @Deprecated
    public native void setRerouteController(RerouteControllerInterface rerouteControllerInterface);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void setRoutes(SetRoutesParams setRoutesParams, SetRoutesReason setRoutesReason, SetRouteCallback setRouteCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void setRoutesData(SetRoutesDataParams setRoutesDataParams, SetRoutesReason setRoutesReason, SetRouteCallback setRouteCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void shutdown();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void startCharging();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void startNavigationSession();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void startRoutesRefresh(long j, boolean z);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native ChargingState stateOfCharging();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void stopCharging(ChangeLegCallback changeLegCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void stopNavigationSession();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void stopRoutesRefresh();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native NavigationSessionState storeNavigationSession();

    @Override // com.mapbox.navigator.NavigatorInterface
    public native void updateLocation(FixLocation fixLocation, UpdateLocationCallback updateLocationCallback);

    @Override // com.mapbox.navigator.NavigatorInterface
    public native String version();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    @Deprecated
    public Navigator(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle) {
        initialize(configHandle, cacheHandle, historyRecorderHandle);
    }

    @Override // com.mapbox.navigator.NavigatorInterface
    public /* bridge */ /* synthetic */ PredictiveCacheControllerInterface createPredictiveCacheController(TileStore tileStore, List list, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions) {
        return createPredictiveCacheController(tileStore, (List<TilesetDescriptor>) list, predictiveLocationTrackerOptions);
    }

    @Deprecated
    public Navigator(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType) {
        initialize(configHandle, cacheHandle, historyRecorderHandle, routerType);
    }

    @Deprecated
    public Navigator(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle) {
        initialize(configHandle, cacheHandle, historyRecorderHandle, routerType, inputsServiceHandle);
    }

    @Deprecated
    public Navigator(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle, AdasisFacadeHandle adasisFacadeHandle) {
        initialize(configHandle, cacheHandle, historyRecorderHandle, routerType, inputsServiceHandle, adasisFacadeHandle);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new NavigatorPeerCleaner(j));
    }

    @Deprecated
    public Navigator(ConfigHandle configHandle, CacheHandle cacheHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle, AdasisFacadeHandle adasisFacadeHandle, CacheHandle cacheHandle2) {
        initialize(configHandle, cacheHandle, historyRecorderHandle, routerType, inputsServiceHandle, adasisFacadeHandle, cacheHandle2);
    }

    public Navigator(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle) {
        initialize(configHandle, tilesManagerHandle, historyRecorderHandle);
    }

    public Navigator(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType) {
        initialize(configHandle, tilesManagerHandle, historyRecorderHandle, routerType);
    }

    public Navigator(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle) {
        initialize(configHandle, tilesManagerHandle, historyRecorderHandle, routerType, inputsServiceHandle);
    }

    public Navigator(ConfigHandle configHandle, TilesManagerHandle tilesManagerHandle, HistoryRecorderHandle historyRecorderHandle, RouterType routerType, InputsServiceHandle inputsServiceHandle, AdasisFacadeHandle adasisFacadeHandle) {
        initialize(configHandle, tilesManagerHandle, historyRecorderHandle, routerType, inputsServiceHandle, adasisFacadeHandle);
    }

    public Navigator(long j) {
        setPeer(j);
    }
}
