package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b9 extends l2 {
    public final n1 l;
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
        return "Experienced JSONException while creating geofence report request.Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(df dfVar, String str, n1 n1Var) {
        super(new td(str.concat("geofence/report"), false), (String) null, dfVar, 10);
        dfVar.getClass();
        str.getClass();
        n1Var.getClass();
        this.l = n1Var;
        this.m = k9.GEOFENCE_REPORT;
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            jSONObjectA.put("geofence_event", this.l.forJsonPut());
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(22), 4, (Object) null);
            return null;
        }
    }
}
