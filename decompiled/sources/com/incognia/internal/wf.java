package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class wf {
    public final JSONObject BGx;
    public final long HQ;
    public final Long N;
    public final Boolean hIl;
    public final long mbG;
    public final Long x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.HQ, NS.BGx(this.mbG, this.BGx.hashCode() * 31, 31), 31);
        Long l = this.N;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.x;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        Boolean bool = this.hIl;
        return ((((iBGx + iHashCode) * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public wf(JSONObject jSONObject, long j, long j2, Long l, Long l2, Boolean bool) {
        this.BGx = jSONObject;
        this.mbG = j;
        this.HQ = j2;
        this.N = l;
        this.x = l2;
        this.hIl = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, wfVar.BGx}, getCieXyz.write())).booleanValue() || this.mbG != wfVar.mbG || this.HQ != wfVar.HQ) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, wfVar.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, wfVar.x}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, wfVar.hIl}, getCieXyz.write())).booleanValue();
    }
}
