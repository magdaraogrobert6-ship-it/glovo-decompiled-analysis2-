package com.huawei.riemann.location.common.bean;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RoadLink {
    private RoadPoint[] curvePoints;
    private String[] endNearId;
    private RoadPoint endPoint;
    private String[] startNearId;
    private RoadPoint startPoint;
    private String linkID = "";
    private int linkType = 0;
    private int trackDirection = 0;
    private boolean isAccess = false;
    private double roadWidth = 0.0d;
    private double roadLength = 0.0d;
    private int speedCategory = 0;
    private boolean isTunnel = false;
    private double roadDirection = 0.0d;

    public RoadPoint getEndPoint() {
        return this.endPoint;
    }

    public String getLinkID() {
        return this.linkID;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public double getRoadDirection() {
        return this.roadDirection;
    }

    public double getRoadLength() {
        return this.roadLength;
    }

    public double getRoadWidth() {
        return this.roadWidth;
    }

    public int getSpeedCategory() {
        return this.speedCategory;
    }

    public RoadPoint getStartPoint() {
        return this.startPoint;
    }

    public int getTrackDirection() {
        return this.trackDirection;
    }

    public boolean isAccess() {
        return this.isAccess;
    }

    public boolean isTunnel() {
        return this.isTunnel;
    }

    public void setEndPoint(RoadPoint roadPoint) {
        this.endPoint = roadPoint;
    }

    public void setIsAccess(boolean z) {
        this.isAccess = z;
    }

    public void setIsTunnel(boolean z) {
        this.isTunnel = z;
    }

    public void setLinkID(String str) {
        this.linkID = str;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setRoadDirection(double d) {
        this.roadDirection = d;
    }

    public void setRoadLength(double d) {
        this.roadLength = d;
    }

    public void setRoadWidth(double d) {
        this.roadWidth = d;
    }

    public void setSpeedCategory(int i) {
        this.speedCategory = i;
    }

    public void setStartPoint(RoadPoint roadPoint) {
        this.startPoint = roadPoint;
    }

    public void setTrackDirection(int i) {
        this.trackDirection = i;
    }

    public void setCurvePoints(ArrayList<RoadPoint> arrayList) {
        if (arrayList != null) {
            this.curvePoints = (RoadPoint[]) arrayList.toArray(new RoadPoint[0]);
        }
    }

    public void setEndNearId(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.endNearId = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public void setStartNearId(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.startNearId = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public RoadPoint[] getCurvePoints() {
        RoadPoint[] roadPointArr = this.curvePoints;
        return roadPointArr == null ? new RoadPoint[0] : (RoadPoint[]) Arrays.copyOf(roadPointArr, roadPointArr.length);
    }

    public String[] getEndNearId() {
        String[] strArr = this.endNearId;
        return strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getStartNearId() {
        String[] strArr = this.startNearId;
        return strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
