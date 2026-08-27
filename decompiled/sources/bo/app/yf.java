package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.TimeUnit;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends l2 {
    public final bg l;
    public final da m;
    public final k9 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f28o;
    public final long p;
    public final long q;
    public final bg r;
    public final tb s;

    @Override // bo.app.l9
    public final k9 b() {
        return this.n;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return false;
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    @Override // bo.app.l2
    public final String toString() {
        bg bgVar = this.l;
        da daVar = this.m;
        String str = this.f28o;
        long j = this.q;
        long j2 = ((pg) daVar).b;
        long j3 = this.p;
        bg bgVar2 = this.r;
        StringBuilder sb = new StringBuilder("TemplateRequest(templatedTriggeredAction=");
        sb.append(bgVar);
        sb.append(", triggerEvent=");
        sb.append(daVar);
        sb.append(", triggerAnalyticsId='");
        sb.append(str);
        sb.append("', templatePayloadExpirationTimestamp=");
        sb.append(j);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", getTemplatedDataExpiration=", j2 + j3, "triggeredAction=");
        sb.append(bgVar2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(df dfVar, String str, bg bgVar, da daVar, String str2) {
        long millis;
        super(new td(str.concat("template"), false), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        bgVar.getClass();
        daVar.getClass();
        this.l = bgVar;
        this.m = daVar;
        this.n = k9.TEMPLATE_REQUEST;
        this.f28o = bgVar.h;
        wd wdVar = bgVar.b;
        int i = wdVar.e;
        if (i == -1) {
            millis = TimeUnit.SECONDS.toMillis(wdVar.d + 30);
        } else {
            millis = i;
        }
        this.p = millis;
        this.q = bgVar.j;
        this.r = bgVar;
        this.s = new tb(str2, null, new rb(dfVar.i(), dfVar.i() <= 0));
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f28o);
            jSONObject.put("trigger_event_type", this.m.a());
            g9 g9Var = ((pg) this.m).c;
            jSONObject.put(RemoteMessageConst.DATA, g9Var != null ? ((n1) g9Var).forJsonPut() : null);
            jSONObjectA.put("template", jSONObject);
            jSONObjectA.put("respond_with", this.s.forJsonPut());
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(8), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, vb vbVar) {
        z7Var.getClass();
        u9Var.getClass();
        vbVar.getClass();
        InAppMessageBase inAppMessageBase = vbVar.g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(onMove.serializer(this.l.f));
        }
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, ba baVar) {
        z7Var.getClass();
        u9Var.getClass();
        baVar.getClass();
        super.a(z7Var, u9Var, baVar);
        if (baVar instanceof l0) {
            z7Var.b(new bh(this.m, this.l), bh.class);
        }
    }
}
