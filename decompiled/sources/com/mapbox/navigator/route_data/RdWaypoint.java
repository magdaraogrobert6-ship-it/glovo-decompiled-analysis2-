package com.mapbox.navigator.route_data;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RdWaypoint implements Serializable {
    private final Double distance;
    private final Point location;
    private final String metadata;
    private final String name;
    private final Point target;
    private final RdWaypointType type;

    public Double getDistance() {
        return this.distance;
    }

    public Point getLocation() {
        return this.location;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public String getName() {
        return this.name;
    }

    public Point getTarget() {
        return this.target;
    }

    public RdWaypointType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.location, this.distance, this.metadata, this.target, this.type);
    }

    public RdWaypoint(String str, Point point, Double d, String str2, Point point2, RdWaypointType rdWaypointType) {
        this.name = str;
        this.location = point;
        this.distance = d;
        this.metadata = str2;
        this.target = point2;
        this.type = rdWaypointType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", location: ");
        c8$$ExternalSyntheticOutline0.m(this.location, sb, ", distance: ");
        af$$ExternalSyntheticOutline1.m(this.distance, sb, ", metadata: ");
        IconCompatParcelizer.read(sb, this.metadata, ", target: ");
        c8$$ExternalSyntheticOutline0.m(this.target, sb, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
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
        RdWaypoint rdWaypoint = (RdWaypoint) obj;
        return Objects.equals(this.name, rdWaypoint.name) && Objects.equals(this.location, rdWaypoint.location) && Objects.equals(this.distance, rdWaypoint.distance) && Objects.equals(this.metadata, rdWaypoint.metadata) && Objects.equals(this.target, rdWaypoint.target) && Objects.equals(this.type, rdWaypoint.type);
    }
}
