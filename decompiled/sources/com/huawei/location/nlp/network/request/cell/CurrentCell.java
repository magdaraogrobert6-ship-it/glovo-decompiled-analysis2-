package com.huawei.location.nlp.network.request.cell;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class CurrentCell {
    private long boottime;
    private long cellId;
    private int lac;
    private int mcc;
    private int mnc;
    private int rat;
    private short rssi;

    public long getBoottime() {
        return this.boottime;
    }

    public long getCellId() {
        return this.cellId;
    }

    public int getLac() {
        return this.lac;
    }

    public int getMcc() {
        return this.mcc;
    }

    public int getMnc() {
        return this.mnc;
    }

    public int getRat() {
        return this.rat;
    }

    public short getRssi() {
        return this.rssi;
    }

    public void setBoottime(long j) {
        this.boottime = j;
    }

    public void setCellId(long j) {
        this.cellId = j;
    }

    public void setLac(int i) {
        this.lac = i;
    }

    public void setMcc(int i) {
        this.mcc = i;
    }

    public void setMnc(int i) {
        this.mnc = i;
    }

    public void setRat(int i) {
        this.rat = i;
    }

    public void setRssi(short s) {
        this.rssi = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CurrentCell{boottime=");
        sb.append(this.boottime);
        sb.append(", mcc=");
        sb.append(this.mcc);
        sb.append(", mnc=");
        sb.append(this.mnc);
        sb.append(", lac=");
        sb.append(this.lac);
        sb.append(", cellId=");
        sb.append(this.cellId);
        sb.append(", rat=");
        sb.append(this.rat);
        sb.append(", rssi=");
        return af$$ExternalSyntheticOutline0.m(sb, (int) this.rssi, '}');
    }
}
