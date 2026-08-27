package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class RoadObjectDistanceInfo {
    private Type type;
    private Object value;

    public enum Type {
        POINT_DISTANCE_INFO,
        GANTRY_DISTANCE_INFO,
        POLYGON_DISTANCE_INFO,
        SUB_GRAPH_DISTANCE_INFO,
        LINE_DISTANCE_INFO
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static RoadObjectDistanceInfo valueOf(PointDistanceInfo pointDistanceInfo) {
        return new RoadObjectDistanceInfo(pointDistanceInfo);
    }

    public boolean isGantryDistanceInfo() {
        return this.type == Type.GANTRY_DISTANCE_INFO;
    }

    public boolean isLineDistanceInfo() {
        return this.type == Type.LINE_DISTANCE_INFO;
    }

    public boolean isPointDistanceInfo() {
        return this.type == Type.POINT_DISTANCE_INFO;
    }

    public boolean isPolygonDistanceInfo() {
        return this.type == Type.POLYGON_DISTANCE_INFO;
    }

    public boolean isSubGraphDistanceInfo() {
        return this.type == Type.SUB_GRAPH_DISTANCE_INFO;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public RoadObjectDistanceInfo(PointDistanceInfo pointDistanceInfo) {
        this.type = Type.POINT_DISTANCE_INFO;
        this.value = pointDistanceInfo;
    }

    public static RoadObjectDistanceInfo valueOf(GantryDistanceInfo gantryDistanceInfo) {
        return new RoadObjectDistanceInfo(gantryDistanceInfo);
    }

    public GantryDistanceInfo getGantryDistanceInfo() {
        if (isGantryDistanceInfo()) {
            return (GantryDistanceInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (GantryDistanceInfo)");
        return null;
    }

    public LineDistanceInfo getLineDistanceInfo() {
        if (isLineDistanceInfo()) {
            return (LineDistanceInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (LineDistanceInfo)");
        return null;
    }

    public PointDistanceInfo getPointDistanceInfo() {
        if (isPointDistanceInfo()) {
            return (PointDistanceInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PointDistanceInfo)");
        return null;
    }

    public PolygonDistanceInfo getPolygonDistanceInfo() {
        if (isPolygonDistanceInfo()) {
            return (PolygonDistanceInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PolygonDistanceInfo)");
        return null;
    }

    public SubGraphDistanceInfo getSubGraphDistanceInfo() {
        if (isSubGraphDistanceInfo()) {
            return (SubGraphDistanceInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (SubGraphDistanceInfo)");
        return null;
    }

    public static RoadObjectDistanceInfo valueOf(PolygonDistanceInfo polygonDistanceInfo) {
        return new RoadObjectDistanceInfo(polygonDistanceInfo);
    }

    public static RoadObjectDistanceInfo valueOf(SubGraphDistanceInfo subGraphDistanceInfo) {
        return new RoadObjectDistanceInfo(subGraphDistanceInfo);
    }

    public static RoadObjectDistanceInfo valueOf(LineDistanceInfo lineDistanceInfo) {
        return new RoadObjectDistanceInfo(lineDistanceInfo);
    }

    public RoadObjectDistanceInfo(GantryDistanceInfo gantryDistanceInfo) {
        this.type = Type.GANTRY_DISTANCE_INFO;
        this.value = gantryDistanceInfo;
    }

    public RoadObjectDistanceInfo(PolygonDistanceInfo polygonDistanceInfo) {
        this.type = Type.POLYGON_DISTANCE_INFO;
        this.value = polygonDistanceInfo;
    }

    public RoadObjectDistanceInfo(SubGraphDistanceInfo subGraphDistanceInfo) {
        this.type = Type.SUB_GRAPH_DISTANCE_INFO;
        this.value = subGraphDistanceInfo;
    }

    public RoadObjectDistanceInfo(LineDistanceInfo lineDistanceInfo) {
        this.type = Type.LINE_DISTANCE_INFO;
        this.value = lineDistanceInfo;
    }
}
