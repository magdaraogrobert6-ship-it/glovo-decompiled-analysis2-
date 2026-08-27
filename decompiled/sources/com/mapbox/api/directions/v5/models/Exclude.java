package com.mapbox.api.directions.v5.models;

import com.mapbox.geojson.Point;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Exclude extends DirectionsJsonObject {
    private static final Set<String> VALID_EXCLUDE_CRITERIA = new HashSet<String>() { // from class: com.mapbox.api.directions.v5.models.Exclude.1
        {
            add("ferry");
            add("motorway");
            add("toll");
            add("tunnel");
            add("restricted");
            add("cash_only_tolls");
            add("unpaved");
        }
    };

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Exclude build();

        public abstract Builder criteria(List<String> list);
    }

    public abstract List<String> criteria();

    public abstract List<Point> points();

    private void appendPoint(StringBuilder sb, Point point) {
        sb.append("point(");
        sb.append(point.longitude());
        sb.append(' ');
        sb.append(point.latitude());
        sb.append(')');
    }

    public static Builder builder() {
        return new AutoValue_Exclude.Builder();
    }

    private void appendCriterias(StringBuilder sb) {
        if (criteria() != null) {
            for (String str : criteria()) {
                if (sb.length() != 0) {
                    sb.append(',');
                }
                sb.append(str);
            }
        }
    }

    private void appendPoints(StringBuilder sb) {
        if (points() != null) {
            for (Point point : points()) {
                if (sb.length() != 0) {
                    sb.append(",");
                }
                appendPoint(sb, point);
            }
        }
    }

    public String toUrlQueryParameter() {
        if (points() == null && criteria() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        appendPoints(sb);
        appendCriterias(sb);
        return sb.toString();
    }
}
