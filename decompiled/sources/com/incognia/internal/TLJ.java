package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TLJ {
    public final Long BGx;
    public final Long HQ;
    public final ArrayList N;
    public final ArrayList hIl;
    public final Long mbG;
    public final Long x;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        int iHashCode2 = this.mbG.hashCode();
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.N, (this.HQ.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31, 31);
        return this.hIl.hashCode() + ((this.x.hashCode() + iWrite) * 31);
    }

    public TLJ(Long l, Long l2, Long l3, ArrayList arrayList, Long l4, ArrayList arrayList2) {
        this.BGx = l;
        this.mbG = l2;
        this.HQ = l3;
        this.N = arrayList;
        this.x = l4;
        this.hIl = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TLJ)) {
            return false;
        }
        TLJ tlj = (TLJ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, tlj.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, tlj.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, tlj.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, tlj.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, tlj.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, tlj.hIl}, getCieXyz.write())).booleanValue();
    }
}
