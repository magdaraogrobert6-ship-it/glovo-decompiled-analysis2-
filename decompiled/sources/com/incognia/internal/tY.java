package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class tY {
    public final String BGx;
    public final PRp HQ;
    public final String N;
    public final PRp mbG;
    public final String x;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        PRp pRp = this.mbG;
        int iHashCode2 = pRp == null ? 0 : pRp.hashCode();
        PRp pRp2 = this.HQ;
        int iHashCode3 = pRp2 == null ? 0 : pRp2.hashCode();
        String str = this.N;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.x;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public tY(String str, PRp pRp, PRp pRp2, String str2, String str3) {
        this.BGx = str;
        this.mbG = pRp;
        this.HQ = pRp2;
        this.N = str2;
        this.x = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tY)) {
            return false;
        }
        tY tYVar = (tY) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, tYVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, tYVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, tYVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, tYVar.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, tYVar.x}, getCieXyz.write())).booleanValue();
    }
}
