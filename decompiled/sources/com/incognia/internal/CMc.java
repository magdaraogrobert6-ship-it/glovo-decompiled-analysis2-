package com.incognia.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CMc extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ hHB BGx;

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObjectPut;
        List list = (List) obj;
        fwK fwk = this.BGx.BGx;
        fwk.getClass();
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(fwk.BGx.invoke(it.next()));
            }
            jSONObjectPut = new JSONObject().put(fwk.HQ, jSONArray);
        } else {
            jSONObjectPut = null;
        }
        return jSONObjectPut == null ? new JSONObject() : jSONObjectPut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CMc(hHB hhb) {
        super(1);
        this.BGx = hhb;
    }
}
