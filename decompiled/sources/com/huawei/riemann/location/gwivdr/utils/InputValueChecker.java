package com.huawei.riemann.location.gwivdr.utils;

import android.location.Location;
import com.huawei.riemann.location.common.bean.Acceleration;
import com.huawei.riemann.location.common.bean.GnssInfo;
import com.huawei.riemann.location.common.bean.Gyroscope;
import com.huawei.riemann.location.common.bean.RoadArea;
import com.huawei.riemann.location.common.bean.RotationAngle;
import com.huawei.riemann.location.common.bean.Vehicle;
import com.huawei.riemann.location.common.utils.Constant;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class InputValueChecker {
    private static final double ACC_JUMP_THRESHOLD = 10.0d;
    private static final double GYRO_JUMP_THRESHOLD = 0.15d;
    private static final double INVALID_ACC_GRAVITY = 15.0d;
    private static final double INVALID_GYRO_AXIS = 0.15d;
    private static final double INVALID_WSS_SPEED = 200.0d;
    private static final double SPEED_JUMP_THRESHOLD = 10.0d;
    private static final String TAG = "InputValueChecker";
    private static Acceleration accPreFrame;
    private static Gyroscope gyroPreFrame;
    private static double speedPreFrame;

    public static boolean isAccValid(Acceleration acceleration) {
        if (acceleration == null) {
            WrappedCompositionsetContent1211.read(TAG, "null acc!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_ACC_INVALID);
            return false;
        }
        if (acceleration.getAccZ() > INVALID_ACC_GRAVITY) {
            WrappedCompositionsetContent1211.write(TAG, "possible invalid acc: " + acceleration);
            ErrorCodeManager.setErrorCode(Constant.ERROR_ACC_GRAVITY_INVALID);
            return true;
        }
        if (accPreFrame != null && (Math.abs(acceleration.getAccX() - accPreFrame.getAccX()) > 10.0d || Math.abs(acceleration.getAccY() - accPreFrame.getAccY()) > 10.0d || Math.abs(acceleration.getAccZ() - accPreFrame.getAccZ()) > 10.0d)) {
            WrappedCompositionsetContent1211.write(TAG, "possible jump acc!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_ACC_JUMP);
            return true;
        }
        accPreFrame = acceleration;
        ErrorCodeManager.setErrorCode(0);
        return true;
    }

    public static boolean isGyroValid(Gyroscope gyroscope) {
        if (gyroscope == null) {
            WrappedCompositionsetContent1211.read(TAG, "null gyro!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_GYRO_INVALID);
            return false;
        }
        if (Math.abs(gyroscope.getGyroX()) > 0.15d) {
            WrappedCompositionsetContent1211.write(TAG, "possible invalid gyro: " + gyroscope);
            ErrorCodeManager.setErrorCode(Constant.ERROR_GYRO_INVALID);
            return true;
        }
        if (gyroPreFrame != null && (Math.abs(gyroscope.getGyroX() - gyroPreFrame.getGyroX()) > 0.15d || Math.abs(gyroscope.getGyroY() - gyroPreFrame.getGyroY()) > 0.15d || Math.abs(gyroscope.getGyroZ() - gyroPreFrame.getGyroZ()) > 0.15d)) {
            WrappedCompositionsetContent1211.write(TAG, "possible jump gyro!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_GYRO_JUMP);
            return true;
        }
        gyroPreFrame = gyroscope;
        ErrorCodeManager.setErrorCode(0);
        return true;
    }

    public static boolean isWssValid(Vehicle vehicle) {
        if (vehicle == null) {
            WrappedCompositionsetContent1211.read(TAG, "null wss!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_WSS_INVALID);
            return false;
        }
        if (vehicle.getSpeed() > INVALID_WSS_SPEED || vehicle.getGear() <= 0) {
            WrappedCompositionsetContent1211.write(TAG, "possible invalid wss: " + vehicle);
            ErrorCodeManager.setErrorCode(Constant.ERROR_WSS_INVALID);
            return true;
        }
        if (Math.abs(vehicle.getSpeed() - speedPreFrame) > 10.0d) {
            WrappedCompositionsetContent1211.write(TAG, "possible jump speed!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_WSS_SPEED_JUMP);
            return true;
        }
        speedPreFrame = vehicle.getSpeed();
        ErrorCodeManager.setErrorCode(0);
        return true;
    }

    public static boolean isRotationAngleValid(RotationAngle rotationAngle) {
        if (rotationAngle != null) {
            return true;
        }
        WrappedCompositionsetContent1211.read(TAG, "null rotationAngle!");
        ErrorCodeManager.setErrorCode(Constant.ERROR_ROTATION_ANGLE_INVALID);
        return false;
    }

    public static boolean isGnssInfoValid(GnssInfo gnssInfo) {
        if (gnssInfo == null) {
            WrappedCompositionsetContent1211.read(TAG, "null gnssStatus!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_GNSS_STATUS_INVALID);
            return false;
        }
        ErrorCodeManager.setErrorCode(0);
        return true;
    }

    public static boolean isLocationValid(Location location) {
        if (location == null) {
            WrappedCompositionsetContent1211.read(TAG, "null location!");
            ErrorCodeManager.setErrorCode(Constant.ERROR_LOCATION_INVALID);
            return false;
        }
        ErrorCodeManager.setErrorCode(0);
        return true;
    }

    public static boolean isRoadAreaValid(RoadArea roadArea) {
        String str;
        if (roadArea == null) {
            str = "null roadArea!";
        } else if (!roadArea.isValid()) {
            str = "empty roadArea!";
        } else {
            ErrorCodeManager.setErrorCode(0);
            return true;
        }
        WrappedCompositionsetContent1211.read(TAG, str);
        ErrorCodeManager.setErrorCode(Constant.ERROR_ROAD_AREA_INVALID);
        return false;
    }
}
