package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Eq {
    public final ArrayList BGx;
    public final Boolean mbG;

    public final int hashCode() {
        return this.mbG.hashCode() + (this.BGx.hashCode() * 31);
    }

    public Eq(ArrayList arrayList, Boolean bool) {
        this.BGx = arrayList;
        this.mbG = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Eq)) {
            return false;
        }
        Eq eq = (Eq) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, eq.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, eq.mbG}, getCieXyz.write())).booleanValue();
    }
}
