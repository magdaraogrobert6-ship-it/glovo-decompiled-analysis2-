package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Zae {
    public static final String BGx = dDH.BGx(new byte[]{-108, 11, -16, -9, -116, -4, 126, 50, -109, -12, -9, 6, 39, -122, 72, 69, 105, -17, -103, 6, 60, 42, 68, -62, -37, 41, -9, 68, 58, 17, 42, -57});
    public static final String mbG = dDH.BGx(new byte[]{-106, -8, 85, -37, -74, 61, -7, 81, -89, -29, -89, 12, -52, -96, 70, 72, -72, -37, 110, 86, -127, 24, -13, 88, -78, -33, -29, -28, -11, 90, -74, -45});
    public static final String HQ = dDH.BGx(new byte[]{-78, 12, 65, -107, -41, -38, -103, -26, 27, -101, 16, -29, 93, 25, -28, 58, -113, -40, -99, -17, 124, 95, -44, -52, 25, 40, 103, -58, 15, -112, -2, -11});
    public static final String N = dDH.BGx(new byte[]{-46, 14, -83, 70, -32, 74, 50, 43, 22, -107, -43, 11, 28, 65, -29, -93, -11, 26, -112, -55, -2, 127, -85, -109, 51, -118, 92, -72, 32, 101, -74, -70});
    public static final String x = dDH.BGx(new byte[]{67, -50, -112, 14, -39, 76, -127, 10, 72, -102, -39, -5, -70, 29, -22, 100, 1, -33, -90, 28, 35, 42, -90, 61, -101, 2, 16, -67, -61, -22, 59, 60});
    public static final String hIl = dDH.BGx(new byte[]{-48, -59, 98, -78, 25, 56, 39, 50, 64, -44, -79, 67, 63, 103, -127, -34, -64, -116, 27, 51, 111, 21, -43, -113, 67, -66, -128, -82, 76, 93, -124, 41});
    public static final String hs = dDH.BGx(new byte[]{66, -50, -4, -2, 58, 20, -128, 56, -86, -7, -48, -80, 35, 86, 108, 52, 93, 42, 113, -71, 113, -98, 80, 18, -78, -48, -79, -94, 21, 12, 74, 86});
    public static final String VV3 = dDH.BGx(new byte[]{-45, -42, -127, 18, 13, 46, -59, -127, 60, -36, -63, -99, -102, 122, -109, -65, -90, 51, -2, -63, -31, 10, -75, -16, -86, 106, 42, -66, -45, 99, -91, 66, 58, 108, 102, -125, -92, 15, -93, -116, 6, 43, -62, 63, -64, 49, 61, 5});
    public static final String A1 = dDH.BGx(new byte[]{-125, 107, 34, -26, -24, 30, 57, 30, 107, -106, -100, -9, -75, -28, -116, 45, 74, 51, 11, 100, -73, 17, -96, 16, 93, -108, -53, 46, -107, 11, -95, 0});

    public static JSONObject BGx(oA7 oa7) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Integer num = oa7.BGx;
        if (num != null) {
            jSONObject.put(BGx, num.intValue());
        }
        String str = oa7.mbG;
        if (str != null) {
            jSONObject.put(mbG, str);
        }
        Integer num2 = oa7.HQ;
        if (num2 != null) {
            jSONObject.put(HQ, num2.intValue());
        }
        String str2 = oa7.N;
        if (str2 != null) {
            jSONObject.put(N, str2);
        }
        Boolean bool = oa7.x;
        if (bool != null) {
            jSONObject.put(x, bool.booleanValue());
        }
        Integer num3 = oa7.hIl;
        if (num3 != null) {
            jSONObject.put(hIl, num3.intValue());
        }
        Integer num4 = oa7.hs;
        if (num4 != null) {
            jSONObject.put(hs, num4.intValue());
        }
        Boolean bool2 = oa7.VV3;
        if (bool2 != null) {
            jSONObject.put(VV3, bool2.booleanValue());
        }
        Long l = oa7.A1;
        if (l != null) {
            jSONObject.put(A1, l.longValue());
        }
        return jSONObject;
    }
}
