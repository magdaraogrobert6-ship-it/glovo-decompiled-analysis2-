package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RVY {
    public final Long A1;
    public final Long BGx;
    public final String HQ;
    public final String N;
    public final Long S;
    public final Long VV3;
    public final Long e;
    public final List fZl;
    public final String hIl;
    public final String hs;
    public final Long iaH;
    public final Long mbG;
    public final Long q;
    public final String x;

    public RVY(Long l, Long l2, String str, String str2, String str3, String str4, String str5, Long l3, Long l4, Long l5, List list, Long l6, Long l7, Long l8) {
        this.BGx = l;
        this.mbG = l2;
        this.HQ = str;
        this.N = str2;
        this.x = str3;
        this.hIl = str4;
        this.hs = str5;
        this.VV3 = l3;
        this.A1 = l4;
        this.q = l5;
        this.fZl = list;
        this.S = l6;
        this.iaH = l7;
        this.e = l8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVY)) {
            return false;
        }
        RVY rvy = (RVY) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, rvy.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, rvy.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, rvy.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, rvy.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, rvy.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, rvy.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, rvy.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, rvy.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, rvy.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, rvy.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, rvy.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, rvy.S}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iaH, rvy.iaH}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, rvy.e}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.mbG;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.HQ;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.N;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.x;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.hIl;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.hs;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Long l3 = this.VV3;
        int iHashCode8 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.A1;
        int iHashCode9 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.q;
        int iHashCode10 = l5 == null ? 0 : l5.hashCode();
        List list = this.fZl;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        Long l6 = this.S;
        int iHashCode12 = l6 == null ? 0 : l6.hashCode();
        Long l7 = this.iaH;
        int iHashCode13 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.e;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (l8 != null ? l8.hashCode() : 0);
    }
}
