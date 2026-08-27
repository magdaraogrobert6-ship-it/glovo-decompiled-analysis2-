package com.google.android.gms.internal.mlkit_vision_face;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.trip.model.eh.EHorizonEdge;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPosition;
import com.mapbox.navigation.base.trip.model.eh.EHorizonMapperKt$WhenMappings;
import com.mapbox.navigation.base.trip.model.roadobject.RoadObjectPosition;
import com.mapbox.navigator.ElectronicHorizonEdge;
import com.mapbox.navigator.Gate;
import com.mapbox.navigator.GraphPosition;
import com.mapbox.navigator.Position;
import com.mapbox.navigator.RoadObjectType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzli {
    public static final EHorizonEdge mapToEdge(ElectronicHorizonEdge electronicHorizonEdge) {
        ArrayList arrayList = new ArrayList();
        EHorizonEdge eHorizonEdge = new EHorizonEdge(electronicHorizonEdge.getId(), electronicHorizonEdge.getLevel(), electronicHorizonEdge.getProbability(), electronicHorizonEdge.getIsOnRoute(), arrayList);
        List<ElectronicHorizonEdge> out = electronicHorizonEdge.getOut();
        out.getClass();
        for (ElectronicHorizonEdge electronicHorizonEdge2 : out) {
            electronicHorizonEdge2.getClass();
            arrayList.add(mapToEdge(electronicHorizonEdge2));
        }
        return eHorizonEdge;
    }

    public static final int mapToRoadObjectType(RoadObjectType roadObjectType) {
        switch (EHorizonMapperKt$WhenMappings.$EnumSwitchMapping$0[roadObjectType.ordinal()]) {
            case 1:
                return 6;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 0;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 5;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return 0;
        }
    }

    public static final RoadObjectPosition mapToRoadObjectPosition(Position position) {
        position.getClass();
        GraphPosition position2 = position.getPosition();
        position2.getClass();
        EHorizonGraphPosition eHorizonGraphPosition = new EHorizonGraphPosition(position2.getEdgeId(), position2.getPercentAlong());
        Point coordinate = position.getCoordinate();
        coordinate.getClass();
        return new RoadObjectPosition(eHorizonGraphPosition, coordinate);
    }

    public static final List mapToGates(List list) {
        List<Gate> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (Gate gate : list2) {
            int id = gate.getId();
            Position position = gate.getPosition();
            position.getClass();
            arrayList.add(new com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.Gate(id, mapToRoadObjectPosition(position), gate.getProbability(), gate.getDistance()));
        }
        return onContentCardDismissed.PlaybackStateCompat(arrayList);
    }

    public static final ArrayList mapToRoadObjectPositions(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToRoadObjectPosition((Position) it.next()));
        }
        return arrayList;
    }
}
