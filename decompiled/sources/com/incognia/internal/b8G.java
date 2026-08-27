package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b8G extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final b8G BGx = new b8G();

    public b8G() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = U5m.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        String string = jSONObject.getString(str);
        String str2 = U5m.mbG;
        if (jSONObject.isNull(str2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        long j = jSONObject.getLong(str2);
        String str3 = U5m.HQ;
        return new FsT(string, j, jSONObject.isNull(str3) ? null : Long.valueOf(jSONObject.getLong(str3)));
    }
}
