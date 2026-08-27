package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final c4 BGx = new c4();

    public c4() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = eF4.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, Long.valueOf(jSONObject2.getLong(next)));
        }
        return new nz0(linkedHashMap);
    }
}
