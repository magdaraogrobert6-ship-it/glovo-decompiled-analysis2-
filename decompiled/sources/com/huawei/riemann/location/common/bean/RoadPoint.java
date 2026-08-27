package com.huawei.riemann.location.common.bean;

/* JADX INFO: loaded from: classes5.dex */
public class RoadPoint {
    public static final int ROAD_POINT_COORDINATE_TYPE_GCJ_02 = 2;
    public static final int ROAD_POINT_COORDINATE_TYPE_WGS_84 = 1;
    private int coordinateType;
    private double x;
    private double y;

    public int getCoordinateType() {
        return this.coordinateType;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setCoordinateType(int i) {
        this.coordinateType = i;
    }

    public void setX(double d) {
        this.x = d;
    }

    public void setY(double d) {
        this.y = d;
    }

    public RoadPoint(double d, double d2, int i) {
        this.x = d;
        this.y = d2;
        this.coordinateType = i;
    }
}
