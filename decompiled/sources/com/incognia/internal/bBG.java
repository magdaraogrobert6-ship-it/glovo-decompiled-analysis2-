package com.incognia.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class bBG {
    public final String BGx;
    public final String HQ;
    public final Integer N;
    public final Long VV3;
    public final String hIl;
    public final List hs;
    public final String mbG;
    public final Long x;

    public bBG(String str, String str2, String str3, Integer num, Long l, String str4, List list, Long l2) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = str3;
        this.N = num;
        this.x = l;
        this.hIl = str4;
        this.hs = list;
        this.VV3 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bBG)) {
            return false;
        }
        bBG bbg = (bBG) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, bbg.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, bbg.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, bbg.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, bbg.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, bbg.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, bbg.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, bbg.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, bbg.VV3}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mbG;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.HQ;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.N;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.x.hashCode();
        String str4 = this.hIl;
        int iM = c8$$ExternalSyntheticOutline0.m(this.hs, (((((iHashCode5 + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31)) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31) + 1) * 31, 31);
        Long l = this.VV3;
        return iM + (l != null ? l.hashCode() : 0);
    }
}
