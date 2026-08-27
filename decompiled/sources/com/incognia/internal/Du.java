package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Du {
    public final Long BGx;
    public final Long mbG;

    public Du(Long l, Long l2) {
        this.BGx = l;
        this.mbG = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Du)) {
            return false;
        }
        Du du = (Du) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, du.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, du.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.mbG;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }
}
