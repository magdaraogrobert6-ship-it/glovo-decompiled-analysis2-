package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tl6 {
    public static final String BGx = dDH.BGx(new byte[]{-76, 51, -63, -77, -76, -19, -73, 123, 99, -15, 118, -7, -96, -19, -9, 117, -127, 118, 30, 95, 18, -22, 109, 77, -37, -94, 12, 101, -8, 117, -32, -90});
    public static final String mbG = dDH.BGx(new byte[]{-32, -9, 64, -67, 76, 53, -78, 36, -3, 62, -25, 16, -112, 124, -88, -68, -98, -77, 100, -51, 126, -72, -76, 18, 30, -6, -113, 2, -6, -20, -72, 93});
    public static final String HQ = dDH.BGx(new byte[]{3, -52, 92, -12, 35, -75, -84, -49, 30, -95, -123, -127, 3, -64, -114, 20, 124, 53, -60, -51, -29, 124, -92, -123, -53, -81, 62, -5, -112, -77, 97, -108});
    public static final String N = dDH.BGx(new byte[]{96, 4, 116, 99, -44, 79, -4, 94, -57, -45, 75, 1, -61, 39, -77, -89, -28, -127, 50, -121, -7, 119, 24, -93, 41, -88, 81, 82, -84, -127, 81, 22});

    public static JSONObject BGx(PRp pRp) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, pRp.BGx);
        jSONObject.put(mbG, pRp.mbG);
        String str = pRp.HQ;
        if (str != null) {
            jSONObject.put(HQ, str);
        }
        String str2 = pRp.N;
        if (str2 != null) {
            jSONObject.put(N, str2);
        }
        return jSONObject;
    }
}
