package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class wE {
    public final List BGx;
    public final String HQ;
    public final Integer N;
    public final String mbG;

    public wE(List list, String str, String str2, Integer num) {
        this.BGx = list;
        this.mbG = str;
        this.HQ = str2;
        this.N = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wE)) {
            return false;
        }
        wE wEVar = (wE) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, wEVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, wEVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, wEVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, wEVar.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        List list = this.BGx;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.mbG;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.HQ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.N;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }
}
