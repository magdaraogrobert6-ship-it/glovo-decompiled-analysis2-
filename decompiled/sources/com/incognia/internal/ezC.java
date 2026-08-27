package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ezC {
    public static final String BGx = dDH.BGx(new byte[]{106, 75, -33, 108, 0, 6, -98, -69, -42, 21, 17, 84, 80, 85, 20, 47, -84, -95, 44, -106, 6, 107, -116, -98, 87, 65, 34, -56, 84, -123, -76, -97});
    public static final String mbG = dDH.BGx(new byte[]{105, 12, -19, -124, -105, 104, -96, -21, 74, -29, 16, -58, -56, 89, -29, 55, -17, 11, 65, -78, 47, 106, 125, 78, -70, 89, 62, 93, -113, -34, -19, 123});

    public static JSONObject BGx(HS5 hs5) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = hs5.BGx;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = hs5.BGx;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            jSONArray.put((String) obj);
        }
        jSONObject.put(BGx, jSONArray);
        if (hs5.mbG != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList3 = hs5.mbG;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                jSONArray2.put((String) obj2);
            }
            jSONObject.put(mbG, jSONArray2);
        }
        return jSONObject;
    }
}
