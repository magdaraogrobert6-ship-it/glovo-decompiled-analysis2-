package com.huawei.riemann.location.common.bean;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class Acceleration {
    private double accX;
    private double accY;
    private double accZ;
    private double bootTime;

    public double getAccX() {
        return this.accX;
    }

    public double getAccY() {
        return this.accY;
    }

    public double getAccZ() {
        return this.accZ;
    }

    public double getBootTime() {
        return this.bootTime;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private double accX;
        private double accY;
        private double accZ;
        private double bootTime;

        public Builder withAccX(double d) {
            this.accX = d;
            return this;
        }

        public Builder withAccY(double d) {
            this.accY = d;
            return this;
        }

        public Builder withAccZ(double d) {
            this.accZ = d;
            return this;
        }

        public Builder withBootTime(double d) {
            this.bootTime = d;
            return this;
        }

        public Acceleration build() {
            return new Acceleration(this);
        }

        private Builder() {
            this.bootTime = 0.0d;
            this.accX = 0.0d;
            this.accY = 0.0d;
            this.accZ = 9.8d;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Acceleration {bootTime=");
        sb.append(this.bootTime);
        sb.append(", accX=");
        sb.append(this.accX);
        sb.append(", accY=");
        sb.append(this.accY);
        sb.append(", accZ=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.accZ, '}');
    }

    private Acceleration(Builder builder) {
        this.bootTime = 0.0d;
        this.accX = 0.0d;
        this.accY = 0.0d;
        this.accZ = 9.8d;
        this.bootTime = builder.bootTime;
        this.accX = builder.accX;
        this.accY = builder.accY;
        this.accZ = builder.accZ;
    }
}
