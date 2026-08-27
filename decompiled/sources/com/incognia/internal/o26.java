package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class o26 {
    public final String BGx;
    public final Boolean HQ;
    public final ArrayList N;
    public final String mbG;

    public o26(String str, String str2, Boolean bool, ArrayList arrayList) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = bool;
        this.N = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o26)) {
            return false;
        }
        o26 o26Var = (o26) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, o26Var.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, o26Var.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, o26Var.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, o26Var.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mbG;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.HQ;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        ArrayList arrayList = this.N;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }
}
