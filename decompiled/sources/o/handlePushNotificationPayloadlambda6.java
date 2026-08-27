package o;

import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.sdk.sensorstream.SensorType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class handlePushNotificationPayloadlambda6 {
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TimeSeriesType.values().length];
        read = iArr;
        try {
            iArr[TimeSeriesType.ACCELEROMETER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[TimeSeriesType.ACCELEROMETER_ANDROID_G.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[TimeSeriesType.GYROSCOPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[TimeSeriesType.MAGNETOMETER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[TimeSeriesType.QUATERNION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[SensorType.values().length];
        write = iArr2;
        try {
            iArr2[SensorType.ACCELEROMETER.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[SensorType.GYROSCOPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            write[SensorType.MAGNETOMETER.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            write[SensorType.QUATERNION.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
