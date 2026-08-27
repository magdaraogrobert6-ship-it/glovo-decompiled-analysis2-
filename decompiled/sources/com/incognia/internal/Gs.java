package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Gs {
    public final long BGx;
    public final TLJ HQ;
    public final long mbG;

    public final int hashCode() {
        int iBGx = NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31);
        TLJ tlj = this.HQ;
        return iBGx + (tlj == null ? 0 : tlj.hashCode());
    }

    public Gs(long j, long j2, TLJ tlj) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = tlj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gs)) {
            return false;
        }
        Gs gs = (Gs) obj;
        if (this.BGx != gs.BGx || this.mbG != gs.mbG) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, gs.HQ}, getCieXyz.write())).booleanValue();
    }
}
