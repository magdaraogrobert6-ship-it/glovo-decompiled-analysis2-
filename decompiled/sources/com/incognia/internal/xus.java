package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class xus {
    public final String A1;
    public final String BGx;
    public final String HQ;
    public final wE N;
    public final Boolean S;
    public final String VV3;
    public final Boolean fZl;
    public final ArrayList hIl;
    public final Integer hs;
    public final ArrayList mbG;
    public final ArrayList q;
    public final String x;

    public xus(String str, ArrayList arrayList, String str2, wE wEVar, String str3, ArrayList arrayList2, Integer num, String str4, String str5, ArrayList arrayList3, Boolean bool, Boolean bool2) {
        this.BGx = str;
        this.mbG = arrayList;
        this.HQ = str2;
        this.N = wEVar;
        this.x = str3;
        this.hIl = arrayList2;
        this.hs = num;
        this.VV3 = str4;
        this.A1 = str5;
        this.q = arrayList3;
        this.fZl = bool;
        this.S = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xus)) {
            return false;
        }
        xus xusVar = (xus) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, xusVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, xusVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, xusVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, xusVar.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, xusVar.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, xusVar.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, xusVar.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, xusVar.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, xusVar.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, xusVar.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, xusVar.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, xusVar.S}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.mbG, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.HQ;
        int iHashCode = str2 == null ? 0 : str2.hashCode();
        wE wEVar = this.N;
        int iHashCode2 = wEVar == null ? 0 : wEVar.hashCode();
        String str3 = this.x;
        int iWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.hIl, (((((iWrite + iHashCode) * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.hs;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str4 = this.VV3;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.A1;
        int iWrite3 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.q, (((((iWrite2 + iHashCode3) * 31) + iHashCode4) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Boolean bool = this.fZl;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.S;
        return ((iWrite3 + iHashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }
}
