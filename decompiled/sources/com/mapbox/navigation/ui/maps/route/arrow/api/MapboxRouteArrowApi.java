package com.mapbox.navigation.ui.maps.route.arrow.api;

import androidx.sqlite.SQLite;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$$ExternalSyntheticLambda8;
import com.mapbox.navigation.ui.maps.route.arrow.model.ArrowAddedValue;
import com.mapbox.navigation.ui.maps.route.arrow.model.ClearArrowsValue;
import com.mapbox.navigation.ui.maps.route.arrow.model.ManeuverArrow;
import com.mapbox.navigation.ui.maps.route.arrow.model.UpdateManeuverArrowValue;
import com.mapbox.turf.TurfMisc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TuplesKt;
import kotlin.collections.ReversedListReadOnly;
import o.accessgetInstancedelegatecp;
import o.bindViewHolderlambda0;
import o.containsImportantForAccessibilityui;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteArrowApi {
    public ManeuverArrow maneuverPoints = new ManeuverArrow(instance_delegatelambda0.write);
    public final CopyOnWriteArrayList arrows = new CopyOnWriteArrayList();

    public final ClearArrowsValue clearArrows() {
        this.arrows.clear();
        this.maneuverPoints = new ManeuverArrow(instance_delegatelambda0.write);
        return new ClearArrowsValue(getShaftFeatureCollection(), getArrowHeadFeatureCollection());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    public final Expected addUpcomingManeuverArrow(RouteProgress routeProgress) {
        boolean z;
        List list;
        Expected expectedCreateValue;
        StepManeuver stepManeuverManeuver;
        List<LegStep> listSteps;
        StepManeuver stepManeuverManeuver2;
        List<LegStep> listSteps2;
        routeProgress.getClass();
        List list2 = routeProgress.upcomingStepPoints;
        RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
        RouteLeg routeLeg = routeLegProgress.routeLeg;
        RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
        int i = 1;
        int i2 = 2;
        boolean z2 = list2 == null || list2.size() < 2;
        List list3 = routeStepProgress.stepPoints;
        if (list3 != null) {
            list3.getClass();
            if (list3.size() < 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (!z2 && !z) {
            LegStep legStep = (routeLeg == null || (listSteps2 = routeLeg.steps()) == null) ? null : (LegStep) onContentCardDismissed.read(routeStepProgress.stepIndex + 1, listSteps2);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(legStep == null || (stepManeuverManeuver2 = legStep.maneuver()) == null) ? null : stepManeuverManeuver2.type(), "arrive"}, getCieXyz.write())).booleanValue()) {
                Visibility visibility = Visibility.VISIBLE;
                list = SQLite.read(new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-shaft-layer", visibility), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-shaft-casing-layer", visibility), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-head-casing-layer", visibility), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-head-layer", visibility));
            } else {
                Visibility visibility2 = Visibility.NONE;
                list = SQLite.read(new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-shaft-layer", visibility2), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-shaft-casing-layer", visibility2), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-head-casing-layer", visibility2), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-head-layer", visibility2));
            }
        } else {
            Visibility visibility3 = Visibility.NONE;
            list = SQLite.read(new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-shaft-layer", visibility3), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-shaft-casing-layer", visibility3), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-head-casing-layer", visibility3), new onViewAttachedToWindowlambda0("mapbox-navigation-arrow-head-layer", visibility3));
        }
        ManeuverArrow maneuverArrow = this.maneuverPoints;
        maneuverArrow.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.arrows;
        copyOnWriteArrayList.remove(maneuverArrow);
        getShaftFeatureCollection();
        getArrowHeadFeatureCollection();
        LegStep legStep2 = (routeLeg == null || (listSteps = routeLeg.steps()) == null) ? null : (LegStep) onContentCardDismissed.read(routeStepProgress.stepIndex + 1, listSteps);
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(legStep2 == null || (stepManeuverManeuver = legStep2.maneuver()) == null) ? null : stepManeuverManeuver.type(), "arrive"}, getCieXyz.write())).booleanValue();
        List listIconCompatParcelizer = instance_delegatelambda0.write;
        if (!zBooleanValue) {
            List list4 = routeStepProgress.stepPoints;
            List reversedListReadOnly = list4 != null ? new ReversedListReadOnly(list4) : null;
            if (reversedListReadOnly == null) {
                reversedListReadOnly = listIconCompatParcelizer;
            }
            LineString lineStringFromLngLats = LineString.fromLngLats((List<Point>) reversedListReadOnly);
            if (reversedListReadOnly.size() >= 2) {
                if (list2 == null) {
                    list2 = listIconCompatParcelizer;
                }
                LineString lineStringFromLngLats2 = LineString.fromLngLats((List<Point>) list2);
                if (list2.size() >= 2) {
                    LineString lineStringLineSliceAlong = TurfMisc.lineSliceAlong(lineStringFromLngLats, 0.0d, 30.0d, "meters");
                    lineStringLineSliceAlong.getClass();
                    LineString lineStringLineSliceAlong2 = TurfMisc.lineSliceAlong(lineStringFromLngLats2, 0.0d, 30.0d, "meters");
                    lineStringLineSliceAlong2.getClass();
                    List<Point> listCoordinates = lineStringLineSliceAlong.coordinates();
                    listCoordinates.getClass();
                    bindViewHolderlambda0 bindviewholderlambda0 = new bindViewHolderlambda0(listCoordinates);
                    List<Point> listCoordinates2 = lineStringLineSliceAlong2.coordinates();
                    listCoordinates2.getClass();
                    listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(listCoordinates2, bindviewholderlambda0);
                }
            }
        }
        ManeuverArrow maneuverArrow2 = new ManeuverArrow(listIconCompatParcelizer);
        this.maneuverPoints = maneuverArrow2;
        if (listIconCompatParcelizer.size() < 2) {
            expectedCreateValue = ExpectedFactory.createError(new containsImportantForAccessibilityui());
            expectedCreateValue.getClass();
        } else {
            copyOnWriteArrayList.add(maneuverArrow2);
            expectedCreateValue = ExpectedFactory.createValue(new ArrowAddedValue(getShaftFeatureCollection(), getArrowHeadFeatureCollection()));
            expectedCreateValue.getClass();
        }
        Expected expectedCreateValue2 = ExpectedFactory.createValue((UpdateManeuverArrowValue) expectedCreateValue.fold(new MapboxTripSession$$ExternalSyntheticLambda8(list, i), new MapboxTripSession$$ExternalSyntheticLambda8(list, i2)));
        expectedCreateValue2.getClass();
        return expectedCreateValue2;
    }

    public final FeatureCollection getArrowHeadFeatureCollection() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.arrows;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List list = ((ManeuverArrow) it.next()).points;
            double dBearing = TuplesKt.bearing((Point) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(2, list), (Point) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list));
            Feature featureFromGeometry = Feature.fromGeometry((Geometry) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list));
            featureFromGeometry.addNumberProperty("mapbox-navigation-arrow-bearing", Double.valueOf(((((dBearing - 0.0d) % 360.0d) + 360.0d) % 360.0d) + 0.0d));
            arrayList.add(featureFromGeometry);
        }
        FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(arrayList);
        featureCollectionFromFeatures.getClass();
        return featureCollectionFromFeatures;
    }

    public final FeatureCollection getShaftFeatureCollection() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.arrows;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(Feature.fromGeometry(LineString.fromLngLats((List<Point>) ((ManeuverArrow) it.next()).points)));
        }
        FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(arrayList);
        featureCollectionFromFeatures.getClass();
        return featureCollectionFromFeatures;
    }
}
