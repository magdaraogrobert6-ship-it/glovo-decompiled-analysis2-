package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class A2B implements LmG {
    public final et5 BGx;

    public final int hashCode() {
        return this.BGx.hashCode();
    }

    public A2B(et5 et5Var) {
        this.BGx = et5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A2B)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ((A2B) obj).BGx}, getCieXyz.write())).booleanValue();
    }
}
