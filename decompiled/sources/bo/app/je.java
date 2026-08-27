package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class je extends l2 {
    public final k9 l;

    @Override // bo.app.l9
    public final k9 b() {
        return this.l;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return false;
    }

    public static final String l() {
        return "Experienced JSONException while creating SDK Initialization request. Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(df dfVar, String str, String str2) {
        super(new td(str.concat("debugger/init"), true), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        this.l = k9.SDK_DEBUGGER_INIT;
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
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(11), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l2, bo.app.l9
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-Rec-Auth-Code", this.c.A());
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, ba baVar) {
        z7Var.getClass();
        u9Var.getClass();
        baVar.getClass();
        super.a(z7Var, u9Var, baVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new je$$ExternalSyntheticLambda0(baVar, 0), 3, (Object) null);
        z7Var.b(new he(new ce()), he.class);
    }

    public static final String a(ba baVar) {
        return ff$$ExternalSyntheticOutline0.m("SDK Debugger Initialization Request failed ", baVar.a(), ". Disabling SDK Debugger.");
    }
}
