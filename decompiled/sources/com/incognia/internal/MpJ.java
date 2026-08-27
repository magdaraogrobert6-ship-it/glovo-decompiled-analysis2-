package com.incognia.internal;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MpJ {
    public static final String BGx = dDH.BGx(new byte[]{120, 87, 104, 68, -86, -61, -118, 127, -119, -128, -120, -42, -75, -119, 26, -70, 49, -117, -48, -27, -9, -57, 60, -7, -46, 41, 33, -124, -119, 109, -5, 2});
    public static final String mbG = dDH.BGx(new byte[]{-127, -78, 83, 13, 44, 47, 70, -104, 14, -47, -69, 68, 27, -90, -40, 16, -22, -29, 91, -32, -24, -60, 37, 88, 122, 19, 60, 68, -67, 47, -37, -75});
    public static final String HQ = dDH.BGx(new byte[]{-30, -55, 77, -85, -36, -123, -35, 4, 67, -98, -87, -36, 3, -39, -50, -24, -38, 117, 106, 45, 112, -51, -9, 89, -45, -46, 109, -72, -59, -75, -41, -65});
    public static final String N = dDH.BGx(new byte[]{102, -44, -17, 41, 84, -57, -102, 52, 119, -61, 83, -107, 90, 29, 27, -31, 109, 61, -29, 122, -7, -71, -91, 117, -73, -27, -85, -100, 109, -89, -94, -87});
    public static final String x = dDH.BGx(new byte[]{111, 65, -75, 105, -40, -51, -81, -12, -59, 96, 62, 91, 91, 36, 113, 103, 67, 12, -71, -125, 93, 12, -67, -118, -102, -108, -41, 87, -127, -68, 80, 23});
    public static final String hIl = dDH.BGx(new byte[]{-125, 68, 51, 99, -65, -113, 78, 13, 41, 127, -77, 98, -34, 1, -126, 25, 102, 32, -50, 10, 47, 101, 62, -11, -74, -9, 22, 98, -12, 104, -72, 117});
    public static final String hs = dDH.BGx(new byte[]{-46, 113, 24, 31, -27, 111, -43, -56, -115, 114, 77, 16, 68, -1, 84, -73, -105, 100, 92, 71, -42, -27, -39, -111, 113, -44, 121, 117, -71, 36, 55, -105});

    public static JSONObject BGx(phu phuVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, phuVar.BGx.BGx().toLowerCase(Locale.US));
        jSONObject.put(mbG, phuVar.mbG);
        jSONObject.put(HQ, phuVar.HQ);
        jSONObject.put(N, phuVar.N);
        jSONObject.put(x, phuVar.x);
        String str = phuVar.hIl;
        if (str != null) {
            jSONObject.put(hIl, str);
        }
        String str2 = phuVar.hs;
        if (str2 != null) {
            jSONObject.put(hs, str2);
        }
        return jSONObject;
    }
}
