package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jsc extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final jsc BGx = new jsc();

    public jsc() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = LY.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        double d = jSONObject.getDouble(str);
        String str2 = LY.mbG;
        if (jSONObject.isNull(str2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        double d2 = jSONObject.getDouble(str2);
        String str3 = LY.HQ;
        if (jSONObject.isNull(str3)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        float f = (float) jSONObject.getDouble(str3);
        String str4 = LY.N;
        if (jSONObject.isNull(str4)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        long j = jSONObject.getLong(str4);
        String str5 = LY.x;
        if (jSONObject.isNull(str5)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        boolean z = jSONObject.getBoolean(str5);
        String str6 = LY.hIl;
        Double dValueOf = !jSONObject.isNull(str6) ? Double.valueOf(jSONObject.getDouble(str6)) : null;
        String str7 = LY.hs;
        Float fValueOf = !jSONObject.isNull(str7) ? Float.valueOf((float) jSONObject.getDouble(str7)) : null;
        String str8 = LY.VV3;
        Float fValueOf2 = !jSONObject.isNull(str8) ? Float.valueOf((float) jSONObject.getDouble(str8)) : null;
        String str9 = LY.A1;
        Float fValueOf3 = !jSONObject.isNull(str9) ? Float.valueOf((float) jSONObject.getDouble(str9)) : null;
        String str10 = LY.q;
        Float fValueOf4 = !jSONObject.isNull(str10) ? Float.valueOf((float) jSONObject.getDouble(str10)) : null;
        String str11 = LY.fZl;
        Float fValueOf5 = !jSONObject.isNull(str11) ? Float.valueOf((float) jSONObject.getDouble(str11)) : null;
        String str12 = LY.S;
        String string = !jSONObject.isNull(str12) ? jSONObject.getString(str12) : null;
        String str13 = LY.iaH;
        Boolean boolValueOf = !jSONObject.isNull(str13) ? Boolean.valueOf(jSONObject.getBoolean(str13)) : null;
        String str14 = LY.e;
        String string2 = !jSONObject.isNull(str14) ? jSONObject.getString(str14) : null;
        String str15 = LY.VLD;
        return new Gbn(d, d2, f, j, z, dValueOf, fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, string, boolValueOf, string2, jSONObject.isNull(str15) ? null : Integer.valueOf(jSONObject.getInt(str15)));
    }
}
