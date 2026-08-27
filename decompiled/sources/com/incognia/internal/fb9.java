package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class fb9 {
    public final Long BGx;
    public final ArrayList HQ;
    public final ArrayList N;
    public final Long hIl;
    public final Long hs;
    public final String mbG;
    public final ArrayList x;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        String str = this.mbG;
        return this.hs.hashCode() + ((this.hIl.hashCode() + r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.x, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.N, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.HQ, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31)) * 31);
    }

    public fb9(Long l, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Long l2, Long l3) {
        this.BGx = l;
        this.mbG = str;
        this.HQ = arrayList;
        this.N = arrayList2;
        this.x = arrayList3;
        this.hIl = l2;
        this.hs = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb9)) {
            return false;
        }
        fb9 fb9Var = (fb9) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, fb9Var.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, fb9Var.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, fb9Var.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, fb9Var.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, fb9Var.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, fb9Var.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, fb9Var.hs}, getCieXyz.write())).booleanValue();
    }
}
