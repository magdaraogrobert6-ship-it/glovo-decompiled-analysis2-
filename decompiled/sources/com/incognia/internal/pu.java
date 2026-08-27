package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class pu {
    public final ArrayList BGx;
    public final Integer HQ;
    public final Boolean N;
    public final Integer mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        int iHashCode2 = this.mbG.hashCode();
        return this.N.hashCode() + ((this.HQ.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public pu(ArrayList arrayList, Integer num, Integer num2, Boolean bool) {
        this.BGx = arrayList;
        this.mbG = num;
        this.HQ = num2;
        this.N = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu)) {
            return false;
        }
        pu puVar = (pu) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, puVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, puVar.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, puVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, puVar.N}, getCieXyz.write())).booleanValue();
    }
}
