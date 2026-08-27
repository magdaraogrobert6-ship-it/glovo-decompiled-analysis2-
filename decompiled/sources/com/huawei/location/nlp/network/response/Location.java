package com.huawei.location.nlp.network.response;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public class Location {
    private float acc;
    private float bearing;
    private String buildingId;
    private String extraInfo;
    private short flags;
    private int floor;
    private int floorAcc;
    private double lat;
    private double lon;
    private float speed;
    private long time;

    public float getAccuracy() {
        return this.acc;
    }

    public float getBearing() {
        return this.bearing;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public short getFlags() {
        return this.flags;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getFloorAcc() {
        return this.floorAcc;
    }

    public double getLatitude() {
        return this.lat;
    }

    public double getLongitude() {
        return this.lon;
    }

    public float getSpeed() {
        return this.speed;
    }

    public long getTime() {
        return this.time;
    }

    public void setAccuracy(float f) {
        this.acc = f;
    }

    public void setBearing(float f) {
        this.bearing = f;
    }

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setFlags(short s) {
        this.flags = s;
    }

    public void setFloor(int i) {
        this.floor = i;
    }

    public void setFloorAcc(int i) {
        this.floorAcc = i;
    }

    public void setLatitude(double d) {
        this.lat = d;
    }

    public void setLongitude(double d) {
        this.lon = d;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Location{lat=");
        sb.append(this.lat);
        sb.append(", lon=");
        sb.append(this.lon);
        sb.append(", acc=");
        sb.append(this.acc);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", bearing=");
        sb.append(this.bearing);
        sb.append(", flags=");
        sb.append((int) this.flags);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", buildingId='");
        sb.append(this.buildingId);
        sb.append("', floor=");
        sb.append(this.floor);
        sb.append(", floorAcc=");
        sb.append(this.floorAcc);
        sb.append(", extraInfo='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.extraInfo, "'}");
    }
}
