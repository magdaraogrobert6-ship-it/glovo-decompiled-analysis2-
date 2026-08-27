package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z {
    public static final String BGx = dDH.BGx(new byte[]{-50, 41, -46, 28, 10, -73, -32, -91, -11, 19, 56, -122, 116, -102, 119, 60, 40, 73, 103, 109, 112, 15, -12, 111, 123, -26, 58, -106, 105, 114, 122, 83});
    public static final String mbG = dDH.BGx(new byte[]{-86, 51, 9, -117, 12, -26, 38, 10, 47, -21, -103, 50, -9, -116, -116, 92, 60, -127, 46, 67, -122, -13, 28, -80, -122, -92, -115, 56, 3, 54, 90, -49});
    public static final String HQ = dDH.BGx(new byte[]{-37, 96, 7, -11, 10, 68, 67, -111, -29, 35, 77, 81, -45, -22, 17, 83, 113, 47, 22, -12, 88, 123, -88, -87, 48, 27, 11, -114, -93, -90, -68, 61});
    public static final String N = dDH.BGx(new byte[]{-123, -81, -49, -58, -78, -43, 10, 92, 34, -126, -11, -28, 116, -56, -121, 120, -23, 73, 126, 4, 50, -28, 18, -46, -41, -63, 89, -51, 110, 116, -104, 74});
    public static final String x = dDH.BGx(new byte[]{-113, -1, -66, 18, -29, -27, -91, 44, 54, 57, 49, 124, 127, -67, -63, 0, -116, -34, 53, -71, 12, -110, 36, 81, -29, 50, 20, 87, 64, -56, 55, 67});
    public static final String hIl = dDH.BGx(new byte[]{-16, -94, -112, 124, -104, -103, -98, 56, -44, -108, 125, -4, -122, -83, 23, 47, 11, 15, 2, -113, -62, 90, 24, -85, 74, 95, -56, -14, 64, -126, 54, -118});
    public static final String hs = dDH.BGx(new byte[]{3, 118, 91, -63, 10, 112, -124, -37, -25, -79, -118, 1, 1, 95, -71, -8, 111, 9, -103, -33, 73, -94, 108, -81, -44, 106, 66, 121, 84, 63, -43, -93});
    public static final String VV3 = dDH.BGx(new byte[]{-49, 20, 86, 59, 4, -58, -36, 76, -25, 3, -56, 20, -107, -95, 73, 62, -52, 104, 120, 121, 63, -86, -57, 109, 43, 63, -99, 20, -63, -44, 2, -60});

    public static JSONObject BGx(DU6 du6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, du6.BGx.longValue());
        jSONObject.put(mbG, du6.mbG.longValue());
        jSONObject.put(HQ, du6.HQ.longValue());
        String str = du6.N;
        if (str != null) {
            jSONObject.put(N, str);
        }
        jSONObject.put(x, du6.x.longValue());
        String str2 = du6.hIl;
        if (str2 != null) {
            jSONObject.put(hIl, str2);
        }
        jSONObject.put(hs, du6.hs.longValue());
        String str3 = du6.VV3;
        if (str3 != null) {
            jSONObject.put(VV3, str3);
        }
        return jSONObject;
    }
}
