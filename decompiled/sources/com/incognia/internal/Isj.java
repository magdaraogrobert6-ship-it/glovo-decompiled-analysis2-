package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Isj {
    public final int BGx;
    public final String HQ;
    public final String N;
    public final int mbG;
    public final Integer x;

    public final int hashCode() {
        int iBGx = wZ.BGx(this.mbG, Integer.hashCode(this.BGx) * 31, 31);
        String str = this.HQ;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.N;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.x;
        return ((((iBGx + iHashCode) * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public Isj(int i, int i2, String str, String str2, Integer num) {
        this.BGx = i;
        this.mbG = i2;
        this.HQ = str;
        this.N = str2;
        this.x = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Isj)) {
            return false;
        }
        Isj isj = (Isj) obj;
        if (this.BGx != isj.BGx || this.mbG != isj.mbG) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, isj.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, isj.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, isj.x}, getCieXyz.write())).booleanValue();
    }
}
