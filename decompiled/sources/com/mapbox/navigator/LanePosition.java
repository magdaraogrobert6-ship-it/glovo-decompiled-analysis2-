package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class LanePosition implements Serializable {
    private final long laneId;
    private final double percentAlong;

    public long getLaneId() {
        return this.laneId;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LanePosition(long j, double d) {
        this.laneId = j;
        this.percentAlong = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneId: ");
        af$$ExternalSyntheticOutline1.m(this.laneId, ", percentAlong: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.percentAlong, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.laneId), Double.valueOf(this.percentAlong));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LanePosition lanePosition = (LanePosition) obj;
        return this.laneId == lanePosition.laneId && PartialEq.compare(this.percentAlong, lanePosition.percentAlong);
    }
}
