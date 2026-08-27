package bo.app;

import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ed implements y9 {
    public final int a;

    public static final String b() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        try {
            return new JSONObject().put("re_eligibility", this.a);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(17), 4, (Object) null);
            return null;
        }
    }

    public ed(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optInt("re_eligibility", -1);
    }
}
