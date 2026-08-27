package com.incognia.internal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WM {
    public static final String BGx = dDH.BGx(new byte[]{11, 101, -70, -77, -63, 1, 31, -50, -82, -103, 96, -79, -20, 76, 81, 0, -35, 90, 69, 19, 106, -126, -23, -74, -58, -26, 61, -110, -101, -78, -96, -99});
    public static final String mbG = dDH.BGx(new byte[]{27, 40, 104, 79, 100, -21, -122, -99, -75, 36, -95, -38, -101, 93, 50, -19, 81, -88, 20, 38, -105, 120, -11, 120, -71, 44, 36, 47, -113, -126, 101, 8});
    public static final String HQ = dDH.BGx(new byte[]{-82, -119, -33, 2, -121, -83, 51, 48, 48, 66, -106, -67, -40, 3, -24, -99, 42, 105, -87, -41, -58, 127, 114, 29, -86, -31, -86, 40, -13, -93, -111, 121});

    public static JSONObject BGx(lI5 li5) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = li5.BGx.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Number) it.next()).intValue());
        }
        jSONObject.put(BGx, jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = li5.mbG.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((Number) it2.next()).intValue());
        }
        jSONObject.put(mbG, jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        Iterator it3 = li5.HQ.iterator();
        while (it3.hasNext()) {
            jSONArray3.put(((Number) it3.next()).intValue());
        }
        jSONObject.put(HQ, jSONArray3);
        return jSONObject;
    }
}
