package com.incognia.internal;

import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class XD {
    public final String A1;
    public final boolean BGx;
    public final int HQ;
    public final int N;
    public final int VV3;
    public final int hIl;
    public final double hs;
    public final boolean mbG;
    public final Integer q;
    public final int x;

    public XD(boolean z, boolean z2, int i, int i2, int i3, int i4, double d, int i5, String str, Integer num) {
        this.BGx = z;
        this.mbG = z2;
        this.HQ = i;
        this.N = i2;
        this.x = i3;
        this.hIl = i4;
        this.hs = d;
        this.VV3 = i5;
        this.A1 = str;
        this.q = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XD)) {
            return false;
        }
        XD xd = (XD) obj;
        if (this.BGx != xd.BGx || this.mbG != xd.mbG || this.HQ != xd.HQ || this.N != xd.N || this.x != xd.x || this.hIl != xd.hIl || Double.compare(this.hs, xd.hs) != 0 || this.VV3 != xd.VV3) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, xd.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, xd.q}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    public final int hashCode() {
        boolean z = this.BGx;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.mbG;
        int iBGx = wZ.BGx(this.VV3, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.hs, wZ.BGx(this.hIl, wZ.BGx(this.x, wZ.BGx(this.N, wZ.BGx(this.HQ, ((r0 * 31) + (z2 ? 1 : z2)) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.A1;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.q;
        return ((iBGx + iHashCode) * 31) + (num != null ? num.hashCode() : 0);
    }
}
