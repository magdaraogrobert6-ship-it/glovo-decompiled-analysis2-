package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class HS5 {
    public final ArrayList BGx;
    public final ArrayList mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        ArrayList arrayList = this.mbG;
        return (iHashCode * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public HS5(ArrayList arrayList, ArrayList arrayList2) {
        this.BGx = arrayList;
        this.mbG = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HS5)) {
            return false;
        }
        HS5 hs5 = (HS5) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, hs5.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, hs5.mbG}, getCieXyz.write())).booleanValue();
    }
}
