package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TEI {
    public final ArrayList BGx;
    public final LinkedHashMap mbG;

    public TEI() {
        this.BGx = null;
        this.mbG = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TEI)) {
            return false;
        }
        TEI tei = (TEI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, tei.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, tei.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        ArrayList arrayList = this.BGx;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        LinkedHashMap linkedHashMap = this.mbG;
        return (iHashCode * 31) + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }

    public TEI(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.BGx = arrayList;
        this.mbG = linkedHashMap;
    }
}
