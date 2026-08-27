package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class N4A {
    public final long A1;
    public final String BGx;
    public final String HQ;
    public final String N;
    public final String VV3;
    public final String hIl;
    public final int hs;
    public final String mbG;
    public final String q;
    public final String x;

    public N4A(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, long j, String str8) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = str3;
        this.N = str4;
        this.x = str5;
        this.hIl = str6;
        this.hs = i;
        this.VV3 = str7;
        this.A1 = j;
        this.q = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N4A)) {
            return false;
        }
        N4A n4a = (N4A) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, n4a.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, n4a.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, n4a.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, n4a.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, n4a.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, n4a.hIl}, getCieXyz.write())).booleanValue() || this.hs != n4a.hs) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, n4a.VV3}, getCieXyz.write())).booleanValue() || this.A1 != n4a.A1) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, n4a.q}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iBGx = Fo.BGx(this.HQ, Fo.BGx(this.mbG, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.N;
        int iHashCode = str2 == null ? 0 : str2.hashCode();
        String str3 = this.x;
        return Long.hashCode(1782495653481L) + Fo.BGx(this.q, NS.BGx(this.A1, wZ.BGx(71002, Fo.BGx(this.VV3, wZ.BGx(this.hs, Fo.BGx(this.hIl, (((iBGx + iHashCode) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
    }
}
