package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class LaneMatching implements Serializable {
    private final boolean isLaneChange;
    private final MatchedLaneInfo laneInfo;
    private final LanePosition lanePosition;
    private final List<MatchedDetectedObject> matchedDetectedObjects;
    private final FixDirectedCoordinate smoothedCoordinate;
    private final LanePosition smoothedLanePosition;
    private final FixDirectedCoordinate snappedCoordinate;

    public boolean getIsLaneChange() {
        return this.isLaneChange;
    }

    public MatchedLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    public LanePosition getLanePosition() {
        return this.lanePosition;
    }

    public List<MatchedDetectedObject> getMatchedDetectedObjects() {
        return this.matchedDetectedObjects;
    }

    public FixDirectedCoordinate getSmoothedCoordinate() {
        return this.smoothedCoordinate;
    }

    public LanePosition getSmoothedLanePosition() {
        return this.smoothedLanePosition;
    }

    public FixDirectedCoordinate getSnappedCoordinate() {
        return this.snappedCoordinate;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.smoothedCoordinate, this.smoothedLanePosition, this.snappedCoordinate, this.lanePosition, this.laneInfo, this.matchedDetectedObjects, Boolean.valueOf(this.isLaneChange));
    }

    public LaneMatching(FixDirectedCoordinate fixDirectedCoordinate, LanePosition lanePosition, FixDirectedCoordinate fixDirectedCoordinate2, LanePosition lanePosition2, MatchedLaneInfo matchedLaneInfo, List<MatchedDetectedObject> list, boolean z) {
        this.smoothedCoordinate = fixDirectedCoordinate;
        this.smoothedLanePosition = lanePosition;
        this.snappedCoordinate = fixDirectedCoordinate2;
        this.lanePosition = lanePosition2;
        this.laneInfo = matchedLaneInfo;
        this.matchedDetectedObjects = list;
        this.isLaneChange = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[smoothedCoordinate: ");
        sb.append(RecordUtils.fieldToString(this.smoothedCoordinate));
        sb.append(", smoothedLanePosition: ");
        sb.append(RecordUtils.fieldToString(this.smoothedLanePosition));
        sb.append(", snappedCoordinate: ");
        sb.append(RecordUtils.fieldToString(this.snappedCoordinate));
        sb.append(", lanePosition: ");
        sb.append(RecordUtils.fieldToString(this.lanePosition));
        sb.append(", laneInfo: ");
        sb.append(RecordUtils.fieldToString(this.laneInfo));
        sb.append(", matchedDetectedObjects: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.matchedDetectedObjects, ", isLaneChange: ");
        return ff$$ExternalSyntheticOutline0.m(this.isLaneChange, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneMatching laneMatching = (LaneMatching) obj;
        return Objects.equals(this.smoothedCoordinate, laneMatching.smoothedCoordinate) && Objects.equals(this.smoothedLanePosition, laneMatching.smoothedLanePosition) && Objects.equals(this.snappedCoordinate, laneMatching.snappedCoordinate) && Objects.equals(this.lanePosition, laneMatching.lanePosition) && Objects.equals(this.laneInfo, laneMatching.laneInfo) && Objects.equals(this.matchedDetectedObjects, laneMatching.matchedDetectedObjects) && this.isLaneChange == laneMatching.isLaneChange;
    }
}
