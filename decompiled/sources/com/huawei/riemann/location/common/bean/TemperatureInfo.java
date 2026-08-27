package com.huawei.riemann.location.common.bean;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class TemperatureInfo {
    public static final int TEMPERATURE_TYPE_IMU = 1;
    public static final int TEMPERATURE_TYPE_VEHICLE = 2;
    private double bootTime;
    private double temperature;
    private int type;

    public double getBootTime() {
        return this.bootTime;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public int getType() {
        return this.type;
    }

    public void setBootTime(double d) {
        this.bootTime = d;
    }

    public void setTemperature(double d) {
        this.temperature = d;
    }

    public void setType(int i) {
        this.type = i;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private double bootTime;
        private double temperature;
        private int type;

        private Builder() {
        }

        public Builder withBootTime(double d) {
            this.bootTime = d;
            return this;
        }

        public Builder withTemperature(double d) {
            this.temperature = d;
            return this;
        }

        public Builder withType(int i) {
            this.type = i;
            return this;
        }

        public TemperatureInfo build() {
            return new TemperatureInfo(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private TemperatureInfo(Builder builder) {
        this.type = 1;
        this.temperature = 0.0d;
        this.bootTime = 0.0d;
        this.type = builder.type;
        this.temperature = builder.temperature;
        this.bootTime = builder.bootTime;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TemperatureInfo{type=");
        sb.append(this.type);
        sb.append(", temperature=");
        sb.append(this.temperature);
        sb.append(", bootTime=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.bootTime, '}');
    }
}
