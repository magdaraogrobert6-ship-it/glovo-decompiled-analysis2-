package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ZmT implements LmG {
    public final MLu BGx;

    public final int hashCode() {
        return this.BGx.hashCode();
    }

    public ZmT(MLu mLu) {
        this.BGx = mLu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZmT)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ((ZmT) obj).BGx}, getCieXyz.write())).booleanValue();
    }
}
