package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class p2k {
    public final ArrayList BGx;
    public final ArrayList HQ;
    public final ArrayList N;
    public final Integer hIl;
    public final Integer hs;
    public final ArrayList mbG;
    public final String x;

    public p2k(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str, Integer num, Integer num2) {
        this.BGx = arrayList;
        this.mbG = arrayList2;
        this.HQ = arrayList3;
        this.N = arrayList4;
        this.x = str;
        this.hIl = num;
        this.hs = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2k)) {
            return false;
        }
        p2k p2kVar = (p2k) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, p2kVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, p2kVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, p2kVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, p2kVar.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, p2kVar.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, p2kVar.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, p2kVar.hs}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        ArrayList arrayList = this.BGx;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        ArrayList arrayList2 = this.mbG;
        int iHashCode2 = arrayList2 == null ? 0 : arrayList2.hashCode();
        ArrayList arrayList3 = this.HQ;
        int iHashCode3 = arrayList3 == null ? 0 : arrayList3.hashCode();
        ArrayList arrayList4 = this.N;
        int iHashCode4 = arrayList4 == null ? 0 : arrayList4.hashCode();
        String str = this.x;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Integer num = this.hIl;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.hs;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num2 != null ? num2.hashCode() : 0);
    }
}
