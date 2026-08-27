package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Cmt {
    public final String BGx;
    public final long HQ;
    public final long N;
    public final long mbG;

    public final int hashCode() {
        return Long.hashCode(this.N) + NS.BGx(this.HQ, NS.BGx(this.mbG, this.BGx.hashCode() * 31, 31), 31);
    }

    public Cmt(String str, long j, long j2, long j3) {
        this.BGx = str;
        this.mbG = j;
        this.HQ = j2;
        this.N = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cmt)) {
            return false;
        }
        Cmt cmt = (Cmt) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, cmt.BGx}, getCieXyz.write())).booleanValue() && this.mbG == cmt.mbG && this.HQ == cmt.HQ && this.N == cmt.N;
    }
}
