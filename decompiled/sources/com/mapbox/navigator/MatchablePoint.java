package com.mapbox.navigator;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class MatchablePoint implements Serializable {
    private final Point coordinate;
    private final Double heading;
    private final String id;

    public Point getCoordinate() {
        return this.coordinate;
    }

    public Double getHeading() {
        return this.heading;
    }

    public String getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.coordinate, this.heading);
    }

    public MatchablePoint(String str, Point point, Double d) {
        this.id = str;
        this.coordinate = point;
        this.heading = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", coordinate: ");
        c8$$ExternalSyntheticOutline0.m(this.coordinate, sb, ", heading: ");
        sb.append(RecordUtils.fieldToString(this.heading));
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
        MatchablePoint matchablePoint = (MatchablePoint) obj;
        return Objects.equals(this.id, matchablePoint.id) && Objects.equals(this.coordinate, matchablePoint.coordinate) && Objects.equals(this.heading, matchablePoint.heading);
    }
}
