package com.incognia.internal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InG {
    public static final String BGx = dDH.BGx(new byte[]{112, 42, 93, -18, -11, 122, -71, -5, -55, 23, 30, -121, -106, 107, -84, -77, -31, 23, -37, 127, -105, -35, -28, -15, -96, 105, -32, 73, 125, -2, -125, -18});
    public static final String mbG = dDH.BGx(new byte[]{-54, -101, 18, -83, -61, 33, 22, -109, 45, 40, -92, 50, -10, -33, -63, 49, -63, -4, 17, 66, 114, -54, 79, -66, -35, -34, 127, 95, -21, 74, 79, 125});

    public static JSONObject BGx(tQZ tqz) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (tqz.BGx != null) {
            JSONArray jSONArray = new JSONArray();
            for (mM mMVar : tqz.BGx) {
                String str = xR1.BGx;
                JSONObject jSONObject2 = new JSONObject();
                Integer num = mMVar.BGx;
                if (num != null) {
                    jSONObject2.put(xR1.BGx, num.intValue());
                }
                String str2 = mMVar.mbG;
                if (str2 != null) {
                    jSONObject2.put(xR1.mbG, str2);
                }
                Boolean bool = mMVar.HQ;
                if (bool != null) {
                    jSONObject2.put(xR1.HQ, bool.booleanValue());
                }
                Boolean bool2 = mMVar.N;
                if (bool2 != null) {
                    jSONObject2.put(xR1.N, bool2.booleanValue());
                }
                Boolean bool3 = mMVar.x;
                if (bool3 != null) {
                    jSONObject2.put(xR1.x, bool3.booleanValue());
                }
                Boolean bool4 = mMVar.hIl;
                if (bool4 != null) {
                    jSONObject2.put(xR1.hIl, bool4.booleanValue());
                }
                Boolean bool5 = mMVar.hs;
                if (bool5 != null) {
                    jSONObject2.put(xR1.hs, bool5.booleanValue());
                }
                Boolean bool6 = mMVar.VV3;
                if (bool6 != null) {
                    jSONObject2.put(xR1.VV3, bool6.booleanValue());
                }
                Boolean bool7 = mMVar.A1;
                if (bool7 != null) {
                    jSONObject2.put(xR1.A1, bool7.booleanValue());
                }
                Boolean bool8 = mMVar.q;
                if (bool8 != null) {
                    jSONObject2.put(xR1.q, bool8.booleanValue());
                }
                Boolean bool9 = mMVar.fZl;
                if (bool9 != null) {
                    jSONObject2.put(xR1.fZl, bool9.booleanValue());
                }
                if (mMVar.S != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = mMVar.S.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((String) it.next());
                    }
                    jSONObject2.put(xR1.S, jSONArray2);
                }
                Integer num2 = mMVar.iaH;
                if (num2 != null) {
                    jSONObject2.put(xR1.iaH, num2.intValue());
                }
                String str3 = mMVar.e;
                if (str3 != null) {
                    jSONObject2.put(xR1.e, str3);
                }
                String str4 = mMVar.VLD;
                if (str4 != null) {
                    jSONObject2.put(xR1.VLD, str4);
                }
                Integer num3 = mMVar.TfN;
                if (num3 != null) {
                    jSONObject2.put(xR1.TfN, num3.intValue());
                }
                Integer num4 = mMVar.OV7;
                if (num4 != null) {
                    jSONObject2.put(xR1.OV7, num4.intValue());
                }
                Integer num5 = mMVar.JR;
                if (num5 != null) {
                    jSONObject2.put(xR1.JR, num5.intValue());
                }
                Long l = mMVar.j;
                if (l != null) {
                    jSONObject2.put(xR1.j, l.longValue());
                }
                String str5 = mMVar.n;
                if (str5 != null) {
                    jSONObject2.put(xR1.n, str5);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(BGx, jSONArray);
        }
        Boolean bool10 = tqz.mbG;
        if (bool10 != null) {
            jSONObject.put(mbG, bool10.booleanValue());
        }
        return jSONObject;
    }
}
