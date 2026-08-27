package com.huawei.riemann.location.common.bean;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public class CalibrationPara {
    private double wssScaleFactor = 1.0d;
    private double rollBias = 0.0d;
    private double pitchBias = 0.0d;
    private double yawBias = 0.0d;
    private double cn0MeanTh = 20.0d;
    private int interpBufferSize = 8;
    private int syncBufferSize = 15;
    private double reservedPara1 = 0.0d;
    private double reservedPara2 = 0.0d;

    public double getCn0MeanTh() {
        return this.cn0MeanTh;
    }

    public int getInterpBufferSize() {
        return this.interpBufferSize;
    }

    public double getPitchBias() {
        return this.pitchBias;
    }

    public double getReservedPara1() {
        return this.reservedPara1;
    }

    public double getReservedPara2() {
        return this.reservedPara2;
    }

    public double getRollBias() {
        return this.rollBias;
    }

    public int getSyncBufferSize() {
        return this.syncBufferSize;
    }

    public double getWssScaleFactor() {
        return this.wssScaleFactor;
    }

    public double getYawBias() {
        return this.yawBias;
    }

    public void setCn0MeanTh(double d) {
        this.cn0MeanTh = d;
    }

    public void setInterpBufferSize(int i) {
        this.interpBufferSize = i;
    }

    public void setPitchBias(double d) {
        this.pitchBias = d;
    }

    public void setReservedPara1(double d) {
        this.reservedPara1 = d;
    }

    public void setReservedPara2(double d) {
        this.reservedPara2 = d;
    }

    public void setRollBias(double d) {
        this.rollBias = d;
    }

    public void setSyncBufferSize(int i) {
        this.syncBufferSize = i;
    }

    public void setWssScaleFactor(double d) {
        this.wssScaleFactor = d;
    }

    public void setYawBias(double d) {
        this.yawBias = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CalibrationPara{wssScaleFactor=");
        sb.append(this.wssScaleFactor);
        sb.append(", rollBias=");
        sb.append(this.rollBias);
        sb.append(", pitchBias=");
        sb.append(this.pitchBias);
        sb.append(", yawBias=");
        sb.append(this.yawBias);
        sb.append(", cn0MeanTh=");
        sb.append(this.cn0MeanTh);
        sb.append(", interpBufferSize=");
        sb.append(this.interpBufferSize);
        sb.append(", syncBufferSize=");
        sb.append(this.syncBufferSize);
        sb.append(", reservedPara1=");
        sb.append(this.reservedPara1);
        sb.append(", reservedPara2=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.reservedPara2, '}');
    }
}
