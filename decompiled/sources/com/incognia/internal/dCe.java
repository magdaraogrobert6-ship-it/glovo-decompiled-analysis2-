package com.incognia.internal;

import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class dCe {
    public final Integer A1;
    public final long BGx;
    public final long HQ;
    public final String JR;
    public final boolean N;
    public final String OV7;
    public final Bundle S;
    public final List TfN;
    public final String VLD;
    public final List VV3;
    public final Integer e;
    public final String fZl;
    public final List hIl;
    public final List hs;
    public final String iaH;
    public final Integer j;
    public final long mbG;
    public final String q;
    public final List x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iBGx = NS.BGx(this.HQ, NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31), 31);
        boolean z = this.N;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        List list = this.x;
        int iHashCode = list == null ? 0 : list.hashCode();
        List list2 = this.hIl;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.hs;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List list4 = this.VV3;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        Integer num = this.A1;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str = this.q;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.fZl;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Bundle bundle = this.S;
        int iHashCode8 = bundle == null ? 0 : bundle.hashCode();
        String str3 = this.iaH;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.e;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.VLD;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        List list5 = this.TfN;
        int iHashCode12 = list5 == null ? 0 : list5.hashCode();
        String str5 = this.OV7;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.JR;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        Integer num3 = this.j;
        return ((((((((((((((((((((((((((((((iBGx + r2) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    public dCe(long j, long j2, long j3, boolean z, List list, List list2, List list3, List list4, Integer num, String str, String str2, Bundle bundle, String str3, Integer num2, String str4, List list5, String str5, String str6, Integer num3) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = j3;
        this.N = z;
        this.x = list;
        this.hIl = list2;
        this.hs = list3;
        this.VV3 = list4;
        this.A1 = num;
        this.q = str;
        this.fZl = str2;
        this.S = bundle;
        this.iaH = str3;
        this.e = num2;
        this.VLD = str4;
        this.TfN = list5;
        this.OV7 = str5;
        this.JR = str6;
        this.j = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dCe)) {
            return false;
        }
        dCe dce = (dCe) obj;
        if (this.BGx != dce.BGx || this.mbG != dce.mbG || this.HQ != dce.HQ || this.N != dce.N) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, dce.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, dce.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, dce.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, dce.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, dce.A1}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.q, dce.q}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fZl, dce.fZl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.S, dce.S}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iaH, dce.iaH}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, dce.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VLD, dce.VLD}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.TfN, dce.TfN}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.OV7, dce.OV7}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.JR, dce.JR}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.j, dce.j}, getCieXyz.write())).booleanValue();
    }

    public final boolean BGx() {
        List list;
        if (Build.VERSION.SDK_INT < 29 || (list = this.x) == null || ((list instanceof Collection) && list.isEmpty())) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ServiceInfo) it.next()).getForegroundServiceType() == 32) {
                return true;
            }
        }
        return false;
    }
}
