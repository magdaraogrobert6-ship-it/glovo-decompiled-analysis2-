package com.incognia.internal;

import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class J3D extends E3 {
    public final String HQ;

    public J3D(String str) {
        super(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Network Exception: Network unavailable URL: ", str), null, 9);
        this.HQ = str;
    }

    public final int hashCode() {
        return this.HQ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J3D)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ((J3D) obj).HQ}, getCieXyz.write())).booleanValue();
    }
}
