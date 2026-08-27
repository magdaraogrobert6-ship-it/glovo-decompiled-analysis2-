package com.incognia.internal;

import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class qVf {
    public final String BGx;
    public final Long HQ;
    public final Long N;
    public final Long mbG;
    public final Map x;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        Long l = this.mbG;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.HQ;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.N;
        int iHashCode4 = l3 == null ? 0 : l3.hashCode();
        Map map = this.x;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map != null ? map.hashCode() : 0);
    }

    public qVf(String str, Long l, Long l2, Long l3, Map map) {
        this.BGx = str;
        this.mbG = l;
        this.HQ = l2;
        this.N = l3;
        this.x = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qVf)) {
            return false;
        }
        qVf qvf = (qVf) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, qvf.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, qvf.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, qvf.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, qvf.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, qvf.x}, getCieXyz.write())).booleanValue();
    }
}
