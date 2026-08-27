package com.incognia.internal;

import androidx.compose.ui.graphics.Fields;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ZBu {
    public final String A1;
    public final long BGx;
    public final int HQ;
    public final String JR;
    public final String N;
    public final long OV7;
    public final String S;
    public final String TfN;
    public final Long VLD;
    public final String VV3;
    public final String e;
    public final String fZl;
    public final boolean hIl;
    public final boolean hs;
    public final String iaH;
    public final AOX j;
    public final String mbG;
    public final String q;
    public final String x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final int hashCode() {
        int iBGx = Fo.BGx(this.x, Fo.BGx(this.N, wZ.BGx(this.HQ, Fo.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31), 31), 31), 31);
        boolean z = this.hIl;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        boolean z2 = this.hs;
        ?? r4 = z2 ? 1 : z2;
        String str = this.VV3;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.A1;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.q;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fZl;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.S;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.iaH;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.e;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Long l = this.VLD;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        String str8 = this.TfN;
        int iBGx2 = Fo.BGx(this.JR, NS.BGx(this.OV7, (((((((((((((((((((((iBGx + r2) * 31) + r4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31);
        AOX aox = this.j;
        return iBGx2 + (aox == null ? 0 : aox.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZBu)) {
            return false;
        }
        ZBu zBu = (ZBu) obj;
        if (this.BGx != zBu.BGx) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, zBu.mbG}, getCieXyz.write())).booleanValue() || this.HQ != zBu.HQ) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, zBu.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, zBu.x}, getCieXyz.write())).booleanValue() || this.hIl != zBu.hIl || this.hs != zBu.hs) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, zBu.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, zBu.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, zBu.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, zBu.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, zBu.S}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iaH, zBu.iaH}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, zBu.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VLD, zBu.VLD}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.TfN, zBu.TfN}, getCieXyz.write())).booleanValue() || this.OV7 != zBu.OV7) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.JR, zBu.JR}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.j, zBu.j}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ ZBu(long j, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, int i) {
        this(j, str, 71002, str2, str3, z, z2, (i & Fields.SpotShadowColor) != 0 ? null : str4, (i & Fields.RotationX) != 0 ? null : str5, (i & Fields.RotationY) != 0 ? null : str6, (i & Fields.RotationZ) != 0 ? null : str7, (i & Fields.CameraDistance) != 0 ? null : str8, (i & Fields.TransformOrigin) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & Fields.Clip) != 0 ? null : l, (i & Fields.CompositingStrategy) != 0 ? null : str11, 1782495653481L, str12, null);
    }

    public ZBu(long j, String str, int i, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, long j2, String str12, AOX aox) {
        this.BGx = j;
        this.mbG = str;
        this.HQ = i;
        this.N = str2;
        this.x = str3;
        this.hIl = z;
        this.hs = z2;
        this.VV3 = str4;
        this.A1 = str5;
        this.q = str6;
        this.fZl = str7;
        this.S = str8;
        this.iaH = str9;
        this.e = str10;
        this.VLD = l;
        this.TfN = str11;
        this.OV7 = j2;
        this.JR = str12;
        this.j = aox;
    }
}
