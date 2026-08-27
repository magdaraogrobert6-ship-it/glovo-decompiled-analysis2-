package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rlX {
    public static final String BGx = dDH.BGx(new byte[]{-47, 19, 121, -72, 96, 93, -12, 4, -28, -100, 8, 3, -56, -115, 65, -81, 66, 8, -60, -44, 34, -73, 64, -39, 116, -35, -62, -64, 55, -105, 49, 83});
    public static final String mbG = dDH.BGx(new byte[]{-22, 25, 90, -71, -7, -110, 123, -120, -84, 85, 41, -101, 39, -20, -128, 39, -79, 28, 58, 9, -75, -36, 58, -23, 24, -92, -7, 111, 32, -98, 28, -120});

    public static JSONObject BGx(hvS hvs) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = BGx;
        String str2 = LY.BGx;
        jSONObject.put(str, LY.BGx(hvs.BGx));
        U9 u9 = hvs.mbG;
        if (u9 != null) {
            jSONObject.put(mbG, i.BGx(u9));
        }
        return jSONObject;
    }
}
