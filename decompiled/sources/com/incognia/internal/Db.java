package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Db {
    public static final String BGx = dDH.BGx(new byte[]{-47, 56, 68, -1, 119, -23, 16, -49, -97, -105, 1, -30, 70, 18, -58, -7, 35, 114, 32, 81, 7, -40, 61, 89, 127, -125, 96, -73, 116, -44, -60, -123});
    public static final String mbG = dDH.BGx(new byte[]{-115, 117, -6, 7, -66, 9, -29, 46, 53, 88, 10, 37, 31, -109, 26, -53, -118, -14, -56, -35, -63, -85, -74, -60, -50, -98, 76, -108, 68, -12, -48, -44});
    public static final String HQ = dDH.BGx(new byte[]{-119, -122, -36, -46, 101, 70, -118, 23, 43, -88, -105, 72, -28, -96, 64, 37, -119, 123, -84, -87, -47, -86, 72, 46, 61, 33, 55, -110, 101, 117, 27, -19});
    public static final String N = dDH.BGx(new byte[]{87, 70, -115, 76, 26, 12, -71, -9, 103, 84, -117, 17, 47, -50, -58, 108, 49, 47, 74, -24, -86, 111, 27, -8, -55, -6, -118, -20, -43, -78, -112, -80});
    public static final String x = dDH.BGx(new byte[]{53, 50, -65, 20, 44, 26, -84, 98, -64, -96, -12, -107, -12, -14, 7, -16, 92, 13, 81, -78, 110, 60, 66, -122, -6, -23, -5, 115, -38, 65, -10, 28});
    public static final String hIl = dDH.BGx(new byte[]{90, -90, -73, 1, 62, -108, 14, 89, -64, -44, 101, 3, 7, 39, -117, 69, -63, 51, 55, -72, 117, 81, 57, 101, -51, -41, 94, -22, 69, 27, 8, 35});

    public static JSONObject BGx(Qa qa) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, qa.BGx.intValue());
        jSONObject.put(mbG, qa.mbG.intValue());
        jSONObject.put(HQ, qa.HQ.intValue());
        jSONObject.put(N, qa.N.intValue());
        jSONObject.put(x, qa.x.intValue());
        jSONObject.put(hIl, qa.hIl.intValue());
        return jSONObject;
    }
}
