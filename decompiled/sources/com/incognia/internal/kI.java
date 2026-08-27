package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kI {
    public static final String BGx = dDH.BGx(new byte[]{-57, -9, 105, 71, 108, -89, -34, -15, -95, -73, 49, 122, -79, -68, 114, 23, 69, 14, -38, 48, -89, -97, -67, -58, -120, -63, -93, -14, -126, -20, -52, -37});
    public static final String mbG = dDH.BGx(new byte[]{-47, 61, -8, 34, -120, 11, -64, 58, -58, 76, 76, 86, -87, 25, 20, -36, -51, -57, -16, 23, 10, -30, -50, -48, 62, -122, -50, -35, 120, 119, -55, -103});
    public static final String HQ = dDH.BGx(new byte[]{74, 77, 88, 86, 96, 98, 95, 46, 99, 97, -73, 31, -87, 25, 4, -93, -43, 10, -19, 6, 118, -43, -22, -15, 61, 23, 23, -25, 20, -25, 105, -69});
    public static final String N = dDH.BGx(new byte[]{43, 93, 52, -82, 45, 24, 116, -57, -13, 22, 120, 49, -74, 60, 30, 54, -18, 2, 52, -31, 91, 79, -53, 105, 110, 58, -84, 80, 122, 31, 16, 99});
    public static final String x = dDH.BGx(new byte[]{33, -34, -81, 44, 26, 48, -36, 93, -102, 38, 88, 44, -45, -29, -49, 114, 62, -127, 64, -39, -34, -37, 87, 14, 66, -111, -81, 120, 109, 98, -113, -20});
    public static final String hIl = dDH.BGx(new byte[]{73, -82, -55, 11, 91, -27, 126, 123, 75, 22, 110, 108, 61, 47, 64, -64, -52, 13, 98, 62, 46, -43, -38, -55, 115, 72, -30, 9, -87, 44, -124, -68});
    public static final String hs = dDH.BGx(new byte[]{113, 25, 77, 118, -26, -53, -38, 17, 70, -96, -9, 34, -118, -66, -79, 0, 42, -109, -122, -128, 112, 82, 113, -103, 89, 44, -45, -81, 94, -61, -87, -4});

    public static JSONObject BGx(oV6 ov6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, ov6.BGx);
        Boolean bool = ov6.mbG;
        if (bool != null) {
            jSONObject.put(mbG, bool.booleanValue());
        }
        Long l = ov6.HQ;
        if (l != null) {
            jSONObject.put(HQ, l.longValue());
        }
        Long l2 = ov6.N;
        if (l2 != null) {
            jSONObject.put(N, l2.longValue());
        }
        Boolean bool2 = ov6.x;
        if (bool2 != null) {
            jSONObject.put(x, bool2.booleanValue());
        }
        Long l3 = ov6.hIl;
        if (l3 != null) {
            jSONObject.put(hIl, l3.longValue());
        }
        Long l4 = ov6.hs;
        if (l4 != null) {
            jSONObject.put(hs, l4.longValue());
        }
        return jSONObject;
    }
}
