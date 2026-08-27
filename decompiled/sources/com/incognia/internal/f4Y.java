package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f4Y {
    public static final String BGx = dDH.BGx(new byte[]{-82, 19, 75, 16, -80, -82, 86, -4, 62, 32, 40, 19, 6, -74, -121, 64, 37, -125, -18, 9, 45, 26, -49, -84, 47, 58, -93, 1, 100, 40, -63, -102});
    public static final String mbG = dDH.BGx(new byte[]{68, -71, 114, 61, -69, 36, 2, 58, 109, 117, 8, 122, -30, 10, 109, 49, -114, 97, 38, 16, 24, -121, -89, -2, 51, -91, 83, -85, -65, -50, -108, 105});
    public static final String HQ = dDH.BGx(new byte[]{82, 81, 91, 65, -82, 7, -105, -33, -71, 103, 53, 112, -64, -64, 38, -1, -62, 44, 107, -19, -36, 57, -113, -12, 77, -30, 115, 113, -16, -70, 54, 81});
    public static final String N = dDH.BGx(new byte[]{-37, 43, 84, -124, -52, 70, 120, 60, -88, -117, -128, -7, 73, 83, -22, 43, -53, -107, 90, 71, 37, 81, 107, 5, -68, 92, -81, 71, -101, -74, 76, -94});
    public static final String x = dDH.BGx(new byte[]{39, 95, -105, -87, -16, -13, -63, -117, 59, -30, 51, 80, 30, 124, -52, -108, -109, 35, 112, -25, 109, 102, 103, -112, 4, 85, 85, -45, -92, 13, 100, -118});
    public static final String hIl = dDH.BGx(new byte[]{-53, -74, 19, 121, -66, 82, 114, -12, -97, -87, 68, 7, -64, 105, -118, -25, -35, 2, 74, -36, 20, -109, 69, 39, -52, -46, 98, -59, 38, 28, -105, -61});
    public static final String hs = dDH.BGx(new byte[]{58, -53, -112, -30, 70, -23, -19, 30, 100, 108, -27, -25, 37, 83, -33, -12, -115, 95, -104, -7, -70, 14, 7, -99, -114, -110, 66, -114, 25, -72, 118, 127});
    public static final String VV3 = dDH.BGx(new byte[]{16, 35, 9, -116, 30, -97, 76, 76, -108, -12, 90, -123, 1, 115, 27, -82, 105, -68, 15, 20, -75, 114, 69, 120, 99, -34, 94, 113, 26, 97, -33, 101});
    public static final String A1 = dDH.BGx(new byte[]{-45, 11, -33, -89, -98, -43, 94, 109, 2, -64, 98, 122, 41, 84, -97, 0, -53, -102, -99, 76, -22, -108, -38, 117, 40, -118, -101, 31, -7, -40, -26, 103});

    public static JSONObject BGx(LCt lCt) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, lCt.BGx);
        jSONObject.put(mbG, lCt.mbG);
        jSONObject.put(HQ, lCt.HQ);
        jSONObject.put(N, lCt.N);
        jSONObject.put(x, lCt.x);
        String str = lCt.hIl;
        if (str != null) {
            jSONObject.put(hIl, str);
        }
        String str2 = lCt.hs;
        if (str2 != null) {
            jSONObject.put(hs, str2);
        }
        Integer num = lCt.VV3;
        if (num != null) {
            jSONObject.put(VV3, num.intValue());
        }
        Boolean bool = lCt.A1;
        if (bool != null) {
            jSONObject.put(A1, bool.booleanValue());
        }
        return jSONObject;
    }
}
