package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n8G {
    public static final String BGx = dDH.BGx(new byte[]{-82, 15, -10, -43, 86, 115, -55, 47, -62, 17, -3, 89, -48, 96, 11, 90, -121, 25, -72, 14, -22, 80, 87, 117, 32, -66, -102, 32, -14, 99, 90, -4});
    public static final String mbG = dDH.BGx(new byte[]{105, -116, 41, -8, -71, -30, -55, 121, -49, 36, -42, 49, -25, 0, -13, -122, -43, 25, -90, -94, 27, -113, -55, 39, -108, 117, -37, 74, 70, 81, -83, -118});

    public static JSONObject BGx(J19 j19) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Boolean bool = j19.BGx;
        if (bool != null) {
            jSONObject.put(BGx, bool.booleanValue());
        }
        lc lcVar = j19.mbG;
        if (lcVar != null) {
            String str = mbG;
            String str2 = HPC.BGx;
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = lcVar.BGx;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                XDm xDm = (XDm) obj;
                String str3 = D.BGx;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(D.BGx, xDm.BGx);
                jSONObject3.put(D.mbG, xDm.mbG);
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put(HPC.BGx, jSONArray);
            jSONObject2.put(HPC.mbG, lcVar.mbG);
            jSONObject2.put(HPC.HQ, lcVar.HQ);
            jSONObject2.put(HPC.N, lcVar.N);
            jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }
}
