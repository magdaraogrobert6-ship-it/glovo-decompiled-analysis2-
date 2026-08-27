package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kyk {
    public static final String BGx = dDH.BGx(new byte[]{-68, 15, 6, 11, -16, -36, 8, 8, 40, 17, 76, -53, 101, 5, 61, 126, 114, -81, 122, 30, 2, 6, 30, -7, 2, -84, -56, 94, -19, 75, 17, 96});
    public static final String mbG = dDH.BGx(new byte[]{-14, 92, -112, -48, 104, 23, 51, -85, -91, 46, -21, 65, 95, -70, -104, -10, -49, 125, -69, 62, -65, 44, 124, -52, -49, 66, 107, -72, 62, -50, -100, -78});

    public static JSONObject BGx(MRf mRf) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = mRf.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        Integer num = mRf.mbG;
        if (num != null) {
            jSONObject.put(mbG, num.intValue());
        }
        return jSONObject;
    }
}
