package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E1i {
    public static final String BGx = dDH.BGx(new byte[]{-43, -34, 41, 92, -25, 53, 57, -76, -22, -50, 0, -33, 50, -111, -83, -71, -12, 125, -18, 32, 33, -2, -128, -51, 11, 71, -109, 20, 63, -105, 95, 94});

    public static JSONObject BGx(zdS zds) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Integer num = zds.BGx;
        if (num != null) {
            jSONObject.put(BGx, num.intValue());
        }
        return jSONObject;
    }
}
