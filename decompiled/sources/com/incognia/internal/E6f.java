package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class E6f {
    public final FQL A1;
    public final String BGx;
    public final Boolean HQ;
    public final Long N;
    public final List VV3;
    public final String hIl;
    public final u8u hs;
    public final Integer mbG;
    public final String x;

    public E6f(String str, Integer num, Boolean bool, Long l, String str2, String str3, u8u u8uVar, List list, FQL fql) {
        this.BGx = str;
        this.mbG = num;
        this.HQ = bool;
        this.N = l;
        this.x = str2;
        this.hIl = str3;
        this.hs = u8uVar;
        this.VV3 = list;
        this.A1 = fql;
    }

    public final boolean BGx() {
        String str = this.BGx;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.hIl;
        return ((str2 == null || str2.length() == 0) && this.N == null && this.mbG == null && this.HQ == null && this.x == null && this.hs == null && this.VV3 == null && this.A1 == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6f)) {
            return false;
        }
        E6f e6f = (E6f) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, e6f.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, e6f.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, e6f.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, e6f.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, e6f.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, e6f.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, e6f.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, e6f.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, e6f.A1}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.mbG;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Boolean bool = this.HQ;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Long l = this.N;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str2 = this.x;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.hIl;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        u8u u8uVar = this.hs;
        int iHashCode7 = u8uVar == null ? 0 : u8uVar.hashCode();
        List list = this.VV3;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        FQL fql = this.A1;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (fql != null ? fql.hashCode() : 0);
    }
}
