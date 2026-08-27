package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class LaneGroupMatching implements Serializable {
    private final LaneGroupPosition laneGroupPosition;
    private final FixDirectedCoordinate smoothedCoordinate;
    private final FixDirectedCoordinate snappedCoordinate;

    public LaneGroupPosition getLaneGroupPosition() {
        return this.laneGroupPosition;
    }

    public FixDirectedCoordinate getSmoothedCoordinate() {
        return this.smoothedCoordinate;
    }

    public FixDirectedCoordinate getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.laneGroupPosition, this.snappedCoordinate, this.smoothedCoordinate);
    }

    public LaneGroupMatching(LaneGroupPosition laneGroupPosition, FixDirectedCoordinate fixDirectedCoordinate, FixDirectedCoordinate fixDirectedCoordinate2) {
        this.laneGroupPosition = laneGroupPosition;
        this.snappedCoordinate = fixDirectedCoordinate;
        this.smoothedCoordinate = fixDirectedCoordinate2;
    }

    public String toString() {
        return "[laneGroupPosition: " + RecordUtils.fieldToString(this.laneGroupPosition) + ", snappedCoordinate: " + RecordUtils.fieldToString(this.snappedCoordinate) + ", smoothedCoordinate: " + RecordUtils.fieldToString(this.smoothedCoordinate) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneGroupMatching laneGroupMatching = (LaneGroupMatching) obj;
        return Objects.equals(this.laneGroupPosition, laneGroupMatching.laneGroupPosition) && Objects.equals(this.snappedCoordinate, laneGroupMatching.snappedCoordinate) && Objects.equals(this.smoothedCoordinate, laneGroupMatching.smoothedCoordinate);
    }
}
