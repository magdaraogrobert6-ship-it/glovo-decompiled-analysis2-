package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RU {
    public final long BGx;
    public final List HQ;
    public final int mbG;

    public final int hashCode() {
        int iBGx = wZ.BGx(this.mbG, Long.hashCode(this.BGx) * 31, 31);
        List list = this.HQ;
        return iBGx + (list == null ? 0 : list.hashCode());
    }

    public RU(int i, long j) {
        this.BGx = j;
        this.mbG = i;
        this.HQ = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RU)) {
            return false;
        }
        RU ru = (RU) obj;
        if (this.BGx != ru.BGx || this.mbG != ru.mbG) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ru.HQ}, getCieXyz.write())).booleanValue();
    }

    public RU(long j, int i, List list) {
        this.BGx = j;
        this.mbG = i;
        this.HQ = list;
    }
}
