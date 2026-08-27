package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class hvS {
    public final Gbn BGx;
    public final U9 mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        U9 u9 = this.mbG;
        return (iHashCode * 31) + (u9 == null ? 0 : u9.hashCode());
    }

    public hvS(Gbn gbn) {
        this.BGx = gbn;
        this.mbG = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvS)) {
            return false;
        }
        hvS hvs = (hvS) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, hvs.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, hvs.mbG}, getCieXyz.write())).booleanValue();
    }

    public hvS(Gbn gbn, U9 u9) {
        this.BGx = gbn;
        this.mbG = u9;
    }
}
