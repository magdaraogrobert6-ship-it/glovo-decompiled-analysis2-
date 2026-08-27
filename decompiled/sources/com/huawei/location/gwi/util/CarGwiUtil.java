package com.huawei.location.gwi.util;

import android.location.Location;
import android.os.SystemClock;
import com.huawei.riemann.location.common.bean.VdrInputData;
import com.huawei.riemann.location.gwivdr.ErrorCodeInterpreter;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class CarGwiUtil {
    private static final double DEFAULT_LATITUDE_MAX = 90.0d;
    private static final double DEFAULT_LATITUDE_MIN = -90.0d;
    private static final double DEFAULT_LONGITUDE_MAX = 180.0d;
    private static final double DEFAULT_LONGITUDE_MIN = -180.0d;
    private static final long LOG_TIME_THRESHOLD = 1000;
    private static final String TAG = "CarGwiUtil";
    private static final float ZERO_ERROR_RANGE = 1.0E-6f;
    private static volatile int accCount;
    private static volatile int gnssInfoCount;
    private static volatile int gyroCount;
    private static volatile long lastLogTime;
    private static volatile int locationCount;
    private static volatile int roadAreaCount;
    private static volatile int temperatureCount;
    private static volatile int vehicleCount;
    private static volatile int wheelAngleCount;

    private static boolean isGwiRecover(int i) {
        return i == 0 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 17 || i == 20 || i == 21;
    }

    public static boolean isIllegalBearing(float f) {
        return Math.abs(f) < ZERO_ERROR_RANGE;
    }

    /* JADX INFO: renamed from: com.huawei.location.gwi.util.CarGwiUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType;

        static {
            int[] iArr = new int[VdrInputData.DataType.values().length];
            $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType = iArr;
            try {
                iArr[VdrInputData.DataType.ACC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.GYRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.VEHICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.GNSS_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.ROAD_AREA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.WHEEL_ANGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[VdrInputData.DataType.TEMPERATURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static void calInputInfo(VdrInputData vdrInputData) {
        if (vdrInputData == null) {
            return;
        }
        switch (AnonymousClass1.$SwitchMap$com$huawei$riemann$location$common$bean$VdrInputData$DataType[vdrInputData.getDataType().ordinal()]) {
            case 1:
                accCount++;
                break;
            case 2:
                gyroCount++;
                break;
            case 3:
                vehicleCount++;
                break;
            case 4:
                locationCount++;
                break;
            case 5:
                gnssInfoCount++;
                break;
            case 6:
                roadAreaCount++;
                break;
            case 7:
                wheelAngleCount++;
                break;
            case 8:
                temperatureCount++;
                break;
        }
    }

    public static String getAlgErrorMsg(int i, int i2) {
        String string;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(": ");
            sb.append(i == 0 ? "sdk 0" : ErrorCodeInterpreter.interpret(i));
            sb.append(", ");
            sb.append(i2);
            sb.append(": ");
            sb.append(ErrorCodeInterpreter.interpret(i2));
            string = sb.toString();
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read(TAG, "getAlgErrorMsg exception");
            string = "";
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "getAlgErrorMsg: ".concat(string));
        return string;
    }

    public static void getAndResetInputCount() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "CarGwiUtil{acc=" + accCount + ", gyro=" + gyroCount + ", location=" + locationCount + ", vehicle=" + vehicleCount + ", gnssInfo=" + gnssInfoCount + ", roadArea=" + roadAreaCount + ", sWheel=" + wheelAngleCount + ", temp=" + temperatureCount + '}');
        accCount = 0;
        gyroCount = 0;
        locationCount = 0;
        vehicleCount = 0;
        gnssInfoCount = 0;
        roadAreaCount = 0;
        wheelAngleCount = 0;
        temperatureCount = 0;
    }

    public static void logClientNullControl() {
        if (SystemClock.elapsedRealtime() - lastLogTime < 1000) {
            return;
        }
        lastLogTime = SystemClock.elapsedRealtime();
        WrappedCompositionsetContent1211.read(TAG, "locationClient is null, setVdrData fail.");
    }

    public static boolean isLocationValid(Location location) {
        String str;
        if (location == null) {
            str = "location is null";
        } else {
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            if (latitude > 90.0d || latitude < -90.0d) {
                str = "invalid latitude";
            } else {
                if (longitude <= 180.0d && longitude >= -180.0d) {
                    return true;
                }
                str = "invalid longitude";
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str);
        return false;
    }

    public static boolean isRestart(int i) {
        if (i == 102) {
            return true;
        }
        return !isGwiRecover(i);
    }
}
