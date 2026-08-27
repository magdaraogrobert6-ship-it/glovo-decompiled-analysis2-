package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class zR {
    public final String BGx;
    public final int mbG;

    public final int hashCode() {
        return Integer.hashCode(this.mbG) + (this.BGx.hashCode() * 31);
    }

    public zR(String str, int i) {
        this.BGx = str;
        this.mbG = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zR)) {
            return false;
        }
        zR zRVar = (zR) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, zRVar.BGx}, getCieXyz.write())).booleanValue() && this.mbG == zRVar.mbG;
    }
}
