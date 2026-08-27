package com.incognia.internal;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class wSt extends E3 {
    public final int HQ;
    public final String N;
    public final Throwable x;

    @Override // com.incognia.internal.E3, java.lang.Throwable
    public final Throwable getCause() {
        return this.x;
    }

    public final int hashCode() {
        int iBGx = Fo.BGx(this.N, Integer.hashCode(this.HQ) * 31, 31);
        Throwable th = this.x;
        return iBGx + (th == null ? 0 : th.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wSt)) {
            return false;
        }
        wSt wst = (wSt) obj;
        if (this.HQ != wst.HQ) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, wst.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, wst.x}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wSt(int i, String str, Throwable th, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        th = (i2 & 4) != 0 ? null : th;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Network Exception: URL: ", i, str, " Status: ", " Cause: ");
        sbM.append(th != null ? th.getMessage() : null);
        super(sbM.toString(), th);
        this.HQ = i;
        this.N = str;
        this.x = th;
    }
}
