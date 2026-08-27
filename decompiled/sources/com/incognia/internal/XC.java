package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class XC {
    public static final String BGx = dDH.BGx(new byte[]{-128, -11, 101, -105, -41, -117, -90, -119, 32, -100, -56, -24, -40, 26, -120, 5, -80, 121, -41, 112, 91, -77, -87, -46, 58, 79, 124, -93, -22, 5, 124, 39});
    public static final String mbG = dDH.BGx(new byte[]{115, 81, 90, -16, -4, -119, -61, 76, 56, -19, -110, -19, -17, -1, 88, -56, 75, 35, -7, -104, -3, 47, -95, -32, 48, 67, -79, -119, -87, 20, 116, 59});

    public static JSONObject BGx(Du du) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, du.BGx.longValue());
        Long l = du.mbG;
        if (l != null) {
            jSONObject.put(mbG, l.longValue());
        }
        return jSONObject;
    }
}
