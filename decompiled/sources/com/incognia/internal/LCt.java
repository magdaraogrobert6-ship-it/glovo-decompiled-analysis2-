package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LCt {
    public final Boolean A1;
    public final int BGx;
    public final long HQ;
    public final boolean N;
    public final Integer VV3;
    public final String hIl;
    public final String hs;
    public final int mbG;
    public final boolean x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final int hashCode() {
        int iBGx = NS.BGx(this.HQ, wZ.BGx(this.mbG, Integer.hashCode(this.BGx) * 31, 31), 31);
        boolean z = this.N;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        boolean z2 = this.x;
        ?? r3 = z2 ? 1 : z2;
        String str = this.hIl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.hs;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.VV3;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Boolean bool = this.A1;
        return ((((((((((iBGx + r1) * 31) + r3) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public LCt(int i, int i2, long j, boolean z, boolean z2, String str, String str2, Integer num, Boolean bool) {
        this.BGx = i;
        this.mbG = i2;
        this.HQ = j;
        this.N = z;
        this.x = z2;
        this.hIl = str;
        this.hs = str2;
        this.VV3 = num;
        this.A1 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LCt)) {
            return false;
        }
        LCt lCt = (LCt) obj;
        if (this.BGx != lCt.BGx || this.mbG != lCt.mbG || this.HQ != lCt.HQ || this.N != lCt.N || this.x != lCt.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, lCt.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, lCt.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, lCt.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, lCt.A1}, getCieXyz.write())).booleanValue();
    }
}
