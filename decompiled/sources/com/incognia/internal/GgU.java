package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GgU {
    public final String A1;
    public final long BGx;
    public final int HQ;
    public final int N;
    public final Boolean VV3;
    public final RVY fZl;
    public final String hIl;
    public final String hs;
    public final long mbG;
    public final RT q;
    public final long x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.x, wZ.BGx(this.N, wZ.BGx(this.HQ, NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31), 31), 31), 31);
        String str = this.hIl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.hs;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.VV3;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.A1;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        RT rt = this.q;
        int iHashCode5 = rt == null ? 0 : rt.hashCode();
        RVY rvy = this.fZl;
        return ((((((((((iBGx + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (rvy != null ? rvy.hashCode() : 0);
    }

    public GgU(long j, long j2, int i, int i2, long j3, String str, String str2, Boolean bool, String str3, RT rt, RVY rvy) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = i;
        this.N = i2;
        this.x = j3;
        this.hIl = str;
        this.hs = str2;
        this.VV3 = bool;
        this.A1 = str3;
        this.q = rt;
        this.fZl = rvy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GgU)) {
            return false;
        }
        GgU ggU = (GgU) obj;
        if (this.BGx != ggU.BGx || this.mbG != ggU.mbG || this.HQ != ggU.HQ || this.N != ggU.N || this.x != ggU.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, ggU.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, ggU.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, ggU.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, ggU.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, ggU.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, ggU.fZl}, getCieXyz.write())).booleanValue();
    }
}
