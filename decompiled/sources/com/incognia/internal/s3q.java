package com.incognia.internal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s3q {
    public static final String BGx = dDH.BGx(new byte[]{-115, -14, -51, 93, -34, 81, -39, 33, 19, 84, -11, 60, 118, -119, 115, 37, 61, 87, -47, -96, 90, -102, -65, 33, -51, -87, 99, -67, 100, 108, -106, 19});
    public static final String mbG = dDH.BGx(new byte[]{-56, -25, 109, 63, 21, 28, 90, 39, -56, 126, -11, -13, -21, -56, 71, 10, -29, 34, -32, 50, 18, 14, 54, 41, 28, 22, 80, -47, 81, 111, -53, -15});
    public static final String HQ = dDH.BGx(new byte[]{2, -115, 73, -16, -75, -21, 123, -120, 78, -102, 65, 69, 76, 22, -44, -67, -101, -99, 31, -19, -37, 127, -55, -39, -13, -43, -96, 113, -50, -48, 106, 102});
    public static final String N = dDH.BGx(new byte[]{-81, -125, -74, -95, 32, -30, -91, -64, -45, -97, -41, -61, 92, 100, -80, -118, -52, 123, -128, 14, -56, 44, 94, 97, 97, -69, -77, 113, -64, -122, -15, 56});
    public static final String x = dDH.BGx(new byte[]{99, 110, -75, 115, 49, -2, -74, 91, -39, -71, -42, -13, 86, -109, -7, 41, 99, 105, -127, -114, -37, -80, -119, -12, 116, -107, 19, 103, 15, 70, -13, 41});
    public static final String hIl = dDH.BGx(new byte[]{64, 63, 115, -50, 56, 14, -120, -74, -51, -90, -65, -57, -83, 0, -12, -9, 94, -103, -79, 100, 2, -96, -9, 102, -65, -64, 12, 12, -1, -87, 73, -121});
    public static final String hs = dDH.BGx(new byte[]{104, -38, 77, -83, -110, -112, 40, -16, 54, -17, 93, -59, 120, -54, 96, 47, 58, 37, -47, -124, 42, 52, 118, -70, 74, 53, 4, -6, -69, 50, -20, 39});

    public static JSONObject BGx(wVC wvc) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zY5 zy5 = wvc.BGx;
        if (zy5 != null) {
            jSONObject.put(BGx, osA.BGx(zy5));
        }
        LAd lAd = wvc.mbG;
        if (lAd != null) {
            String str = mbG;
            String str2 = izO.BGx;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(izO.BGx, lAd.BGx);
            jSONObject2.put(izO.mbG, lAd.mbG);
            Long l = lAd.HQ;
            if (l != null) {
                jSONObject2.put(izO.HQ, l.longValue());
            }
            jSONObject.put(str, jSONObject2);
        }
        int i = 0;
        if (wvc.HQ != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = wvc.HQ;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                E6C e6c = (E6C) obj;
                String str3 = rGj.BGx;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(rGj.BGx, e6c.BGx);
                String str4 = rGj.mbG;
                String str5 = i.BGx;
                jSONObject3.put(str4, i.BGx(e6c.mbG));
                jSONArray.put(jSONObject3);
            }
            jSONObject.put(HQ, jSONArray);
        }
        GnB gnB = wvc.N;
        if (gnB != null) {
            String str6 = N;
            String str7 = YCm.BGx;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(YCm.BGx, gnB.BGx);
            String str8 = gnB.mbG;
            if (str8 != null) {
                jSONObject4.put(YCm.mbG, str8);
            }
            Integer num = gnB.HQ;
            if (num != null) {
                jSONObject4.put(YCm.HQ, num.intValue());
            }
            Double d = gnB.N;
            if (d != null) {
                jSONObject4.put(YCm.N, d.doubleValue());
            }
            jSONObject.put(str6, jSONObject4);
        }
        if (wvc.x != null) {
            JSONArray jSONArray2 = new JSONArray();
            ArrayList arrayList2 = wvc.x;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                tY tYVar = (tY) obj2;
                String str9 = seQ.BGx;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(seQ.BGx, tYVar.BGx);
                PRp pRp = tYVar.mbG;
                if (pRp != null) {
                    jSONObject5.put(seQ.mbG, tl6.BGx(pRp));
                }
                PRp pRp2 = tYVar.HQ;
                if (pRp2 != null) {
                    jSONObject5.put(seQ.HQ, tl6.BGx(pRp2));
                }
                String str10 = tYVar.N;
                if (str10 != null) {
                    jSONObject5.put(seQ.N, str10);
                }
                String str11 = tYVar.x;
                if (str11 != null) {
                    jSONObject5.put(seQ.x, str11);
                }
                jSONArray2.put(jSONObject5);
            }
            jSONObject.put(x, jSONArray2);
        }
        BB bb = wvc.hIl;
        if (bb != null) {
            String str12 = hIl;
            String str13 = Z76.BGx;
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(Z76.BGx, bb.BGx);
            Double d2 = bb.mbG;
            if (d2 != null) {
                jSONObject6.put(Z76.mbG, d2.doubleValue());
            }
            Double d3 = bb.HQ;
            if (d3 != null) {
                jSONObject6.put(Z76.HQ, d3.doubleValue());
            }
            String str14 = bb.N;
            if (str14 != null) {
                jSONObject6.put(Z76.N, str14);
            }
            String str15 = bb.x;
            if (str15 != null) {
                jSONObject6.put(Z76.x, str15);
            }
            jSONObject.put(str12, jSONObject6);
        }
        Object obj3 = wvc.hs;
        if (obj3 != null) {
            jSONObject.put(hs, obj3);
        }
        return jSONObject;
    }
}
