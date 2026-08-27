package com.incognia.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Oo1 {
    public final Set BGx;
    public final LinkedHashSet HQ;
    public final VlQ N;
    public final LinkedHashSet mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        int iHashCode2 = this.mbG.hashCode();
        return this.N.hashCode() + ((this.HQ.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public Oo1(Set set, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, VlQ vlQ) {
        this.BGx = set;
        this.mbG = linkedHashSet;
        this.HQ = linkedHashSet2;
        this.N = vlQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oo1)) {
            return false;
        }
        Oo1 oo1 = (Oo1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, oo1.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, oo1.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, oo1.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, oo1.N}, getCieXyz.write())).booleanValue();
    }
}
