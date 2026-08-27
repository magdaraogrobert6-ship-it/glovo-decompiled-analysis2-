package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RouteLaneGroup implements Serializable {
    private final RouteLaneGroupSegmentPosition beginSegmentPosition;
    private final Double distanceFromEgo;
    private final double distanceFromStartOfRoute;
    private final RouteLaneGroupSegmentPosition endSegmentPosition;
    private final long laneGroupId;
    private final List<RouteLane> lanes;

    public RouteLaneGroupSegmentPosition getBeginSegmentPosition() {
        return this.beginSegmentPosition;
    }

    public Double getDistanceFromEgo() {
        return this.distanceFromEgo;
    }

    public double getDistanceFromStartOfRoute() {
        return this.distanceFromStartOfRoute;
    }

    public RouteLaneGroupSegmentPosition getEndSegmentPosition() {
        return this.endSegmentPosition;
    }

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    public List<RouteLane> getLanes() {
        return this.lanes;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLaneGroup(long j, List<RouteLane> list, Double d, double d2, RouteLaneGroupSegmentPosition routeLaneGroupSegmentPosition, RouteLaneGroupSegmentPosition routeLaneGroupSegmentPosition2) {
        this.laneGroupId = j;
        this.lanes = list;
        this.distanceFromEgo = d;
        this.distanceFromStartOfRoute = d2;
        this.beginSegmentPosition = routeLaneGroupSegmentPosition;
        this.endSegmentPosition = routeLaneGroupSegmentPosition2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneGroupId: ");
        af$$ExternalSyntheticOutline1.m(this.laneGroupId, ", lanes: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.lanes, ", distanceFromEgo: ");
        af$$ExternalSyntheticOutline1.m(this.distanceFromEgo, sb, ", distanceFromStartOfRoute: ");
        m1$$ExternalSyntheticOutline0.m(this.distanceFromStartOfRoute, ", beginSegmentPosition: ", sb);
        sb.append(RecordUtils.fieldToString(this.beginSegmentPosition));
        sb.append(", endSegmentPosition: ");
        sb.append(RecordUtils.fieldToString(this.endSegmentPosition));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.laneGroupId;
        List<RouteLane> list = this.lanes;
        Double d = this.distanceFromEgo;
        double d2 = this.distanceFromStartOfRoute;
        return Objects.hash(Long.valueOf(j), list, d, Double.valueOf(d2), this.beginSegmentPosition, this.endSegmentPosition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLaneGroup routeLaneGroup = (RouteLaneGroup) obj;
        return this.laneGroupId == routeLaneGroup.laneGroupId && Objects.equals(this.lanes, routeLaneGroup.lanes) && Objects.equals(this.distanceFromEgo, routeLaneGroup.distanceFromEgo) && PartialEq.compare(this.distanceFromStartOfRoute, routeLaneGroup.distanceFromStartOfRoute) && Objects.equals(this.beginSegmentPosition, routeLaneGroup.beginSegmentPosition) && Objects.equals(this.endSegmentPosition, routeLaneGroup.endSegmentPosition);
    }
}
