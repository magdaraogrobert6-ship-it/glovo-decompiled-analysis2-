package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u7 {
    public static final String BGx = dDH.BGx(new byte[]{-119, -54, -122, -5, 109, 126, -103, 77, -118, 99, -75, 77, 103, -116, 31, 74, 11, 31, -77, 23, 60, -36, 63, 92, -84, -58, -109, -101, 21, 99, -4, 85});
    public static final String mbG = dDH.BGx(new byte[]{112, -114, -81, -68, -90, 98, -96, 40, -81, -43, 59, -30, 66, -117, 118, -17, -85, 0, 6, -26, 125, 57, -119, 16, -55, -31, 19, 115, 105, 120, 1, -109});

    public static JSONObject BGx(Lie lie) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = lie.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        Integer num = lie.mbG;
        if (num != null) {
            jSONObject.put(mbG, num.intValue());
        }
        return jSONObject;
    }
}
