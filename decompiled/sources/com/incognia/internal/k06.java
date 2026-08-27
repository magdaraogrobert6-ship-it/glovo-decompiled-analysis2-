package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k06 {
    public static final String BGx = dDH.BGx(new byte[]{39, -113, -8, 16, 89, -48, 53, -8, -69, 126, -115, -20, 15, 29, -48, 44, 76, 35, -34, -2, -45, 113, -8, 52, 105, 102, -45, 121, 66, -106, -70, 89});
    public static final String mbG = dDH.BGx(new byte[]{31, 22, -109, -16, 42, 29, 125, -43, -73, -118, -57, -60, -7, -108, -57, 63, 61, 87, -53, -103, -116, 31, -79, -6, 67, -62, -116, -50, -98, -124, 107, -40, 31, -81, 33, -22, -109, 22, 59, -88, 118, -15, -70, -8, 75, -100, -47, 22});

    public static JSONObject BGx(dvP dvp) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, dvp.BGx.booleanValue());
        Boolean bool = dvp.mbG;
        if (bool != null) {
            jSONObject.put(mbG, bool.booleanValue());
        }
        return jSONObject;
    }
}
