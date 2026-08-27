package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vmw {
    public static final String BGx = dDH.BGx(new byte[]{-42, -110, 116, -63, 17, 52, -35, 103, -5, 4, -88, 25, 3, -21, -62, 109, 68, 125, -110, -29, 4, -124, -105, -65, -123, -119, -52, 33, 64, -15, 6, 93});
    public static final String mbG = dDH.BGx(new byte[]{27, 34, 2, 114, -10, -125, 21, -114, -1, -51, 12, 48, -7, -86, 114, -15, 121, -124, 35, 43, 73, -11, -3, -97, -66, 123, 25, 91, 65, 63, -122, -66});
    public static final String HQ = dDH.BGx(new byte[]{-10, -46, 46, 59, 110, 94, -53, -99, 22, 107, 103, -81, 21, -90, -29, -59, 90, 96, -21, -78, -119, 87, -23, 47, 88, -20, -105, 2, 19, -16, -46, -77});
    public static final String N = dDH.BGx(new byte[]{-47, 15, 33, -69, -71, 43, -107, 0, -20, 60, -53, -42, 82, -97, -104, 89, 24, 20, 22, -58, -27, 83, 125, 20, -106, 83, 99, -3, -118, -37, 51, 55, -18, 30, 73, -39, 30, -39, 102, 45, 17, 76, -56, -47, -47, 121, 17, 60});
    public static final String x = dDH.BGx(new byte[]{-14, -54, 115, 37, -124, 54, -126, 119, -127, 25, 57, -69, -33, -48, 115, 27, -47, -4, -85, -47, -98, -66, -18, -87, -61, -125, 8, 35, -95, 44, -35, 102, -123, -75, -73, -69, -38, -25, -45, -51, -56, 114, 84, -98, 61, 77, 79, 6});
    public static final String hIl = dDH.BGx(new byte[]{66, -81, 89, -77, -22, 65, -66, 122, 63, 126, 76, -99, 13, 96, -5, -81, -48, 98, 58, 12, -120, 12, 39, -96, -67, -118, -82, 49, -93, 54, 37, -89, -65, -23, -78, 36, -66, 35, -94, -34, -21, 96, -69, -52, -92, 6, 26, -20});

    public static wf BGx(JSONObject jSONObject) throws JSONException {
        String str = BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        String str2 = mbG;
        if (jSONObject.isNull(str2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        long j = jSONObject.getLong(str2);
        String str3 = HQ;
        if (jSONObject.isNull(str3)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        long j2 = jSONObject.getLong(str3);
        String str4 = N;
        Long lValueOf = !jSONObject.isNull(str4) ? Long.valueOf(jSONObject.getLong(str4)) : null;
        String str5 = x;
        Long lValueOf2 = !jSONObject.isNull(str5) ? Long.valueOf(jSONObject.getLong(str5)) : null;
        String str6 = hIl;
        return new wf(jSONObject2, j, j2, lValueOf, lValueOf2, jSONObject.isNull(str6) ? null : Boolean.valueOf(jSONObject.getBoolean(str6)));
    }

    public static JSONObject BGx(wf wfVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BGx, wfVar.BGx);
        jSONObject.put(mbG, wfVar.mbG);
        jSONObject.put(HQ, wfVar.HQ);
        Long l = wfVar.N;
        if (l != null) {
            jSONObject.put(N, l.longValue());
        }
        Long l2 = wfVar.x;
        if (l2 != null) {
            jSONObject.put(x, l2.longValue());
        }
        Boolean bool = wfVar.hIl;
        if (bool != null) {
            jSONObject.put(hIl, bool.booleanValue());
        }
        return jSONObject;
    }
}
