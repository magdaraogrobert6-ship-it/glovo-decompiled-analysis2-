package com.incognia.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GUp {
    public final a9 BGx;
    public final a9 HQ;
    public final a9 mbG;
    public static final String N = (String) W4i.LIB.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.Wwc.MediaSessionCompatResultReceiverWrapper();
    public static final String hIl = (String) W4i.Ko4.MediaSessionCompatResultReceiverWrapper();
    public static final String hs = (String) W4i.t.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.pWD.MediaSessionCompatResultReceiverWrapper();
    public static final String A1 = (String) W4i.F.MediaSessionCompatResultReceiverWrapper();
    public static final String q = (String) W4i.DLq.MediaSessionCompatResultReceiverWrapper();
    public static final String fZl = (String) W4i.VfF.MediaSessionCompatResultReceiverWrapper();

    public final CaO BGx() {
        String strMbG = this.HQ.mbG(N, x);
        if (strMbG != null) {
            int i = CaO.BGx;
            if (strMbG.equals((String) W4i.ZUU.MediaSessionCompatResultReceiverWrapper())) {
                return H67.mbG;
            }
            return strMbG.equals((String) W4i.RQ.MediaSessionCompatResultReceiverWrapper()) ? k1.mbG : Sth.mbG;
        }
        a9 a9Var = this.BGx;
        String str = hIl;
        String str2 = hs;
        String strMbG2 = a9Var.mbG(str, str2);
        String strMbG3 = this.mbG.mbG(str, str2);
        if (strMbG2 != null && strMbG3 == null) {
            return H67.mbG;
        }
        if (strMbG2 == null && strMbG3 != null) {
            return k1.mbG;
        }
        if (strMbG2 == null) {
            return Sth.mbG;
        }
        Long lBGx = BGx(this.BGx, q);
        Long lBGx2 = BGx(this.mbG, fZl);
        if (lBGx == null || lBGx2 == null) {
            return lBGx != null ? H67.mbG : k1.mbG;
        }
        return lBGx.longValue() > lBGx2.longValue() ? H67.mbG : k1.mbG;
    }

    public GUp(a9 a9Var, a9 a9Var2, a9 a9Var3) {
        this.BGx = a9Var;
        this.mbG = a9Var2;
        this.HQ = a9Var3;
    }

    public static Long BGx(a9 a9Var, String str) {
        String strMbG = a9Var.mbG(str, A1);
        if (strMbG == null) {
            return null;
        }
        try {
            return Long.valueOf(new JSONObject(strMbG).optLong(VV3));
        } catch (Throwable unused) {
            return null;
        }
    }
}
