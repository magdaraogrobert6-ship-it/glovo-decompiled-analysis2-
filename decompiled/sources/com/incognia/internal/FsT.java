package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class FsT {
    public final String BGx;
    public Long HQ;
    public final long mbG;

    public final int hashCode() {
        int iBGx = NS.BGx(this.mbG, this.BGx.hashCode() * 31, 31);
        Long l = this.HQ;
        return iBGx + (l == null ? 0 : l.hashCode());
    }

    public FsT(String str, long j) {
        this.BGx = str;
        this.mbG = j;
        this.HQ = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FsT)) {
            return false;
        }
        FsT fsT = (FsT) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, fsT.BGx}, getCieXyz.write())).booleanValue() || this.mbG != fsT.mbG) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, fsT.HQ}, getCieXyz.write())).booleanValue();
    }

    public FsT(String str, long j, Long l) {
        this.BGx = str;
        this.mbG = j;
        this.HQ = l;
    }
}
