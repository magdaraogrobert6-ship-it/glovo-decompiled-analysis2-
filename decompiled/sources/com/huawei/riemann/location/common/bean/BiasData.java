package com.huawei.riemann.location.common.bean;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public class BiasData {
    private static final double DOUBLE_ZERO = 1.0E-12d;
    private double biasX = 0.0d;
    private double biasY = 0.0d;
    private double biasZ = 0.0d;
    private double gNorm = 9.8d;

    public double getBiasX() {
        return this.biasX;
    }

    public double getBiasY() {
        return this.biasY;
    }

    public double getBiasZ() {
        return this.biasZ;
    }

    public double getGNorm() {
        return this.gNorm;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void setBiasX(double d) {
        this.biasX = d;
    }

    public void setBiasY(double d) {
        this.biasY = d;
    }

    public void setBiasZ(double d) {
        this.biasZ = d;
    }

    public void setgNorm(double d) {
        this.gNorm = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiasData{biasX=");
        sb.append(this.biasX);
        sb.append(", biasY=");
        sb.append(this.biasY);
        sb.append(", biasZ=");
        sb.append(this.biasZ);
        sb.append(", gNorm=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.gNorm, '}');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof BiasData)) {
            return false;
        }
        BiasData biasData = (BiasData) obj;
        return Math.abs(this.biasX - biasData.biasX) <= DOUBLE_ZERO && Math.abs(this.biasY - biasData.biasY) <= DOUBLE_ZERO && Math.abs(this.biasZ - biasData.biasZ) <= DOUBLE_ZERO && Math.abs(this.gNorm - biasData.gNorm) <= DOUBLE_ZERO;
    }
}
