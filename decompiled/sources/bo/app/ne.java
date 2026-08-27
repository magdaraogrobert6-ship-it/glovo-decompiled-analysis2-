package bo.app;

import com.braze.support.BrazeLogger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ne extends l2 {
    public final ArrayList l;
    public final k9 m;

    @Override // bo.app.l9
    public final k9 b() {
        return this.m;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            String str = this.b;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                jSONObjectA.put("user_id", this.b);
            }
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                me meVar = (me) obj;
                meVar.getClass();
                jSONArray.put(new JSONObject().put("log", meVar.a).put(CrashHianalyticsData.TIME, meVar.b));
            }
            jSONObjectA.put(RemoteMessageConst.DATA, new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put(RemoteMessageConst.DATA, jSONArray)));
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.E, (Throwable) e, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(5));
            return null;
        }
    }

    @Override // bo.app.l9
    public final boolean c() {
        return this.l.isEmpty();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(df dfVar, String str, String str2, ArrayList arrayList) {
        super(new td(str.concat("debugger/log"), true), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        arrayList.getClass();
        this.l = arrayList;
        this.m = k9.SDK_DEBUGGER_LOG;
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, ba baVar) {
        z7Var.getClass();
        u9Var.getClass();
        baVar.getClass();
        super.a(z7Var, u9Var, baVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new je$$ExternalSyntheticLambda0(baVar, 1), 3, (Object) null);
        z7Var.b(new he(new ce()), he.class);
    }

    public static final String a(ba baVar) {
        return ff$$ExternalSyntheticOutline0.m("SDK Debugger Log Request failed ", baVar.a(), ". Disabling SDK Debugger.");
    }

    @Override // bo.app.l2, bo.app.l9
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-Rec-Auth-Code", this.c.A());
    }
}
