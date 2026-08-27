package com.google.android.gms.internal.mlkit_vision_face;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.trip.model.eh.EHorizon;
import com.mapbox.navigation.base.trip.model.eh.EHorizonGraphPosition;
import com.mapbox.navigation.base.trip.model.eh.EHorizonMapperKt$WhenMappings;
import com.mapbox.navigation.base.trip.model.eh.EHorizonPosition;
import com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.GantryDistanceInfo;
import com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.PointDistanceInfo;
import com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.RoadObjectDistanceInfo;
import com.mapbox.navigator.ElectronicHorizon;
import com.mapbox.navigator.ElectronicHorizonEdge;
import com.mapbox.navigator.ElectronicHorizonPosition;
import com.mapbox.navigator.ElectronicHorizonResultType;
import com.mapbox.navigator.Gate;
import com.mapbox.navigator.GraphPosition;
import com.mapbox.navigator.LineDistanceInfo;
import com.mapbox.navigator.PolygonDistanceInfo;
import com.mapbox.navigator.RoadObjectDistance;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.SubGraphDistanceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzlv {
    public static EHorizonPosition buildEHorizonPosition(ElectronicHorizonPosition electronicHorizonPosition) {
        String str;
        GraphPosition graphPositionPosition = electronicHorizonPosition.position();
        graphPositionPosition.getClass();
        EHorizonGraphPosition eHorizonGraphPosition = new EHorizonGraphPosition(graphPositionPosition.getEdgeId(), graphPositionPosition.getPercentAlong());
        ElectronicHorizon electronicHorizonTree = electronicHorizonPosition.tree();
        electronicHorizonTree.getClass();
        ElectronicHorizonEdge start = electronicHorizonTree.getStart();
        start.getClass();
        EHorizon eHorizon = new EHorizon(zzli.mapToEdge(start));
        ElectronicHorizonResultType electronicHorizonResultTypeType = electronicHorizonPosition.type();
        electronicHorizonResultTypeType.getClass();
        int i = EHorizonMapperKt$WhenMappings.$EnumSwitchMapping$5[electronicHorizonResultTypeType.ordinal()];
        if (i == 1) {
            str = "INITIAL";
        } else if (i == 2) {
            str = "UPDATE";
        } else {
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            str = "NOT_AVAILABLE";
        }
        return new EHorizonPosition(eHorizonGraphPosition, eHorizon, str);
    }

    public static RoadObjectDistanceInfo buildRoadObjectDistance(RoadObjectDistance roadObjectDistance) {
        roadObjectDistance.getClass();
        com.mapbox.navigator.RoadObjectDistanceInfo distanceInfo = roadObjectDistance.getDistanceInfo();
        distanceInfo.getClass();
        String roadObjectId = roadObjectDistance.getRoadObjectId();
        roadObjectId.getClass();
        RoadObjectType type = roadObjectDistance.getType();
        type.getClass();
        int iMapToRoadObjectType = zzli.mapToRoadObjectType(type);
        if (distanceInfo.isGantryDistanceInfo()) {
            return new GantryDistanceInfo(roadObjectId, iMapToRoadObjectType, distanceInfo.getGantryDistanceInfo().getDistance());
        }
        if (distanceInfo.isLineDistanceInfo()) {
            LineDistanceInfo lineDistanceInfo = distanceInfo.getLineDistanceInfo();
            return new com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.LineDistanceInfo(roadObjectId, iMapToRoadObjectType, lineDistanceInfo.getDistanceToEntry(), lineDistanceInfo.getDistanceToExit(), lineDistanceInfo.getDistanceToEnd(), lineDistanceInfo.getEntryFromStart(), lineDistanceInfo.getLength());
        }
        if (distanceInfo.isPointDistanceInfo()) {
            return new PointDistanceInfo(roadObjectId, iMapToRoadObjectType, distanceInfo.getPointDistanceInfo().getDistance());
        }
        if (distanceInfo.isPolygonDistanceInfo()) {
            PolygonDistanceInfo polygonDistanceInfo = distanceInfo.getPolygonDistanceInfo();
            List<Gate> entrances = polygonDistanceInfo.getEntrances();
            entrances.getClass();
            List listMapToGates = zzli.mapToGates(entrances);
            List<Gate> exits = polygonDistanceInfo.getExits();
            exits.getClass();
            return new com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.PolygonDistanceInfo(roadObjectId, iMapToRoadObjectType, listMapToGates, zzli.mapToGates(exits), polygonDistanceInfo.getInside());
        }
        if (!distanceInfo.isSubGraphDistanceInfo()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported distance info type.");
            return null;
        }
        SubGraphDistanceInfo subGraphDistanceInfo = distanceInfo.getSubGraphDistanceInfo();
        List<Gate> entrances2 = subGraphDistanceInfo.getEntrances();
        entrances2.getClass();
        List listMapToGates2 = zzli.mapToGates(entrances2);
        List<Gate> exits2 = subGraphDistanceInfo.getExits();
        exits2.getClass();
        return new com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.SubGraphDistanceInfo(roadObjectId, iMapToRoadObjectType, listMapToGates2, zzli.mapToGates(exits2), subGraphDistanceInfo.getInside());
    }
}
