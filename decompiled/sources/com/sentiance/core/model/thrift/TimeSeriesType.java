package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum TimeSeriesType {
    ACCELEROMETER(1),
    GYROSCOPE(2),
    MAGNETOMETER(3),
    ACCELEROMETER_ANDROID_G(4),
    QUATERNION(5);

    public final int value;

    TimeSeriesType(int i) {
        this.value = i;
    }

    public static TimeSeriesType findByValue(int i) {
        if (i == 1) {
            return ACCELEROMETER;
        }
        if (i == 2) {
            return GYROSCOPE;
        }
        if (i == 3) {
            return MAGNETOMETER;
        }
        if (i == 4) {
            return ACCELEROMETER_ANDROID_G;
        }
        if (i != 5) {
            return null;
        }
        return QUATERNION;
    }
}
