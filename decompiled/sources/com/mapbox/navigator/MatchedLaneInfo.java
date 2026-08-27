package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class MatchedLaneInfo implements Serializable {
    private final Integer currentLaneIndex;
    private final Double currentLaneOffset;
    private final Double currentLaneWidth;
    private final Integer laneCount;

    public Integer getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public Double getCurrentLaneOffset() {
        return this.currentLaneOffset;
    }

    public Double getCurrentLaneWidth() {
        return this.currentLaneWidth;
    }

    public Integer getLaneCount() {
        return this.laneCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.laneCount, this.currentLaneIndex, this.currentLaneWidth, this.currentLaneOffset);
    }

    public MatchedLaneInfo(Integer num, Integer num2, Double d, Double d2) {
        this.laneCount = num;
        this.currentLaneIndex = num2;
        this.currentLaneWidth = d;
        this.currentLaneOffset = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneCount: ");
        SweepGradientShader9KIMszodefault.read(this.laneCount, ", currentLaneIndex: ", sb);
        SweepGradientShader9KIMszodefault.read(this.currentLaneIndex, ", currentLaneWidth: ", sb);
        af$$ExternalSyntheticOutline1.m(this.currentLaneWidth, sb, ", currentLaneOffset: ");
        sb.append(RecordUtils.fieldToString(this.currentLaneOffset));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchedLaneInfo matchedLaneInfo = (MatchedLaneInfo) obj;
        return Objects.equals(this.laneCount, matchedLaneInfo.laneCount) && Objects.equals(this.currentLaneIndex, matchedLaneInfo.currentLaneIndex) && Objects.equals(this.currentLaneWidth, matchedLaneInfo.currentLaneWidth) && Objects.equals(this.currentLaneOffset, matchedLaneInfo.currentLaneOffset);
    }
}
