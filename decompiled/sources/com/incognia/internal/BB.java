package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class BB {
    public final String BGx;
    public final Double HQ;
    public final String N;
    public final Double mbG;
    public final String x;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        Double d = this.mbG;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Double d2 = this.HQ;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        String str = this.N;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.x;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public BB(String str, Double d, Double d2, String str2, String str3) {
        this.BGx = str;
        this.mbG = d;
        this.HQ = d2;
        this.N = str2;
        this.x = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BB)) {
            return false;
        }
        BB bb = (BB) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, bb.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, bb.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, bb.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, bb.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, bb.x}, getCieXyz.write())).booleanValue();
    }
}
