package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GO extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final GO BGx = new GO();

    public GO() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        Lu lu = (Lu) obj;
        String str = PCw.BGx;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PCw.BGx, lu.BGx);
        jSONObject.put(PCw.mbG, lu.mbG);
        String str2 = lu.HQ;
        if (str2 != null) {
            jSONObject.put(PCw.HQ, str2);
        }
        return jSONObject;
    }
}
