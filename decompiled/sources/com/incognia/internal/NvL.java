package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class NvL {
    public final AtomicReference BGx;

    public final List BGx(String str, List list) {
        JSONArray jSONArrayOptJSONArray = ((JSONObject) this.BGx.get()).optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            try {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArrayOptJSONArray.getString(i);
                    if (string.length() > 0) {
                        arrayList.add(string);
                    }
                }
                return arrayList;
            } catch (JSONException unused) {
            }
        }
        return list;
    }

    public NvL(JSONObject jSONObject) {
        this.BGx = new AtomicReference(jSONObject == null ? new JSONObject() : jSONObject);
    }
}
