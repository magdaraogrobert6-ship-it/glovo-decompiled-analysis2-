package com.huawei.location.nlp.network.request;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class IndoorLocation {
    private float acc;
    private String buildingId;
    private int flags;
    private int floor;
    private float floorAcc;
    private double lat;
    private double lon;
    private long time;

    public float getAcc() {
        return this.acc;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public int getFlags() {
        return this.flags;
    }

    public int getFloor() {
        return this.floor;
    }

    public float getFloorAcc() {
        return this.floorAcc;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLon() {
        return this.lon;
    }

    public long getTime() {
        return this.time;
    }

    public void setAcc(float f) {
        this.acc = f;
    }

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setFloor(int i) {
        this.floor = i;
    }

    public void setFloorAcc(float f) {
        this.floorAcc = f;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public void setLon(double d) {
        this.lon = d;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorLocation{lat=");
        sb.append(this.lat);
        sb.append(", lon=");
        sb.append(this.lon);
        sb.append(", acc=");
        sb.append(this.acc);
        sb.append(", buildingId='");
        sb.append(this.buildingId);
        sb.append("', floor=");
        sb.append(this.floor);
        sb.append(", floorAcc=");
        sb.append(this.floorAcc);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", flags=");
        return af$$ExternalSyntheticOutline0.m(sb, this.flags, '}');
    }
}
