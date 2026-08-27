package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class H0e extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final H0e BGx = new H0e();

    public H0e() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        bej bejVar = (bej) obj;
        String str = FBG.BGx;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FBG.BGx, bejVar.BGx);
        String str2 = bejVar.mbG;
        if (str2 != null) {
            jSONObject.put(FBG.mbG, str2);
        }
        jSONObject.put(FBG.HQ, bejVar.HQ);
        String str3 = bejVar.N;
        if (str3 != null) {
            jSONObject.put(FBG.N, str3);
        }
        String str4 = bejVar.x;
        if (str4 != null) {
            jSONObject.put(FBG.x, str4);
        }
        jSONObject.put(FBG.hIl, bejVar.hIl);
        jSONObject.put(FBG.hs, bejVar.hs);
        jSONObject.put(FBG.VV3, bejVar.VV3);
        jSONObject.put(FBG.A1, 71002);
        jSONObject.put(FBG.q, bejVar.A1);
        jSONObject.put(FBG.fZl, bejVar.q);
        jSONObject.put(FBG.S, 1782495653481L);
        return setCarryoverInAppMessage.RatingCompat(jSONObject.toString());
    }
}
