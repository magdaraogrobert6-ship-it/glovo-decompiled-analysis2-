package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class PRp {
    public final String BGx;
    public final String HQ;
    public final String N;
    public final String mbG;

    public final int hashCode() {
        int iBGx = Fo.BGx(this.mbG, this.BGx.hashCode() * 31, 31);
        String str = this.HQ;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.N;
        return ((iBGx + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public PRp(String str, String str2, String str3, String str4) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = str3;
        this.N = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PRp)) {
            return false;
        }
        PRp pRp = (PRp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, pRp.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, pRp.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, pRp.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, pRp.N}, getCieXyz.write())).booleanValue();
    }
}
