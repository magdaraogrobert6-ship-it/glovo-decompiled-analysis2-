package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Rsi {
    public static final String BGx = dDH.BGx(new byte[]{-101, 29, 5, 125, 72, -104, 2, 63, -99, 31, -86, 55, -78, -79, -86, 31, -29, -38, 53, 14, -83, 23, -79, 80, 68, -4, 28, -120, 77, -30, -128, 30});
    public static final String mbG = dDH.BGx(new byte[]{2, 127, 107, -103, 126, -56, -99, -53, 102, -71, 106, 81, 120, -2, 19, 110, -100, 56, 92, 5, 52, 12, 39, 95, -64, -110, 52, 67, 8, -72, 38, -125});
    public static final String HQ = dDH.BGx(new byte[]{-100, 99, -2, -2, 61, -122, 96, 37, 114, -55, -70, -124, 83, -75, 123, -32, 96, 68, -93, 114, 71, -122, -54, 15, -6, -29, -76, -52, -127, -68, -67, -80});
    public static final String N = dDH.BGx(new byte[]{-92, 54, 7, 79, -9, -33, -122, -5, 121, -76, -111, 51, 118, -59, 108, 88, 27, -78, -89, 46, -92, -10, 64, 85, 15, 27, 13, 65, -62, -11, -20, -103});

    public static JSONObject BGx(Rn rn) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = rn.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = rn.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        Integer num = rn.HQ;
        if (num != null) {
            jSONObject.put(HQ, num.intValue());
        }
        String str3 = rn.N;
        if (str3 != null) {
            jSONObject.put(N, str3);
        }
        return jSONObject;
    }
}
