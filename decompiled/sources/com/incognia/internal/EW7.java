package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EW7 {
    public static final String BGx = dDH.BGx(new byte[]{-34, 113, 105, -86, 6, -83, -59, -18, 6, -100, -95, 99, 108, 119, 60, 31, 99, -31, -72, 59, -99, 3, 82, 78, 9, 125, -31, -7, 99, -68, -58, 104});
    public static final String mbG = dDH.BGx(new byte[]{-110, 9, 98, -83, 40, -107, -83, 4, 65, -35, 63, 102, -109, 66, -16, -58, 6, -61, 38, 53, -22, 120, 38, -127, -115, -20, 21, 73, 15, 11, 18, -2});
    public static final String HQ = dDH.BGx(new byte[]{-58, 120, 1, 105, -119, -44, -92, -122, 98, 4, 48, -94, 118, -105, 27, 12, 17, -106, 101, -98, -31, 26, -16, 12, 30, 62, -34, -9, 0, 102, 53, 8});
    public static final String N = dDH.BGx(new byte[]{-104, -89, 93, 46, -4, 74, -6, 21, 56, -60, 55, 5, 85, 124, -48, -123, -125, -119, 16, 58, 120, 123, -18, 47, 11, -20, 8, 109, -35, -58, 19, -63});

    public static JSONObject BGx(aUL aul) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = aul.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = aul.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        String str3 = aul.HQ;
        if (str3 != null) {
            jSONObject.put(HQ, str3);
        }
        Integer num = aul.N;
        if (num != null) {
            jSONObject.put(N, num.intValue());
        }
        return jSONObject;
    }
}
