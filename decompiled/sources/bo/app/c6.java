package bo.app;

import com.braze.support.BrazeLogger;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c6 extends l2 {
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
        return "Experienced JSONException while creating DUST config request. Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(df dfVar, String str, String str2) {
        super(new td(str.concat("dust/config"), false), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        this.l = k9.DUST_CONFIG;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(28), 4, (Object) null);
            return null;
        }
    }
}
