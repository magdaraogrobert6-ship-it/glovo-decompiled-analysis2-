package com.incognia.internal;

import java.util.UUID;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class iR9 {
    public final Long BGx;
    public final long HQ;
    public final ZBu N;
    public final String mbG;

    public /* synthetic */ iR9(long j, ZBu zBu) {
        this(null, UUID.randomUUID().toString(), j, zBu);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iR9)) {
            return false;
        }
        iR9 ir9 = (iR9) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ir9.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ir9.mbG}, getCieXyz.write())).booleanValue() || this.HQ != ir9.HQ) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, ir9.N}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Long l = this.BGx;
        return this.N.hashCode() + NS.BGx(this.HQ, Fo.BGx(this.mbG, (l == null ? 0 : l.hashCode()) * 31, 31), 31);
    }

    public iR9(Long l, String str, long j, ZBu zBu) {
        this.BGx = l;
        this.mbG = str;
        this.HQ = j;
        this.N = zBu;
    }
}
