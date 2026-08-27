package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Mj {
    public final Long BGx;
    public final long HQ;
    public final X1 N;
    public final String mbG;

    public Mj(Long l, String str, long j, X1 x1) {
        this.BGx = l;
        this.mbG = str;
        this.HQ = j;
        this.N = x1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mj)) {
            return false;
        }
        Mj mj = (Mj) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, mj.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, mj.mbG}, getCieXyz.write())).booleanValue() || this.HQ != mj.HQ) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, mj.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        return this.N.hashCode() + NS.BGx(this.HQ, Fo.BGx(this.mbG, (l == null ? 0 : l.hashCode()) * 31, 31), 31);
    }
}
