package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Lu {
    public final int BGx;
    public final String HQ;
    public final long mbG;

    public final int hashCode() {
        int iBGx = NS.BGx(this.mbG, Integer.hashCode(this.BGx) * 31, 31);
        String str = this.HQ;
        return iBGx + (str == null ? 0 : str.hashCode());
    }

    public Lu(int i, long j, String str) {
        this.BGx = i;
        this.mbG = j;
        this.HQ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lu)) {
            return false;
        }
        Lu lu = (Lu) obj;
        if (this.BGx != lu.BGx || this.mbG != lu.mbG) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, lu.HQ}, getCieXyz.write())).booleanValue();
    }
}
