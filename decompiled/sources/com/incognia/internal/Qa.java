package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Qa {
    public final Integer BGx;
    public final Integer HQ;
    public final Integer N;
    public final Integer hIl;
    public final Integer mbG;
    public final Integer x;

    public Qa(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.BGx = num;
        this.mbG = num2;
        this.HQ = num3;
        this.N = num4;
        this.x = num5;
        this.hIl = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qa)) {
            return false;
        }
        Qa qa = (Qa) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, qa.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, qa.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, qa.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, qa.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, qa.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, qa.hIl}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Integer num = this.BGx;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.mbG;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.HQ;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.N;
        int iHashCode4 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.x;
        int iHashCode5 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.hIl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num6 != null ? num6.hashCode() : 0);
    }
}
