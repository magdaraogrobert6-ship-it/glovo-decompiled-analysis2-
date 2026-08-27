package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.match.openlr.OpenLR;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UnmatchedRoadObjectGeometry {
    private Type type;
    private Object value;

    public enum Type {
        OPEN_LR,
        POINT,
        LIST
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static UnmatchedRoadObjectGeometry valueOf(OpenLR openLR) {
        return new UnmatchedRoadObjectGeometry(openLR);
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isOpenLR() {
        return this.type == Type.OPEN_LR;
    }

    public boolean isPoint() {
        return this.type == Type.POINT;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public UnmatchedRoadObjectGeometry(OpenLR openLR) {
        this.type = Type.OPEN_LR;
        this.value = openLR;
    }

    public static UnmatchedRoadObjectGeometry valueOf(Point point) {
        return new UnmatchedRoadObjectGeometry(point);
    }

    public List<Point> getList() {
        if (isList()) {
            return (List) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (List<Point>)");
        return null;
    }

    public OpenLR getOpenLR() {
        if (isOpenLR()) {
            return (OpenLR) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (com.mapbox.navigator.match.openlr.OpenLR)");
        return null;
    }

    public Point getPoint() {
        if (isPoint()) {
            return (Point) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (Point)");
        return null;
    }

    public static UnmatchedRoadObjectGeometry valueOf(List<Point> list) {
        return new UnmatchedRoadObjectGeometry(list);
    }

    public UnmatchedRoadObjectGeometry(Point point) {
        this.type = Type.POINT;
        this.value = point;
    }

    public UnmatchedRoadObjectGeometry(List<Point> list) {
        this.type = Type.LIST;
        this.value = list;
    }
}
