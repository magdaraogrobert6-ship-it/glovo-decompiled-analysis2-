package com.incognia.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class osA {
    public static final String BGx = dDH.BGx(new byte[]{-91, -39, 127, -2, 99, 39, -17, 56, -59, 39, -96, 28, -2, 100, 46, 47, -97, 127, -67, -63, -121, 74, 9, 48, 87, 15, 8, 56, -86, 29, -120, 57});
    public static final String mbG = dDH.BGx(new byte[]{121, -44, -15, -76, 102, 88, -33, 28, 79, 17, 95, 28, -35, -80, 49, 32, 6, 28, -111, 18, 6, -87, 13, 22, -92, 127, -92, 111, 102, 14, -106, -32});
    public static final String HQ = dDH.BGx(new byte[]{-116, 47, -11, 81, 105, 24, 113, -86, -71, 121, -85, -84, -72, 97, -124, 72, -60, 25, -87, 58, 39, -7, -68, -86, 80, 27, -107, 120, 30, 1, -34, -72});
    public static final String N = dDH.BGx(new byte[]{-62, -22, -86, 116, -68, 73, 98, 44, 122, 72, 74, 116, -38, -76, -97, -49, -54, 97, 22, 71, -25, -72, -109, 33, -33, 16, -19, 54, 102, -36, -65, -118});
    public static final String x = dDH.BGx(new byte[]{-64, -29, -69, 25, -91, -65, -114, -2, 91, 9, -74, 38, 55, 9, 107, -55, 81, -105, -68, -109, 17, -61, -9, 85, -77, -86, -23, 96, 71, 69, -83, -38});

    public static JSONObject BGx(zY5 zy5) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = zy5.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = zy5.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        if (zy5.HQ != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : zy5.HQ.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put(HQ, jSONObject2);
        }
        String str3 = zy5.N;
        if (str3 != null) {
            jSONObject.put(N, str3);
        }
        String str4 = zy5.x;
        if (str4 != null) {
            jSONObject.put(x, str4);
        }
        return jSONObject;
    }
}
