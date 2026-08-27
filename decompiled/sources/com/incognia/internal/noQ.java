package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class noQ extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final noQ BGx = new noQ();

    public noQ() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        F87 f87 = (F87) obj;
        String str = w1J.BGx;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(w1J.BGx, f87.BGx);
        jSONObject.put(w1J.mbG, f87.mbG);
        return jSONObject;
    }
}
