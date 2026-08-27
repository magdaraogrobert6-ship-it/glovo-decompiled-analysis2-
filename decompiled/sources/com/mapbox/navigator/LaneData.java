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
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public class LaneData implements Serializable {
    private final long id;
    private final List<Long> incomingLaneIds;
    private final long laneGroupId;
    private final LaneType laneType;
    private final Long leftLaneId;
    private final LaneSeparatorType leftLaneSeparator;
    private final double length;
    private final Long oncomingLaneId;
    private final List<Long> outboundLaneIds;
    private final Long rightLaneId;
    private final LaneSeparatorType rightLaneSeparator;

    public long getId() {
        return this.id;
    }

    public List<Long> getIncomingLaneIds() {
        return this.incomingLaneIds;
    }

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    public LaneType getLaneType() {
        return this.laneType;
    }

    public Long getLeftLaneId() {
        return this.leftLaneId;
    }

    public LaneSeparatorType getLeftLaneSeparator() {
        return this.leftLaneSeparator;
    }

    public double getLength() {
        return this.length;
    }

    public Long getOncomingLaneId() {
        return this.oncomingLaneId;
    }

    public List<Long> getOutboundLaneIds() {
        return this.outboundLaneIds;
    }

    public Long getRightLaneId() {
        return this.rightLaneId;
    }

    public LaneSeparatorType getRightLaneSeparator() {
        return this.rightLaneSeparator;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneData(long j, long j2, double d, Long l, Long l2, List<Long> list, List<Long> list2, LaneSeparatorType laneSeparatorType, LaneSeparatorType laneSeparatorType2, Long l3, LaneType laneType) {
        this.id = j;
        this.laneGroupId = j2;
        this.length = d;
        this.rightLaneId = l;
        this.leftLaneId = l2;
        this.outboundLaneIds = list;
        this.incomingLaneIds = list2;
        this.rightLaneSeparator = laneSeparatorType;
        this.leftLaneSeparator = laneSeparatorType2;
        this.oncomingLaneId = l3;
        this.laneType = laneType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        af$$ExternalSyntheticOutline1.m(this.id, ", laneGroupId: ", sb);
        af$$ExternalSyntheticOutline1.m(this.laneGroupId, ", length: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.length, ", rightLaneId: ", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.rightLaneId, sb, ", leftLaneId: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.leftLaneId, sb, ", outboundLaneIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.outboundLaneIds, ", incomingLaneIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.incomingLaneIds, ", rightLaneSeparator: ");
        sb.append(RecordUtils.fieldToString(this.rightLaneSeparator));
        sb.append(", leftLaneSeparator: ");
        sb.append(RecordUtils.fieldToString(this.leftLaneSeparator));
        sb.append(", oncomingLaneId: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.oncomingLaneId, sb, ", laneType: ");
        sb.append(RecordUtils.fieldToString(this.laneType));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.id;
        long j2 = this.laneGroupId;
        double d = this.length;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), Double.valueOf(d), this.rightLaneId, this.leftLaneId, this.outboundLaneIds, this.incomingLaneIds, this.rightLaneSeparator, this.leftLaneSeparator, this.oncomingLaneId, this.laneType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneData laneData = (LaneData) obj;
        return this.id == laneData.id && this.laneGroupId == laneData.laneGroupId && PartialEq.compare(this.length, laneData.length) && Objects.equals(this.rightLaneId, laneData.rightLaneId) && Objects.equals(this.leftLaneId, laneData.leftLaneId) && Objects.equals(this.outboundLaneIds, laneData.outboundLaneIds) && Objects.equals(this.incomingLaneIds, laneData.incomingLaneIds) && Objects.equals(this.rightLaneSeparator, laneData.rightLaneSeparator) && Objects.equals(this.leftLaneSeparator, laneData.leftLaneSeparator) && Objects.equals(this.oncomingLaneId, laneData.oncomingLaneId) && Objects.equals(this.laneType, laneData.laneType);
    }
}
