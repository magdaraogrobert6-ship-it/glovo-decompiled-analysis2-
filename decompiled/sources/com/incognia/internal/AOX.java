package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AOX {
    public final RVY A1;
    public final long BGx;
    public final int HQ;
    public final int N;
    public final Boolean VV3;
    public final String hIl;
    public final String hs;
    public final long mbG;
    public final q2 q;
    public final long x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.x, wZ.BGx(this.N, wZ.BGx(this.HQ, NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31), 31), 31), 31);
        String str = this.hIl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.hs;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.VV3;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        RVY rvy = this.A1;
        int iHashCode4 = rvy == null ? 0 : rvy.hashCode();
        q2 q2Var = this.q;
        return ((((((((iBGx + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (q2Var != null ? q2Var.hashCode() : 0);
    }

    public AOX(long j, long j2, int i, int i2, long j3, String str, String str2, Boolean bool, RVY rvy, q2 q2Var) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = i;
        this.N = i2;
        this.x = j3;
        this.hIl = str;
        this.hs = str2;
        this.VV3 = bool;
        this.A1 = rvy;
        this.q = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AOX)) {
            return false;
        }
        AOX aox = (AOX) obj;
        if (this.BGx != aox.BGx || this.mbG != aox.mbG || this.HQ != aox.HQ || this.N != aox.N || this.x != aox.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, aox.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, aox.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, aox.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, aox.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, aox.q}, getCieXyz.write())).booleanValue();
    }
}
