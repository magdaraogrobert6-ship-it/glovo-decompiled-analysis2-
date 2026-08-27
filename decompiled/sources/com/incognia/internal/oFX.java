package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oFX {
    public static final String BGx = dDH.BGx(new byte[]{-86, -75, 12, -112, 125, 85, 24, 13, 81, 11, 124, -10, 6, 68, 77, 106, 38, 72, -84, -51, -119, 78, 32, -56, -79, -75, -28, -91, 99, 114, -74, 98});
    public static final String mbG = dDH.BGx(new byte[]{-52, -10, -60, -17, 5, 11, -75, -88, 38, -31, 91, -66, -81, -100, 85, -70, -21, 11, -12, 57, 43, -6, 72, -24, -50, 72, 84, -67, 46, -108, -17, -1});
    public static final String HQ = dDH.BGx(new byte[]{100, -3, -36, -71, 63, 98, 60, -8, 74, -61, -4, -66, 89, 119, 18, -123, 56, -125, -100, -111, 81, -33, -88, -123, 119, -78, -65, -71, -52, -45, -42, -43});
    public static final String N = dDH.BGx(new byte[]{-128, 93, -4, -20, 36, 25, -81, 69, -84, 127, 8, 51, 68, -122, 59, 122, -31, -85, -108, 18, 106, 54, 105, -32, 75, -55, -58, -78, 125, 34, -42, 56});

    public static JSONObject BGx(o26 o26Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = o26Var.BGx;
        if (obj != null) {
            jSONObject.put(BGx, obj);
        }
        Object obj2 = o26Var.mbG;
        if (obj2 != null) {
            jSONObject.put(mbG, obj2);
        }
        Boolean bool = o26Var.HQ;
        if (bool != null) {
            jSONObject.put(HQ, bool.booleanValue());
        }
        if (o26Var.N != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = o26Var.N;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                gb gbVar = (gb) obj3;
                String str = NEJ.BGx;
                JSONObject jSONObject2 = new JSONObject();
                String str2 = gbVar.BGx;
                if (str2 != null) {
                    jSONObject2.put(NEJ.BGx, str2);
                }
                String str3 = gbVar.mbG;
                if (str3 != null) {
                    jSONObject2.put(NEJ.mbG, str3);
                }
                Boolean bool2 = gbVar.HQ;
                if (bool2 != null) {
                    jSONObject2.put(NEJ.HQ, bool2.booleanValue());
                }
                Integer num = gbVar.N;
                if (num != null) {
                    jSONObject2.put(NEJ.N, num.intValue());
                }
                Integer num2 = gbVar.x;
                if (num2 != null) {
                    jSONObject2.put(NEJ.x, num2.intValue());
                }
                Integer num3 = gbVar.hIl;
                if (num3 != null) {
                    jSONObject2.put(NEJ.hIl, num3.intValue());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(N, jSONArray);
        }
        return jSONObject;
    }
}
