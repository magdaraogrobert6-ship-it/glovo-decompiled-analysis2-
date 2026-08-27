package com.incognia.internal;

import java.util.Locale;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class U9 {
    public final String A1;
    public final Double BGx;
    public final String HQ;
    public final String N;
    public final String S;
    public final String VV3;
    public final String fZl;
    public final String hIl;
    public final String hs;
    public final Locale iaH;
    public final Double mbG;
    public final String q;
    public final String x;

    public U9(Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Locale locale) {
        this.BGx = d;
        this.mbG = d2;
        this.HQ = str;
        this.N = str2;
        this.x = str3;
        this.hIl = str4;
        this.hs = str5;
        this.VV3 = str6;
        this.A1 = str7;
        this.q = str8;
        this.fZl = str9;
        this.S = str10;
        this.iaH = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U9)) {
            return false;
        }
        U9 u9 = (U9) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, u9.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, u9.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, u9.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, u9.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, u9.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, u9.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, u9.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, u9.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, u9.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, u9.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, u9.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, u9.S}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iaH, u9.iaH}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Double d = this.BGx;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.mbG;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
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
        String str6 = this.VV3;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.A1;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.q;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.fZl;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.S;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        Locale locale = this.iaH;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (locale != null ? locale.hashCode() : 0);
    }
}
