package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Lam extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final Lam BGx = new Lam();

    public Lam() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        String str = v6m.BGx;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = ((uKg) obj).BGx;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            jSONArray.put((JSONObject) obj2);
        }
        jSONObject.put(v6m.BGx, jSONArray);
        return setCarryoverInAppMessage.RatingCompat(jSONObject.toString());
    }
}
