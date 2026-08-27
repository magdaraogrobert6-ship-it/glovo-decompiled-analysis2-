package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class jrj {
    public final List BGx;
    public final String HQ;
    public final String N;
    public final Boolean mbG;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrj)) {
            return false;
        }
        jrj jrjVar = (jrj) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, jrjVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, jrjVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, jrjVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, jrjVar.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        List list = this.BGx;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.mbG;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.HQ;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.N;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public jrj(ArrayList arrayList, Boolean bool, String str, String str2, int i) {
        arrayList = (i & 1) != 0 ? null : arrayList;
        bool = (i & 2) != 0 ? null : bool;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        this.BGx = arrayList;
        this.mbG = bool;
        this.HQ = str;
        this.N = str2;
    }
}
