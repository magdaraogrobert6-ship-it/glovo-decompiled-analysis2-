package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class az9 {
    public static final String BGx = dDH.BGx(new byte[]{-109, -72, 90, 102, 59, 53, 77, -60, -104, -113, 32, 79, 11, 97, 82, -20, -7, 47, 102, -43, 18, -37, -54, -84, -2, -39, 120, 1, -40, -101, 6, -12});
    public static final String mbG = dDH.BGx(new byte[]{83, -103, 82, 82, -12, -23, 26, 120, -112, -122, -27, 35, 70, -100, -17, 115, 127, 70, -101, 0, -12, 61, -66, 79, 17, -53, 116, 86, 22, -103, -105, -100});

    public static JSONObject BGx(bh bhVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, bhVar.BGx);
        jSONObject.put(mbG, bhVar.mbG);
        return jSONObject;
    }
}
