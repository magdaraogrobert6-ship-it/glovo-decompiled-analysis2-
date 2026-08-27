package com.incognia.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lbM {
    public static X1 BGx(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        String str = X1.hIl;
        String string = jSONObject2.getString(str);
        jSONObject2.remove(str);
        String str2 = X1.hs;
        String string2 = jSONObject2.getString(str2);
        jSONObject2.remove(str2);
        String str3 = X1.VV3;
        long j = jSONObject2.getLong(str3);
        jSONObject2.remove(str3);
        String str4 = X1.A1;
        String string3 = jSONObject2.getString(str4);
        jSONObject2.remove(str4);
        return new X1(string, jSONObject2, j, string3, string2);
    }
}
