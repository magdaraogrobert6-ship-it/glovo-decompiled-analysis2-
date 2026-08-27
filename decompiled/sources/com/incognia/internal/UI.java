package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UI {
    public static final String BGx = dDH.BGx(new byte[]{-25, 5, 38, 84, -48, -69, 104, 120, 45, -105, -59, 72, 21, -18, -90, -125, 87, -106, -39, -56, 3, 60, 69, 13, 30, -74, -125, 74, 1, -46, -31, 31});
    public static final String mbG = dDH.BGx(new byte[]{12, 93, 87, -81, -6, 88, -127, -48, 13, -107, 120, -5, 112, 19, 84, -76, 108, -95, -102, 104, 5, -75, 120, 22, -108, -7, 113, 105, -5, -112, -59, -123});
    public static final String HQ = dDH.BGx(new byte[]{37, -71, 74, -68, 26, 64, -26, -34, -7, 12, -61, 107, 117, -65, -52, -83, 66, -85, -57, 79, -51, 50, -78, -15, -88, 105, 56, 16, -28, -60, -53, -5, 94, 15, -61, -37, 31, 119, 123, -59, 100, 74, -115, 98, 79, -37, -109, 119});

    public static JSONObject BGx(eVn evn) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = evn.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = evn.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        String str3 = evn.HQ;
        if (str3 != null) {
            jSONObject.put(HQ, str3);
        }
        return jSONObject;
    }
}
