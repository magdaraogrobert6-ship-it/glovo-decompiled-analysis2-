package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class wVC {
    public final zY5 BGx;
    public final ArrayList HQ;
    public final GnB N;
    public final BB hIl;
    public final String hs;
    public final LAd mbG;
    public final ArrayList x;

    public wVC(zY5 zy5, LAd lAd, ArrayList arrayList, GnB gnB, ArrayList arrayList2, BB bb, String str) {
        this.BGx = zy5;
        this.mbG = lAd;
        this.HQ = arrayList;
        this.N = gnB;
        this.x = arrayList2;
        this.hIl = bb;
        this.hs = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wVC)) {
            return false;
        }
        wVC wvc = (wVC) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, wvc.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, wvc.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, wvc.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, wvc.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, wvc.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, wvc.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, wvc.hs}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        zY5 zy5 = this.BGx;
        int iHashCode = zy5 == null ? 0 : zy5.hashCode();
        LAd lAd = this.mbG;
        int iHashCode2 = lAd == null ? 0 : lAd.hashCode();
        ArrayList arrayList = this.HQ;
        int iHashCode3 = arrayList == null ? 0 : arrayList.hashCode();
        GnB gnB = this.N;
        int iHashCode4 = gnB == null ? 0 : gnB.hashCode();
        ArrayList arrayList2 = this.x;
        int iHashCode5 = arrayList2 == null ? 0 : arrayList2.hashCode();
        BB bb = this.hIl;
        int iHashCode6 = bb == null ? 0 : bb.hashCode();
        String str = this.hs;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }
}
