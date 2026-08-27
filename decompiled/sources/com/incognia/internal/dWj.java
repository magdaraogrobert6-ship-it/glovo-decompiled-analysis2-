package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class dWj {
    public final Boolean BGx;
    public final Boolean mbG;

    public dWj(Boolean bool, Boolean bool2) {
        this.BGx = bool;
        this.mbG = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dWj)) {
            return false;
        }
        dWj dwj = (dWj) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, dwj.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, dwj.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Boolean bool = this.BGx;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.mbG;
        return (iHashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }
}
