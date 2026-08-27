package com.incognia.internal;

import android.content.Context;
import java.util.Locale;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class B9R implements Xeg {
    public static final String A1;
    public static final String BGx;
    public static final String HQ;
    public static final String N;
    public static final String S;
    public static final String VV3;
    public static final String fZl;
    public static final String hIl;
    public static final String hs;
    public static final String mbG;
    public static final String q;
    public static final String x;

    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 1;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return true;
    }

    static {
        BGx = (String) W4i.mQG.MediaSessionCompatResultReceiverWrapper();
        mbG = (String) W4i.FV.MediaSessionCompatResultReceiverWrapper();
        HQ = (String) W4i.GW6.MediaSessionCompatResultReceiverWrapper();
        N = (String) W4i.nO.MediaSessionCompatResultReceiverWrapper();
        x = (String) W4i.DSN.MediaSessionCompatResultReceiverWrapper();
        hIl = (String) W4i.lH.MediaSessionCompatResultReceiverWrapper();
        hs = (String) W4i.DRU.MediaSessionCompatResultReceiverWrapper();
        VV3 = (String) W4i.dUO.MediaSessionCompatResultReceiverWrapper();
        A1 = (String) W4i.ZZs.MediaSessionCompatResultReceiverWrapper();
        q = (String) W4i.mbG.MediaSessionCompatResultReceiverWrapper();
        fZl = (String) W4i.NaG.MediaSessionCompatResultReceiverWrapper();
        S = (String) W4i.jG.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    public static void BGx(a9 a9Var, String str, String str2, String str3) throws JSONException {
        String string;
        String strMbG = a9Var.mbG(Eja.BGx, Eja.mbG);
        if (strMbG != null) {
            Ay.N.BGx(fZl, setCarryoverInAppMessage.write(strMbG, S, "").toLowerCase(Locale.getDefault()));
        }
        String strMbG2 = a9Var.mbG(str2, w8.BGx);
        if (strMbG2 == null) {
            String str4 = w8.mbG;
            String strMbG3 = a9Var.mbG(str3, str4);
            strMbG2 = strMbG3 == null ? a9Var.mbG(str, str4) : strMbG3;
        }
        if (strMbG2 != null) {
            JSONObject jSONObject = new JSONObject(strMbG2);
            String str5 = w8.HQ;
            if (jSONObject.has(str5)) {
                string = jSONObject.getString(str5);
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            Ay.N.BGx(q, string);
        }
    }

    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) throws JSONException {
        a9 a9Var = new a9(context, BGx);
        a9 a9Var2 = new a9(context, mbG);
        a9 a9Var3 = new a9(context, HQ);
        CaO caOBGx = new GUp(a9Var2, a9Var3, a9Var).BGx();
        Object[] objArr = {caOBGx, H67.mbG};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            BGx(a9Var2, N, x, hIl);
            return;
        }
        Object[] objArr2 = {caOBGx, k1.mbG};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            BGx(a9Var3, hs, VV3, A1);
            return;
        }
        Object[] objArr3 = {caOBGx, Sth.mbG};
        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue();
    }
}
