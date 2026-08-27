package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class qJc extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final qJc BGx = new qJc();

    public qJc() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String str = j.BGx;
        Long lValueOf = !jSONObject.isNull(str) ? Long.valueOf(jSONObject.getLong(str)) : null;
        String str2 = j.mbG;
        return new JD(lValueOf, jSONObject.isNull(str2) ? null : Long.valueOf(jSONObject.getLong(str2)));
    }
}
