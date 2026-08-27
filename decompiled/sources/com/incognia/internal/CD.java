package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CD {
    public static final String BGx = dDH.BGx(new byte[]{94, 15, 95, 28, 110, -50, 80, -9, -104, 97, -56, -78, 76, -36, 20, -27, 52, 11, -39, -106, 84, -40, 90, -28, -76, -62, -41, -49, 74, 96, 63, -15});
    public static final String mbG = dDH.BGx(new byte[]{-95, -123, -2, 18, 72, 124, 84, 98, 35, -118, -28, -90, -96, 54, -58, 107, 119, -57, 90, -97, -2, 29, -15, -124, -79, -52, 99, -81, 39, 15, -108, 23});
    public static final String HQ = dDH.BGx(new byte[]{13, -24, 32, -65, -105, 6, 47, -124, 114, 104, 68, 26, 14, 96, 37, -50, -20, 46, 105, -125, -63, -63, 80, 94, 99, 66, -62, 54, 107, 35, 60, 51});
    public static final String N = dDH.BGx(new byte[]{-109, -70, -74, -21, -128, -125, -47, -13, -90, -10, 25, -127, -7, -39, -78, -19, 51, 47, 0, 3, -125, 29, -24, 22, 9, -18, -72, -25, 20, -96, 44, 67});

    public static JSONObject BGx(SsA ssA) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, ssA.BGx);
        jSONObject.put(mbG, ssA.mbG);
        Long l = ssA.HQ;
        if (l != null) {
            jSONObject.put(HQ, l.longValue());
        }
        jSONObject.put(N, ssA.N);
        return jSONObject;
    }
}
