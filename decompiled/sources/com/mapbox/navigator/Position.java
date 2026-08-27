package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class Position implements Serializable {
    private final Point coordinate;
    private final GraphPosition position;

    public Point getCoordinate() {
        return this.coordinate;
    }

    public GraphPosition getPosition() {
        return this.position;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.position, this.coordinate);
    }

    public Position(GraphPosition graphPosition, Point point) {
        this.position = graphPosition;
        this.coordinate = point;
    }

    public String toString() {
        return "[position: " + RecordUtils.fieldToString(this.position) + ", coordinate: " + RecordUtils.fieldToString(this.coordinate) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Position position = (Position) obj;
        return Objects.equals(this.position, position.position) && Objects.equals(this.coordinate, position.coordinate);
    }
}
