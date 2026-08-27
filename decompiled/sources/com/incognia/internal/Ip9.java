package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ip9 {
    public static final String BGx = dDH.BGx(new byte[]{105, -42, 126, -107, -30, -105, -87, -26, -15, -35, -54, -33, -20, 78, -29, 73, -86, -2, 106, -119, -100, 15, -120, -77, 90, 88, 95, -37, -6, -1, -15, 38});
    public static final String mbG = dDH.BGx(new byte[]{-38, -109, -22, -98, -119, 113, -54, 10, 79, -92, -100, 57, -52, 67, 17, 125, 8, 78, -30, -19, 21, 68, 106, -100, 6, 25, 101, -92, -95, 69, -8, -18});

    public static JSONObject BGx(fIG fig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, fig.BGx);
        jSONObject.put(mbG, fig.mbG);
        return jSONObject;
    }
}
