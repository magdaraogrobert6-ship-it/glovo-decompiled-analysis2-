package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 {
    public final String BGx;
    public final long mbG;

    public final int hashCode() {
        return Long.hashCode(this.mbG) + (this.BGx.hashCode() * 31);
    }

    public N1(String str, long j) {
        this.BGx = str;
        this.mbG = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N1)) {
            return false;
        }
        N1 n1 = (N1) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, n1.BGx}, getCieXyz.write())).booleanValue() && this.mbG == n1.mbG;
    }
}
