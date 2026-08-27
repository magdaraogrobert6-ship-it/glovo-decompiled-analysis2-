package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x0U {
    public static final String BGx = dDH.BGx(new byte[]{-25, -34, -16, -110, 58, 43, -7, 55, 113, 76, -87, -8, -8, -104, 80, 112, -6, 95, -76, -27, 19, 38, -81, 17, 8, 105, 20, 72, 118, -91, 65, 124});
    public static final String mbG = dDH.BGx(new byte[]{-90, -12, -5, -56, -120, 68, -5, 47, -54, 8, 58, -127, 98, 73, -56, -106, 86, -48, 103, -44, 40, -60, -106, -84, 80, -99, 37, -103, -128, -35, 80, -68});
    public static final String HQ = dDH.BGx(new byte[]{-84, -105, 98, -66, 60, 19, 111, 100, 21, 83, -4, 17, -71, -96, -73, 82, 28, 116, -37, 74, 10, 20, -27, -75, -53, -120, 74, -35, 15, -61, 73, -72});
    public static final String N = dDH.BGx(new byte[]{111, -77, -56, 65, 1, -47, -22, 52, 98, 81, 98, -42, -24, 2, 114, -62, 75, -48, -35, -109, -19, -5, 51, 111, 102, -119, -33, 49, 82, 103, 51, 27});

    public static JSONObject BGx(pu puVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = puVar.BGx;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = puVar.BGx;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jSONArray.put(si.BGx((G2U) obj));
        }
        jSONObject.put(BGx, jSONArray);
        jSONObject.put(mbG, puVar.mbG.intValue());
        jSONObject.put(HQ, puVar.HQ.intValue());
        jSONObject.put(N, puVar.N.booleanValue());
        return jSONObject;
    }
}
