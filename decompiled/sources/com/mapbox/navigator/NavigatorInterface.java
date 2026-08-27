package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.Cancelable;
import com.mapbox.common.TileStore;
import com.mapbox.common.TilesetDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface NavigatorInterface {
    void addObserver(NavigatorObserver navigatorObserver);

    void addRerouteObserver(RerouteObserver rerouteObserver);

    void addRouteRefreshObserver(RouteRefreshObserver routeRefreshObserver);

    void changeLeg(int i, ChangeLegCallback changeLegCallback);

    ConfigHandleInterface config();

    PredictiveCacheControllerInterface createPredictiveCacheController(TileStore tileStore, PredictiveCacheControllerOptions predictiveCacheControllerOptions, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    PredictiveCacheControllerInterface createPredictiveCacheController(TileStore tileStore, List<TilesetDescriptor> list, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    PredictiveCacheControllerInterface createPredictiveCacheController(PredictiveCacheControllerOptions predictiveCacheControllerOptions, PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    @Deprecated
    PredictiveCacheControllerInterface createPredictiveCacheController(PredictiveLocationTrackerOptions predictiveLocationTrackerOptions);

    List<RouteAlternative> getAlternativeRoutes();

    Experimental getExperimental();

    LaneGraphAccessor getHDLaneGraphAccessor();

    RouteGeometrySmoother getHDRouteGeometrySmoother();

    @MapboxExperimental
    Cancelable getHDRouteLaneGuidancesForBBox(BoundingBox boundingBox, String str, GetHDRouteLaneGuidancesCallback getHDRouteLaneGuidancesCallback);

    RouteObjectMatcher getHDRouteObjectMatcher();

    InputsServiceHandle getInputsService();

    NavigationStatus getNavigationStatus();

    RouteInterface getPrimaryRoute();

    RerouteControllerInterface getRerouteController();

    RerouteDetectorInterface getRerouteDetector();

    RouteAlternativesControllerInterface getRouteAlternativesController();

    RouterInterface getRouter();

    Telemetry getTelemetry(EventsMetadataInterface eventsMetadataInterface);

    @MapboxExperimental
    @Deprecated
    VoiceInstructionsRetriever getVoiceInstructionsRetriever();

    @MapboxExperimental
    void getVoiceInstructionsRetriever(VoiceInstructionsRetrieverCallback voiceInstructionsRetrieverCallback);

    void onEvDataUpdated(EvStateData evStateData);

    void pause();

    @Deprecated
    void refreshRoute(DataRef dataRef, String str, int i, RefreshRouteCallback refreshRouteCallback);

    @Deprecated
    void refreshRoute(String str, String str2, int i, RefreshRouteCallback refreshRouteCallback);

    void removeObserver(NavigatorObserver navigatorObserver);

    void removeRerouteObserver(RerouteObserver rerouteObserver);

    void removeRouteRefreshObserver(RouteRefreshObserver routeRefreshObserver);

    void reset(ResetCallback resetCallback);

    void restoreNavigationSession(NavigationSessionState navigationSessionState);

    void resume();

    RoadObjectsStoreInterface roadObjectsStore();

    void setAlternativeRoutes(List<RouteInterface> list, SetAlternativeRoutesCallback setAlternativeRoutesCallback);

    void setElectronicHorizonObserver(ElectronicHorizonObserver electronicHorizonObserver);

    void setFallbackVersionsObserver(FallbackVersionsObserver fallbackVersionsObserver);

    @Deprecated
    void setRerouteController(RerouteControllerInterface rerouteControllerInterface);

    void setRoutes(SetRoutesParams setRoutesParams, SetRoutesReason setRoutesReason, SetRouteCallback setRouteCallback);

    void setRoutesData(SetRoutesDataParams setRoutesDataParams, SetRoutesReason setRoutesReason, SetRouteCallback setRouteCallback);

    void shutdown();

    void startCharging();

    void startNavigationSession();

    void startRoutesRefresh(long j, boolean z);

    ChargingState stateOfCharging();

    void stopCharging(ChangeLegCallback changeLegCallback);

    void stopNavigationSession();

    void stopRoutesRefresh();

    NavigationSessionState storeNavigationSession();

    void updateLocation(FixLocation fixLocation, UpdateLocationCallback updateLocationCallback);

    String version();
}
