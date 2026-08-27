package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Yyo extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = (JSONObject) obj;
        fwK fwk = (fwK) this.MediaMetadataCompat;
        if (jSONObject != null) {
            jSONArrayOptJSONArray = jSONObject.optJSONArray(fwk.HQ);
        } else {
            fwk.getClass();
            jSONArrayOptJSONArray = null;
        }
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(fwk.mbG.invoke(jSONArrayOptJSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public Yyo(Object obj) {
        super(1, 0, fwK.class, obj, "deserializeFromJson", "deserializeFromJson(Lorg/json/JSONObject;)Ljava/util/List;");
    }
}
