package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bd extends l2 {
    public final ArrayList l;
    public final long m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k9 f14o;

    @Override // bo.app.l9
    public final k9 b() {
        return this.f14o;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return false;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(df dfVar, String str, String str2, ArrayList arrayList, long j, List list) {
        super(new td(str.concat("push/redeliver"), false), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        arrayList.getClass();
        list.getClass();
        this.l = arrayList;
        this.m = j;
        this.n = list;
        this.f14o = k9.PUSH_REDELIVER;
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
            jSONObjectA.put("campaign_ids", new JSONArray((Collection) this.l));
            jSONObjectA.put("last_sync_at", this.m);
            if (!this.n.isEmpty()) {
                jSONObjectA.put("dedupe_ids", new JSONArray((Collection) this.n));
            }
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(24), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, vb vbVar) {
        z7Var.getClass();
        u9Var.getClass();
        vbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(23), 7, (Object) null);
        long j = vbVar.r;
        if (j != -1) {
            z7Var.b(new ad(j), ad.class);
        }
    }
}
