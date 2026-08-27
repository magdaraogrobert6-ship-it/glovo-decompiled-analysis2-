package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b3B {
    public static final String BGx = dDH.BGx(new byte[]{-53, 110, 34, 92, -123, -91, -107, 48, 26, -54, -117, 82, -128, -21, -37, 122, -56, -13, -104, -85, 73, 86, -73, 52, 64, -125, -35, 92, 65, -83, 33, 103});
    public static final String mbG = dDH.BGx(new byte[]{-92, -11, 96, -77, -53, -7, 54, -114, 33, -70, 18, -120, -45, 52, -30, -49, 67, -24, -61, 74, -24, 75, 111, 55, -88, 43, -85, 60, 114, -101, 67, 56});
    public static final String HQ = dDH.BGx(new byte[]{-5, 80, -25, 16, 50, -84, 8, -65, -49, -66, -71, -9, -33, 40, -50, -61, -42, -9, -8, 119, -83, 56, -117, -46, -1, 92, -99, 48, -43, 76, -106, 34});
    public static final String N = dDH.BGx(new byte[]{76, -107, 55, 56, -38, 123, 64, 39, 20, -60, 4, 119, -100, -75, -88, 12, -34, -34, -74, 106, 49, 123, 87, 32, -52, -20, 50, -118, 43, -27, -22, -52});
    public static final String x = dDH.BGx(new byte[]{-1, -10, -12, 126, -83, -2, -55, 8, -92, 9, 9, 44, -122, 4, 86, 81, -125, -98, 51, -76, 90, 46, 105, 57, -15, -90, 105, -104, -50, 50, -75, -36});

    public static JSONObject BGx(VOk vOk) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, vOk.mbG);
        jSONObject.put(mbG, vOk.HQ);
        jSONObject.put(HQ, vOk.N);
        jSONObject.put(N, vOk.x);
        jSONObject.put(x, vOk.hIl);
        return jSONObject;
    }
}
