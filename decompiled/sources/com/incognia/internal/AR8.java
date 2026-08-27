package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AR8 {
    public static final String BGx = dDH.BGx(new byte[]{25, 47, 41, -87, -53, -47, -78, -124, 11, 126, 104, 60, 81, 100, 85, -102, 77, 18, -117, -21, 15, 46, 24, 6, -41, 66, -122, 109, -19, -90, -5, 61});
    public static final String mbG = dDH.BGx(new byte[]{3, 105, 108, -26, 52, 89, 28, -123, -84, -108, -37, -36, 48, 97, -36, -119, 86, 86, 86, -70, 119, -102, -14, 89, 74, -98, 76, -60, -127, -74, -108, 84});
    public static final String HQ = dDH.BGx(new byte[]{16, -30, 70, 33, -113, 104, -114, -107, -106, -123, 56, 44, -124, -108, 68, 12, -123, 11, -8, -39, 112, 52, 88, 50, 102, -38, -107, 59, 37, 71, -76, 0});
    public static final String N = dDH.BGx(new byte[]{0, 57, 117, -108, 39, 66, -88, -55, -25, 121, -87, 79, -117, -98, 112, -66, -114, -115, -15, 77, 20, 106, -108, 82, 38, 82, 56, 97, -115, 70, 86, -6});
    public static final String x = dDH.BGx(new byte[]{-66, -83, 59, -121, 84, -44, -64, 124, 110, -127, -116, -14, 5, -20, -72, -92, -110, 108, 121, 73, -62, 18, -13, -20, 54, -33, 63, 52, 116, 41, 105, 7});
    public static final String hIl = dDH.BGx(new byte[]{73, 46, -14, 101, -79, -98, 105, -71, 10, 97, -52, -72, 2, 34, 2, 27, 55, -70, -21, 40, 88, -120, 76, 44, -79, 95, 59, 82, -74, -41, -124, -30});
    public static final String hs = dDH.BGx(new byte[]{-42, -42, -39, 33, -104, -49, 74, -69, 114, -21, -117, 67, 23, 79, -50, 46, -55, -82, -78, 107, 53, 36, 116, -95, 115, -12, -112, -8, -79, 114, -126, -40});
    public static final String VV3 = dDH.BGx(new byte[]{87, -32, -69, -24, 26, -56, 123, -92, -8, 87, 87, 52, -127, -66, 127, 20, -2, -36, -76, 116, 30, 120, 84, -117, 16, 47, 107, 115, 101, -44, -93, 98});
    public static final String A1 = dDH.BGx(new byte[]{68, -121, 116, 112, 97, -59, -108, 62, 78, -26, 17, 56, -68, 104, 16, 22, 75, -61, -51, -77, -123, 106, 85, 105, 28, 54, 46, 81, 127, 21, -61, -27});
    public static final String q = dDH.BGx(new byte[]{108, 93, 73, 100, 123, -18, 101, 92, -52, -82, -108, -75, 50, 99, 81, 110, -107, 111, 48, -102, -65, -12, 41, -7, 103, -48, 102, -128, -90, -35, -45, 34});
    public static final String fZl = dDH.BGx(new byte[]{96, -77, -90, 59, -27, -24, 90, 79, -101, -126, 84, 27, -35, 62, 72, 15, 5, 121, 67, -109, 76, -93, -94, 76, 10, -116, 61, -62, 11, 118, 64, -95});
    public static final String S = dDH.BGx(new byte[]{-54, -89, 58, 12, -37, -33, -15, -99, 112, 53, 49, 13, 19, -57, -9, -23, -127, -26, -22, 7, 44, -75, -5, -31, -80, 107, 35, 19, 6, -30, 103, -13, -12, -112, -53, 3, -38, 26, 26, 15, -85, 57, -87, -23, 56, -63, -122, 47});

    public static JSONObject BGx(xus xusVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = xusVar.BGx;
        if (obj != null) {
            jSONObject.put(BGx, obj);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = xusVar.mbG;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            jSONArray.put((String) obj2);
        }
        jSONObject.put(mbG, jSONArray);
        Object obj3 = xusVar.HQ;
        if (obj3 != null) {
            jSONObject.put(HQ, obj3);
        }
        wE wEVar = xusVar.N;
        if (wEVar != null) {
            String str = N;
            String str2 = CI0.BGx;
            JSONObject jSONObject2 = new JSONObject();
            if (wEVar.BGx != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = wEVar.BGx.iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                jSONObject2.put(CI0.BGx, jSONArray2);
            }
            String str3 = wEVar.mbG;
            if (str3 != null) {
                jSONObject2.put(CI0.mbG, str3);
            }
            String str4 = wEVar.HQ;
            if (str4 != null) {
                jSONObject2.put(CI0.HQ, str4);
            }
            jSONObject2.put(CI0.N, wEVar.N.intValue());
            jSONObject.put(str, jSONObject2);
        }
        Object obj4 = xusVar.x;
        if (obj4 != null) {
            jSONObject.put(x, obj4);
        }
        JSONArray jSONArray3 = new JSONArray();
        ArrayList arrayList2 = xusVar.hIl;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj5 = arrayList2.get(i3);
            i3++;
            jSONArray3.put((String) obj5);
        }
        jSONObject.put(hIl, jSONArray3);
        Integer num = xusVar.hs;
        if (num != null) {
            jSONObject.put(hs, num.intValue());
        }
        Object obj6 = xusVar.VV3;
        if (obj6 != null) {
            jSONObject.put(VV3, obj6);
        }
        Object obj7 = xusVar.A1;
        if (obj7 != null) {
            jSONObject.put(A1, obj7);
        }
        JSONArray jSONArray4 = new JSONArray();
        ArrayList arrayList3 = xusVar.q;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj8 = arrayList3.get(i);
            i++;
            j49 j49Var = (j49) obj8;
            String str5 = z9O.BGx;
            JSONObject jSONObject3 = new JSONObject();
            String str6 = j49Var.BGx;
            if (str6 != null) {
                jSONObject3.put(z9O.BGx, str6);
            }
            String str7 = j49Var.mbG;
            if (str7 != null) {
                jSONObject3.put(z9O.mbG, str7);
            }
            String str8 = j49Var.HQ;
            if (str8 != null) {
                jSONObject3.put(z9O.HQ, str8);
            }
            jSONArray4.put(jSONObject3);
        }
        jSONObject.put(q, jSONArray4);
        Boolean bool = xusVar.fZl;
        if (bool != null) {
            jSONObject.put(fZl, bool.booleanValue());
        }
        Boolean bool2 = xusVar.S;
        if (bool2 != null) {
            jSONObject.put(S, bool2.booleanValue());
        }
        return jSONObject;
    }
}
