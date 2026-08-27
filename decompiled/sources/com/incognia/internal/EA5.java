package com.incognia.internal;

import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class EA5 {
    public final String BGx;
    public Long HQ = null;
    public Long N = null;
    public Map hIl;
    public final long mbG;
    public final BYo x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.mbG, this.BGx.hashCode() * 31, 31);
        Long l = this.HQ;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.N;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int iHashCode3 = this.x.hashCode();
        Map map = this.hIl;
        return ((iHashCode3 + ((((iBGx + iHashCode) * 31) + iHashCode2) * 31)) * 31) + (map != null ? map.hashCode() : 0);
    }

    public EA5(String str, long j, BYo bYo, Map map) {
        this.BGx = str;
        this.mbG = j;
        this.x = bYo;
        this.hIl = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EA5)) {
            return false;
        }
        EA5 ea5 = (EA5) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ea5.BGx}, getCieXyz.write())).booleanValue() || this.mbG != ea5.mbG) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ea5.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, ea5.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, ea5.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, ea5.hIl}, getCieXyz.write())).booleanValue();
    }
}
