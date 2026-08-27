package bo.app;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.HashMap;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class l2 extends hd implements l9 {
    public String b;
    public final df c;
    public final m2 d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public String i;
    public d5 j;
    public String k;

    public static final String d() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String f() {
        return "******************************************************************";
    }

    public static final String g() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String h() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String i() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String j() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    public static final String k() {
        return "******************************************************************";
    }

    public final td e() {
        return new td(Braze.Companion.getApiEndpoint(this.a.b));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(td tdVar, String str, df dfVar, m2 m2Var) {
        super(tdVar);
        tdVar.getClass();
        dfVar.getClass();
        m2Var.getClass();
        this.b = str;
        this.c = dfVar;
        this.d = m2Var;
    }

    @Override // bo.app.z9
    public void a(z7 z7Var, u9 u9Var, ba baVar) {
        z7Var.getClass();
        u9Var.getClass();
        baVar.getClass();
        String strA = baVar.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(strA, 6), 6, (Object) null);
        if (baVar instanceof ab) {
            z7Var.b(baVar, ab.class);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(20), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(21), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(22), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(23), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(24), 6, (Object) null);
            final int i = 0;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: bo.app.l2$$ExternalSyntheticLambda7
                public final /* synthetic */ l2 f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    l2 l2Var = this.f$0;
                    return i2 != 0 ? l2.b(l2Var) : l2.a(l2Var);
                }
            }, 6, (Object) null);
            final int i2 = 1;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: bo.app.l2$$ExternalSyntheticLambda7
                public final /* synthetic */ l2 f$0;

                {
                    this.f$0 = this;
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i2;
                    l2 l2Var = this.f$0;
                    return i3 != 0 ? l2.b(l2Var) : l2.a(l2Var);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(25), 6, (Object) null);
        }
        if (baVar instanceof yd) {
            ((z7) u9Var).b(new BrazeSdkAuthenticationErrorEvent((yd) baVar), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(a()) + "\nto target: " + e();
    }

    public static final String c(l2 l2Var) {
        return l2Var + " for " + l2Var.b() + " executed successfully.";
    }

    public static final String b(l2 l2Var) {
        return ">> Request Uri: " + l2Var.e();
    }

    public /* synthetic */ l2(td tdVar, String str, df dfVar, int i) {
        this(tdVar, (i & 2) != 0 ? null : str, dfVar, m2.UNKNOWN);
    }

    @Override // bo.app.z9
    public void b(z7 z7Var) {
        z7Var.getClass();
        z7Var.b(new id(this), id.class);
    }

    public void a(HashMap map) {
        map.getClass();
        map.put("X-Braze-Api-Key", this.h);
        String str = this.k;
        if (str != null && str.length() != 0) {
            map.put("X-Braze-Auth-Signature", this.k);
        }
        m2 m2Var = this.d;
        if (m2Var != m2.UNKNOWN) {
            map.put("X-Braze-Request-Initiated-By", m2Var.a);
        }
    }

    public static final String a(l2 l2Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(">> API key    : ", l2Var.h);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            d5 d5Var = this.j;
            if (d5Var != null && !d5Var.isEmpty()) {
                jSONObject.put("device", d5Var.forJsonPut());
            }
            String str = this.g;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l = this.e;
            if (l != null) {
                jSONObject.put(CrashHianalyticsData.TIME, l);
            }
            String str2 = this.h;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.i;
            if (str3 != null) {
                jSONObject.put(HianalyticsBaseData.SDK_VERSION, str3);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(21), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.z9
    public void a(z7 z7Var, u9 u9Var, vb vbVar) {
        z7Var.getClass();
        u9Var.getClass();
        vbVar.getClass();
        te teVar = vbVar.e;
        if (teVar != null) {
            ((z7) u9Var).b(new BrazeSdkAuthenticationErrorEvent(new yd(teVar.a, teVar.b, teVar.c, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b() == k9.SDK_DEBUGGER_LOG, new a5$$ExternalSyntheticLambda0(18, this), 3, (Object) null);
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Error occurred while executing Braze request: ", str);
    }

    @Override // bo.app.z9
    public void a(z7 z7Var) {
        z7Var.getClass();
        z7Var.b(new jd(this), jd.class);
    }
}
