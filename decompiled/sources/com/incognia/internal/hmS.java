package com.incognia.internal;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hmS {
    public static final String BGx = dDH.BGx(new byte[]{-114, -4, 91, 36, 49, 63, 99, 1, -108, 18, -96, 69, 100, 1, 100, 4, -26, 113, 34, 119, -23, -104, -119, 38, 3, 33, -41, -74, -101, -47, 46, -69});
    public static final String mbG = dDH.BGx(new byte[]{36, 59, 25, -108, 29, 17, 109, 71, 114, 9, 104, -46, -124, 16, 32, 5, 17, -59, -52, -104, 61, 97, 39, 10, -117, -6, -44, -54, -126, -39, -90, 58});
    public static final String HQ = dDH.BGx(new byte[]{-91, 90, -16, -119, 28, 54, 42, 69, -109, 91, 8, 50, 34, 127, 97, 88, -89, -77, -21, -118, -39, 97, 88, -114, -104, -120, -41, -2, 56, 26, 51, -52});
    public static final String N = dDH.BGx(new byte[]{109, 102, 9, -75, -127, -121, 72, -64, -55, 82, 108, -62, 112, -91, 7, 14, -42, -51, -122, 123, -96, -60, 5, 94, 86, -11, -116, -102, 30, -31, -32, -46});
    public static final String x = dDH.BGx(new byte[]{28, -8, 71, -56, -69, 12, -5, 82, 13, -11, 10, 122, 65, 63, -43, 120, -120, 55, 39, 5, -28, 69, -46, 59, -19, 13, 76, 95, -103, 80, 9, 75});
    public static final String hIl = dDH.BGx(new byte[]{-29, -120, 1, -92, 103, 25, 66, -96, -99, 83, -43, -40, -103, -20, -86, 103, -114, 1, -99, 6, -76, -65, 79, 61, -114, 16, -53, 82, -110, 1, 58, 20});

    public static JSONObject BGx(QE qe) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, qe.BGx);
        jSONObject.put(mbG, qe.mbG);
        Object obj = qe.HQ;
        if (obj != null) {
            jSONObject.put(HQ, obj);
        }
        Long l = qe.N;
        if (l != null) {
            jSONObject.put(N, l.longValue());
        }
        Long l2 = qe.x;
        if (l2 != null) {
            jSONObject.put(x, l2.longValue());
        }
        if (qe.hIl != null) {
            JSONArray jSONArray = new JSONArray();
            for (qVf qvf : qe.hIl) {
                String str = K6r.BGx;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(K6r.BGx, qvf.BGx);
                Long l3 = qvf.mbG;
                if (l3 != null) {
                    jSONObject2.put(K6r.mbG, l3.longValue());
                }
                Long l4 = qvf.HQ;
                if (l4 != null) {
                    jSONObject2.put(K6r.HQ, l4.longValue());
                }
                Long l5 = qvf.N;
                if (l5 != null) {
                    jSONObject2.put(K6r.N, l5.longValue());
                }
                if (qvf.x != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry entry : qvf.x.entrySet()) {
                        jSONObject3.put((String) entry.getKey(), entry.getValue());
                    }
                    jSONObject2.put(K6r.x, jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(hIl, jSONArray);
        }
        return jSONObject;
    }
}
