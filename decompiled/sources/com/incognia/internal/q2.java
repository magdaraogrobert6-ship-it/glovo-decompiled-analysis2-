package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 {
    public final Long BGx;
    public final Long HQ;
    public final ArrayList N;
    public final oA7 hIl;
    public final String mbG;
    public final Long x;

    public q2(Long l, String str, Long l2, ArrayList arrayList, Long l3, oA7 oa7) {
        this.BGx = l;
        this.mbG = str;
        this.HQ = l2;
        this.N = arrayList;
        this.x = l3;
        this.hIl = oa7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, q2Var.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, q2Var.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, q2Var.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, q2Var.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, q2Var.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, q2Var.hIl}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.mbG;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l2 = this.HQ;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        ArrayList arrayList = this.N;
        int iHashCode4 = arrayList == null ? 0 : arrayList.hashCode();
        Long l3 = this.x;
        int iHashCode5 = l3 == null ? 0 : l3.hashCode();
        oA7 oa7 = this.hIl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (oa7 != null ? oa7.hashCode() : 0);
    }
}
