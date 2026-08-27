package com.incognia.internal;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class adq extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final adq BGx = new adq();

    public adq() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        String str = eF4.BGx;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : ((nz0) obj).BGx.entrySet()) {
            jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        jSONObject.put(eF4.BGx, jSONObject2);
        return jSONObject;
    }
}
