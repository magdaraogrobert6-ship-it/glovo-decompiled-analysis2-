package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class g3 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final g3 BGx = new g3();

    public g3() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JD jd = (JD) obj;
        String str = j.BGx;
        JSONObject jSONObject = new JSONObject();
        Long l = jd.BGx;
        if (l != null) {
            jSONObject.put(j.BGx, l.longValue());
        }
        Long l2 = jd.mbG;
        if (l2 != null) {
            jSONObject.put(j.mbG, l2.longValue());
        }
        return jSONObject;
    }
}
