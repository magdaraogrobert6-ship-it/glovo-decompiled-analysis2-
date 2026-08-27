package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G6A {
    public static final String BGx = dDH.BGx(new byte[]{79, -30, -52, -120, 58, -28, -106, 14, 102, -32, 88, -18, 59, -3, 17, -21, 43, 5, -38, -44, 70, -45, 126, 96, 111, -70, 49, 41, 108, 97, 32, -68});
    public static final String mbG = dDH.BGx(new byte[]{105, 19, 16, 1, 35, 100, 77, 124, 48, -78, 80, -35, 56, 98, -42, 41, -114, 84, 84, -47, -31, 111, -70, -36, -38, -114, 70, -107, 1, -109, 89, -86});
    public static final String HQ = dDH.BGx(new byte[]{-17, 79, 53, -91, -28, 2, 56, 59, 71, -99, 52, 25, 67, -57, 112, 26, 122, -22, 79, 50, -114, 20, -92, 41, 36, 67, 30, -32, 30, 34, 49, -31});
    public static final String N = dDH.BGx(new byte[]{-75, 105, -47, 28, 43, -82, 107, -67, -36, -89, -101, -83, -15, 107, 46, 30, 0, 63, -101, -101, -22, -80, 31, 10, -114, 76, -16, 103, 12, 33, 38, -93});
    public static final String x = dDH.BGx(new byte[]{-115, 71, 73, -80, -31, -108, -6, -19, -118, 27, -58, -121, -22, 27, 2, 41, 52, -35, -66, 88, -48, 77, 56, 34, 62, 60, 118, -60, 75, 25, -92, -91});
    public static final String hIl = dDH.BGx(new byte[]{-128, 11, 110, -95, 65, -9, -16, 21, 111, 111, -16, -25, -33, -55, -87, 9, -88, -57, 5, 86, 16, -127, 33, 95, 23, -23, 65, 126, 77, 125, -42, 28});
    public static final String hs = dDH.BGx(new byte[]{-90, -45, -91, 33, -92, 60, -55, 102, 99, 19, 114, 113, 109, -68, -12, -64, 20, 3, 8, 71, 2, 50, 1, -127, -114, -1, 81, -81, 68, -32, 93, 44});
    public static final String VV3 = dDH.BGx(new byte[]{95, 99, -115, -76, 47, 115, -81, -112, -32, -86, 108, 121, -1, 32, -70, -86, 82, 100, -29, 126, -100, 11, -5, -15, 109, 66, 78, 83, 17, 24, 21, 72});
    public static final String A1 = dDH.BGx(new byte[]{123, 119, -102, -111, -128, 74, -60, -31, 106, -117, 64, -15, -58, -33, -26, -59, -91, 127, 27, -6, -58, 93, -127, -32, -106, 60, 93, -104, 102, -5, 11, -98});
    public static final String q = dDH.BGx(new byte[]{-112, -37, -28, -122, 50, -37, -95, -9, 6, 97, -44, -34, 46, -33, 125, -39, 4, -34, -74, 29, -2, 105, 50, -110, -36, -10, -91, -42, 49, 24, -47, 118});
    public static final String fZl = dDH.BGx(new byte[]{-55, 35, -109, 121, -75, -108, 71, -122, 42, 116, 14, 31, 67, 1, -38, -87, -109, -102, -81, 15, -125, 5, -125, 75, -115, 54, -50, 16, -128, 94, -104, -19});

    public static JSONObject BGx(fBS fbs) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Boolean bool = fbs.BGx;
        if (bool != null) {
            jSONObject.put(BGx, bool.booleanValue());
        }
        Boolean bool2 = fbs.mbG;
        if (bool2 != null) {
            jSONObject.put(mbG, bool2.booleanValue());
        }
        Boolean bool3 = fbs.HQ;
        if (bool3 != null) {
            jSONObject.put(HQ, bool3.booleanValue());
        }
        Boolean bool4 = fbs.N;
        if (bool4 != null) {
            jSONObject.put(N, bool4.booleanValue());
        }
        Boolean bool5 = fbs.x;
        if (bool5 != null) {
            jSONObject.put(x, bool5.booleanValue());
        }
        Boolean bool6 = fbs.hIl;
        if (bool6 != null) {
            jSONObject.put(hIl, bool6.booleanValue());
        }
        Boolean bool7 = fbs.hs;
        if (bool7 != null) {
            jSONObject.put(hs, bool7.booleanValue());
        }
        Boolean bool8 = fbs.VV3;
        if (bool8 != null) {
            jSONObject.put(VV3, bool8.booleanValue());
        }
        Boolean bool9 = fbs.A1;
        if (bool9 != null) {
            jSONObject.put(A1, bool9.booleanValue());
        }
        Integer num = fbs.q;
        if (num != null) {
            jSONObject.put(q, num.intValue());
        }
        Boolean bool10 = fbs.fZl;
        if (bool10 != null) {
            jSONObject.put(fZl, bool10.booleanValue());
        }
        return jSONObject;
    }
}
