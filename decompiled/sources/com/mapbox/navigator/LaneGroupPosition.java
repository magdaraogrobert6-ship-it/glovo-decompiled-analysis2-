package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class LaneGroupPosition implements Serializable {
    private final long laneGroupId;
    private final double percentAlong;

    public long getLaneGroupId() {
        return this.laneGroupId;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneGroupPosition(long j, double d) {
        this.laneGroupId = j;
        this.percentAlong = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneGroupId: ");
        af$$ExternalSyntheticOutline1.m(this.laneGroupId, ", percentAlong: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.percentAlong, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.laneGroupId), Double.valueOf(this.percentAlong));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneGroupPosition laneGroupPosition = (LaneGroupPosition) obj;
        return this.laneGroupId == laneGroupPosition.laneGroupId && PartialEq.compare(this.percentAlong, laneGroupPosition.percentAlong);
    }
}
