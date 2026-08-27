package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ul {
    public static final String BGx = dDH.BGx(new byte[]{118, -98, 89, 110, -43, -119, -68, 117, 62, -101, -67, 101, 55, 101, 63, 5, 59, -93, -105, -104, 120, 99, 85, 27, -107, 50, 31, -56, -110, 88, 21, -31, -11, 1, -88, 44, 106, -57, 57, -21, 31, 17, -112, -55, 50, 37, -56, -5});
    public static final String mbG = dDH.BGx(new byte[]{-9, 44, 3, 20, -107, 108, 117, 113, -64, 74, 10, -41, 90, 57, -35, -21, -110, -111, 3, 32, -40, 105, 65, 22, -12, 80, -112, -111, 6, -92, 115, 25, -15, 89, 11, 108, -126, 47, -13, 77, -2, 21, -45, 89, -36, 86, 121, -8});

    public static JSONObject BGx(gJ0 gj0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = gj0.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = gj0.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        return jSONObject;
    }
}
