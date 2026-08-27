package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y3 {
    public static final String BGx = dDH.BGx(new byte[]{-98, 113, 38, -49, 60, -77, -49, -20, -103, 2, -103, -121, -101, 75, -74, 82, 21, 108, 118, 27, 106, -59, 1, 108, -77, 0, -100, 4, 78, 84, -124, -115});
    public static final String mbG = dDH.BGx(new byte[]{-104, -110, 89, -45, 93, 112, 85, -95, 94, 121, 71, 46, -44, -29, 64, 48, -4, 90, 114, 51, -58, 82, -66, -36, 28, 78, -76, 70, -46, 31, 39, 83});
    public static final String HQ = dDH.BGx(new byte[]{-54, -24, -46, -12, -105, 71, -1, -98, -121, 52, -73, 113, 111, -82, 95, 95, -11, 14, 6, -103, 60, 44, 82, 106, 30, -98, -10, 42, -23, 19, 54, -112});
    public static final String N = dDH.BGx(new byte[]{42, 55, -52, -7, -74, -9, -12, 54, 43, -97, -16, -117, 121, -117, 121, -27, -33, -49, 71, 53, 116, -3, -118, 108, 67, 112, -54, 95, 29, 81, -96, 90});
    public static final String x = dDH.BGx(new byte[]{28, 26, 61, 87, -29, -45, -90, 46, -63, 101, 35, -18, -64, 36, -81, 119, -27, -114, 120, -51, 121, 118, 73, -23, -49, -81, 111, 34, -9, -109, 74, -111});
    public static final String hIl = dDH.BGx(new byte[]{-57, 9, 60, 9, -2, 66, 32, -62, -58, 18, -120, -85, -52, -4, 23, -82, 22, 11, -79, 72, -74, 62, -79, 70, 70, 85, -96, 75, -47, -85, -103, -119});
    public static final String hs = dDH.BGx(new byte[]{5, 28, -81, -109, 95, -117, -26, -69, 45, 98, 52, 7, 61, -28, 94, 67, 50, 0, -37, -75, -79, -10, -75, -36, 36, -43, -68, -70, -47, 88, 35, -29});
    public static final String VV3 = dDH.BGx(new byte[]{33, 53, -3, 88, -37, -72, -36, -28, 74, -53, 77, 50, -86, -120, -88, -41, -4, -41, 35, 62, -49, -2, 39, 94, 73, -66, -32, -24, 89, -127, 20, 12});
    public static final String A1 = dDH.BGx(new byte[]{-114, 1, -25, -53, -27, -117, -104, -61, -39, 0, -2, -21, -115, 92, 12, 23, -27, 45, 94, 54, -28, 55, -78, -15, 115, -39, 68, 58, 93, 122, -37, -117});

    public static JSONObject BGx(ng0 ng0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = ng0Var.BGx;
        if (str != null) {
            jSONObject.put(BGx, str);
        }
        jSONObject.put(mbG, ng0Var.mbG);
        String str2 = ng0Var.HQ;
        if (str2 != null) {
            jSONObject.put(HQ, str2);
        }
        jSONObject.put(N, ng0Var.N);
        jSONObject.put(x, ng0Var.x);
        Integer num = ng0Var.hIl;
        if (num != null) {
            jSONObject.put(hIl, num.intValue());
        }
        Integer num2 = ng0Var.hs;
        if (num2 != null) {
            jSONObject.put(hs, num2.intValue());
        }
        if (ng0Var.VV3 != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = ng0Var.VV3;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(VV3, jSONArray);
        }
        Integer num3 = ng0Var.A1;
        if (num3 != null) {
            jSONObject.put(A1, num3.intValue());
        }
        return jSONObject;
    }
}
