package com.incognia.internal;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ypn {
    public static final String BGx = dDH.BGx(new byte[]{39, -54, 80, 111, -33, -40, -61, 25, 8, 41, -57, 6, -124, 65, 28, -114, 81, 85, -121, 97, 115, -16, -101, 76, -104, -122, -23, -58, -128, 14, 66, 16});
    public static final String mbG = dDH.BGx(new byte[]{76, -109, -122, -82, -15, 74, 110, 12, 73, -42, -20, 56, -103, 56, 53, -58, 27, -7, 100, -113, -18, -122, -65, 21, 46, 11, 54, 83, 14, -102, 101, -19});
    public static final String HQ = dDH.BGx(new byte[]{-80, -72, 71, -88, -103, -47, 32, -127, 123, -115, 107, -14, 123, -95, -89, -25, 56, 71, 1, 9, -91, -2, 47, -32, -60, -49, -35, -92, 51, 117, 52, 20});
    public static final String N = dDH.BGx(new byte[]{10, 29, 11, 108, 32, -41, 120, -68, 56, -110, -103, -53, -79, 62, -98, -50, -61, 99, -104, -12, -83, 68, -95, -95, -29, 34, 84, 58, 36, 58, 0, -42});

    public static JSONObject BGx(UZn uZn) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (uZn.BGx != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = uZn.BGx;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(BGx, jSONArray);
        }
        String str = uZn.mbG;
        if (str != null) {
            jSONObject.put(mbG, str);
        }
        String str2 = uZn.HQ;
        if (str2 != null) {
            jSONObject.put(HQ, str2);
        }
        if (uZn.N != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : uZn.N.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put(N, jSONObject2);
        }
        return jSONObject;
    }
}
