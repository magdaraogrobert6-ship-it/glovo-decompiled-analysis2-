package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class qc2 {
    public final String BGx;
    public final long mbG;

    public final int hashCode() {
        return Long.hashCode(this.mbG) + (this.BGx.hashCode() * 31);
    }

    public qc2(String str, long j) {
        this.BGx = str;
        this.mbG = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc2)) {
            return false;
        }
        qc2 qc2Var = (qc2) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, qc2Var.BGx}, getCieXyz.write())).booleanValue() && this.mbG == qc2Var.mbG;
    }
}
