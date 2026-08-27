package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class daF {
    public static final String BGx = dDH.BGx(new byte[]{-27, 82, -79, -97, 23, 113, 34, 54, 17, 75, 50, 30, 72, -83, 24, 127, 52, -81, -19, -1, 97, -107, 52, -71, -7, -118, -44, 116, -99, -6, 35, -49, 76, 0, -56, 103, -113, -75, 81, -76, -84, 64, 52, -62, -42, -80, -43, -117});
    public static final String mbG = dDH.BGx(new byte[]{-127, -64, -72, 8, 109, -5, 77, -39, 41, 47, 69, 71, 14, 107, 79, -72, -70, 59, -39, 111, 42, 39, 120, 18, 76, 114, 30, -70, -113, 17, 34, 113});

    public static JSONObject BGx(Eq eq) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = eq.BGx;
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = eq.BGx;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            bBG bbg = (bBG) obj;
            String str = Z0W.BGx;
            JSONObject jSONObject2 = new JSONObject();
            String str2 = bbg.BGx;
            if (str2 != null) {
                jSONObject2.put(Z0W.BGx, str2);
            }
            String str3 = bbg.mbG;
            if (str3 != null) {
                jSONObject2.put(Z0W.mbG, str3);
            }
            String str4 = bbg.HQ;
            if (str4 != null) {
                jSONObject2.put(Z0W.HQ, str4);
            }
            Integer num = bbg.N;
            if (num != null) {
                jSONObject2.put(Z0W.N, num.intValue());
            }
            jSONObject2.put(Z0W.x, bbg.x.longValue());
            String str5 = bbg.hIl;
            if (str5 != null) {
                jSONObject2.put(Z0W.hIl, str5);
            }
            jSONObject2.put(Z0W.hs, true);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = bbg.hs.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            jSONObject2.put(Z0W.VV3, jSONArray2);
            Long l = bbg.VV3;
            if (l != null) {
                jSONObject2.put(Z0W.A1, l.longValue());
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(BGx, jSONArray);
        jSONObject.put(mbG, eq.mbG.booleanValue());
        return jSONObject;
    }
}
