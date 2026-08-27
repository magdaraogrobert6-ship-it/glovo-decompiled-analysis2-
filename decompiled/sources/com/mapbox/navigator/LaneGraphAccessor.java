package com.mapbox.navigator;

import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface LaneGraphAccessor {
    List<Projection> findLaneGroupsProjections(FixDirectedCoordinate fixDirectedCoordinate, double d, Double d2, boolean z);

    List<Projection> findLanesProjections(FixDirectedCoordinate fixDirectedCoordinate, double d, Double d2, boolean z);

    LaneData getLaneData(long j);

    List<Point> getLaneGeometry(long j);

    LaneGroupData getLaneGroupData(long j);

    List<Point> getLaneGroupGeometry(long j);

    List<LaneWidthPoint> getLaneWidthPoints(long j);

    List<Point> getSmoothedLaneGroupGeometry(long j, double d, String str);

    LaneGroupData getVirtualLaneGroupData(long j, String str);

    List<Point> getVirtualLaneGroupGeometry(long j, String str);

    boolean isVirtualLaneGroup(long j);
}
