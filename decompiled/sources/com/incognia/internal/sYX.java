package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class sYX extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final sYX BGx = new sYX();

    public sYX() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = f4Y.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        int i = jSONObject.getInt(str);
        String str2 = f4Y.mbG;
        if (jSONObject.isNull(str2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        int i2 = jSONObject.getInt(str2);
        String str3 = f4Y.HQ;
        if (jSONObject.isNull(str3)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        long j = jSONObject.getLong(str3);
        String str4 = f4Y.N;
        if (jSONObject.isNull(str4)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        boolean z = jSONObject.getBoolean(str4);
        String str5 = f4Y.x;
        if (jSONObject.isNull(str5)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        boolean z2 = jSONObject.getBoolean(str5);
        String str6 = f4Y.hIl;
        String string = !jSONObject.isNull(str6) ? jSONObject.getString(str6) : null;
        String str7 = f4Y.hs;
        String string2 = !jSONObject.isNull(str7) ? jSONObject.getString(str7) : null;
        String str8 = f4Y.VV3;
        Integer numValueOf = !jSONObject.isNull(str8) ? Integer.valueOf(jSONObject.getInt(str8)) : null;
        String str9 = f4Y.A1;
        return new LCt(i, i2, j, z, z2, string, string2, numValueOf, jSONObject.isNull(str9) ? null : Boolean.valueOf(jSONObject.getBoolean(str9)));
    }
}
