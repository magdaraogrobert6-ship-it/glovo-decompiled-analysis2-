package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YLZ {
    public static final String BGx = dDH.BGx(new byte[]{-114, -50, 44, -49, 0, -95, 126, 35, -23, -107, 106, -114, -36, -122, -101, -69, 69, -117, -117, 7, -116, 127, -99, -42, -44, 58, -108, 1, -2, 81, 122, 124});
    public static final String mbG = dDH.BGx(new byte[]{70, -8, 111, 26, 113, 40, -87, 21, -9, -43, -122, -92, 0, -6, 67, -94, -63, -27, 88, 65, -64, 67, -18, -46, 119, 117, 65, 6, 82, -123, -124, -116});

    public static JSONObject BGx(z96 z96Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = z96Var.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        String str2 = z96Var.mbG;
        if (str2 != null) {
            jSONObject.put(mbG, str2);
        }
        return jSONObject;
    }
}
