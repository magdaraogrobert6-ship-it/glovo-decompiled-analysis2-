package com.incognia.internal;

import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class FXp extends lL {
    public final String mbG;

    public FXp(String str) {
        super(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Data Exception: error obtaining ", str));
        this.mbG = str;
    }

    public final int hashCode() {
        return this.mbG.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FXp)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ((FXp) obj).mbG}, getCieXyz.write())).booleanValue();
    }
}
