package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class oV6 {
    public final boolean BGx;
    public final Long HQ;
    public final Long N;
    public final Long hIl;
    public final Long hs;
    public final Boolean mbG;
    public final Boolean x;

    public oV6(boolean z, Boolean bool, Long l, Long l2, Boolean bool2, Long l3, Long l4) {
        this.BGx = z;
        this.mbG = bool;
        this.HQ = l;
        this.N = l2;
        this.x = bool2;
        this.hIl = l3;
        this.hs = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oV6)) {
            return false;
        }
        oV6 ov6 = (oV6) obj;
        if (this.BGx != ov6.BGx) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ov6.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ov6.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, ov6.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, ov6.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, ov6.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, ov6.hs}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public final int hashCode() {
        boolean z = this.BGx;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        Boolean bool = this.mbG;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Long l = this.HQ;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.N;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        Boolean bool2 = this.x;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        Long l3 = this.hIl;
        int iHashCode5 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.hs;
        return (((((((((((r0 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l4 != null ? l4.hashCode() : 0);
    }
}
