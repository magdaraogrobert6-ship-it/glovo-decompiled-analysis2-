package com.incognia.internal;

import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LAd {
    public final double BGx;
    public final Long HQ;
    public final double mbG;

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.mbG, Double.hashCode(this.BGx) * 31, 31);
        Long l = this.HQ;
        return iRemoteActionCompatParcelizer + (l == null ? 0 : l.hashCode());
    }

    public LAd(double d, double d2, Long l) {
        this.BGx = d;
        this.mbG = d2;
        this.HQ = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LAd)) {
            return false;
        }
        LAd lAd = (LAd) obj;
        if (Double.compare(this.BGx, lAd.BGx) != 0 || Double.compare(this.mbG, lAd.mbG) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, lAd.HQ}, getCieXyz.write())).booleanValue();
    }
}
