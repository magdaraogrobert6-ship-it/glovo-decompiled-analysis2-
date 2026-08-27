package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dCd {
    public static final String BGx = dDH.BGx(new byte[]{-102, 26, -112, -15, 88, -98, 123, -2, -46, -60, -117, -96, 82, -75, -44, -114, 23, 110, -62, -74, -39, -72, 20, 16, 108, 44, 9, -90, 88, 98, -22, 114});
    public static final String mbG = dDH.BGx(new byte[]{7, 113, 71, 75, 27, -6, -35, -55, 29, -85, -109, 22, -51, 100, -40, -105, 122, -90, 58, 26, 92, -69, 19, -89, 119, 98, -70, -92, 110, -52, 78, -97});
    public static final String HQ = dDH.BGx(new byte[]{74, -118, -55, -39, 122, 98, 41, -51, 49, -88, -48, -6, -116, 107, -27, -43, -43, 32, -124, -60, 94, -120, -32, 64, 55, -10, 85, 12, 28, -103, 34, 50});
    public static final String N = dDH.BGx(new byte[]{-3, -121, 54, -83, 95, -4, 68, -92, 102, -33, -112, -71, -83, -6, -125, -61, 1, 55, -36, 31, 118, 41, 125, -29, -100, -75, -34, 123, 76, -7, -80, -85});

    public static JSONObject BGx(JnG jnG) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = jnG.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = jnG.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        Integer num = jnG.HQ;
        if (num != null) {
            jSONObject.put(HQ, num.intValue());
        }
        Float f = jnG.N;
        if (f != null) {
            jSONObject.put(N, f);
        }
        return jSONObject;
    }
}
