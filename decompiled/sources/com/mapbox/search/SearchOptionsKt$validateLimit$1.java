package com.mapbox.search;

import android.animation.AnimatorSet;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.deliveryhero.customerchat.datastore.UserPropertiesDataStoreHelperImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzli;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.mapbox.common.LoggingLevel;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPath;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPosition;
import com.mapbox.navigation.base.trip.model.eh.EHorizonMapperKt$WhenMappings;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObject;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObjectPosition;
import com.mapbox.navigation.base.trip.model.roadobject.location.GantryLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.OpenLRLineLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.OpenLRPointLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.PointLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.PolygonLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.PolylineLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.RouteAlertLocation;
import com.mapbox.navigation.base.trip.model.roadobject.location.SubgraphLocation;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationAppDelegate;
import com.mapbox.navigation.core.navigator.offline.DownloadedTileset;
import com.mapbox.navigation.core.navigator.offline.TilesetReleaseDateParser;
import com.mapbox.navigation.core.replay.MapboxReplayer;
import com.mapbox.navigation.core.replay.ReplayLocationProvider;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiStateData;
import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.GraphPath;
import com.mapbox.navigator.GraphPosition;
import com.mapbox.navigator.MatchedRoadObjectLocation;
import com.mapbox.navigator.Position;
import com.mapbox.navigator.SubgraphEdge;
import com.mapbox.navigator.match.openlr.Orientation;
import com.mapbox.navigator.match.openlr.SideOfRoad;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesFragment;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Lambda;
import o.BitmapPainterKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.BrushPainter;
import o.ColorPainter;
import o.DefaultInAppMessageViewWrapper;
import o.IconCompatParcelizer;
import o.accessgetInstancedelegatecp;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.createdefault;
import o.drawColor;
import o.getVonKries;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.quickReject;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchOptionsKt$validateLimit$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object $limit;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchOptionsKt$validateLimit$1(int i, Object obj) {
        super(0);
        this.$r8$classId = i;
        this.$limit = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.$limit;
        switch (i4) {
            case 0:
                return IconCompatParcelizer.write((Integer) obj, ").", new StringBuilder("Provided limit should be greater than 0 (was found: "));
            case 1:
                return Float.valueOf(((Number) ((getVonKries) obj).getValue()).floatValue());
            case 2:
                ((BrazeUser$$ExternalSyntheticLambda28) obj).invoke();
                return createfromparcel;
            case 3:
                return ((UserPropertiesDataStoreHelperImpl) ((BitmapPainterKt) obj).read).IconCompatParcelizer();
            case 4:
                return ((UserPropertiesDataStoreHelperImpl) ((ColorPainter) obj).IconCompatParcelizer).IconCompatParcelizer();
            case 5:
                return ((UserPropertiesDataStoreHelperImpl) ((BrushPainter) obj).IconCompatParcelizer).IconCompatParcelizer();
            case 6:
                ((AnimatorSet) obj).start();
                return createfromparcel;
            case 7:
                MatchedRoadObjectLocation location = ((RoadObject) obj).nativeRoadObject.getLocation();
                location.getClass();
                if (location.isMatchedGantryLocation()) {
                    List<Position> positions = location.getMatchedGantryLocation().getPositions();
                    positions.getClass();
                    ArrayList arrayListMapToRoadObjectPositions = zzli.mapToRoadObjectPositions(positions);
                    Geometry shape = location.getMatchedGantryLocation().getShape();
                    shape.getClass();
                    return new GantryLocation(arrayListMapToRoadObjectPositions, shape);
                }
                if (location.isMatchedPointLocation()) {
                    Position position = location.getMatchedPointLocation().getPosition();
                    position.getClass();
                    RoadObjectPosition roadObjectPositionMapToRoadObjectPosition = zzli.mapToRoadObjectPosition(position);
                    return new PointLocation(roadObjectPositionMapToRoadObjectPosition, roadObjectPositionMapToRoadObjectPosition.coordinate);
                }
                if (location.isMatchedPolygonLocation()) {
                    List<Position> entries = location.getMatchedPolygonLocation().getEntries();
                    entries.getClass();
                    ArrayList arrayListMapToRoadObjectPositions2 = zzli.mapToRoadObjectPositions(entries);
                    List<Position> exits = location.getMatchedPolygonLocation().getExits();
                    exits.getClass();
                    ArrayList arrayListMapToRoadObjectPositions3 = zzli.mapToRoadObjectPositions(exits);
                    Geometry shape2 = location.getMatchedPolygonLocation().getShape();
                    shape2.getClass();
                    return new PolygonLocation(arrayListMapToRoadObjectPositions2, arrayListMapToRoadObjectPositions3, shape2);
                }
                if (location.isMatchedPolylineLocation()) {
                    GraphPath path = location.getMatchedPolylineLocation().getPath();
                    path.getClass();
                    List<Long> edges = path.getEdges();
                    edges.getClass();
                    EHorizonGraphPath eHorizonGraphPath = new EHorizonGraphPath(edges, path.getPercentAlongBegin(), path.getPercentAlongEnd(), path.getLength());
                    Geometry shape3 = location.getMatchedPolylineLocation().getShape();
                    shape3.getClass();
                    return new PolylineLocation(eHorizonGraphPath, shape3);
                }
                if (location.isOpenLRLineLocation()) {
                    GraphPath path2 = location.getOpenLRLineLocation().getPath();
                    path2.getClass();
                    List<Long> edges2 = path2.getEdges();
                    edges2.getClass();
                    EHorizonGraphPath eHorizonGraphPath2 = new EHorizonGraphPath(edges2, path2.getPercentAlongBegin(), path2.getPercentAlongEnd(), path2.getLength());
                    Geometry shape4 = location.getOpenLRLineLocation().getShape();
                    shape4.getClass();
                    return new OpenLRLineLocation(eHorizonGraphPath2, shape4);
                }
                if (!location.isOpenLRPointAlongLineLocation()) {
                    if (location.isRouteAlertLocation()) {
                        Geometry shape5 = location.getRouteAlertLocation().getShape();
                        shape5.getClass();
                        return new RouteAlertLocation(6, shape5);
                    }
                    if (!location.isMatchedSubgraphLocation()) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported object location type.");
                        return null;
                    }
                    List<Position> enters = location.getMatchedSubgraphLocation().getEnters();
                    enters.getClass();
                    ArrayList arrayListMapToRoadObjectPositions4 = zzli.mapToRoadObjectPositions(enters);
                    List<Position> exits2 = location.getMatchedSubgraphLocation().getExits();
                    exits2.getClass();
                    ArrayList arrayListMapToRoadObjectPositions5 = zzli.mapToRoadObjectPositions(exits2);
                    HashMap<Long, SubgraphEdge> edges3 = location.getMatchedSubgraphLocation().getEdges();
                    edges3.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<T> it = edges3.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        SubgraphEdge subgraphEdge = (SubgraphEdge) entry.getValue();
                        subgraphEdge.getClass();
                        long id = subgraphEdge.getId();
                        List<Long> innerEdgeIds = subgraphEdge.getInnerEdgeIds();
                        innerEdgeIds.getClass();
                        List<Long> outerEdgeIds = subgraphEdge.getOuterEdgeIds();
                        outerEdgeIds.getClass();
                        Geometry shape6 = subgraphEdge.getShape();
                        shape6.getClass();
                        linkedHashMap.put(key, new com.mapbox.navigation.base.trip.model.roadobject.location.SubgraphEdge(id, innerEdgeIds, outerEdgeIds, shape6, subgraphEdge.getLength()));
                    }
                    Geometry shape7 = location.getMatchedSubgraphLocation().getShape();
                    shape7.getClass();
                    return new SubgraphLocation(arrayListMapToRoadObjectPositions4, arrayListMapToRoadObjectPositions5, linkedHashMap, shape7);
                }
                GraphPosition position2 = location.getOpenLRPointAlongLineLocation().getPosition();
                position2.getClass();
                EHorizonGraphPosition eHorizonGraphPosition = new EHorizonGraphPosition(position2.getEdgeId(), position2.getPercentAlong());
                Point coordinate = location.getOpenLRPointAlongLineLocation().getCoordinate();
                coordinate.getClass();
                SideOfRoad sideOfRoad = location.getOpenLRPointAlongLineLocation().getSideOfRoad();
                sideOfRoad.getClass();
                int i5 = EHorizonMapperKt$WhenMappings.$EnumSwitchMapping$1[sideOfRoad.ordinal()];
                if (i5 == 1) {
                    i = 3;
                } else if (i5 == 2) {
                    i = 2;
                } else if (i5 == 3) {
                    i = 1;
                } else {
                    if (i5 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    i = 0;
                }
                Orientation orientation = location.getOpenLRPointAlongLineLocation().getOrientation();
                orientation.getClass();
                int i6 = EHorizonMapperKt$WhenMappings.$EnumSwitchMapping$2[orientation.ordinal()];
                if (i6 == 1) {
                    i2 = 3;
                } else if (i6 == 2) {
                    i2 = 0;
                } else if (i6 != 3) {
                    int i7 = RemoteActionCompatParcelizer + 69;
                    serializer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0 ? i6 != 4 : i6 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        int i8 = RemoteActionCompatParcelizer + 59;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return null;
                    }
                } else {
                    i2 = 1;
                }
                return new OpenLRPointLocation(eHorizonGraphPosition, coordinate, i, i2);
            case 8:
                ((SafeContinuation) obj).resumeWith(createfromparcel);
                return createfromparcel;
            case 9:
                return ((ThreadController) ((BlockRunner) obj).read).getMainScopeAndRootJob();
            case 10:
                return ((MapboxNavigationAppDelegate) obj).getCarAppLifecycleOwner();
            case 11:
                String str = ((DownloadedTileset) obj).version;
                if (str == null) {
                    return null;
                }
                int i10 = RemoteActionCompatParcelizer + 85;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                try {
                    return TilesetReleaseDateParser.VERSION_NAME_DATE_FORMATTER.parse(str);
                } catch (Exception e) {
                    if (!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                        return null;
                    }
                    LoggerProviderKt.logE("Unable to parse date from version name " + str + ": " + e, "TilesetVersionManager");
                    return null;
                }
            case 12:
                return ((MapboxTripSession) obj).routeProgress;
            case 13:
                NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(((MapboxDirectionsSession) obj).getRoutes());
                if (navigationRoute == null) {
                    return null;
                }
                int i12 = serializer + 103;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    return navigationRoute.id;
                }
                int i13 = 95 / 0;
                return navigationRoute.id;
            case 14:
                DisplayCallbacksImpl displayCallbacksImpl = (DisplayCallbacksImpl) obj;
                return (ReplayLocationProvider) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) displayCallbacksImpl.RemoteActionCompatParcelizer).invoke((MapboxReplayer) ((isAdapterPositionOnScreen) displayCallbacksImpl.write).MediaSessionCompatResultReceiverWrapper());
            case 15:
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource = (MapboxNavigationViewportDataSource) obj;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("MapboxNavigationViewportDataSource#evaluateImpl");
                    try {
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        MapboxNavigationViewportDataSource.access$evaluateImpl(mapboxNavigationViewportDataSource);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#evaluateImpl", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxNavigationViewportDataSource#evaluateImpl", null);
                        throw th;
                    }
                } else {
                    int i14 = RemoteActionCompatParcelizer + 9;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        MapboxNavigationViewportDataSource.access$evaluateImpl(mapboxNavigationViewportDataSource);
                        throw null;
                    }
                    MapboxNavigationViewportDataSource.access$evaluateImpl(mapboxNavigationViewportDataSource);
                }
                return createfromparcel;
            case 16:
                BlockRunner blockRunner = (BlockRunner) obj;
                RouteCalloutUiStateData routeCalloutUiStateData = (RouteCalloutUiStateData) blockRunner.RatingCompat;
                if (routeCalloutUiStateData != null) {
                    blockRunner.renderCallouts(routeCalloutUiStateData);
                }
                return createfromparcel;
            case 17:
                List<NavigationRouteLine> list = (List) obj;
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (NavigationRouteLine navigationRouteLine : list) {
                    arrayList.add((RouteFeatureData) MapboxRouteLineUtils.generateRouteFeatureData.invoke(navigationRouteLine.getRoute(), navigationRouteLine.getIdentifier()));
                }
                return arrayList;
            case 18:
                ((Future) obj).cancel(true);
                return createfromparcel;
            case 19:
                ((AsyncOperationTaskImpl) obj).cancel();
                return createfromparcel;
            case 20:
                return (AutoAcceptPreferencesFragment) obj;
            case 21:
                return (asFrameworkPaint) ((SearchOptionsKt$validateLimit$1) obj).invoke();
            case 22:
                return (asFrameworkPaint) ((createdefault) obj).invoke();
            case 23:
                return (asFrameworkPaint) ((createdefault) obj).invoke();
            case 24:
                return (asFrameworkPaint) ((drawColor) obj).invoke();
            case 25:
                return (asFrameworkPaint) ((drawColor) obj).invoke();
            case 26:
                return (asFrameworkPaint) ((quickReject) obj).invoke();
            case 27:
                return (asFrameworkPaint) ((quickReject) obj).invoke();
            case 28:
                return (InAppCameraWithTagsFragment) obj;
            default:
                return (asFrameworkPaint) ((SearchOptionsKt$validateLimit$1) obj).invoke();
        }
    }
}
