package com.incognia.internal;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Opl {
    public static final String BGx = dDH.BGx(new byte[]{-13, 42, -68, -18, -61, 6, 47, -17, -122, -111, -90, -109, 53, 110, 80, 39, 45, -42, 64, 103, 5, -12, 109, -57, -23, -113, -46, -60, 111, 14, 63, -53});
    public static final String mbG = dDH.BGx(new byte[]{-70, 16, 65, -105, 96, -75, 19, 88, 22, 39, -118, -2, 28, 83, -96, -14, 70, -29, 37, -62, 93, 122, 39, -51, -1, 91, -45, -6, -94, -45, 58, 87});

    public static JSONObject BGx(FL fl) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = fl.BGx;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = fl.BGx;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jSONArray.put((String) obj);
        }
        jSONObject.put(BGx, jSONArray);
        if (fl.mbG != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : fl.mbG.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put(mbG, jSONObject2);
        }
        return jSONObject;
    }
}
