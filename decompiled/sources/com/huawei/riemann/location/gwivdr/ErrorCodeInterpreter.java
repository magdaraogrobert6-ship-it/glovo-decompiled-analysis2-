package com.huawei.riemann.location.gwivdr;

import com.huawei.riemann.location.common.utils.Constant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ErrorCodeInterpreter {
    private static final HashMap<Integer, String> map = new HashMap<Integer, String>() { // from class: com.huawei.riemann.location.gwivdr.ErrorCodeInterpreter.1
        {
            yn.yn(0, this, "ok with merge", 1, "init fail");
            yn.yn(2, this, "waiting for init", 3, "acc not coming");
            yn.yn(4, this, "gyro not coming", 5, "gyroBias unset");
            yn.yn(6, this, "speed and gear not coming", 7, "time abnormal");
            yn.yn(8, this, "acc data abnormal", 9, "gyro data abnormal");
            yn.yn(10, this, "speed or gear abnormal", 11, "location data abnormal");
            yn.yn(12, this, "gnssStatus data abnormal", 13, "acc freq abnormal");
            yn.yn(14, this, "gyro freq abnormal", 15, "speed and gear freq abnormal");
            yn.yn(16, this, "system stop", 17, "lon/lat/alt abnormal");
            yn.yn(18, this, "internal error", 19, "fail");
            yn.yn(20, this, "ok with vdr", 21, "anchor not set");
            yn.yn(22, this, "invalid init parameters", 201, "no acc received within 1 second");
            yn.yn(202, this, "low acc freq within 1 second", 203, "large time diff between 2 accelerations");
            yn.yn(Constant.ERROR_ACC_INVALID, this, "null acc value", Constant.ERROR_ACC_GRAVITY_INVALID, "invalid acc in gravity direction");
            yn.yn(Constant.ERROR_ACC_JUMP, this, "acceleration value jump", Constant.ERROR_GYRO_NO_DATA, "no gyro received within 1 second");
            yn.yn(Constant.ERROR_GYRO_LOW_FREQ, this, "low gyro freq within 1 second", Constant.ERROR_GYRO_TIME_DIFF_LARGE, "large time diff between 2 gyros");
            yn.yn(Constant.ERROR_GYRO_INVALID, this, "null gyro value", 215, "invalid acc in gravity direction");
            yn.yn(Constant.ERROR_GYRO_JUMP, this, "gyro value jump", Constant.ERROR_WSS_NO_DATA, "no wss received within 1 second");
            yn.yn(Constant.ERROR_WSS_LOW_FREQ, this, "low wss freq within 1 second", Constant.ERROR_WSS_TIME_DIFF_LARGE, "large time diff between 2 wss");
            yn.yn(Constant.ERROR_WSS_INVALID, this, "null wss value", Constant.ERROR_WSS_SPEED_JUMP, "wss value jump");
            yn.yn(Constant.ERROR_LOCATION_INVALID, this, "null location value", Constant.ERROR_GNSS_STATUS_INVALID, "null gnss status value");
            yn.yn(400, this, "vdr so package not loaded", Constant.ERROR_ALGO_NULL_RESULT, "vdr null result");
            yn.yn(Constant.ERROR_ALGO_NOT_START, this, "vdr not start", Constant.ERROR_UNKNOWN, "unknown error");
        }
    };

    public static String interpret(int i) {
        HashMap<Integer, String> map2 = map;
        return !map2.containsKey(Integer.valueOf(i)) ? "Unknown error code!" : map2.get(Integer.valueOf(i));
    }
}
