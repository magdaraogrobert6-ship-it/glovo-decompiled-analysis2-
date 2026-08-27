package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class Waypoint implements Serializable {
    private final Double distance;
    private final Point location;
    private final String metadata;
    private final String name;
    private final Point target;
    private final TimeZone timeZone;
    private final WaypointType type;

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

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public WaypointType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.location, this.distance, this.metadata, this.target, this.type, this.timeZone);
    }

    public Waypoint(String str, Point point, Double d, String str2, Point point2, WaypointType waypointType, TimeZone timeZone) {
        this.name = str;
        this.location = point;
        this.distance = d;
        this.metadata = str2;
        this.target = point2;
        this.type = waypointType;
        this.timeZone = timeZone;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", location: ");
        c8$$ExternalSyntheticOutline0.m(this.location, sb, ", distance: ");
        af$$ExternalSyntheticOutline1.m(this.distance, sb, ", metadata: ");
        IconCompatParcelizer.read(sb, this.metadata, ", target: ");
        c8$$ExternalSyntheticOutline0.m(this.target, sb, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", timeZone: ");
        sb.append(RecordUtils.fieldToString(this.timeZone));
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
        Waypoint waypoint = (Waypoint) obj;
        return Objects.equals(this.name, waypoint.name) && Objects.equals(this.location, waypoint.location) && Objects.equals(this.distance, waypoint.distance) && Objects.equals(this.metadata, waypoint.metadata) && Objects.equals(this.target, waypoint.target) && Objects.equals(this.type, waypoint.type) && Objects.equals(this.timeZone, waypoint.timeZone);
    }
}
