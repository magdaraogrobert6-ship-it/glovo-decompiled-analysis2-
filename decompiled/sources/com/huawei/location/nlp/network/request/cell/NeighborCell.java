package com.huawei.location.nlp.network.request.cell;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class NeighborCell {
    private int cNum;
    private int pId;
    private short rssi;

    public short getRssi() {
        return this.rssi;
    }

    public int getcNum() {
        return this.cNum;
    }

    public int getpId() {
        return this.pId;
    }

    public void setRssi(short s) {
        this.rssi = s;
    }

    public void setcNum(int i) {
        this.cNum = i;
    }

    public void setpId(int i) {
        this.pId = i;
    }

    public NeighborCell(int i, int i2, short s) {
        this.cNum = i;
        this.pId = i2;
        this.rssi = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NeighborCell{cNum=");
        sb.append(this.cNum);
        sb.append(", pId=");
        sb.append(this.pId);
        sb.append(", rssi=");
        return af$$ExternalSyntheticOutline0.m(sb, (int) this.rssi, '}');
    }
}
