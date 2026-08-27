package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t4M {
    public static final String BGx = dDH.BGx(new byte[]{-43, -103, -66, -6, -40, -49, 50, -62, 11, -93, 83, 38, 9, -82, 88, 103, -39, -115, -123, 110, 34, 6, -55, -124, 66, 44, -77, -120, 113, -116, -112, 14});
    public static final String mbG = dDH.BGx(new byte[]{-98, 34, -76, -92, 4, -90, -26, 66, -19, 34, 85, 58, -74, -84, 111, -43, -44, 47, -25, 105, -53, 47, -74, -107, -57, 17, -76, 28, 102, -102, -107, 79});
    public static final String HQ = dDH.BGx(new byte[]{-67, -119, -14, -85, 103, 90, -101, -127, 14, 34, -10, 79, -108, 15, 9, -31, -64, 98, -58, 58, 21, 102, 101, -71, 16, 91, -8, -4, 41, 9, -14, 42});
    public static final String N = dDH.BGx(new byte[]{-126, -44, 64, 124, -70, -93, -114, -18, 90, 66, 60, 39, -22, -77, -40, 77, 90, 20, -126, -29, -96, 120, 85, 63, -2, 63, 71, -124, 36, 118, 112, -71});
    public static final String x = dDH.BGx(new byte[]{-46, 127, 45, 127, -119, 48, 126, -128, 58, 61, 108, 75, 56, -106, 76, -57, -59, 80, 120, 116, -59, -115, -20, -2, 25, -18, -33, 9, 76, -21, 101, 127});
    public static final String hIl = dDH.BGx(new byte[]{-77, -108, 9, 66, 79, -77, 35, -3, -102, 102, -102, -61, 103, -98, -76, 48, 79, 90, -61, 44, 66, -102, 87, 84, 73, -16, 99, -103, 76, -95, 40, 97, 116, -58, -61, 63, -126, 49, 70, -5, 38, 52, 76, -110, -81, -32, -114, 126});
    public static final String hs = dDH.BGx(new byte[]{-38, -3, -71, 28, 83, 76, 20, 27, -125, -91, 60, 117, -106, 39, 42, 102, 125, 94, 74, 99, 58, -54, 22, -46, -109, -101, -83, 80, 27, 87, 13, 31, -61, -83, 94, 13, -11, -28, 54, -94, 30, 105, 92, 85, -84, -18, 16, -7});
    public static final String VV3 = dDH.BGx(new byte[]{-39, 11, 49, 41, 86, -24, 104, 102, -89, 44, -24, -109, 52, -95, -44, 47, -101, -76, 78, -44, 127, 88, 7, 67, 38, 67, 46, -52, -75, -59, 87, 71, -59, -69, 44, -120, -53, 94, 127, 77, -100, -18, -15, -119, 118, -103, 27, 18});
    public static final String A1 = dDH.BGx(new byte[]{-98, 126, 46, -34, -48, 34, -44, 68, -90, -87, -39, -15, 73, -26, -105, -81, 122, 71, 53, -6, -55, -42, 55, 118, 34, 61, -81, -29, -46, -36, -116, 14});
    public static final String q = dDH.BGx(new byte[]{51, -23, 24, 13, 87, -17, -119, 96, -32, 27, -52, 91, -8, -119, -34, -71, -21, -60, -43, -7, -9, 106, -111, -10, -11, 109, 107, -28, -77, 91, 59, 25, -80, -60, -56, 113, -44, 90, -28, 97, -119, 20, -1, -61, 8, -87, 125, 49});

    public static JSONObject BGx(FSN fsn) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        if (fsn.BGx != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = fsn.BGx;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(BGx, jSONArray);
        }
        if (fsn.mbG != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = fsn.mbG;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                jSONArray2.put((String) obj2);
            }
            jSONObject.put(mbG, jSONArray2);
        }
        if (fsn.HQ != null) {
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList3 = fsn.HQ;
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                jSONArray3.put((String) obj3);
            }
            jSONObject.put(HQ, jSONArray3);
        }
        Boolean bool = fsn.N;
        if (bool != null) {
            jSONObject.put(N, bool.booleanValue());
        }
        JSONArray jSONArray4 = new JSONArray();
        ArrayList arrayList4 = fsn.x;
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj4 = arrayList4.get(i);
            i++;
            jSONArray4.put((String) obj4);
        }
        jSONObject.put(x, jSONArray4);
        if (fsn.hIl != null) {
            JSONArray jSONArray5 = new JSONArray();
            Iterator it = fsn.hIl.iterator();
            while (it.hasNext()) {
                jSONArray5.put((String) it.next());
            }
            jSONObject.put(hIl, jSONArray5);
        }
        if (fsn.hs != null) {
            JSONArray jSONArray6 = new JSONArray();
            Iterator it2 = fsn.hs.iterator();
            while (it2.hasNext()) {
                jSONArray6.put((String) it2.next());
            }
            jSONObject.put(hs, jSONArray6);
        }
        if (fsn.VV3 != null) {
            JSONArray jSONArray7 = new JSONArray();
            Iterator it3 = fsn.VV3.iterator();
            while (it3.hasNext()) {
                jSONArray7.put(oFX.BGx((o26) it3.next()));
            }
            jSONObject.put(VV3, jSONArray7);
        }
        Boolean bool2 = fsn.A1;
        if (bool2 != null) {
            jSONObject.put(A1, bool2.booleanValue());
        }
        if (fsn.q != null) {
            JSONArray jSONArray8 = new JSONArray();
            Iterator it4 = fsn.q.iterator();
            while (it4.hasNext()) {
                jSONArray8.put(oFX.BGx((o26) it4.next()));
            }
            jSONObject.put(q, jSONArray8);
        }
        return jSONObject;
    }
}
