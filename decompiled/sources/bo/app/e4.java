package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends l2 {
    public long l;
    public long m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k9 f15o;

    @Override // bo.app.l9
    public final k9 b() {
        return this.f15o;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return false;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(df dfVar, String str, long j, long j2, String str2, m2 m2Var) {
        super(new td(str.concat("content_cards/sync"), false), str2, dfVar, m2Var);
        dfVar.getClass();
        str.getClass();
        m2Var.getClass();
        this.l = j;
        this.m = j2;
        this.n = 0;
        this.f15o = k9.CONTENT_CARD_SYNC;
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            jSONObjectA.put("last_full_sync_at", this.m);
            jSONObjectA.put("last_card_updated_at", this.l);
            String str = this.b;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                jSONObjectA.put("user_id", this.b);
            }
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(6), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l2, bo.app.l9
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-ContentCardsRequest", "true");
        map.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.n));
    }
}
