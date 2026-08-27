package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class fBS {
    public final Boolean A1;
    public final Boolean BGx;
    public final Boolean HQ;
    public final Boolean N;
    public final Boolean VV3;
    public final Boolean fZl;
    public final Boolean hIl;
    public final Boolean hs;
    public final Boolean mbG;
    public final Integer q;
    public final Boolean x;

    public fBS(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Boolean bool10) {
        this.BGx = bool;
        this.mbG = bool2;
        this.HQ = bool3;
        this.N = bool4;
        this.x = bool5;
        this.hIl = bool6;
        this.hs = bool7;
        this.VV3 = bool8;
        this.A1 = bool9;
        this.q = num;
        this.fZl = bool10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fBS)) {
            return false;
        }
        fBS fbs = (fBS) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, fbs.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, fbs.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, fbs.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, fbs.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, fbs.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, fbs.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, fbs.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, fbs.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, fbs.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, fbs.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, fbs.fZl}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Boolean bool = this.BGx;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.mbG;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.HQ;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.N;
        int iHashCode4 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.x;
        int iHashCode5 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.hIl;
        int iHashCode6 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.hs;
        int iHashCode7 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.VV3;
        int iHashCode8 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.A1;
        int iHashCode9 = bool9 == null ? 0 : bool9.hashCode();
        Integer num = this.q;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        Boolean bool10 = this.fZl;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool10 != null ? bool10.hashCode() : 0);
    }
}
