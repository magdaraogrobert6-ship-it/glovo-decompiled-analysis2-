package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uug {
    public static final String BGx = dDH.BGx(new byte[]{-103, -111, 92, -92, 62, -89, -22, -65, -8, -34, 41, -102, 28, 111, -62, 101, -115, -38, -98, 68, 112, 90, -7, -23, 1, 66, -40, 4, -65, 7, -99, 120});
    public static final String mbG = dDH.BGx(new byte[]{-1, -93, 49, 44, 66, 87, -46, -51, -83, -85, -67, -96, -14, -99, -103, 63, -85, -105, -5, -103, -15, -53, 82, -20, 23, -57, 36, 9, -39, -7, 22, 77});

    public static JSONObject BGx(I4 i4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = i4.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = i4.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        return jSONObject;
    }
}
