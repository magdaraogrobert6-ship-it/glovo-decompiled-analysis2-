package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a9 extends l2 {
    public final g9 l;
    public final k9 m;

    @Override // bo.app.l9
    public final k9 b() {
        return this.m;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return false;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence refresh request. Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(df dfVar, String str, g9 g9Var, String str2) {
        super(new td(str.concat("geofence/request"), false), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        g9Var.getClass();
        this.l = g9Var;
        this.m = k9.GEOFENCE_REFRESH;
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            jSONObjectA.put("location_event", ((n1) this.l).forJsonPut());
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(9), 4, (Object) null);
            return null;
        }
    }
}
