package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline1;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Gbn {
    public final Float A1;
    public final double BGx;
    public final float HQ;
    public final long N;
    public final String S;
    public final Integer VLD;
    public final Float VV3;
    public final String e;
    public final Float fZl;
    public final Double hIl;
    public final Float hs;
    public final Boolean iaH;
    public final double mbG;
    public final Float q;
    public final boolean x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iBGx = NS.BGx(this.N, af$$ExternalSyntheticOutline1.m(this.HQ, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.mbG, Double.hashCode(this.BGx) * 31, 31), 31), 31);
        boolean z = this.x;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        Double d = this.hIl;
        int iHashCode = d == null ? 0 : d.hashCode();
        Float f = this.hs;
        int iHashCode2 = f == null ? 0 : f.hashCode();
        Float f2 = this.VV3;
        int iHashCode3 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.A1;
        int iHashCode4 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.q;
        int iHashCode5 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.fZl;
        int iHashCode6 = f5 == null ? 0 : f5.hashCode();
        String str = this.S;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Boolean bool = this.iaH;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        String str2 = this.e;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.VLD;
        return ((((((((((((((((((((iBGx + r1) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    public Gbn(double d, double d2, float f, long j, boolean z, Double d3, Float f2, Float f3, Float f4, Float f5, Float f6, String str, Boolean bool, String str2, Integer num) {
        this.BGx = d;
        this.mbG = d2;
        this.HQ = f;
        this.N = j;
        this.x = z;
        this.hIl = d3;
        this.hs = f2;
        this.VV3 = f3;
        this.A1 = f4;
        this.q = f5;
        this.fZl = f6;
        this.S = str;
        this.iaH = bool;
        this.e = str2;
        this.VLD = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gbn)) {
            return false;
        }
        Gbn gbn = (Gbn) obj;
        if (Double.compare(this.BGx, gbn.BGx) != 0 || Double.compare(this.mbG, gbn.mbG) != 0 || Float.compare(this.HQ, gbn.HQ) != 0 || this.N != gbn.N || this.x != gbn.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, gbn.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, gbn.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, gbn.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, gbn.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, gbn.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, gbn.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, gbn.S}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iaH, gbn.iaH}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, gbn.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VLD, gbn.VLD}, getCieXyz.write())).booleanValue();
    }
}
