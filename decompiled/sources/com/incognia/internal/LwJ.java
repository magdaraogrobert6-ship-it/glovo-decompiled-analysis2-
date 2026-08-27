package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LwJ {
    public static final String BGx = dDH.BGx(new byte[]{-22, -9, 35, -128, 21, -39, 113, 109, -88, 101, 65, 73, -57, -7, 122, 104, -7, 26, -80, -112, 30, 40, -87, -58, 120, 8, -80, 27, 46, 43, -72, -114});
    public static final String mbG = dDH.BGx(new byte[]{99, 122, 85, 118, 88, 94, -112, 3, 11, -24, -106, 64, -75, -3, 125, -103, -74, 39, -6, -60, 30, 27, 19, 25, -126, -43, -53, -2, -73, 97, -104, 47});

    public static JSONObject BGx(zR zRVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, zRVar.BGx);
        jSONObject.put(mbG, zRVar.mbG);
        return jSONObject;
    }
}
