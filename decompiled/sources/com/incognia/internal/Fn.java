package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Fn extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final Fn BGx = new Fn();

    public Fn() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        FsT fsT = (FsT) obj;
        String str = U5m.BGx;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(U5m.BGx, fsT.BGx);
        jSONObject.put(U5m.mbG, fsT.mbG);
        Long l = fsT.HQ;
        if (l != null) {
            jSONObject.put(U5m.HQ, l);
        }
        return jSONObject;
    }
}
