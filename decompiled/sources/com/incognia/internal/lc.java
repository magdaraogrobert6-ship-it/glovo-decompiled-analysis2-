package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class lc {
    public final ArrayList BGx;
    public final int HQ;
    public final boolean N;
    public final int mbG;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iBGx = wZ.BGx(this.HQ, wZ.BGx(this.mbG, this.BGx.hashCode() * 31, 31), 31);
        boolean z = this.N;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iBGx + r1;
    }

    public lc(ArrayList arrayList, int i, int i2, boolean z) {
        this.BGx = arrayList;
        this.mbG = i;
        this.HQ = i2;
        this.N = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, lcVar.BGx}, getCieXyz.write())).booleanValue() && this.mbG == lcVar.mbG && this.HQ == lcVar.HQ && this.N == lcVar.N;
    }
}
