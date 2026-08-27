package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class bej {
    public final long A1;
    public final long BGx;
    public final String HQ;
    public final String N;
    public final String VV3;
    public final String hIl;
    public final String hs;
    public final String mbG;
    public final String q;
    public final String x;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.BGx);
        String str = this.mbG;
        int iBGx = Fo.BGx(this.HQ, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.N;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.x;
        return Long.hashCode(1782495653481L) + Fo.BGx(this.q, NS.BGx(this.A1, wZ.BGx(71002, Fo.BGx(this.VV3, Fo.BGx(this.hs, Fo.BGx(this.hIl, (((iBGx + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public bej(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j2, String str8) {
        this.BGx = j;
        this.mbG = str;
        this.HQ = str2;
        this.N = str3;
        this.x = str4;
        this.hIl = str5;
        this.hs = str6;
        this.VV3 = str7;
        this.A1 = j2;
        this.q = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej)) {
            return false;
        }
        bej bejVar = (bej) obj;
        if (this.BGx != bejVar.BGx) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, bejVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, bejVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, bejVar.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, bejVar.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, bejVar.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, bejVar.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, bejVar.VV3}, getCieXyz.write())).booleanValue() || this.A1 != bejVar.A1) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, bejVar.q}, getCieXyz.write())).booleanValue();
    }
}
