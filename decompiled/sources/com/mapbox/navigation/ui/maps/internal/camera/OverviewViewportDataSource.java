package com.mapbox.navigation.ui.maps.internal.camera;

import com.airbnb.lottie.PerformanceTracker;
import com.google.re2j.Parser;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.ui.maps.camera.data.FollowingFrameOptions;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.mapbox.navigation.ui.maps.camera.data.ViewportProperty$ZoomProperty;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.util.HashMap;
import java.util.List;
import o.instance_delegatelambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class OverviewViewportDataSource {
    public final boolean active;
    public final instance_delegatelambda0 additionalPointsToFrame;
    public final ViewportProperty$ZoomProperty bearingProperty;
    public HashMap cachedRemainingPoints;
    public final ViewportProperty$ZoomProperty centerProperty;
    public final PerformanceTracker indicesConverter;
    public final InternalViewportDataSourceOptions internalOptions;
    public final MapboxMap mapboxMap;
    public List navigationRoutes;
    public final Parser.Pair options;
    public EdgeInsets padding;
    public final ViewportProperty$ZoomProperty pitchProperty;
    public List simplifiedCompleteRoutesPoints;
    public List simplifiedRemainingPointsOnRoutes;
    public Location targetLocation;
    public CameraOptions viewportData;
    public final ViewportProperty$ZoomProperty zoomProperty;

    public OverviewViewportDataSource(MapboxMap mapboxMap, InternalViewportDataSourceOptions internalViewportDataSourceOptions) {
        boolean z = false;
        PerformanceTracker performanceTracker = new PerformanceTracker(5, z);
        performanceTracker.IconCompatParcelizer = new HashMap();
        this.mapboxMap = mapboxMap;
        this.indicesConverter = performanceTracker;
        this.internalOptions = internalViewportDataSourceOptions;
        Parser.Pair pair = new Parser.Pair(7, z);
        pair.RemoteActionCompatParcelizer = new FollowingFrameOptions();
        pair.write = new AnalyticsServiceImpl(18);
        this.options = pair;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.navigationRoutes = instance_delegatelambda0Var;
        this.simplifiedCompleteRoutesPoints = instance_delegatelambda0Var;
        this.simplifiedRemainingPointsOnRoutes = instance_delegatelambda0Var;
        this.cachedRemainingPoints = new HashMap();
        Point point = MapboxNavigationViewportDataSource.NULL_ISLAND_POINT;
        point.getClass();
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty = new ViewportProperty$ZoomProperty(4, point);
        this.centerProperty = viewportProperty$ZoomProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty2 = new ViewportProperty$ZoomProperty(16.35d, 0);
        this.zoomProperty = viewportProperty$ZoomProperty2;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty3 = new ViewportProperty$ZoomProperty();
        this.bearingProperty = viewportProperty$ZoomProperty3;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty4 = new ViewportProperty$ZoomProperty(0.0d, 4);
        this.pitchProperty = viewportProperty$ZoomProperty4;
        this.padding = MapboxNavigationViewportDataSource.EMPTY_EDGE_INSETS;
        this.additionalPointsToFrame = instance_delegatelambda0Var;
        this.active = true;
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().center((Point) viewportProperty$ZoomProperty.RatingCompat).zoom((Double) viewportProperty$ZoomProperty2.RatingCompat).bearing((Double) viewportProperty$ZoomProperty3.RatingCompat).pitch((Double) viewportProperty$ZoomProperty4.RatingCompat).padding(this.padding).build();
        cameraOptionsBuild.getClass();
        this.viewportData = cameraOptionsBuild;
    }

    public final void runIfActive(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this.active) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
    }
}
