package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class QE {
    public final long BGx;
    public final String HQ;
    public final Long N;
    public final List hIl;
    public final long mbG;
    public final Long x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31);
        String str = this.HQ;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.N;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.x;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        List list = this.hIl;
        return ((((((iBGx + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public QE(long j, long j2, String str, Long l, Long l2, List list) {
        this.BGx = j;
        this.mbG = j2;
        this.HQ = str;
        this.N = l;
        this.x = l2;
        this.hIl = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QE)) {
            return false;
        }
        QE qe = (QE) obj;
        if (this.BGx != qe.BGx || this.mbG != qe.mbG) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, qe.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, qe.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, qe.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, qe.hIl}, getCieXyz.write())).booleanValue();
    }
}
