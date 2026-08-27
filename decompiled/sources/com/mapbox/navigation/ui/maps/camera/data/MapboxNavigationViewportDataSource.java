package com.mapbox.navigation.ui.maps.camera.data;

import androidx.collection.ObjectList$toString$1;
import androidx.sqlite.SQLite;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzkx;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.google.re2j.Parser;
import com.huawei.location.tiles.utils.LW;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsRouteFBWrapper;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.api.directions.v5.models.utils.FlatbuffersListWrapper;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.mapbox.directions.generated.route_request.Route;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxMapException;
import com.mapbox.maps.ScreenBox;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Size;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.ui.maps.camera.NavigationCamera$$ExternalSyntheticLambda0;
import com.mapbox.navigation.ui.maps.internal.camera.InternalViewportDataSourceOptions;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewMode;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewViewportDataSource;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewViewportDataSource$updateDebugger$1;
import com.mapbox.navigation.ui.maps.util.MapSizeInitializedCallbackHelper$CancellableImpl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.turf.TurfException;
import com.mapbox.turf.TurfMisc;
import com.sentiance.core.model.thrift.E1$b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.accessgetInstancedelegatecp;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.setOptionalCardImage;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationViewportDataSource {
    public final instance_delegatelambda0 additionalPointsToFrameForFollowing;
    public EdgeInsets appliedFollowingPadding;
    public List averageIntersectionDistancesOnRoute;
    public final ViewportProperty$ZoomProperty followingBearingProperty;
    public final ViewportProperty$ZoomProperty followingCenterProperty;
    public EdgeInsets followingPadding;
    public final ViewportProperty$ZoomProperty followingPitchProperty;
    public final ViewportProperty$ZoomProperty followingZoomProperty;
    public final ViewportProperty$ZoomProperty isFramingManeuverProperty;
    public final AnalyticsServiceImpl mapSizeReadyCallbackHelper;
    public final MapboxMap mapboxMap;
    public MapSizeInitializedCallbackHelper$CancellableImpl mapsSizeReadyCancellable;
    public List navigationRoutes;
    public final Parser.Pair options;
    public final OverviewViewportDataSource overviewViewportDataSource;
    public List pointsToFrameAfterCurrentStep;
    public List pointsToFrameOnCurrentStep;
    public List postManeuverFramingPoints;
    public Location targetLocation;
    public ViewportData viewportData;
    public final CopyOnWriteArraySet viewportDataSourceUpdateObservers;
    public static final Point NULL_ISLAND_POINT = Point.fromLngLat(0.0d, 0.0d);
    public static final EdgeInsets EMPTY_EDGE_INSETS = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);

    public final Parser.Pair getOptions() {
        return this.options;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0294  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0294, please report this as an issue */
    public static final void access$evaluateImpl(MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource) {
        double d;
        Double dValueOf;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty2;
        Parser.Pair pair;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty3;
        EdgeInsets edgeInsets;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty4;
        CameraOptions cameraOptionsBuild;
        OverviewViewportDataSource overviewViewportDataSource;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty5;
        OverviewViewportDataSource overviewViewportDataSource2 = mapboxNavigationViewportDataSource.overviewViewportDataSource;
        MapboxMap mapboxMap = mapboxNavigationViewportDataSource.mapboxMap;
        CameraState cameraState = mapboxMap.getCameraState();
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty6 = mapboxNavigationViewportDataSource.followingZoomProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty7 = mapboxNavigationViewportDataSource.followingCenterProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty8 = mapboxNavigationViewportDataSource.followingBearingProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty9 = mapboxNavigationViewportDataSource.isFramingManeuverProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty10 = mapboxNavigationViewportDataSource.followingPitchProperty;
        Parser.Pair pair2 = mapboxNavigationViewportDataSource.options;
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) mapboxNavigationViewportDataSource.pointsToFrameOnCurrentStep);
        Location location = mapboxNavigationViewportDataSource.targetLocation;
        if (location != null) {
            Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
            pointFromLngLat.getClass();
            arrayListIconCompatParcelizer.add(0, pointFromLngLat);
        }
        arrayListIconCompatParcelizer.addAll(mapboxNavigationViewportDataSource.additionalPointsToFrameForFollowing);
        double d2 = 0.0d;
        if (((Boolean) viewportProperty$ZoomProperty9.RatingCompat).booleanValue()) {
            d = 0.0d;
        } else {
            ((FollowingFrameOptions) pair2.RemoteActionCompatParcelizer).getClass();
            d = 45.0d;
        }
        viewportProperty$ZoomProperty10.RatingCompat = Double.valueOf(d);
        if (arrayListIconCompatParcelizer.isEmpty()) {
            FollowingFrameOptions followingFrameOptions = (FollowingFrameOptions) pair2.RemoteActionCompatParcelizer;
            viewportProperty$ZoomProperty8.RatingCompat = Double.valueOf(cameraState.getBearing());
            followingFrameOptions.getClass();
            viewportProperty$ZoomProperty10.RatingCompat = Double.valueOf(45.0d);
            Point center = cameraState.getCenter();
            center.getClass();
            viewportProperty$ZoomProperty7.RatingCompat = center;
            viewportProperty$ZoomProperty6.RatingCompat = Double.valueOf(Math.max(Math.min(cameraState.getZoom(), followingFrameOptions.maxZoom), followingFrameOptions.minZoom));
            viewportProperty$ZoomProperty5 = viewportProperty$ZoomProperty6;
            viewportProperty$ZoomProperty4 = viewportProperty$ZoomProperty10;
            pair = pair2;
            overviewViewportDataSource = overviewViewportDataSource2;
        } else {
            FollowingFrameOptions followingFrameOptions2 = (FollowingFrameOptions) pair2.RemoteActionCompatParcelizer;
            MapboxFollowingCameraFramingStrategy mapboxFollowingCameraFramingStrategy = followingFrameOptions2.bearingSmoothing;
            if (location == null || (dValueOf = location.getBearing()) == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            double dDoubleValue = dValueOf.doubleValue();
            mapboxFollowingCameraFramingStrategy.getClass();
            double bearing = cameraState.getBearing();
            if (arrayListIconCompatParcelizer.size() > 1) {
                double dBearing = TuplesKt.bearing((Point) onContentCardDismissed.read((List) arrayListIconCompatParcelizer), (Point) onContentCardDismissed.MediaDescriptionCompat((List) arrayListIconCompatParcelizer));
                double d3 = (Double.isNaN(dBearing) || Double.isNaN(dDoubleValue)) ? 0.0d : (((((dBearing - dDoubleValue) + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
                if (Math.abs(d3) > 45.0d) {
                    dDoubleValue = ((d3 < 0.0d ? -1.0d : 1.0d) * 45.0d) + dDoubleValue;
                } else {
                    dDoubleValue = dBearing;
                }
            }
            if (!Double.isNaN(dDoubleValue) && !Double.isNaN(bearing)) {
                d2 = (((((dDoubleValue - bearing) + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
            }
            viewportProperty$ZoomProperty8.RatingCompat = Double.valueOf(d2 + bearing);
            followingFrameOptions2.frameGeometryAfterManeuver.getClass();
            if (((Boolean) viewportProperty$ZoomProperty9.RatingCompat).booleanValue()) {
                arrayListIconCompatParcelizer.addAll(mapboxNavigationViewportDataSource.pointsToFrameAfterCurrentStep);
            }
            if (arrayListIconCompatParcelizer.size() > 1 && followingFrameOptions2.maximizeViewableGeometryWhenPitchZero && ((Boolean) viewportProperty$ZoomProperty9.RatingCompat).booleanValue()) {
                MapboxMap mapboxMap2 = mapboxNavigationViewportDataSource.mapboxMap;
                CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().padding(mapboxNavigationViewportDataSource.followingPadding).bearing((Double) viewportProperty$ZoomProperty8.RatingCompat).pitch((Double) viewportProperty$ZoomProperty10.RatingCompat).build();
                cameraOptionsBuild2.getClass();
                cameraOptionsBuild = mapboxMap2.cameraForCoordinates(arrayListIconCompatParcelizer, cameraOptionsBuild2, null, null, null);
                viewportProperty$ZoomProperty2 = viewportProperty$ZoomProperty6;
                viewportProperty$ZoomProperty = viewportProperty$ZoomProperty7;
                viewportProperty$ZoomProperty3 = viewportProperty$ZoomProperty9;
                viewportProperty$ZoomProperty4 = viewportProperty$ZoomProperty10;
                pair = pair2;
            } else {
                Size size = mapboxMap.getSize();
                EdgeInsets edgeInsets2 = mapboxNavigationViewportDataSource.followingPadding;
                size.getClass();
                edgeInsets2.getClass();
                viewportProperty$ZoomProperty = viewportProperty$ZoomProperty7;
                viewportProperty$ZoomProperty2 = viewportProperty$ZoomProperty6;
                pair = pair2;
                viewportProperty$ZoomProperty3 = viewportProperty$ZoomProperty9;
                ScreenBox screenBox = new ScreenBox(new ScreenCoordinate(edgeInsets2.getLeft(), edgeInsets2.getTop()), new ScreenCoordinate(((double) size.getWidth()) - edgeInsets2.getRight(), ((double) size.getHeight()) - edgeInsets2.getBottom()));
                EdgeInsets edgeInsets3 = mapboxNavigationViewportDataSource.followingPadding;
                FollowingFrameOptions.FocalPoint focalPoint = followingFrameOptions2.focalPoint;
                edgeInsets3.getClass();
                focalPoint.getClass();
                float height = size.getHeight();
                float width = size.getWidth();
                float top = (float) edgeInsets3.getTop();
                if (top < 0.0f || top > height) {
                    EdgeInsets edgeInsets4 = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
                    LoggerProviderKt.logE(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                        |Provided following padding does not fit the map size:\n                        |mapSize: " + size + "\n                        |padding: " + edgeInsets3 + "\n                        |Using an empty fallback padding instead: " + edgeInsets3 + "\n                    "), "ViewportDataSourceProcessor");
                    edgeInsets = edgeInsets4;
                } else {
                    float bottom = (float) edgeInsets3.getBottom();
                    if (bottom < 0.0f || bottom > height) {
                        EdgeInsets edgeInsets5 = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
                        LoggerProviderKt.logE(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                        |Provided following padding does not fit the map size:\n                        |mapSize: " + size + "\n                        |padding: " + edgeInsets3 + "\n                        |Using an empty fallback padding instead: " + edgeInsets3 + "\n                    "), "ViewportDataSourceProcessor");
                        edgeInsets = edgeInsets5;
                    } else {
                        float left = (float) edgeInsets3.getLeft();
                        if (left < 0.0f || left > width) {
                            EdgeInsets edgeInsets6 = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
                            LoggerProviderKt.logE(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                        |Provided following padding does not fit the map size:\n                        |mapSize: " + size + "\n                        |padding: " + edgeInsets3 + "\n                        |Using an empty fallback padding instead: " + edgeInsets3 + "\n                    "), "ViewportDataSourceProcessor");
                            edgeInsets = edgeInsets6;
                        } else {
                            float right = (float) edgeInsets3.getRight();
                            if (right < 0.0f || right > width) {
                                EdgeInsets edgeInsets7 = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
                                LoggerProviderKt.logE(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                        |Provided following padding does not fit the map size:\n                        |mapSize: " + size + "\n                        |padding: " + edgeInsets3 + "\n                        |Using an empty fallback padding instead: " + edgeInsets3 + "\n                    "), "ViewportDataSourceProcessor");
                                edgeInsets = edgeInsets7;
                            } else {
                                if (edgeInsets3.getBottom() + edgeInsets3.getTop() <= size.getHeight()) {
                                    if (edgeInsets3.getRight() + edgeInsets3.getLeft() > size.getWidth()) {
                                        EdgeInsets edgeInsets8 = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
                                        LoggerProviderKt.logE(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                        |Provided following padding does not fit the map size:\n                        |mapSize: " + size + "\n                        |padding: " + edgeInsets3 + "\n                        |Using an empty fallback padding instead: " + edgeInsets3 + "\n                    "), "ViewportDataSourceProcessor");
                                        edgeInsets = edgeInsets8;
                                    } else {
                                        double left2 = edgeInsets3.getLeft() + (((((double) size.getWidth()) - edgeInsets3.getLeft()) - edgeInsets3.getRight()) * 0.5d);
                                        double top2 = edgeInsets3.getTop() + (((((double) size.getHeight()) - edgeInsets3.getTop()) - edgeInsets3.getBottom()) * 1.0d);
                                        edgeInsets = new EdgeInsets(top2, left2, ((double) size.getHeight()) - top2, ((double) size.getWidth()) - left2);
                                    }
                                } else {
                                    EdgeInsets edgeInsets9 = new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d);
                                    LoggerProviderKt.logE(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                        |Provided following padding does not fit the map size:\n                        |mapSize: " + size + "\n                        |padding: " + edgeInsets3 + "\n                        |Using an empty fallback padding instead: " + edgeInsets3 + "\n                    "), "ViewportDataSourceProcessor");
                                    edgeInsets = edgeInsets9;
                                }
                            }
                        }
                    }
                }
                CameraOptions.Builder builder = new CameraOptions.Builder();
                Point center2 = (Point) onContentCardDismissed.MediaMetadataCompat((List) arrayListIconCompatParcelizer);
                if (center2 == null) {
                    center2 = cameraState.getCenter();
                    center2.getClass();
                }
                CameraOptions.Builder builderBearing = builder.center(center2).padding(edgeInsets).bearing((Double) viewportProperty$ZoomProperty8.RatingCompat);
                viewportProperty$ZoomProperty4 = viewportProperty$ZoomProperty10;
                cameraOptionsBuild = builderBearing.pitch((Double) viewportProperty$ZoomProperty4.RatingCompat).zoom(Double.valueOf(followingFrameOptions2.maxZoom)).build();
                if (arrayListIconCompatParcelizer.size() > 1) {
                    cameraOptionsBuild.getClass();
                    try {
                        cameraOptionsBuild = mapboxMap.cameraForCoordinates(arrayListIconCompatParcelizer, cameraOptionsBuild, screenBox);
                    } catch (MapboxMapException e) {
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                            LoggerProviderKt.logE("safeCameraForCoordinates exception: " + e.getCause() + '\n' + e.getMessage() + '\n' + e.getStackTrace(), null);
                        }
                        cameraOptionsBuild = ExtensionUtils.toCameraOptions$default(mapboxMap.getCameraState(), null, 1, null);
                    }
                }
            }
            cameraOptionsBuild.getClass();
            if (CameraOptionsUtils.isEmpty(cameraOptionsBuild)) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                    LoggerProviderKt.logW("CameraOptions is empty", "MapboxNavigationViewportDataSource");
                }
                viewportProperty$ZoomProperty7 = viewportProperty$ZoomProperty;
                overviewViewportDataSource = overviewViewportDataSource2;
                viewportProperty$ZoomProperty5 = viewportProperty$ZoomProperty2;
            } else {
                Point center3 = cameraOptionsBuild.getCenter();
                center3.getClass();
                viewportProperty$ZoomProperty7 = viewportProperty$ZoomProperty;
                viewportProperty$ZoomProperty7.RatingCompat = center3;
                if (((Boolean) viewportProperty$ZoomProperty3.RatingCompat).booleanValue()) {
                    overviewViewportDataSource = overviewViewportDataSource2;
                    overviewViewportDataSource.internalOptions.getClass();
                } else {
                    overviewViewportDataSource = overviewViewportDataSource2;
                }
                Double zoom = cameraOptionsBuild.getZoom();
                zoom.getClass();
                Double dValueOf2 = Double.valueOf(Math.max(Math.min(zoom.doubleValue(), followingFrameOptions2.maxZoom), followingFrameOptions2.minZoom));
                viewportProperty$ZoomProperty5 = viewportProperty$ZoomProperty2;
                viewportProperty$ZoomProperty5.RatingCompat = dValueOf2;
                mapboxNavigationViewportDataSource.appliedFollowingPadding = cameraOptionsBuild.getPadding();
            }
        }
        overviewViewportDataSource.runIfActive(new LayerUtils$getLayer$source$2(overviewViewportDataSource, 12, overviewViewportDataSource.mapboxMap.getCameraState()));
        FollowingFrameOptions followingFrameOptions3 = (FollowingFrameOptions) pair.RemoteActionCompatParcelizer;
        CameraOptions.Builder builder2 = new CameraOptions.Builder();
        if (followingFrameOptions3.centerUpdatesAllowed) {
            builder2.center((Point) viewportProperty$ZoomProperty7.RatingCompat);
        }
        if (followingFrameOptions3.zoomUpdatesAllowed) {
            builder2.zoom((Double) viewportProperty$ZoomProperty5.RatingCompat);
        }
        if (followingFrameOptions3.bearingUpdatesAllowed) {
            builder2.bearing((Double) viewportProperty$ZoomProperty8.RatingCompat);
        }
        if (followingFrameOptions3.pitchUpdatesAllowed) {
            builder2.pitch((Double) viewportProperty$ZoomProperty4.RatingCompat);
        }
        if (followingFrameOptions3.paddingUpdatesAllowed) {
            builder2.padding(mapboxNavigationViewportDataSource.appliedFollowingPadding);
        }
        CameraOptions cameraOptionsBuild3 = builder2.build();
        cameraOptionsBuild3.getClass();
        CameraOptions cameraOptions = overviewViewportDataSource.viewportData;
        ViewportData viewportData = new ViewportData(cameraOptionsBuild3, cameraOptions);
        ViewportData viewportData2 = mapboxNavigationViewportDataSource.viewportData;
        viewportData2.getClass();
        if (LW.isStandstill(cameraOptionsBuild3, viewportData2.cameraForFollowing) && LW.isStandstill(cameraOptions, viewportData2.cameraForOverview)) {
            return;
        }
        mapboxNavigationViewportDataSource.viewportData = viewportData;
        Iterator it = mapboxNavigationViewportDataSource.viewportDataSourceUpdateObservers.iterator();
        while (it.hasNext()) {
            ((NavigationCamera$$ExternalSyntheticLambda0) it.next()).viewportDataSourceUpdated(viewportData);
        }
    }

    public final void clearProgressData() {
        ((FollowingFrameOptions) this.options.RemoteActionCompatParcelizer).getClass();
        this.followingPitchProperty.RatingCompat = Double.valueOf(45.0d);
        this.isFramingManeuverProperty.RatingCompat = Boolean.FALSE;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.pointsToFrameOnCurrentStep = instance_delegatelambda0Var;
        this.pointsToFrameAfterCurrentStep = instance_delegatelambda0Var;
        OverviewViewportDataSource overviewViewportDataSource = this.overviewViewportDataSource;
        overviewViewportDataSource.getClass();
        overviewViewportDataSource.cachedRemainingPoints = new HashMap();
        overviewViewportDataSource.runIfActive(new OverviewViewportDataSource$updateDebugger$1(overviewViewportDataSource, 1));
    }

    public final void onRoutesChanged$ui_maps_release(List list) {
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        if (!PerformanceTracker.getTrackingIsActive()) {
            if (list.isEmpty()) {
                clearRouteData();
                return;
            } else {
                if (zzmb.areSameRoutes(list, this.navigationRoutes)) {
                    return;
                }
                clearRouteData();
                this.navigationRoutes = list;
                calculateRouteData(list);
                return;
            }
        }
        PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#onRoutesChanged");
        try {
            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
            if (list.isEmpty()) {
                clearRouteData();
            } else if (!zzmb.areSameRoutes(list, this.navigationRoutes)) {
                clearRouteData();
                this.navigationRoutes = list;
                calculateRouteData(list);
            }
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRoutesChanged", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
        } catch (Throwable th) {
            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#onRoutesChanged", null);
            throw th;
        }
    }

    public MapboxNavigationViewportDataSource(MapboxMap mapboxMap) {
        OverviewViewportDataSource overviewViewportDataSource = new OverviewViewportDataSource(mapboxMap, new InternalViewportDataSourceOptions(OverviewMode.ACTIVE_LEG));
        this.mapboxMap = mapboxMap;
        this.overviewViewportDataSource = overviewViewportDataSource;
        Parser.Pair pair = overviewViewportDataSource.options;
        this.options = pair;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.navigationRoutes = instance_delegatelambda0Var;
        this.postManeuverFramingPoints = instance_delegatelambda0Var;
        this.pointsToFrameOnCurrentStep = instance_delegatelambda0Var;
        this.pointsToFrameAfterCurrentStep = instance_delegatelambda0Var;
        this.averageIntersectionDistancesOnRoute = instance_delegatelambda0Var;
        Point point = NULL_ISLAND_POINT;
        point.getClass();
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty = new ViewportProperty$ZoomProperty(4, point);
        this.followingCenterProperty = viewportProperty$ZoomProperty;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty2 = new ViewportProperty$ZoomProperty(((FollowingFrameOptions) pair.RemoteActionCompatParcelizer).maxZoom, 0);
        this.followingZoomProperty = viewportProperty$ZoomProperty2;
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty3 = new ViewportProperty$ZoomProperty();
        this.followingBearingProperty = viewportProperty$ZoomProperty3;
        ((FollowingFrameOptions) pair.RemoteActionCompatParcelizer).getClass();
        ViewportProperty$ZoomProperty viewportProperty$ZoomProperty4 = new ViewportProperty$ZoomProperty(45.0d, 4);
        this.followingPitchProperty = viewportProperty$ZoomProperty4;
        this.isFramingManeuverProperty = new ViewportProperty$ZoomProperty(4, Boolean.FALSE);
        EdgeInsets edgeInsets = EMPTY_EDGE_INSETS;
        this.followingPadding = edgeInsets;
        this.appliedFollowingPadding = edgeInsets;
        this.additionalPointsToFrameForFollowing = instance_delegatelambda0Var;
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().center((Point) viewportProperty$ZoomProperty.RatingCompat).zoom((Double) viewportProperty$ZoomProperty2.RatingCompat).bearing((Double) viewportProperty$ZoomProperty3.RatingCompat).pitch((Double) viewportProperty$ZoomProperty4.RatingCompat).padding(this.appliedFollowingPadding).build();
        cameraOptionsBuild.getClass();
        this.viewportData = new ViewportData(cameraOptionsBuild, overviewViewportDataSource.viewportData);
        this.viewportDataSourceUpdateObservers = new CopyOnWriteArraySet();
        this.mapSizeReadyCallbackHelper = new AnalyticsServiceImpl(19, mapboxMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.util.ArrayList] */
    public final void calculateRouteData(List list) {
        instance_delegatelambda0 instance_delegatelambda0Var;
        ?? arrayList;
        ?? r5;
        Iterator it;
        String str;
        int i;
        ?? arrayList2;
        double dDoubleValue;
        ?? r6;
        List list2;
        List list3;
        long j;
        ?? arrayList3;
        long j2;
        List<Point> listCoordinates;
        instance_delegatelambda0 instance_delegatelambda0Var2;
        Iterator it2;
        ?? arrayList4;
        double dDoubleValue2;
        OverviewViewportDataSource overviewViewportDataSource = this.overviewViewportDataSource;
        overviewViewportDataSource.getClass();
        boolean zAreSameRoutes = zzmb.areSameRoutes(overviewViewportDataSource.navigationRoutes, list);
        instance_delegatelambda0 instance_delegatelambda0Var3 = instance_delegatelambda0.write;
        if (!zAreSameRoutes) {
            overviewViewportDataSource.navigationRoutes = list;
            if (overviewViewportDataSource.internalOptions.overviewMode == OverviewMode.POINTS) {
                overviewViewportDataSource.indicesConverter.onRoutesChanged(instance_delegatelambda0Var3);
                overviewViewportDataSource.runIfActive(new OverviewViewportDataSource$updateDebugger$1(overviewViewportDataSource, 2));
            } else {
                overviewViewportDataSource.runIfActive(new LayerUtils$getLayer$source$2(list, 11, overviewViewportDataSource));
            }
        }
        NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(list);
        if (navigationRoute == null) {
            return;
        }
        DirectionsRoute directionsRoute = navigationRoute.directionsRoute;
        directionsRoute.getClass();
        List listStepsGeometryToPoints = DecodeUtils.stepsGeometryToPoints(directionsRoute);
        Parser.Pair pair = this.options;
        ((FollowingFrameOptions) pair.RemoteActionCompatParcelizer).intersectionDensityCalculation.getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        String str2 = "kilometers";
        int i2 = 10;
        int i3 = 0;
        if (!PerformanceTracker.getTrackingIsActive()) {
            List intersectionsDistancesFromNroOrNull = zzkx.getIntersectionsDistancesFromNroOrNull(directionsRoute);
            if (intersectionsDistancesFromNroOrNull != null) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    LoggerProviderKt.logD("Computed intersections distances via NRO", "ViewportDataSourceProcessor");
                }
                instance_delegatelambda0Var = instance_delegatelambda0Var3;
                r6 = intersectionsDistancesFromNroOrNull;
            } else {
                List<RouteLeg> listLegs = directionsRoute.legs();
                if (listLegs != null) {
                    List<RouteLeg> list4 = listLegs;
                    ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                    Iterator it3 = list4.iterator();
                    int i4 = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (i4 >= 0) {
                            List<LegStep> listSteps = ((RouteLeg) next).steps();
                            if (listSteps != null) {
                                List<LegStep> list5 = listSteps;
                                arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list5, i2));
                                int i5 = i3;
                                for (Object obj : list5) {
                                    if (i5 >= 0) {
                                        List list6 = (List) ((List) listStepsGeometryToPoints.get(i4)).get(i5);
                                        instance_delegatelambda0 instance_delegatelambda0Var4 = instance_delegatelambda0Var3;
                                        int iSerializer = getQueryParameterslambda2.serializer();
                                        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[i3], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
                                        List<StepIntersection> listIntersections = ((LegStep) obj).intersections();
                                        if (listIntersections != null) {
                                            Iterator it4 = listIntersections.iterator();
                                            while (it4.hasNext()) {
                                                baseContentCardViewExternalSyntheticLambda0.add(((StepIntersection) it4.next()).location());
                                            }
                                        }
                                        baseContentCardViewExternalSyntheticLambda0.add(onContentCardDismissed.MediaDescriptionCompat(list6));
                                        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                                        Iterator it5 = it3;
                                        int iSerializer2 = getQueryParameterslambda2.serializer();
                                        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda1 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer2);
                                        baseContentCardViewExternalSyntheticLambda1.add(onContentCardDismissed.read(list6));
                                        baseContentCardViewExternalSyntheticLambda1.addAll(baseContentCardViewExternalSyntheticLambda0Serializer);
                                        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer2 = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda1);
                                        ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(baseContentCardViewExternalSyntheticLambda0Serializer, 10));
                                        ListIterator listIterator = baseContentCardViewExternalSyntheticLambda0Serializer.listIterator(0);
                                        int i6 = 0;
                                        while (true) {
                                            setOptionalCardImage setoptionalcardimage = (setOptionalCardImage) listIterator;
                                            if (setoptionalcardimage.hasNext()) {
                                                Object next2 = setoptionalcardimage.next();
                                                if (i6 >= 0) {
                                                    arrayList6.add(Double.valueOf(TuplesKt.distance((Point) next2, (Point) baseContentCardViewExternalSyntheticLambda0Serializer2.get(i6), "kilometers") * 1000.0d));
                                                    i6++;
                                                    listIterator = listIterator;
                                                    baseContentCardViewExternalSyntheticLambda0Serializer2 = baseContentCardViewExternalSyntheticLambda0Serializer2;
                                                } else {
                                                    SQLite.serializer();
                                                    throw null;
                                                }
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj2 : arrayList6) {
                                            if (((Number) obj2).doubleValue() > 20.0d) {
                                                arrayList7.add(obj2);
                                            }
                                        }
                                        if (arrayList7.isEmpty()) {
                                            dDoubleValue2 = 20.0d;
                                        } else {
                                            Iterator it6 = arrayList7.iterator();
                                            if (it6.hasNext()) {
                                                Object next3 = it6.next();
                                                while (it6.hasNext()) {
                                                    next3 = Double.valueOf(((Number) next3).doubleValue() + ((Number) it6.next()).doubleValue());
                                                }
                                                dDoubleValue2 = ((Number) next3).doubleValue() / ((double) arrayList7.size());
                                            } else {
                                                IBraze$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                                                return;
                                            }
                                        }
                                        arrayList4.add(Double.valueOf(dDoubleValue2));
                                        i5++;
                                        it3 = it5;
                                        instance_delegatelambda0Var3 = instance_delegatelambda0Var4;
                                        i3 = 0;
                                    } else {
                                        SQLite.serializer();
                                        throw null;
                                    }
                                }
                                instance_delegatelambda0Var2 = instance_delegatelambda0Var3;
                                it2 = it3;
                            } else {
                                instance_delegatelambda0Var2 = instance_delegatelambda0Var3;
                                it2 = it3;
                                arrayList4 = instance_delegatelambda0Var2;
                            }
                            arrayList5.add(arrayList4);
                            i4++;
                            it3 = it2;
                            instance_delegatelambda0Var3 = instance_delegatelambda0Var2;
                            i3 = 0;
                            i2 = 10;
                        } else {
                            SQLite.serializer();
                            throw null;
                        }
                    }
                    instance_delegatelambda0Var = instance_delegatelambda0Var3;
                    r6 = arrayList5;
                } else {
                    instance_delegatelambda0Var = instance_delegatelambda0Var3;
                    r6 = instance_delegatelambda0Var;
                }
            }
        } else {
            instance_delegatelambda0Var = instance_delegatelambda0Var3;
            PerformanceTracker.syncSectionStarted("ViewportDataSourceProcessor#processRouteIntersections");
            try {
                BrazeInAppMessageManagerWhenMappings.write();
                List intersectionsDistancesFromNroOrNull2 = zzkx.getIntersectionsDistancesFromNroOrNull(directionsRoute);
                if (intersectionsDistancesFromNroOrNull2 != null) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                        r5 = intersectionsDistancesFromNroOrNull2;
                        LoggerProviderKt.logD("Computed intersections distances via NRO", "ViewportDataSourceProcessor");
                        r5 = intersectionsDistancesFromNroOrNull2;
                    }
                } else {
                    List<RouteLeg> listLegs2 = directionsRoute.legs();
                    if (listLegs2 != null) {
                        List<RouteLeg> list7 = listLegs2;
                        arrayList = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                        Iterator it7 = list7.iterator();
                        int i7 = 0;
                        while (it7.hasNext()) {
                            Object next4 = it7.next();
                            int i8 = i7 + 1;
                            if (i7 >= 0) {
                                List<LegStep> listSteps2 = ((RouteLeg) next4).steps();
                                if (listSteps2 != null) {
                                    List<LegStep> list8 = listSteps2;
                                    arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                                    Iterator it8 = list8.iterator();
                                    int i9 = 0;
                                    while (it8.hasNext()) {
                                        Object next5 = it8.next();
                                        if (i9 >= 0) {
                                            Iterator it9 = it7;
                                            List list9 = (List) ((List) listStepsGeometryToPoints.get(i7)).get(i9);
                                            Iterator it10 = it8;
                                            int i10 = i8;
                                            int iSerializer3 = getQueryParameterslambda2.serializer();
                                            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda2 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer3);
                                            List<StepIntersection> listIntersections2 = ((LegStep) next5).intersections();
                                            if (listIntersections2 != null) {
                                                Iterator it11 = listIntersections2.iterator();
                                                while (it11.hasNext()) {
                                                    baseContentCardViewExternalSyntheticLambda2.add(((StepIntersection) it11.next()).location());
                                                }
                                            }
                                            baseContentCardViewExternalSyntheticLambda2.add(onContentCardDismissed.MediaDescriptionCompat(list9));
                                            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer3 = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda2);
                                            int iSerializer4 = getQueryParameterslambda2.serializer();
                                            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda3 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer4);
                                            baseContentCardViewExternalSyntheticLambda3.add(onContentCardDismissed.read(list9));
                                            baseContentCardViewExternalSyntheticLambda3.addAll(baseContentCardViewExternalSyntheticLambda0Serializer3);
                                            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer4 = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda3);
                                            int i11 = i7;
                                            ArrayList arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(baseContentCardViewExternalSyntheticLambda0Serializer3, 10));
                                            ListIterator listIterator2 = baseContentCardViewExternalSyntheticLambda0Serializer3.listIterator(0);
                                            int i12 = 0;
                                            while (true) {
                                                setOptionalCardImage setoptionalcardimage2 = (setOptionalCardImage) listIterator2;
                                                if (setoptionalcardimage2.hasNext()) {
                                                    Object next6 = setoptionalcardimage2.next();
                                                    if (i12 >= 0) {
                                                        arrayList8.add(Double.valueOf(TuplesKt.distance((Point) next6, (Point) baseContentCardViewExternalSyntheticLambda0Serializer4.get(i12), str2) * 1000.0d));
                                                        i12++;
                                                        baseContentCardViewExternalSyntheticLambda0Serializer4 = baseContentCardViewExternalSyntheticLambda0Serializer4;
                                                    } else {
                                                        SQLite.serializer();
                                                        throw null;
                                                    }
                                                }
                                            }
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj3 : arrayList8) {
                                                if (((Number) obj3).doubleValue() > 20.0d) {
                                                    arrayList9.add(obj3);
                                                }
                                            }
                                            if (arrayList9.isEmpty()) {
                                                dDoubleValue = 20.0d;
                                            } else {
                                                Iterator it12 = arrayList9.iterator();
                                                if (it12.hasNext()) {
                                                    Object next7 = it12.next();
                                                    while (it12.hasNext()) {
                                                        next7 = Double.valueOf(((Number) next7).doubleValue() + ((Number) it12.next()).doubleValue());
                                                    }
                                                    dDoubleValue = ((Number) next7).doubleValue() / ((double) arrayList9.size());
                                                } else {
                                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                                }
                                            }
                                            arrayList2.add(Double.valueOf(dDoubleValue));
                                            i9++;
                                            str2 = str2;
                                            it8 = it10;
                                            it7 = it9;
                                            i7 = i11;
                                            i8 = i10;
                                        } else {
                                            SQLite.serializer();
                                            throw null;
                                        }
                                    }
                                    it = it7;
                                    str = str2;
                                    i = i8;
                                } else {
                                    it = it7;
                                    str = str2;
                                    i = i8;
                                    arrayList2 = instance_delegatelambda0Var;
                                }
                                arrayList.add(arrayList2);
                                str2 = str;
                                it7 = it;
                                i7 = i;
                            } else {
                                SQLite.serializer();
                                throw null;
                            }
                        }
                    } else {
                        arrayList = instance_delegatelambda0Var;
                    }
                    r5 = arrayList;
                }
                r5 = intersectionsDistancesFromNroOrNull2;
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("ViewportDataSourceProcessor#processRouteIntersections", null);
                r6 = r5;
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("ViewportDataSourceProcessor#processRouteIntersections", null);
                throw th;
            }
        }
        this.averageIntersectionDistancesOnRoute = r6;
        ((FollowingFrameOptions) pair.RemoteActionCompatParcelizer).frameGeometryAfterManeuver.getClass();
        long j3 = 4639481672377565184L;
        if (directionsRoute instanceof DirectionsRouteFBWrapper) {
            try {
                DataRef compoundManeuverGeometryPoints = ((DirectionsRouteFBWrapper) directionsRoute).getContext().getCompoundManeuverGeometryPoints(150.0d, 100.0d);
                Route.Companion companion = Route.Companion;
                ByteBuffer buffer = compoundManeuverGeometryPoints.getBuffer();
                buffer.getClass();
                Route rootAsRoute = companion.getRootAsRoute(buffer);
                list2 = FlatbuffersListWrapper.INSTANCE.get(rootAsRoute.getLegsLength(), new ObjectList$toString$1(19, rootAsRoute));
                if (list2 == null) {
                    list2 = instance_delegatelambda0Var;
                }
            } catch (Throwable th2) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("failed to compute compound maneuver geometry points, returning null. error: " + th2.getMessage(), "NRO-OPERATIONS");
                }
                list2 = null;
            }
        } else {
            list2 = null;
        }
        if (list2 != null) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                LoggerProviderKt.logD("computed compound maneuver geometry points via nro", "ViewportDataSourceProcessor");
            }
            list3 = list2;
        } else {
            List<RouteLeg> listLegs3 = directionsRoute.legs();
            if (listLegs3 == null) {
                list3 = instance_delegatelambda0Var;
                break loop0;
            }
            List<RouteLeg> list10 = listLegs3;
            ArrayList arrayList10 = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
            Iterator it13 = list10.iterator();
            int i13 = 0;
            loop0: while (true) {
                if (!it13.hasNext()) {
                    list3 = arrayList10;
                    break;
                }
                Object next8 = it13.next();
                if (i13 >= 0) {
                    RouteLeg routeLeg = (RouteLeg) next8;
                    List<LegStep> listSteps3 = routeLeg.steps();
                    if (listSteps3 != null) {
                        List<LegStep> list11 = listSteps3;
                        arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list11, 10));
                        Iterator it14 = list11.iterator();
                        int i14 = 0;
                        while (true) {
                            if (it14.hasNext()) {
                                Object next9 = it14.next();
                                int i15 = i14 + 1;
                                if (i14 >= 0) {
                                    List<LegStep> listSteps4 = routeLeg.steps();
                                    if (listSteps4 == null) {
                                        listSteps4 = instance_delegatelambda0Var;
                                    }
                                    List list12 = (List) listStepsGeometryToPoints.get(i13);
                                    if (listSteps4.size() != list12.size()) {
                                        LoggerProviderKt.logE("Unable to calculate geometry after maneuvers. Invalid route.", "ViewportDataSourceProcessor");
                                        list3 = instance_delegatelambda0Var;
                                        break loop0;
                                    }
                                    ArrayList arrayList11 = new ArrayList();
                                    int size = list12.size();
                                    int i16 = i14;
                                    int i17 = i15;
                                    while (true) {
                                        if (i17 >= size) {
                                            j2 = 4639481672377565184L;
                                            break;
                                        }
                                        j2 = 4639481672377565184L;
                                        if (listSteps4.get(i17).distance() > 150.0d) {
                                            break;
                                        }
                                        arrayList11.addAll((Collection) list12.get(i17));
                                        int i18 = i17;
                                        i17++;
                                        i16 = i18;
                                    }
                                    if (i16 < list12.size() - 1) {
                                        listCoordinates = TurfMisc.lineSliceAlong(LineString.fromLngLats((List<Point>) list12.get(i16 + 1)), 0.0d, 100.0d, "meters").coordinates();
                                        listCoordinates.getClass();
                                    } else {
                                        listCoordinates = instance_delegatelambda0Var;
                                    }
                                    arrayList3.add(onContentCardDismissed.IconCompatParcelizer(listCoordinates, arrayList11));
                                    i14 = i15;
                                    j3 = j2;
                                } else {
                                    SQLite.serializer();
                                    throw null;
                                }
                            } else {
                                j = j3;
                            }
                        }
                    } else {
                        j = j3;
                        arrayList3 = instance_delegatelambda0Var;
                    }
                    arrayList10.add(arrayList3);
                    i13++;
                    j3 = j;
                } else {
                    SQLite.serializer();
                    throw null;
                }
            }
        }
        this.postManeuverFramingPoints = list3;
    }

    public final void clearRouteData() {
        MapSizeInitializedCallbackHelper$CancellableImpl mapSizeInitializedCallbackHelper$CancellableImpl = this.mapsSizeReadyCancellable;
        if (mapSizeInitializedCallbackHelper$CancellableImpl != null) {
            mapSizeInitializedCallbackHelper$CancellableImpl.cancel();
        }
        this.mapsSizeReadyCancellable = null;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.navigationRoutes = instance_delegatelambda0Var;
        this.postManeuverFramingPoints = instance_delegatelambda0Var;
        this.averageIntersectionDistancesOnRoute = instance_delegatelambda0Var;
        OverviewViewportDataSource overviewViewportDataSource = this.overviewViewportDataSource;
        overviewViewportDataSource.navigationRoutes = instance_delegatelambda0Var;
        overviewViewportDataSource.indicesConverter.onRoutesChanged(instance_delegatelambda0Var);
        overviewViewportDataSource.runIfActive(new OverviewViewportDataSource$updateDebugger$1(overviewViewportDataSource, 2));
        clearProgressData();
    }

    public final void evaluate() {
        MapSizeInitializedCallbackHelper$CancellableImpl mapSizeInitializedCallbackHelper$CancellableImpl = this.mapsSizeReadyCancellable;
        if (mapSizeInitializedCallbackHelper$CancellableImpl != null) {
            mapSizeInitializedCallbackHelper$CancellableImpl.cancel();
        }
        SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1 = new SearchOptionsKt$validateLimit$1(15, this);
        AnalyticsServiceImpl analyticsServiceImpl = this.mapSizeReadyCallbackHelper;
        analyticsServiceImpl.getClass();
        MapboxMap mapboxMap = (MapboxMap) analyticsServiceImpl.locationProvider;
        MapSizeInitializedCallbackHelper$CancellableImpl mapSizeInitializedCallbackHelper$CancellableImpl2 = new MapSizeInitializedCallbackHelper$CancellableImpl();
        mapboxMap.whenSizeReady(new LayerUtils$getLayer$source$2(mapSizeInitializedCallbackHelper$CancellableImpl2, 17, searchOptionsKt$validateLimit$1));
        this.mapsSizeReadyCancellable = mapSizeInitializedCallbackHelper$CancellableImpl2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    public final void onRouteProgressChangedInternal(RouteProgress routeProgress) {
        boolean z;
        List listSlicePointsAtAngle;
        NavigationRoute navigationRoute;
        BannerText bannerTextPrimary;
        NavigationRoute navigationRoute2 = routeProgress.navigationRoute;
        List list = instance_delegatelambda0.write;
        NavigationRoute navigationRoute3 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(this.navigationRoutes);
        if (navigationRoute3 == null) {
            LoggerProviderKt.logW("You're calling #onRouteProgressChanged but you didn't call #onRouteChanged.", "MapboxNavigationViewportDataSource");
            clearProgressData();
            return;
        }
        DirectionsRoute directionsRoute = navigationRoute3.directionsRoute;
        RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
        int i = routeLegProgress.legIndex;
        RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
        if (!zzmb.isSameRoute(directionsRoute, navigationRoute2.directionsRoute)) {
            LoggerProviderKt.logE("Provided route (#onRouteChanged) and navigated route (#onRouteProgressChanged) are not the same. Aborting framed geometry updates based on route progress.", "MapboxNavigationViewportDataSource");
            clearProgressData();
            return;
        }
        Parser.Pair pair = this.options;
        FollowingFrameOptions followingFrameOptions = (FollowingFrameOptions) pair.RemoteActionCompatParcelizer;
        FollowingFrameOptions followingFrameOptions2 = (FollowingFrameOptions) pair.RemoteActionCompatParcelizer;
        followingFrameOptions.getClass();
        BannerInstructions bannerInstructions = routeProgress.bannerInstructions;
        String strType = (bannerInstructions == null || (bannerTextPrimary = bannerInstructions.primary()) == null) ? null : bannerTextPrimary.type();
        if (strType == null) {
            z = false;
        } else {
            E1$b e1$b = followingFrameOptions.pitchNearManeuvers;
            e1$b.getClass();
            if (e1$b.serializer.contains(strType) || routeStepProgress.distanceRemaining > 180.0d) {
                z = false;
            } else {
                z = true;
            }
        }
        this.isFramingManeuverProperty.RatingCompat = Boolean.valueOf(z);
        MapboxFollowingCameraFramingStrategy mapboxFollowingCameraFramingStrategy = followingFrameOptions2.framingStrategy;
        List list2 = this.averageIntersectionDistancesOnRoute;
        mapboxFollowingCameraFramingStrategy.getClass();
        list2.getClass();
        followingFrameOptions2.intersectionDensityCalculation.getClass();
        float f = routeStepProgress.distanceTraveled;
        double d = ((double) f) / 1000.0d;
        if (d < 0.0d) {
            d = 0.0d;
        }
        double dDoubleValue = ((double) (routeStepProgress.distanceRemaining + f)) / 1000.0d;
        if (dDoubleValue < 0.0d) {
            dDoubleValue = 0.0d;
        }
        double d2 = d > dDoubleValue ? 0.0d : d;
        if (!list2.isEmpty()) {
            dDoubleValue = ((((Number) ((List) list2.get(i)).get(routeStepProgress.stepIndex)).doubleValue() / 1000.0d) * 7.0d) + d2;
        }
        double d3 = dDoubleValue;
        try {
            List list3 = routeStepProgress.stepPoints;
            if (list3 == null) {
                list3 = list;
            }
            List<Point> listCoordinates = TurfMisc.lineSliceAlong(LineString.fromLngLats((List<Point>) list3), d2, d3, "kilometers").coordinates();
            listCoordinates.getClass();
            listSlicePointsAtAngle = ViewportDataSourceProcessor.slicePointsAtAngle(listCoordinates);
        } catch (TurfException e) {
            LoggerProviderKt.logE(String.valueOf(e.getMessage()), "MapboxFollowingFrameProcessor");
            listSlicePointsAtAngle = list;
        }
        this.pointsToFrameOnCurrentStep = listSlicePointsAtAngle;
        MapboxFollowingCameraFramingStrategy mapboxFollowingCameraFramingStrategy2 = followingFrameOptions2.framingStrategy;
        List list4 = this.postManeuverFramingPoints;
        mapboxFollowingCameraFramingStrategy2.getClass();
        list4.getClass();
        followingFrameOptions2.frameGeometryAfterManeuver.getClass();
        List list5 = !list4.isEmpty() ? (List) ((List) list4.get(i)).get(routeStepProgress.stepIndex) : list;
        if (list5 != null) {
            list = list5;
        }
        this.pointsToFrameAfterCurrentStep = list;
        OverviewViewportDataSource overviewViewportDataSource = this.overviewViewportDataSource;
        overviewViewportDataSource.getClass();
        if (overviewViewportDataSource.internalOptions.overviewMode == OverviewMode.POINTS || (navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(overviewViewportDataSource.navigationRoutes)) == null) {
            return;
        }
        if (!zzmb.isSameRoute(navigationRoute.directionsRoute, navigationRoute2.directionsRoute)) {
            overviewViewportDataSource.cachedRemainingPoints = new HashMap();
            overviewViewportDataSource.runIfActive(new OverviewViewportDataSource$updateDebugger$1(overviewViewportDataSource, 1));
        } else {
            overviewViewportDataSource.runIfActive(new LayerUtils$getLayer$source$2(routeProgress, 13, overviewViewportDataSource));
        }
    }
}
