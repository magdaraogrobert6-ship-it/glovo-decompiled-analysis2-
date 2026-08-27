package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AX {
    public static final String BGx = dDH.BGx(new byte[]{-47, -70, 73, -4, 17, -1, -24, 40, -4, -93, 118, -48, 9, 58, -105, -12, -63, 27, -72, 116, 72, 96, 127, -86, 26, -18, 73, -38, 36, -120, -13, 79});
    public static final String mbG = dDH.BGx(new byte[]{-118, 35, 60, 86, -16, 55, -80, -84, -5, -71, -104, -58, 111, -99, -9, 109, -103, 73, 36, 90, -96, 15, -76, -96, -56, 123, 53, -22, -106, 78, -99, 78});

    public static JSONObject BGx(vgd vgdVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = vgdVar.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = vgdVar.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        return jSONObject;
    }
}
