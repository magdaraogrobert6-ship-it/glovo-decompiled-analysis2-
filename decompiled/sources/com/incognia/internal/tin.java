package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tin extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final tin BGx = new tin();

    public tin() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr.length == 0) {
            return null;
        }
        String str = Rdg.BGx;
        JSONObject jSONObjectBGx = nQ.BGx(bArr);
        String str2 = Rdg.BGx;
        JSONObject jSONObject = !jSONObjectBGx.isNull(str2) ? jSONObjectBGx.getJSONObject(str2) : null;
        String str3 = Rdg.mbG;
        Long lValueOf = !jSONObjectBGx.isNull(str3) ? Long.valueOf(jSONObjectBGx.getLong(str3)) : null;
        String str4 = Rdg.HQ;
        return new jP7(jSONObject, lValueOf, jSONObjectBGx.isNull(str4) ? null : Long.valueOf(jSONObjectBGx.getLong(str4)));
    }
}
