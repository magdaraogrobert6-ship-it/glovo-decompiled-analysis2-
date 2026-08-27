package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class d9 {
    public static final /* synthetic */ int VV3 = 0;
    public static final long hs = 60000;
    public final Long BGx;
    public final Boolean HQ;
    public final ArrayList N;
    public final Boolean hIl;
    public final Boolean mbG;
    public final Boolean x;

    public d9(Long l, Boolean bool, Boolean bool2, ArrayList arrayList, Boolean bool3, Boolean bool4) {
        this.BGx = l;
        this.mbG = bool;
        this.HQ = bool2;
        this.N = arrayList;
        this.x = bool3;
        this.hIl = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, d9Var.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, d9Var.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, d9Var.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, d9Var.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, d9Var.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, d9Var.hIl}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        int iHashCode = l == null ? 0 : l.hashCode();
        Boolean bool = this.mbG;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.HQ;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        ArrayList arrayList = this.N;
        int iHashCode4 = arrayList == null ? 0 : arrayList.hashCode();
        Boolean bool3 = this.x;
        int iHashCode5 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.hIl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    public /* synthetic */ d9(Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        this(l, bool, bool2, (ArrayList) null, bool3, (i & 32) != 0 ? null : bool4);
    }
}
