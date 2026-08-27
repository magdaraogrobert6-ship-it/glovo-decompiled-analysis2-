package com.sentiance.sdk.sensorstream;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.sdk.SdkException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.handlePushNotificationPayloadlambda6;

/* JADX INFO: loaded from: classes3.dex */
public enum SensorType {
    ACCELEROMETER,
    GYROSCOPE,
    MAGNETOMETER,
    QUATERNION;

    public static SensorType fromTimeSeriesType(TimeSeriesType timeSeriesType) {
        int i = handlePushNotificationPayloadlambda6.read[timeSeriesType.ordinal()];
        if (i == 1 || i == 2) {
            return ACCELEROMETER;
        }
        if (i == 3) {
            return GYROSCOPE;
        }
        if (i == 4) {
            return MAGNETOMETER;
        }
        if (i != 5) {
            return null;
        }
        return QUATERNION;
    }

    public static List<Byte> toEventTypeConstants(List<SensorType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SensorType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(it.next().toEventTypeConstant()));
        }
        return arrayList;
    }

    public Sensor toAndroidSensor(SensorManager sensorManager) {
        int i = handlePushNotificationPayloadlambda6.write[ordinal()];
        if (i == 1) {
            return sensorManager.getDefaultSensor(1);
        }
        if (i == 2) {
            return sensorManager.getDefaultSensor(4);
        }
        if (i == 3) {
            return sensorManager.getDefaultSensor(2);
        }
        if (i != 4) {
            return null;
        }
        return sensorManager.getDefaultSensor(11);
    }

    @SuppressLint
    public byte toEventTypeConstant() {
        int i = handlePushNotificationPayloadlambda6.write[ordinal()];
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw new SdkException("No event type constant defined for " + name());
                }
            }
        }
        return b;
    }

    @SuppressLint
    public TimeSeriesType toTimeSeriesType() {
        int i = handlePushNotificationPayloadlambda6.write[ordinal()];
        if (i == 1) {
            return TimeSeriesType.ACCELEROMETER_ANDROID_G;
        }
        if (i == 2) {
            return TimeSeriesType.GYROSCOPE;
        }
        if (i == 3) {
            return TimeSeriesType.MAGNETOMETER;
        }
        if (i == 4) {
            return TimeSeriesType.QUATERNION;
        }
        throw new SdkException("No TimeSeriesType type defined for " + name());
    }

    public static SensorType fromEvenTypeConstant(byte b) {
        if (b == 1) {
            return ACCELEROMETER;
        }
        if (b == 2) {
            return GYROSCOPE;
        }
        if (b == 3) {
            return MAGNETOMETER;
        }
        if (b != 4) {
            return null;
        }
        return QUATERNION;
    }
}
