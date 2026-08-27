package com.huawei.riemann.location.common.bean;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class Vehicle {
    private double bootTime;
    private int gear;
    private double speed;

    public double getBootTime() {
        return this.bootTime;
    }

    public int getGear() {
        return this.gear;
    }

    public double getSpeed() {
        return this.speed;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private double bootTime;
        private int gear;
        private double speed;

        private Builder() {
        }

        public Builder withGear(int i) {
            this.gear = i;
            return this;
        }

        public Builder withSpeed(double d) {
            this.speed = d;
            return this;
        }

        public Builder withTimestamp(double d) {
            this.bootTime = d;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Vehicle {bootTime=");
        sb.append(this.bootTime);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", gear=");
        return af$$ExternalSyntheticOutline0.m(sb, this.gear, '}');
    }

    private Vehicle(Builder builder) {
        this.bootTime = 0.0d;
        this.speed = 0.0d;
        this.gear = 1;
        this.bootTime = builder.bootTime;
        this.speed = builder.speed;
        this.gear = builder.gear;
    }
}
