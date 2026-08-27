package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class tQZ {
    public final List BGx;
    public final Boolean mbG;

    public tQZ(List list, Boolean bool) {
        this.BGx = list;
        this.mbG = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tQZ)) {
            return false;
        }
        tQZ tqz = (tQZ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, tqz.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, tqz.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        List list = this.BGx;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.mbG;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }
}
