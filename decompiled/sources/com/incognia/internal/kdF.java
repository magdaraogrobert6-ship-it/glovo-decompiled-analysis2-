package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kdF {
    public static final String BGx = dDH.BGx(new byte[]{-85, -25, 110, 66, 104, -96, -18, 56, -45, -86, 34, 106, 46, -45, -83, -38, -90, 3, 108, -63, 35, 16, 8, -7, 3, 23, -115, -116, -97, -80, 102, 69});
    public static final String mbG = dDH.BGx(new byte[]{106, 19, 42, 51, -123, 61, -40, -64, -27, 125, 86, -42, -91, -70, 83, 123, -58, -73, 16, -31, 72, 6, 32, -7, -103, 35, -68, 25, 107, 7, -62, 98});
    public static final String HQ = dDH.BGx(new byte[]{13, -30, -107, -98, 87, 87, -25, 3, 35, 97, -109, 54, -19, 109, -84, 42, 0, 116, -105, -115, 45, -79, 99, 92, -51, -55, 41, 12, 65, -18, -63, 104});
    public static final String N = dDH.BGx(new byte[]{12, -100, 79, -71, 77, 62, 66, 43, 67, -98, -63, 15, 32, -56, -27, -102, -71, 127, -124, -36, 62, 52, 38, 30, 112, 111, 69, -41, 2, -70, -61, -29});

    public static JSONObject BGx(h4O h4o) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = h4o.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = h4o.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        jSONObject.put(HQ, h4o.HQ);
        jSONObject.put(N, h4o.N);
        return jSONObject;
    }
}
