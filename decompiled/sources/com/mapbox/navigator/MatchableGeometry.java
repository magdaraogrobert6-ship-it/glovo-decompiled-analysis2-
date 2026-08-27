package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class MatchableGeometry implements Serializable {
    private final List<Point> coordinates;
    private final String id;

    public List<Point> getCoordinates() {
        return this.coordinates;
    }

    public String getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.coordinates);
    }

    public MatchableGeometry(String str, List<Point> list) {
        this.id = str;
        this.coordinates = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", coordinates: ");
        return MediaSessionCompatQueueItem.read(this.coordinates, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchableGeometry matchableGeometry = (MatchableGeometry) obj;
        return Objects.equals(this.id, matchableGeometry.id) && Objects.equals(this.coordinates, matchableGeometry.coordinates);
    }
}
