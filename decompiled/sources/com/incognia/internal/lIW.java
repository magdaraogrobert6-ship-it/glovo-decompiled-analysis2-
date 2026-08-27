package com.incognia.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lIW extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final lIW BGx = new lIW();

    public lIW() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        RU ru = (RU) obj;
        String str = nSZ.BGx;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(nSZ.BGx, ru.BGx);
        jSONObject.put(nSZ.mbG, ru.mbG);
        if (ru.HQ != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ru.HQ.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put(nSZ.HQ, jSONArray);
        }
        return jSONObject;
    }
}
