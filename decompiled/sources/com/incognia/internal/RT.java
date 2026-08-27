package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RT {
    public final ArrayList A1;
    public final Long BGx;
    public final String HQ;
    public final String N;
    public final String S;
    public final Boolean TfN;
    public final Long VLD;
    public final String VV3;
    public final List e;
    public final oA7 fZl;
    public final Long hIl;
    public final Long hs;
    public final ArrayList iaH;
    public final String mbG;
    public final Long q;
    public final Long x;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        String str = this.mbG;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.HQ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.N;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        int iHashCode5 = this.x.hashCode();
        int iHashCode6 = this.hIl.hashCode();
        int iHashCode7 = this.hs.hashCode();
        String str4 = this.VV3;
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.A1, (((iHashCode7 + ((iHashCode6 + ((iHashCode5 + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31)) * 31)) * 31)) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        int iHashCode8 = this.q.hashCode();
        oA7 oa7 = this.fZl;
        int iHashCode9 = oa7 == null ? 0 : oa7.hashCode();
        String str5 = this.S;
        int iWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.iaH, (((((iHashCode8 + iWrite) * 31) + iHashCode9) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        List list = this.e;
        return this.TfN.hashCode() + ((this.VLD.hashCode() + ((iWrite2 + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public RT(Long l, String str, String str2, String str3, Long l2, Long l3, Long l4, String str4, ArrayList arrayList, Long l5, oA7 oa7, String str5, ArrayList arrayList2, List list, Long l6, Boolean bool) {
        this.BGx = l;
        this.mbG = str;
        this.HQ = str2;
        this.N = str3;
        this.x = l2;
        this.hIl = l3;
        this.hs = l4;
        this.VV3 = str4;
        this.A1 = arrayList;
        this.q = l5;
        this.fZl = oa7;
        this.S = str5;
        this.iaH = arrayList2;
        this.e = list;
        this.VLD = l6;
        this.TfN = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RT)) {
            return false;
        }
        RT rt = (RT) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, rt.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, rt.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, rt.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, rt.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, rt.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, rt.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, rt.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, rt.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, rt.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, rt.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, rt.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, rt.S}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iaH, rt.iaH}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, rt.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VLD, rt.VLD}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.TfN, rt.TfN}, getCieXyz.write())).booleanValue();
    }
}
