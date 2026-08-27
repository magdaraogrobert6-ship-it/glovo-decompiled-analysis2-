package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LEL {
    public static final String BGx = dDH.BGx(new byte[]{14, 35, 87, 29, -4, 122, 89, -128, -79, 20, 99, 14, -70, 33, 53, -118, -93, 63, 70, 93, -95, -75, -75, -59, 86, 81, -28, -45, 3, 39, 60, 39});
    public static final String mbG = dDH.BGx(new byte[]{-35, -63, -107, -32, 69, -90, 56, -105, 58, -13, -79, -106, 54, 122, 36, 112, 3, 71, 13, -103, -40, 54, -44, -9, -4, -113, 117, 37, -31, 58, -124, 19});

    public static JSONObject BGx(dWj dwj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, dwj.BGx.booleanValue());
        jSONObject.put(mbG, dwj.mbG.booleanValue());
        return jSONObject;
    }
}
