package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hpb {
    public static final String BGx = dDH.BGx(new byte[]{-34, -85, 32, -26, -8, 40, 87, 28, -25, 90, -92, -117, -39, -72, 96, -99, 0, 56, 75, -40, 116, 121, 89, -121, -7, 122, -86, -118, 52, 110, -59, -72});
    public static final String mbG = dDH.BGx(new byte[]{112, -65, 3, 9, -88, 46, -73, 53, 112, -36, 97, 77, -122, -109, -89, -26, -35, -17, -42, -122, 14, -84, -118, 21, -78, 53, 69, -22, 13, -36, -89, 83});

    public static JSONObject BGx(VXy vXy) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zY5 zy5 = vXy.BGx;
        if (zy5 != null) {
            jSONObject.put(BGx, osA.BGx(zy5));
        }
        U9 u9 = vXy.mbG;
        if (u9 != null) {
            jSONObject.put(mbG, i.BGx(u9));
        }
        return jSONObject;
    }
}
