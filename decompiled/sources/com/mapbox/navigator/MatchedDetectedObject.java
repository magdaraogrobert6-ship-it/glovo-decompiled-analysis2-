package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class MatchedDetectedObject implements Serializable {
    private final FixDirectedCoordinate coordinate;
    private final String id;
    private final MatchedLaneInfo laneInfo;

    public FixDirectedCoordinate getCoordinate() {
        return this.coordinate;
    }

    public String getId() {
        return this.id;
    }

    public MatchedLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.coordinate, this.laneInfo);
    }

    public MatchedDetectedObject(String str, FixDirectedCoordinate fixDirectedCoordinate, MatchedLaneInfo matchedLaneInfo) {
        this.id = str;
        this.coordinate = fixDirectedCoordinate;
        this.laneInfo = matchedLaneInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", coordinate: ");
        sb.append(RecordUtils.fieldToString(this.coordinate));
        sb.append(", laneInfo: ");
        sb.append(RecordUtils.fieldToString(this.laneInfo));
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
        MatchedDetectedObject matchedDetectedObject = (MatchedDetectedObject) obj;
        return Objects.equals(this.id, matchedDetectedObject.id) && Objects.equals(this.coordinate, matchedDetectedObject.coordinate) && Objects.equals(this.laneInfo, matchedDetectedObject.laneInfo);
    }
}
