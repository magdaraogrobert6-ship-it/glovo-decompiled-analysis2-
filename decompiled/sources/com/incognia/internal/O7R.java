package com.incognia.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class O7R extends E3 {
    public final String HQ;
    public final Throwable N;

    @Override // com.incognia.internal.E3, java.lang.Throwable
    public final Throwable getCause() {
        return this.N;
    }

    public final int hashCode() {
        int iHashCode = this.HQ.hashCode();
        Throwable th = this.N;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public O7R(String str, Throwable th) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Network Exception: Unknown error URL: ", str, " Cause: ");
        sbM.append(th != null ? th.getMessage() : null);
        super(sbM.toString(), th, 1);
        this.HQ = str;
        this.N = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O7R)) {
            return false;
        }
        O7R o7r = (O7R) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, o7r.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, o7r.N}, getCieXyz.write())).booleanValue();
    }
}
