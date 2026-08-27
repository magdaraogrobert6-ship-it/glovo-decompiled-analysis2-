package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class H2S extends Exception {
    public final Throwable BGx;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.BGx;
    }

    public H2S(Throwable th) {
        super("Reason: SDK Internal error");
        this.BGx = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H2S)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ((H2S) obj).BGx}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Throwable th = this.BGx;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }
}
