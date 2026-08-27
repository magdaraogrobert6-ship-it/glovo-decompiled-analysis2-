package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Fh {
    public static final String BGx = dDH.BGx(new byte[]{113, 82, -100, -126, 58, -72, 66, -67, -102, 8, 59, -89, -65, 94, 114, 35, 20, -127, -90, -119, 121, 55, -91, 114, -116, 13, 59, 99, 36, 21, -107, 74});
    public static final String mbG = dDH.BGx(new byte[]{67, 83, -48, 123, 21, -51, -111, 44, 127, -24, 7, 121, -3, 8, -6, -84, 90, -47, -5, -94, 20, -113, 41, -11, 20, -111, -18, -22, 82, 18, -18, 76});

    public static JSONObject BGx(BO8 bo8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = bo8.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = bo8.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        return jSONObject;
    }
}
