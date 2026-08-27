package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class si {
    public static final String BGx = dDH.BGx(new byte[]{41, 30, -63, -77, 123, -122, 24, 14, 65, 120, 104, -80, 117, -21, -35, -98, -93, -74, -29, -126, -118, -89, -94, 89, 98, -12, 18, 59, 27, 75, 123, 73});
    public static final String mbG = dDH.BGx(new byte[]{18, -13, 105, 126, 97, 92, 87, -52, 7, 28, -96, -77, 127, -28, 22, 49, -98, -74, 24, -66, -28, -100, -69, -47, 31, -46, 76, -73, 49, 19, 119, 113});
    public static final String HQ = dDH.BGx(new byte[]{-111, 67, -85, -45, -44, 38, -78, -55, 102, -50, -37, 90, 37, -22, 95, -33, -94, -30, -43, 93, 103, -72, -61, 86, -5, 95, 14, -120, -18, 39, 31, -15});
    public static final String N = dDH.BGx(new byte[]{93, 37, -18, 76, -32, -10, 106, -122, -41, 115, -113, -32, -99, -17, 40, 52, -106, -62, -32, 73, -108, 28, 60, -96, -6, 6, -28, 105, -98, 58, 10, 18});
    public static final String x = dDH.BGx(new byte[]{99, 81, 72, -7, 42, -62, 98, -46, -76, -26, -126, -66, 54, 38, -120, 87, 58, 75, -60, 71, -127, -57, -4, 6, 75, -100, -43, -34, -114, -121, 86, -22});
    public static final String hIl = dDH.BGx(new byte[]{79, 64, -20, -105, -115, 86, 78, -19, -80, 25, -67, 55, -70, -6, 44, 111, -80, 47, -98, 58, 107, 24, 126, -91, -44, 38, -8, -40, 4, -45, -14, 31});
    public static final String hs = dDH.BGx(new byte[]{-99, 67, -53, 76, -69, 49, -124, 113, -119, -81, 53, 101, 117, 0, -116, 61, 110, -30, -86, -122, -72, -52, -16, 56, -64, -121, -77, 116, -75, 2, -110, 90});
    public static final String VV3 = dDH.BGx(new byte[]{-23, -43, -75, 20, -28, 22, -118, -4, 4, 5, -96, -80, -97, 59, 54, -120, -62, -86, -46, 52, 96, 94, -62, 99, 117, -122, 17, -77, 62, 78, -11, 17});
    public static final String A1 = dDH.BGx(new byte[]{41, -52, 44, 21, -60, -60, 41, -36, 65, 60, 26, -36, 39, -94, 122, 47, 93, 17, -25, 1, -59, -51, 113, 104, 112, 18, -82, 127, -26, -104, 105, 99});

    public static JSONObject BGx(G2U g2u) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, g2u.BGx);
        jSONObject.put(mbG, g2u.mbG);
        jSONObject.put(HQ, g2u.HQ);
        String str = g2u.N;
        if (str != null) {
            jSONObject.put(N, str);
        }
        String str2 = g2u.x;
        if (str2 != null) {
            jSONObject.put(x, str2);
        }
        String str3 = g2u.hIl;
        if (str3 != null) {
            jSONObject.put(hIl, str3);
        }
        String str4 = g2u.hs;
        if (str4 != null) {
            jSONObject.put(hs, str4);
        }
        String str5 = g2u.VV3;
        if (str5 != null) {
            jSONObject.put(VV3, str5);
        }
        String str6 = g2u.A1;
        if (str6 != null) {
            jSONObject.put(A1, str6);
        }
        return jSONObject;
    }
}
