package com.mapbox.navigator.match.openlr;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class POIWithAccessPointLocationReference implements Serializable {
    private final Point coord;
    private final Orientation orientation;
    private final List<LocationReferencePoint> points;
    private final double positiveOffset;
    private final SideOfRoad sideOfRoad;

    public Point getCoord() {
        return this.coord;
    }

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
        return Objects.hash(list, Double.valueOf(d), this.coord, this.orientation, this.sideOfRoad);
    }

    public POIWithAccessPointLocationReference(List<LocationReferencePoint> list, double d, Point point, Orientation orientation, SideOfRoad sideOfRoad) {
        this.points = list;
        this.positiveOffset = d;
        this.coord = point;
        this.orientation = orientation;
        this.sideOfRoad = sideOfRoad;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[points: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.points, ", positiveOffset: ");
        m1$$ExternalSyntheticOutline0.m(this.positiveOffset, ", coord: ", sb);
        c8$$ExternalSyntheticOutline0.m(this.coord, sb, ", orientation: ");
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
        POIWithAccessPointLocationReference pOIWithAccessPointLocationReference = (POIWithAccessPointLocationReference) obj;
        return Objects.equals(this.points, pOIWithAccessPointLocationReference.points) && PartialEq.compare(this.positiveOffset, pOIWithAccessPointLocationReference.positiveOffset) && Objects.equals(this.coord, pOIWithAccessPointLocationReference.coord) && Objects.equals(this.orientation, pOIWithAccessPointLocationReference.orientation) && Objects.equals(this.sideOfRoad, pOIWithAccessPointLocationReference.sideOfRoad);
    }
}
