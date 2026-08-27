package com.mapbox.navigation.core.internal.congestions.processor;

import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.transition.TransitionValuesMaps;
import com.google.android.gms.internal.mlkit_vision_face.zznd;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.MapboxStreetsV8;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$IncreaseTraffic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.ignoreRemeasureRequests;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IncreaseTrafficUpdateActionHandler implements TrafficUpdateActionHandler {
    public final TransitionValuesMaps congestionRangeGroup;

    @Override // com.mapbox.navigation.core.internal.congestions.processor.TrafficUpdateActionHandler
    public final NavigationRoute handleAction(ignoreRemeasureRequests ignoreremeasurerequests) {
        ArrayList arrayList;
        Object next;
        MapboxStreetsV8 mapboxStreetsV8;
        List<LegStep> listSteps;
        List<StepIntersection> listIntersections;
        TrafficUpdateAction$IncreaseTraffic trafficUpdateAction$IncreaseTraffic = (TrafficUpdateAction$IncreaseTraffic) ignoreremeasurerequests;
        trafficUpdateAction$IncreaseTraffic.getClass();
        RouteLegProgress routeLegProgress = trafficUpdateAction$IncreaseTraffic.legProgress;
        RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
        LegStep legStep = routeStepProgress.step;
        List<StepIntersection> listSerializer = (legStep == null || (listIntersections = legStep.intersections()) == null) ? null : onContentCardDismissed.serializer(listIntersections, routeStepProgress.intersectionIndex);
        List<StepIntersection> list = instance_delegatelambda0.write;
        if (listSerializer == null) {
            listSerializer = list;
        }
        RouteLeg routeLeg = routeLegProgress.routeLeg;
        if (routeLeg == null || (listSteps = routeLeg.steps()) == null) {
            arrayList = null;
        } else {
            List listSerializer2 = onContentCardDismissed.serializer(listSteps, routeStepProgress.stepIndex + 1);
            arrayList = new ArrayList();
            Iterator it = listSerializer2.iterator();
            while (it.hasNext()) {
                List<StepIntersection> listIntersections2 = ((LegStep) it.next()).intersections();
                if (listIntersections2 == null) {
                    listIntersections2 = list;
                }
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listIntersections2, (Collection) arrayList);
            }
        }
        if (arrayList != null) {
            list = arrayList;
        }
        Iterator it2 = onContentCardDismissed.IconCompatParcelizer(list, listSerializer).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            mapboxStreetsV8 = ((StepIntersection) next).mapboxStreetsV8();
        } while (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxStreetsV8 != null ? mapboxStreetsV8.roadClass() : null, "motorway"}, getCieXyz.write())).booleanValue());
        StepIntersection stepIntersection = (StepIntersection) next;
        return zznd.updateTraffic(trafficUpdateAction$IncreaseTraffic.route, routeLegProgress, trafficUpdateAction$IncreaseTraffic.expectedCongestion, 8, 4, stepIntersection != null ? stepIntersection.geometryIndex() : null, false, new RoomDatabase$createConnectionManager$2(2, this, IncreaseTrafficUpdateActionHandler.class, "smoothifyCongestion", "smoothifyCongestion(Ljava/lang/Integer;I)I", 0, 2), new RoomDatabase$createConnectionManager$2(2, this, IncreaseTrafficUpdateActionHandler.class, "adjustCongestionFarAhead", "adjustCongestionFarAhead(Ljava/lang/Integer;I)I", 0, 3));
    }

    public IncreaseTrafficUpdateActionHandler(TransitionValuesMaps transitionValuesMaps) {
        this.congestionRangeGroup = transitionValuesMaps;
    }
}
