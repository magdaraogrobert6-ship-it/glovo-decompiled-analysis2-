package com.huawei.riemann.location.common.bean.obs;

import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class VdrGnssStatus {
    long utc = 0;
    double bootTime = 0.0d;
    double azimuth = 0.0d;
    double basebandCn0DbHz = 0.0d;
    double carrierFrequencyHz = 0.0d;
    double cn0DbHz = 0.0d;
    int constellationType = 0;
    double elevationDegrees = 0.0d;
    int svid = 0;
    boolean usedInFix = false;

    public double getAzimuth() {
        return this.azimuth;
    }

    public double getBasebandCn0DbHz() {
        return this.basebandCn0DbHz;
    }

    public double getBootTime() {
        return this.bootTime;
    }

    public double getCarrierFrequencyHz() {
        return this.carrierFrequencyHz;
    }

    public double getCn0DbHz() {
        return this.cn0DbHz;
    }

    public int getConstellationType() {
        return this.constellationType;
    }

    public double getElevationDegrees() {
        return this.elevationDegrees;
    }

    public int getSvid() {
        return this.svid;
    }

    public double getUtc() {
        return this.utc;
    }

    public boolean isUsedInFix() {
        return this.usedInFix;
    }

    public void setAzimuth(double d) {
        this.azimuth = d;
    }

    public void setBasebandCn0DbHz(double d) {
        this.basebandCn0DbHz = d;
    }

    public void setBootTime(double d) {
        this.bootTime = d;
    }

    public void setCarrierFrequencyHz(double d) {
        this.carrierFrequencyHz = d;
    }

    public void setCn0DbHz(double d) {
        this.cn0DbHz = d;
    }

    public void setConstellationType(int i) {
        this.constellationType = i;
    }

    public void setElevationDegrees(double d) {
        this.elevationDegrees = d;
    }

    public void setSvid(int i) {
        this.svid = i;
    }

    public void setUsedInFix(boolean z) {
        this.usedInFix = z;
    }

    public void setUtc(long j) {
        this.utc = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VdrGnssStatus{utc=");
        sb.append(String.valueOf(this.utc));
        sb.append(", bootTime=");
        sb.append(this.bootTime);
        sb.append(", azimuth=");
        sb.append(this.azimuth);
        sb.append(", basebandCn0DbHz=");
        sb.append(this.basebandCn0DbHz);
        sb.append(", carrierFrequencyHz=");
        sb.append(this.carrierFrequencyHz);
        sb.append(", cn0DbHz=");
        sb.append(this.cn0DbHz);
        sb.append(", constellationType=");
        sb.append(this.constellationType);
        sb.append(", elevationDegrees=");
        sb.append(this.elevationDegrees);
        sb.append(", svid=");
        sb.append(this.svid);
        sb.append(", usedInFix=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.usedInFix, '}');
    }
}
