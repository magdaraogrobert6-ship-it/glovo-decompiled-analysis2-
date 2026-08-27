package com.incognia.internal;

import java.util.ArrayList;
import java.util.HashMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class FL {
    public final ArrayList BGx;
    public final HashMap mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        HashMap map = this.mbG;
        return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    public FL(ArrayList arrayList, HashMap map) {
        this.BGx = arrayList;
        this.mbG = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FL)) {
            return false;
        }
        FL fl = (FL) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, fl.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, fl.mbG}, getCieXyz.write())).booleanValue();
    }
}
