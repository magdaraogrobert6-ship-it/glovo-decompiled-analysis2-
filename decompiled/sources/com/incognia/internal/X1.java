package com.incognia.internal;

import java.util.UUID;
import o.ensureSubscribedToInAppMessageEvents;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class X1 {
    public final String BGx;
    public final long HQ;
    public final String N;
    public final JSONObject mbG;
    public final String x;
    public static final String hIl = (String) W4i.paF.MediaSessionCompatResultReceiverWrapper();
    public static final String hs = (String) W4i.vqK.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.tz.MediaSessionCompatResultReceiverWrapper();
    public static final String A1 = (String) W4i.K5.MediaSessionCompatResultReceiverWrapper();

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        return this.x.hashCode() + Fo.BGx(this.N, NS.BGx(this.HQ, (this.mbG.hashCode() + (iHashCode * 31)) * 31, 31), 31);
    }

    public final JSONObject mbG() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.mbG.toString());
        jSONObject.put(hIl, this.BGx);
        jSONObject.put(hs, this.x);
        jSONObject.put(VV3, this.HQ);
        jSONObject.put(A1, this.N);
        return jSONObject;
    }

    public /* synthetic */ X1(String str, JSONObject jSONObject, long j, String str2) {
        this(str, jSONObject, j, str2, UUID.randomUUID().toString());
    }

    public final int BGx() {
        return mbG().toString().getBytes(ensureSubscribedToInAppMessageEvents.write).length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X1)) {
            return false;
        }
        X1 x1 = (X1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, x1.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, x1.mbG}, getCieXyz.write())).booleanValue() || this.HQ != x1.HQ) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, x1.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, x1.x}, getCieXyz.write())).booleanValue();
    }

    public X1(String str, JSONObject jSONObject, long j, String str2, String str3) {
        this.BGx = str;
        this.mbG = jSONObject;
        this.HQ = j;
        this.N = str2;
        this.x = str3;
    }
}
