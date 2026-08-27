package com.huawei.riemann.location.common.bean;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class RotationAngle {
    public static final int ROTATION_CONFIG_TYPE_ANGLE = 1;
    public static final int ROTATION_CONFIG_TYPE_MATRIX = 2;
    private int type = 0;
    private double roll = 0.0d;
    private double pitch = 0.0d;
    private double yaw = 0.0d;
    private double[] accTfMatrix = {1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d};
    private double[] gyroTfMatrix = {1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d};

    public double getPitch() {
        return this.pitch;
    }

    public double getRoll() {
        return this.roll;
    }

    public int getType() {
        return this.type;
    }

    public double getYaw() {
        return this.yaw;
    }

    public boolean isValid() {
        int i = this.type;
        return i == 1 || i == 2;
    }

    public void setPitch(double d) {
        this.pitch = d;
    }

    public void setRoll(double d) {
        this.roll = d;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setYaw(double d) {
        this.yaw = d;
    }

    public void setAccTfMatrix(double... dArr) {
        if (dArr != null) {
            this.accTfMatrix = Arrays.copyOf(dArr, dArr.length);
        }
    }

    public void setGyroTfMatrix(double... dArr) {
        if (dArr != null) {
            this.gyroTfMatrix = Arrays.copyOf(dArr, dArr.length);
        }
    }

    public String toString() {
        return "RotationAngle{type=" + this.type + ", roll=" + this.roll + ", pitch=" + this.pitch + ", yaw=" + this.yaw + ", accTfMatrix=" + Arrays.toString(this.accTfMatrix) + ", gyroTfMatrix=" + Arrays.toString(this.gyroTfMatrix) + '}';
    }

    public double[] getAccTfMatrix() {
        double[] dArr = this.accTfMatrix;
        return dArr == null ? new double[0] : Arrays.copyOf(dArr, dArr.length);
    }

    public double[] getGyroTfMatrix() {
        double[] dArr = this.gyroTfMatrix;
        return dArr == null ? new double[0] : Arrays.copyOf(dArr, dArr.length);
    }
}
