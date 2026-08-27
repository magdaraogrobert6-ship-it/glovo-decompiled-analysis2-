package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class nfx extends E3 {
    public final int HQ;
    public final String N;

    public final int hashCode() {
        return this.N.hashCode() + (Integer.hashCode(this.HQ) * 31);
    }

    public nfx(int i, String str) {
        super("Network Exception: URL: " + str + " Status: " + i, null, 8);
        this.HQ = i;
        this.N = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfx)) {
            return false;
        }
        nfx nfxVar = (nfx) obj;
        if (this.HQ != nfxVar.HQ) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, nfxVar.N}, getCieXyz.write())).booleanValue();
    }
}
