package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jP7 {
    public final JSONObject BGx;
    public final Long HQ;
    public final Long mbG;

    public jP7(JSONObject jSONObject, Long l, Long l2) {
        this.BGx = jSONObject;
        this.mbG = l;
        this.HQ = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jP7)) {
            return false;
        }
        jP7 jp7 = (jP7) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, jp7.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, jp7.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, jp7.HQ}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        JSONObject jSONObject = this.BGx;
        int iHashCode = jSONObject == null ? 0 : jSONObject.hashCode();
        Long l = this.mbG;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.HQ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0);
    }
}
