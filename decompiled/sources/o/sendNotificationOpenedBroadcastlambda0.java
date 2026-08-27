package o;

import com.sentiance.core.model.thrift.TimeSeriesType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class sendNotificationOpenedBroadcastlambda0 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[TimeSeriesType.values().length];
        try {
            iArr[TimeSeriesType.ACCELEROMETER_ANDROID_G.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimeSeriesType.ACCELEROMETER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TimeSeriesType.GYROSCOPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TimeSeriesType.QUATERNION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TimeSeriesType.MAGNETOMETER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
