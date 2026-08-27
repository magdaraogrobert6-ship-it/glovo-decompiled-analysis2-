package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class UZn {
    public final ArrayList BGx;
    public final String HQ;
    public final LinkedHashMap N;
    public final String mbG;

    public UZn(ArrayList arrayList, String str, String str2, LinkedHashMap linkedHashMap) {
        this.BGx = arrayList;
        this.mbG = str;
        this.HQ = str2;
        this.N = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UZn)) {
            return false;
        }
        UZn uZn = (UZn) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, uZn.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, uZn.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, uZn.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, uZn.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        ArrayList arrayList = this.BGx;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.mbG;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.HQ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        LinkedHashMap linkedHashMap = this.N;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }
}
