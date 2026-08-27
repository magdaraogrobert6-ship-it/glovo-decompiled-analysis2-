package com.incognia.internal;

import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ib extends lL {
    public final String mbG;

    public ib(String str) {
        super(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Data Exception: no new data available for ", str));
        this.mbG = str;
    }

    public final int hashCode() {
        return this.mbG.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ((ib) obj).mbG}, getCieXyz.write())).booleanValue();
    }
}
