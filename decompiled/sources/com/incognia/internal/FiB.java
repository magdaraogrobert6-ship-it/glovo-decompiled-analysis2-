package com.incognia.internal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FiB {
    public static final String BGx = dDH.BGx(new byte[]{24, -113, 71, 127, 85, -109, -59, 50, -127, 95, 110, 85, -96, 126, 22, -38, 6, 69, 21, 98, -82, 62, 67, 9, -114, -110, 35, 73, 10, -102, 97, -87});
    public static final String mbG = dDH.BGx(new byte[]{-7, 67, 112, -88, 5, 1, -92, 56, -10, 86, -51, 52, -17, -128, 70, -106, 107, -83, 70, 54, 26, -105, -126, 123, 111, 50, 84, -38, -91, -100, -1, 74});

    public static JSONObject BGx(QMF qmf) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, qmf.BGx);
        if (qmf.mbG != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = qmf.mbG.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put(mbG, jSONArray);
        }
        return jSONObject;
    }
}
