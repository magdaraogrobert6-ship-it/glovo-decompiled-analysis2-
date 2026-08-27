package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class J19 {
    public final Boolean BGx;
    public final lc mbG;

    public J19(Boolean bool, lc lcVar) {
        this.BGx = bool;
        this.mbG = lcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J19)) {
            return false;
        }
        J19 j19 = (J19) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, j19.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, j19.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Boolean bool = this.BGx;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        lc lcVar = this.mbG;
        return (iHashCode * 31) + (lcVar != null ? lcVar.hashCode() : 0);
    }
}
