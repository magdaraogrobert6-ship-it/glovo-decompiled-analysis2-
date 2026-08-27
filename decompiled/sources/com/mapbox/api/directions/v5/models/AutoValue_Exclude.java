package com.mapbox.api.directions.v5.models;

import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.geojson.Point;
import java.util.List;
import java.util.Map;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Exclude extends Exclude {
    private final List<String> criteria;
    private final List<Point> points;
    private final Map<String, SerializableJsonElement> unrecognized;

    public static final class Builder extends Exclude.Builder {
        private List<String> criteria;
        private List<Point> points;
        private Map<String, SerializableJsonElement> unrecognized;

        @Override // com.mapbox.api.directions.v5.models.Exclude.Builder
        public Exclude.Builder criteria(List<String> list) {
            this.criteria = list;
            return this;
        }

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
            return unrecognized((Map<String, SerializableJsonElement>) map);
        }

        @Override // com.mapbox.api.directions.v5.models.Exclude.Builder
        public Exclude build() {
            return new AutoValue_Exclude(this.unrecognized, this.criteria, this.points);
        }

        @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
        public Exclude.Builder unrecognized(Map<String, SerializableJsonElement> map) {
            this.unrecognized = map;
            return this;
        }
    }

    @Override // com.mapbox.api.directions.v5.models.Exclude
    public List<String> criteria() {
        return this.criteria;
    }

    @Override // com.mapbox.api.directions.v5.models.Exclude
    public List<Point> points() {
        return this.points;
    }

    @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
    public Map<String, SerializableJsonElement> unrecognized() {
        return this.unrecognized;
    }

    private AutoValue_Exclude(Map<String, SerializableJsonElement> map, List<String> list, List<Point> list2) {
        this.unrecognized = map;
        this.criteria = list;
        this.points = list2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Exclude)) {
            return false;
        }
        Exclude exclude = (Exclude) obj;
        Map<String, SerializableJsonElement> map = this.unrecognized;
        if (map == null) {
            if (exclude.unrecognized() != null) {
                return false;
            }
        } else if (!map.equals(exclude.unrecognized())) {
            return false;
        }
        List<String> list = this.criteria;
        if (list == null) {
            if (exclude.criteria() != null) {
                return false;
            }
        } else if (!list.equals(exclude.criteria())) {
            return false;
        }
        List<Point> list2 = this.points;
        if (list2 == null) {
            if (exclude.points() != null) {
                return false;
            }
        } else if (!list2.equals(exclude.points())) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Exclude{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", criteria=");
        sb.append(this.criteria);
        sb.append(", points=");
        return MediaSessionCompatQueueItem.read(sb, this.points, "}");
    }

    public int hashCode() {
        Map<String, SerializableJsonElement> map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        List<String> list = this.criteria;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<Point> list2 = this.points;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
    }
}
