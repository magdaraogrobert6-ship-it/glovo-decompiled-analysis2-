package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Zs {
    public final Long BGx;
    public final Long HQ;
    public final String N;
    public final String hIl;
    public final List hs;
    public final Long mbG;
    public final int x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zs)) {
            return false;
        }
        Zs zs = (Zs) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, zs.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, zs.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, zs.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, zs.N}, getCieXyz.write())).booleanValue() || this.x != zs.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, zs.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, zs.hs}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.mbG;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.HQ;
        int iHashCode3 = l3 == null ? 0 : l3.hashCode();
        String str = this.N;
        int iBGx = wZ.BGx(this.x, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.hIl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List list = this.hs;
        return ((iBGx + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public /* synthetic */ Zs(Long l, Long l2, Long l3, int i, String str, List list, int i2) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : l3, (String) null, i, str, (i2 & 64) != 0 ? null : list);
    }

    public Zs(Long l, Long l2, Long l3, String str, int i, String str2, List list) {
        this.BGx = l;
        this.mbG = l2;
        this.HQ = l3;
        this.N = str;
        this.x = i;
        this.hIl = str2;
        this.hs = list;
    }
}
