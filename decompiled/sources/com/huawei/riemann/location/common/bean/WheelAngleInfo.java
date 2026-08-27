package com.huawei.riemann.location.common.bean;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class WheelAngleInfo {
    private double bootTime;
    private double degree;

    public double getBootTime() {
        return this.bootTime;
    }

    public double getDegree() {
        return this.degree;
    }

    public void setBootTime(double d) {
        this.bootTime = d;
    }

    public void setDegree(double d) {
        this.degree = d;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private double bootTime;
        private double degree;

        private Builder() {
        }

        public Builder withBootTime(double d) {
            this.bootTime = d;
            return this;
        }

        public Builder withDegree(double d) {
            this.degree = d;
            return this;
        }

        public WheelAngleInfo build() {
            return new WheelAngleInfo(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WheelAngleInfo{degree=");
        sb.append(this.degree);
        sb.append(", bootTime=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.bootTime, '}');
    }

    private WheelAngleInfo(Builder builder) {
        this.degree = 0.0d;
        this.bootTime = 0.0d;
        setDegree(builder.degree);
        setBootTime(builder.bootTime);
    }
}
