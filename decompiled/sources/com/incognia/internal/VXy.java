package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class VXy {
    public final zY5 BGx;
    public final U9 mbG;

    public VXy(zY5 zy5, U9 u9) {
        this.BGx = zy5;
        this.mbG = u9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VXy)) {
            return false;
        }
        VXy vXy = (VXy) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, vXy.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, vXy.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        zY5 zy5 = this.BGx;
        int iHashCode = zy5 == null ? 0 : zy5.hashCode();
        U9 u9 = this.mbG;
        return (iHashCode * 31) + (u9 != null ? u9.hashCode() : 0);
    }
}
