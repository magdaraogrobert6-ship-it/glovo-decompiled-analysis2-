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
import o.MediaSessionCompatQueueItem;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public class LaneGroupData implements Serializable {
    private final Long elevationId;
    private final long id;
    private final List<Long> incomingLaneGroupIds;
    private final boolean isJunction;
    private final boolean isTunnel;
    private final List<Long> laneIds;
    private final double length;
    private final Long oncomingLaneGroupId;
    private final List<Long> outboundLaneGroupIds;
    private final long zLevel;

    public Long getElevationId() {
        return this.elevationId;
    }

    public long getId() {
        return this.id;
    }

    public List<Long> getIncomingLaneGroupIds() {
        return this.incomingLaneGroupIds;
    }

    public boolean getIsJunction() {
        return this.isJunction;
    }

    public boolean getIsTunnel() {
        return this.isTunnel;
    }

    public List<Long> getLaneIds() {
        return this.laneIds;
    }

    public double getLength() {
        return this.length;
    }

    public Long getOncomingLaneGroupId() {
        return this.oncomingLaneGroupId;
    }

    public List<Long> getOutboundLaneGroupIds() {
        return this.outboundLaneGroupIds;
    }

    public long getZLevel() {
        return this.zLevel;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneGroupData(long j, List<Long> list, double d, boolean z, boolean z2, List<Long> list2, List<Long> list3, long j2, Long l, Long l2) {
        this.id = j;
        this.laneIds = list;
        this.length = d;
        this.isJunction = z;
        this.isTunnel = z2;
        this.outboundLaneGroupIds = list2;
        this.incomingLaneGroupIds = list3;
        this.zLevel = j2;
        this.elevationId = l;
        this.oncomingLaneGroupId = l2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        af$$ExternalSyntheticOutline1.m(this.id, ", laneIds: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.laneIds, ", length: ");
        m1$$ExternalSyntheticOutline0.m(this.length, ", isJunction: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.isJunction, ", isTunnel: ");
        MediaSessionCompatQueueItem.write(sb, this.isTunnel, ", outboundLaneGroupIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.outboundLaneGroupIds, ", incomingLaneGroupIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.incomingLaneGroupIds, ", zLevel: ");
        af$$ExternalSyntheticOutline1.m(this.zLevel, ", elevationId: ", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.elevationId, sb, ", oncomingLaneGroupId: ");
        sb.append(RecordUtils.fieldToString(this.oncomingLaneGroupId));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.id;
        List<Long> list = this.laneIds;
        double d = this.length;
        boolean z = this.isJunction;
        boolean z2 = this.isTunnel;
        List<Long> list2 = this.outboundLaneGroupIds;
        List<Long> list3 = this.incomingLaneGroupIds;
        long j2 = this.zLevel;
        return Objects.hash(Long.valueOf(j), list, Double.valueOf(d), Boolean.valueOf(z), Boolean.valueOf(z2), list2, list3, Long.valueOf(j2), this.elevationId, this.oncomingLaneGroupId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneGroupData laneGroupData = (LaneGroupData) obj;
        return this.id == laneGroupData.id && Objects.equals(this.laneIds, laneGroupData.laneIds) && PartialEq.compare(this.length, laneGroupData.length) && this.isJunction == laneGroupData.isJunction && this.isTunnel == laneGroupData.isTunnel && Objects.equals(this.outboundLaneGroupIds, laneGroupData.outboundLaneGroupIds) && Objects.equals(this.incomingLaneGroupIds, laneGroupData.incomingLaneGroupIds) && this.zLevel == laneGroupData.zLevel && Objects.equals(this.elevationId, laneGroupData.elevationId) && Objects.equals(this.oncomingLaneGroupId, laneGroupData.oncomingLaneGroupId);
    }
}
