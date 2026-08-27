package com.huawei.location.nlp.network.request;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.nlp.network.response.Location;

/* JADX INFO: loaded from: classes5.dex */
public class CacheLocationOnline extends Location {
    private float accFilter;
    private short flagsFilter;
    private double latFilter;
    private double lonFilter;

    public float getAccFilter() {
        return this.accFilter;
    }

    public short getFlagsFilter() {
        return this.flagsFilter;
    }

    public double getLatFilter() {
        return this.latFilter;
    }

    public double getLonFilter() {
        return this.lonFilter;
    }

    public void setAccFilter(float f) {
        this.accFilter = f;
    }

    public void setFlagsFilter(short s) {
        this.flagsFilter = s;
    }

    public void setLatFilter(double d) {
        this.latFilter = d;
    }

    public void setLonFilter(double d) {
        this.lonFilter = d;
    }

    @Override // com.huawei.location.nlp.network.response.Location
    public String toString() {
        StringBuilder sb = new StringBuilder("CacheLocationOnline{");
        sb.append(super.toString());
        sb.append("latFilter=");
        sb.append(this.latFilter);
        sb.append(", lonFilter=");
        sb.append(this.lonFilter);
        sb.append(", accFilter=");
        sb.append(this.accFilter);
        sb.append(", flagsFilter=");
        return af$$ExternalSyntheticOutline0.m(sb, (int) this.flagsFilter, '}');
    }
}
