package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DU6 {
    public final Long BGx;
    public final Long HQ;
    public final String N;
    public final String VV3;
    public final String hIl;
    public final Long hs;
    public final Long mbG;
    public final Long x;

    public DU6(Long l, Long l2, Long l3, String str, Long l4, String str2, Long l5, String str3) {
        this.BGx = l;
        this.mbG = l2;
        this.HQ = l3;
        this.N = str;
        this.x = l4;
        this.hIl = str2;
        this.hs = l5;
        this.VV3 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DU6)) {
            return false;
        }
        DU6 du6 = (DU6) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, du6.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, du6.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, du6.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, du6.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, du6.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, du6.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, du6.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, du6.VV3}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.mbG;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.HQ;
        int iHashCode3 = l3 == null ? 0 : l3.hashCode();
        String str = this.N;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Long l4 = this.x;
        int iHashCode5 = l4 == null ? 0 : l4.hashCode();
        String str2 = this.hIl;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Long l5 = this.hs;
        int iHashCode7 = l5 == null ? 0 : l5.hashCode();
        String str3 = this.VV3;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
