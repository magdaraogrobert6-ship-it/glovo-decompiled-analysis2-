package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ntQ {
    public static final String BGx = dDH.BGx(new byte[]{-10, -100, -33, 54, -15, -86, 77, 106, -84, -77, 87, 22, 27, 115, 32, -78, 92, -110, 0, 82, -85, 111, -63, 54, 64, -78, -43, 7, 99, 127, -25, 108});
    public static final String mbG = dDH.BGx(new byte[]{-41, -21, 39, 113, -119, -6, 37, -45, -6, -120, 59, -37, -60, -118, 26, 110, 17, 104, 11, 93, -120, 126, 126, 39, 75, -96, 94, 16, -59, -62, -2, 122});
    public static final String HQ = dDH.BGx(new byte[]{43, -70, -65, -77, 119, -69, 12, -57, -105, 73, 47, 125, 38, -30, 18, -37, 102, 82, -67, 102, 46, 44, -72, 24, -62, 82, 69, 96, 68, -3, -90, -92});
    public static final String N = dDH.BGx(new byte[]{-2, -11, -86, -48, -108, 26, -126, 41, 39, 80, 86, -54, -66, -31, 117, -92, 110, 36, 73, 88, -90, -8, 1, 7, -1, 39, 66, -30, -20, -47, 60, -59});

    public static JSONObject BGx(Cmt cmt) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, cmt.BGx);
        jSONObject.put(mbG, cmt.mbG);
        jSONObject.put(HQ, cmt.HQ);
        jSONObject.put(N, cmt.N);
        return jSONObject;
    }
}
