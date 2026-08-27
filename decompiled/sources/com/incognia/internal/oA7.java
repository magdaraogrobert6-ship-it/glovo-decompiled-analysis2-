package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class oA7 {
    public final Long A1;
    public final Integer BGx;
    public final Integer HQ;
    public final String N;
    public final Boolean VV3;
    public final Integer hIl;
    public final Integer hs;
    public final String mbG;
    public final Boolean x;

    public oA7(Integer num, String str, Integer num2, String str2, Boolean bool, Integer num3, Integer num4, Boolean bool2, Long l) {
        this.BGx = num;
        this.mbG = str;
        this.HQ = num2;
        this.N = str2;
        this.x = bool;
        this.hIl = num3;
        this.hs = num4;
        this.VV3 = bool2;
        this.A1 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oA7)) {
            return false;
        }
        oA7 oa7 = (oA7) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, oa7.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, oa7.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, oa7.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, oa7.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, oa7.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, oa7.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, oa7.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, oa7.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, oa7.A1}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Integer num = this.BGx;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.mbG;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.HQ;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.N;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.x;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.hIl;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.hs;
        int iHashCode7 = num4 == null ? 0 : num4.hashCode();
        Boolean bool2 = this.VV3;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        Long l = this.A1;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (l != null ? l.hashCode() : 0);
    }
}
