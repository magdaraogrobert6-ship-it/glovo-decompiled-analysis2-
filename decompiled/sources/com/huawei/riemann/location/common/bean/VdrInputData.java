package com.huawei.riemann.location.common.bean;

import android.location.Location;

/* JADX INFO: loaded from: classes5.dex */
public class VdrInputData {
    private Acceleration acc;
    private final DataType dataType;
    private GnssInfo gnssInfo;
    private Gyroscope gyro;
    private Location location;
    private RoadArea roadArea;
    private TemperatureInfo temperatureInfo;
    private Vehicle vehicle;
    private WheelAngleInfo wheelAngleInfo;

    public enum DataType {
        ACC,
        GYRO,
        VEHICLE,
        LOCATION,
        GNSS_INFO,
        ROAD_AREA,
        WHEEL_ANGLE,
        TEMPERATURE
    }

    public Acceleration getAcc() {
        return this.acc;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public GnssInfo getGnssInfo() {
        return this.gnssInfo;
    }

    public Gyroscope getGyro() {
        return this.gyro;
    }

    public Location getLocation() {
        return this.location;
    }

    public RoadArea getRoadArea() {
        return this.roadArea;
    }

    public TemperatureInfo getTemperatureInfo() {
        return this.temperatureInfo;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public WheelAngleInfo getWheelAngleInfo() {
        return this.wheelAngleInfo;
    }

    public VdrInputData(Location location) {
        this.dataType = DataType.LOCATION;
        this.location = location;
    }

    public String toString() {
        return "VdrInputData{dataType=" + this.dataType + ", acc=" + this.acc + ", gyro=" + this.gyro + ", vehicle=" + this.vehicle + ", location=" + this.location + ", gnssInfo=" + this.gnssInfo + '}';
    }

    public VdrInputData(Acceleration acceleration) {
        this.dataType = DataType.ACC;
        this.acc = acceleration;
    }

    public VdrInputData(GnssInfo gnssInfo) {
        this.dataType = DataType.GNSS_INFO;
        this.gnssInfo = gnssInfo;
    }

    public VdrInputData(Gyroscope gyroscope) {
        this.dataType = DataType.GYRO;
        this.gyro = gyroscope;
    }

    public VdrInputData(RoadArea roadArea) {
        this.dataType = DataType.ROAD_AREA;
        this.roadArea = roadArea;
    }

    public VdrInputData(TemperatureInfo temperatureInfo) {
        this.dataType = DataType.TEMPERATURE;
        this.temperatureInfo = temperatureInfo;
    }

    public VdrInputData(Vehicle vehicle) {
        this.dataType = DataType.VEHICLE;
        this.vehicle = vehicle;
    }

    public VdrInputData(WheelAngleInfo wheelAngleInfo) {
        this.dataType = DataType.WHEEL_ANGLE;
        this.wheelAngleInfo = wheelAngleInfo;
    }
}
