package com.incognia.internal;

import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Ms {
    public final cqI BGx;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM HQ;
    public final JI3 mbG;

    public Ms(cqI cqi, JI3 ji3) {
        aVL avl = aVL.BGx;
        this.BGx = cqi;
        this.mbG = ji3;
        this.HQ = avl;
    }

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        return this.HQ.hashCode() + ((this.mbG.hashCode() + (iHashCode * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ms)) {
            return false;
        }
        Ms ms = (Ms) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ms.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ms.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ms.HQ}, getCieXyz.write())).booleanValue();
    }

    public Ms(cqI cqi, JI3 ji3, fEp fep) {
        this.BGx = cqi;
        this.mbG = ji3;
        this.HQ = fep;
    }
}
