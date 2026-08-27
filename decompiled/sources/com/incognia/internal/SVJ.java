package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SVJ {
    public final String BGx;
    public final Lambda HQ;
    public final UsU mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        return this.HQ.hashCode() + ((this.mbG.hashCode() + (iHashCode * 31)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SVJ(String str, UsU usU, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.BGx = str;
        this.mbG = usU;
        this.HQ = (Lambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SVJ)) {
            return false;
        }
        SVJ svj = (SVJ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, svj.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, svj.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, svj.HQ}, getCieXyz.write())).booleanValue();
    }
}
