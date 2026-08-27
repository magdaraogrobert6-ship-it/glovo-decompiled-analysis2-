package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class uKg {
    public final ArrayList BGx;

    public final int hashCode() {
        return this.BGx.hashCode();
    }

    public uKg(ArrayList arrayList) {
        this.BGx = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uKg)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ((uKg) obj).BGx}, getCieXyz.write())).booleanValue();
    }
}
