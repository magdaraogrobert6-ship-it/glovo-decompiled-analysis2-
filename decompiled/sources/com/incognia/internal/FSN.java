package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class FSN {
    public final Boolean A1;
    public final ArrayList BGx;
    public final ArrayList HQ;
    public final Boolean N;
    public final List VV3;
    public final List hIl;
    public final List hs;
    public final ArrayList mbG;
    public final List q;
    public final ArrayList x;

    public FSN(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bool, ArrayList arrayList4, List list, List list2, List list3, Boolean bool2, List list4) {
        this.BGx = arrayList;
        this.mbG = arrayList2;
        this.HQ = arrayList3;
        this.N = bool;
        this.x = arrayList4;
        this.hIl = list;
        this.hs = list2;
        this.VV3 = list3;
        this.A1 = bool2;
        this.q = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FSN)) {
            return false;
        }
        FSN fsn = (FSN) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, fsn.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, fsn.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, fsn.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, fsn.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, fsn.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, fsn.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, fsn.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, fsn.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, fsn.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, fsn.q}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        ArrayList arrayList = this.BGx;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList arrayList2 = this.mbG;
        int iHashCode2 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList arrayList3 = this.HQ;
        int iHashCode3 = arrayList3 == null ? 0 : arrayList3.hashCode();
        Boolean bool = this.N;
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.x, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        List list = this.hIl;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List list2 = this.hs;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.VV3;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        Boolean bool2 = this.A1;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        List list4 = this.q;
        return ((((((((iWrite + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list4 != null ? list4.hashCode() : 0);
    }
}
