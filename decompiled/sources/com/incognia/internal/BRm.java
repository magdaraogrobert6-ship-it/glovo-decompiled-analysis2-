package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class BRm {
    public final zY5 BGx;
    public final LAd mbG;

    public BRm(zY5 zy5, LAd lAd) {
        this.BGx = zy5;
        this.mbG = lAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BRm)) {
            return false;
        }
        BRm bRm = (BRm) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, bRm.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, bRm.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        zY5 zy5 = this.BGx;
        int iHashCode = zy5 == null ? 0 : zy5.hashCode();
        LAd lAd = this.mbG;
        return (iHashCode * 31) + (lAd != null ? lAd.hashCode() : 0);
    }
}
