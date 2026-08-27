package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class G2U {
    public final String A1;
    public final long BGx;
    public final long HQ;
    public final String N;
    public final String VV3;
    public final String hIl;
    public final String hs;
    public final long mbG;
    public final String x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.HQ, NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31), 31);
        String str = this.N;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.x;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.hIl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.hs;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.VV3;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.A1;
        return ((((((((((iBGx + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public G2U(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = j3;
        this.N = str;
        this.x = str2;
        this.hIl = str3;
        this.hs = str4;
        this.VV3 = str5;
        this.A1 = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2U)) {
            return false;
        }
        G2U g2u = (G2U) obj;
        if (this.BGx != g2u.BGx || this.mbG != g2u.mbG || this.HQ != g2u.HQ) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, g2u.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, g2u.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, g2u.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, g2u.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, g2u.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, g2u.A1}, getCieXyz.write())).booleanValue();
    }
}
