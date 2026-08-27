package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n4L {
    public static final String BGx = dDH.BGx(new byte[]{92, -66, 72, 23, -98, 71, -110, 0, 72, 30, -58, 62, 60, -71, -1, 21, 48, -15, -56, 90, 122, 57, -66, -93, 21, -109, 46, 72, -41, -2, -15, -92});
    public static final String mbG = dDH.BGx(new byte[]{93, -13, 104, 53, 34, 120, 101, -55, 102, 26, -31, 97, 23, -93, -1, 48, 22, -60, 112, -26, 110, -110, -20, 81, 95, -126, -108, 116, 65, 40, 35, -97});
    public static final String HQ = dDH.BGx(new byte[]{-111, 107, 81, 117, -22, -63, -56, -1, -101, -98, -29, -41, -31, -106, -120, 28, -107, 121, -1, -7, -18, -99, -43, 45, -22, 110, 72, 59, -33, 95, -55, -65});
    public static final String N = dDH.BGx(new byte[]{24, 64, -99, 15, -25, 120, 89, -38, -46, -119, -51, -121, -87, -97, 58, 121, -93, -51, -123, 21, -114, 65, -109, 31, -96, -45, -40, 83, -1, -15, -66, -13});
    public static final String x = dDH.BGx(new byte[]{-13, -123, -33, -94, 46, 44, 56, -69, 100, 74, 2, -33, 109, -10, 99, -81, 58, -79, -1, -44, -53, -42, 50, -88, -87, -32, 102, 55, -116, -120, -90, -128});
    public static final String hIl = dDH.BGx(new byte[]{67, 111, 24, -27, 111, 92, 73, -47, 64, -88, 45, -66, 108, -58, 7, 3, 0, 111, 108, -100, -111, -93, -55, -93, 91, 123, 48, 16, -121, -36, 12, -90});
    public static final String hs = dDH.BGx(new byte[]{83, 121, 39, -1, -38, -47, 71, -40, -104, 83, 5, 19, -6, -18, -65, 78, 57, 83, 103, 68, 8, 8, -25, -49, 48, 44, -124, -65, -7, 3, 100, 73});

    public static JSONObject BGx(p2k p2kVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        if (p2kVar.BGx != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = p2kVar.BGx;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jSONArray.put((String) obj);
            }
            jSONObject.put(BGx, jSONArray);
        }
        if (p2kVar.mbG != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = p2kVar.mbG;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                jSONArray2.put((String) obj2);
            }
            jSONObject.put(mbG, jSONArray2);
        }
        if (p2kVar.HQ != null) {
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList3 = p2kVar.HQ;
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                jSONArray3.put((String) obj3);
            }
            jSONObject.put(HQ, jSONArray3);
        }
        if (p2kVar.N != null) {
            JSONArray jSONArray4 = new JSONArray();
            ArrayList arrayList4 = p2kVar.N;
            int size4 = arrayList4.size();
            while (i < size4) {
                Object obj4 = arrayList4.get(i);
                i++;
                jSONArray4.put((String) obj4);
            }
            jSONObject.put(N, jSONArray4);
        }
        String str = p2kVar.x;
        if (str != null) {
            jSONObject.put(x, str);
        }
        Integer num = p2kVar.hIl;
        if (num != null) {
            jSONObject.put(hIl, num.intValue());
        }
        Integer num2 = p2kVar.hs;
        if (num2 != null) {
            jSONObject.put(hs, num2.intValue());
        }
        return jSONObject;
    }
}
