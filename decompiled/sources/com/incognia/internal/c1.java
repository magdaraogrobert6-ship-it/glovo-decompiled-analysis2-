package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 {
    public final w4a BGx;
    public final boolean mbG;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        boolean z = this.mbG;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    public c1(w4a w4aVar, boolean z) {
        this.BGx = w4aVar;
        this.mbG = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, c1Var.BGx}, getCieXyz.write())).booleanValue() && this.mbG == c1Var.mbG;
    }
}
