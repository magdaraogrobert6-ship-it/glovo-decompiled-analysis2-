package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends l2 {
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
        return "Experienced JSONException while creating Feature Flags request. Returning null.";
    }

    public static final String m() {
        return "FeatureFlagsSyncRequest failed.";
    }

    public static final String n() {
        return "FeatureFlagsSyncRequest executed successfully.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(df dfVar, String str, String str2, m2 m2Var) {
        super(new td(str.concat("feature_flags/sync"), false), str2, dfVar, m2Var);
        dfVar.getClass();
        str.getClass();
        m2Var.getClass();
        this.l = k9.FEATURE_FLAG_SYNC;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(1), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, vb vbVar) {
        z7Var.getClass();
        u9Var.getClass();
        vbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(0), 7, (Object) null);
        z7Var.b(new r8(this), r8.class);
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, ba baVar) {
        z7Var.getClass();
        u9Var.getClass();
        baVar.getClass();
        super.a(z7Var, u9Var, baVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(2), 6, (Object) null);
        z7Var.b(new q8(), q8.class);
    }

    @Override // bo.app.l2, bo.app.l9
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
