package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class MatchedRouteObject implements Serializable {
    private final LaneGroupPosition firstPointPosition;
    private final String id;
    private final LaneGroupPosition lastPointPosition;
    private final Geometry shape;

    public LaneGroupPosition getFirstPointPosition() {
        return this.firstPointPosition;
    }

    public String getId() {
        return this.id;
    }

    public LaneGroupPosition getLastPointPosition() {
        return this.lastPointPosition;
    }

    public Geometry getShape() {
        return this.shape;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.shape, this.firstPointPosition, this.lastPointPosition);
    }

    public MatchedRouteObject(String str, Geometry geometry, LaneGroupPosition laneGroupPosition, LaneGroupPosition laneGroupPosition2) {
        this.id = str;
        this.shape = geometry;
        this.firstPointPosition = laneGroupPosition;
        this.lastPointPosition = laneGroupPosition2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", shape: ");
        sb.append(RecordUtils.fieldToString(this.shape));
        sb.append(", firstPointPosition: ");
        sb.append(RecordUtils.fieldToString(this.firstPointPosition));
        sb.append(", lastPointPosition: ");
        sb.append(RecordUtils.fieldToString(this.lastPointPosition));
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
        MatchedRouteObject matchedRouteObject = (MatchedRouteObject) obj;
        return Objects.equals(this.id, matchedRouteObject.id) && Objects.equals(this.shape, matchedRouteObject.shape) && Objects.equals(this.firstPointPosition, matchedRouteObject.firstPointPosition) && Objects.equals(this.lastPointPosition, matchedRouteObject.lastPointPosition);
    }
}
