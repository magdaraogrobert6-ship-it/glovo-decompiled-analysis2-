package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JVK extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final JVK BGx = new JVK();

    public JVK() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        String str = WM.BGx;
        if (jSONObject.isNull(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        String str2 = WM.mbG;
        if (jSONObject.isNull(str2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            arrayList2.add(Integer.valueOf(jSONArray2.getInt(i2)));
        }
        String str3 = WM.HQ;
        if (jSONObject.isNull(str3)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-nullable field missing in JSON.");
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        JSONArray jSONArray3 = jSONObject.getJSONArray(str3);
        int length3 = jSONArray3.length();
        for (int i3 = 0; i3 < length3; i3++) {
            arrayList3.add(Integer.valueOf(jSONArray3.getInt(i3)));
        }
        return new lI5(arrayList, arrayList2, arrayList3);
    }
}
