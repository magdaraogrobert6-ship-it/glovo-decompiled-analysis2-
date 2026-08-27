package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SsA {
    public final long BGx;
    public final Long HQ;
    public final String N;
    public final long mbG;

    public final int hashCode() {
        int iBGx = NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31);
        Long l = this.HQ;
        return this.N.hashCode() + ((iBGx + (l == null ? 0 : l.hashCode())) * 31);
    }

    public SsA(long j, long j2, Long l, String str) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = l;
        this.N = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SsA)) {
            return false;
        }
        SsA ssA = (SsA) obj;
        if (this.BGx != ssA.BGx || this.mbG != ssA.mbG) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ssA.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, ssA.N}, getCieXyz.write())).booleanValue();
    }
}
