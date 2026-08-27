package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cKI {
    public final JSONObject BGx;
    public final int HQ;
    public final Integer N;
    public final iqy mbG;

    public final int hashCode() {
        int iBGx = wZ.BGx(this.HQ, (this.mbG.hashCode() + (this.BGx.hashCode() * 31)) * 31, 31);
        Integer num = this.N;
        return iBGx + (num == null ? 0 : num.hashCode());
    }

    public cKI(JSONObject jSONObject, iqy iqyVar, int i, Integer num) {
        this.BGx = jSONObject;
        this.mbG = iqyVar;
        this.HQ = i;
        this.N = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cKI)) {
            return false;
        }
        cKI cki = (cKI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, cki.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, cki.mbG}, getCieXyz.write())).booleanValue() || this.HQ != cki.HQ) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, cki.N}, getCieXyz.write())).booleanValue();
    }
}
