package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ar {
    public final String BGx;
    public final h3 HQ;
    public final Xj N;
    public final iO mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        int iHashCode2 = this.mbG.hashCode();
        return this.N.hashCode() + ((this.HQ.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, arVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, arVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, arVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, arVar.N}, getCieXyz.write())).booleanValue();
    }

    public ar(ETe eTe, iO iOVar, h3 h3Var) {
        String strBGx = eTe.BGx();
        Xj xj = new Xj(eTe);
        this.BGx = strBGx;
        this.mbG = iOVar;
        this.HQ = h3Var;
        this.N = xj;
    }
}
