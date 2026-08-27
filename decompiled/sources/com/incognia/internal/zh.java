package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zh extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final zh BGx = new zh();

    public zh() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = w1J.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        int i = jSONObject.getInt(str);
        String str2 = w1J.mbG;
        if (!jSONObject.isNull(str2)) {
            return new F87(i, jSONObject.getLong(str2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
        return null;
    }
}
