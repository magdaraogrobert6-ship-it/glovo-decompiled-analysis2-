package com.huawei.riemann.location.common.bean;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class Gyroscope {
    private double bootTime;
    private double gyroX;
    private double gyroY;
    private double gyroZ;

    public double getBootTime() {
        return this.bootTime;
    }

    public double getGyroX() {
        return this.gyroX;
    }

    public double getGyroY() {
        return this.gyroY;
    }

    public double getGyroZ() {
        return this.gyroZ;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private double bootTime;
        private double gyroX;
        private double gyroY;
        private double gyroZ;

        public Builder withBootTime(double d) {
            this.bootTime = d;
            return this;
        }

        public Builder withGyroX(double d) {
            this.gyroX = d;
            return this;
        }

        public Builder withGyroY(double d) {
            this.gyroY = d;
            return this;
        }

        public Builder withGyroZ(double d) {
            this.gyroZ = d;
            return this;
        }

        public Gyroscope build() {
            return new Gyroscope(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Gyroscope {bootTime=");
        sb.append(this.bootTime);
        sb.append(", gyroX=");
        sb.append(this.gyroX);
        sb.append(", gyroY=");
        sb.append(this.gyroY);
        sb.append(", gyroZ=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.gyroZ, '}');
    }

    private Gyroscope(Builder builder) {
        this.bootTime = 0.0d;
        this.gyroX = 0.0d;
        this.gyroY = 0.0d;
        this.gyroZ = 0.0d;
        this.bootTime = builder.bootTime;
        this.gyroX = builder.gyroX;
        this.gyroY = builder.gyroY;
        this.gyroZ = builder.gyroZ;
    }
}
