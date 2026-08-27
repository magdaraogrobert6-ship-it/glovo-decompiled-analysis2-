package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class RouteLane implements Serializable {
    private final int connectedLaneSequenceIndex;
    private final RouteLaneDivergency divergency;
    private final long laneId;

    public int getConnectedLaneSequenceIndex() {
        return this.connectedLaneSequenceIndex;
    }

    public RouteLaneDivergency getDivergency() {
        return this.divergency;
    }

    public long getLaneId() {
        return this.laneId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteLane(long j, RouteLaneDivergency routeLaneDivergency, int i) {
        this.laneId = j;
        this.divergency = routeLaneDivergency;
        this.connectedLaneSequenceIndex = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneId: ");
        af$$ExternalSyntheticOutline1.m(this.laneId, ", divergency: ", sb);
        sb.append(RecordUtils.fieldToString(this.divergency));
        sb.append(", connectedLaneSequenceIndex: ");
        return SweepGradientShader9KIMszodefault.serializer(this.connectedLaneSequenceIndex, "]", sb);
    }

    public int hashCode() {
        long j = this.laneId;
        return Objects.hash(Long.valueOf(j), this.divergency, Integer.valueOf(this.connectedLaneSequenceIndex));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteLane routeLane = (RouteLane) obj;
        return this.laneId == routeLane.laneId && Objects.equals(this.divergency, routeLane.divergency) && this.connectedLaneSequenceIndex == routeLane.connectedLaneSequenceIndex;
    }
}
