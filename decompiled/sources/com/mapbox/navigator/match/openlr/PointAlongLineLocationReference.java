package com.mapbox.navigator.match.openlr;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class PointAlongLineLocationReference implements Serializable {
    private final Orientation orientation;
    private final List<LocationReferencePoint> points;
    private final double positiveOffset;
    private final SideOfRoad sideOfRoad;

    public Orientation getOrientation() {
        return this.orientation;
    }

    public List<LocationReferencePoint> getPoints() {
        return this.points;
    }

    public double getPositiveOffset() {
        return this.positiveOffset;
    }

    public SideOfRoad getSideOfRoad() {
        return this.sideOfRoad;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        List<LocationReferencePoint> list = this.points;
        double d = this.positiveOffset;
        return Objects.hash(list, Double.valueOf(d), this.orientation, this.sideOfRoad);
    }

    public PointAlongLineLocationReference(List<LocationReferencePoint> list, double d, Orientation orientation, SideOfRoad sideOfRoad) {
        this.points = list;
        this.positiveOffset = d;
        this.orientation = orientation;
        this.sideOfRoad = sideOfRoad;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[points: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.points, ", positiveOffset: ");
        m1$$ExternalSyntheticOutline0.m(this.positiveOffset, ", orientation: ", sb);
        sb.append(RecordUtils.fieldToString(this.orientation));
        sb.append(", sideOfRoad: ");
        sb.append(RecordUtils.fieldToString(this.sideOfRoad));
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
        PointAlongLineLocationReference pointAlongLineLocationReference = (PointAlongLineLocationReference) obj;
        return Objects.equals(this.points, pointAlongLineLocationReference.points) && PartialEq.compare(this.positiveOffset, pointAlongLineLocationReference.positiveOffset) && Objects.equals(this.orientation, pointAlongLineLocationReference.orientation) && Objects.equals(this.sideOfRoad, pointAlongLineLocationReference.sideOfRoad);
    }
}
