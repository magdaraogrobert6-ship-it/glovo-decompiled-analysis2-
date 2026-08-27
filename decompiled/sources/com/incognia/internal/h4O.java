package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class h4O {
    public final String BGx;
    public final String HQ;
    public final String N;
    public final String mbG;

    public h4O(String str, String str2, String str3, String str4) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = str3;
        this.N = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4O)) {
            return false;
        }
        h4O h4o = (h4O) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, h4o.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, h4o.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, h4o.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, h4o.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mbG;
        return this.N.hashCode() + Fo.BGx(this.HQ, ((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }
}
