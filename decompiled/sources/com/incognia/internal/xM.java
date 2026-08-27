package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xM {
    public static final String BGx = dDH.BGx(new byte[]{34, 42, -88, 59, 24, 127, 40, -125, 52, -84, 8, -2, 83, -39, 69, -112, 113, -58, -124, -11, -24, 84, 116, -8, 51, 114, 25, 110, 122, -19, -55, -125});
    public static final String mbG = dDH.BGx(new byte[]{86, -37, -114, 49, -101, 23, 7, 25, 16, -14, 53, -38, -115, -49, 82, -84, -26, 65, 48, -115, -64, 73, -13, 46, 94, -95, -49, -92, 66, -84, -70, 15});
    public static final String HQ = dDH.BGx(new byte[]{-66, -20, -105, 119, 5, 100, -38, 78, -81, -125, 43, -110, -38, -23, -83, 20, 57, 29, 87, -108, -51, 84, 17, 63, -37, -24, 80, -59, -88, -10, 96, -124});
    public static final String N = dDH.BGx(new byte[]{-58, -27, 112, 114, 102, 96, -40, -119, -23, 48, 50, -14, 0, -86, -94, -120, 34, -55, 106, -3, 29, -42, -10, -116, -92, -29, 11, 36, 4, 17, -104, 33});

    public static JSONObject BGx(nHt nht) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = nht.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        jSONObject.put(mbG, nht.mbG);
        jSONObject.put(HQ, 71002);
        jSONObject.put(N, 1782495653481L);
        return jSONObject;
    }
}
