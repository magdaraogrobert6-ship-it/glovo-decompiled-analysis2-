package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ju {
    public static final String BGx = dDH.BGx(new byte[]{119, 21, 90, -85, -112, 100, 5, -46, 51, -66, 61, -89, 92, 40, 64, 95, 80, 94, 56, 47, 6, -94, -121, -40, -83, -85, 114, 93, -4, -71, -85, 36});
    public static final String mbG = dDH.BGx(new byte[]{-93, -92, 115, 12, 12, 63, -11, 56, -52, 54, 60, -83, -54, -46, 20, 13, 95, 44, 92, -30, 14, 55, 90, 26, 70, -14, 6, 120, -13, 109, -47, -33});

    public static JSONObject BGx(MQs mQs) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, mQs.BGx);
        jSONObject.put(mbG, mQs.mbG);
        return jSONObject;
    }
}
