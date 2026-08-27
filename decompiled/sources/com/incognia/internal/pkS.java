package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class pkS extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final pkS BGx = new pkS();

    public pkS() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = PCw.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        int i = jSONObject.getInt(str);
        String str2 = PCw.mbG;
        if (jSONObject.isNull(str2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        long j = jSONObject.getLong(str2);
        String str3 = PCw.HQ;
        return new Lu(i, j, jSONObject.isNull(str3) ? null : jSONObject.getString(str3));
    }
}
