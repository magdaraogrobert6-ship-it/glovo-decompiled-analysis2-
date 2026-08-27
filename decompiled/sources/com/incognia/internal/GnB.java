package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GnB {
    public final double BGx;
    public final Integer HQ;
    public final Double N;
    public final String mbG;

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.BGx);
        String str = this.mbG;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.HQ;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Double d = this.N;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    public GnB(double d, String str, Integer num, Double d2) {
        this.BGx = d;
        this.mbG = str;
        this.HQ = num;
        this.N = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GnB)) {
            return false;
        }
        GnB gnB = (GnB) obj;
        if (Double.compare(this.BGx, gnB.BGx) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, gnB.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, gnB.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, gnB.N}, getCieXyz.write())).booleanValue();
    }
}
