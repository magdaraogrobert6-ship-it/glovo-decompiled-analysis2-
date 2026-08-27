package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yR {
    public static final String BGx = dDH.BGx(new byte[]{-113, 51, -128, -16, 115, 80, 44, -59, 14, -46, -65, 10, 119, -121, -69, -26, -44, -27, 1, 95, 18, 99, -88, 75, 69, 123, -72, 56, -82, 121, -69, 9});
    public static final String mbG = dDH.BGx(new byte[]{-35, -43, 55, -43, 52, -65, -21, -10, -9, 12, 103, -36, 26, 123, 9, 62, -10, -30, 93, 22, -111, -88, 10, 14, -25, -51, -27, -72, -70, -41, 75, 64});

    public static JSONObject BGx(qc2 qc2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, qc2Var.BGx);
        jSONObject.put(mbG, qc2Var.mbG);
        return jSONObject;
    }
}
